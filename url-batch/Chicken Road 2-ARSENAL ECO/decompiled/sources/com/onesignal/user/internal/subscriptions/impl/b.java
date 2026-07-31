package com.onesignal.user.internal.subscriptions.impl;

import H5.r;
import T1.f;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.user.internal.g;
import com.onesignal.user.internal.h;
import java.util.ArrayList;
import java.util.Iterator;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import l5.AbstractC0506j;
import l5.C0512p;
import w3.InterfaceC0719a;
import w3.InterfaceC0720b;
import w3.e;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b implements InterfaceC0720b, com.onesignal.common.modeling.d, InterfaceC0493a {
    private final f _applicationService;
    private final InterfaceC0494b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private w3.c subscriptions;

    public static final class a extends j implements InterfaceC0743l {
        final /* synthetic */ y3.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y3.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0719a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0719a it) {
            i.e(it, "it");
            it.onSubscriptionAdded(this.$subscription);
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0084b extends j implements InterfaceC0743l {
        final /* synthetic */ y3.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0084b(y3.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((y3.c) obj);
            return v.f5219a;
        }

        public final void invoke(y3.c it) {
            i.e(it, "it");
            it.onPushSubscriptionChange(new y3.f(((g) this.$subscription).getSavedState(), ((g) this.$subscription).refreshState()));
        }
    }

    public static final class c extends j implements InterfaceC0743l {
        final /* synthetic */ com.onesignal.common.modeling.j $args;
        final /* synthetic */ y3.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y3.e eVar, com.onesignal.common.modeling.j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0719a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0719a it) {
            i.e(it, "it");
            it.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    public static final class d extends j implements InterfaceC0743l {
        final /* synthetic */ y3.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(y3.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0719a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0719a it) {
            i.e(it, "it");
            it.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f _applicationService, InterfaceC0494b _sessionService, e _subscriptionModelStore) {
        i.e(_applicationService, "_applicationService");
        i.e(_sessionService, "_sessionService");
        i.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new w3.c(C0512p.f5303f, new com.onesignal.user.internal.j());
        Iterator<com.onesignal.common.modeling.i> it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((w3.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(w3.g gVar, String str, w3.f fVar) {
        String hash = gVar != w3.g.PUSH ? com.onesignal.common.j.INSTANCE.hash(str) : str;
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + hash + ')');
        w3.d dVar = new w3.d();
        dVar.setId(com.onesignal.common.d.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = w3.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, w3.g gVar, String str, w3.f fVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(w3.d dVar) {
        y3.e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList Q6 = AbstractC0506j.Q(getSubscriptions().getCollection());
        if (dVar.getType() == w3.g.PUSH) {
            y3.b push = getSubscriptions().getPush();
            i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            g gVar = (g) push;
            i.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((g) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(gVar.getChangeHandlersNotifier());
            Q6.remove(gVar);
        }
        Q6.add(createSubscriptionFromModel);
        setSubscriptions(new w3.c(Q6, new com.onesignal.user.internal.j()));
        this.events.fire(new a(createSubscriptionFromModel));
    }

    private final y3.e createSubscriptionFromModel(w3.d dVar) {
        int i7 = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i7 == 1) {
            return new h(dVar);
        }
        if (i7 == 2) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i7 == 3) {
            return new g(dVar);
        }
        throw new r();
    }

    private final void refreshPushSubscriptionState() {
        y3.e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            return;
        }
        i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        w3.d model = ((com.onesignal.user.internal.i) push).getModel();
        model.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        i.d(RELEASE, "RELEASE");
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

    private final void removeSubscriptionFromModels(y3.e eVar) {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(y3.e eVar) {
        ArrayList Q6 = AbstractC0506j.Q(getSubscriptions().getCollection());
        Q6.remove(eVar);
        setSubscriptions(new w3.c(Q6, new com.onesignal.user.internal.j()));
        this.events.fire(new d(eVar));
    }

    @Override // w3.InterfaceC0720b
    public void addEmailSubscription(String email) {
        i.e(email, "email");
        addSubscriptionToModels$default(this, w3.g.EMAIL, email, null, 4, null);
    }

    @Override // w3.InterfaceC0720b
    public void addOrUpdatePushSubscriptionToken(String str, w3.f pushTokenStatus) {
        i.e(pushTokenStatus, "pushTokenStatus");
        y3.e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            w3.g gVar = w3.g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, pushTokenStatus);
            return;
        }
        i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        w3.d model = ((com.onesignal.user.internal.i) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        boolean z5 = false;
        boolean z6 = str == null && pushTokenStatus.isRetryableTokenError();
        if (model.getStatus() == w3.f.SUBSCRIBED && model.getAddress().length() > 0) {
            z5 = true;
        }
        if (!z6 || !z5) {
            model.setStatus(pushTokenStatus);
            return;
        }
        com.onesignal.debug.internal.logging.b.warn$default("SubscriptionManager: ignoring transient push token status " + pushTokenStatus + " (" + pushTokenStatus.getValue() + ").", null, 2, null);
    }

    @Override // w3.InterfaceC0720b
    public void addSmsSubscription(String sms) {
        i.e(sms, "sms");
        addSubscriptionToModels$default(this, w3.g.SMS, sms, null, 4, null);
    }

    @Override // w3.InterfaceC0720b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // w3.InterfaceC0720b
    public w3.d getPushSubscriptionModel() {
        y3.b push = getSubscriptions().getPush();
        i.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((g) push).getModel();
    }

    @Override // w3.InterfaceC0720b
    public w3.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Object obj;
        i.e(args, "args");
        i.e(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y3.e eVar = (y3.e) obj;
            com.onesignal.common.modeling.i model = args.getModel();
            i.c(eVar, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (i.a(model, ((com.onesignal.user.internal.i) eVar).getModel())) {
                break;
            }
        }
        y3.e eVar2 = (y3.e) obj;
        if (eVar2 == null) {
            com.onesignal.common.modeling.i model2 = args.getModel();
            i.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((w3.d) model2);
        } else {
            if (eVar2 instanceof g) {
                ((g) eVar2).getChangeHandlersNotifier().fireOnMain(new C0084b(eVar2));
            }
            this.events.fire(new c(eVar2, args));
        }
    }

    @Override // l3.InterfaceC0493a
    public void onSessionActive() {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionEnded(long j4) {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // w3.InterfaceC0720b
    public void removeEmailSubscription(String email) {
        Object obj;
        i.e(email, "email");
        String hash = com.onesignal.common.j.INSTANCE.hash(email);
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y3.a aVar = (y3.a) obj;
            if (aVar instanceof com.onesignal.user.internal.c) {
                com.onesignal.user.internal.c cVar = (com.onesignal.user.internal.c) aVar;
                if (i.a(cVar.getModel().getAddress(), email) || i.a(cVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        y3.a aVar2 = (y3.a) obj;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    @Override // w3.InterfaceC0720b
    public void removeSmsSubscription(String sms) {
        Object obj;
        i.e(sms, "sms");
        String hash = com.onesignal.common.j.INSTANCE.hash(sms);
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            y3.d dVar = (y3.d) obj;
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                if (i.a(hVar.getModel().getAddress(), sms) || i.a(hVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        y3.d dVar2 = (y3.d) obj;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // w3.InterfaceC0720b
    public void setSubscriptions(w3.c cVar) {
        i.e(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(w3.d model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(w3.d model, String tag) {
        Object obj;
        i.e(model, "model");
        i.e(tag, "tag");
        if (model.getType() == w3.g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (i.a(((y3.e) obj).getId(), model.getId())) {
                    break;
                }
            }
        }
        y3.e eVar = (y3.e) obj;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // w3.InterfaceC0720b, com.onesignal.common.events.d
    public void subscribe(InterfaceC0719a handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // w3.InterfaceC0720b, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0719a handler) {
        i.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
