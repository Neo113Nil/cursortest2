package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bs;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C3372e;
import okio.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dh0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final okio.h f24624a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final okio.h f24625b;

    static {
        h.a aVar = okio.h.f43270e;
        f24624a = aVar.d("\"\\");
        f24625b = aVar.d("\t ,=");
    }

    @NotNull
    public static final ArrayList a(@NotNull ff0 ff0Var, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(ff0Var, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = ff0Var.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (StringsKt.w(headerName, ff0Var.a(i4), true)) {
                try {
                    a(new C3372e().C(ff0Var.b(i4)), arrayList);
                } catch (EOFException e4) {
                    jh1.f27655a.getClass();
                    jh1.a(5, "Unable to parse challenge", e4);
                }
            }
        }
        return arrayList;
    }

    private static final boolean b(C3372e c3372e) {
        boolean z4 = false;
        while (!c3372e.v()) {
            byte U3 = c3372e.U(0L);
            if (U3 == 44) {
                c3372e.readByte();
                z4 = true;
            } else {
                if (U3 != 32 && U3 != 9) {
                    break;
                }
                c3372e.readByte();
            }
        }
        return z4;
    }

    public static final boolean a(@NotNull oq1 oq1Var) {
        Intrinsics.checkNotNullParameter(oq1Var, "<this>");
        if (Intrinsics.areEqual(oq1Var.o().f(), "HEAD")) {
            return false;
        }
        int d4 = oq1Var.d();
        return (((d4 >= 100 && d4 < 200) || d4 == 204 || d4 == 304) && v82.a(oq1Var) == -1 && !StringsKt.w("chunked", oq1.a(oq1Var, "Transfer-Encoding"), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void a(C3372e c3372e, ArrayList arrayList) {
        String a4;
        int a5;
        String a6;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    b(c3372e);
                    str = a(c3372e);
                    if (str == null) {
                        return;
                    }
                }
                boolean b4 = b(c3372e);
                a4 = a(c3372e);
                if (a4 == null) {
                    if (c3372e.v()) {
                        arrayList.add(new pn(str, MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                a5 = v82.a(c3372e);
                boolean b5 = b(c3372e);
                if (b4 || (!b5 && !c3372e.v())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int a7 = v82.a(c3372e) + a5;
                    while (true) {
                        if (a4 == null) {
                            a4 = a(c3372e);
                            if (!b(c3372e)) {
                                a7 = v82.a(c3372e);
                            }
                        }
                        if (a7 != 0) {
                            if (a7 > 1 || b(c3372e)) {
                                return;
                            }
                            if (!c3372e.v() && c3372e.U(0L) == 34) {
                                if (c3372e.readByte() == 34) {
                                    C3372e c3372e2 = new C3372e();
                                    while (true) {
                                        long Y3 = c3372e.Y(f24624a);
                                        if (Y3 == -1) {
                                            break;
                                        }
                                        if (c3372e.U(Y3) == 34) {
                                            c3372e2.write(c3372e, Y3);
                                            c3372e.readByte();
                                            a6 = c3372e2.i0();
                                            break;
                                        } else {
                                            if (c3372e.l0() == Y3 + 1) {
                                                break;
                                            }
                                            c3372e2.write(c3372e, Y3);
                                            c3372e.readByte();
                                            c3372e2.write(c3372e, 1L);
                                        }
                                    }
                                    a6 = null;
                                } else {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                            } else {
                                a6 = a(c3372e);
                            }
                            if (a6 == null || ((String) linkedHashMap.put(a4, a6)) != null) {
                                return;
                            }
                            if (!b(c3372e) && !c3372e.v()) {
                                return;
                            } else {
                                a4 = null;
                            }
                        }
                    }
                    arrayList.add(new pn(str, linkedHashMap));
                    str = a4;
                }
            }
            Map singletonMap = Collections.singletonMap(null, a4 + StringsKt.C("=", a5));
            Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
            arrayList.add(new pn(str, singletonMap));
        }
    }

    private static final String a(C3372e c3372e) {
        long Y3 = c3372e.Y(f24625b);
        if (Y3 == -1) {
            Y3 = c3372e.l0();
        }
        if (Y3 != 0) {
            return c3372e.j0(Y3);
        }
        return null;
    }

    public static final void a(@NotNull ds dsVar, @NotNull mh0 url, @NotNull ff0 headers) {
        Intrinsics.checkNotNullParameter(dsVar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (dsVar == ds.f24742a) {
            return;
        }
        int i4 = bs.f23897n;
        List<bs> a4 = bs.a.a(url, headers);
        if (a4.isEmpty()) {
            return;
        }
        dsVar.a(url, a4);
    }
}
