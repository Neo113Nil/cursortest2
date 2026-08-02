package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dni extends AnimationDrawable {
    private final WeakReference a;

    public dni(Bitmap bitmap, int i, int i2, int i3) {
        this.a = new WeakReference(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight() / i2;
        int round = Math.round(i / (width / height));
        setOneShot(true);
        for (int i4 = 0; i4 < i2; i4++) {
            addFrame(new dnj(bitmap, width, height, i, round, i4), i3 / i2);
        }
    }

    final void a() {
        dnj dnjVar;
        Bitmap bitmap;
        WeakReference weakReference = this.a;
        Bitmap bitmap2 = (Bitmap) weakReference.get();
        if (bitmap2 != null) {
            bitmap2.recycle();
            weakReference.clear();
        }
        for (int i = 0; i < getNumberOfFrames(); i++) {
            Drawable frame = getFrame(i);
            if ((frame instanceof dnj) && (bitmap = (dnjVar = (dnj) frame).a) != null) {
                bitmap.recycle();
                dnjVar.a = null;
            }
        }
    }
}
