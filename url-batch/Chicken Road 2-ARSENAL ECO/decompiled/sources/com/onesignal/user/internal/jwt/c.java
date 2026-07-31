package com.onesignal.user.internal.jwt;

import a.AbstractC0219a;
import f2.AbstractC0364a;
import f2.InterfaceC0365b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k5.AbstractC0479i;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l5.AbstractC0506j;
import l5.t;
import o5.InterfaceC0564d;
import org.json.JSONException;
import org.json.JSONObject;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c {
    private final InterfaceC0365b _prefs;
    private final com.onesignal.common.events.b internalUpdateListeners;
    private boolean isLoaded;
    private final com.onesignal.common.events.b publicInvalidatedListeners;
    private final Map<String, String> tokens;

    public static final class a extends g implements InterfaceC0743l {
        final /* synthetic */ String $externalId;
        int label;

        /* renamed from: com.onesignal.user.internal.jwt.c$a$a, reason: collision with other inner class name */
        public static final class C0080a extends j implements InterfaceC0743l {
            final /* synthetic */ String $externalId;
            final /* synthetic */ c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0080a(c cVar, String str) {
                super(1);
                this.this$0 = cVar;
                this.$externalId = str;
            }

            @Override // x5.InterfaceC0743l
            public /* synthetic */ Object invoke(Object obj) {
                if (obj != null) {
                    throw new ClassCastException();
                }
                invoke((L1.c) null);
                return v.f5219a;
            }

            public final void invoke(L1.c listener) {
                Object f7;
                i.e(listener, "listener");
                String externalId = this.$externalId;
                try {
                    i.e(externalId, "externalId");
                    listener.a();
                    f7 = v.f5219a;
                } catch (Throwable th) {
                    f7 = AbstractC0676f.f(th);
                }
                String str = this.$externalId;
                Throwable a7 = AbstractC0479i.a(f7);
                if (a7 != null) {
                    com.onesignal.debug.internal.logging.b.warn("JwtTokenStore: IUserJwtInvalidatedListener threw for externalId=" + str, a7);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$externalId = str;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return c.this.new a(this.$externalId, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            c.this.publicInvalidatedListeners.fire(new C0080a(c.this, this.$externalId));
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends j implements InterfaceC0743l {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return v.f5219a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            i.e(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    /* renamed from: com.onesignal.user.internal.jwt.c$c, reason: collision with other inner class name */
    public static final class C0081c extends j implements InterfaceC0743l {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0081c(String str) {
            super(1);
            this.$externalId = str;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.user.internal.jwt.a) obj);
            return v.f5219a;
        }

        public final void invoke(com.onesignal.user.internal.jwt.a it) {
            i.e(it, "it");
            it.onJwtUpdated(this.$externalId);
        }
    }

    public c(InterfaceC0365b _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.tokens = new LinkedHashMap();
        this.internalUpdateListeners = new com.onesignal.common.events.b();
        this.publicInvalidatedListeners = new com.onesignal.common.events.b();
    }

    private final void ensureLoaded() {
        if (this.isLoaded) {
            return;
        }
        String string$default = AbstractC0364a.getString$default(this._prefs, com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", null, 4, null);
        if (string$default != null) {
            try {
                JSONObject jSONObject = new JSONObject(string$default);
                Iterator<String> keys = jSONObject.keys();
                i.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Map<String, String> map = this.tokens;
                    i.b(next);
                    String string = jSONObject.getString(next);
                    i.d(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (JSONException e4) {
                com.onesignal.debug.internal.logging.b.warn$default("JwtTokenStore: failed to parse persisted tokens, starting fresh: " + e4.getMessage(), null, 2, null);
            }
        }
        this.isLoaded = true;
    }

    private final void persist() {
        this._prefs.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_JWT_TOKENS", new JSONObject(t.u0(this.tokens)).toString());
    }

    public final void addInternalUpdateListener(com.onesignal.user.internal.jwt.a listener) {
        i.e(listener, "listener");
        this.internalUpdateListeners.subscribe(listener);
    }

    public final void addUserJwtInvalidatedListener(L1.c listener) {
        i.e(listener, "listener");
        this.publicInvalidatedListeners.subscribe(listener);
    }

    public final String getJwt(String externalId) {
        String str;
        i.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            str = this.tokens.get(externalId);
        }
        return str;
    }

    public final void invalidateJwt(String externalId) {
        boolean z5;
        i.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            z5 = this.tokens.remove(externalId) != null;
            if (z5) {
                persist();
            }
        }
        if (z5) {
            com.onesignal.common.threading.a.INSTANCE.launchOnDefault(new a(externalId, null));
        }
    }

    public final void pruneToExternalIds(Set<String> activeIds) {
        Set T6;
        i.e(activeIds, "activeIds");
        synchronized (this.tokens) {
            ensureLoaded();
            T6 = AbstractC0506j.T(AbstractC0219a.y(this.tokens.keySet(), activeIds));
            if (!T6.isEmpty()) {
                this.tokens.keySet().removeAll(T6);
                persist();
            }
        }
        Iterator it = T6.iterator();
        while (it.hasNext()) {
            this.internalUpdateListeners.fire(new b((String) it.next()));
        }
    }

    public final void putJwt(String externalId, String str) {
        boolean a7;
        i.e(externalId, "externalId");
        if (str == null) {
            return;
        }
        synchronized (this.tokens) {
            ensureLoaded();
            a7 = i.a(this.tokens.get(externalId), str);
            this.tokens.put(externalId, str);
            if (!a7) {
                persist();
            }
        }
        if (a7) {
            return;
        }
        this.internalUpdateListeners.fire(new C0081c(externalId));
    }

    public final void removeInternalUpdateListener(com.onesignal.user.internal.jwt.a listener) {
        i.e(listener, "listener");
        this.internalUpdateListeners.unsubscribe(listener);
    }

    public final void removeUserJwtInvalidatedListener(L1.c listener) {
        i.e(listener, "listener");
        this.publicInvalidatedListeners.unsubscribe(listener);
    }
}
