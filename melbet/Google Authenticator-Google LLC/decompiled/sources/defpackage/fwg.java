package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwg extends bku {
    private final fwf a;

    public fwg(fwf fwfVar) {
        this.a = fwfVar;
    }

    @Override // defpackage.bku, defpackage.bkw
    public final void c(Context context, azj azjVar, bac bacVar) {
        this.a.c(context, azjVar, bacVar);
        bacVar.f(fxy.class, InputStream.class, new bgq(4));
    }
}
