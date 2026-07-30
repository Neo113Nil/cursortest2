package com.crrepa.band.my.device.pushmessage.notification.model;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public class NotificationBean {
    private boolean autoCancel;
    private int background;
    private String bigTextStyle;
    private PendingIntent clickPendingIntent;
    private int colorLight;
    private PendingIntent dismissPendingIntent;
    private int identifier;
    private Bitmap largeIcon;
    private int ledOffMs;
    private int ledOnMs;
    private String message;
    private int smallIcon;
    private Uri sound;
    private String ticker;
    private String title;
    private long[] vibratorTime;
    private long when;

    public int getBackground() {
        return this.background;
    }

    public String getBigTextStyle() {
        return this.bigTextStyle;
    }

    public PendingIntent getClickPendingIntent() {
        return this.clickPendingIntent;
    }

    public int getColorLight() {
        return this.colorLight;
    }

    public PendingIntent getDismissPendingIntent() {
        return this.dismissPendingIntent;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public Bitmap getLargeIcon() {
        return this.largeIcon;
    }

    public int getLedOffMs() {
        return this.ledOffMs;
    }

    public int getLedOnMs() {
        return this.ledOnMs;
    }

    public String getMessage() {
        return this.message;
    }

    public int getSmallIcon() {
        return this.smallIcon;
    }

    public Uri getSound() {
        return this.sound;
    }

    public String getTicker() {
        return this.ticker;
    }

    public String getTitle() {
        return this.title;
    }

    public long[] getVibratorTime() {
        return this.vibratorTime;
    }

    public long getWhen() {
        return this.when;
    }

    public boolean isAutoCancel() {
        return this.autoCancel;
    }

    public void setAutoCancel(boolean z7) {
        this.autoCancel = z7;
    }

    public void setBackground(int i8) {
        this.background = i8;
    }

    public void setBigTextStyle(String str) {
        this.bigTextStyle = str;
    }

    public void setClickPendingIntent(PendingIntent pendingIntent) {
        this.clickPendingIntent = pendingIntent;
    }

    public void setColorLight(int i8) {
        this.colorLight = i8;
    }

    public void setDismissPendingIntent(PendingIntent pendingIntent) {
        this.dismissPendingIntent = pendingIntent;
    }

    public void setIdentifier(int i8) {
        this.identifier = i8;
    }

    public void setLargeIcon(Bitmap bitmap) {
        this.largeIcon = bitmap;
    }

    public void setLedOffMs(int i8) {
        this.ledOffMs = i8;
    }

    public void setLedOnMs(int i8) {
        this.ledOnMs = i8;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSmallIcon(int i8) {
        this.smallIcon = i8;
    }

    public void setSound(Uri uri) {
        this.sound = uri;
    }

    public void setTicker(String str) {
        this.ticker = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVibratorTime(long[] jArr) {
        this.vibratorTime = jArr;
    }

    public void setWhen(long j8) {
        this.when = j8;
    }
}
