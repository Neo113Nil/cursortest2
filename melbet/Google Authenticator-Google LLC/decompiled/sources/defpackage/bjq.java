package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjq implements bjs {
    private final /* synthetic */ int a;
    private final Object b;

    public bjq(Resources resources, int i) {
        this.a = i;
        a.v(resources, "Argument must not be null");
        this.b = resources;
    }

    @Override // defpackage.bjs
    public final bdv a(bdv bdvVar, bbl bblVar) {
        if (this.a == 0) {
            return bil.f((Resources) this.b, bdvVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) bdvVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
        bdvVar.e();
        return new bja(byteArrayOutputStream.toByteArray(), 0);
    }

    public bjq(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }
}
