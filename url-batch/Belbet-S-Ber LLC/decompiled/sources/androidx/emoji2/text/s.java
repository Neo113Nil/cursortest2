package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f467a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final w f468b;

    /* renamed from: c, reason: collision with root package name */
    public w f469c;
    public w d;

    /* renamed from: e, reason: collision with root package name */
    public int f470e;

    /* renamed from: f, reason: collision with root package name */
    public int f471f;

    public s(w wVar) {
        this.f468b = wVar;
        this.f469c = wVar;
    }

    public final void a() {
        this.f467a = 1;
        this.f469c = this.f468b;
        this.f471f = 0;
    }

    public final boolean b() {
        w0.a b2 = this.f469c.f482b.b();
        int a5 = b2.a(6);
        return !(a5 == 0 || ((ByteBuffer) b2.d).get(a5 + b2.f2771a) == 0) || this.f470e == 65039;
    }
}
