package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afa implements afd {
    final aez a;
    public final afd b;
    int c = -1;

    public afa(aez aezVar, afd afdVar) {
        this.a = aezVar;
        this.b = afdVar;
    }

    @Override // defpackage.afd
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.e(this);
    }
}
