package s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 extends kotlin.collections.m0 {

    /* renamed from: d, reason: collision with root package name */
    public int f8381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f8382e;

    public t0(s0 s0Var) {
        this.f8382e = s0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8381d < this.f8382e.f();
    }

    @Override // kotlin.collections.m0
    public final int nextInt() {
        int i3 = this.f8381d;
        this.f8381d = i3 + 1;
        return this.f8382e.d(i3);
    }
}
