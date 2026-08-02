package r0;

import java.util.NoSuchElementException;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1391b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final long f15116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15117b;

    /* renamed from: c, reason: collision with root package name */
    public long f15118c;

    public AbstractC1391b(long j4, long j5) {
        this.f15116a = j4;
        this.f15117b = j5;
        this.f15118c = j4 - 1;
    }

    public final void a() {
        long j4 = this.f15118c;
        if (j4 < this.f15116a || j4 > this.f15117b) {
            throw new NoSuchElementException();
        }
    }

    @Override // r0.n
    public final boolean next() {
        long j4 = this.f15118c + 1;
        this.f15118c = j4;
        return !(j4 > this.f15117b);
    }
}
