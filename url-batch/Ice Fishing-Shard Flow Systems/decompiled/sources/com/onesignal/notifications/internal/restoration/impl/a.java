package com.onesignal.notifications.internal.restoration.impl;

import X5.c;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.InterfaceC0661a;
import n6.AbstractC0792z;
import org.json.JSONObject;
import s3.e;
import t3.C0928c;
import t3.d;
import v2.f;
import v3.InterfaceC0973b;

/* loaded from: classes.dex */
public final class a implements C3.b {
    public static final C0070a Companion = new C0070a(null);
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private final f _applicationService;
    private final InterfaceC0661a _badgeCountUpdater;
    private final d _dataController;
    private final InterfaceC0973b _workManager;

    /* renamed from: com.onesignal.notifications.internal.restoration.impl.a$a, reason: collision with other inner class name */
    public static final class C0070a {
        public /* synthetic */ C0070a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0070a() {
        }
    }

    public static final class b extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.process(this);
        }
    }

    public a(f _applicationService, InterfaceC0973b _workManager, d _dataController, InterfaceC0661a _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_workManager, "_workManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._workManager = _workManager;
        this._dataController = _dataController;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    private final List<Integer> getVisibleNotifications() {
        StatusBarNotification[] activeNotifications = e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext());
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
    @Override // C3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object process(V5.b bVar) {
        b bVar2;
        int i2;
        a aVar;
        a aVar2;
        Iterator it;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                Object obj = bVar2.result;
                W5.a aVar3 = W5.a.f2787d;
                i2 = bVar2.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    com.onesignal.debug.internal.logging.b.info$default("Restoring notifications", null, 2, null);
                    List<Integer> visibleNotifications = getVisibleNotifications();
                    d dVar = this._dataController;
                    bVar2.L$0 = this;
                    bVar2.label = 1;
                    obj = dVar.listNotificationsForOutstanding(visibleNotifications, bVar2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) bVar2.L$1;
                        aVar2 = (a) bVar2.L$0;
                        V6.b.P(obj);
                        while (it.hasNext()) {
                            C0928c c0928c = (C0928c) it.next();
                            bVar2.L$0 = aVar2;
                            bVar2.L$1 = it;
                            bVar2.label = 2;
                            if (aVar2.processNotification(c0928c, DELAY_BETWEEN_NOTIFICATION_RESTORES_MS, bVar2) == aVar3) {
                                return aVar3;
                            }
                        }
                        aVar2._badgeCountUpdater.update();
                        return Unit.f6114a;
                    }
                    aVar = (a) bVar2.L$0;
                    V6.b.P(obj);
                }
                aVar2 = aVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                aVar2._badgeCountUpdater.update();
                return Unit.f6114a;
            }
        }
        bVar2 = new b(bVar);
        Object obj2 = bVar2.result;
        W5.a aVar32 = W5.a.f2787d;
        i2 = bVar2.label;
        if (i2 != 0) {
        }
        aVar2 = aVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        aVar2._badgeCountUpdater.update();
        return Unit.f6114a;
    }

    @Override // C3.b
    public Object processNotification(C0928c c0928c, int i2, V5.b bVar) {
        this._workManager.beginEnqueueingWork(this._applicationService.getAppContext(), c0928c.getId(), c0928c.getAndroidId(), new JSONObject(c0928c.getFullData()), c0928c.getCreatedAt(), true, false);
        if (i2 <= 0) {
            return Unit.f6114a;
        }
        Object d7 = AbstractC0792z.d(i2, bVar);
        return d7 == W5.a.f2787d ? d7 : Unit.f6114a;
    }
}
