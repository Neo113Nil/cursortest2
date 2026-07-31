package r0;

import l1.w;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: g, reason: collision with root package name */
    public final w f6497g;

    public m(w wVar) {
        this.f6497g = wVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6495f;
        this.f6495f = i + 2;
        Object[] objArr = this.f6493d;
        return new a(this.f6497g, objArr[i], objArr[i + 1]);
    }
}
