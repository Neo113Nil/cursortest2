package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.m0;
import kotlin.jvm.internal.s;
import kotlin.text.t;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.ByteString;
import okio.c;

/* loaded from: classes5.dex */
public final class HttpHeaders {
    private static final ByteString QUOTED_STRING_DELIMITERS;
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.a aVar = ByteString.Companion;
        QUOTED_STRING_DELIMITERS = aVar.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = aVar.encodeUtf8("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        s.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        s.checkNotNullParameter(headers, "<this>");
        s.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i8 = 0;
        while (i8 < size) {
            int i9 = i8 + 1;
            if (t.equals(headerName, headers.name(i8), true)) {
                try {
                    readChallengeHeader(new c().writeUtf8(headers.value(i8)), arrayList);
                } catch (EOFException e8) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e8);
                }
            }
            i8 = i9;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        s.checkNotNullParameter(response, "<this>");
        if (s.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !t.equals("chunked", Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(c cVar, List<Challenge> list) {
        String readToken;
        Map emptyMap;
        int skipAll;
        String repeat;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(cVar);
                    str = readToken(cVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(cVar);
                readToken = readToken(cVar);
                if (readToken == null) {
                    if (cVar.exhausted()) {
                        emptyMap = m0.emptyMap();
                        list.add(new Challenge(str, (Map<String, String>) emptyMap));
                        return;
                    }
                    return;
                }
                skipAll = Util.skipAll(cVar, (byte) 61);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(cVar);
                if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !cVar.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int skipAll2 = skipAll + Util.skipAll(cVar, (byte) 61);
                    while (true) {
                        if (readToken == null) {
                            readToken = readToken(cVar);
                            if (skipCommasAndWhitespace(cVar)) {
                                break;
                            } else {
                                skipAll2 = Util.skipAll(cVar, (byte) 61);
                            }
                        }
                        if (skipAll2 == 0) {
                            break;
                        }
                        if (skipAll2 > 1 || skipCommasAndWhitespace(cVar)) {
                            return;
                        }
                        String readQuotedString = startsWith(cVar, (byte) 34) ? readQuotedString(cVar) : readToken(cVar);
                        if (readQuotedString == null || ((String) linkedHashMap.put(readToken, readQuotedString)) != null) {
                            return;
                        }
                        if (!skipCommasAndWhitespace(cVar) && !cVar.exhausted()) {
                            return;
                        } else {
                            readToken = null;
                        }
                    }
                    list.add(new Challenge(str, linkedHashMap));
                    str = readToken;
                }
            }
            repeat = t.repeat("=", skipAll);
            Map singletonMap = Collections.singletonMap(null, s.stringPlus(readToken, repeat));
            s.checkNotNullExpressionValue(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(c cVar) {
        if (cVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        c cVar2 = new c();
        while (true) {
            long indexOfElement = cVar.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (indexOfElement == -1) {
                return null;
            }
            if (cVar.getByte(indexOfElement) == 34) {
                cVar2.write(cVar, indexOfElement);
                cVar.readByte();
                return cVar2.readUtf8();
            }
            if (cVar.size() == indexOfElement + 1) {
                return null;
            }
            cVar2.write(cVar, indexOfElement);
            cVar.readByte();
            cVar2.write(cVar, 1L);
        }
    }

    private static final String readToken(c cVar) {
        long indexOfElement = cVar.indexOfElement(TOKEN_DELIMITERS);
        if (indexOfElement == -1) {
            indexOfElement = cVar.size();
        }
        if (indexOfElement != 0) {
            return cVar.readUtf8(indexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        s.checkNotNullParameter(cookieJar, "<this>");
        s.checkNotNullParameter(url, "url");
        s.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(c cVar) {
        boolean z7 = false;
        while (!cVar.exhausted()) {
            byte b8 = cVar.getByte(0L);
            if (b8 == 44) {
                cVar.readByte();
                z7 = true;
            } else {
                if (b8 != 32 && b8 != 9) {
                    break;
                }
                cVar.readByte();
            }
        }
        return z7;
    }

    private static final boolean startsWith(c cVar, byte b8) {
        return !cVar.exhausted() && cVar.getByte(0L) == b8;
    }
}
