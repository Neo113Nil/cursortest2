package com.onesignal.inAppMessages.internal;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements wa.j {
    public static final a Companion = new a(null);

    @Override // wa.j
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo3addClickListener(wa.c cVar) {
        cVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    /* renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo4addLifecycleListener(wa.g gVar) {
        gVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    /* renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo5addTrigger(String str, String str2) {
        str.getClass();
        str2.getClass();
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> map) {
        map.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    /* renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo7clearTriggers() {
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    public boolean getPaused() {
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo8removeClickListener(wa.c cVar) {
        cVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    /* renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo9removeLifecycleListener(wa.g gVar) {
        gVar.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    /* renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo10removeTrigger(String str) {
        str.getClass();
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> collection) {
        collection.getClass();
        throw Companion.getEXCEPTION();
    }

    @Override // wa.j
    public void setPaused(boolean z10) {
        throw Companion.getEXCEPTION();
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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

    @Override // wa.j
    /* renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo6addTriggers(Map map) {
        addTriggers((Map<String, String>) map);
    }

    @Override // wa.j
    /* renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo11removeTriggers(Collection collection) {
        removeTriggers((Collection<String>) collection);
    }
}
