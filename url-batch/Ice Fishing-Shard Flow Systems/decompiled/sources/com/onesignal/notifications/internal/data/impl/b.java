package com.onesignal.notifications.internal.data.impl;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.InterfaceC0661a;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import org.json.JSONException;
import t3.C0928c;
import t3.InterfaceC0926a;
import u6.C0953e;
import u6.ExecutorC0952d;
import x3.C1005a;
import y2.AbstractC1025b;
import y2.InterfaceC1024a;
import y2.InterfaceC1027d;

/* loaded from: classes.dex */
public final class b implements t3.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final v2.f _applicationService;
    private final InterfaceC0661a _badgeCountUpdater;
    private final InterfaceC1027d _databaseProvider;
    private final InterfaceC0926a _queryHelper;
    private final I2.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", K3.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

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

    /* renamed from: com.onesignal.notifications.internal.data.impl.b$b, reason: collision with other inner class name */
    public static final class C0059b extends X5.j implements Function2 {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i2, int i5, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i2;
                this.$notificationsToMakeRoomFor = i5;
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int count = (it.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (it.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(it.getInt("android_notification_id"));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0059b(int i2, b bVar, int i5, V5.b bVar2) {
            super(2, bVar2);
            this.$maxNumberOfNotificationsInt = i2;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i5;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new C0059b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                AbstractC1025b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("Error clearing oldest notifications over limit! ", th);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((C0059b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class c extends X5.j implements Function2 {
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
        public c(String str, boolean z7, int i2, b bVar, String str2, String str3, boolean z8, String str4, String str5, long j, String str6, V5.b bVar2) {
            super(2, bVar2);
            this.$id = str;
            this.$shouldDismissIdenticals = z7;
            this.$androidId = i2;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z8;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j;
            this.$jsonPayload = str6;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
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
                contentValues2.put(K3.e.NOTIFICATION_ID_TAG, this.$id);
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
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((c) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class d extends X5.j implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i2, String str, b bVar, V5.b bVar2) {
            super(2, bVar2);
            this.$androidId = i2;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new d(this.$androidId, this.$groupId, this.this$0, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((d) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class e extends X5.j implements Function2 {
        int label;

        public e(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new e(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((e) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class f extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    public static final class g extends X5.j implements Function2 {
        final /* synthetic */ String $id;
        final /* synthetic */ B $result;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ String $id;
            final /* synthetic */ B $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, B b7) {
                super(1);
                this.$id = str;
                this.$result = b7;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f6150d = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, B b7, V5.b bVar2) {
            super(2, bVar2);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = b7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new g(this.$id, this.this$0, this.$result, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            String[] strArr = {K3.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            Intrinsics.b(str);
            AbstractC1025b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((g) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class h extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    public static final class i extends X5.j implements Function2 {
        final /* synthetic */ D $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ D $whereStr;
        int label;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ D $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(D d7) {
                super(1);
                this.$recentId = d7;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean moveToFirst = it.moveToFirst();
                this.$recentId.f6152d = !moveToFirst ? null : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(D d7, String[] strArr, D d8, V5.b bVar) {
            super(2, bVar);
            this.$whereStr = d7;
            this.$whereArgs = strArr;
            this.$recentId = d8;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            AbstractC1025b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f6152d, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((i) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class j extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    public static final class k extends X5.j implements Function2 {
        final /* synthetic */ D $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ D $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(D d7) {
                super(1);
                this.$androidId = d7;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.f6152d = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, D d7, V5.b bVar) {
            super(2, bVar);
            this.$collapseKey = str;
            this.$androidId = d7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new k(this.$collapseKey, this.$androidId, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            AbstractC1025b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((k) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class l extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    public static final class m extends X5.j implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ D $groupId;
        int label;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ D $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(D d7) {
                super(1);
                this.$groupId = d7;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.f6152d = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i2, D d7, V5.b bVar) {
            super(2, bVar);
            this.$androidId = i2;
            this.$groupId = d7;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new m(this.$androidId, this.$groupId, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            AbstractC1025b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((m) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class n extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    public static final class o extends X5.j implements Function2 {
        final /* synthetic */ List<C0928c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ List<C0928c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C0928c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    do {
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new C0928c(it.getInt("android_notification_id"), it.getString(K3.e.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<C0928c> list, V5.b bVar2) {
            super(2, bVar2);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            AbstractC1025b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((o) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class p extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    public static final class q extends X5.j implements Function2 {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<C0928c> $listOfNotifications;
        int label;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ List<C0928c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C0928c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(K3.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new C0928c(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<C0928c> list2, V5.b bVar) {
            super(2, bVar);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            AbstractC1025b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(C1005a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((q) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class r extends X5.j implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z7, boolean z8, b bVar, int i2, V5.b bVar2) {
            super(2, bVar2);
            this.$summaryGroup = str;
            this.$dismissed = z7;
            this.$clearGroupOnSummaryClick = z8;
            this.this$0 = bVar;
            this.$androidId = i2;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
        @Override // X5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String str;
            String str2;
            boolean z7;
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                String str3 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str3 != null) {
                    boolean a7 = Intrinsics.a(str3, s3.e.GROUPLESS_SUMMARY_KEY);
                    if (a7) {
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
                        this.Z$0 = a7;
                        this.label = 1;
                        Object androidIdForGroup = bVar.getAndroidIdForGroup(str5, false, this);
                        if (androidIdForGroup == aVar) {
                            return aVar;
                        }
                        z7 = a7;
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
                return Unit.f6114a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = this.Z$0;
            str = (String) this.L$0;
            V6.b.P(obj);
            String valueOf = String.valueOf(obj);
            str = r4.f.c(str, " AND android_notification_id = ?");
            strArr = z7 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((r) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class s extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    public static final class t extends X5.j implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ B $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(B b7, b bVar, int i2, V5.b bVar2) {
            super(2, bVar2);
            this.$didDismiss = b7;
            this.this$0 = bVar;
            this.$androidId = i2;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            this.$didDismiss.f6150d = this.this$0.internalMarkAsDismissed(this.$androidId);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((t) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class u extends X5.j implements Function2 {
        final /* synthetic */ String $group;
        int label;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                while (it.moveToNext()) {
                    int i2 = it.getInt("android_notification_id");
                    if (i2 != -1) {
                        this.$notificationManager.cancel(i2);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, V5.b bVar) {
            super(2, bVar);
            this.$group = str;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new u(this.$group, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            NotificationManager notificationManager = s3.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            AbstractC1025b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((u) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class v extends X5.j implements Function2 {
        int label;

        public static final class a extends kotlin.jvm.internal.p implements Function1 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(it.getInt("android_notification_id"));
                    } while (it.moveToNext());
                }
            }
        }

        public v(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return b.this.new v(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            NotificationManager notificationManager = s3.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            AbstractC1025b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((v) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public b(v2.f _applicationService, InterfaceC0926a _queryHelper, InterfaceC1027d _databaseProvider, I2.a _time, InterfaceC0661a _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i2) {
        Context appContext = this._applicationService.getAppContext();
        String h7 = C4.p.h(i2, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z7 = this._databaseProvider.getOs().update("notification", contentValues, h7, null) > 0;
        this._badgeCountUpdater.update();
        s3.e.INSTANCE.getNotificationManager(appContext).cancel(i2);
        return z7;
    }

    @Override // t3.d
    public Object clearOldestOverLimitFallback(int i2, int i5, V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new C0059b(i5, this, i2, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // t3.d
    public Object createNotification(String str, String str2, String str3, boolean z7, boolean z8, int i2, String str4, String str5, long j7, String str6, V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new c(str, z7, i2, this, str2, str3, z8, str4, str5, j7, str6, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // t3.d
    public Object createSummaryNotification(int i2, String str, V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new d(i2, str, this, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // t3.d
    public Object deleteExpiredNotifications(V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new e(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, V5.b bVar) {
        f fVar;
        int i2;
        B b7;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i5 = fVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.label = i5 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = fVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    B b8 = new B();
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    g gVar = new g(str, this, b8, null);
                    fVar.L$0 = b8;
                    fVar.label = 1;
                    if (AbstractC0792z.t(executorC0952d, gVar, fVar) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) fVar.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        fVar = new f(bVar);
        Object obj2 = fVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = fVar.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z7, V5.b bVar) {
        h hVar;
        int i2;
        D d7;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i5 = hVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.label = i5 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = hVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    D d8 = new D();
                    boolean a7 = Intrinsics.a(str, s3.e.GROUPLESS_SUMMARY_KEY);
                    D d9 = new D();
                    d9.f6152d = a7 ? "group_id IS NULL" : "group_id = ?";
                    d9.f6152d = r4.f.f(new StringBuilder(), (String) d9.f6152d, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) d9.f6152d);
                    sb.append(z7 ? "is_summary = 1" : "is_summary = 0");
                    d9.f6152d = sb.toString();
                    String[] strArr = a7 ? null : new String[]{str};
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    i iVar = new i(d9, strArr, d8, null);
                    hVar.L$0 = d8;
                    hVar.label = 1;
                    if (AbstractC0792z.t(executorC0952d, iVar, hVar) == aVar) {
                        return aVar;
                    }
                    d7 = d8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = (D) hVar.L$0;
                    V6.b.P(obj);
                }
                return d7.f6152d;
            }
        }
        hVar = new h(bVar);
        Object obj2 = hVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = hVar.label;
        if (i2 != 0) {
        }
        return d7.f6152d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, V5.b bVar) {
        j jVar;
        int i2;
        D d7;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i5 = jVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.label = i5 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = jVar.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    D d8 = new D();
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    k kVar = new k(str, d8, null);
                    jVar.L$0 = d8;
                    jVar.label = 1;
                    if (AbstractC0792z.t(executorC0952d, kVar, jVar) == aVar) {
                        return aVar;
                    }
                    d7 = d8;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = (D) jVar.L$0;
                    V6.b.P(obj);
                }
                return d7.f6152d;
            }
        }
        jVar = new j(bVar);
        Object obj2 = jVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = jVar.label;
        if (i2 != 0) {
        }
        return d7.f6152d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i2, V5.b bVar) {
        l lVar;
        int i5;
        D d7;
        if (bVar instanceof l) {
            lVar = (l) bVar;
            int i7 = lVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.label = i7 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                W5.a aVar = W5.a.f2787d;
                i5 = lVar.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    D d8 = new D();
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    m mVar = new m(i2, d8, null);
                    lVar.L$0 = d8;
                    lVar.label = 1;
                    if (AbstractC0792z.t(executorC0952d, mVar, lVar) == aVar) {
                        return aVar;
                    }
                    d7 = d8;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d7 = (D) lVar.L$0;
                    V6.b.P(obj);
                }
                return d7.f6152d;
            }
        }
        lVar = new l(bVar);
        Object obj2 = lVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i5 = lVar.label;
        if (i5 != 0) {
        }
        return d7.f6152d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, V5.b bVar) {
        n nVar;
        int i2;
        if (bVar instanceof n) {
            nVar = (n) bVar;
            int i5 = nVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nVar.label = i5 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = nVar.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) nVar.L$0;
                    V6.b.P(obj);
                    return list;
                }
                V6.b.P(obj);
                ArrayList arrayList = new ArrayList();
                C0953e c0953e = F.f7011a;
                ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                return AbstractC0792z.t(executorC0952d, oVar, nVar) == aVar ? aVar : arrayList;
            }
        }
        nVar = new n(bVar);
        Object obj2 = nVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = nVar.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, V5.b bVar) {
        p pVar;
        int i2;
        if (bVar instanceof p) {
            pVar = (p) bVar;
            int i5 = pVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pVar.label = i5 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = pVar.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) pVar.L$0;
                    V6.b.P(obj);
                    return list2;
                }
                V6.b.P(obj);
                ArrayList arrayList = new ArrayList();
                C0953e c0953e = F.f7011a;
                ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                return AbstractC0792z.t(executorC0952d, qVar, pVar) == aVar ? aVar : arrayList;
            }
        }
        pVar = new p(bVar);
        Object obj2 = pVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = pVar.label;
        if (i2 == 0) {
        }
    }

    @Override // t3.d
    public Object markAsConsumed(int i2, boolean z7, String str, boolean z8, V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new r(str, z7, z8, this, i2, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i2, V5.b bVar) {
        s sVar;
        int i5;
        B b7;
        if (bVar instanceof s) {
            sVar = (s) bVar;
            int i7 = sVar.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                sVar.label = i7 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                W5.a aVar = W5.a.f2787d;
                i5 = sVar.label;
                if (i5 != 0) {
                    V6.b.P(obj);
                    B b8 = new B();
                    C0953e c0953e = F.f7011a;
                    ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                    t tVar = new t(b8, this, i2, null);
                    sVar.L$0 = b8;
                    sVar.label = 1;
                    if (AbstractC0792z.t(executorC0952d, tVar, sVar) == aVar) {
                        return aVar;
                    }
                    b7 = b8;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7 = (B) sVar.L$0;
                    V6.b.P(obj);
                }
                return Boolean.valueOf(b7.f6150d);
            }
        }
        sVar = new s(bVar);
        Object obj2 = sVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i5 = sVar.label;
        if (i5 != 0) {
        }
        return Boolean.valueOf(b7.f6150d);
    }

    @Override // t3.d
    public Object markAsDismissedForGroup(String str, V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new u(str, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    @Override // t3.d
    public Object markAsDismissedForOutstanding(V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new v(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }
}
