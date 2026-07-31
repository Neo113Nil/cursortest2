package com.onesignal.user.internal.jwt;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.IUserJwtInvalidatedListener;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JwtTokenStore.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eJ\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0014\u0010\u0018\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "", "_prefs", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "(Lcom/onesignal/core/internal/preferences/IPreferencesService;)V", "internalUpdateListeners", "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/user/internal/jwt/IJwtUpdateListener;", "isLoaded", "", "publicInvalidatedListeners", "Lcom/onesignal/IUserJwtInvalidatedListener;", "tokens", "", "", "addInternalUpdateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addUserJwtInvalidatedListener", "ensureLoaded", "getJwt", "externalId", "invalidateJwt", "persist", "pruneToExternalIds", "activeIds", "", "putJwt", "jwt", "removeInternalUpdateListener", "removeUserJwtInvalidatedListener", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JwtTokenStore {
    private final IPreferencesService _prefs;
    private final EventProducer<IJwtUpdateListener> internalUpdateListeners;
    private boolean isLoaded;
    private final EventProducer<IUserJwtInvalidatedListener> publicInvalidatedListeners;
    private final Map<String, String> tokens;

    public JwtTokenStore(IPreferencesService _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
        this.tokens = new LinkedHashMap();
        this.internalUpdateListeners = new EventProducer<>();
        this.publicInvalidatedListeners = new EventProducer<>();
    }

    public final void addInternalUpdateListener(IJwtUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.internalUpdateListeners.subscribe(listener);
    }

    public final void removeInternalUpdateListener(IJwtUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.internalUpdateListeners.unsubscribe(listener);
    }

    public final void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.publicInvalidatedListeners.subscribe(listener);
    }

    public final void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.publicInvalidatedListeners.unsubscribe(listener);
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

    public final void putJwt(final String externalId, String jwt) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        if (jwt == null) {
            return;
        }
        synchronized (this.tokens) {
            ensureLoaded();
            areEqual = Intrinsics.areEqual(this.tokens.get(externalId), jwt);
            this.tokens.put(externalId, jwt);
            if (!areEqual) {
                persist();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (areEqual) {
            return;
        }
        this.internalUpdateListeners.fire(new Function1<IJwtUpdateListener, Unit>() { // from class: com.onesignal.user.internal.jwt.JwtTokenStore$putJwt$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IJwtUpdateListener iJwtUpdateListener) {
                invoke2(iJwtUpdateListener);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IJwtUpdateListener it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onJwtUpdated(externalId);
            }
        });
    }

    public final void invalidateJwt(String externalId) {
        boolean z;
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            z = this.tokens.remove(externalId) != null;
            if (z) {
                persist();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            OneSignalDispatchers.INSTANCE.launchOnDefault(new JwtTokenStore$invalidateJwt$2(this, externalId, null));
        }
    }

    public final void pruneToExternalIds(Set<String> activeIds) {
        Set<String> set;
        Intrinsics.checkNotNullParameter(activeIds, "activeIds");
        synchronized (this.tokens) {
            ensureLoaded();
            set = CollectionsKt.toSet(SetsKt.minus((Set) this.tokens.keySet(), (Iterable) activeIds));
            if (!set.isEmpty()) {
                this.tokens.keySet().removeAll(set);
                persist();
            }
            Unit unit = Unit.INSTANCE;
        }
        for (final String str : set) {
            this.internalUpdateListeners.fire(new Function1<IJwtUpdateListener, Unit>() { // from class: com.onesignal.user.internal.jwt.JwtTokenStore$pruneToExternalIds$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IJwtUpdateListener iJwtUpdateListener) {
                    invoke2(iJwtUpdateListener);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IJwtUpdateListener it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onJwtUpdated(str);
                }
            });
        }
    }

    private final void ensureLoaded() {
        if (this.isLoaded) {
            return;
        }
        String string$default = IPreferencesService.DefaultImpls.getString$default(this._prefs, "OneSignal", PreferenceOneSignalKeys.PREFS_OS_JWT_TOKENS, null, 4, null);
        if (string$default != null) {
            try {
                JSONObject jSONObject = new JSONObject(string$default);
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Map<String, String> map = this.tokens;
                    Intrinsics.checkNotNull(next);
                    String string = jSONObject.getString(next);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (JSONException e) {
                Logging.warn$default("JwtTokenStore: failed to parse persisted tokens, starting fresh: " + e.getMessage(), null, 2, null);
            }
        }
        this.isLoaded = true;
    }

    private final void persist() {
        this._prefs.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_JWT_TOKENS, new JSONObject(MapsKt.toMap(this.tokens)).toString());
    }
}
