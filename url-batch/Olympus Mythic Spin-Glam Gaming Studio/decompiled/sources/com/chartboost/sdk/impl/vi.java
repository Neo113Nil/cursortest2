package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes14.dex */
public final class vi {
    public final i3 a;
    public final ri b;
    public final Function1 c;
    public final p7 d;
    public final String e;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a b = new a();

        public a() {
            super(1, JSONArray.class, "<init>", "<init>(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke(Collection collection) {
            return new JSONArray(collection);
        }
    }

    public vi(i3 networkService, ri trackingEventCache, Function1 jsonFactory, p7 eventTracker, String sessionId) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = networkService;
        this.b = trackingEventCache;
        this.c = jsonFactory;
        this.d = eventTracker;
        this.e = sessionId;
    }

    public final void a(String url, List events) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(events, "events");
        wi wiVar = new wi(url, this.b, this.e, null, this.d, 8, null);
        wiVar.a((JSONArray) this.c.invoke(events));
        this.a.a(wiVar);
    }

    public /* synthetic */ vi(i3 i3Var, ri riVar, Function1 function1, p7 p7Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i3Var, riVar, (i & 4) != 0 ? a.b : function1, p7Var, str);
    }
}
