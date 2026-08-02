package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bum implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bum(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        if (i2 != 0) {
            Object obj = this.b;
            if (i2 == 1) {
                hoq.aa(new btn((btw) obj), ((bvm) this.a).c);
                return;
            } else {
                ((jis) this.a).d.a(((bd) obj).x());
                return;
            }
        }
        Object obj2 = this.b;
        Object obj3 = this.a;
        gtt f = ((bvm) obj3).k.f("Adding otp from ACTION_VIEW intent", 29);
        try {
            cam a = ((bvm) obj3).m.a((bpc) obj2);
            gbi gbiVar = ((bvm) obj3).i;
            gbiVar.i(new cbp(a.a), ((bvm) obj3).q);
            gbiVar.i(new cbp(a.b), ((bvm) obj3).r);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
