package com.onesignal.inAppMessages.internal;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l implements N2.j {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // N2.j
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo14addTriggers(Map map) {
        addTriggers((Map<String, String>) map);
    }

    @Override // N2.j
    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo19removeTriggers(Collection collection) {
        removeTriggers((Collection<String>) collection);
    }

    @Override // N2.j
    public void setPaused(boolean z7) {
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo11addClickListener(N2.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo12addLifecycleListener(N2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo13addTrigger(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo15clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo16removeClickListener(N2.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo17removeLifecycleListener(N2.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // N2.j
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo18removeTrigger(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        throw Companion.getEXCEPTION();
    }
}
