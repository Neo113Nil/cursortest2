package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bia implements bbp {
    private final bbp b;
    private final boolean c;

    public bia(bbp bbpVar, boolean z) {
        this.b = bbpVar;
        this.c = z;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.bbp
    public final bdv b(Context context, bdv bdvVar, int i, int i2) {
        bed bedVar = azj.b(context).b;
        Drawable drawable = (Drawable) bdvVar.c();
        bdv a = bhz.a(bedVar, drawable, i, i2);
        if (a == null) {
            if (this.c) {
                throw new IllegalArgumentException(a.aj(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return bdvVar;
        }
        bdv b = this.b.b(context, a, i, i2);
        if (!b.equals(a)) {
            return bil.f(context.getResources(), b);
        }
        b.e();
        return bdvVar;
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bia) {
            return this.b.equals(((bia) obj).b);
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return this.b.hashCode();
    }
}
