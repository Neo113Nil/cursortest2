package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.blankj.utilcode.util.x;
import com.crrepa.band.aviator.R;
import com.google.android.exoplayer2.C;

/* loaded from: classes2.dex */
public class c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String CHANNEL_ID = "_channel_";
    private NotificationCompat.Builder builder;
    private String message;
    private Spanned messageSpanned;
    private int notificationId;
    private int smallIcon;
    private String tag;
    private String title;

    public c(int i8) {
        Context context = e.mSingleton.mContext;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        String str = context.getPackageName() + CHANNEL_ID + i8;
        String string = context.getString(R.string.notification_channel_name);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            NotificationChannel a8 = x.a(str, string, i8);
            a8.setSound(null, null);
            notificationManager.createNotificationChannel(a8);
        }
        this.builder = new NotificationCompat.Builder(context, str);
        this.builder.setContentIntent(i9 < 31 ? PendingIntent.getBroadcast(e.mSingleton.mContext, 0, new Intent(), C.BUFFER_FLAG_FIRST_SAMPLE) : PendingIntent.getBroadcast(e.mSingleton.mContext, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }

    private void notificationShallContainAtLeastThoseSmallIconValid() {
        if (this.smallIcon <= 0) {
            throw new IllegalArgumentException("This is required. Notifications with an invalid icon resource will not be shown.");
        }
    }

    public c addPerson(@NonNull String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("URI Must Not Be Empty!");
        }
        this.builder.addPerson(str);
        return this;
    }

    public c autoCancel(boolean z7) {
        this.builder.setAutoCancel(z7);
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c bigTextStyle(@StringRes int i8) {
        if (i8 > 0) {
            return bigTextStyle(e.mSingleton.mContext.getResources().getString(i8), (String) null);
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }

    public c button(@DrawableRes int i8, @NonNull String str, @NonNull PendingIntent pendingIntent) {
        this.builder.addAction(i8, str, pendingIntent);
        return this;
    }

    public c click(@NonNull Class<?> cls, Bundle bundle) {
        this.builder.setContentIntent(new o1.a(cls, bundle, this.notificationId).onSettingPendingIntent());
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c color(@ColorRes int i8) {
        int color;
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        Context context = e.mSingleton.mContext;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCompat.Builder builder = this.builder;
            color = context.getColor(i8);
            builder.setColor(color);
        } else {
            this.builder.setColor(context.getResources().getColor(i8));
        }
        return this;
    }

    public b custom() {
        notificationShallContainAtLeastThoseSmallIconValid();
        return new b(this.builder, this.notificationId, this.title, this.message, this.messageSpanned, this.smallIcon, this.tag);
    }

    public c dismiss(@NonNull Class<?> cls, Bundle bundle) {
        this.builder.setDeleteIntent(new o1.c(cls, bundle, this.notificationId).onSettingPendingIntent());
        return this;
    }

    public c flags(int i8) {
        this.builder.setDefaults(i8);
        return this;
    }

    public c group(@NonNull String str) {
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Group Key Must Not Be Empty!");
        }
        this.builder.setGroup(str);
        return this;
    }

    public c groupSummary(boolean z7) {
        this.builder.setGroupSummary(z7);
        return this;
    }

    public c identifier(int i8) {
        if (i8 <= 0) {
            throw new IllegalStateException("Identifier Should Not Be Less Than Or Equal To Zero!");
        }
        this.notificationId = i8;
        return this;
    }

    public c inboxStyle(@NonNull String[] strArr, @NonNull String str, String str2) {
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("Inbox Lines Must Have At Least One Text!");
        }
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Title Must Not Be Empty!");
        }
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        for (String str3 : strArr) {
            inboxStyle.addLine(str3);
        }
        inboxStyle.setBigContentTitle(str);
        if (str2 != null) {
            inboxStyle.setSummaryText(str2);
        }
        this.builder.setStyle(inboxStyle);
        return this;
    }

    public c largeIcon(@NonNull Bitmap bitmap) {
        this.builder.setLargeIcon(bitmap);
        return this;
    }

    public c lights(int i8, int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalStateException("Led On Milliseconds Invalid!");
        }
        if (i10 < 0) {
            throw new IllegalStateException("Led Off Milliseconds Invalid!");
        }
        this.builder.setLights(i8, i9, i10);
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c message(@StringRes int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        String string = e.mSingleton.mContext.getResources().getString(i8);
        this.message = string;
        this.builder.setContentText(string);
        return this;
    }

    public c number(int i8) {
        this.builder.setNumber(i8);
        return this;
    }

    public c ongoing(boolean z7) {
        this.builder.setOngoing(z7);
        return this;
    }

    public c onlyAlertOnce(boolean z7) {
        this.builder.setOnlyAlertOnce(z7);
        return this;
    }

    public c priority(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Priority Should Not Be Less Than Or Equal To Zero!");
        }
        this.builder.setPriority(i8);
        return this;
    }

    public d progress() {
        notificationShallContainAtLeastThoseSmallIconValid();
        return new d(this.builder, this.notificationId, this.tag);
    }

    public f simple() {
        notificationShallContainAtLeastThoseSmallIconValid();
        return new f(this.builder, this.notificationId, this.tag);
    }

    public c smallIcon(@DrawableRes int i8) {
        this.smallIcon = i8;
        this.builder.setSmallIcon(i8);
        return this;
    }

    public c sound(@NonNull Uri uri) {
        this.builder.setSound(uri);
        return this;
    }

    public c tag(@NonNull String str) {
        this.tag = str;
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c ticker(@StringRes int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        this.builder.setTicker(e.mSingleton.mContext.getResources().getString(i8));
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c title(@StringRes int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        String string = e.mSingleton.mContext.getResources().getString(i8);
        this.title = string;
        this.builder.setContentTitle(string);
        return this;
    }

    public c vibrate(@NonNull long[] jArr) {
        for (long j8 : jArr) {
            if (j8 <= 0) {
                throw new IllegalArgumentException("Vibrate Time " + j8 + " Invalid!");
            }
        }
        this.builder.setVibrate(jArr);
        return this;
    }

    public g wear() {
        notificationShallContainAtLeastThoseSmallIconValid();
        return new g(this.builder, this.notificationId, this.tag);
    }

    public c when(long j8) {
        if (j8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        this.builder.setWhen(j8);
        return this;
    }

    public c button(@DrawableRes int i8, @NonNull String str, @NonNull n1.c cVar) {
        this.builder.addAction(i8, str, cVar.onSettingPendingIntent());
        return this;
    }

    public c click(@NonNull Class<?> cls) {
        click(cls, null);
        return this;
    }

    public c dismiss(@NonNull Class<?> cls) {
        dismiss(cls, null);
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c largeIcon(@DrawableRes int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
        }
        this.builder.setLargeIcon(BitmapFactory.decodeResource(e.mSingleton.mContext.getResources(), i8));
        return this;
    }

    @SuppressLint({"ResourceType"})
    public c bigTextStyle(@StringRes int i8, @StringRes int i9) {
        if (i8 > 0) {
            return bigTextStyle(e.mSingleton.mContext.getResources().getString(i8), e.mSingleton.mContext.getResources().getString(i9));
        }
        throw new IllegalArgumentException("Resource ID Should Not Be Less Than Or Equal To Zero!");
    }

    public c button(@NonNull NotificationCompat.Action action) {
        this.builder.addAction(action);
        return this;
    }

    public c click(@NonNull Bundle bundle) {
        this.builder.setContentIntent(new o1.b(bundle, this.notificationId).onSettingPendingIntent());
        return this;
    }

    public c dismiss(@NonNull Bundle bundle) {
        this.builder.setDeleteIntent(new o1.d(bundle, this.notificationId).onSettingPendingIntent());
        return this;
    }

    public c ticker(String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                this.builder.setTicker(str);
                return this;
            }
            throw new IllegalArgumentException("Ticker Must Not Be Empty!");
        }
        throw new IllegalStateException("Ticker Must Not Be Null!");
    }

    public c click(@NonNull n1.c cVar) {
        this.builder.setContentIntent(cVar.onSettingPendingIntent());
        return this;
    }

    public c dismiss(@NonNull n1.c cVar) {
        this.builder.setDeleteIntent(cVar.onSettingPendingIntent());
        return this;
    }

    public c message(@NonNull String str) {
        if (str.trim().length() != 0) {
            this.message = str;
            this.builder.setContentText(str);
            return this;
        }
        throw new IllegalArgumentException("Message Must Not Be Empty!");
    }

    public c title(String str) {
        if (str != null) {
            if (str.trim().length() != 0) {
                this.title = str;
                this.builder.setContentTitle(str);
                return this;
            }
            throw new IllegalArgumentException("Title Must Not Be Empty!");
        }
        throw new IllegalStateException("Title Must Not Be Null!");
    }

    public c click(@NonNull PendingIntent pendingIntent) {
        this.builder.setContentIntent(pendingIntent);
        return this;
    }

    public c dismiss(@NonNull PendingIntent pendingIntent) {
        this.builder.setDeleteIntent(pendingIntent);
        return this;
    }

    public c bigTextStyle(@NonNull String str) {
        if (str.trim().length() != 0) {
            return bigTextStyle(str, (String) null);
        }
        throw new IllegalArgumentException("Big Text Style Must Not Be Empty!");
    }

    public c message(@NonNull Spanned spanned) {
        if (spanned.length() != 0) {
            this.messageSpanned = spanned;
            this.builder.setContentText(spanned);
            return this;
        }
        throw new IllegalArgumentException("Message Must Not Be Empty!");
    }

    public c bigTextStyle(@NonNull String str, String str2) {
        if (str.trim().length() != 0) {
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.bigText(str);
            if (str2 != null) {
                bigTextStyle.setSummaryText(str2);
            }
            this.builder.setStyle(bigTextStyle);
            return this;
        }
        throw new IllegalArgumentException("Big Text Style Must Not Be Empty!");
    }

    public c bigTextStyle(@NonNull Spanned spanned, String str) {
        if (spanned.length() != 0) {
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.bigText(spanned);
            if (str != null) {
                bigTextStyle.setSummaryText(str);
            }
            this.builder.setStyle(bigTextStyle);
            return this;
        }
        throw new IllegalArgumentException("Big Text Style Must Not Be Empty!");
    }
}
