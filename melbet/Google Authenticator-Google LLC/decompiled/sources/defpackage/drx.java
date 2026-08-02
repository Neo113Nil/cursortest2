package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drx extends dja {
    public final Runnable a;
    final /* synthetic */ dqy b;
    final /* synthetic */ String d;
    final /* synthetic */ Handler e;
    final /* synthetic */ dov f;
    final /* synthetic */ String g;
    final /* synthetic */ fwm h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drx(dqy dqyVar, fwm fwmVar, String str, Handler handler, dov dovVar, String str2) {
        super(null);
        this.b = dqyVar;
        this.h = fwmVar;
        this.d = str;
        this.e = handler;
        this.f = dovVar;
        this.g = str2;
        this.a = new fv(dqyVar, this, fwmVar, str, 5);
    }

    @Override // defpackage.dja
    public final void h(hel helVar) {
        Object obj;
        helVar.getClass();
        hjs listIterator = helVar.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                obj = null;
                break;
            }
            String str = this.g;
            dov dovVar = this.f;
            obj = listIterator.next();
            if (ksp.b(dovVar.d(obj), str)) {
                break;
            }
        }
        if (obj != null) {
            dqy dqyVar = this.b;
            dqyVar.b(obj);
            dqyVar.f(this);
            this.e.removeCallbacks(this.a);
            fwm fwmVar = this.h;
            if (fwmVar != null) {
                fwmVar.t("SUCCESS", this.d);
            }
        }
    }
}
