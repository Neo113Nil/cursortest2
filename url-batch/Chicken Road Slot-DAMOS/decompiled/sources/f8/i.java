package f8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends i7.a {
    @Override // i7.a
    public final f L(r rVar) {
        f fVar;
        f fVar2 = f.f4136d;
        synchronized (rVar) {
            try {
                fVar = rVar.f4175e;
                if (fVar != fVar2) {
                    rVar.f4175e = fVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // i7.a
    public final q M(r rVar) {
        q qVar;
        q qVar2 = q.f4165c;
        synchronized (rVar) {
            try {
                qVar = rVar.f4176i;
                if (qVar != qVar2) {
                    rVar.f4176i = qVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // i7.a
    public final void Y(q qVar, q qVar2) {
        qVar.f4167b = qVar2;
    }

    @Override // i7.a
    public final void Z(q qVar, Thread thread) {
        qVar.f4166a = thread;
    }

    @Override // i7.a
    public final boolean q(r rVar, f fVar, f fVar2) {
        synchronized (rVar) {
            try {
                if (rVar.f4175e != fVar) {
                    return false;
                }
                rVar.f4175e = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i7.a
    public final boolean r(r rVar, Object obj, Object obj2) {
        synchronized (rVar) {
            try {
                if (rVar.f4174d != obj) {
                    return false;
                }
                rVar.f4174d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i7.a
    public final boolean s(r rVar, q qVar, q qVar2) {
        synchronized (rVar) {
            try {
                if (rVar.f4176i != qVar) {
                    return false;
                }
                rVar.f4176i = qVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
