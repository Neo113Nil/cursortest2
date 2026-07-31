package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cf0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Charset f24190a = Charsets.f41250f;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24191b = 0;

    public interface a<T> {
        @Nullable
        T a(@NotNull String str);
    }

    public static final boolean a(@NotNull Map<String, String> responseHeaders, @NotNull bh0 httpHeader, boolean z4) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String a4 = a(responseHeaders, httpHeader);
        return a4 == null ? z4 : Boolean.parseBoolean(a4);
    }

    public static int b(Map map, bh0 httpHeader) {
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String a4 = a(map, httpHeader);
        int i4 = C2362y9.f34935b;
        if (a4 == null) {
            return 0;
        }
        try {
            return Integer.parseInt(a4);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @NotNull
    public static final ArrayList c(@NotNull Map responseHeaders, @NotNull bh0 header) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header, "header");
        return a(responseHeaders, header, new df0());
    }

    @Nullable
    public static final String a(@Nullable Map<String, String> map, @NotNull bh0 httpHeader) {
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        if (map != null) {
            return map.get(httpHeader.a());
        }
        return null;
    }

    @NotNull
    public static final ArrayList a(@NotNull Map responseHeaders, @NotNull bh0 header, @NotNull a parser) {
        List emptyList;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(parser, "parser");
        ArrayList arrayList = new ArrayList();
        String a4 = a(responseHeaders, header);
        if (a4 != null && a4.length() != 0) {
            List g4 = new Regex(StringUtils.COMMA).g(a4, 0);
            if (!g4.isEmpty()) {
                ListIterator listIterator = g4.listIterator(g4.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        emptyList = CollectionsKt.take(g4, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            for (String str : (String[]) emptyList.toArray(new String[0])) {
                try {
                    Result.Companion companion = Result.Companion;
                    int length = str.length() - 1;
                    int i4 = 0;
                    boolean z4 = false;
                    while (i4 <= length) {
                        boolean z5 = Intrinsics.compare((int) str.charAt(!z4 ? i4 : length), 32) <= 0;
                        if (z4) {
                            if (!z5) {
                                break;
                            }
                            length--;
                        } else if (z5) {
                            i4++;
                        } else {
                            z4 = true;
                        }
                    }
                    String decode = URLDecoder.decode(str.subSequence(i4, length + 1).toString(), "UTF-8");
                    Intrinsics.checkNotNull(decode);
                    Object a5 = parser.a(decode);
                    if (a5 != null) {
                        arrayList.add(a5);
                    } else {
                        a5 = null;
                    }
                    Result.m243constructorimpl(a5);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m243constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Charset a(@Nullable Map<String, String> map) {
        List emptyList;
        List emptyList2;
        if (map == null) {
            return f24190a;
        }
        String str = map.get(com.ironsource.cc.f15718K);
        if (str != null) {
            List g4 = new Regex(";").g(str, 0);
            if (!g4.isEmpty()) {
                ListIterator listIterator = g4.listIterator(g4.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        emptyList = CollectionsKt.take(g4, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            String[] strArr = (String[]) emptyList.toArray(new String[0]);
            int length = strArr.length;
            for (int i4 = 1; i4 < length; i4++) {
                String str2 = strArr[i4];
                int length2 = str2.length() - 1;
                int i5 = 0;
                boolean z4 = false;
                while (i5 <= length2) {
                    boolean z5 = Intrinsics.compare((int) str2.charAt(!z4 ? i5 : length2), 32) <= 0;
                    if (z4) {
                        if (!z5) {
                            break;
                        }
                        length2--;
                    } else if (z5) {
                        i5++;
                    } else {
                        z4 = true;
                    }
                }
                List g5 = new Regex("=").g(str2.subSequence(i5, length2 + 1).toString(), 0);
                if (!g5.isEmpty()) {
                    ListIterator listIterator2 = g5.listIterator(g5.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            emptyList2 = CollectionsKt.take(g5, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList2 = CollectionsKt.emptyList();
                String[] strArr2 = (String[]) emptyList2.toArray(new String[0]);
                if (strArr2.length == 2 && Intrinsics.areEqual(strArr2[0], com.ironsource.cc.f15720M)) {
                    Charset forName = Charset.forName(strArr2[1]);
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    return forName;
                }
            }
        }
        return f24190a;
    }
}
