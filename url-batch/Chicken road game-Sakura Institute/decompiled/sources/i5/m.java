package i5;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public final long f4951f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4952g;

    public m(int i7) {
        int i8 = i7 + 1;
        int floor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
        this.f4952g = floor;
        this.f4951f = (((long) Math.pow(2.0d, floor)) - 1) & i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }
}
