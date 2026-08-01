package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t extends kr {
    @Override // defpackage.kr
    public final void R(u uVar, u uVar2) {
        uVar.b = uVar2;
    }

    @Override // defpackage.kr
    public final void S(u uVar, Thread thread) {
        uVar.a = thread;
    }

    @Override // defpackage.kr
    public final boolean d(v vVar, r rVar) {
        r rVar2 = r.b;
        synchronized (vVar) {
            try {
                if (vVar.g != rVar) {
                    return false;
                }
                vVar.g = rVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kr
    public final boolean e(v vVar, Object obj, Object obj2) {
        synchronized (vVar) {
            try {
                if (vVar.f != obj) {
                    return false;
                }
                vVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kr
    public final boolean f(v vVar, u uVar, u uVar2) {
        synchronized (vVar) {
            try {
                if (vVar.h != uVar) {
                    return false;
                }
                vVar.h = uVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
