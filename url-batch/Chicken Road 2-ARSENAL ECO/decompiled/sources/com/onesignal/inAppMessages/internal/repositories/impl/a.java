package com.onesignal.inAppMessages.internal.repositories.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import android.content.ContentValues;
import com.onesignal.common.f;
import com.onesignal.inAppMessages.internal.h;
import g2.InterfaceC0391a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONException;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import q5.g;
import r2.InterfaceC0616a;
import u0.AbstractC0676f;
import u2.InterfaceC0691a;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class a implements InterfaceC0691a {
    public static final C0041a Companion = new C0041a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final W1.d _databaseProvider;
    private final InterfaceC0616a _prefs;
    private final InterfaceC0391a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0041a {
        public /* synthetic */ C0041a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0041a() {
        }
    }

    public static final class b extends g implements InterfaceC0747p {
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0042a extends j implements InterfaceC0743l {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0042a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return v.f5219a;
            }

            public final void invoke(W1.a it) {
                i.e(it, "it");
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

        public b(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new b(interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                W1.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0042a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return v.f5219a;
        }
    }

    public static final class c extends AbstractC0607c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(this);
        }
    }

    public static final class d extends g implements InterfaceC0747p {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0043a extends j implements InterfaceC0743l {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0043a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((W1.a) obj);
                return v.f5219a;
            }

            public final void invoke(W1.a it) {
                i.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(it.getString("message_id"), f.INSTANCE.newStringSetFromJSONArray(new JSONArray(it.getString("click_ids"))), it.getInt("displayed_in_session") == 1, new h(it.getInt("display_quantity"), it.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$inAppMessages = list;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new d(this.$inAppMessages, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            try {
                W1.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0043a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e4) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e4);
            }
            return v.f5219a;
        }
    }

    public static final class e extends g implements InterfaceC0747p {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            return a.this.new e(this.$values, this.$inAppMessage, interfaceC0564d);
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((e) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return v.f5219a;
        }
    }

    public a(W1.d _databaseProvider, InterfaceC0391a _time, InterfaceC0616a _prefs) {
        i.e(_databaseProvider, "_databaseProvider");
        i.e(_time, "_time");
        i.e(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // u2.InterfaceC0691a
    public Object cleanCachedInAppMessages(InterfaceC0564d interfaceC0564d) {
        Object t6 = AbstractC0165z.t(F.f1029c, new b(null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u2.InterfaceC0691a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(InterfaceC0564d interfaceC0564d) {
        c cVar;
        int i7;
        if (interfaceC0564d instanceof c) {
            cVar = (c) interfaceC0564d;
            int i8 = cVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.label = i8 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = cVar.label;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    AbstractC0676f.w(obj);
                    return list;
                }
                AbstractC0676f.w(obj);
                ArrayList arrayList = new ArrayList();
                O5.c cVar2 = F.f1029c;
                d dVar = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0165z.t(cVar2, dVar, cVar) == enumC0580a ? enumC0580a : arrayList;
            }
        }
        cVar = new c(interfaceC0564d);
        Object obj2 = cVar.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = cVar.label;
        if (i7 == 0) {
        }
    }

    @Override // u2.InterfaceC0691a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, InterfaceC0564d interfaceC0564d) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        Object t6 = AbstractC0165z.t(F.f1029c, new e(contentValues, aVar, null), interfaceC0564d);
        return t6 == EnumC0580a.f5697f ? t6 : v.f5219a;
    }
}
