package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gng implements gni {
    public final gnj a;
    public final Object b;
    private final /* synthetic */ int c;

    public gng(Object obj, gnj gnjVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = gnjVar;
    }

    @Override // defpackage.gni
    public final void a(gnh gnhVar) {
        if (this.c != 0) {
            ComponentCallbacks2 componentCallbacks2 = gnhVar.b;
            Object obj = this.b;
            ((bg) obj).registerComponentCallbacks(componentCallbacks2);
            this.a.a((Activity) obj, gnhVar);
            ((cp) obj).L().a(new gne(this, gnhVar, componentCallbacks2));
            return;
        }
        bd bdVar = (bd) this.b;
        bg D = bdVar.D();
        D.getClass();
        ComponentCallbacks2 componentCallbacks22 = gnhVar.b;
        D.registerComponentCallbacks(componentCallbacks22);
        this.a.a(D, gnhVar);
        bdVar.L().a(new gnf(this, D, gnhVar, componentCallbacks22));
    }
}
