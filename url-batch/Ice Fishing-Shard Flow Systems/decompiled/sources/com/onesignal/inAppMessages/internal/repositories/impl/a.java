package com.onesignal.inAppMessages.internal.repositories.impl;

import X5.j;
import android.content.ContentValues;
import com.onesignal.common.f;
import com.onesignal.inAppMessages.internal.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import org.json.JSONArray;
import org.json.JSONException;
import u6.C0953e;
import u6.ExecutorC0952d;
import y2.AbstractC1025b;
import y2.InterfaceC1024a;
import y2.InterfaceC1027d;

/* loaded from: classes.dex */
public final class a implements W2.a {
    public static final C0041a Companion = new C0041a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final InterfaceC1027d _databaseProvider;
    private final T2.a _prefs;
    private final I2.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0041a {
        public /* synthetic */ C0041a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0041a() {
        }
    }

    public static final class b extends j implements Function2 {
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0042a extends p implements Function1 {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0042a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1024a) obj);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC1024a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getCount() == 0) {
                    com.onesignal.debug.internal.logging.b.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (it.moveToFirst()) {
                    do {
                        String string = it.getString("message_id");
                        String string2 = it.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(f.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (it.moveToNext());
                }
            }
        }

        public b(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new b(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                AbstractC1025b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0042a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((b) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class c extends X5.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(this);
        }
    }

    public static final class d extends j implements Function2 {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0043a extends p implements Function1 {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0043a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
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
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(it.getString("message_id"), f.INSTANCE.newStringSetFromJSONArray(new JSONArray(it.getString("click_ids"))), it.getInt("displayed_in_session") == 1, new h(it.getInt("display_quantity"), it.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, V5.b bVar) {
            super(2, bVar);
            this.$inAppMessages = list;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new d(this.$inAppMessages, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            try {
                AbstractC1025b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0043a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e7) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e7);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((d) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public static final class e extends j implements Function2 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, V5.b bVar) {
            super(2, bVar);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            return a.this.new e(this.$values, this.$inAppMessage, bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((e) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    public a(InterfaceC1027d _databaseProvider, I2.a _time, T2.a _prefs) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // W2.a
    public Object cleanCachedInAppMessages(V5.b bVar) {
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new b(null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // W2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(V5.b bVar) {
        c cVar;
        int i2;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i5 = cVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.label = i5 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                W5.a aVar = W5.a.f2787d;
                i2 = cVar.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    V6.b.P(obj);
                    return list;
                }
                V6.b.P(obj);
                ArrayList arrayList = new ArrayList();
                C0953e c0953e = F.f7011a;
                ExecutorC0952d executorC0952d = ExecutorC0952d.f8106i;
                d dVar = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0792z.t(executorC0952d, dVar, cVar) == aVar ? aVar : arrayList;
            }
        }
        cVar = new c(bVar);
        Object obj2 = cVar.result;
        W5.a aVar2 = W5.a.f2787d;
        i2 = cVar.label;
        if (i2 == 0) {
        }
    }

    @Override // W2.a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, V5.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        C0953e c0953e = F.f7011a;
        Object t6 = AbstractC0792z.t(ExecutorC0952d.f8106i, new e(contentValues, aVar, null), bVar);
        return t6 == W5.a.f2787d ? t6 : Unit.f6114a;
    }
}
