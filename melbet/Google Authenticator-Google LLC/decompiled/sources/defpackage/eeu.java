package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eeu extends bku {
    final /* synthetic */ egc a;

    public eeu(egc egcVar) {
        this.a = egcVar;
    }

    @Override // defpackage.bku, defpackage.bkw
    public final void c(Context context, azj azjVar, bac bacVar) {
        bacVar.f(eez.class, Bitmap.class, new eev(context, this.a));
        bacVar.f(eez.class, Bitmap.class, new bgk(new eex(context, 0), 7));
        bacVar.f(eez.class, InputStream.class, new bgq(3));
    }
}
