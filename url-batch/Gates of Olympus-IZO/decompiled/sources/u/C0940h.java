package u;

import H2.AbstractC0080b;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8067b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0946n f8068c;

    public C0940h(int i3, int i4, InterfaceC0946n interfaceC0946n) {
        this.f8066a = i3;
        this.f8067b = i4;
        this.f8068c = interfaceC0946n;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("startIndex should be >= 0, but was ", i3).toString());
        }
        if (i4 <= 0) {
            throw new IllegalArgumentException(AbstractC0080b.h("size should be >0, but was ", i4).toString());
        }
    }
}
