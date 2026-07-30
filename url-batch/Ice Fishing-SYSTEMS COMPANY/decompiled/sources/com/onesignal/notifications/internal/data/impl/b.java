package com.onesignal.notifications.internal.data.impl;

import D.y;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.e.n;
import com.google.android.gms.internal.ads.CL;
import i5.InterfaceC4577a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import q5.C4931c;
import q5.InterfaceC4929a;
import t0.AbstractC5051n;
import u5.C5113a;
import v7.InterfaceC5133d;
import w4.AbstractC5171b;
import w4.InterfaceC5170a;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class b implements q5.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final t4.f _applicationService;
    private final InterfaceC4577a _badgeCountUpdater;
    private final w4.d _databaseProvider;
    private final InterfaceC4929a _queryHelper;
    private final G4.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", H5.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

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
    public static final class C0228b extends x7.h implements E7.p {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i4, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i;
                this.$notificationsToMakeRoomFor = i4;
                this.this$0 = bVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
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
        public C0228b(int i, b bVar, int i4, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$maxNumberOfNotificationsInt = i;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i4;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new C0228b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((C0228b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                AbstractC5171b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("Error clearing oldest notifications over limit! ", th);
            }
            return q7.v.f40183a;
        }
    }

    public static final class c extends x7.h implements E7.p {
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
        public c(String str, boolean z8, int i, b bVar, String str2, String str3, boolean z9, String str4, String str5, long j9, String str6, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$id = str;
            this.$shouldDismissIdenticals = z8;
            this.$androidId = i;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z9;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j9;
            this.$jsonPayload = str6;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((c) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
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
                contentValues2.put(H5.e.NOTIFICATION_ID_TAG, this.$id);
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
                contentValues2.put(n.a.f13218g, new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                com.onesignal.debug.internal.logging.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            return q7.v.f40183a;
        }
    }

    public static final class d extends x7.h implements E7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, b bVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$androidId = i;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new d(this.$androidId, this.$groupId, this.this$0, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return q7.v.f40183a;
        }
    }

    public static final class e extends x7.h implements E7.p {
        int label;

        public e(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new e(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            kotlin.jvm.internal.h.d(valueOf, "valueOf(...)");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return q7.v.f40183a;
        }
    }

    public static final class f extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    public static final class g extends x7.h implements E7.p {
        final /* synthetic */ String $id;
        final /* synthetic */ kotlin.jvm.internal.p $result;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ String $id;
            final /* synthetic */ kotlin.jvm.internal.p $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, kotlin.jvm.internal.p pVar) {
                super(1);
                this.$id = str;
                this.$result = pVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f38859n = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, kotlin.jvm.internal.p pVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = pVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new g(this.$id, this.this$0, this.$result, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((g) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            String[] strArr = {H5.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            kotlin.jvm.internal.h.b(str);
            AbstractC5171b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return q7.v.f40183a;
        }
    }

    public static final class h extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    public static final class i extends x7.h implements E7.p {
        final /* synthetic */ kotlin.jvm.internal.r $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ kotlin.jvm.internal.r $whereStr;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ kotlin.jvm.internal.r $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.r rVar) {
                super(1);
                this.$recentId = rVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                boolean moveToFirst = it.moveToFirst();
                this.$recentId.f38861n = !moveToFirst ? null : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.jvm.internal.r rVar, String[] strArr, kotlin.jvm.internal.r rVar2, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$whereStr = rVar;
            this.$whereArgs = strArr;
            this.$recentId = rVar2;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((i) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            AbstractC5171b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f38861n, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return q7.v.f40183a;
        }
    }

    public static final class j extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    public static final class k extends x7.h implements E7.p {
        final /* synthetic */ kotlin.jvm.internal.r $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ kotlin.jvm.internal.r $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.r rVar) {
                super(1);
                this.$androidId = rVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.f38861n = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, kotlin.jvm.internal.r rVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$collapseKey = str;
            this.$androidId = rVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new k(this.$collapseKey, this.$androidId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((k) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            AbstractC5171b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return q7.v.f40183a;
        }
    }

    public static final class l extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    public static final class m extends x7.h implements E7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ kotlin.jvm.internal.r $groupId;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ kotlin.jvm.internal.r $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.r rVar) {
                super(1);
                this.$groupId = rVar;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.f38861n = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, kotlin.jvm.internal.r rVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$androidId = i;
            this.$groupId = rVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new m(this.$androidId, this.$groupId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((m) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            AbstractC5171b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return q7.v.f40183a;
        }
    }

    public static final class n extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    public static final class o extends x7.h implements E7.p {
        final /* synthetic */ List<C4931c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ List<C4931c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C4931c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new C4931c(it.getInt("android_notification_id"), it.getString(H5.e.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<C4931c> list, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((o) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            AbstractC5171b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return q7.v.f40183a;
        }
    }

    public static final class p extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    public static final class q extends x7.h implements E7.p {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<C4931c> $listOfNotifications;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ List<C4931c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C4931c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(H5.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new C4931c(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<C4931c> list2, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((q) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            AbstractC5171b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(C5113a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return q7.v.f40183a;
        }
    }

    public static final class r extends x7.h implements E7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z8, boolean z9, b bVar, int i, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$summaryGroup = str;
            this.$dismissed = z8;
            this.$clearGroupOnSummaryClick = z9;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((r) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String str;
            String str2;
            boolean z8;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                String str3 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str3 != null) {
                    boolean a9 = kotlin.jvm.internal.h.a(str3, p5.e.GROUPLESS_SUMMARY_KEY);
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
                        if (androidIdForGroup == enumC5179a) {
                            return enumC5179a;
                        }
                        z8 = a9;
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
                return q7.v.f40183a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z8 = this.Z$0;
            str = (String) this.L$0;
            com.bumptech.glide.f.r(obj);
            String valueOf = String.valueOf(obj);
            str = CL.j(str, " AND android_notification_id = ?");
            strArr = z8 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return q7.v.f40183a;
        }
    }

    public static final class s extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    public static final class t extends x7.h implements E7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ kotlin.jvm.internal.p $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(kotlin.jvm.internal.p pVar, b bVar, int i, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$didDismiss = pVar;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((t) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            this.$didDismiss.f38859n = this.this$0.internalMarkAsDismissed(this.$androidId);
            return q7.v.f40183a;
        }
    }

    public static final class u extends x7.h implements E7.p {
        final /* synthetic */ String $group;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                while (it.moveToNext()) {
                    int i = it.getInt("android_notification_id");
                    if (i != -1) {
                        this.$notificationManager.cancel(i);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$group = str;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new u(this.$group, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((u) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            NotificationManager notificationManager = p5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            AbstractC5171b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return q7.v.f40183a;
        }
    }

    public static final class v extends x7.h implements E7.p {
        int label;

        public static final class a extends kotlin.jvm.internal.i implements E7.l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return q7.v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(it.getInt("android_notification_id"));
                    } while (it.moveToNext());
                }
            }
        }

        public v(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return b.this.new v(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((v) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(q7.v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            NotificationManager notificationManager = p5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            AbstractC5171b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return q7.v.f40183a;
        }
    }

    public b(t4.f _applicationService, InterfaceC4929a _queryHelper, w4.d _databaseProvider, G4.a _time, InterfaceC4577a _badgeCountUpdater) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_queryHelper, "_queryHelper");
        kotlin.jvm.internal.h.e(_databaseProvider, "_databaseProvider");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i4) {
        Context appContext = this._applicationService.getAppContext();
        String i9 = y.i(i4, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z8 = this._databaseProvider.getOs().update("notification", contentValues, i9, null) > 0;
        this._badgeCountUpdater.update();
        p5.e.INSTANCE.getNotificationManager(appContext).cancel(i4);
        return z8;
    }

    @Override // q5.d
    public Object clearOldestOverLimitFallback(int i4, int i9, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new C0228b(i9, this, i4, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    @Override // q5.d
    public Object createNotification(String str, String str2, String str3, boolean z8, boolean z9, int i4, String str4, String str5, long j9, String str6, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new c(str, z8, i4, this, str2, str3, z9, str4, str5, j9, str6, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    @Override // q5.d
    public Object createSummaryNotification(int i4, String str, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new d(i4, str, this, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    @Override // q5.d
    public Object deleteExpiredNotifications(InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new e(null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, InterfaceC5133d interfaceC5133d) {
        f fVar;
        int i4;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof f) {
            fVar = (f) interfaceC5133d;
            int i9 = fVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                fVar.label = i9 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = fVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    V7.d dVar = F.f2553c;
                    g gVar = new g(str, this, pVar2, null);
                    fVar.L$0 = pVar2;
                    fVar.label = 1;
                    if (AbstractC0399y.y(dVar, gVar, fVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) fVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        fVar = new f(interfaceC5133d);
        Object obj2 = fVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = fVar.label;
        if (i4 != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z8, InterfaceC5133d interfaceC5133d) {
        h hVar;
        int i4;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5133d instanceof h) {
            hVar = (h) interfaceC5133d;
            int i9 = hVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                hVar.label = i9 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = hVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    boolean a9 = kotlin.jvm.internal.h.a(str, p5.e.GROUPLESS_SUMMARY_KEY);
                    kotlin.jvm.internal.r rVar3 = new kotlin.jvm.internal.r();
                    rVar3.f38861n = a9 ? "group_id IS NULL" : "group_id = ?";
                    rVar3.f38861n = AbstractC5051n.g(new StringBuilder(), (String) rVar3.f38861n, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) rVar3.f38861n);
                    sb.append(z8 ? "is_summary = 1" : "is_summary = 0");
                    rVar3.f38861n = sb.toString();
                    String[] strArr = a9 ? null : new String[]{str};
                    V7.d dVar = F.f2553c;
                    i iVar = new i(rVar3, strArr, rVar2, null);
                    hVar.L$0 = rVar2;
                    hVar.label = 1;
                    if (AbstractC0399y.y(dVar, iVar, hVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    rVar = rVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) hVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return rVar.f38861n;
            }
        }
        hVar = new h(interfaceC5133d);
        Object obj2 = hVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = hVar.label;
        if (i4 != 0) {
        }
        return rVar.f38861n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, InterfaceC5133d interfaceC5133d) {
        j jVar;
        int i4;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5133d instanceof j) {
            jVar = (j) interfaceC5133d;
            int i9 = jVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jVar.label = i9 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = jVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    V7.d dVar = F.f2553c;
                    k kVar = new k(str, rVar2, null);
                    jVar.L$0 = rVar2;
                    jVar.label = 1;
                    if (AbstractC0399y.y(dVar, kVar, jVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    rVar = rVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) jVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return rVar.f38861n;
            }
        }
        jVar = new j(interfaceC5133d);
        Object obj2 = jVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = jVar.label;
        if (i4 != 0) {
        }
        return rVar.f38861n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i4, InterfaceC5133d interfaceC5133d) {
        l lVar;
        int i9;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5133d instanceof l) {
            lVar = (l) interfaceC5133d;
            int i10 = lVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.label = i10 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i9 = lVar.label;
                if (i9 != 0) {
                    com.bumptech.glide.f.r(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    V7.d dVar = F.f2553c;
                    m mVar = new m(i4, rVar2, null);
                    lVar.L$0 = rVar2;
                    lVar.label = 1;
                    if (AbstractC0399y.y(dVar, mVar, lVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    rVar = rVar2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) lVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return rVar.f38861n;
            }
        }
        lVar = new l(interfaceC5133d);
        Object obj2 = lVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i9 = lVar.label;
        if (i9 != 0) {
        }
        return rVar.f38861n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, InterfaceC5133d interfaceC5133d) {
        n nVar;
        int i4;
        if (interfaceC5133d instanceof n) {
            nVar = (n) interfaceC5133d;
            int i9 = nVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.label = i9 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = nVar.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) nVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    return list;
                }
                com.bumptech.glide.f.r(obj);
                ArrayList arrayList = new ArrayList();
                V7.d dVar = F.f2553c;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                return AbstractC0399y.y(dVar, oVar, nVar) == enumC5179a ? enumC5179a : arrayList;
            }
        }
        nVar = new n(interfaceC5133d);
        Object obj2 = nVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = nVar.label;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, InterfaceC5133d interfaceC5133d) {
        p pVar;
        int i4;
        if (interfaceC5133d instanceof p) {
            pVar = (p) interfaceC5133d;
            int i9 = pVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                pVar.label = i9 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = pVar.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) pVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    return list2;
                }
                com.bumptech.glide.f.r(obj);
                ArrayList arrayList = new ArrayList();
                V7.d dVar = F.f2553c;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                return AbstractC0399y.y(dVar, qVar, pVar) == enumC5179a ? enumC5179a : arrayList;
            }
        }
        pVar = new p(interfaceC5133d);
        Object obj2 = pVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = pVar.label;
        if (i4 == 0) {
        }
    }

    @Override // q5.d
    public Object markAsConsumed(int i4, boolean z8, String str, boolean z9, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new r(str, z8, z9, this, i4, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i4, InterfaceC5133d interfaceC5133d) {
        s sVar;
        int i9;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof s) {
            sVar = (s) interfaceC5133d;
            int i10 = sVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.label = i10 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i9 = sVar.label;
                if (i9 != 0) {
                    com.bumptech.glide.f.r(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    V7.d dVar = F.f2553c;
                    t tVar = new t(pVar2, this, i4, null);
                    sVar.L$0 = pVar2;
                    sVar.label = 1;
                    if (AbstractC0399y.y(dVar, tVar, sVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) sVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        sVar = new s(interfaceC5133d);
        Object obj2 = sVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i9 = sVar.label;
        if (i9 != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    @Override // q5.d
    public Object markAsDismissedForGroup(String str, InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new u(str, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }

    @Override // q5.d
    public Object markAsDismissedForOutstanding(InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new v(null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : q7.v.f40183a;
    }
}
