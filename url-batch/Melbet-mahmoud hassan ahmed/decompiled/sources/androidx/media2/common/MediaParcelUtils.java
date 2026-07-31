package androidx.media2.common;

import a0.a;
import a0.b;
import android.annotation.SuppressLint;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public class MediaParcelUtils {

    @SuppressLint({"RestrictedApi"})
    private static class MediaItemParcelImpl extends ParcelImpl {

        /* renamed from: g, reason: collision with root package name */
        private final MediaItem f1124g;

        MediaItemParcelImpl(MediaItem mediaItem) {
            super(new MediaItem(mediaItem));
            this.f1124g = mediaItem;
        }

        @Override // androidx.versionedparcelable.ParcelImpl
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public MediaItem a() {
            return this.f1124g;
        }
    }

    public static <T extends b> T a(ParcelImpl parcelImpl) {
        return (T) a.a(parcelImpl);
    }

    public static ParcelImpl b(b bVar) {
        return bVar instanceof MediaItem ? new MediaItemParcelImpl((MediaItem) bVar) : (ParcelImpl) a.d(bVar);
    }
}
