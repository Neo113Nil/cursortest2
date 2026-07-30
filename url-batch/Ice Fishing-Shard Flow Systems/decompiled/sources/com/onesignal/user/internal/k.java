package com.onesignal.user.internal;

import a4.InterfaceC0178b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class k implements O3.a, com.onesignal.common.modeling.g {
    private final S3.b _customEventController;
    private final T3.b _identityModelStore;
    private final D2.a _languageContext;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final Y3.b _subscriptionManager;
    private final com.onesignal.common.events.b changeHandlersNotifier;

    public static final class a extends p implements Function1 {
        final /* synthetic */ Z3.c $newUserState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z3.c cVar) {
            super(1);
            this.$newUserState = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(Z3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onUserStateChange(new Z3.b(this.$newUserState));
        }
    }

    public k(Y3.b _subscriptionManager, T3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, S3.b _customEventController, D2.a _languageContext) {
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_customEventController, "_customEventController");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._subscriptionManager = _subscriptionManager;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._customEventController = _customEventController;
        this._languageContext = _languageContext;
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        _identityModelStore.subscribe((com.onesignal.common.modeling.g) this);
    }

    private final T3.a get_identityModel() {
        return (T3.a) this._identityModelStore.getModel();
    }

    private final com.onesignal.user.internal.properties.a get_propertiesModel() {
        return (com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel();
    }

    @Override // O3.a
    public void addAlias(String label, String id) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(id, "id");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "setAlias(label: " + label + ", id: " + id + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add empty alias");
        } else if (Intrinsics.a(label, "onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add 'onesignal_id' alias");
        } else {
            get_identityModel().put((T3.a) label, id);
        }
    }

    @Override // O3.a
    public void addAliases(Map<String, String> aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "addAliases(aliases: " + aliases);
        for (Map.Entry<String, String> entry : aliases.entrySet()) {
            if (entry.getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add empty alias");
                return;
            } else if (Intrinsics.a(entry.getKey(), "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add 'onesignal_id' alias");
                return;
            }
        }
        for (Map.Entry<String, String> entry2 : aliases.entrySet()) {
            get_identityModel().put((T3.a) entry2.getKey(), entry2.getValue());
        }
    }

    @Override // O3.a
    public void addEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "addEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.addEmailSubscription(email);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add invalid email address as subscription: " + email);
    }

    @Override // O3.a
    public void addObserver(Z3.a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    @Override // O3.a
    public void addSms(String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "addSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.addSmsSubscription(sms);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add invalid sms number as subscription: " + sms);
    }

    @Override // O3.a
    public void addTag(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "setTag(key: " + key + ", value: " + value + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add tag with empty key");
        } else {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) key, value);
        }
    }

    @Override // O3.a
    public void addTags(Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "setTags(tags: " + tags + ')');
        Iterator<Map.Entry<String, String>> it = tags.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().length() == 0) {
                com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot add tag with empty key");
                return;
            }
        }
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            get_propertiesModel().getTags().put((com.onesignal.common.modeling.h) entry.getKey(), entry.getValue());
        }
    }

    public final Map<String, String> getAliases() {
        T3.a aVar = get_identityModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : aVar.entrySet()) {
            if (!Intrinsics.a(entry.getKey(), "id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return I.i(linkedHashMap);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // O3.a
    public String getExternalId() {
        String externalId = get_identityModel().getExternalId();
        return externalId == null ? "" : externalId;
    }

    @Override // O3.a
    public String getOnesignalId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(get_identityModel().getOnesignalId()) ? "" : get_identityModel().getOnesignalId();
    }

    @Override // O3.a
    public InterfaceC0178b getPushSubscription() {
        return this._subscriptionManager.getSubscriptions().getPush();
    }

    public final Y3.c getSubscriptions() {
        return this._subscriptionManager.getSubscriptions();
    }

    @Override // O3.a
    public Map<String, String> getTags() {
        return I.i(get_propertiesModel().getTags());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(T3.a model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(args.getProperty(), "onesignal_id")) {
            this.changeHandlersNotifier.fire(new a(new Z3.c(String.valueOf(args.getNewValue()), getExternalId())));
        }
    }

    @Override // O3.a
    public void removeAlias(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "removeAlias(label: " + label + ')');
        if (label.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove empty alias");
        } else if (Intrinsics.a(label, "onesignal_id")) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove 'onesignal_id' alias");
        } else {
            get_identityModel().remove((Object) label);
        }
    }

    @Override // O3.a
    public void removeAliases(Collection<String> labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "removeAliases(labels: " + labels + ')');
        for (String str : labels) {
            if (str.length() == 0) {
                com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove empty alias");
                return;
            } else if (Intrinsics.a(str, "onesignal_id")) {
                com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove 'onesignal_id' alias");
                return;
            }
        }
        Iterator<T> it = labels.iterator();
        while (it.hasNext()) {
            get_identityModel().remove(it.next());
        }
    }

    @Override // O3.a
    public void removeEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "removeEmail(email: " + email + ')');
        if (com.onesignal.common.h.INSTANCE.isValidEmail(email)) {
            this._subscriptionManager.removeEmailSubscription(email);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove invalid email address as subscription: " + email);
    }

    @Override // O3.a
    public void removeObserver(Z3.a observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }

    @Override // O3.a
    public void removeSms(String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "removeSms(sms: " + sms + ')');
        if (com.onesignal.common.h.INSTANCE.isValidPhoneNumber(sms)) {
            this._subscriptionManager.removeSmsSubscription(sms);
            return;
        }
        com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove invalid sms number as subscription: " + sms);
    }

    @Override // O3.a
    public void removeTag(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "removeTag(key: " + key + ')');
        if (key.length() == 0) {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove tag with empty key");
        } else {
            get_propertiesModel().getTags().remove((Object) key);
        }
    }

    @Override // O3.a
    public void removeTags(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "removeTags(keys: " + keys + ')');
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() == 0) {
                com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Cannot remove tag with empty key");
                return;
            }
        }
        Iterator<T> it2 = keys.iterator();
        while (it2.hasNext()) {
            get_propertiesModel().getTags().remove(it2.next());
        }
    }

    @Override // O3.a
    public void setLanguage(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._languageContext.setLanguage(value);
    }

    @Override // O3.a
    public void trackEvent(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (com.onesignal.common.f.INSTANCE.isValidJsonObject(map)) {
            this._customEventController.sendCustomEvent(name, map);
        } else {
            com.onesignal.debug.internal.logging.b.log(K2.c.ERROR, "Custom event properties are not JSON-serializable");
        }
    }
}
