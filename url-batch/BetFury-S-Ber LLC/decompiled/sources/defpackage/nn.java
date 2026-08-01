package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class nn implements Runnable, Comparable, nk {
    private volatile Object _heap;
    public long f;
    public int g;

    @Override // defpackage.nk
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                lm lmVar = gk0.e;
                if (obj == lmVar) {
                    return;
                }
                on onVar = obj instanceof on ? (on) obj : null;
                if (onVar != null) {
                    synchronized (onVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof ci0 ? (ci0) obj2 : null) != null) {
                            onVar.b(this.g);
                        }
                    }
                }
                this._heap = lmVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, on onVar, pn pnVar) {
        synchronized (this) {
            if (this._heap == gk0.e) {
                return 2;
            }
            synchronized (onVar) {
                try {
                    nn[] nnVarArr = onVar.a;
                    nn nnVar = nnVarArr != null ? nnVarArr[0] : null;
                    if (pn.n.get(pnVar) != 0) {
                        return 1;
                    }
                    if (nnVar == null) {
                        onVar.c = j;
                    } else {
                        long j2 = nnVar.f;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - onVar.c > 0) {
                            onVar.c = j;
                        }
                    }
                    long j3 = this.f;
                    long j4 = onVar.c;
                    if (j3 - j4 < 0) {
                        this.f = j4;
                    }
                    onVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f - ((nn) obj).f;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(on onVar) {
        if (this._heap != gk0.e) {
            this._heap = onVar;
        } else {
            s9.k("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f + ']';
    }
}
