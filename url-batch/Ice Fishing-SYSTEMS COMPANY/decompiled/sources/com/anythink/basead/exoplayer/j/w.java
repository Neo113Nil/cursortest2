package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class w implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f8420a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.v f8421b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8422c;

    public w(h hVar, com.anythink.basead.exoplayer.k.v vVar, int i) {
        this.f8420a = (h) C0544a.a(hVar);
        this.f8421b = (com.anythink.basead.exoplayer.k.v) C0544a.a(vVar);
        this.f8422c = i;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        this.f8421b.a(this.f8422c);
        return this.f8420a.a(kVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8420a.b();
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        this.f8421b.a(this.f8422c);
        return this.f8420a.a(bArr, i, i4);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8420a.a();
    }
}
