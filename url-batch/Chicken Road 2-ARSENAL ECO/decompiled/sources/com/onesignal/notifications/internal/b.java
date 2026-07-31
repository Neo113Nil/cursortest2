package com.onesignal.notifications.internal;

import F2.j;
import F2.n;
import F2.o;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // F2.n
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo22getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // F2.n
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo23getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // F2.n
    public Object requestPermission(boolean z5, InterfaceC0564d interfaceC0564d) {
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo18addClickListener(F2.h listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo19addForegroundLifecycleListener(j listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo20addPermissionObserver(o observer) {
        i.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo21clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo24removeClickListener(F2.h listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo25removeForegroundLifecycleListener(j listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo26removeGroupedNotifications(String group) {
        i.e(group, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo27removeNotification(int i7) {
        throw Companion.getEXCEPTION();
    }

    @Override // F2.n
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo28removePermissionObserver(o observer) {
        i.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }
}
