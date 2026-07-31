package a0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f112a;

    public l(int i) {
        switch (i) {
            case 1:
                this.f112a = new o0.e(new u.f[16]);
                break;
            default:
                this.f112a = new o0.e(new k[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        o0.e eVar = this.f112a;
        int i = eVar.f5580f;
        a7.f[] fVarArr = new a7.f[i];
        for (int i8 = 0; i8 < i; i8++) {
            fVarArr[i8] = ((u.f) eVar.f5578d[i8]).f6975b;
        }
        for (int i9 = 0; i9 < i; i9++) {
            fVarArr[i9].m(cancellationException);
        }
        if (eVar.f5580f == 0) {
            return;
        }
        w.a.c("uncancelled requests present");
    }

    public void b() {
        o0.e eVar = this.f112a;
        v6.d u02 = r2.o.u0(0, eVar.f5580f);
        int i = u02.f7492d;
        int i8 = u02.f7493e;
        if (i <= i8) {
            while (true) {
                ((u.f) eVar.f5578d[i]).f6975b.k(c6.m.f1757a);
                if (i == i8) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eVar.g();
    }
}
