package a4;

import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m implements h3.a {

    /* renamed from: f, reason: collision with root package name */
    public final v f187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f188g;

    public m(r rVar, v vVar) {
        this.f188g = rVar;
        this.f187f = vVar;
    }

    @Override // h3.a
    public final Object a() {
        r rVar = this.f188g;
        v vVar = this.f187f;
        try {
        } catch (IOException e4) {
            rVar.m(2, 2, e4);
        } catch (Throwable th) {
            rVar.m(3, 3, null);
            u3.b.b(vVar);
            throw th;
        }
        if (!vVar.m(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (vVar.m(false, this)) {
        }
        rVar.m(1, 9, null);
        u3.b.b(vVar);
        return w2.d.f3820c;
    }
}
