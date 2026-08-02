package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eew implements dpd {
    private final Context a;
    private final dov b;
    private final kee c;

    public eew(kee keeVar, Context context, dov dovVar) {
        this.c = keeVar;
        this.a = context;
        this.b = dovVar;
    }

    @Override // defpackage.dpd
    public final void a(Object obj, ImageView imageView) {
        if (blf.q == null) {
            blf.q = (blf) ((blf) new blf().k()).j();
        }
        blf blfVar = blf.q;
        gzp R = dih.R(imageView);
        if (R.f()) {
            blfVar = (blf) blfVar.t(((Integer) R.b()).intValue());
        }
        ((baf) ((gnh) this.c.a).a(obj == null ? null : eez.b(obj, this.b)).f(blfVar).o(dih.S(this.a))).h(imageView);
    }
}
