package com.onesignal.notifications.internal.data.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import g2.InterfaceC0391a;
import java.util.ArrayList;
import java.util.List;
import o5.InterfaceC0564d;
import org.json.JSONException;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class b implements R2.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final T1.f _applicationService;
    private final J2.a _badgeCountUpdater;
    private final W1.d _databaseProvider;
    private final R2.a _queryHelper;
    private final InterfaceC0391a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", i3.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.notifications.internal.data.impl.b$b, reason: collision with other inner class name */
    public static final class C0059b extends q5.g implements InterfaceC0747p {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i7, int i8, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i7;
                this.$notificationsToMakeRoomFor = i8;
                this.this$0 = bVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
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
        public C0059b(int i7, b bVar, int i8, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$maxNumberOfNotificationsInt = i7;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i8;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new C0059b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((C0059b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                W1.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("Error clearing oldest notifications over limit! ", th);
            }
            return k5.v.f5219a;
        }
    }

    public static final class c extends q5.g implements InterfaceC0747p {
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
        public c(String str, boolean z5, int i7, b bVar, String str2, String str3, boolean z6, String str4, String str5, long j4, String str6, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$id = str;
            this.$shouldDismissIdenticals = z5;
            this.$androidId = i7;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z6;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j4;
            this.$jsonPayload = str6;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((c) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
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
                contentValues2.put(i3.e.NOTIFICATION_ID_TAG, this.$id);
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
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            return k5.v.f5219a;
        }
    }

    public static final class d extends q5.g implements InterfaceC0747p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i7, String str, b bVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$androidId = i7;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new d(this.$androidId, this.$groupId, this.this$0, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return k5.v.f5219a;
        }
    }

    public static final class e extends q5.g implements InterfaceC0747p {
        int label;

        public e(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new e(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            kotlin.jvm.internal.i.d(valueOf, "valueOf(...)");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return k5.v.f5219a;
        }
    }

    public static final class f extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    public static final class g extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $id;
        final /* synthetic */ kotlin.jvm.internal.q $result;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ String $id;
            final /* synthetic */ kotlin.jvm.internal.q $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, kotlin.jvm.internal.q qVar) {
                super(1);
                this.$id = str;
                this.$result = qVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                if (it.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f5231f = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, kotlin.jvm.internal.q qVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = qVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new g(this.$id, this.this$0, this.$result, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((g) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            String[] strArr = {i3.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            kotlin.jvm.internal.i.b(str);
            W1.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return k5.v.f5219a;
        }
    }

    public static final class h extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    public static final class i extends q5.g implements InterfaceC0747p {
        final /* synthetic */ kotlin.jvm.internal.s $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ kotlin.jvm.internal.s $whereStr;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ kotlin.jvm.internal.s $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.s sVar) {
                super(1);
                this.$recentId = sVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                boolean moveToFirst = it.moveToFirst();
                this.$recentId.f5233f = !moveToFirst ? null : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.jvm.internal.s sVar, String[] strArr, kotlin.jvm.internal.s sVar2, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$whereStr = sVar;
            this.$whereArgs = strArr;
            this.$recentId = sVar2;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((i) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            W1.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f5233f, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return k5.v.f5219a;
        }
    }

    public static final class j extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    public static final class k extends q5.g implements InterfaceC0747p {
        final /* synthetic */ kotlin.jvm.internal.s $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ kotlin.jvm.internal.s $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.s sVar) {
                super(1);
                this.$androidId = sVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.f5233f = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, kotlin.jvm.internal.s sVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$collapseKey = str;
            this.$androidId = sVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new k(this.$collapseKey, this.$androidId, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((k) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            W1.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return k5.v.f5219a;
        }
    }

    public static final class l extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    public static final class m extends q5.g implements InterfaceC0747p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ kotlin.jvm.internal.s $groupId;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ kotlin.jvm.internal.s $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.s sVar) {
                super(1);
                this.$groupId = sVar;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.f5233f = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i7, kotlin.jvm.internal.s sVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$androidId = i7;
            this.$groupId = sVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new m(this.$androidId, this.$groupId, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((m) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            W1.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return k5.v.f5219a;
        }
    }

    public static final class n extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    public static final class o extends q5.g implements InterfaceC0747p {
        final /* synthetic */ List<R2.c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ List<R2.c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<R2.c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new R2.c(it.getInt("android_notification_id"), it.getString(i3.e.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<R2.c> list, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((o) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            W1.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return k5.v.f5219a;
        }
    }

    public static final class p extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    public static final class q extends q5.g implements InterfaceC0747p {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<R2.c> $listOfNotifications;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ List<R2.c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<R2.c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(i3.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new R2.c(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<R2.c> list2, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((q) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            W1.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(V2.a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return k5.v.f5219a;
        }
    }

    public static final class r extends q5.g implements InterfaceC0747p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z5, boolean z6, b bVar, int i7, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$summaryGroup = str;
            this.$dismissed = z5;
            this.$clearGroupOnSummaryClick = z6;
            this.this$0 = bVar;
            this.$androidId = i7;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((r) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
        @Override // q5.AbstractC0605a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String str;
            String str2;
            boolean z5;
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                String str3 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str3 != null) {
                    boolean a7 = kotlin.jvm.internal.i.a(str3, Q2.e.GROUPLESS_SUMMARY_KEY);
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
                        if (androidIdForGroup == enumC0580a) {
                            return enumC0580a;
                        }
                        z5 = a7;
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
                return k5.v.f5219a;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z5 = this.Z$0;
            str = (String) this.L$0;
            AbstractC0676f.w(obj);
            String valueOf = String.valueOf(obj);
            str = W4.o.d(str, " AND android_notification_id = ?");
            strArr = z5 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return k5.v.f5219a;
        }
    }

    public static final class s extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    public static final class t extends q5.g implements InterfaceC0747p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ kotlin.jvm.internal.q $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(kotlin.jvm.internal.q qVar, b bVar, int i7, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$didDismiss = qVar;
            this.this$0 = bVar;
            this.$androidId = i7;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((t) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            this.$didDismiss.f5231f = this.this$0.internalMarkAsDismissed(this.$androidId);
            return k5.v.f5219a;
        }
    }

    public static final class u extends q5.g implements InterfaceC0747p {
        final /* synthetic */ String $group;
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                while (it.moveToNext()) {
                    int i7 = it.getInt("android_notification_id");
                    if (i7 != -1) {
                        this.$notificationManager.cancel(i7);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$group = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new u(this.$group, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((u) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            NotificationManager notificationManager = Q2.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            W1.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return k5.v.f5219a;
        }
    }

    public static final class v extends q5.g implements InterfaceC0747p {
        int label;

        public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return k5.v.f5219a;
            }

            public final void invoke(W1.a it) {
                kotlin.jvm.internal.i.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(it.getInt("android_notification_id"));
                    } while (it.moveToNext());
                }
            }
        }

        public v(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return b.this.new v(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((v) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(k5.v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            NotificationManager notificationManager = Q2.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            W1.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return k5.v.f5219a;
        }
    }

    public b(T1.f _applicationService, R2.a _queryHelper, W1.d _databaseProvider, InterfaceC0391a _time, J2.a _badgeCountUpdater) {
        kotlin.jvm.internal.i.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.i.e(_queryHelper, "_queryHelper");
        kotlin.jvm.internal.i.e(_databaseProvider, "_databaseProvider");
        kotlin.jvm.internal.i.e(_time, "_time");
        kotlin.jvm.internal.i.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i7) {
        Context appContext = this._applicationService.getAppContext();
        String g7 = C1.c.g("android_notification_id = ", i7, " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z5 = this._databaseProvider.getOs().update("notification", contentValues, g7, null) > 0;
        this._badgeCountUpdater.update();
        Q2.e.INSTANCE.getNotificationManager(appContext).cancel(i7);
        return z5;
    }

    @Override // R2.d
    public Object clearOldestOverLimitFallback(int i7, int i8, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new C0059b(i8, this, i7, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    @Override // R2.d
    public Object createNotification(String str, String str2, String str3, boolean z5, boolean z6, int i7, String str4, String str5, long j4, String str6, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new c(str, z5, i7, this, str2, str3, z6, str4, str5, j4, str6, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    @Override // R2.d
    public Object createSummaryNotification(int i7, String str, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new d(i7, str, this, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    @Override // R2.d
    public Object deleteExpiredNotifications(InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new e(null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, InterfaceC0564d interfaceC0564d) {
        f fVar;
        int i7;
        kotlin.jvm.internal.q qVar;
        if (interfaceC0564d instanceof f) {
            fVar = (f) interfaceC0564d;
            int i8 = fVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.label = i8 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = fVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    kotlin.jvm.internal.q qVar2 = new kotlin.jvm.internal.q();
                    O5.c cVar = F.f1029c;
                    g gVar = new g(str, this, qVar2, null);
                    fVar.L$0 = qVar2;
                    fVar.label = 1;
                    if (AbstractC0165z.t(cVar, gVar, fVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (kotlin.jvm.internal.q) fVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        fVar = new f(interfaceC0564d);
        Object obj2 = fVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = fVar.label;
        if (i7 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z5, InterfaceC0564d interfaceC0564d) {
        h hVar;
        int i7;
        kotlin.jvm.internal.s sVar;
        if (interfaceC0564d instanceof h) {
            hVar = (h) interfaceC0564d;
            int i8 = hVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.label = i8 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = hVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                    boolean a7 = kotlin.jvm.internal.i.a(str, Q2.e.GROUPLESS_SUMMARY_KEY);
                    kotlin.jvm.internal.s sVar3 = new kotlin.jvm.internal.s();
                    sVar3.f5233f = a7 ? "group_id IS NULL" : "group_id = ?";
                    sVar3.f5233f = N.p.b(new StringBuilder(), (String) sVar3.f5233f, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) sVar3.f5233f);
                    sb.append(z5 ? "is_summary = 1" : "is_summary = 0");
                    sVar3.f5233f = sb.toString();
                    String[] strArr = a7 ? null : new String[]{str};
                    O5.c cVar = F.f1029c;
                    i iVar = new i(sVar3, strArr, sVar2, null);
                    hVar.L$0 = sVar2;
                    hVar.label = 1;
                    if (AbstractC0165z.t(cVar, iVar, hVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    sVar = sVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (kotlin.jvm.internal.s) hVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return sVar.f5233f;
            }
        }
        hVar = new h(interfaceC0564d);
        Object obj2 = hVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = hVar.label;
        if (i7 != 0) {
        }
        return sVar.f5233f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, InterfaceC0564d interfaceC0564d) {
        j jVar;
        int i7;
        kotlin.jvm.internal.s sVar;
        if (interfaceC0564d instanceof j) {
            jVar = (j) interfaceC0564d;
            int i8 = jVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.label = i8 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = jVar.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                    O5.c cVar = F.f1029c;
                    k kVar = new k(str, sVar2, null);
                    jVar.L$0 = sVar2;
                    jVar.label = 1;
                    if (AbstractC0165z.t(cVar, kVar, jVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    sVar = sVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (kotlin.jvm.internal.s) jVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return sVar.f5233f;
            }
        }
        jVar = new j(interfaceC0564d);
        Object obj2 = jVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = jVar.label;
        if (i7 != 0) {
        }
        return sVar.f5233f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i7, InterfaceC0564d interfaceC0564d) {
        l lVar;
        int i8;
        kotlin.jvm.internal.s sVar;
        if (interfaceC0564d instanceof l) {
            lVar = (l) interfaceC0564d;
            int i9 = lVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                lVar.label = i9 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = lVar.label;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                    O5.c cVar = F.f1029c;
                    m mVar = new m(i7, sVar2, null);
                    lVar.L$0 = sVar2;
                    lVar.label = 1;
                    if (AbstractC0165z.t(cVar, mVar, lVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    sVar = sVar2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (kotlin.jvm.internal.s) lVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return sVar.f5233f;
            }
        }
        lVar = new l(interfaceC0564d);
        Object obj2 = lVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = lVar.label;
        if (i8 != 0) {
        }
        return sVar.f5233f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, InterfaceC0564d interfaceC0564d) {
        n nVar;
        int i7;
        if (interfaceC0564d instanceof n) {
            nVar = (n) interfaceC0564d;
            int i8 = nVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.label = i8 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = nVar.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) nVar.L$0;
                    AbstractC0676f.w(obj);
                    return list;
                }
                AbstractC0676f.w(obj);
                ArrayList arrayList = new ArrayList();
                O5.c cVar = F.f1029c;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                return AbstractC0165z.t(cVar, oVar, nVar) == enumC0580a ? enumC0580a : arrayList;
            }
        }
        nVar = new n(interfaceC0564d);
        Object obj2 = nVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = nVar.label;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, InterfaceC0564d interfaceC0564d) {
        p pVar;
        int i7;
        if (interfaceC0564d instanceof p) {
            pVar = (p) interfaceC0564d;
            int i8 = pVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                pVar.label = i8 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = pVar.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) pVar.L$0;
                    AbstractC0676f.w(obj);
                    return list2;
                }
                AbstractC0676f.w(obj);
                ArrayList arrayList = new ArrayList();
                O5.c cVar = F.f1029c;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                return AbstractC0165z.t(cVar, qVar, pVar) == enumC0580a ? enumC0580a : arrayList;
            }
        }
        pVar = new p(interfaceC0564d);
        Object obj2 = pVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = pVar.label;
        if (i7 == 0) {
        }
    }

    @Override // R2.d
    public Object markAsConsumed(int i7, boolean z5, String str, boolean z6, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new r(str, z5, z6, this, i7, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // R2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i7, InterfaceC0564d interfaceC0564d) {
        s sVar;
        int i8;
        kotlin.jvm.internal.q qVar;
        if (interfaceC0564d instanceof s) {
            sVar = (s) interfaceC0564d;
            int i9 = sVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sVar.label = i9 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i8 = sVar.label;
                if (i8 != 0) {
                    AbstractC0676f.w(obj);
                    kotlin.jvm.internal.q qVar2 = new kotlin.jvm.internal.q();
                    O5.c cVar = F.f1029c;
                    t tVar = new t(qVar2, this, i7, null);
                    sVar.L$0 = qVar2;
                    sVar.label = 1;
                    if (AbstractC0165z.t(cVar, tVar, sVar) == enumC0580a) {
                        return enumC0580a;
                    }
                    qVar = qVar2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (kotlin.jvm.internal.q) sVar.L$0;
                    AbstractC0676f.w(obj);
                }
                return Boolean.valueOf(qVar.f5231f);
            }
        }
        sVar = new s(interfaceC0564d);
        Object obj2 = sVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i8 = sVar.label;
        if (i8 != 0) {
        }
        return Boolean.valueOf(qVar.f5231f);
    }

    @Override // R2.d
    public Object markAsDismissedForGroup(String str, InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new u(str, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }

    @Override // R2.d
    public Object markAsDismissedForOutstanding(InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new v(null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : k5.v.f5219a;
    }
}
