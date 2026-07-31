package q3;

import java.util.Map;

/* loaded from: classes.dex */
final class x0 implements j4.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j4.i f20332a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f20333b;

    x0(p pVar, j4.i iVar) {
        this.f20333b = pVar;
        this.f20332a = iVar;
    }

    @Override // j4.d
    public final void a(j4.h hVar) {
        Map map;
        map = this.f20333b.f20310b;
        map.remove(this.f20332a);
    }
}
