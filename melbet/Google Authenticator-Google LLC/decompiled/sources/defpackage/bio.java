package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bio implements bhw {
    private final bin a;
    private final bly b;

    public bio(bin binVar, bly blyVar) {
        this.a = binVar;
        this.b = blyVar;
    }

    @Override // defpackage.bhw
    public final void a(bed bedVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            bedVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.bhw
    public final void b() {
        this.a.a();
    }
}
