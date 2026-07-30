package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class hw implements Runnable, Comparable, rs {
    private volatile Object _heap;
    public long d;
    public int e = -1;

    public hw(long j) {
        this.d = j;
    }

    @Override // defpackage.rs
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                fv fvVar = op.e;
                if (obj == fvVar) {
                    return;
                }
                iw iwVar = obj instanceof iw ? (iw) obj : null;
                if (iwVar != null) {
                    synchronized (iwVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof ei1 ? (ei1) obj2 : null) != null) {
                            iwVar.b(this.e);
                        }
                    }
                }
                this._heap = fvVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, iw iwVar, jw jwVar) {
        synchronized (this) {
            if (this._heap == op.e) {
                return 2;
            }
            synchronized (iwVar) {
                try {
                    hw[] hwVarArr = iwVar.a;
                    hw hwVar = hwVarArr != null ? hwVarArr[0] : null;
                    if (jw.m.get(jwVar) != 0) {
                        return 1;
                    }
                    if (hwVar == null) {
                        iwVar.c = j;
                    } else {
                        long j2 = hwVar.d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - iwVar.c > 0) {
                            iwVar.c = j;
                        }
                    }
                    long j3 = this.d;
                    long j4 = iwVar.c;
                    if (j3 - j4 < 0) {
                        this.d = j4;
                    }
                    iwVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.d - ((hw) obj).d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(iw iwVar) {
        if (this._heap != op.e) {
            this._heap = iwVar;
        } else {
            dd0.e("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.d + ']';
    }
}
