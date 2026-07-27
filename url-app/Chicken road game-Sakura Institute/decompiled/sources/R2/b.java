package R2;

import java.util.NoSuchElementException;
import z2.AbstractC1409M;

/* loaded from: classes.dex */
public final class b extends AbstractC1409M {

    /* renamed from: d, reason: collision with root package name */
    public final int f3945d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3946e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3947i;

    /* renamed from: j, reason: collision with root package name */
    public int f3948j;

    public b(int i2, int i4, int i5) {
        this.f3945d = i5;
        this.f3946e = i4;
        boolean z4 = false;
        if (i5 <= 0 ? i2 >= i4 : i2 <= i4) {
            z4 = true;
        }
        this.f3947i = z4;
        this.f3948j = z4 ? i2 : i4;
    }

    @Override // z2.AbstractC1409M
    public final int b() {
        int i2 = this.f3948j;
        if (i2 != this.f3946e) {
            this.f3948j = this.f3945d + i2;
        } else {
            if (!this.f3947i) {
                throw new NoSuchElementException();
            }
            this.f3947i = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3947i;
    }
}
