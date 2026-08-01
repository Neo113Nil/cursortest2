package ge;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 extends g1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4379s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4380t;

    public /* synthetic */ n0(int i3, Object obj) {
        this.f4379s = i3;
        this.f4380t = obj;
    }

    @Override // ge.g1
    public final boolean k() {
        switch (this.f4379s) {
        }
        return false;
    }

    @Override // ge.g1
    public final void l(Throwable th) {
        int i3 = this.f4379s;
        Object obj = this.f4380t;
        switch (i3) {
            case 0:
                ((m0) obj).a();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                Object obj2 = k1.f4374d.get(j());
                h1 h1Var = (h1) obj;
                if (!(obj2 instanceof q)) {
                    hd.l lVar = hd.n.f4511e;
                    h1Var.resumeWith(a0.A(obj2));
                    break;
                } else {
                    hd.l lVar2 = hd.n.f4511e;
                    h1Var.resumeWith(cf.c.n(((q) obj2).f4394a));
                    break;
                }
        }
    }
}
