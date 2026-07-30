package l5;

import J4.l;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665c extends AbstractC0663a {

    /* renamed from: b, reason: collision with root package name */
    public final int f6283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0666d f6284c;

    public C0665c(C0666d c0666d, int i2) {
        this.f6284c = c0666d;
        this.f6283b = i2;
        long j = i2;
        l lVar = c0666d.f6292g;
        if (lVar == null || C0670h.e(lVar)) {
            lVar = c0666d.c().d(c0666d.f6287b + ".exporter.seen").build();
            c0666d.f6292g = lVar;
        }
        lVar.a(j, c0666d.f6289d);
    }

    @Override // l5.AbstractC0663a
    public final void a(String str, C4.b bVar) {
        int i2 = this.f6283b;
        C0666d c0666d = this.f6284c;
        if (str != null) {
            c0666d.b().a(i2, c0666d.f6291f);
        } else {
            c0666d.b().a(i2, c0666d.f6290e);
        }
    }
}
