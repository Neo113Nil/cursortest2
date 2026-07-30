package com.onesignal.notifications.internal.restoration.impl;

import O7.AbstractC0399y;
import android.service.notification.StatusBarNotification;
import i5.InterfaceC4577a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import q5.C4931c;
import q5.d;
import q7.v;
import s5.InterfaceC5000b;
import t4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import z5.InterfaceC5280b;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5280b {
    public static final C0239a Companion = new C0239a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final InterfaceC4577a _badgeCountUpdater;
    private final d _dataController;
    private final InterfaceC5000b _workManager;

    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0239a {
        public /* synthetic */ C0239a(e eVar) {
            this();
        }

        private C0239a() {
        }
    }

    public static final class b extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f _applicationService, InterfaceC5000b _workManager, d _dataController, InterfaceC4577a _badgeCountUpdater) {
        h.e(_applicationService, "_applicationService");
        h.e(_workManager, "_workManager");
        h.e(_dataController, "_dataController");
        h.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = p5.e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
        if (activeNotifications.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(8:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24|25)(2:27|28))(2:29|30))(3:32|33|(2:35|19)(1:36))|31|13|(1:14)|22|23|24|25))|39|6|7|(0)(0)|31|13|(1:14)|22|23|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("Error restoring notification records! ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:14:0x0067, B:16:0x006d, B:23:0x0082, B:30:0x0040, B:31:0x005f, B:33:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // z5.InterfaceC5280b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        a aVar;
        a aVar2;
        Iterator it;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    d dVar = this._dataController;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = dVar.listNotificationsForOutstanding(visibleNotifications, bVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.L$1;
                        aVar2 = (a) bVar.L$0;
                        com.bumptech.glide.f.r(obj);
                        while (it.hasNext()) {
                            C4931c c4931c = (C4931c) it.next();
                            bVar.L$0 = aVar2;
                            bVar.L$1 = it;
                            bVar.label = 2;
                            if (aVar2.processNotification(c4931c, 200, bVar) == enumC5179a) {
                                return enumC5179a;
                            }
                        }
                        aVar2._badgeCountUpdater.update();
                        return v.f40183a;
                    }
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                aVar2 = aVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                aVar2._badgeCountUpdater.update();
                return v.f40183a;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        aVar2._badgeCountUpdater.update();
        return v.f40183a;
    }

    @Override // z5.InterfaceC5280b
    public Object processNotification(C4931c c4931c, int i, InterfaceC5133d interfaceC5133d) {
        Object f6;
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), c4931c.getId(), c4931c.getAndroidId(), new JSONObject(c4931c.getFullData()), c4931c.getCreatedAt(), true, false);
        return (i <= 0 || (f6 = AbstractC0399y.f((long) i, interfaceC5133d)) != EnumC5179a.f41704n) ? v.f40183a : f6;
    }
}
