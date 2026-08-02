package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kwi implements Runnable, Comparable, kwc, ldh {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public kwi(long j) {
        this.b = j;
    }

    @Override // defpackage.ldh
    public final int b() {
        return this.a;
    }

    @Override // defpackage.kwc
    public final void bQ() {
        synchronized (this) {
            Object obj = this._heap;
            if (obj != kwl.a) {
                kwj kwjVar = obj instanceof kwj ? (kwj) obj : null;
                if (kwjVar != null) {
                    synchronized (kwjVar) {
                        if (c() != null) {
                            int b = b();
                            boolean z = kvo.a;
                            kwjVar.d(b);
                        }
                    }
                }
                this._heap = kwl.a;
            }
        }
    }

    @Override // defpackage.ldh
    public final ldg c() {
        Object obj = this._heap;
        if (obj instanceof ldg) {
            return (ldg) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((kwi) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.ldh
    public final void d(ldg ldgVar) {
        if (this._heap == kwl.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = ldgVar;
    }

    @Override // defpackage.ldh
    public final void e(int i) {
        this.a = i;
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
