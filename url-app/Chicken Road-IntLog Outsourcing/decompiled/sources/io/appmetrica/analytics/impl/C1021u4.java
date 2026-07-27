package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021u4 extends C0710i3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f9337b;

    public C1021u4(int i2, int i3) {
        super(i3);
        this.f9337b = i2;
    }

    @Override // io.appmetrica.analytics.impl.C0710i3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.f9337b);
        sb.append(", bytesTruncated=");
        return B0.o.k(sb, this.f8378a, '}');
    }
}
