package com.onesignal.user.internal.subscriptions.impl;

import E7.l;
import V5.e;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.modeling.j;
import com.onesignal.user.internal.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import q7.v;
import r7.AbstractC4979j;
import r7.C4985p;
import t4.f;

/* loaded from: classes2.dex */
public final class b implements V5.b, com.onesignal.common.modeling.d, K5.a {
    private final f _applicationService;
    private final K5.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private V5.c subscriptions;

    public static final class a extends i implements l {
        final /* synthetic */ X5.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(X5.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((V5.a) obj);
            return v.f40183a;
        }

        public final void invoke(V5.a it) {
            h.e(it, "it");
            it.onSubscriptionAdded(this.$subscription);
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0253b extends i implements l {
        final /* synthetic */ X5.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0253b(X5.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // E7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((X5.c) null);
            return v.f40183a;
        }

        public final void invoke(X5.c it) {
            h.e(it, "it");
            new X5.f(((g) this.$subscription).getSavedState(), ((g) this.$subscription).refreshState());
            it.a();
        }
    }

    public static final class c extends i implements l {
        final /* synthetic */ j $args;
        final /* synthetic */ X5.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(X5.e eVar, j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((V5.a) obj);
            return v.f40183a;
        }

        public final void invoke(V5.a it) {
            h.e(it, "it");
            it.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    public static final class d extends i implements l {
        final /* synthetic */ X5.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(X5.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((V5.a) obj);
            return v.f40183a;
        }

        public final void invoke(V5.a it) {
            h.e(it, "it");
            it.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f _applicationService, K5.b _sessionService, e _subscriptionModelStore) {
        h.e(_applicationService, "_applicationService");
        h.e(_sessionService, "_sessionService");
        h.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new V5.c(C4985p.f40358n, new com.onesignal.user.internal.j());
        Iterator<com.onesignal.common.modeling.i> it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((V5.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(V5.g gVar, String str, V5.f fVar) {
        String hash = gVar != V5.g.PUSH ? com.onesignal.common.j.INSTANCE.hash(str) : str;
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + hash + ')');
        V5.d dVar = new V5.d();
        dVar.setId(com.onesignal.common.d.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = V5.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, V5.g gVar, String str, V5.f fVar, int i, Object obj) {
        if ((i & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(V5.d dVar) {
        X5.e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList S8 = AbstractC4979j.S(getSubscriptions().getCollection());
        if (dVar.getType() == V5.g.PUSH) {
            X5.b push = getSubscriptions().getPush();
            h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            g gVar = (g) push;
            h.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((g) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(gVar.getChangeHandlersNotifier());
            S8.remove(gVar);
        }
        S8.add(createSubscriptionFromModel);
        setSubscriptions(new V5.c(S8, new com.onesignal.user.internal.j()));
        this.events.fire(new a(createSubscriptionFromModel));
    }

    private final X5.e createSubscriptionFromModel(V5.d dVar) {
        int i = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i == 1) {
            return new com.onesignal.user.internal.h(dVar);
        }
        if (i == 2) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i == 3) {
            return new g(dVar);
        }
        throw new B0.c();
    }

    private final void refreshPushSubscriptionState() {
        Object push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            return;
        }
        h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        V5.d model = ((com.onesignal.user.internal.i) push).getModel();
        model.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        h.d(RELEASE, "RELEASE");
        model.setDeviceOS(RELEASE);
        String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(X5.e eVar) {
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(X5.e eVar) {
        ArrayList S8 = AbstractC4979j.S(getSubscriptions().getCollection());
        S8.remove(eVar);
        setSubscriptions(new V5.c(S8, new com.onesignal.user.internal.j()));
        this.events.fire(new d(eVar));
    }

    @Override // V5.b
    public void addEmailSubscription(String email) {
        h.e(email, "email");
        addSubscriptionToModels$default(this, V5.g.EMAIL, email, null, 4, null);
    }

    @Override // V5.b
    public void addOrUpdatePushSubscriptionToken(String str, V5.f pushTokenStatus) {
        h.e(pushTokenStatus, "pushTokenStatus");
        Object push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            V5.g gVar = V5.g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, pushTokenStatus);
            return;
        }
        h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        V5.d model = ((com.onesignal.user.internal.i) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(pushTokenStatus);
    }

    @Override // V5.b
    public void addSmsSubscription(String sms) {
        h.e(sms, "sms");
        addSubscriptionToModels$default(this, V5.g.SMS, sms, null, 4, null);
    }

    @Override // V5.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // V5.b
    public V5.d getPushSubscriptionModel() {
        X5.b push = getSubscriptions().getPush();
        h.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((g) push).getModel();
    }

    @Override // V5.b
    public V5.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        Object obj;
        h.e(args, "args");
        h.e(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            X5.e eVar = (X5.e) obj;
            com.onesignal.common.modeling.i model = args.getModel();
            h.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (h.a(model, ((com.onesignal.user.internal.i) eVar).getModel())) {
                break;
            }
        }
        X5.e eVar2 = (X5.e) obj;
        if (eVar2 == null) {
            com.onesignal.common.modeling.i model2 = args.getModel();
            h.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((V5.d) model2);
        } else {
            if (eVar2 instanceof g) {
                ((g) eVar2).getChangeHandlersNotifier().fireOnMain(new C0253b(eVar2));
            }
            this.events.fire(new c(eVar2, args));
        }
    }

    @Override // K5.a
    public void onSessionActive() {
    }

    @Override // K5.a
    public void onSessionEnded(long j9) {
    }

    @Override // K5.a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // V5.b
    public void removeEmailSubscription(String email) {
        Object obj;
        h.e(email, "email");
        String hash = com.onesignal.common.j.INSTANCE.hash(email);
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            X5.a aVar = (X5.a) obj;
            if (aVar instanceof com.onesignal.user.internal.c) {
                com.onesignal.user.internal.c cVar = (com.onesignal.user.internal.c) aVar;
                if (h.a(cVar.getModel().getAddress(), email) || h.a(cVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        X5.a aVar2 = (X5.a) obj;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    @Override // V5.b
    public void removeSmsSubscription(String sms) {
        Object obj;
        h.e(sms, "sms");
        String hash = com.onesignal.common.j.INSTANCE.hash(sms);
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            X5.d dVar = (X5.d) obj;
            if (dVar instanceof com.onesignal.user.internal.h) {
                com.onesignal.user.internal.h hVar = (com.onesignal.user.internal.h) dVar;
                if (h.a(hVar.getModel().getAddress(), sms) || h.a(hVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        X5.d dVar2 = (X5.d) obj;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // V5.b
    public void setSubscriptions(V5.c cVar) {
        h.e(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(V5.d model, String tag) {
        h.e(model, "model");
        h.e(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(V5.d model, String tag) {
        Object obj;
        h.e(model, "model");
        h.e(tag, "tag");
        if (model.getType() == V5.g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (h.a(((X5.e) obj).getId(), model.getId())) {
                    break;
                }
            }
        }
        X5.e eVar = (X5.e) obj;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // V5.b, com.onesignal.common.events.d
    public void subscribe(V5.a handler) {
        h.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // V5.b, com.onesignal.common.events.d
    public void unsubscribe(V5.a handler) {
        h.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
