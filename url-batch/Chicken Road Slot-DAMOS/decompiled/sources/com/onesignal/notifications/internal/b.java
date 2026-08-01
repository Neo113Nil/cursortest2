package com.onesignal.notifications.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import qb.j;
import qb.n;
import qb.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    @Override // qb.n
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo13addClickListener(qb.h hVar) {
        hVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo14addForegroundLifecycleListener(j jVar) {
        jVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo15addPermissionObserver(o oVar) {
        oVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo16clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo17getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // qb.n
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo18getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // qb.n
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo19removeClickListener(qb.h hVar) {
        hVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo20removeForegroundLifecycleListener(j jVar) {
        jVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo21removeGroupedNotifications(String str) {
        str.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo22removeNotification(int i3) {
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo23removePermissionObserver(o oVar) {
        oVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // qb.n
    public Object requestPermission(boolean z10, ld.a aVar) {
        throw Companion.getEXCEPTION();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }
}
