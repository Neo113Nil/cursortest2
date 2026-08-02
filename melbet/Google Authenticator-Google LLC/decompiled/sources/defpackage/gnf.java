package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gnf implements aec {
    final /* synthetic */ bg a;
    final /* synthetic */ gnh b;
    final /* synthetic */ ComponentCallbacks2 c;
    final /* synthetic */ gng d;

    public gnf(gng gngVar, bg bgVar, gnh gnhVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = bgVar;
        this.b = gnhVar;
        this.c = componentCallbacks2;
        this.d = gngVar;
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        gng gngVar = this.d;
        gnj gnjVar = gngVar.a;
        bg bgVar = this.a;
        gnjVar.c(bgVar, this.b);
        bgVar.unregisterComponentCallbacks(this.c);
        ((bd) gngVar.b).L().c(this);
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void e(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
