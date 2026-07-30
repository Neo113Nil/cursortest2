package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.Spanned;
import android.widget.RemoteViews;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class b extends a implements n1.b {
    private static final String TAG = "b";
    private int mBackgroundResId;
    private n1.a mImageLoader;
    private String mMessage;
    private Spanned mMessageSpanned;
    private int mPlaceHolderResourceId;
    private RemoteViews mRemoteView;
    private int mSmallIcon;
    private String mTitle;
    private String mUri;

    public b(NotificationCompat.Builder builder, int i8, String str, String str2, Spanned spanned, int i9, String str3) {
        super(builder, i8, str3);
        this.mRemoteView = new RemoteViews(e.mSingleton.mContext.getPackageName(), R.layout.pugnotification_custom);
        this.mTitle = str;
        this.mMessage = str2;
        this.mMessageSpanned = spanned;
        this.mSmallIcon = i9;
        this.mPlaceHolderResourceId = R.mipmap.ic_notification;
        init();
    }

    private void init() {
        setTitle();
        setMessage();
        setSmallIcon();
    }

    private void loadImageBackground() {
        this.mRemoteView.setImageViewResource(R.id.notification_img_background, this.mPlaceHolderResourceId);
        this.mUri.getClass();
        throw null;
    }

    private void setMessage() {
        Spanned spanned = this.mMessageSpanned;
        if (spanned != null) {
            this.mRemoteView.setTextViewText(R.id.notification_text_message, spanned);
        } else {
            this.mRemoteView.setTextViewText(R.id.notification_text_message, this.mMessage);
        }
    }

    private void setSmallIcon() {
        if (this.mSmallIcon <= 0) {
            this.mRemoteView.setImageViewResource(R.id.notification_img_icon, R.mipmap.ic_notification);
        }
        this.mRemoteView.setImageViewResource(R.id.notification_img_icon, this.mSmallIcon);
    }

    private void setTitle() {
        this.mRemoteView.setTextViewText(R.id.notification_text_title, this.mTitle);
    }

    @SuppressLint({"ResourceType"})
    public b background(@DrawableRes int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        if (this.mUri != null) {
            throw new IllegalStateException("Background Already Set!");
        }
        this.mBackgroundResId = i8;
        return this;
    }

    @Override // com.crrepa.band.my.device.pushmessage.notification.notification.a
    public Notification build() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        super.build();
        setBigContentView(this.mRemoteView);
        loadImageBackground();
        return super.notificationNotify();
    }

    @Override // n1.b
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void imageLoadingCompleted(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap cannot be null");
        }
        this.mRemoteView.setImageViewBitmap(R.id.notification_img_background, bitmap);
        super.notificationNotify();
    }

    public b setImageLoader(n1.a aVar) {
        return this;
    }

    @SuppressLint({"ResourceType"})
    public b setPlaceholder(@DrawableRes int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        this.mPlaceHolderResourceId = i8;
        return this;
    }

    public b background(String str) {
        if (this.mBackgroundResId > 0) {
            throw new IllegalStateException("Background Already Set!");
        }
        if (this.mUri != null) {
            throw new IllegalStateException("Background Already Set!");
        }
        if (str != null) {
            if (str.trim().length() != 0) {
                throw new IllegalStateException("You have to set an ImageLoader!");
            }
            throw new IllegalArgumentException("Path Must Not Be Empty!");
        }
        throw new IllegalArgumentException("Path Must Not Be Null!");
    }
}
