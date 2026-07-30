package q5;

import a0.m;
import l5.w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final w f7523a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.c f7524b;

    public d(w wVar, androidx.room.c cVar) {
        this.f7523a = wVar;
        this.f7524b = cVar;
    }

    @Override // q5.e
    public final void a() {
        w wVar = this.f7523a;
        if (wVar.f6085a.get()) {
            return;
        }
        wVar.f6089e.h(this.f7524b);
    }

    @Override // q5.e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        androidx.room.c cVar = this.f7524b;
        sb.append(((g5.c) cVar.f1070h).f4459b);
        sb.append(": ");
        sb.append(m.v(5));
        sb.append(": ");
        sb.append(((t5.m) cVar.f1069g).f8910f.r(true));
        return sb.toString();
    }
}
