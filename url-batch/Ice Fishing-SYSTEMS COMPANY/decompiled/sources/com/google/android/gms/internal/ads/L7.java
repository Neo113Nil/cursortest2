package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class L7 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f26106a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26107b;

    /* renamed from: c, reason: collision with root package name */
    public int f26108c;

    /* renamed from: d, reason: collision with root package name */
    public long f26109d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26110e;

    /* renamed from: f, reason: collision with root package name */
    public C4071ve f26111f = C4071ve.f34816b;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final void a(Integer num, Object obj, int i, long j9, boolean z8) {
        C4071ve c4071ve = C4071ve.f34816b;
        this.f26106a = num;
        this.f26107b = obj;
        this.f26108c = i;
        this.f26109d = j9;
        this.f26111f = c4071ve;
        this.f26110e = z8;
    }

    public final long b(int i, int i4) {
        C2904a a9 = this.f26111f.a(i);
        return a9.f29138a != -1 ? a9.f29142e[i4] : com.anythink.basead.exoplayer.b.f6539b;
    }

    public final void c(int i) {
        this.f26111f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !L7.class.equals(obj.getClass())) {
            return false;
        }
        L7 l72 = (L7) obj;
        return Objects.equals(this.f26106a, l72.f26106a) && Objects.equals(this.f26107b, l72.f26107b) && this.f26108c == l72.f26108c && this.f26109d == l72.f26109d && this.f26110e == l72.f26110e && Objects.equals(this.f26111f, l72.f26111f);
    }

    public final int hashCode() {
        Integer num = this.f26106a;
        int hashCode = num == null ? 0 : num.hashCode();
        Object obj = this.f26107b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.f26108c;
        long j9 = this.f26109d;
        return (this.f26111f.hashCode() + (((((hashCode2 * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 961) + (this.f26110e ? 1 : 0)) * 31)) * 31;
    }
}
