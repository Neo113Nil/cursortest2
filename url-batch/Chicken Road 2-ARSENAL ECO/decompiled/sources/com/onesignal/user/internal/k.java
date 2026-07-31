package com.onesignal.user.internal;

import b2.InterfaceC0265a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k5.v;
import l5.t;
import r3.C0617a;
import w3.InterfaceC0720b;
import x3.InterfaceC0730a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public class k implements m3.a, com.onesignal.common.modeling.g {
    private final q3.b _customEventController;
    private final r3.b _identityModelStore;
    private final InterfaceC0265a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final InterfaceC0720b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ x3.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0730a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0730a it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onUserStateChange(new x3.b(this.$newUserState));
        }
    }

    public k(InterfaceC0720b _subscriptionManager, r3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, q3.b _customEventController, InterfaceC0265a _languageContext) {
        kotlin.jvm.internal.i.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.i.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.i.e(_propertiesModelStore, "_propertiesModelStore");
        kotlin.jvm.internal.i.e(_customEventController, "_customEventController");
        kotlin.jvm.internal.i.e(_languageContext, "_languageContext");
        this._subscriptionManager = _subscriptionManager;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._customEventController = _customEventController;
        this._languageContext = _languageContext;
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        _identityModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    private final C0617a get_identityModel() {
        return (C0617a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // m3.a
    public void addAlias(String label, String id) {
        kotlin.jvm.internal.i.e(label, "label");
        kotlin.jvm.internal.i.e(id, "id");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add empty alias");
        } else if (label.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((C0617a) label, id);
        }
    }

    @Override // m3.a
    public void addAliases(Map<String, String> aliases) {
        kotlin.jvm.internal.i.e(aliases, "aliases");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add empty alias");
                return;
            } else if (kotlin.jvm.internal.i.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put((C0617a) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // m3.a
    public void addEmail(String email) {
        kotlin.jvm.internal.i.e(email, "email");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "addEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
        } else {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add invalid email address as subscription: ".concat(email));
        }
    }

    @Override // m3.a
    public void addObserver(InterfaceC0730a observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // m3.a
    public void addSms(String sms) {
        kotlin.jvm.internal.i.e(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "addSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
        } else {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // m3.a
    public void addTag(String key, String value) {
        kotlin.jvm.internal.i.e(key, "key");
        kotlin.jvm.internal.i.e(value, "value");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) key, value);
        }
    }

    @Override // m3.a
    public void addTags(Map<String, String> tags) {
        kotlin.jvm.internal.i.e(tags, "tags");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        C0617a c0617a = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c0617a.entrySet()) {
            if (!kotlin.jvm.internal.i.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return t.u0(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // m3.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // m3.a
    public String getOnesignalId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // m3.a
    public y3.b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final w3.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // m3.a
    public Map<String, String> getTags() {
        return t.u0(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(C0617a model, String tag) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.i.e(args, "args");
        kotlin.jvm.internal.i.e(tag, "tag");
        if (kotlin.jvm.internal.i.a(args.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new x3.c(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // m3.a
    public void removeAlias(String label) {
        kotlin.jvm.internal.i.e(label, "label");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove empty alias");
        } else if (label.equals("onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // m3.a
    public void removeAliases(Collection<String> labels) {
        kotlin.jvm.internal.i.e(labels, "labels");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "removeAliases(labels: " + labels + ')');
        for (String str : labels) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (kotlin.jvm.internal.i.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // m3.a
    public void removeEmail(String email) {
        kotlin.jvm.internal.i.e(email, "email");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "removeEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
        } else {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove invalid email address as subscription: ".concat(email));
        }
    }

    @Override // m3.a
    public void removeObserver(InterfaceC0730a observer) {
        kotlin.jvm.internal.i.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // m3.a
    public void removeSms(String sms) {
        kotlin.jvm.internal.i.e(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "removeSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
        } else {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove invalid sms number as subscription: ".concat(sms));
        }
    }

    @Override // m3.a
    public void removeTag(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // m3.a
    public void removeTags(Collection<String> keys) {
        kotlin.jvm.internal.i.e(keys, "keys");
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "removeTags(keys: " + keys + ')');
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = keys.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // m3.a
    public void setLanguage(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this._languageContext.setLanguage(value);
    }

    @Override // m3.a
    public void trackEvent(String name, Map<String, ? extends Object> map) {
        kotlin.jvm.internal.i.e(name, "name");
        if (com.onesignal.common.f.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(name, map);
        } else {
            com.onesignal.debug.internal.logging.b.log(i2.c.ERROR, "Custom event properties are not JSON-serializable");
        }
    }
}
