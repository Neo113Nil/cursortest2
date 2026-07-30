package com.onesignal.user.internal.subscriptions.impl;

import R5.k;
import Y3.e;
import a4.InterfaceC0177a;
import a4.InterfaceC0178b;
import a4.InterfaceC0179c;
import a4.InterfaceC0180d;
import a4.InterfaceC0181e;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.modeling.i;
import com.onesignal.common.modeling.j;
import com.onesignal.user.internal.g;
import com.onesignal.user.internal.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import v2.f;

/* loaded from: classes.dex */
public final class b implements Y3.b, com.onesignal.common.modeling.d, N3.a {
    private final f _applicationService;
    private final N3.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private Y3.c subscriptions;

    public static final class a extends p implements Function1 {
        final /* synthetic */ InterfaceC0181e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0181e interfaceC0181e) {
            super(1);
            this.$subscription = interfaceC0181e;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Y3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(Y3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionAdded(this.$subscription);
        }
    }

    /* renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0084b extends p implements Function1 {
        final /* synthetic */ InterfaceC0181e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0084b(InterfaceC0181e interfaceC0181e) {
            super(1);
            this.$subscription = interfaceC0181e;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0179c) obj);
            return Unit.f6114a;
        }

        public final void invoke(InterfaceC0179c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onPushSubscriptionChange(new a4.f(((g) this.$subscription).getSavedState(), ((g) this.$subscription).refreshState()));
        }
    }

    public static final class c extends p implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ InterfaceC0181e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0181e interfaceC0181e, j jVar) {
            super(1);
            this.$subscription = interfaceC0181e;
            this.$args = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Y3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(Y3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionChanged(this.$subscription, this.$args);
        }
    }

    public static final class d extends p implements Function1 {
        final /* synthetic */ InterfaceC0181e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0181e interfaceC0181e) {
            super(1);
            this.$subscription = interfaceC0181e;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Y3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(Y3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSubscriptionRemoved(this.$subscription);
        }
    }

    public b(f _applicationService, N3.b _sessionService, e _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new Y3.c(A.f6115d, new com.onesignal.user.internal.j());
        Iterator<i> it = _subscriptionModelStore.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((Y3.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(Y3.g gVar, String str, Y3.f fVar) {
        String hash = gVar != Y3.g.PUSH ? com.onesignal.common.j.INSTANCE.hash(str) : str;
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + hash + ')');
        Y3.d dVar = new Y3.d();
        dVar.setId(com.onesignal.common.d.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = Y3.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, Y3.g gVar, String str, Y3.f fVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(Y3.d dVar) {
        InterfaceC0181e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList A7 = CollectionsKt.A(getSubscriptions().getCollection());
        if (dVar.getType() == Y3.g.PUSH) {
            InterfaceC0178b push = getSubscriptions().getPush();
            Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            g gVar = (g) push;
            Intrinsics.c(createSubscriptionFromModel, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
            ((g) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(gVar.getChangeHandlersNotifier());
            A7.remove(gVar);
        }
        A7.add(createSubscriptionFromModel);
        setSubscriptions(new Y3.c(A7, new com.onesignal.user.internal.j()));
        this.events.fire(new a(createSubscriptionFromModel));
    }

    private final InterfaceC0181e createSubscriptionFromModel(Y3.d dVar) {
        int i2 = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i2 == 1) {
            return new h(dVar);
        }
        if (i2 == 2) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i2 == 3) {
            return new g(dVar);
        }
        throw new k();
    }

    private final void refreshPushSubscriptionState() {
        InterfaceC0181e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            return;
        }
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        Y3.d model = ((com.onesignal.user.internal.i) push).getModel();
        model.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
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

    private final void removeSubscriptionFromModels(InterfaceC0181e interfaceC0181e) {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + interfaceC0181e + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, interfaceC0181e.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(InterfaceC0181e interfaceC0181e) {
        ArrayList A7 = CollectionsKt.A(getSubscriptions().getCollection());
        A7.remove(interfaceC0181e);
        setSubscriptions(new Y3.c(A7, new com.onesignal.user.internal.j()));
        this.events.fire(new d(interfaceC0181e));
    }

    @Override // Y3.b
    public void addEmailSubscription(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        addSubscriptionToModels$default(this, Y3.g.EMAIL, email, null, 4, null);
    }

    @Override // Y3.b
    public void addOrUpdatePushSubscriptionToken(String str, Y3.f pushTokenStatus) {
        Intrinsics.checkNotNullParameter(pushTokenStatus, "pushTokenStatus");
        InterfaceC0181e push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.j) {
            Y3.g gVar = Y3.g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, pushTokenStatus);
            return;
        }
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
        Y3.d model = ((com.onesignal.user.internal.i) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(pushTokenStatus);
    }

    @Override // Y3.b
    public void addSmsSubscription(String sms) {
        Intrinsics.checkNotNullParameter(sms, "sms");
        addSubscriptionToModels$default(this, Y3.g.SMS, sms, null, 4, null);
    }

    @Override // Y3.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // Y3.b
    public Y3.d getPushSubscriptionModel() {
        InterfaceC0178b push = getSubscriptions().getPush();
        Intrinsics.c(push, "null cannot be cast to non-null type com.onesignal.user.internal.PushSubscription");
        return ((g) push).getModel();
    }

    @Override // Y3.b
    public Y3.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        Object obj;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            InterfaceC0181e interfaceC0181e = (InterfaceC0181e) obj;
            i model = args.getModel();
            Intrinsics.c(interfaceC0181e, "null cannot be cast to non-null type com.onesignal.user.internal.Subscription");
            if (Intrinsics.a(model, ((com.onesignal.user.internal.i) interfaceC0181e).getModel())) {
                break;
            }
        }
        InterfaceC0181e interfaceC0181e2 = (InterfaceC0181e) obj;
        if (interfaceC0181e2 == null) {
            i model2 = args.getModel();
            Intrinsics.c(model2, "null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionModel");
            createSubscriptionAndAddToSubscriptionList((Y3.d) model2);
        } else {
            if (interfaceC0181e2 instanceof g) {
                ((g) interfaceC0181e2).getChangeHandlersNotifier().fireOnMain(new C0084b(interfaceC0181e2));
            }
            this.events.fire(new c(interfaceC0181e2, args));
        }
    }

    @Override // N3.a
    public void onSessionActive() {
    }

    @Override // N3.a
    public void onSessionEnded(long j) {
    }

    @Override // N3.a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // Y3.b
    public void removeEmailSubscription(String email) {
        Object obj;
        Intrinsics.checkNotNullParameter(email, "email");
        String hash = com.onesignal.common.j.INSTANCE.hash(email);
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            InterfaceC0177a interfaceC0177a = (InterfaceC0177a) obj;
            if (interfaceC0177a instanceof com.onesignal.user.internal.c) {
                com.onesignal.user.internal.c cVar = (com.onesignal.user.internal.c) interfaceC0177a;
                if (Intrinsics.a(cVar.getModel().getAddress(), email) || Intrinsics.a(cVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        InterfaceC0177a interfaceC0177a2 = (InterfaceC0177a) obj;
        if (interfaceC0177a2 != null) {
            removeSubscriptionFromModels(interfaceC0177a2);
        }
    }

    @Override // Y3.b
    public void removeSmsSubscription(String sms) {
        Object obj;
        Intrinsics.checkNotNullParameter(sms, "sms");
        String hash = com.onesignal.common.j.INSTANCE.hash(sms);
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            InterfaceC0180d interfaceC0180d = (InterfaceC0180d) obj;
            if (interfaceC0180d instanceof h) {
                h hVar = (h) interfaceC0180d;
                if (Intrinsics.a(hVar.getModel().getAddress(), sms) || Intrinsics.a(hVar.getModel().getAddress(), hash)) {
                    break;
                }
            }
        }
        InterfaceC0180d interfaceC0180d2 = (InterfaceC0180d) obj;
        if (interfaceC0180d2 != null) {
            removeSubscriptionFromModels(interfaceC0180d2);
        }
    }

    @Override // Y3.b
    public void setSubscriptions(Y3.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.subscriptions = cVar;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(Y3.d model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        createSubscriptionAndAddToSubscriptionList(model);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(Y3.d model, String tag) {
        Object obj;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (model.getType() == Y3.g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.a(((InterfaceC0181e) obj).getId(), model.getId())) {
                    break;
                }
            }
        }
        InterfaceC0181e interfaceC0181e = (InterfaceC0181e) obj;
        if (interfaceC0181e != null) {
            removeSubscriptionFromSubscriptionList(interfaceC0181e);
        }
    }

    @Override // Y3.b, com.onesignal.common.events.d
    public void subscribe(Y3.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // Y3.b, com.onesignal.common.events.d
    public void unsubscribe(Y3.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
