package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;

/* loaded from: classes4.dex */
abstract class t extends com.squareup.picasso.a {
    e callback;
    final RemoteViews remoteViews;
    private c target;
    final int viewId;

    static class a extends t {
        private final int[] appWidgetIds;

        a(Picasso picasso, u uVar, RemoteViews remoteViews, int i8, int[] iArr, int i9, int i10, String str, Object obj, int i11, e eVar) {
            super(picasso, uVar, remoteViews, i8, i11, i9, i10, obj, str, eVar);
            this.appWidgetIds = iArr;
        }

        @Override // com.squareup.picasso.t, com.squareup.picasso.a
        /* bridge */ /* synthetic */ Object getTarget() {
            return super.getTarget();
        }

        @Override // com.squareup.picasso.t
        void update() {
            AppWidgetManager.getInstance(this.picasso.context).updateAppWidget(this.appWidgetIds, this.remoteViews);
        }
    }

    static class b extends t {
        private final Notification notification;
        private final int notificationId;
        private final String notificationTag;

        b(Picasso picasso, u uVar, RemoteViews remoteViews, int i8, int i9, Notification notification, String str, int i10, int i11, String str2, Object obj, int i12, e eVar) {
            super(picasso, uVar, remoteViews, i8, i12, i10, i11, obj, str2, eVar);
            this.notificationId = i9;
            this.notificationTag = str;
            this.notification = notification;
        }

        @Override // com.squareup.picasso.t, com.squareup.picasso.a
        /* bridge */ /* synthetic */ Object getTarget() {
            return super.getTarget();
        }

        @Override // com.squareup.picasso.t
        void update() {
            ((NotificationManager) d0.getService(this.picasso.context, "notification")).notify(this.notificationTag, this.notificationId, this.notification);
        }
    }

    static class c {
        final RemoteViews remoteViews;
        final int viewId;

        c(RemoteViews remoteViews, int i8) {
            this.remoteViews = remoteViews;
            this.viewId = i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.viewId == cVar.viewId && this.remoteViews.equals(cVar.remoteViews);
        }

        public int hashCode() {
            return (this.remoteViews.hashCode() * 31) + this.viewId;
        }
    }

    t(Picasso picasso, u uVar, RemoteViews remoteViews, int i8, int i9, int i10, int i11, Object obj, String str, e eVar) {
        super(picasso, null, uVar, i10, i11, i9, null, str, obj, false);
        this.remoteViews = remoteViews;
        this.viewId = i8;
        this.callback = eVar;
    }

    @Override // com.squareup.picasso.a
    void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    @Override // com.squareup.picasso.a
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void error(Exception exc) {
        int i8 = this.errorResId;
        if (i8 != 0) {
            setImageResource(i8);
        }
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onError(exc);
        }
    }

    void setImageResource(int i8) {
        this.remoteViews.setImageViewResource(this.viewId, i8);
        update();
    }

    abstract void update();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a
    public c getTarget() {
        if (this.target == null) {
            this.target = new c(this.remoteViews, this.viewId);
        }
        return this.target;
    }
}
