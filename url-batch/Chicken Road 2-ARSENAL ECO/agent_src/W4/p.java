package W4;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* loaded from: classes.dex */
public class p implements c4.i, c4.m, c4.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2820f;

    /* renamed from: g, reason: collision with root package name */
    public final m f2821g;

    public p(v vVar, String str, int i7) {
        this.f2820f = i7;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f2821g = new m(str, n.f2814f, 1, vVar);
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f2821g = new m(str, n.f2815g, 1, vVar);
                break;
            default:
                this.f2821g = new m(str, n.f2818j, 2, vVar);
                break;
        }
    }

    @Override // c4.p
    /* renamed from: a, reason: collision with other method in class */
    public c4.p mo0a(String str) {
        this.f2821g.f2809d = str;
        return this;
    }

    @Override // c4.i
    public c4.n b() {
        m mVar = this.f2821g;
        return new q((v) mVar.f2811f, mVar.f2807b, mVar.f2809d, mVar.f2810e, (V5.g) mVar.f2813h);
    }

    @Override // c4.p
    /* renamed from: c, reason: collision with other method in class */
    public c4.p mo2c(String str) {
        this.f2821g.f2810e = str;
        return this;
    }

    @Override // c4.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s build() {
        return (s) this.f2821g.b(new B1.g(18));
    }

    public final String toString() {
        switch (this.f2820f) {
            case 0:
                return this.f2821g.d(getClass().getSimpleName());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return this.f2821g.d(getClass().getSimpleName());
            default:
                return this.f2821g.d(getClass().getSimpleName());
        }
    }

    /* renamed from: build, reason: collision with other method in class */
    public c4.o mo1build() {
        return (c4.o) this.f2821g.b(new B1.g(19));
    }

    @Override // c4.m
    public c4.m a(String str) {
        this.f2821g.f2809d = str;
        return this;
    }

    @Override // c4.m
    public c4.m c(String str) {
        this.f2821g.f2810e = str;
        return this;
    }
}
