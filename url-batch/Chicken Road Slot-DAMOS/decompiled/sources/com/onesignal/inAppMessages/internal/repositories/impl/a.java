package com.onesignal.inAppMessages.internal.repositories.impl;

import android.content.ContentValues;
import com.onesignal.common.f;
import com.onesignal.inAppMessages.internal.h;
import ge.a0;
import ge.k0;
import ge.x;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.i;
import org.json.JSONArray;
import org.json.JSONException;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements fb.a {
    public static final C0034a Companion = new C0034a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final ha.d _databaseProvider;
    private final cb.a _prefs;
    private final sa.a _time;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends nd.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(ld.a aVar) {
            super(aVar);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(this);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
            super(2, aVar2);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new e(this.$values, this.$inAppMessage, aVar);
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
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return Unit.f5554a;
        }
    }

    public a(ha.d dVar, sa.a aVar, cb.a aVar2) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this._databaseProvider = dVar;
        this._time = aVar;
        this._prefs = aVar2;
    }

    @Override // fb.a
    public Object cleanCachedInAppMessages(ld.a aVar) {
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new b(null), aVar);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // fb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(ld.a aVar) {
        c cVar;
        int i3;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                md.a aVar2 = md.a.f6622d;
                i3 = cVar.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list = (List) cVar.L$0;
                    cf.c.M(obj);
                    return list;
                }
                cf.c.M(obj);
                ArrayList arrayList = new ArrayList();
                ne.e eVar = k0.f4372a;
                ne.d dVar = ne.d.f7275i;
                d dVar2 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return a0.B(dVar, dVar2, cVar) == aVar2 ? aVar2 : arrayList;
            }
        }
        cVar = new c(aVar);
        Object obj2 = cVar.result;
        md.a aVar22 = md.a.f6622d;
        i3 = cVar.label;
        if (i3 == 0) {
        }
    }

    @Override // fb.a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, ld.a aVar2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        ne.e eVar = k0.f4372a;
        Object B = a0.B(ne.d.f7275i, new e(contentValues, aVar, null), aVar2);
        return B == md.a.f6622d ? B : Unit.f5554a;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0034a {
        public /* synthetic */ C0034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0034a() {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        int label;

        public b(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cf.c.M(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                ha.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0035a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0035a extends p implements Function1 {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0035a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.getCount() == 0) {
                    com.onesignal.debug.internal.logging.b.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString("message_id");
                        String string2 = aVar.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(f.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
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
    public static final class d extends i implements Function2 {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, ld.a aVar) {
            super(2, aVar);
            this.$inAppMessages = list;
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            return a.this.new d(this.$inAppMessages, aVar);
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
            try {
                ha.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0036a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e2) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e2);
            }
            return Unit.f5554a;
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0036a extends p implements Function1 {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0036a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            public final void invoke(ha.a aVar) {
                aVar.getClass();
                if (aVar.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(aVar.getString("message_id"), f.INSTANCE.newStringSetFromJSONArray(new JSONArray(aVar.getString("click_ids"))), aVar.getInt("displayed_in_session") == 1, new h(aVar.getInt("display_quantity"), aVar.getLong("last_display"), this.this$0._time), this.this$0._time));
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
