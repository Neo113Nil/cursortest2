package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfe extends hea {
    public hik a;
    public boolean b = false;
    public boolean c = false;

    public hfe(int i) {
        this.a = new hik(i);
    }

    public final hfh a() {
        hik hikVar = this.a;
        hikVar.getClass();
        if (hikVar.c == 0) {
            return hja.a;
        }
        if (this.c) {
            this.a = new hik(hikVar);
            this.c = false;
        }
        this.b = true;
        return new hja(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Iterable iterable) {
        hik hikVar = this.a;
        hikVar.getClass();
        if (!(iterable instanceof hic)) {
            super.e(iterable);
            return;
        }
        hik hikVar2 = iterable instanceof hja ? ((hja) iterable).b : null;
        if (hikVar2 != null) {
            hikVar.i(Math.max(hikVar.c, hikVar2.c));
            for (int a = hikVar2.a(); a >= 0; a = hikVar2.e(a)) {
                d(hikVar2.h(a), hikVar2.c(a));
            }
            return;
        }
        Set j = iterable.j();
        hik hikVar3 = this.a;
        hikVar3.i(Math.max(hikVar3.c, j.size()));
        for (hid hidVar : iterable.j()) {
            d(hidVar.a, hidVar.a());
        }
    }

    @Override // defpackage.hea
    public final /* synthetic */ void c(Object obj) {
        d(obj, 1);
    }

    public final void d(Object obj, int i) {
        hik hikVar = this.a;
        hikVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new hik(hikVar);
            this.c = false;
        }
        this.b = false;
        obj.getClass();
        hik hikVar2 = this.a;
        hikVar2.o(obj, i + hikVar2.b(obj));
    }
}
