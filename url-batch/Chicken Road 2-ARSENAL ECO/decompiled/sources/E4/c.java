package E4;

import c4.l;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f663c;

    public c(d dVar, int i7) {
        this.f663c = dVar;
        this.f662b = i7;
        long j4 = i7;
        l lVar = dVar.f672g;
        if (lVar == null || h.e(lVar)) {
            lVar = dVar.c().d(dVar.f667b + ".exporter.seen").build();
            dVar.f672g = lVar;
        }
        lVar.d(j4, dVar.f669d);
    }

    @Override // E4.a
    public final void a(String str, V3.a aVar) {
        int i7 = this.f662b;
        d dVar = this.f663c;
        if (str != null) {
            dVar.b().d(i7, dVar.f671f);
        } else {
            dVar.b().d(i7, dVar.f670e);
        }
    }
}
