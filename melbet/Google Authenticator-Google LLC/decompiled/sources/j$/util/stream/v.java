package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class v extends CountedCompleter {
    public final l a;
    public final int b;

    public v(l lVar) {
        this.a = lVar;
        this.b = 0;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.f() != 0) {
            this.setPendingCount(this.a.f() - 1);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int f = this.a.f() - 1;
                i = this.b;
                if (i2 < f) {
                    u uVar = (u) this;
                    u uVar2 = new u(uVar, uVar.a.e(i2), i + i3);
                    i3 = (int) (uVar2.a.count() + i3);
                    uVar2.fork();
                    i2++;
                }
            }
            u uVar3 = (u) this;
            this = new u(uVar3, uVar3.a.e(i2), i + i3);
        }
        u uVar4 = (u) this;
        uVar4.a.a(uVar4.c, uVar4.b);
        this.propagateCompletion();
    }

    public v(u uVar, l lVar, int i) {
        super(uVar);
        this.a = lVar;
        this.b = i;
    }
}
