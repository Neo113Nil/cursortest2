package m2;

import S1.z;
import java.util.Iterator;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652b implements InterfaceC0656f, InterfaceC0653c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0656f f6995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6996b;

    public C0652b(InterfaceC0656f interfaceC0656f, int i3) {
        this.f6995a = interfaceC0656f;
        this.f6996b = i3;
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
    }

    @Override // m2.InterfaceC0653c
    public final InterfaceC0656f a(int i3) {
        int i4 = this.f6996b + i3;
        return i4 < 0 ? new C0652b(this, i3) : new C0652b(this.f6995a, i4);
    }

    @Override // m2.InterfaceC0656f
    public final Iterator iterator() {
        return new z(this);
    }
}
