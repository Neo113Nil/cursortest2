package defpackage;

import android.content.ClipDescription;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ih2 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih2(int i, Object obj, Object obj2) {
        super(1);
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        sc1 sc1Var;
        Unit unit;
        boolean z;
        vu vuVar;
        int i = this.m;
        int i2 = 6;
        int i3 = 8;
        int i4 = 4;
        int i5 = 2;
        int i6 = 3;
        int i7 = 0;
        r7 = false;
        r7 = false;
        r7 = false;
        r7 = false;
        r7 = false;
        boolean z2 = false;
        i7 = 0;
        i7 = 0;
        i7 = 0;
        int i8 = 1;
        Object obj2 = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                t22 t22Var = (t22) obj;
                ot2 ot2Var = (ot2) obj2;
                long j = t22Var.c;
                dh2 dh2Var = (dh2) obj3;
                gv2 gv2Var = (gv2) ot2Var.n;
                if (gv2Var.h() && gv2Var.j().a.n.length() != 0 && (sc1Var = gv2Var.d) != null && sc1Var.d() != null) {
                    ot2Var.i(gv2Var.j(), j, false, dh2Var);
                    i7 = 1;
                }
                if (i7 != 0) {
                    t22Var.a();
                }
                return Unit.a;
            case 1:
                Throwable th = (Throwable) obj;
                ((j6) obj2).invoke(th);
                lq lqVar = (lq) ((js0) obj3).o;
                lqVar.k(th, false);
                do {
                    Object a = st.a(lqVar.i());
                    if (a != null) {
                        ((el1) a).b.U(new gx(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        Unit unit2 = Unit.a;
                        unit = Unit.a;
                    } else {
                        unit = null;
                    }
                } while (unit != null);
                return Unit.a;
            case 2:
                m12.l((m12) obj, (n12) obj2, ((gl2) obj3).L);
                return Unit.a;
            case 3:
                KeyEvent keyEvent = ((x71) obj).a;
                no0 no0Var = (no0) obj2;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && z71.D(keyEvent) == 2 && keyEvent.getSource() != 257) {
                    if (zj2.g(19, keyEvent)) {
                        z2 = ((po0) no0Var).f(5);
                    } else if (zj2.g(20, keyEvent)) {
                        z2 = ((po0) no0Var).f(6);
                    } else if (zj2.g(21, keyEvent)) {
                        z2 = ((po0) no0Var).f(3);
                    } else if (zj2.g(22, keyEvent)) {
                        z2 = ((po0) no0Var).f(4);
                    } else if (zj2.g(23, keyEvent)) {
                        kn2 kn2Var = ((sc1) obj3).c;
                        if (kn2Var != null) {
                            ((r90) kn2Var).b();
                        }
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 4:
                yk3.B((yd0) obj, (bx1) obj2, ((hu2) obj3).a());
                return Unit.a;
            case 5:
                ir irVar = (ir) obj;
                return irVar.a(new j6(i3, new ih2(i4, ((fk2) obj2).a(irVar.m.f(), irVar.m.getLayoutDirection(), irVar), (hu2) obj3)));
            case 6:
                return new o8(i2, (zn1) obj2, (bn1) obj3);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                b30 b30Var = (b30) obj;
                gv2 gv2Var2 = (gv2) obj2;
                lz1 lz1Var = gv2Var2.j;
                boolean b = jw2.b(gv2Var2.j().b);
                g30 g30Var = (g30) obj3;
                b30.b(b30Var, new l30(1), !b && ((Boolean) lz1Var.getValue()).booleanValue(), new jv2(g30Var, gv2Var2, i7));
                b30.b(b30Var, new l30(2), !b, new jv2(g30Var, gv2Var2, i8));
                if (((Boolean) lz1Var.getValue()).booleanValue() && (vuVar = gv2Var2.f) != null) {
                    ClipDescription primaryClipDescription = ((d7) vuVar).a.getPrimaryClipDescription();
                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                        z = true;
                        b30.b(b30Var, new l30(3), z, new jv2(g30Var, gv2Var2, i5));
                        b30.b(b30Var, new l30(4), jw2.c(gv2Var2.j().b) != gv2Var2.j().a.n.length(), new jv2(g30Var, gv2Var2, i6));
                        return Unit.a;
                    }
                }
                z = false;
                b30.b(b30Var, new l30(3), z, new jv2(g30Var, gv2Var2, i5));
                b30.b(b30Var, new l30(4), jw2.c(gv2Var2.j().b) != gv2Var2.j().a.n.length(), new jv2(g30Var, gv2Var2, i6));
                return Unit.a;
            case 8:
                d50 d50Var = d50.m;
                z71.H((a50) obj2, null, new wp1((fz2) obj3, null), 1);
                return new xa(3);
            case 9:
                fz2 fz2Var = (fz2) obj2;
                fz2 fz2Var2 = (fz2) obj3;
                fz2Var.j.add(fz2Var2);
                return new o8(7, fz2Var, fz2Var2);
            case 10:
                return new o8(i3, (fz2) obj2, (bz2) obj3);
            case 11:
                fz2 fz2Var3 = (fz2) obj2;
                ez2 ez2Var = (ez2) obj3;
                fz2Var3.i.add(ez2Var);
                return new o8(9, fz2Var3, ez2Var);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((Number) obj).longValue();
                z23 z23Var = (z23) obj2;
                float f = z23Var.e;
                z23Var.e = 0.0f;
                ((Function1) obj3).invoke(Float.valueOf(f));
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                i83 i83Var = (i83) obj2;
                View view = (View) obj3;
                b31 b31Var = i83Var.t;
                if (i83Var.s == 0) {
                    WeakHashMap weakHashMap = e53.a;
                    x43.c(view, b31Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(b31Var);
                    e53.k(view, b31Var);
                }
                i83Var.s++;
                return new o8(10, i83Var, view);
            default:
                h7 h7Var = (h7) obj;
                Function2 function2 = (Function2) obj3;
                g93 g93Var = (g93) obj2;
                if (!g93Var.o) {
                    ad1 lifecycle = h7Var.a.getLifecycle();
                    g93Var.q = function2;
                    if (g93Var.p == null) {
                        g93Var.p = lifecycle;
                        lifecycle.a(g93Var);
                    } else if (lifecycle.b().compareTo(zc1.o) >= 0) {
                        g93Var.n.A(new my(1330788943, new f93(g93Var, function2, i8), true));
                    }
                }
                return Unit.a;
        }
    }
}
