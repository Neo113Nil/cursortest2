package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxo implements kqx {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    public kxo(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.kqx
    public final StackTraceElement f() {
        return (StackTraceElement) this.b.get(this.a);
    }

    @Override // defpackage.kqx
    public final kqx g() {
        return ixi.d(this.b, this.a + 1);
    }
}
