package u0;

import s.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9598r;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9598r) {
            case 0:
                int i3 = this.f9597i;
                this.f9597i = i3 + 2;
                Object[] objArr = this.f9595d;
                return new s(1, objArr[i3], objArr[i3 + 1]);
            case 1:
                int i10 = this.f9597i;
                this.f9597i = i10 + 2;
                return this.f9595d[i10];
            default:
                int i11 = this.f9597i;
                this.f9597i = i11 + 2;
                return this.f9595d[i11 + 1];
        }
    }
}
