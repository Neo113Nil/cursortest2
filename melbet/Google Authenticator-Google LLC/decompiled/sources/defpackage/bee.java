package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bee implements bed {
    @Override // defpackage.bed
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bed
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bed
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.bed
    public final void c() {
    }

    @Override // defpackage.bed
    public final void e(int i) {
    }
}
