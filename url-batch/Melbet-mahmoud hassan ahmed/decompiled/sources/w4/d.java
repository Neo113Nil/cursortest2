package w4;

import m5.k;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private final u4.d f23027a;

    /* renamed from: b, reason: collision with root package name */
    private final k.d f23028b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f23029c;

    public d(k.d dVar, u4.d dVar2, Boolean bool) {
        this.f23028b = dVar;
        this.f23027a = dVar2;
        this.f23029c = bool;
    }

    @Override // w4.g
    public void a(Object obj) {
        this.f23028b.a(obj);
    }

    @Override // w4.g
    public void b(String str, String str2, Object obj) {
        this.f23028b.b(str, str2, obj);
    }

    @Override // w4.f
    public <T> T c(String str) {
        return null;
    }

    @Override // w4.b, w4.f
    public u4.d d() {
        return this.f23027a;
    }

    @Override // w4.b, w4.f
    public Boolean f() {
        return this.f23029c;
    }
}
