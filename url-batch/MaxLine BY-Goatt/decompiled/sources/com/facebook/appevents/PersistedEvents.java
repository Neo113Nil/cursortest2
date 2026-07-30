package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PersistedEvents implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
        hashMap.getClass();
        HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap2 = new HashMap<>();
        this.events = hashMap2;
        hashMap2.putAll(hashMap);
    }

    private final Object writeReplace() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            accessTokenAppIdPair.getClass();
            list.getClass();
            boolean containsKey = this.events.containsKey(accessTokenAppIdPair);
            HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap = this.events;
            if (!containsKey) {
                hashMap.put(accessTokenAppIdPair, new ArrayList(list));
                return;
            }
            List<AppEvent> list2 = hashMap.get(accessTokenAppIdPair);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            accessTokenAppIdPair.getClass();
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet = this.events.entrySet();
            entrySet.getClass();
            return entrySet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            accessTokenAppIdPair.getClass();
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> keySet = this.events.keySet();
            keySet.getClass();
            return keySet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class SerializationProxyV1 implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
            hashMap.getClass();
            this.proxyEvents = hashMap;
        }

        private final Object readResolve() {
            return new PersistedEvents(this.proxyEvents);
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }
}
