package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjm implements bbp {
    private final bbp b;

    public bjm(bbp bbpVar) {
        this.b = bbpVar;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.bbp
    public final bdv b(Context context, bdv bdvVar, int i, int i2) {
        bjj bjjVar = (bjj) bdvVar.c();
        bdv bilVar = new bil(bjjVar.a(), azj.b(context).b, 1);
        bbp bbpVar = this.b;
        bdv b = bbpVar.b(context, bilVar, i, i2);
        if (!bilVar.equals(b)) {
            bilVar.e();
        }
        bjjVar.a.a.d(bbpVar, (Bitmap) b.c());
        return bdvVar;
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bjm) {
            return this.b.equals(((bjm) obj).b);
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return this.b.hashCode();
    }
}
