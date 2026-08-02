package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lar implements lba {
    public final kqn a;
    public final int b;
    public final int c;

    public lar(kqn kqnVar, int i, int i2) {
        this.a = kqnVar;
        this.b = i;
        this.c = i2;
        boolean z = kvo.a;
    }

    public static /* synthetic */ Object g(lar larVar, kzr kzrVar, kqj kqjVar) {
        Object f = kvp.f(new laq(kzrVar, larVar, (kqj) null, 0), kqjVar);
        return f == kqp.a ? f : kow.a;
    }

    @Override // defpackage.kzq
    public Object a(kzr kzrVar, kqj kqjVar) {
        return g(this, kzrVar, kqjVar);
    }

    public abstract Object b(kzd kzdVar, kqj kqjVar);

    protected abstract lar c(kqn kqnVar, int i, int i2);

    @Override // defpackage.lba
    public final kzq cf() {
        boolean z = kvo.a;
        kqn kqnVar = this.a;
        return (ksp.b(kqnVar, kqnVar) && this.b == 0 && this.c == 2) ? this : c(kqnVar, 0, 2);
    }

    protected String d() {
        return null;
    }

    public kzf e(kvm kvmVar) {
        ajy ajyVar = new ajy(this, (kqj) null, 2);
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        int i2 = this.c;
        kqn kqnVar = this.a;
        kzd kzdVar = new kzd(kvi.b(kvmVar, kqnVar), ixj.h(i, i2, 4));
        kvp.d(3, ajyVar, kzdVar, kzdVar);
        return kzdVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        kqn kqnVar = this.a;
        if (kqnVar != kqo.a) {
            Objects.toString(kqnVar);
            arrayList.add("context=".concat("EmptyCoroutineContext"));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(a.Y(i, "capacity="));
        }
        if (this.c != 1) {
            "DROP_OLDEST".toString();
            arrayList.add("onBufferOverflow=".concat("DROP_OLDEST"));
        }
        return kvp.a(this) + "[" + ixc.y(arrayList, ", ", null, null, null, 62) + "]";
    }
}
