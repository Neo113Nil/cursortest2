package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ea2;
import defpackage.yj1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ea2 {
    @Override // defpackage.ea2
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(yj1.class.getClassLoader());
        }
        if (i != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
