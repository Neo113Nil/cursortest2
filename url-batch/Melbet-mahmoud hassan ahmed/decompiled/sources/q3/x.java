package q3;

import p3.a;

/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ y f20331f;

    x(y yVar) {
        this.f20331f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        fVar = this.f20331f.f20334a.f20336g;
        fVar2 = this.f20331f.f20334a.f20336g;
        fVar.f(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
