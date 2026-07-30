package j6;

import java.util.NoSuchElementException;
import kotlin.collections.F;

/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585b extends F {

    /* renamed from: d, reason: collision with root package name */
    public final int f6015d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6016e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6017i;

    /* renamed from: l, reason: collision with root package name */
    public int f6018l;

    public C0585b(int i2, int i5, int i7) {
        this.f6015d = i7;
        this.f6016e = i5;
        boolean z7 = false;
        if (i7 <= 0 ? i2 >= i5 : i2 <= i5) {
            z7 = true;
        }
        this.f6017i = z7;
        this.f6018l = z7 ? i2 : i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6017i;
    }

    @Override // kotlin.collections.F
    public final int nextInt() {
        int i2 = this.f6018l;
        if (i2 != this.f6016e) {
            this.f6018l = this.f6015d + i2;
            return i2;
        }
        if (!this.f6017i) {
            throw new NoSuchElementException();
        }
        this.f6017i = false;
        return i2;
    }
}
