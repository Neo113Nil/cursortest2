package r0;

import o.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6496g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6496g) {
            case 0:
                int i = this.f6495f;
                this.f6495f = i + 2;
                Object[] objArr = this.f6493d;
                return new t(1, objArr[i], objArr[i + 1]);
            case 1:
                int i8 = this.f6495f;
                this.f6495f = i8 + 2;
                return this.f6493d[i8];
            default:
                int i9 = this.f6495f;
                this.f6495f = i9 + 2;
                return this.f6493d[i9 + 1];
        }
    }
}
