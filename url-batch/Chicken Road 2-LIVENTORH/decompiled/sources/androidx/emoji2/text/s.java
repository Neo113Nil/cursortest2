package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f348a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final w f349b;

    /* renamed from: c, reason: collision with root package name */
    public w f350c;
    public w d;

    /* renamed from: e, reason: collision with root package name */
    public int f351e;

    /* renamed from: f, reason: collision with root package name */
    public int f352f;

    public s(w wVar) {
        this.f349b = wVar;
        this.f350c = wVar;
    }

    public final void a() {
        this.f348a = 1;
        this.f350c = this.f349b;
        this.f352f = 0;
    }

    public final boolean b() {
        v0.a b4 = this.f350c.f365b.b();
        int a2 = b4.a(6);
        return !(a2 == 0 || ((ByteBuffer) b4.d).get(a2 + b4.f2710a) == 0) || this.f351e == 65039;
    }
}
