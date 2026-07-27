package W2;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class O extends Q {

    /* renamed from: i, reason: collision with root package name */
    public final C0286h f4230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T f4231j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(T t4, long j4, C0286h c0286h) {
        super(j4);
        this.f4231j = t4;
        this.f4230i = c0286h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4230i.E(this.f4231j, Unit.f7487a);
    }

    @Override // W2.Q
    public final String toString() {
        return super.toString() + this.f4230i;
    }
}
