package g2;

import M1.z;
import java.util.Iterator;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406b implements InterfaceC0410f, InterfaceC0407c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0410f f4840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4841b;

    public C0406b(InterfaceC0410f interfaceC0410f, int i3) {
        this.f4840a = interfaceC0410f;
        this.f4841b = i3;
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
    }

    @Override // g2.InterfaceC0407c
    public final InterfaceC0410f a(int i3) {
        int i4 = this.f4841b + i3;
        return i4 < 0 ? new C0406b(this, i3) : new C0406b(this.f4840a, i4);
    }

    @Override // g2.InterfaceC0410f
    public final Iterator iterator() {
        return new z(this);
    }
}
