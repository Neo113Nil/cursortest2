package com.onesignal.user.internal.jwt;

import R5.l;
import R5.n;
import X5.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.collections.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n2.InterfaceC0752c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {
    private final H2.b _prefs;
    private final com.onesignal.common.events.b internalUpdateListeners;
    private boolean isLoaded;
    private final com.onesignal.common.events.b publicInvalidatedListeners;
    private final Map<String, String> tokens;

    public static final class a extends j implements Function1 {
        final /* synthetic */ String $externalId;
        int label;

        /* renamed from: com.onesignal.user.internal.jwt.c$a$a, reason: collision with other inner class name */
        public static final class C0080a extends p implements Function1 {
            final /* synthetic */ String $externalId;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0080a(c cVar, String str) {
                super(1);
                this.this$0 = cVar;
                this.$externalId = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Object obj) {
                if (obj != null) {
                    throw new ClassCastException();
                }
                invoke((InterfaceC0752c) null);
                return Unit.f6114a;
            }

            public final void invoke(InterfaceC0752c listener) {
                Object n7;
                Intrinsics.checkNotNullParameter(listener, "listener");
                String externalId = this.$externalId;
                try {
                    l lVar = n.f2421d;
                    Intrinsics.checkNotNullParameter(externalId, "externalId");
                    listener.a();
                    n7 = Unit.f6114a;
                } catch (Throwable th) {
                    l lVar2 = n.f2421d;
                    n7 = V6.b.n(th);
                }
                String str = this.$externalId;
                Throwable a7 = n.a(n7);
                if (a7 != null) {
                    com.onesignal.debug.internal.logging.b.warn("JwtTokenStore: IUserJwtInvalidatedListener threw for externalId=" + str, a7);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, V5.b bVar) {
            super(1, bVar);
            this.$externalId = str;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return c.this.new a(this.$externalId, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            c.this.publicInvalidatedListeners.fire(new C0080a(c.this, this.$externalId));
            return Unit.f6114a;
        }
    }

    public static final class b extends p implements Function1 {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    /* renamed from: com.onesignal.user.internal.jwt.c$c, reason: collision with other inner class name */
    public static final class C0081c extends p implements Function1 {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0081c(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    public c(H2.b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
        this.tokens = new LinkedHashMap();
        this.internalUpdateListeners = new com.onesignal.common.events.b();
        this.publicInvalidatedListeners = new com.onesignal.common.events.b();
    }

    private final void ensureLoaded() {
        if (this.isLoaded) {
            return;
        }
        String string$default = H2.a.getString$default(this._prefs, com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", null, 4, null);
        if (string$default != null) {
            try {
                JSONObject jSONObject = new JSONObject(string$default);
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Map<String, String> map = this.tokens;
                    Intrinsics.b(next);
                    String string = jSONObject.getString(next);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (JSONException e7) {
                com.onesignal.debug.internal.logging.b.warn$default("JwtTokenStore: failed to parse persisted tokens, starting fresh: " + e7.getMessage(), null, 2, null);
            }
        }
        this.isLoaded = true;
    }

    private final void persist() {
        this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", new JSONObject(I.i(this.tokens)).toString());
    }

    public final void addInternalUpdateListener(com.onesignal.user.internal.jwt.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.internalUpdateListeners.subscribe(listener);
    }

    public final void addUserJwtInvalidatedListener(InterfaceC0752c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.publicInvalidatedListeners.subscribe(listener);
    }

    public final String getJwt(String externalId) {
        String str;
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            str = this.tokens.get(externalId);
        }
        return str;
    }

    public final void invalidateJwt(String externalId) {
        boolean z7;
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        synchronized (this.tokens) {
            try {
                ensureLoaded();
                z7 = this.tokens.remove(externalId) != null;
                if (z7) {
                    persist();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new a(externalId, null));
        }
    }

    public final void pruneToExternalIds(Set<String> activeIds) {
        Set C7;
        Intrinsics.checkNotNullParameter(activeIds, "activeIds");
        synchronized (this.tokens) {
            try {
                ensureLoaded();
                C7 = CollectionsKt.C(N.b(this.tokens.keySet(), activeIds));
                if (!C7.isEmpty()) {
                    this.tokens.keySet().removeAll(C7);
                    persist();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = C7.iterator();
        while (it.hasNext()) {
            this.internalUpdateListeners.fire(new b((String) it.next()));
        }
    }

    public final void putJwt(String externalId, String str) {
        boolean a7;
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        if (str == null) {
            return;
        }
        synchronized (this.tokens) {
            try {
                ensureLoaded();
                a7 = Intrinsics.a(this.tokens.get(externalId), str);
                this.tokens.put(externalId, str);
                if (!a7) {
                    persist();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a7) {
            return;
        }
        this.internalUpdateListeners.fire(new C0081c(externalId));
    }

    public final void removeInternalUpdateListener(com.onesignal.user.internal.jwt.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.internalUpdateListeners.unsubscribe(listener);
    }

    public final void removeUserJwtInvalidatedListener(InterfaceC0752c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.publicInvalidatedListeners.unsubscribe(listener);
    }
}
