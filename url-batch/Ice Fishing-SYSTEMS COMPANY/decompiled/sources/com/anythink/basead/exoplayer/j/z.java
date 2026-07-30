package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f8434a;

    /* renamed from: b, reason: collision with root package name */
    private final g f8435b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8436c;

    /* renamed from: d, reason: collision with root package name */
    private long f8437d;

    public z(h hVar, g gVar) {
        this.f8434a = (h) C0544a.a(hVar);
        this.f8435b = (g) C0544a.a(gVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        long a9 = this.f8434a.a(kVar);
        this.f8437d = a9;
        if (a9 == 0) {
            return 0L;
        }
        if (kVar.f8298g == -1 && a9 != -1) {
            kVar = new k(kVar.f8294c, kVar.f8296e, kVar.f8297f, a9, kVar.f8299h, kVar.i);
        }
        this.f8436c = true;
        this.f8435b.a(kVar);
        return this.f8437d;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        try {
            this.f8434a.b();
        } finally {
            if (this.f8436c) {
                this.f8436c = false;
                this.f8435b.a();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (this.f8437d == 0) {
            return -1;
        }
        int a9 = this.f8434a.a(bArr, i, i4);
        if (a9 > 0) {
            this.f8435b.a(bArr, i, a9);
            long j9 = this.f8437d;
            if (j9 != -1) {
                this.f8437d = j9 - a9;
            }
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8434a.a();
    }
}
