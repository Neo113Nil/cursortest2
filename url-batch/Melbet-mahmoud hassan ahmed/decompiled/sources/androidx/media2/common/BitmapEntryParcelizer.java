package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.media2.common.MediaMetadata;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(a aVar) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.f1122a = aVar.E(bitmapEntry.f1122a, 1);
        bitmapEntry.f1123b = (Bitmap) aVar.A(bitmapEntry.f1123b, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, a aVar) {
        aVar.K(false, false);
        aVar.h0(bitmapEntry.f1122a, 1);
        aVar.d0(bitmapEntry.f1123b, 2);
    }
}
