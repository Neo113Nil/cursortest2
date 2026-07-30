package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ea2;
import defpackage.yj1;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends ea2 {
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
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray == null) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
