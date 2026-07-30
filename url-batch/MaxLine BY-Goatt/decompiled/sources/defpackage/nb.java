package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nb extends o81 implements Function1 {
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ y9 o;
    public final /* synthetic */ mo p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(Function0 function0, boolean z, y9 y9Var, mo moVar) {
        super(1);
        this.m = function0;
        this.n = z;
        this.o = y9Var;
        this.p = moVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k91 k91Var = (k91) obj;
        k91Var.a();
        ns nsVar = k91Var.m;
        if (((Boolean) this.m.invoke()).booleanValue()) {
            boolean z = this.n;
            y9 y9Var = this.o;
            mo moVar = this.p;
            if (z) {
                long Z = nsVar.Z();
                mh mhVar = nsVar.n;
                long v = mhVar.v();
                mhVar.o().m();
                try {
                    ((ar0) mhVar.n).y(-1.0f, 1.0f, Z);
                    nsVar.c(y9Var, moVar);
                } finally {
                    mhVar.o().j();
                    mhVar.J(v);
                }
            } else {
                nsVar.c(y9Var, moVar);
            }
        }
        return Unit.a;
    }
}
