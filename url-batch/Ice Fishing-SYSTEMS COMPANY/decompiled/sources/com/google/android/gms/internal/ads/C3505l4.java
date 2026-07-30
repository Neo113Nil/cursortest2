package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3505l4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3448k1 f32530a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32531b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32533d;

    /* renamed from: e, reason: collision with root package name */
    public int f32534e;

    /* renamed from: f, reason: collision with root package name */
    public int f32535f;

    /* renamed from: g, reason: collision with root package name */
    public long f32536g;

    /* renamed from: h, reason: collision with root package name */
    public long f32537h;

    public C3505l4(InterfaceC3448k1 interfaceC3448k1) {
        this.f32530a = interfaceC3448k1;
    }

    public final void a(byte[] bArr, int i, int i4) {
        if (this.f32532c) {
            int i9 = this.f32535f;
            int i10 = (i + 1) - i9;
            if (i10 >= i4) {
                this.f32535f = (i4 - i) + i9;
            } else {
                this.f32533d = ((bArr[i10] & 192) >> 6) == 0;
                this.f32532c = false;
            }
        }
    }

    public final void b(int i, long j9, boolean z8) {
        PA.T(this.f32537h != com.anythink.basead.exoplayer.b.f6539b);
        if (this.f32534e == 182 && z8 && this.f32531b) {
            long j10 = j9 - this.f32536g;
            this.f32530a.b(this.f32537h, this.f32533d ? 1 : 0, (int) j10, i, null);
        }
        if (this.f32534e != 179) {
            this.f32536g = j9;
        }
    }
}
