package com.onesignal.notifications.internal.data.impl;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import ge.a0;
import ge.k0;
import ge.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import wd.b0;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements cc.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final ea.f _applicationService;
    private final ub.a _badgeCountUpdater;
    private final ha.d _databaseProvider;
    private final cc.a _queryHelper;
    private final sa.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", pc.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $body;
        final /* synthetic */ String $collapseKey;
        final /* synthetic */ long $expireTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isOpened;
        final /* synthetic */ String $jsonPayload;
        final /* synthetic */ boolean $shouldDismissIdenticals;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, int i3, b bVar, String str2, String str3, boolean z11, String str4, String str5, long j, String str6, ld.a aVar) {
            super(2, aVar);
            this.$id = str;
            this.$shouldDismissIdenticals = z10;
            this.$androidId = i3;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z11;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j;
            this.$jsonPayload = str6;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            com.onesignal.debug.internal.logging.b.debug$default("Saving Notification id=" + this.$id, null, 2, null);
            try {
                if (this.$shouldDismissIdenticals) {
                    String str = "android_notification_id = " + this.$androidId;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", new Integer(1));
                    this.this$0._databaseProvider.getOs().update("notification", contentValues, str, null);
                    this.this$0._badgeCountUpdater.update();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(pc.e.NOTIFICATION_ID_TAG, this.$id);
                String str2 = this.$groupId;
                if (str2 != null) {
                    contentValues2.put("group_id", str2);
                }
                String str3 = this.$collapseKey;
                if (str3 != null) {
                    contentValues2.put("collapse_id", str3);
                }
                contentValues2.put("opened", new Integer(this.$isOpened ? 1 : 0));
                if (!this.$isOpened) {
                    contentValues2.put("android_notification_id", new Integer(this.$androidId));
                }
                String str4 = this.$title;
                if (str4 != null) {
                    contentValues2.put("title", str4);
                }
                String str5 = this.$body;
                if (str5 != null) {
                    contentValues2.put("message", str5);
                }
                contentValues2.put("expire_time", new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                com.onesignal.debug.internal.logging.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends nd.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i3, String str, b bVar, ld.a aVar) {
            super(2, aVar);
            this.$androidId = i3;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new d(this.$androidId, this.$groupId, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((d) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends nd.i implements Function2 {
        int label;

        public e(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new e(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            valueOf.getClass();
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class f extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class h extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class j extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class l extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class n extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class p extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class r extends nd.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z10, boolean z11, b bVar, int i3, ld.a aVar) {
            super(2, aVar);
            this.$summaryGroup = str;
            this.$dismissed = z10;
            this.$clearGroupOnSummaryClick = z11;
            this.this$0 = bVar;
            this.$androidId = i3;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((r) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
        @Override // nd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String str;
            String str2;
            boolean z10;
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                cf.c.M(obj);
                String str3 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str3 != null) {
                    boolean a9 = Intrinsics.a(str3, bc.e.GROUPLESS_SUMMARY_KEY);
                    if (a9) {
                        str2 = "group_id IS NULL";
                    } else {
                        strArr2 = new String[]{this.$summaryGroup};
                        str2 = "group_id = ?";
                    }
                    String str4 = str2;
                    String[] strArr3 = strArr2;
                    str = str4;
                    if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                        strArr = strArr3;
                    } else {
                        b bVar = this.this$0;
                        String str5 = this.$summaryGroup;
                        this.L$0 = str;
                        this.Z$0 = a9;
                        this.label = 1;
                        Object androidIdForGroup = bVar.getAndroidIdForGroup(str5, false, this);
                        if (androidIdForGroup == aVar) {
                            return aVar;
                        }
                        z10 = a9;
                        obj = androidIdForGroup;
                    }
                } else {
                    strArr = null;
                    str = "android_notification_id = " + this.$androidId;
                }
                ContentValues contentValues = new ContentValues();
                if (this.$dismissed) {
                    contentValues.put("opened", new Integer(1));
                } else {
                    contentValues.put("dismissed", new Integer(1));
                }
                this.this$0._databaseProvider.getOs().update("notification", contentValues, str, strArr);
                this.this$0._badgeCountUpdater.update();
                return Unit.f5554a;
            }
            if (i3 != 1) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z10 = this.Z$0;
            str = (String) this.L$0;
            cf.c.M(obj);
            String valueOf = String.valueOf(obj);
            str = str + " AND android_notification_id = ?";
            strArr = z10 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class s extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class t extends nd.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ z $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(z zVar, b bVar, int i3, ld.a aVar) {
            super(2, aVar);
            this.$didDismiss = zVar;
            this.this$0 = bVar;
            this.$androidId = i3;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((t) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            this.$didDismiss.f10164d = this.this$0.internalMarkAsDismissed(this.$androidId);
            return Unit.f5554a;
        }
    }

    public b(ea.f fVar, cc.a aVar, ha.d dVar, sa.a aVar2, ub.a aVar3) {
        fVar.getClass();
        aVar.getClass();
        dVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = dVar;
        this._time = aVar2;
        this._badgeCountUpdater = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i3) {
        Context appContext = this._applicationService.getAppContext();
        String f3 = n0.l.f(i3, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z10 = this._databaseProvider.getOs().update("notification", contentValues, f3, null) > 0;
        this._badgeCountUpdater.update();
        bc.e.INSTANCE.getNotificationManager(appContext).cancel(i3);
        return z10;
    }

    @Override // cc.d
    public Object clearOldestOverLimitFallback(int i3, int i10, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new C0051b(i10, this, i3, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // cc.d
    public Object createNotification(String str, String str2, String str3, boolean z10, boolean z11, int i3, String str4, String str5, long j3, String str6, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new c(str, z10, i3, this, str2, str3, z11, str4, str5, j3, str6, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // cc.d
    public Object createSummaryNotification(int i3, String str, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new d(i3, str, this, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // cc.d
    public Object deleteExpiredNotifications(ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new e(null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, ld.a aVar) {
        f fVar;
        int i3;
        z zVar;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = fVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    z zVar2 = new z();
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    g gVar = new g(str, this, zVar2, null);
                    fVar.L$0 = zVar2;
                    fVar.label = 1;
                    if (a0.B(dVar, gVar, fVar) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) fVar.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        fVar = new f(aVar);
        Object obj2 = fVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = fVar.label;
        if (i3 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z10, ld.a aVar) {
        h hVar;
        int i3;
        b0 b0Var;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = hVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    b0 b0Var2 = new b0();
                    boolean a9 = Intrinsics.a(str, bc.e.GROUPLESS_SUMMARY_KEY);
                    b0 b0Var3 = new b0();
                    b0Var3.f10141d = a9 ? "group_id IS NULL" : "group_id = ?";
                    b0Var3.f10141d = v4.a.o(new StringBuilder(), (String) b0Var3.f10141d, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) b0Var3.f10141d);
                    sb2.append(z10 ? "is_summary = 1" : "is_summary = 0");
                    b0Var3.f10141d = sb2.toString();
                    String[] strArr = a9 ? null : new String[]{str};
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    i iVar = new i(b0Var3, strArr, b0Var2, null);
                    hVar.L$0 = b0Var2;
                    hVar.label = 1;
                    if (a0.B(dVar, iVar, hVar) == aVar2) {
                        return aVar2;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) hVar.L$0;
                    cf.c.M(obj);
                }
                return b0Var.f10141d;
            }
        }
        hVar = new h(aVar);
        Object obj2 = hVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = hVar.label;
        if (i3 != 0) {
        }
        return b0Var.f10141d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, ld.a aVar) {
        j jVar;
        int i3;
        b0 b0Var;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = jVar.label;
                if (i3 != 0) {
                    cf.c.M(obj);
                    b0 b0Var2 = new b0();
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    k kVar = new k(str, b0Var2, null);
                    jVar.L$0 = b0Var2;
                    jVar.label = 1;
                    if (a0.B(dVar, kVar, jVar) == aVar2) {
                        return aVar2;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) jVar.L$0;
                    cf.c.M(obj);
                }
                return b0Var.f10141d;
            }
        }
        jVar = new j(aVar);
        Object obj2 = jVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = jVar.label;
        if (i3 != 0) {
        }
        return b0Var.f10141d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i3, ld.a aVar) {
        l lVar;
        int i10;
        b0 b0Var;
        if (aVar instanceof l) {
            lVar = (l) aVar;
            int i11 = lVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.label = i11 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                md.a aVar2 = md.a.f6622d;
                i10 = lVar.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    b0 b0Var2 = new b0();
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    m mVar = new m(i3, b0Var2, null);
                    lVar.L$0 = b0Var2;
                    lVar.label = 1;
                    if (a0.B(dVar, mVar, lVar) == aVar2) {
                        return aVar2;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i10 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (b0) lVar.L$0;
                    cf.c.M(obj);
                }
                return b0Var.f10141d;
            }
        }
        lVar = new l(aVar);
        Object obj2 = lVar.result;
        md.a aVar22 = md.a.f6622d;
        i10 = lVar.label;
        if (i10 != 0) {
        }
        return b0Var.f10141d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, ld.a aVar) {
        n nVar;
        int i3;
        if (aVar instanceof n) {
            nVar = (n) aVar;
            int i10 = nVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.label = i10 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = nVar.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list = (List) nVar.L$0;
                    cf.c.M(obj);
                    return list;
                }
                cf.c.M(obj);
                ArrayList arrayList = new ArrayList();
                ne.e eVar = k0.f4372a;
                ne.d dVar = ne.d.f7275i;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                return a0.B(dVar, oVar, nVar) == aVar2 ? aVar2 : arrayList;
            }
        }
        nVar = new n(aVar);
        Object obj2 = nVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = nVar.label;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, ld.a aVar) {
        p pVar;
        int i3;
        if (aVar instanceof p) {
            pVar = (p) aVar;
            int i10 = pVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.label = i10 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = pVar.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = (List) pVar.L$0;
                    cf.c.M(obj);
                    return list2;
                }
                cf.c.M(obj);
                ArrayList arrayList = new ArrayList();
                ne.e eVar = k0.f4372a;
                ne.d dVar = ne.d.f7275i;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                return a0.B(dVar, qVar, pVar) == aVar2 ? aVar2 : arrayList;
            }
        }
        pVar = new p(aVar);
        Object obj2 = pVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = pVar.label;
        if (i3 == 0) {
        }
    }

    @Override // cc.d
    public Object markAsConsumed(int i3, boolean z10, String str, boolean z11, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new r(str, z10, z11, this, i3, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // cc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i3, ld.a aVar) {
        s sVar;
        int i10;
        z zVar;
        if (aVar instanceof s) {
            sVar = (s) aVar;
            int i11 = sVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.label = i11 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                md.a aVar2 = md.a.f6622d;
                i10 = sVar.label;
                if (i10 != 0) {
                    cf.c.M(obj);
                    z zVar2 = new z();
                    ne.e eVar = k0.f4372a;
                    ne.d dVar = ne.d.f7275i;
                    t tVar = new t(zVar2, this, i3, null);
                    sVar.L$0 = zVar2;
                    sVar.label = 1;
                    if (a0.B(dVar, tVar, sVar) == aVar2) {
                        return aVar2;
                    }
                    zVar = zVar2;
                } else {
                    if (i10 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zVar = (z) sVar.L$0;
                    cf.c.M(obj);
                }
                return Boolean.valueOf(zVar.f10164d);
            }
        }
        sVar = new s(aVar);
        Object obj2 = sVar.result;
        md.a aVar22 = md.a.f6622d;
        i10 = sVar.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(zVar.f10164d);
    }

    @Override // cc.d
    public Object markAsDismissedForGroup(String str, ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new u(str, null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    @Override // cc.d
    public Object markAsDismissedForOutstanding(ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new v(null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class m extends nd.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ b0 $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i3, b0 b0Var, ld.a aVar) {
            super(2, aVar);
            this.$androidId = i3;
            this.$groupId = b0Var;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new m(this.$androidId, this.$groupId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((m) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ha.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ b0 $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0 b0Var) {
                super(1);
                this.$groupId = b0Var;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    this.$groupId.f10141d = aVar.getOptString("group_id");
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class k extends nd.i implements Function2 {
        final /* synthetic */ b0 $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, b0 b0Var, ld.a aVar) {
            super(2, aVar);
            this.$collapseKey = str;
            this.$androidId = b0Var;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new k(this.$collapseKey, this.$androidId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((k) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ha.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ b0 $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0 b0Var) {
                super(1);
                this.$androidId = b0Var;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    this.$androidId.f10141d = Integer.valueOf(aVar.getInt("android_notification_id"));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class u extends nd.i implements Function2 {
        final /* synthetic */ String $group;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, ld.a aVar) {
            super(2, aVar);
            this.$group = str;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new u(this.$group, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((u) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            NotificationManager notificationManager = bc.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            ha.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                while (aVar.moveToNext()) {
                    int i3 = aVar.getInt("android_notification_id");
                    if (i3 != -1) {
                        this.$notificationManager.cancel(i3);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class i extends nd.i implements Function2 {
        final /* synthetic */ b0 $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ b0 $whereStr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(b0 b0Var, String[] strArr, b0 b0Var2, ld.a aVar) {
            super(2, aVar);
            this.$whereStr = b0Var;
            this.$whereArgs = strArr;
            this.$recentId = b0Var2;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((i) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ha.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f10141d, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ b0 $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b0 b0Var) {
                super(1);
                this.$recentId = b0Var;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                boolean moveToFirst = aVar.moveToFirst();
                this.$recentId.f10141d = !moveToFirst ? null : Integer.valueOf(aVar.getInt("android_notification_id"));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class v extends nd.i implements Function2 {
        int label;

        public v(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new v(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((v) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            NotificationManager notificationManager = bc.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            ha.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(aVar.getInt("android_notification_id"));
                    } while (aVar.moveToNext());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class g extends nd.i implements Function2 {
        final /* synthetic */ String $id;
        final /* synthetic */ z $result;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, z zVar, ld.a aVar) {
            super(2, aVar);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = zVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new g(this.$id, this.this$0, this.$result, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            String[] strArr = {pc.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            str.getClass();
            ha.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ String $id;
            final /* synthetic */ z $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, z zVar) {
                super(1);
                this.$id = str;
                this.$result = zVar;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f10164d = true;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.notifications.internal.data.impl.b$b, reason: collision with other inner class name */
    public static final class C0051b extends nd.i implements Function2 {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0051b(int i3, b bVar, int i10, ld.a aVar) {
            super(2, aVar);
            this.$maxNumberOfNotificationsInt = i3;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i10;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new C0051b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((C0051b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                ha.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error clearing oldest notifications over limit! ", th);
            }
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i3, int i10, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i3;
                this.$notificationsToMakeRoomFor = i10;
                this.this$0 = bVar;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                int count = (aVar.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (aVar.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(aVar.getInt("android_notification_id"));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class q extends nd.i implements Function2 {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<cc.c> $listOfNotifications;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<cc.c> list2, ld.a aVar) {
            super(2, aVar);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((q) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            ha.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(gc.a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ List<cc.c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<cc.c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                while (aVar.moveToNext()) {
                    String optString = aVar.getOptString("title");
                    String optString2 = aVar.getOptString("message");
                    String string = aVar.getString(pc.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new cc.c(aVar.getInt("android_notification_id"), string, aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class o extends nd.i implements Function2 {
        final /* synthetic */ List<cc.c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<cc.c> list, ld.a aVar) {
            super(2, aVar);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((o) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            ha.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        public static final class a extends wd.p implements Function1 {
            final /* synthetic */ List<cc.c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<cc.c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    do {
                        try {
                            String optString = aVar.getOptString("title");
                            String optString2 = aVar.getOptString("message");
                            this.$listOfNotifications.add(new cc.c(aVar.getInt("android_notification_id"), aVar.getString(pc.e.NOTIFICATION_ID_TAG), aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (aVar.moveToNext());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ha.a) obj);
                return Unit.f5554a;
            }
        }
    }
}
