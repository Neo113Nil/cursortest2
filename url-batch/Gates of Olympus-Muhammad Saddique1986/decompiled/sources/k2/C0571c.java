package k2;

import S1.A;
import java.util.NoSuchElementException;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571c extends A {

    /* renamed from: d, reason: collision with root package name */
    public final int f6422d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6423e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6424f;

    /* renamed from: g, reason: collision with root package name */
    public int f6425g;

    public C0571c(int i3, int i4, int i5) {
        this.f6422d = i5;
        this.f6423e = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f6424f = z3;
        this.f6425g = z3 ? i3 : i4;
    }

    @Override // S1.A
    public final int a() {
        int i3 = this.f6425g;
        if (i3 != this.f6423e) {
            this.f6425g = this.f6422d + i3;
        } else {
            if (!this.f6424f) {
                throw new NoSuchElementException();
            }
            this.f6424f = false;
        }
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6424f;
    }
}
