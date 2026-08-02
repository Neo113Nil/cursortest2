package b0;

import T.T;
import java.util.Objects;
import q0.C1353B;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5257a;

    /* renamed from: b, reason: collision with root package name */
    public final T f5258b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5259c;

    /* renamed from: d, reason: collision with root package name */
    public final C1353B f5260d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5261e;

    /* renamed from: f, reason: collision with root package name */
    public final T f5262f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5263g;

    /* renamed from: h, reason: collision with root package name */
    public final C1353B f5264h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5265i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5266j;

    public C0255a(long j4, T t4, int i4, C1353B c1353b, long j5, T t5, int i5, C1353B c1353b2, long j6, long j7) {
        this.f5257a = j4;
        this.f5258b = t4;
        this.f5259c = i4;
        this.f5260d = c1353b;
        this.f5261e = j5;
        this.f5262f = t5;
        this.f5263g = i5;
        this.f5264h = c1353b2;
        this.f5265i = j6;
        this.f5266j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0255a.class == obj.getClass()) {
            C0255a c0255a = (C0255a) obj;
            if (this.f5257a == c0255a.f5257a && this.f5259c == c0255a.f5259c && this.f5261e == c0255a.f5261e && this.f5263g == c0255a.f5263g && this.f5265i == c0255a.f5265i && this.f5266j == c0255a.f5266j && Objects.equals(this.f5258b, c0255a.f5258b) && Objects.equals(this.f5260d, c0255a.f5260d) && Objects.equals(this.f5262f, c0255a.f5262f) && Objects.equals(this.f5264h, c0255a.f5264h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5257a), this.f5258b, Integer.valueOf(this.f5259c), this.f5260d, Long.valueOf(this.f5261e), this.f5262f, Integer.valueOf(this.f5263g), this.f5264h, Long.valueOf(this.f5265i), Long.valueOf(this.f5266j));
    }
}
