package I3;

import G3.c;
import G3.m;
import G3.n;
import G3.q;
import G3.t;
import G3.v;
import G3.x;
import G3.y;
import G3.z;
import L3.g;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import l2.e;
import w3.AbstractC1510g;
import w3.o;

/* loaded from: classes.dex */
public final class b implements q {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    @Override // G3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(g gVar) {
        e eVar;
        e eVar2;
        n nVar;
        int i4;
        int i5;
        e eVar3;
        n nVar2;
        String str;
        int length;
        System.currentTimeMillis();
        v vVar = gVar.f1674e;
        e eVar4 = new e(vVar, 7, (Object) null);
        c cVar = vVar.f1017f;
        if (cVar == null) {
            int i6 = c.n;
            n nVar3 = vVar.f1014c;
            int size = nVar3.size();
            String str2 = null;
            boolean z = true;
            boolean z4 = false;
            boolean z5 = false;
            int i7 = -1;
            int i8 = -1;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i9 = -1;
            int i10 = -1;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (i4 < size) {
                int i11 = i4 + 1;
                String c4 = nVar3.c(i4);
                String e4 = nVar3.e(i4);
                if (!o.W(c4, "Cache-Control")) {
                    i4 = o.W(c4, "Pragma") ? 0 : i11;
                } else if (str2 == null) {
                    str2 = e4;
                    i5 = 0;
                    while (i5 < e4.length()) {
                        int length2 = e4.length();
                        int i12 = i5;
                        while (true) {
                            if (i12 >= length2) {
                                i12 = e4.length();
                                break;
                            }
                            int i13 = i12 + 1;
                            if (AbstractC1510g.b0("=,;", e4.charAt(i12))) {
                                break;
                            }
                            i12 = i13;
                        }
                        String substring = e4.substring(i5, i12);
                        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String obj = AbstractC1510g.r0(substring).toString();
                        if (i12 == e4.length() || e4.charAt(i12) == ',' || e4.charAt(i12) == ';') {
                            eVar3 = eVar4;
                            nVar2 = nVar3;
                            i5 = i12 + 1;
                            str = null;
                        } else {
                            int i14 = i12 + 1;
                            byte[] bArr = H3.b.f1103a;
                            int length3 = e4.length();
                            while (true) {
                                if (i14 >= length3) {
                                    eVar3 = eVar4;
                                    length = e4.length();
                                    break;
                                }
                                int i15 = i14 + 1;
                                eVar3 = eVar4;
                                char charAt = e4.charAt(i14);
                                int i16 = i14;
                                if (charAt != ' ' && charAt != '\t') {
                                    length = i16;
                                    break;
                                }
                                i14 = i15;
                                eVar4 = eVar3;
                            }
                            if (length >= e4.length() || e4.charAt(length) != '\"') {
                                int length4 = e4.length();
                                int i17 = length;
                                while (true) {
                                    if (i17 >= length4) {
                                        nVar2 = nVar3;
                                        i17 = e4.length();
                                        break;
                                    }
                                    int i18 = i17 + 1;
                                    int i19 = length4;
                                    nVar2 = nVar3;
                                    if (AbstractC1510g.b0(",;", e4.charAt(i17))) {
                                        break;
                                    }
                                    i17 = i18;
                                    length4 = i19;
                                    nVar3 = nVar2;
                                }
                                String substring2 = e4.substring(length, i17);
                                i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str = AbstractC1510g.r0(substring2).toString();
                                i5 = i17;
                            } else {
                                int i20 = length + 1;
                                int g02 = AbstractC1510g.g0(e4, '\"', i20, 4);
                                String substring3 = e4.substring(i20, g02);
                                i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                i5 = g02 + 1;
                                str = substring3;
                                nVar2 = nVar3;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            z4 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            z5 = true;
                        } else if ("max-age".equalsIgnoreCase(obj)) {
                            i7 = H3.b.v(-1, str);
                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                            i8 = H3.b.v(-1, str);
                        } else if ("private".equalsIgnoreCase(obj)) {
                            z6 = true;
                        } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(obj)) {
                            z7 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                            z8 = true;
                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                            i9 = H3.b.v(Integer.MAX_VALUE, str);
                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                            i10 = H3.b.v(-1, str);
                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                            z9 = true;
                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                            z10 = true;
                        } else if ("immutable".equalsIgnoreCase(obj)) {
                            z11 = true;
                        }
                        eVar4 = eVar3;
                        nVar3 = nVar2;
                    }
                }
                z = false;
                i5 = 0;
                while (i5 < e4.length()) {
                }
            }
            eVar = eVar4;
            c cVar2 = new c(z4, z5, i7, i8, z6, z7, z8, i9, i10, z9, z10, z11, !z ? null : str2);
            vVar.f1017f = cVar2;
            cVar = cVar2;
        } else {
            eVar = eVar4;
        }
        if (cVar.f878j) {
            Object obj2 = null;
            eVar2 = new e(obj2, 7, obj2);
        } else {
            eVar2 = eVar;
        }
        v vVar2 = (v) eVar2.f14270b;
        y yVar = (y) eVar2.f14271c;
        if (vVar2 == null && yVar == null) {
            ArrayList arrayList = new ArrayList(20);
            z zVar = H3.b.f1105c;
            long currentTimeMillis = System.currentTimeMillis();
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new y(vVar, t.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new n((String[]) array), zVar, null, null, null, -1L, currentTimeMillis, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        if (vVar2 == null) {
            i.b(yVar);
            x b4 = yVar.b();
            y a3 = a.a(yVar);
            x.b(a3, "cacheResponse");
            b4.f1028i = a3;
            return b4.a();
        }
        y b5 = gVar.b(vVar2);
        if (yVar != null) {
            if (b5.f1036d == 304) {
                x b6 = yVar.b();
                n nVar4 = yVar.f1038f;
                n nVar5 = b5.f1038f;
                m mVar = new m(0);
                int size2 = nVar4.size();
                int i21 = 0;
                while (i21 < size2) {
                    int i22 = i21 + 1;
                    String c5 = nVar4.c(i21);
                    String e5 = nVar4.e(i21);
                    if ("Warning".equalsIgnoreCase(c5)) {
                        nVar = nVar4;
                        if (o.a0(e5, "1", false)) {
                            i21 = i22;
                            nVar4 = nVar;
                        }
                    } else {
                        nVar = nVar4;
                    }
                    if ("Content-Length".equalsIgnoreCase(c5) || "Content-Encoding".equalsIgnoreCase(c5) || "Content-Type".equalsIgnoreCase(c5) || !a.b(c5) || nVar5.b(c5) == null) {
                        mVar.f(c5, e5);
                    }
                    i21 = i22;
                    nVar4 = nVar;
                }
                int i23 = 0;
                int size3 = nVar5.size();
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    String c6 = nVar5.c(i23);
                    if (!"Content-Length".equalsIgnoreCase(c6) && !"Content-Encoding".equalsIgnoreCase(c6) && !"Content-Type".equalsIgnoreCase(c6) && a.b(c6)) {
                        mVar.f(c6, nVar5.e(i23));
                    }
                    i23 = i24;
                }
                b6.f1025f = mVar.g().d();
                b6.f1030k = b5.f1043k;
                b6.f1031l = b5.f1044l;
                y a4 = a.a(yVar);
                x.b(a4, "cacheResponse");
                b6.f1028i = a4;
                y a5 = a.a(b5);
                x.b(a5, "networkResponse");
                b6.f1027h = a5;
                b6.a();
                z zVar2 = b5.f1039g;
                i.b(zVar2);
                zVar2.close();
                i.b(null);
                throw null;
            }
            z zVar3 = yVar.f1039g;
            if (zVar3 != null) {
                H3.b.c(zVar3);
            }
        }
        x b7 = b5.b();
        y a6 = a.a(yVar);
        x.b(a6, "cacheResponse");
        b7.f1028i = a6;
        y a7 = a.a(b5);
        x.b(a7, "networkResponse");
        b7.f1027h = a7;
        return b7.a();
    }
}
