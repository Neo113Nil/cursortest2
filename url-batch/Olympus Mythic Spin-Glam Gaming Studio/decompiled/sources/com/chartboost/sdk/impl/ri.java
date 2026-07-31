package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class ri {
    public final SharedPreferences a;
    public final li b;
    public final Function1 c;

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONObject invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new JSONObject(it);
        }
    }

    public ri(SharedPreferences sharedPreferences, li trackingBodyBuilder, Function1 jsonFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(trackingBodyBuilder, "trackingBodyBuilder");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        this.a = sharedPreferences;
        this.b = trackingBodyBuilder;
        this.c = jsonFactory;
    }

    public final void a(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            for (JSONObject jSONObject : q8.asList(jsonArray)) {
                this.a.edit().putString(a(jSONObject), jSONObject.toString()).apply();
            }
        } catch (Exception e) {
            xb.a("cacheEventToTrackingRequestBodyAndSave error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public /* synthetic */ ri(SharedPreferences sharedPreferences, li liVar, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, liVar, (i & 4) != 0 ? a.b : function1);
    }

    public final String b(pi piVar) {
        return piVar.f().getValue() + piVar.i();
    }

    public final void a(pi event, j7 environmentData, int i) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        if (this.a.getAll().size() > i) {
            xb.a("Persistence limit reached. Drop old events!", (Throwable) null, 2, (Object) null);
            this.a.edit().clear().apply();
        }
        try {
            this.a.edit().putString(b(event), this.b.a(event, environmentData)).apply();
        } catch (Exception e) {
            xb.a("cacheEventToTrackingRequestBodyAndSave error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            xb.a("clearEventFromStorage: " + event.f().getValue(), (Throwable) null, 2, (Object) null);
            this.a.edit().remove(event.f().getValue()).apply();
        } catch (Exception e) {
            xb.a("clearEventFromStorage error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public final List a(List events, j7 environmentData) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
            Iterator it = events.iterator();
            while (it.hasNext()) {
                arrayList.add((JSONObject) this.c.invoke(this.b.a((pi) it.next(), environmentData)));
            }
            return arrayList;
        } catch (Exception e) {
            xb.a("cacheEventToTrackingRequestBody error " + e, (Throwable) null, 2, (Object) null);
            return CollectionsKt.emptyList();
        }
    }

    public final void a(pi event, j7 environmentData) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(environmentData, "environmentData");
        try {
            xb.a("forcePersistEvent: " + event.f().getValue(), (Throwable) null, 2, (Object) null);
            this.a.edit().putString(event.f().getValue(), this.b.a(event, environmentData)).apply();
        } catch (Exception e) {
            xb.a("forcePersistEvent error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public final String a(JSONObject jSONObject) {
        return jSONObject.getString("event_name") + jSONObject.getLong("event_timestamp");
    }

    public final List a() {
        try {
            List list = CollectionsKt.toList(this.a.getAll().values());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object invoke = this.c.invoke(String.valueOf(it.next()));
                this.a.edit().clear().apply();
                arrayList.add((JSONObject) invoke);
            }
            return arrayList;
        } catch (Exception e) {
            xb.a("loadEventsAsJsonList error " + e, (Throwable) null, 2, (Object) null);
            return CollectionsKt.emptyList();
        }
    }
}
