package l2;

import java.util.NoSuchElementException;
import kotlin.collections.F;

/* loaded from: classes3.dex */
public final class d extends F {

    /* renamed from: b, reason: collision with root package name */
    private final long f41331b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41332c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41333d;

    /* renamed from: e, reason: collision with root package name */
    private long f41334e;

    public d(long j4, long j5, long j6) {
        this.f41331b = j6;
        this.f41332c = j5;
        boolean z4 = false;
        if (j6 <= 0 ? j4 >= j5 : j4 <= j5) {
            z4 = true;
        }
        this.f41333d = z4;
        this.f41334e = z4 ? j4 : j5;
    }

    @Override // kotlin.collections.F
    public long a() {
        long j4 = this.f41334e;
        if (j4 != this.f41332c) {
            this.f41334e = this.f41331b + j4;
            return j4;
        }
        if (!this.f41333d) {
            throw new NoSuchElementException();
        }
        this.f41333d = false;
        return j4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41333d;
    }
}
