package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.net.Uri;

@Deprecated
/* loaded from: classes4.dex */
public class BrowserActionItem {
    private final PendingIntent mAction;
    private int mIconId;
    private Uri mIconUri;
    private Runnable mRunnableAction;
    private final String mTitle;

    public int getIconId() {
        return this.mIconId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public PendingIntent getAction() {
        PendingIntent pendingIntent = this.mAction;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public Uri getIconUri() {
        return this.mIconUri;
    }

    Runnable getRunnableAction() {
        return this.mRunnableAction;
    }
}
