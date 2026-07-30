package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;

/* loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i8, int i9, f6.l lVar) {
        Canvas beginRecording = picture.beginRecording(i8, i9);
        try {
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            picture.endRecording();
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }
}
