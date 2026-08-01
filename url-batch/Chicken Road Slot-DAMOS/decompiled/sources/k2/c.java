package k2;

import s.l;
import s.w;
import x2.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final w f5370a;

    /* renamed from: b, reason: collision with root package name */
    public long f5371b;

    /* renamed from: c, reason: collision with root package name */
    public long f5372c;

    /* renamed from: d, reason: collision with root package name */
    public long f5373d;

    /* renamed from: e, reason: collision with root package name */
    public long f5374e;

    public c() {
        w wVar = l.f8343a;
        this.f5370a = new w();
        this.f5371b = -1L;
        this.f5372c = 0L;
        this.f5373d = 0L;
    }

    public final boolean a(long j, long j3, float[] fArr, int i3, int i10) {
        boolean z10;
        if (i.a(j3, this.f5372c)) {
            z10 = false;
        } else {
            this.f5372c = j3;
            z10 = true;
        }
        if (!i.a(j, this.f5373d)) {
            this.f5373d = j;
            z10 = true;
        }
        if (fArr != null) {
            z10 = true;
        }
        long j10 = (i3 << 32) | (i10 & 4294967295L);
        if (j10 == this.f5374e) {
            return z10;
        }
        this.f5374e = j10;
        return true;
    }
}
