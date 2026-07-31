package v6;

import d6.x;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends x {

    /* renamed from: d, reason: collision with root package name */
    public final int f7495d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7497f;

    /* renamed from: g, reason: collision with root package name */
    public int f7498g;

    public c(int i, int i8, int i9) {
        this.f7495d = i9;
        this.f7496e = i8;
        boolean z3 = false;
        if (i9 <= 0 ? i >= i8 : i <= i8) {
            z3 = true;
        }
        this.f7497f = z3;
        this.f7498g = z3 ? i : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7497f;
    }

    @Override // d6.x
    public final int nextInt() {
        int i = this.f7498g;
        if (i != this.f7496e) {
            this.f7498g = this.f7495d + i;
            return i;
        }
        if (!this.f7497f) {
            throw new NoSuchElementException();
        }
        this.f7497f = false;
        return i;
    }
}
