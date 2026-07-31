package e2;

import M1.A;
import java.util.NoSuchElementException;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379c extends A {

    /* renamed from: d, reason: collision with root package name */
    public final int f4771d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4772e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4773f;

    /* renamed from: g, reason: collision with root package name */
    public int f4774g;

    public C0379c(int i3, int i4, int i5) {
        this.f4771d = i5;
        this.f4772e = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f4773f = z3;
        this.f4774g = z3 ? i3 : i4;
    }

    @Override // M1.A
    public final int a() {
        int i3 = this.f4774g;
        if (i3 != this.f4772e) {
            this.f4774g = this.f4771d + i3;
        } else {
            if (!this.f4773f) {
                throw new NoSuchElementException();
            }
            this.f4773f = false;
        }
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4773f;
    }
}
