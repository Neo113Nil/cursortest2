package com.onesignal.user.internal;

import com.onesignal.common.h;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f implements tc.a, g {
    private final xc.b _customEventController;
    private final yc.b _identityModelStore;
    private final la.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final dd.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;

    public f(dd.b bVar, yc.b bVar2, com.onesignal.user.internal.properties.b bVar3, xc.b bVar4, la.a aVar) {
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        aVar.getClass();
        this._subscriptionManager = bVar;
        this._identityModelStore = bVar2;
        this._propertiesModelStore = bVar3;
        this._customEventController = bVar4;
        this._languageContext = aVar;
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        bVar2.subscribe((g) this);
    }

    private final yc.a get_identityModel() {
        return (yc.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // tc.a
    public void addAlias(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "setAlias(label: " + str + ", id: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add empty alias");
        } else if (Intrinsics.a(str, "onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((yc.a) str, str2);
        }
    }

    @Override // tc.a
    public void addAliases(Map<String, String> map) {
        map.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "addAliases(aliases: " + map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add empty alias");
                return;
            } else if (Intrinsics.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            get_identityModel().put((yc.a) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // tc.a
    public void addEmail(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "addEmail(email: " + str + ')');
        if (h.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.addEmailSubscription(str);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add invalid email address as subscription: " + str);
    }

    @Override // tc.a
    public void addObserver(ed.a aVar) {
        aVar.getClass();
        this.changeHandlersNotifier.subscribe(aVar);
    }

    @Override // tc.a
    public void addSms(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "addSms(sms: " + str + ')');
        if (h.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.addSmsSubscription(str);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add invalid sms number as subscription: " + str);
    }

    @Override // tc.a
    public void addTag(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "setTag(key: " + str + ", value: " + str2 + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) str, str2);
        }
    }

    @Override // tc.a
    public void addTags(Map<String, String> map) {
        map.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "setTags(tags: " + map + ')');
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        yc.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!Intrinsics.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return p0.h(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // tc.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // tc.a
    public String getOnesignalId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // tc.a
    public fd.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final dd.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // tc.a
    public Map<String, String> getTags() {
        return p0.h(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(yc.a aVar, String str) {
        aVar.getClass();
        str.getClass();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        if (Intrinsics.a(jVar.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new ed.c(String.valueOf(jVar.getNewValue()), getExternalId())));
        }
    }

    @Override // tc.a
    public void removeAlias(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "removeAlias(label: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove empty alias");
        } else if (Intrinsics.a(str, "onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) str);
        }
    }

    @Override // tc.a
    public void removeAliases(Collection<String> collection) {
        collection.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "removeAliases(labels: " + collection + ')');
        Collection<String> collection2 = collection;
        for (String str : collection2) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (Intrinsics.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // tc.a
    public void removeEmail(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "removeEmail(email: " + str + ')');
        if (h.INSTANCE.isValidEmail(str)) {
            this._subscriptionManager.removeEmailSubscription(str);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove invalid email address as subscription: " + str);
    }

    @Override // tc.a
    public void removeObserver(ed.a aVar) {
        aVar.getClass();
        this.changeHandlersNotifier.unsubscribe(aVar);
    }

    @Override // tc.a
    public void removeSms(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "removeSms(sms: " + str + ')');
        if (h.INSTANCE.isValidPhoneNumber(str)) {
            this._subscriptionManager.removeSmsSubscription(str);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove invalid sms number as subscription: " + str);
    }

    @Override // tc.a
    public void removeTag(String str) {
        str.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "removeTag(key: " + str + ')');
        if (str.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) str);
        }
    }

    @Override // tc.a
    public void removeTags(Collection<String> collection) {
        collection.getClass();
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "removeTags(keys: " + collection + ')');
        Collection<String> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // tc.a
    public void setLanguage(String str) {
        str.getClass();
        this._languageContext.setLanguage(str);
    }

    @Override // tc.a
    public void trackEvent(String str, Map<String, ? extends Object> map) {
        str.getClass();
        if (com.onesignal.common.f.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(str, map);
        } else {
            com.onesignal.debug.internal.logging.b.log(ua.c.ERROR, "Custom event properties are not JSON-serializable");
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ ed.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ed.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((ed.a) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }

        public final void invoke(ed.a aVar) {
            aVar.getClass();
            new ed.b(this.$newUserState);
            aVar.a();
        }
    }
}
