package P0;

import A.AbstractC0017m;
import A.C0028y;
import D.C0120c;
import D.w1;
import G.C0192d;
import G.C0208l;
import G.C0212n;
import G.C0216p;
import G.C0222s0;
import G.C0235z;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.W;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import r0.C1067h;
import r0.C1069j;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0235z f3753a = new C0235z(W.f2779l, C0264f.f3723i);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (r7 == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(E e4, Function0 function0, F f4, O.a aVar, C0216p c0216p, int i2, int i4) {
        int i5;
        Function0 function02;
        int i6;
        Function0 function03;
        String str;
        Object I3;
        Object obj;
        boolean z4;
        Object obj2;
        int i7;
        int i8;
        boolean h4;
        Object obj3;
        boolean h5;
        Object I4;
        boolean z5;
        Object I5;
        boolean h6;
        Object I6;
        boolean h7;
        Object I7;
        boolean h8;
        Object I8;
        int i9;
        C0222s0 s4;
        c0216p.U(-830247068);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.f(e4) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i4 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            function02 = function0;
            i5 |= c0216p.h(function02) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i5 |= c0216p.f(f4) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i5 |= c0216p.h(aVar) ? 2048 : 1024;
            }
            i6 = i5;
            if ((i6 & 1171) == 1170 || !c0216p.z()) {
                function03 = i10 == 0 ? null : function02;
                View view = (View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f);
                M0.b bVar = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
                str = (String) c0216p.k(f3753a);
                M0.k kVar = (M0.k) c0216p.k(AbstractC1144g0.f10224l);
                C0212n M3 = C0192d.M(c0216p);
                InterfaceC0191c0 N3 = C0192d.N(aVar, c0216p);
                boolean z6 = false;
                UUID uuid = (UUID) u3.l.s0(new Object[0], null, C0264f.f3724j, c0216p, 3072, 6);
                I3 = c0216p.I();
                obj = C0208l.f2826a;
                if (I3 != obj) {
                    z4 = true;
                    obj2 = obj;
                    i7 = i6;
                    B b4 = new B(function03, f4, str, view, bVar, e4, uuid);
                    b4.h(M3, new O.a(1302892335, true, new C0120c(b4, 7, N3)));
                    c0216p.c0(b4);
                    I3 = b4;
                } else {
                    z4 = true;
                    obj2 = obj;
                    i7 = i6;
                }
                B b5 = (B) I3;
                i8 = i7;
                int i11 = i8 & 112;
                int i12 = i8 & 896;
                h4 = c0216p.h(b5) | (i11 != 32 ? z4 : false) | (i12 != 256 ? z4 : false) | c0216p.f(str) | c0216p.f(kVar);
                Object I9 = c0216p.I();
                if (h4) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                }
                I9 = new h(b5, function03, f4, str, kVar, 0);
                c0216p.c0(I9);
                C0192d.d(b5, (Function1) I9, c0216p);
                h5 = (i11 != 32 ? z4 : false) | c0216p.h(b5) | (i12 != 256 ? z4 : false) | c0216p.f(str) | c0216p.f(kVar);
                I4 = c0216p.I();
                if (!h5 || I4 == obj3) {
                    I4 = new i(b5, function03, f4, str, kVar);
                    c0216p.c0(I4);
                }
                C0192d.g((Function0) I4, c0216p);
                boolean h9 = c0216p.h(b5);
                if ((i8 & 14) == 4) {
                    z6 = z4;
                }
                z5 = h9 | z6;
                I5 = c0216p.I();
                if (!z5 || I5 == obj3) {
                    I5 = new C0028y(b5, 13, e4);
                    c0216p.c0(I5);
                }
                C0192d.d(e4, (Function1) I5, c0216p);
                h6 = c0216p.h(b5);
                I6 = c0216p.I();
                if (!h6 || I6 == obj3) {
                    I6 = new k(b5, null);
                    c0216p.c0(I6);
                }
                C0192d.e(c0216p, b5, (Function2) I6);
                S.l lVar = S.l.f3977a;
                h7 = c0216p.h(b5);
                I7 = c0216p.I();
                if (!h7 || I7 == obj3) {
                    I7 = new l(b5, 0);
                    c0216p.c0(I7);
                }
                S.o d4 = androidx.compose.ui.layout.a.d(lVar, (Function1) I7);
                h8 = c0216p.h(b5) | c0216p.f(kVar);
                I8 = c0216p.I();
                if (!h8 || I8 == obj3) {
                    I8 = new w1(b5, 1, kVar);
                    c0216p.c0(I8);
                }
                InterfaceC0945F interfaceC0945F = (InterfaceC0945F) I8;
                i9 = c0216p.f2861P;
                InterfaceC0213n0 m4 = c0216p.m();
                S.o d5 = S.a.d(c0216p, d4);
                InterfaceC1070k.f9822h.getClass();
                Function0 function04 = C1069j.f9816b;
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.f0();
                } else {
                    c0216p.l(function04);
                }
                C0192d.R(c0216p, interfaceC0945F, C1069j.f9820f);
                C0192d.R(c0216p, m4, C1069j.f9819e);
                C1067h c1067h = C1069j.f9821g;
                if (!c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                    AbstractC0017m.r(i9, c0216p, i9, c1067h);
                }
                C0192d.R(c0216p, d5, C1069j.f9818d);
                c0216p.q(z4);
                function02 = function03;
            } else {
                c0216p.N();
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new m(e4, function02, f4, aVar, i2, i4);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i6 = i5;
        if ((i6 & 1171) == 1170) {
        }
        if (i10 == 0) {
        }
        View view2 = (View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f);
        M0.b bVar2 = (M0.b) c0216p.k(AbstractC1144g0.f10218f);
        str = (String) c0216p.k(f3753a);
        M0.k kVar2 = (M0.k) c0216p.k(AbstractC1144g0.f10224l);
        C0212n M32 = C0192d.M(c0216p);
        InterfaceC0191c0 N32 = C0192d.N(aVar, c0216p);
        boolean z62 = false;
        UUID uuid2 = (UUID) u3.l.s0(new Object[0], null, C0264f.f3724j, c0216p, 3072, 6);
        I3 = c0216p.I();
        obj = C0208l.f2826a;
        if (I3 != obj) {
        }
        B b52 = (B) I3;
        i8 = i7;
        int i112 = i8 & 112;
        int i122 = i8 & 896;
        h4 = c0216p.h(b52) | (i112 != 32 ? z4 : false) | (i122 != 256 ? z4 : false) | c0216p.f(str) | c0216p.f(kVar2);
        Object I92 = c0216p.I();
        if (h4) {
        }
        I92 = new h(b52, function03, f4, str, kVar2, 0);
        c0216p.c0(I92);
        C0192d.d(b52, (Function1) I92, c0216p);
        h5 = (i112 != 32 ? z4 : false) | c0216p.h(b52) | (i122 != 256 ? z4 : false) | c0216p.f(str) | c0216p.f(kVar2);
        I4 = c0216p.I();
        if (!h5) {
        }
        I4 = new i(b52, function03, f4, str, kVar2);
        c0216p.c0(I4);
        C0192d.g((Function0) I4, c0216p);
        boolean h92 = c0216p.h(b52);
        if ((i8 & 14) == 4) {
        }
        z5 = h92 | z62;
        I5 = c0216p.I();
        if (!z5) {
        }
        I5 = new C0028y(b52, 13, e4);
        c0216p.c0(I5);
        C0192d.d(e4, (Function1) I5, c0216p);
        h6 = c0216p.h(b52);
        I6 = c0216p.I();
        if (!h6) {
        }
        I6 = new k(b52, null);
        c0216p.c0(I6);
        C0192d.e(c0216p, b52, (Function2) I6);
        S.l lVar2 = S.l.f3977a;
        h7 = c0216p.h(b52);
        I7 = c0216p.I();
        if (!h7) {
        }
        I7 = new l(b52, 0);
        c0216p.c0(I7);
        S.o d42 = androidx.compose.ui.layout.a.d(lVar2, (Function1) I7);
        h8 = c0216p.h(b52) | c0216p.f(kVar2);
        I8 = c0216p.I();
        if (!h8) {
        }
        I8 = new w1(b52, 1, kVar2);
        c0216p.c0(I8);
        InterfaceC0945F interfaceC0945F2 = (InterfaceC0945F) I8;
        i9 = c0216p.f2861P;
        InterfaceC0213n0 m42 = c0216p.m();
        S.o d52 = S.a.d(c0216p, d42);
        InterfaceC1070k.f9822h.getClass();
        Function0 function042 = C1069j.f9816b;
        c0216p.W();
        if (c0216p.f2860O) {
        }
        C0192d.R(c0216p, interfaceC0945F2, C1069j.f9820f);
        C0192d.R(c0216p, m42, C1069j.f9819e);
        C1067h c1067h2 = C1069j.f9821g;
        if (!c0216p.f2860O) {
        }
        AbstractC0017m.r(i9, c0216p, i9, c1067h2);
        C0192d.R(c0216p, d52, C1069j.f9818d);
        c0216p.q(z4);
        function02 = function03;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
