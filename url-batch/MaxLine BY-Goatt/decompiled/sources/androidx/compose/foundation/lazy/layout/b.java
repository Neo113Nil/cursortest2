package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a00;
import defpackage.ac0;
import defpackage.eb;
import defpackage.gc;
import defpackage.gq2;
import defpackage.j8;
import defpackage.jd2;
import defpackage.kb1;
import defpackage.n8;
import defpackage.o81;
import defpackage.sz;
import defpackage.t21;
import defpackage.vl1;
import defpackage.x30;
import defpackage.xb1;
import defpackage.xt0;
import defpackage.yb1;
import defpackage.zn1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b extends o81 implements xt0 {
    public final /* synthetic */ xb1 m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ zn1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xb1 xb1Var, vl1 vl1Var, Function2 function2, zn1 zn1Var) {
        super(3);
        this.m = xb1Var;
        this.n = vl1Var;
        this.o = function2;
        this.p = zn1Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        vl1 k;
        jd2 jd2Var = (jd2) obj;
        a00 a00Var = (a00) obj2;
        ((Number) obj3).intValue();
        Object M = a00Var.M();
        Object obj4 = sz.a;
        if (M == obj4) {
            M = new kb1(jd2Var, new x30(this.p, 2));
            a00Var.i0(M);
        }
        kb1 kb1Var = (kb1) M;
        Object M2 = a00Var.M();
        if (M2 == obj4) {
            M2 = new gq2(new t21(kb1Var));
            a00Var.i0(M2);
        }
        gq2 gq2Var = (gq2) M2;
        xb1 xb1Var = this.m;
        if (xb1Var != null) {
            a00Var.X(205264983);
            a00Var.X(6622915);
            View view = (View) a00Var.j(AndroidCompositionLocals_androidKt.f);
            boolean f = a00Var.f(view);
            Object M3 = a00Var.M();
            if (f || M3 == obj4) {
                M3 = new eb(view);
                a00Var.i0(M3);
            }
            Object obj5 = (eb) M3;
            a00Var.q(false);
            Object[] objArr = {xb1Var, kb1Var, gq2Var, obj5};
            boolean f2 = a00Var.f(xb1Var) | a00Var.h(kb1Var) | a00Var.h(gq2Var) | a00Var.h(obj5);
            Object M4 = a00Var.M();
            if (f2 || M4 == obj4) {
                Object gcVar = new gc(xb1Var, kb1Var, gq2Var, obj5, 2);
                a00Var.i0(gcVar);
                M4 = gcVar;
            }
            Function1 function1 = (Function1) M4;
            boolean z = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z |= a00Var.f(obj6);
            }
            Object M5 = a00Var.M();
            if (z || M5 == obj4) {
                a00Var.i0(new ac0(function1));
            }
            a00Var.q(false);
        } else {
            a00Var.X(205858881);
            a00Var.q(false);
        }
        int i = yb1.b;
        vl1 vl1Var = this.n;
        if (xb1Var != null && (k = vl1Var.k(new TraversablePrefetchStateModifierElement(xb1Var))) != null) {
            vl1Var = k;
        }
        boolean f3 = a00Var.f(kb1Var);
        Object obj7 = this.o;
        boolean f4 = f3 | a00Var.f(obj7);
        Object M6 = a00Var.M();
        if (f4 || M6 == obj4) {
            M6 = new n8(13, kb1Var, obj7);
            a00Var.i0(M6);
        }
        j8.f(gq2Var, vl1Var, (Function2) M6, a00Var, 8);
        return Unit.a;
    }
}
