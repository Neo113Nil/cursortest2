package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresPermission;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.crrepa.band.aviator.R;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends a {
    private RemoteInput remoteInput;
    private NotificationCompat.WearableExtender wearableExtender;

    public g(NotificationCompat.Builder builder, int i8, String str) {
        super(builder, i8, str);
        this.wearableExtender = new NotificationCompat.WearableExtender();
    }

    public g addPages(Notification notification) {
        if (notification == null) {
            throw new IllegalArgumentException("Notification Must Not Be Null.");
        }
        this.wearableExtender.addPage(notification);
        return this;
    }

    public g background(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap Must Not Be Null.");
        }
        this.wearableExtender.setBackground(bitmap);
        return this;
    }

    @Override // com.crrepa.band.my.device.pushmessage.notification.notification.a
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public Notification build() {
        this.builder.extend(this.wearableExtender);
        super.build();
        return super.notificationNotify();
    }

    @SuppressLint({"ResourceType"})
    public g button(@DrawableRes int i8, String str, PendingIntent pendingIntent) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        if (str == null) {
            throw new IllegalStateException("Title Must Not Be Null!");
        }
        if (pendingIntent == null) {
            throw new IllegalArgumentException("PendingIntent Must Not Be Null.");
        }
        this.wearableExtender.addAction(new NotificationCompat.Action(i8, str, pendingIntent));
        return this;
    }

    public g contentIcon(@DrawableRes int i8) {
        this.wearableExtender.setContentIcon(i8);
        return this;
    }

    public g hideIcon(boolean z7) {
        this.wearableExtender.setHintHideIcon(z7);
        return this;
    }

    public g remoteInput(@DrawableRes int i8, @StringRes int i9, n1.c cVar, RemoteInput remoteInput) {
        remoteInput(i8, e.mSingleton.mContext.getString(i9), cVar.onSettingPendingIntent(), remoteInput);
        return this;
    }

    public g startScrollBottom(boolean z7) {
        this.wearableExtender.setStartScrollBottom(z7);
        return this;
    }

    public g remoteInput(@DrawableRes int i8, String str, n1.c cVar, RemoteInput remoteInput) {
        remoteInput(i8, str, cVar.onSettingPendingIntent(), remoteInput);
        return this;
    }

    public g addPages(List<Notification> list) {
        if (list != null && !list.isEmpty()) {
            this.wearableExtender.addPages(list);
            return this;
        }
        throw new IllegalArgumentException("List Notitifcation Must Not Be Null And Empty!");
    }

    @SuppressLint({"ResourceType"})
    public g background(@DrawableRes int i8) {
        if (i8 > 0) {
            this.wearableExtender.setBackground(BitmapFactory.decodeResource(e.mSingleton.mContext.getResources(), i8));
            return this;
        }
        throw new IllegalArgumentException("Resource ID Background Should Not Be Less Than Or Equal To Zero!");
    }

    public g remoteInput(@DrawableRes int i8, @StringRes int i9, PendingIntent pendingIntent, RemoteInput remoteInput) {
        remoteInput(i8, e.mSingleton.mContext.getString(i9), pendingIntent, remoteInput);
        return this;
    }

    @SuppressLint({"ResourceType"})
    public g remoteInput(@DrawableRes int i8, String str, PendingIntent pendingIntent, RemoteInput remoteInput) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Icon Should Not Be Less Than Or Equal To Zero!");
        }
        if (str == null) {
            throw new IllegalArgumentException("Title Must Not Be Null!");
        }
        if (pendingIntent == null) {
            throw new IllegalArgumentException("PendingIntent Must Not Be Null!");
        }
        if (remoteInput != null) {
            this.remoteInput = remoteInput;
            this.wearableExtender.addAction(new NotificationCompat.Action.Builder(i8, str, pendingIntent).addRemoteInput(remoteInput).build());
            return this;
        }
        throw new IllegalArgumentException("RemoteInput Must Not Be Null!");
    }

    @SuppressLint({"ResourceType"})
    public g remoteInput(@DrawableRes int i8, String str, PendingIntent pendingIntent) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Icon Should Not Be Less Than Or Equal To Zero!");
        }
        if (str == null) {
            throw new IllegalArgumentException("Title Must Not Be Null!");
        }
        if (pendingIntent != null) {
            this.remoteInput = new RemoteInput.Builder(e.mSingleton.mContext.getString(R.string.pugnotification_key_voice_reply)).setLabel(e.mSingleton.mContext.getString(R.string.pugnotification_label_voice_reply)).setChoices(e.mSingleton.mContext.getResources().getStringArray(R.array.pugnotification_reply_choices)).build();
            this.wearableExtender.addAction(new NotificationCompat.Action.Builder(i8, str, pendingIntent).addRemoteInput(this.remoteInput).build());
            return this;
        }
        throw new IllegalArgumentException("PendingIntent Must Not Be Null!");
    }

    public g remoteInput(@DrawableRes int i8, @StringRes int i9, PendingIntent pendingIntent, String str, String[] strArr) {
        return remoteInput(i8, e.mSingleton.mContext.getString(i9), pendingIntent, str, strArr);
    }

    @SuppressLint({"ResourceType"})
    public g remoteInput(@DrawableRes int i8, String str, PendingIntent pendingIntent, String str2, String[] strArr) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Icon Should Not Be Less Than Or Equal To Zero!");
        }
        if (str == null) {
            throw new IllegalArgumentException("Title Must Not Be Null!");
        }
        if (strArr == null) {
            throw new IllegalArgumentException("Reply Choices Must Not Be Null!");
        }
        if (pendingIntent == null) {
            throw new IllegalArgumentException("PendingIntent Must Not Be Null!");
        }
        if (str2 != null) {
            this.remoteInput = new RemoteInput.Builder(e.mSingleton.mContext.getString(R.string.pugnotification_key_voice_reply)).setLabel(str2).setChoices(strArr).build();
            this.wearableExtender.addAction(new NotificationCompat.Action.Builder(i8, str, pendingIntent).addRemoteInput(this.remoteInput).build());
            return this;
        }
        throw new IllegalArgumentException("Reply Label Must Not Be Null!");
    }
}
