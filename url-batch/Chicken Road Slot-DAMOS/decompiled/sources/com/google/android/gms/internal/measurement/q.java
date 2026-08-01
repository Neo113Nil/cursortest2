package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends y2 {

    /* renamed from: f, reason: collision with root package name */
    public static final Set f2684f;
    public static final mh g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f2685h;

    /* renamed from: b, reason: collision with root package name */
    public final String f2686b;

    /* renamed from: c, reason: collision with root package name */
    public final Level f2687c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2688d;

    /* renamed from: e, reason: collision with root package name */
    public final mh f2689e;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ng.f2585a, dh.f2242a, eh.f2266a)));
        f2684f = unmodifiableSet;
        mh mhVar = new mh(hg.b(unmodifiableSet));
        g = mhVar;
        f2685h = new o(Level.ALL, unmodifiableSet, mhVar);
    }

    public /* synthetic */ q(String str, Level level, Set set, mh mhVar) {
        super(str);
        this.f2686b = h.b(str);
        this.f2687c = level;
        this.f2688d = set;
        this.f2689e = mhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(kg kgVar, String str, Level level, Set set, mh mhVar) {
        c phVar;
        c cVar;
        Level level2;
        int i3;
        c cVar2;
        int i10;
        gh ghVar;
        String str2;
        gh ghVar2;
        fh fhVar;
        androidx.datastore.preferences.protobuf.i zVar;
        androidx.datastore.preferences.protobuf.i b0Var;
        int i11;
        Object[] objArr;
        int i12;
        boolean z10;
        String sb2;
        int c10;
        oa d10 = kgVar.d();
        Level level3 = kgVar.f2465a;
        Boolean bool = (Boolean) d10.k(eh.f2266a);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        ((i) d.f2209a).getClass();
        oa c11 = n.f2553b.c();
        oa d11 = kgVar.d();
        int a9 = d11.a();
        if (a9 == 0) {
            phVar = c.f2178a;
        } else {
            phVar = a9 <= 28 ? new ph(c11, d11) : new qh(c11, d11);
        }
        int i13 = 0;
        boolean z11 = level3.intValue() < level.intValue();
        if (!z11) {
            int i14 = f.f2267a;
            if (kgVar.f2470f == null && phVar.b() <= set.size() && set.containsAll(phVar.c())) {
                if (!(kgVar.f2470f == null)) {
                    kotlin.collections.i0.l("cannot get literal argument if a template context exists");
                    return;
                }
                Object[] objArr2 = kgVar.g;
                if (objArr2 == null) {
                    kotlin.collections.i0.l("cannot get literal argument before calling log()");
                    return;
                }
                sb2 = ih.a(objArr2[0]);
                level2 = level3;
                Throwable th = (Throwable) kgVar.d().k(ng.f2585a);
                c10 = h.c(level2);
                if (c10 != 2) {
                    Log.v(str, sb2, th);
                    return;
                }
                if (c10 == 3) {
                    Log.d(str, sb2, th);
                    return;
                }
                if (c10 == 4) {
                    Log.i(str, sb2, th);
                    return;
                } else if (c10 != 5) {
                    Log.e(str, sb2, th);
                    return;
                } else {
                    Log.w(str, sb2, th);
                    return;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        rg rgVar = kgVar.f2468d;
        if (rgVar == null) {
            kotlin.collections.i0.l("cannot request log site information prior to postProcess()");
            return;
        }
        if (ia.d(2, rgVar, sb3)) {
            sb3.append(" ");
        }
        if (!z11 || kgVar.f2470f == null) {
            g gVar = kgVar.f2470f;
            if (gVar != null) {
                String str3 = "cannot get arguments unless a template context exists";
                if (!(gVar != null)) {
                    kotlin.collections.i0.l("cannot get arguments unless a template context exists");
                    return;
                }
                Object[] objArr3 = kgVar.g;
                String str4 = "cannot get arguments before calling log()";
                if (objArr3 == null) {
                    kotlin.collections.i0.l("cannot get arguments before calling log()");
                    return;
                }
                c4.r rVar = new c4.r(gVar, objArr3, sb3);
                StringBuilder sb4 = (StringBuilder) rVar.g;
                g gVar2 = (g) rVar.f1777e;
                c0 c0Var = gVar2.f2308a;
                String str5 = gVar2.f2309b;
                c0Var.getClass();
                int b10 = e0.b(0, str5);
                int i15 = 0;
                int i16 = -1;
                while (true) {
                    int i17 = 3;
                    if (b10 >= 0) {
                        int i18 = b10 + 1;
                        int i19 = i13;
                        int i20 = i18;
                        while (i20 < str5.length()) {
                            int i21 = i20 + 1;
                            Level level4 = level3;
                            char charAt = str5.charAt(i20);
                            int i22 = i20;
                            char c12 = (char) (charAt - '0');
                            String str6 = str3;
                            if (c12 >= '\n') {
                                if (charAt != '$') {
                                    i3 = -1;
                                    if (charAt != '<') {
                                        i16 = i15;
                                        i15++;
                                    } else {
                                        if (i16 == -1) {
                                            throw d0.a(b10, i21, "invalid relative parameter", str5);
                                        }
                                        if (i21 == str5.length()) {
                                            throw new d0(d0.c(b10, -1, "unterminated parameter", str5), 0);
                                        }
                                        str5.charAt(i21);
                                        i18 = i21;
                                        i21 = i22 + 2;
                                    }
                                } else {
                                    if (i22 - i18 == 0) {
                                        throw d0.a(b10, i21, "missing index", str5);
                                    }
                                    if (str5.charAt(i18) == '0') {
                                        throw d0.a(b10, i21, "index has leading zero", str5);
                                    }
                                    int i23 = i19 - 1;
                                    if (i21 == str5.length()) {
                                        throw new d0(d0.c(b10, -1, "unterminated parameter", str5), 0);
                                    }
                                    str5.charAt(i21);
                                    i18 = i21;
                                    i21 = i22 + 2;
                                    i16 = i23;
                                    i3 = -1;
                                }
                                int i24 = i21 + i3;
                                while (i24 < str5.length()) {
                                    if (((char) ((str5.charAt(i24) & 65503) - 65)) < 26) {
                                        char charAt2 = str5.charAt(i24);
                                        int i25 = charAt2 & ' ';
                                        boolean z12 = i25 == 0;
                                        gh ghVar3 = gh.f2345e;
                                        if (i18 != i24 || z12) {
                                            int i26 = true != z12 ? 0 : 128;
                                            while (i18 != i24) {
                                                int i27 = i18 + 1;
                                                i10 = i25;
                                                char charAt3 = str5.charAt(i18);
                                                str2 = str4;
                                                if (charAt3 < ' ' || charAt3 > '0') {
                                                    cVar2 = phVar;
                                                    if (charAt3 > '9') {
                                                        throw d0.b(i18, "invalid flag", str5);
                                                    }
                                                    int i28 = charAt3 - '0';
                                                    while (i27 != i24) {
                                                        int i29 = i27 + 1;
                                                        char charAt4 = str5.charAt(i27);
                                                        if (charAt4 == '.') {
                                                            ghVar = new gh(i26, i28, gh.e(str5, i29, i24));
                                                            break;
                                                        }
                                                        char c13 = (char) (charAt4 - '0');
                                                        if (c13 >= '\n') {
                                                            throw d0.b(i27, "invalid width character", str5);
                                                        }
                                                        i28 = (i28 * 10) + c13;
                                                        if (i28 > 999999) {
                                                            throw d0.a(i18, i24, "width too large", str5);
                                                        }
                                                        i27 = i29;
                                                        i17 = 3;
                                                    }
                                                    ghVar2 = new gh(i26, i28, -1);
                                                } else {
                                                    cVar2 = phVar;
                                                    int i30 = ((int) ((gh.f2344d >>> ((charAt3 - ' ') * 3)) & 7)) - 1;
                                                    if (i30 >= 0) {
                                                        int i31 = 1 << i30;
                                                        if ((i26 & i31) != 0) {
                                                            throw d0.b(i18, "repeated flag", str5);
                                                        }
                                                        i26 |= i31;
                                                        i18 = i27;
                                                        phVar = cVar2;
                                                        i25 = i10;
                                                        str4 = str2;
                                                    } else {
                                                        if (charAt3 != '.') {
                                                            throw d0.b(i18, "invalid flag", str5);
                                                        }
                                                        ghVar2 = new gh(i26, -1, gh.e(str5, i27, i24));
                                                    }
                                                }
                                                ghVar = ghVar2;
                                                fhVar = fh.f2302t[(charAt2 | ' ') - 97];
                                                if (i10 == 0 && (fhVar == null || (fhVar.f2306i & 128) == 0)) {
                                                    fhVar = null;
                                                }
                                                int i32 = i24 + 1;
                                                if (fhVar == null) {
                                                    ghVar.getClass();
                                                    int i33 = fhVar.f2306i;
                                                    int i34 = fhVar.f2305e;
                                                    if (i34 != 1) {
                                                        if (i34 == 2 || i34 == i17 || i34 == 4) {
                                                            z10 = false;
                                                            if (ghVar.b(i33, z10)) {
                                                                throw d0.a(b10, i32, "invalid format specifier", str5);
                                                            }
                                                            if (i16 < 10) {
                                                                Map map = a0.f2125r;
                                                                if (ghVar.a()) {
                                                                    androidx.datastore.preferences.protobuf.i[] iVarArr = (a0[]) a0.f2125r.get(fhVar);
                                                                    g1.c(iVarArr, "default parameter");
                                                                    zVar = iVarArr[i16];
                                                                }
                                                            }
                                                            b0Var = new a0(i16, fhVar, ghVar);
                                                            zVar = b0Var;
                                                        } else if (i34 != 5) {
                                                            throw null;
                                                        }
                                                    }
                                                    z10 = true;
                                                    if (ghVar.b(i33, z10)) {
                                                    }
                                                } else if (charAt2 == 't' || charAt2 == 'T') {
                                                    if (!ghVar.b(160, false)) {
                                                        throw d0.a(b10, i32, "invalid format specification", str5);
                                                    }
                                                    int i35 = i24 + 2;
                                                    if (i35 > str5.length()) {
                                                        throw d0.b(b10, "truncated format specifier", str5);
                                                    }
                                                    y yVar = (y) y.f2996e.get(Character.valueOf(str5.charAt(i32)));
                                                    if (yVar == null) {
                                                        throw d0.b(i32, "illegal date/time conversion", str5);
                                                    }
                                                    zVar = new z(ghVar, i16, yVar);
                                                    i32 = i35;
                                                } else {
                                                    if (charAt2 != 'h' && charAt2 != 'H') {
                                                        throw d0.a(b10, i32, "invalid format specification", str5);
                                                    }
                                                    if (!ghVar.b(160, false)) {
                                                        throw d0.a(b10, i32, "invalid format specification", str5);
                                                    }
                                                    b0Var = new b0(ghVar, i16);
                                                    zVar = b0Var;
                                                }
                                                i11 = zVar.f559d;
                                                if (i11 < 32) {
                                                    rVar.f1774b |= 1 << i11;
                                                }
                                                rVar.f1775c = Math.max(rVar.f1775c, i11);
                                                e0.a(rVar.f1776d, b10, str5, sb4);
                                                objArr = (Object[]) rVar.f1778f;
                                                i12 = zVar.f559d;
                                                if (i12 >= objArr.length) {
                                                    Object obj = objArr[i12];
                                                    if (obj != null) {
                                                        zVar.E(rVar, obj);
                                                    } else {
                                                        sb4.append("null");
                                                    }
                                                } else {
                                                    sb4.append("[ERROR: MISSING LOG ARGUMENT]");
                                                }
                                                rVar.f1776d = i32;
                                                b10 = e0.b(i32, str5);
                                                phVar = cVar2;
                                                level3 = level4;
                                                str3 = str6;
                                                str4 = str2;
                                                i13 = 0;
                                            }
                                            cVar2 = phVar;
                                            i10 = i25;
                                            ghVar = new gh(i26, -1, -1);
                                        } else {
                                            ghVar = gh.f2345e;
                                            cVar2 = phVar;
                                            i10 = i25;
                                        }
                                        str2 = str4;
                                        fhVar = fh.f2302t[(charAt2 | ' ') - 97];
                                        if (i10 == 0) {
                                            fhVar = null;
                                        }
                                        int i322 = i24 + 1;
                                        if (fhVar == null) {
                                        }
                                        i11 = zVar.f559d;
                                        if (i11 < 32) {
                                        }
                                        rVar.f1775c = Math.max(rVar.f1775c, i11);
                                        e0.a(rVar.f1776d, b10, str5, sb4);
                                        objArr = (Object[]) rVar.f1778f;
                                        i12 = zVar.f559d;
                                        if (i12 >= objArr.length) {
                                        }
                                        rVar.f1776d = i322;
                                        b10 = e0.b(i322, str5);
                                        phVar = cVar2;
                                        level3 = level4;
                                        str3 = str6;
                                        str4 = str2;
                                        i13 = 0;
                                    } else {
                                        i24++;
                                        str4 = str4;
                                        i17 = 3;
                                    }
                                }
                                throw new d0(d0.c(b10, -1, "unterminated parameter", str5), 0);
                            }
                            int i36 = (i19 * 10) + c12;
                            if (i36 >= 1000000) {
                                throw d0.a(b10, i21, "index too large", str5);
                            }
                            i19 = i36;
                            i20 = i21;
                            level3 = level4;
                            str3 = str6;
                        }
                        throw new d0(d0.c(b10, -1, "unterminated parameter", str5), 0);
                    }
                    cVar = phVar;
                    level2 = level3;
                    String str7 = str3;
                    String str8 = str4;
                    int i37 = rVar.f1774b;
                    if (((i37 + 1) & i37) != 0 || (rVar.f1775c > 31 && i37 != -1)) {
                        throw new d0(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i37))), 0);
                    }
                    e0.a(rVar.f1776d, str5.length(), str5, sb4);
                    if (!(kgVar.f2470f != null)) {
                        kotlin.collections.i0.l(str7);
                        return;
                    }
                    Object[] objArr4 = kgVar.g;
                    if (objArr4 == null) {
                        kotlin.collections.i0.l(str8);
                        return;
                    } else if (objArr4.length > rVar.f1775c + 1) {
                        sb4.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    }
                }
            } else {
                cVar = phVar;
                level2 = level3;
                if (!(gVar == null)) {
                    kotlin.collections.i0.l("cannot get literal argument if a template context exists");
                    return;
                }
                Object[] objArr5 = kgVar.g;
                if (objArr5 == null) {
                    kotlin.collections.i0.l("cannot get literal argument before calling log()");
                    return;
                }
                sb3.append(ih.a(objArr5[0]));
            }
            int i38 = f.f2267a;
            hh hhVar = new hh(sb3);
            cVar.a(mhVar, hhVar);
            if (hhVar.f2386b) {
                sb3.append(" ]");
            }
        } else {
            sb3.append("(REDACTED) ");
            sb3.append(kgVar.f2470f.f2309b);
            level2 = level3;
        }
        sb2 = sb3.toString();
        Throwable th2 = (Throwable) kgVar.d().k(ng.f2585a);
        c10 = h.c(level2);
        if (c10 != 2) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean e(Level level) {
        int c10 = h.c(level);
        return Log.isLoggable(this.f2686b, c10) || Log.isLoggable("all", c10);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void f(kg kgVar) {
        m(kgVar, this.f2686b, this.f2687c, this.f2688d, this.f2689e);
    }
}
