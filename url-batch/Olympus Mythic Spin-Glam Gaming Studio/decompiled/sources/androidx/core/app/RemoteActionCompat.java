package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes3.dex */
public final class RemoteActionCompat implements VersionedParcelable {
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    @RestrictTo
    public RemoteActionCompat() {
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static boolean shouldShowIcon(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }

        @DoNotInline
        static void setShouldShowIcon(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static CharSequence getContentDescription(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @DoNotInline
        static PendingIntent getActionIntent(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @DoNotInline
        static CharSequence getTitle(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @DoNotInline
        static Icon getIcon(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @DoNotInline
        static boolean isEnabled(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @DoNotInline
        static RemoteAction createRemoteAction(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @DoNotInline
        static void setEnabled(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }
}
