package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class lh1 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ up1 n;

    public /* synthetic */ lh1(up1 up1Var, int i) {
        this.m = i;
        this.n = up1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [iq1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        final int i2 = 1;
        final int i3 = 6;
        final up1 up1Var = this.n;
        switch (i) {
            case 0:
                up1.k(up1Var, q40.i(((Long) obj).longValue(), "item_detail/"), null, 6);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                up1.k(up1Var, "gem_detail/".concat(str), null, 6);
                break;
            case 2:
                up1.k(up1Var, q40.i(((Long) obj).longValue(), "item_detail/"), null, 6);
                break;
            case 3:
                eq1 eq1Var = (eq1) obj;
                eq1Var.getClass();
                int i4 = rp1.z;
                eq1Var.d = zm3.u(up1Var.f()).r;
                Unit unit = Unit.a;
                eq1Var.e = true;
                eq1Var.b = true;
                eq1Var.c = true;
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                up1.k(up1Var, "gem_detail/".concat(str2), null, 6);
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                up1.k(up1Var, "gem_detail/".concat(str3), null, 6);
                break;
            case 6:
                up1.k(up1Var, q40.i(((Long) obj).longValue(), "add_edit/"), null, 6);
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                String str4 = (String) obj;
                str4.getClass();
                up1.k(up1Var, "gem_detail/".concat(str4), null, 6);
                break;
            case 8:
                String str5 = (String) obj;
                str5.getClass();
                up1.k(up1Var, "gem_detail/".concat(str5), null, 6);
                break;
            case 9:
                String str6 = (String) obj;
                str6.getClass();
                up1.k(up1Var, "gem_detail/".concat(str6), null, 6);
                break;
            default:
                sp1 sp1Var = (sp1) obj;
                sp1Var.getClass();
                final int i5 = 7;
                j8.r(sp1Var, "home", null, new my(414143533, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i6 = i5;
                        final int i7 = 2;
                        final int i8 = 1;
                        final int i9 = 8;
                        final int i10 = 7;
                        final int i11 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i6) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i9);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i7) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i8);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i7);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i11);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i10);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 254);
                final int i6 = 0;
                j8.r(sp1Var, "atlas", null, new my(-833045930, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i6;
                        final int i7 = 2;
                        final int i8 = 1;
                        final int i9 = 8;
                        final int i10 = 7;
                        final int i11 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i9);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i7) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i8);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i7);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i11);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i10);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 254);
                j8.r(sp1Var, "jewelry", null, new my(-1267009611, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i2;
                        final int i7 = 2;
                        final int i8 = 1;
                        final int i9 = 8;
                        final int i10 = 7;
                        final int i11 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i9);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i7) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i8);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i7);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i11);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i10);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 254);
                final int i7 = 2;
                j8.r(sp1Var, "care", null, new my(-1700973292, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i7;
                        final int i72 = 2;
                        final int i8 = 1;
                        final int i9 = 8;
                        final int i10 = 7;
                        final int i11 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i9);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i72) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i8);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i72);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i11);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i10);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 254);
                final int i8 = 3;
                j8.r(sp1Var, "settings", null, new my(-2134936973, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i8;
                        final int i72 = 2;
                        final int i82 = 1;
                        final int i9 = 8;
                        final int i10 = 7;
                        final int i11 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i9);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i72) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i82);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i72);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i82) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i11);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i10);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i9) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 254);
                final int i9 = 4;
                j8.r(sp1Var, FirebaseAnalytics.Event.SEARCH, null, new my(1726066642, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i9;
                        final int i72 = 2;
                        final int i82 = 1;
                        final int i92 = 8;
                        final int i10 = 7;
                        final int i11 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i92);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i72) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i82);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i72);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i82) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i11);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i10);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i11) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i10) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i92) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 254);
                j8.r(sp1Var, "stats", null, yj1.i, 254);
                final int i10 = 8;
                at0 at0Var = (at0) new at0(8).m;
                gq1 gq1Var = iq1.d;
                at0Var.m = gq1Var;
                Unit unit2 = Unit.a;
                iq1 iq1Var = (iq1) at0Var.m;
                if (iq1Var == null) {
                    iq1Var = gq1Var;
                }
                final int i11 = 5;
                j8.r(sp1Var, "gem_detail/{slug}", pv.c(new vo1("slug", new yo1(iq1Var))), new my(858139280, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i11;
                        final int i72 = 2;
                        final int i82 = 1;
                        final int i92 = 8;
                        final int i102 = 7;
                        final int i112 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i92);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i72) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i82);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i72);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i82) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i112);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i102);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i92) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 252);
                at0 at0Var2 = (at0) new at0(8).m;
                gq1 gq1Var2 = iq1.b;
                at0Var2.m = gq1Var2;
                Unit unit3 = Unit.a;
                iq1 iq1Var2 = (iq1) at0Var2.m;
                if (iq1Var2 == null) {
                    iq1Var2 = gq1Var;
                }
                j8.r(sp1Var, "item_detail/{id}", pv.c(new vo1("id", new yo1(iq1Var2))), new my(424175599, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i3;
                        final int i72 = 2;
                        final int i82 = 1;
                        final int i92 = 8;
                        final int i102 = 7;
                        final int i112 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i92);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i72) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i82);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i72);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i82) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i112);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i102);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i92) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 252);
                at0 at0Var3 = (at0) new at0(8).m;
                at0Var3.m = gq1Var2;
                Unit unit4 = Unit.a;
                ?? r4 = (iq1) at0Var3.m;
                if (r4 != 0) {
                    gq1Var = r4;
                }
                j8.r(sp1Var, "add_edit/{id}", pv.c(new vo1("id", new yo1(gq1Var))), new my(-9788082, new yt0() { // from class: kh1
                    @Override // defpackage.yt0
                    public final Object b(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i62 = i10;
                        final int i72 = 2;
                        final int i82 = 1;
                        final int i92 = 8;
                        final int i102 = 7;
                        final int i112 = 6;
                        final int i12 = 5;
                        final int i13 = 4;
                        final int i14 = 0;
                        nj njVar = sz.a;
                        final up1 up1Var2 = up1Var;
                        switch (i62) {
                            case 0:
                                a00 a00Var = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h = a00Var.h(up1Var2);
                                Object M = a00Var.M();
                                if (h || M == njVar) {
                                    M = new lh1(up1Var2, i12);
                                    a00Var.i0(M);
                                }
                                s93.e((Function1) M, null, null, a00Var, 0);
                                break;
                            case 1:
                                a00 a00Var2 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h2 = a00Var2.h(up1Var2);
                                Object M2 = a00Var2.M();
                                if (h2 || M2 == njVar) {
                                    M2 = new lh1(up1Var2, i14);
                                    a00Var2.i0(M2);
                                }
                                Function1 function1 = (Function1) M2;
                                boolean h3 = a00Var2.h(up1Var2);
                                Object M3 = a00Var2.M();
                                if (h3 || M3 == njVar) {
                                    M3 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var2.i0(M3);
                                }
                                s93.n(function1, (Function0) M3, null, null, a00Var2, 0);
                                break;
                            case 2:
                                a00 a00Var3 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h4 = a00Var3.h(up1Var2);
                                Object M4 = a00Var3.M();
                                if (h4 || M4 == njVar) {
                                    M4 = new lh1(up1Var2, i92);
                                    a00Var3.i0(M4);
                                }
                                l41.b(0, a00Var3, null, (Function1) M4);
                                break;
                            case 3:
                                a00 a00Var4 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h5 = a00Var4.h(up1Var2);
                                Object M5 = a00Var4.M();
                                if (h5 || M5 == njVar) {
                                    M5 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i72) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var4.i0(M5);
                                }
                                zj2.e((Function0) M5, null, a00Var4, 0);
                                break;
                            case 4:
                                a00 a00Var5 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h6 = a00Var5.h(up1Var2);
                                Object M6 = a00Var5.M();
                                if (h6 || M6 == njVar) {
                                    M6 = new lh1(up1Var2, i82);
                                    a00Var5.i0(M6);
                                }
                                Function1 function12 = (Function1) M6;
                                boolean h7 = a00Var5.h(up1Var2);
                                Object M7 = a00Var5.M();
                                if (h7 || M7 == njVar) {
                                    M7 = new lh1(up1Var2, i72);
                                    a00Var5.i0(M7);
                                }
                                tk3.q(function12, (Function1) M7, null, null, a00Var5, 0);
                                break;
                            case 5:
                                cp1 cp1Var = (cp1) obj3;
                                a00 a00Var6 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var.getClass();
                                Bundle a = cp1Var.a();
                                String string = a != null ? a.getString("slug") : null;
                                if (string == null) {
                                    string = BuildConfig.FLAVOR;
                                }
                                String str7 = string;
                                boolean h8 = a00Var6.h(up1Var2);
                                Object M8 = a00Var6.M();
                                if (h8 || M8 == njVar) {
                                    M8 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i82) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var6.i0(M8);
                                }
                                Function0 function0 = (Function0) M8;
                                boolean h9 = a00Var6.h(up1Var2);
                                Object M9 = a00Var6.M();
                                if (h9 || M9 == njVar) {
                                    M9 = new lh1(up1Var2, i13);
                                    a00Var6.i0(M9);
                                }
                                bd3.e(str7, function0, (Function1) M9, null, a00Var6, 0);
                                break;
                            case 6:
                                cp1 cp1Var2 = (cp1) obj3;
                                a00 a00Var7 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var2.getClass();
                                Bundle a2 = cp1Var2.a();
                                long j = a2 != null ? a2.getLong("id") : 0L;
                                boolean h10 = a00Var7.h(up1Var2);
                                Object M10 = a00Var7.M();
                                if (h10 || M10 == njVar) {
                                    final int i15 = 3;
                                    M10 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i15) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var7.i0(M10);
                                }
                                Function0 function02 = (Function0) M10;
                                boolean h11 = a00Var7.h(up1Var2);
                                Object M11 = a00Var7.M();
                                if (h11 || M11 == njVar) {
                                    M11 = new lh1(up1Var2, i112);
                                    a00Var7.i0(M11);
                                }
                                Function1 function13 = (Function1) M11;
                                boolean h12 = a00Var7.h(up1Var2);
                                Object M12 = a00Var7.M();
                                if (h12 || M12 == njVar) {
                                    M12 = new lh1(up1Var2, i102);
                                    a00Var7.i0(M12);
                                }
                                o70.d(j, function02, function13, (Function1) M12, null, a00Var7, 0);
                                break;
                            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                a00 a00Var8 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                ((cp1) obj3).getClass();
                                boolean h13 = a00Var8.h(up1Var2);
                                Object M13 = a00Var8.M();
                                if (h13 || M13 == njVar) {
                                    M13 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i12) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M13);
                                }
                                Function0 function03 = (Function0) M13;
                                boolean h14 = a00Var8.h(up1Var2);
                                Object M14 = a00Var8.M();
                                if (h14 || M14 == njVar) {
                                    M14 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i112) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M14);
                                }
                                Function0 function04 = (Function0) M14;
                                boolean h15 = a00Var8.h(up1Var2);
                                Object M15 = a00Var8.M();
                                if (h15 || M15 == njVar) {
                                    M15 = new lh1(up1Var2, 9);
                                    a00Var8.i0(M15);
                                }
                                Function1 function14 = (Function1) M15;
                                boolean h16 = a00Var8.h(up1Var2);
                                Object M16 = a00Var8.M();
                                if (h16 || M16 == njVar) {
                                    M16 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i102) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M16);
                                }
                                Function0 function05 = (Function0) M16;
                                boolean h17 = a00Var8.h(up1Var2);
                                Object M17 = a00Var8.M();
                                if (h17 || M17 == njVar) {
                                    M17 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i92) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var8.i0(M17);
                                }
                                bd3.f(function03, function04, function14, function05, (Function0) M17, null, a00Var8, 0);
                                break;
                            default:
                                cp1 cp1Var3 = (cp1) obj3;
                                a00 a00Var9 = (a00) obj4;
                                ((Integer) obj5).getClass();
                                ((vc) obj2).getClass();
                                cp1Var3.getClass();
                                Bundle a3 = cp1Var3.a();
                                long j2 = a3 != null ? a3.getLong("id") : 0L;
                                boolean h18 = a00Var9.h(up1Var2);
                                Object M18 = a00Var9.M();
                                if (h18 || M18 == njVar) {
                                    M18 = new Function0() { // from class: mh1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i13) {
                                                case 0:
                                                    up1.k(up1Var2, "add_edit/0", null, 6);
                                                    break;
                                                case 1:
                                                    up1Var2.l();
                                                    break;
                                                case 2:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                                case 3:
                                                    up1Var2.l();
                                                    break;
                                                case 4:
                                                    up1Var2.l();
                                                    break;
                                                case 5:
                                                    ph1.b(up1Var2, "atlas");
                                                    break;
                                                case 6:
                                                    ph1.b(up1Var2, "jewelry");
                                                    break;
                                                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    up1.k(up1Var2, FirebaseAnalytics.Event.SEARCH, null, 6);
                                                    break;
                                                default:
                                                    up1.k(up1Var2, "stats", null, 6);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    a00Var9.i0(M18);
                                }
                                iv1.a(j2, (Function0) M18, null, a00Var9, 0);
                                break;
                        }
                        return Unit.a;
                    }
                }, true), 252);
                break;
        }
        return Unit.a;
    }
}
