package j3;

import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l implements t2.a {

    /* renamed from: f, reason: collision with root package name */
    public final t f2435f;
    public final /* synthetic */ p g;

    public l(p pVar, t tVar) {
        this.g = pVar;
        this.f2435f = tVar;
    }

    @Override // t2.a
    public final Object a() {
        p pVar = this.g;
        t tVar = this.f2435f;
        try {
        } catch (IOException e4) {
            pVar.m(2, 2, e4);
        } catch (Throwable th) {
            pVar.m(3, 3, null);
            d3.c.b(tVar);
            throw th;
        }
        if (!tVar.m(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (tVar.m(false, this)) {
        }
        pVar.m(1, 9, null);
        d3.c.b(tVar);
        return m2.c.c;
    }
}
