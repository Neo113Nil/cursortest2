package com.moyoung.lib.photopicker;

import android.net.Uri;
import java.util.List;

/* loaded from: classes4.dex */
public interface i {
    void onCanceled(String str);

    void onPicked(Uri uri);

    void onPicked(List<Uri> list, boolean z7);

    void unSupportGalleryMultiplePick();
}
