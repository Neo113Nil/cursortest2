package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class fd extends qd {

    /* renamed from: i, reason: collision with root package name */
    private List<Long> f5086i;

    public fd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", j8Var, i7, 31);
        this.f5086i = null;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        this.f10653e.I(-1L);
        this.f10653e.E(-1L);
        if (this.f5086i == null) {
            this.f5086i = (List) this.f10654f.invoke(null, this.f10650b.b());
        }
        List<Long> list = this.f5086i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f10653e) {
            this.f10653e.I(this.f5086i.get(0).longValue());
            this.f10653e.E(this.f5086i.get(1).longValue());
        }
    }
}
