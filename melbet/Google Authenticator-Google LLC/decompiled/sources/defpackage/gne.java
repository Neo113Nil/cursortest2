package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gne implements aec {
    final /* synthetic */ gnh a;
    final /* synthetic */ ComponentCallbacks2 b;
    final /* synthetic */ gng c;

    public gne(gng gngVar, gnh gnhVar, ComponentCallbacks2 componentCallbacks2) {
        this.a = gnhVar;
        this.b = componentCallbacks2;
        this.c = gngVar;
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        gng gngVar = this.c;
        gnj gnjVar = gngVar.a;
        Object obj = gngVar.b;
        gnjVar.c((Activity) obj, this.a);
        ((bg) obj).unregisterComponentCallbacks(this.b);
        ((cp) obj).L().c(this);
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
