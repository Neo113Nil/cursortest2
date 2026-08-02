package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ehl implements fe {
    private final WeakReference a;

    public ehl(kr krVar) {
        this.a = new WeakReference(krVar);
    }

    @Override // defpackage.fe
    public final void a(int i, int i2) {
        kr krVar = (kr) this.a.get();
        if (krVar != null) {
            krVar.h(i, i2);
        }
    }

    @Override // defpackage.fe
    public final void b(int i, int i2) {
        kr krVar = (kr) this.a.get();
        if (krVar != null) {
            krVar.g(i, i2);
        }
    }

    @Override // defpackage.fe
    public final void c(int i, int i2) {
        kr krVar = (kr) this.a.get();
        if (krVar != null) {
            krVar.i(i, i2);
        }
    }

    @Override // defpackage.fe
    public final void d(int i, int i2) {
        kr krVar = (kr) this.a.get();
        if (krVar != null) {
            krVar.p(i, i2);
        }
    }
}
