package i;

import z2.AbstractC1409M;

/* loaded from: classes.dex */
public final class I extends AbstractC1409M {

    /* renamed from: d, reason: collision with root package name */
    public int f6900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f6901e;

    public I(H h4) {
        this.f6901e = h4;
    }

    @Override // z2.AbstractC1409M
    public final int b() {
        int i2 = this.f6900d;
        this.f6900d = i2 + 1;
        return this.f6901e.c(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6900d < this.f6901e.e();
    }
}
