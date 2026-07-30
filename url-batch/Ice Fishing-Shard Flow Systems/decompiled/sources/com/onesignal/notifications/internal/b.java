package com.onesignal.notifications.internal;

import h3.j;
import h3.n;
import h3.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // h3.n
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo24getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // h3.n
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo25getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // h3.n
    public Object requestPermission(boolean z7, V5.b bVar) {
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo20addClickListener(h3.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo21addForegroundLifecycleListener(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo22addPermissionObserver(o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo23clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo26removeClickListener(h3.h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo27removeForegroundLifecycleListener(j listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo28removeGroupedNotifications(String group) {
        Intrinsics.checkNotNullParameter(group, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo29removeNotification(int i2) {
        throw Companion.getEXCEPTION();
    }

    @Override // h3.n
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo30removePermissionObserver(o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        throw Companion.getEXCEPTION();
    }
}
