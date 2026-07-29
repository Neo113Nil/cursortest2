package b.a.c;

import b.ad;
import b.s;
import b.v;
import com.aiming.mdt.utils.Constants;

/* compiled from: RealResponseBody.java */
/* loaded from: classes.dex */
public final class h extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final s f1869a;

    /* renamed from: b, reason: collision with root package name */
    private final c.e f1870b;

    public h(s sVar, c.e eVar) {
        this.f1869a = sVar;
        this.f1870b = eVar;
    }

    @Override // b.ad
    public v a() {
        String a2 = this.f1869a.a(Constants.KEY_CONTENT_TYPE);
        if (a2 != null) {
            return v.a(a2);
        }
        return null;
    }

    @Override // b.ad
    public long b() {
        return e.a(this.f1869a);
    }

    @Override // b.ad
    public c.e c() {
        return this.f1870b;
    }
}
