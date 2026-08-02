package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhd implements bbn {
    private final bed a = new bee();

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ bdv a(Object obj, int i, int i2, bbl bblVar) {
        return c(gd$$ExternalSyntheticApiModelOutline0.m61m(obj), i, i2, bblVar);
    }

    @Override // defpackage.bbn
    public final /* bridge */ /* synthetic */ boolean b(Object obj, bbl bblVar) {
        gd$$ExternalSyntheticApiModelOutline0.m61m(obj);
        return true;
    }

    public final bdv c(ImageDecoder.Source source, int i, int i2, bbl bblVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new bgx(i, i2, bblVar));
        return new bil(decodeBitmap, this.a, 1);
    }
}
