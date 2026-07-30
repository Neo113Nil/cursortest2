package w6;

import e6.b0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public final int f9524f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9525g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9526h;

    /* renamed from: i, reason: collision with root package name */
    public int f9527i;

    public c(int i7, int i8, int i9) {
        this.f9524f = i9;
        this.f9525g = i8;
        boolean z8 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z8 = true;
        }
        this.f9526h = z8;
        this.f9527i = z8 ? i7 : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9526h;
    }

    @Override // e6.b0
    public final int nextInt() {
        int i7 = this.f9527i;
        if (i7 != this.f9525g) {
            this.f9527i = this.f9524f + i7;
            return i7;
        }
        if (!this.f9526h) {
            throw new NoSuchElementException();
        }
        this.f9526h = false;
        return i7;
    }
}
