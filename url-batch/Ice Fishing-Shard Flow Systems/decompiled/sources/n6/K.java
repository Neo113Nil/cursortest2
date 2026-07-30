package n6;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class K extends M {

    /* renamed from: i, reason: collision with root package name */
    public final C0775h f7017i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f7018l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o7, long j, C0775h c0775h) {
        super(j);
        this.f7018l = o7;
        this.f7017i = c0775h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7017i.B(this.f7018l, Unit.f6114a);
    }

    @Override // n6.M
    public final String toString() {
        return super.toString() + this.f7017i;
    }
}
