package u0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: r, reason: collision with root package name */
    public final kotlin.collections.h f9599r;

    public l(kotlin.collections.h hVar) {
        this.f9599r = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f9597i;
        this.f9597i = i3 + 2;
        Object[] objArr = this.f9595d;
        return new a(this.f9599r, objArr[i3], objArr[i3 + 1]);
    }
}
