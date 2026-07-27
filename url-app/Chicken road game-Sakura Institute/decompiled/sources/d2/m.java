package d2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final long f6085d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6086e;

    public m(int i2) {
        int i4 = i2 + 1;
        int floor = (int) Math.floor(Math.log(i4) / Math.log(2.0d));
        this.f6086e = floor;
        this.f6085d = (((long) Math.pow(2.0d, floor)) - 1) & i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }
}
