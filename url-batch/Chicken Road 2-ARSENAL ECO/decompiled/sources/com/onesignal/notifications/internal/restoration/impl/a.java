package com.onesignal.notifications.internal.restoration.impl;

import H5.AbstractC0165z;
import R2.c;
import R2.d;
import T1.f;
import a3.InterfaceC0226b;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k5.v;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class a implements InterfaceC0226b {
    public static final C0070a Companion = new C0070a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final J2.a _badgeCountUpdater;
    private final d _dataController;
    private final T2.b _workManager;

    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0070a {
        public /* synthetic */ C0070a(e eVar) {
            this();
        }

        private C0070a() {
        }
    }

    public static final class b extends AbstractC0607c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f _applicationService, T2.b _workManager, d _dataController, J2.a _badgeCountUpdater) {
        i.e(_applicationService, "_applicationService");
        i.e(_workManager, "_workManager");
        i.e(_dataController, "_dataController");
        i.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = Q2.e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
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
    @Override // a3.InterfaceC0226b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(InterfaceC0564d interfaceC0564d) {
        b bVar;
        int i7;
        a aVar;
        a aVar2;
        Iterator it;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    d dVar = this._dataController;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = dVar.listNotificationsForOutstanding(visibleNotifications, bVar);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                    aVar = this;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar.L$1;
                        aVar2 = (a) bVar.L$0;
                        AbstractC0676f.w(obj);
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            bVar.L$0 = aVar2;
                            bVar.L$1 = it;
                            bVar.label = 2;
                            if (aVar2.processNotification(cVar, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar) == enumC0580a) {
                                return enumC0580a;
                            }
                        }
                        aVar2._badgeCountUpdater.update();
                        return v.f5219a;
                    }
                    aVar = (a) bVar.L$0;
                    AbstractC0676f.w(obj);
                }
                aVar2 = aVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                aVar2._badgeCountUpdater.update();
                return v.f5219a;
            }
        }
        bVar = new b(interfaceC0564d);
        Object obj2 = bVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar.label;
        if (i7 != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        aVar2._badgeCountUpdater.update();
        return v.f5219a;
    }

    @Override // a3.InterfaceC0226b
    public Object processNotification(c cVar, int i7, InterfaceC0564d interfaceC0564d) {
        Object d7;
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), cVar.getId(), cVar.getAndroidId(), new JSONObject(cVar.getFullData()), cVar.getCreatedAt(), true, false);
        return (i7 <= 0 || (d7 = AbstractC0165z.d((long) i7, interfaceC0564d)) != EnumC0580a.f5697f) ? v.f5219a : d7;
    }
}
