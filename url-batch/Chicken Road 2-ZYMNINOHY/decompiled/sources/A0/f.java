package A0;

import W.AbstractC0108a;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f29a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34f;

    public f(int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f29a = i4;
        this.f30b = i5;
        this.f31c = i6;
        this.f32d = i7;
        this.f33e = i8;
        this.f34f = i9;
    }

    public final int a() {
        int i4 = this.f29a;
        if (i4 == 1935960438) {
            return 2;
        }
        if (i4 == 1935963489) {
            return 1;
        }
        if (i4 == 1937012852) {
            return 3;
        }
        AbstractC0108a.s("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i4));
        return -1;
    }

    @Override // A0.a
    public final int getType() {
        return 1752331379;
    }
}
