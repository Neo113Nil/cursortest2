package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cof implements Runnable {
    private WeakReference a;
    private cng b;
    private final int c;
    private final cbp d;

    public cof(coc cocVar, cbp cbpVar, cng cngVar, int i) {
        this.a = new WeakReference(cocVar);
        this.d = cbpVar;
        this.b = cngVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            WeakReference weakReference = this.a;
            coc cocVar = weakReference != null ? (coc) weakReference.get() : null;
            cng cngVar = this.b;
            if (cocVar != null && cngVar != null) {
                int i = this.c;
                cog cogVar = cocVar.k;
                oy.an(cogVar.o);
                try {
                    if (cngVar.d) {
                        cogVar.i().b(i);
                        cngVar.d = false;
                    }
                    cocVar.m(cngVar);
                } catch (Throwable th) {
                    cocVar.m(cngVar);
                    throw th;
                }
            } else if (cngVar != null && cngVar.d) {
                this.d.b(this.c);
                cngVar.d = false;
            }
        } finally {
            this.a = null;
            this.b = null;
        }
    }
}
