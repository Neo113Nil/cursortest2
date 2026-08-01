package androidx.lifecycle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f749d;

    public z(b0 b0Var) {
        this.f749d = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f749d.f666a) {
            obj = this.f749d.f669d;
            this.f749d.f669d = b0.f665i;
        }
        this.f749d.b(obj);
    }
}
