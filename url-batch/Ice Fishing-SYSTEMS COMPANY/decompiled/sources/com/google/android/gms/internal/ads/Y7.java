package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Y7 {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f28792m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final C3235g2 f28793n;

    /* renamed from: a, reason: collision with root package name */
    public Object f28794a = f28792m;

    /* renamed from: b, reason: collision with root package name */
    public C3235g2 f28795b = f28793n;

    /* renamed from: c, reason: collision with root package name */
    public long f28796c;

    /* renamed from: d, reason: collision with root package name */
    public long f28797d;

    /* renamed from: e, reason: collision with root package name */
    public long f28798e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28799f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28800g;

    /* renamed from: h, reason: collision with root package name */
    public C4256z0 f28801h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f28802j;

    /* renamed from: k, reason: collision with root package name */
    public int f28803k;

    /* renamed from: l, reason: collision with root package name */
    public int f28804l;

    static {
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        List list = Collections.EMPTY_LIST;
        C3675oC c3675oC2 = C3675oC.f33115x;
        C3987u1 c3987u1 = C3987u1.f34507a;
        Uri uri = Uri.EMPTY;
        f28793n = new C3235g2("androidx.media3.common.Timeline", new C(), uri != null ? new N0(uri, c3675oC2) : null, new C4256z0(), C3181f3.f30581B);
        String str = AbstractC3548lu.f32613a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(C3235g2 c3235g2, boolean z8, boolean z9, C4256z0 c4256z0, long j9) {
        this.f28794a = f28792m;
        if (c3235g2 == null) {
            c3235g2 = f28793n;
        }
        this.f28795b = c3235g2;
        this.f28796c = com.anythink.basead.exoplayer.b.f6539b;
        this.f28797d = com.anythink.basead.exoplayer.b.f6539b;
        this.f28798e = com.anythink.basead.exoplayer.b.f6539b;
        this.f28799f = z8;
        this.f28800g = z9;
        this.f28801h = c4256z0;
        this.f28802j = j9;
        this.f28803k = 0;
        this.f28804l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f28801h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Y7.class.equals(obj.getClass())) {
            return false;
        }
        Y7 y72 = (Y7) obj;
        return Objects.equals(this.f28794a, y72.f28794a) && Objects.equals(this.f28795b, y72.f28795b) && Objects.equals(this.f28801h, y72.f28801h) && this.f28796c == y72.f28796c && this.f28797d == y72.f28797d && this.f28798e == y72.f28798e && this.f28799f == y72.f28799f && this.f28800g == y72.f28800g && this.i == y72.i && this.f28802j == y72.f28802j && this.f28803k == y72.f28803k && this.f28804l == y72.f28804l;
    }

    public final int hashCode() {
        int hashCode = ((this.f28794a.hashCode() + 217) * 31) + this.f28795b.hashCode();
        C4256z0 c4256z0 = this.f28801h;
        int hashCode2 = ((hashCode * 961) + (c4256z0 == null ? 0 : c4256z0.hashCode())) * 31;
        long j9 = this.f28796c;
        int i = (hashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f28797d;
        int i4 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f28798e;
        int i9 = ((((((i4 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f28799f ? 1 : 0)) * 31) + (this.f28800g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j12 = this.f28802j;
        return ((((((i9 * 961) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f28803k) * 31) + this.f28804l) * 31;
    }
}
