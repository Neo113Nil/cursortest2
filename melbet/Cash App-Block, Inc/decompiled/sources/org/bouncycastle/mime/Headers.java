package org.bouncycastle.mime;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Strings;

/* loaded from: classes8.dex */
public class Headers implements Iterable<String> {
    private String boundary;
    private final String contentTransferEncoding;
    private String contentType;
    private Map<String, String> contentTypeParameters;
    private final Map<String, List> headers;
    private final List<String> headersAsPresented;
    private boolean multipart;

    public Headers(List<String> list, String str) {
        Map<String, String> createContentTypeParameters;
        this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.headersAsPresented = list;
        String str2 = "";
        for (String str3 : list) {
            if (str3.startsWith(" ") || str3.startsWith("\t")) {
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str2);
                m.append(str3.trim());
                str2 = m.toString();
            } else {
                if (str2.length() != 0) {
                    put(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
                }
                str2 = str3;
            }
        }
        if (str2.trim().length() != 0) {
            put(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
        }
        String str4 = getValues("Content-Type") == null ? "text/plain" : getValues("Content-Type")[0];
        int indexOf = str4.indexOf(59);
        if (indexOf < 0) {
            this.contentType = str4;
            createContentTypeParameters = Collections.EMPTY_MAP;
        } else {
            this.contentType = str4.substring(0, indexOf);
            createContentTypeParameters = createContentTypeParameters(str4.substring(indexOf + 1).trim());
        }
        this.contentTypeParameters = createContentTypeParameters;
        this.contentTransferEncoding = getValues("Content-Transfer-Encoding") != null ? getValues("Content-Transfer-Encoding")[0] : str;
        if (this.contentType.indexOf("multipart") >= 0) {
            this.multipart = true;
            this.boundary = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, this.contentTypeParameters.get("boundary"));
        } else {
            this.boundary = null;
            this.multipart = false;
        }
    }

    private Map<String, String> createContentTypeParameters(String str) {
        String[] split = str.split(";");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i != split.length; i++) {
            String str2 = split[i];
            int indexOf = str2.indexOf(61);
            if (indexOf < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("malformed Content-Type header");
                return null;
            }
            linkedHashMap.put(str2.substring(0, indexOf).trim(), str2.substring(indexOf + 1).trim());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static List<String> parseHeaders(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(inputStream);
        while (true) {
            String readLine = lineReader.readLine();
            if (readLine == null || readLine.length() == 0) {
                break;
            }
            arrayList.add(readLine);
        }
        return arrayList;
    }

    private void put(String str, String str2) {
        synchronized (this) {
            try {
                KV kv = new KV(str, str2);
                List list = this.headers.get(str);
                if (list == null) {
                    list = new ArrayList();
                    this.headers.put(str, list);
                }
                list.add(kv);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean containsKey(String str) {
        return this.headers.containsKey(str);
    }

    public void dumpHeaders(OutputStream outputStream) {
        Iterator<String> it = this.headersAsPresented.iterator();
        while (it.hasNext()) {
            outputStream.write(Strings.toUTF8ByteArray(it.next().toString()));
            outputStream.write(13);
            outputStream.write(10);
        }
    }

    public String getBoundary() {
        return this.boundary;
    }

    public String getContentTransferEncoding() {
        return this.contentTransferEncoding;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Map<String, String> getContentTypeAttributes() {
        return this.contentTypeParameters;
    }

    public Iterator<String> getNames() {
        return this.headers.keySet().iterator();
    }

    public String[] getValues(String str) {
        synchronized (this) {
            try {
                List list = this.headers.get(str);
                if (list == null) {
                    return null;
                }
                String[] strArr = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    strArr[i] = ((KV) list.get(i)).value;
                }
                return strArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.headers.isEmpty();
        }
        return isEmpty;
    }

    public boolean isMultipart() {
        return this.multipart;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<String> iterator() {
        return this.headers.keySet().iterator();
    }

    public static class KV {
        public final String key;
        public final String value;

        public KV(KV kv) {
            this.key = kv.key;
            this.value = kv.value;
        }

        public KV(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public Headers(String str, String str2) {
        this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        String m = Recorder$$ExternalSyntheticOutline2.m("Content-Type: ", str);
        ArrayList arrayList = new ArrayList();
        this.headersAsPresented = arrayList;
        arrayList.add(m);
        put("Content-Type", str);
        String str3 = getValues("Content-Type") == null ? "text/plain" : getValues("Content-Type")[0];
        int indexOf = str3.indexOf(59);
        if (indexOf < 0) {
            this.contentTypeParameters = Collections.EMPTY_MAP;
        } else {
            String substring = str3.substring(0, indexOf);
            this.contentTypeParameters = createContentTypeParameters(str3.substring(indexOf + 1).trim());
            str3 = substring;
        }
        this.contentTransferEncoding = getValues("Content-Transfer-Encoding") != null ? getValues("Content-Transfer-Encoding")[0] : str2;
        if (str3.indexOf("multipart") < 0) {
            this.boundary = null;
            this.multipart = false;
            return;
        }
        this.multipart = true;
        String str4 = this.contentTypeParameters.get("boundary");
        if (str4.startsWith("\"") && str4.endsWith("\"")) {
            this.boundary = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str4);
        } else {
            this.boundary = str4;
        }
    }

    public Headers(InputStream inputStream, String str) {
        this(parseHeaders(inputStream), str);
    }
}
