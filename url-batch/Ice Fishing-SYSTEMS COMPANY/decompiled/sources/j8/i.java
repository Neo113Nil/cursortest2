package j8;

import e8.q;
import e8.y;
import u8.r;

/* loaded from: classes2.dex */
public final class i extends y {

    /* renamed from: u, reason: collision with root package name */
    public final String f38602u;

    /* renamed from: v, reason: collision with root package name */
    public final long f38603v;

    /* renamed from: w, reason: collision with root package name */
    public final r f38604w;

    public i(String str, long j9, r rVar) {
        this.f38602u = str;
        this.f38603v = j9;
        this.f38604w = rVar;
    }

    @Override // e8.y
    public final long b() {
        return this.f38603v;
    }

    @Override // e8.y
    public final q j() {
        String str = this.f38602u;
        if (str == null) {
            return null;
        }
        M7.i iVar = q.f37445b;
        try {
            return com.bumptech.glide.e.n(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // e8.y
    public final u8.g z() {
        return this.f38604w;
    }
}
