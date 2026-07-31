package com.onesignal.inAppMessages.internal;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements l2.j {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // l2.j
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo12addTriggers(Map map) {
        addTriggers((Map<String, String>) map);
    }

    @Override // l2.j
    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo17removeTriggers(Collection collection) {
        removeTriggers((Collection<String>) collection);
    }

    @Override // l2.j
    public void setPaused(boolean z5) {
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo9addClickListener(l2.c listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo10addLifecycleListener(l2.g listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo11addTrigger(String key, String value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> triggers) {
        kotlin.jvm.internal.i.e(triggers, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo13clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo14removeClickListener(l2.c listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo15removeLifecycleListener(l2.g listener) {
        kotlin.jvm.internal.i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // l2.j
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo16removeTrigger(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> keys) {
        kotlin.jvm.internal.i.e(keys, "keys");
        throw Companion.getEXCEPTION();
    }
}
