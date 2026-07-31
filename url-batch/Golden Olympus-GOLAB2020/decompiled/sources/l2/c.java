package l2;

import java.util.NoSuchElementException;
import kotlin.collections.E;

/* loaded from: classes3.dex */
public final class c extends E {

    /* renamed from: b, reason: collision with root package name */
    private final int f41327b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41328c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41329d;

    /* renamed from: e, reason: collision with root package name */
    private int f41330e;

    public c(int i4, int i5, int i6) {
        this.f41327b = i6;
        this.f41328c = i5;
        boolean z4 = false;
        if (i6 <= 0 ? i4 >= i5 : i4 <= i5) {
            z4 = true;
        }
        this.f41329d = z4;
        this.f41330e = z4 ? i4 : i5;
    }

    @Override // kotlin.collections.E
    public int a() {
        int i4 = this.f41330e;
        if (i4 != this.f41328c) {
            this.f41330e = this.f41327b + i4;
            return i4;
        }
        if (!this.f41329d) {
            throw new NoSuchElementException();
        }
        this.f41329d = false;
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41329d;
    }
}
