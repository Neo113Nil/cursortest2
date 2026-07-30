package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.majelw.libystne.R;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gx1 extends o81 implements Function2 {
    public final /* synthetic */ Function2 A;
    public final /* synthetic */ fk2 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ du2 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ pw2 s;
    public final /* synthetic */ g81 t;
    public final /* synthetic */ f81 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ ch2 y;
    public final /* synthetic */ bn1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx1(vl1 vl1Var, du2 du2Var, String str, Function1 function1, boolean z, pw2 pw2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, ch2 ch2Var, bn1 bn1Var, Function2 function2, Function2 function22, fk2 fk2Var) {
        super(2);
        this.n = vl1Var;
        this.o = du2Var;
        this.p = str;
        this.q = function1;
        this.r = z;
        this.s = pw2Var;
        this.t = g81Var;
        this.u = f81Var;
        this.v = z2;
        this.w = i;
        this.x = i2;
        this.y = ch2Var;
        this.z = bn1Var;
        this.A = function2;
        this.C = function22;
        this.B = fk2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vl1 vl1Var;
        int i = this.m;
        Object obj3 = this.C;
        vl1 vl1Var2 = this.n;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    if (this.A != null) {
                        gs1 gs1Var = gs1.p;
                        AtomicInteger atomicInteger = wh2.a;
                        vl1Var = a.k(new AppendedSemanticsElement(gs1Var, true), 0.0f, ((ca0) obj3).K(kx1.a), 0.0f, 13);
                    } else {
                        vl1Var = sl1.a;
                    }
                    vl1 k = vl1Var2.k(vl1Var);
                    ak2.i(R.string.default_error_message, a00Var);
                    float f = pu2.b;
                    vl1 a = b.a(k, 280.0f, 56.0f);
                    du2 du2Var = this.o;
                    nn2 nn2Var = new nn2(du2Var.i);
                    Function2 function2 = this.A;
                    fk2 fk2Var = this.B;
                    String str = this.p;
                    boolean z = this.r;
                    boolean z2 = this.v;
                    ch2 ch2Var = this.y;
                    bn1 bn1Var = this.z;
                    rn.a(str, this.q, a, z, this.s, this.t, this.u, z2, this.w, this.x, ch2Var, null, bn1Var, nn2Var, yj1.H(1474611661, new fx1(str, z, z2, ch2Var, bn1Var, function2, du2Var, fk2Var), a00Var), a00Var, 0);
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    ak2.i(R.string.default_error_message, a00Var2);
                    float f2 = pu2.b;
                    vl1 a2 = b.a(vl1Var2, 280.0f, 56.0f);
                    du2 du2Var2 = this.o;
                    nn2 nn2Var2 = new nn2(du2Var2.i);
                    Function2 function22 = (Function2) obj3;
                    fk2 fk2Var2 = this.B;
                    String str2 = this.p;
                    boolean z3 = this.r;
                    boolean z4 = this.v;
                    ch2 ch2Var2 = this.y;
                    bn1 bn1Var2 = this.z;
                    rn.a(str2, this.q, a2, z3, this.s, this.t, this.u, z4, this.w, this.x, ch2Var2, null, bn1Var2, nn2Var2, yj1.H(-288211827, new su2(str2, z3, z4, ch2Var2, bn1Var2, this.A, function22, fk2Var2, du2Var2), a00Var2), a00Var2, 0);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx1(vl1 vl1Var, Function2 function2, ca0 ca0Var, du2 du2Var, String str, Function1 function1, boolean z, pw2 pw2Var, g81 g81Var, f81 f81Var, boolean z2, int i, int i2, ch2 ch2Var, bn1 bn1Var, fk2 fk2Var) {
        super(2);
        this.n = vl1Var;
        this.A = function2;
        this.C = ca0Var;
        this.o = du2Var;
        this.p = str;
        this.q = function1;
        this.r = z;
        this.s = pw2Var;
        this.t = g81Var;
        this.u = f81Var;
        this.v = z2;
        this.w = i;
        this.x = i2;
        this.y = ch2Var;
        this.z = bn1Var;
        this.B = fk2Var;
    }
}
