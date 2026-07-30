package com.adjust.sdk;

import android.net.Uri;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class AdjustDeeplink {
    Uri referrer;
    Uri url;

    public AdjustDeeplink(Uri uri) {
        this.url = uri;
    }

    public Uri getReferrer() {
        return this.referrer;
    }

    public Uri getUrl() {
        return this.url;
    }

    public boolean isValid() {
        Uri uri = this.url;
        return (uri == null || uri.toString().isEmpty()) ? false : true;
    }

    public void setReferrer(Uri uri) {
        this.referrer = uri;
    }
}
