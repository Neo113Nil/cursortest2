package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f9 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9(int i, o30 o30Var, Object obj) {
        super(2, o30Var);
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new f9(0, o30Var, (eb0) obj2);
            default:
                return new f9(1, o30Var, (ob0) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a50 a50Var = (a50) obj;
        o30 o30Var = (o30) obj2;
        switch (this.m) {
        }
        return ((f9) create(a50Var, o30Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        switch (this.m) {
            case 0:
                b50 b50Var = b50.m;
                ca2.b(obj);
                ((eb0) this.n).show();
                return Unit.a;
            default:
                b50 b50Var2 = b50.m;
                ca2.b(obj);
                ob0 ob0Var = (ob0) this.n;
                synchronized (ob0Var) {
                    if (!ob0Var.x || ob0Var.y) {
                        return Unit.a;
                    }
                    try {
                        ob0Var.A();
                    } catch (IOException unused) {
                        ob0Var.z = true;
                    }
                    try {
                        if (ob0Var.u >= 2000) {
                            ob0Var.C();
                        }
                    } catch (IOException unused2) {
                        ob0Var.A = true;
                        ob0Var.v = new n62(new lo());
                    }
                    return Unit.a;
                }
        }
    }
}
