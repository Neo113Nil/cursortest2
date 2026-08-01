package com.onesignal.user.internal.subscriptions.impl;

import a2.r;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.h;
import com.onesignal.common.modeling.i;
import com.onesignal.common.modeling.j;
import dd.e;
import dd.g;
import ea.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements dd.b, com.onesignal.common.modeling.d, sc.a {
    private final f _applicationService;
    private final sc.b _sessionService;
    private final e _subscriptionModelStore;
    private final com.onesignal.common.events.b events;
    private dd.c subscriptions;

    public b(f fVar, sc.b bVar, e eVar) {
        fVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._subscriptionModelStore = eVar;
        this.events = new com.onesignal.common.events.b();
        this.subscriptions = new dd.c(j0.f5574d, new com.onesignal.user.internal.e());
        Iterator<i> it = eVar.list().iterator();
        while (it.hasNext()) {
            createSubscriptionAndAddToSubscriptionList((dd.d) it.next());
        }
        this._subscriptionModelStore.subscribe((com.onesignal.common.modeling.d) this);
        this._sessionService.subscribe(this);
    }

    private final void addSubscriptionToModels(g gVar, String str, dd.f fVar) {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "SubscriptionManager.addSubscription(type: " + gVar + ", address: " + str + ')');
        dd.d dVar = new dd.d();
        dVar.setId(com.onesignal.common.d.INSTANCE.createLocalId());
        dVar.setOptedIn(true);
        dVar.setType(gVar);
        dVar.setAddress(str);
        if (fVar == null) {
            fVar = dd.f.SUBSCRIBED;
        }
        dVar.setStatus(fVar);
        com.onesignal.common.modeling.b.add$default(this._subscriptionModelStore, dVar, null, 2, null);
    }

    public static /* synthetic */ void addSubscriptionToModels$default(b bVar, g gVar, String str, dd.f fVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            fVar = null;
        }
        bVar.addSubscriptionToModels(gVar, str, fVar);
    }

    private final void createSubscriptionAndAddToSubscriptionList(dd.d dVar) {
        fd.e createSubscriptionFromModel = createSubscriptionFromModel(dVar);
        ArrayList R = CollectionsKt.R(getSubscriptions().getCollection());
        if (dVar.getType() == g.PUSH) {
            fd.b push = getSubscriptions().getPush();
            push.getClass();
            com.onesignal.user.internal.b bVar = (com.onesignal.user.internal.b) push;
            createSubscriptionFromModel.getClass();
            ((com.onesignal.user.internal.b) createSubscriptionFromModel).getChangeHandlersNotifier().subscribeAll(bVar.getChangeHandlersNotifier());
            R.remove(bVar);
        }
        R.add(createSubscriptionFromModel);
        setSubscriptions(new dd.c(R, new com.onesignal.user.internal.e()));
        this.events.fire(new a(createSubscriptionFromModel));
    }

    private final fd.e createSubscriptionFromModel(dd.d dVar) {
        int i3 = com.onesignal.user.internal.subscriptions.impl.a.$EnumSwitchMapping$0[dVar.getType().ordinal()];
        if (i3 == 1) {
            return new com.onesignal.user.internal.c(dVar);
        }
        if (i3 == 2) {
            return new com.onesignal.user.internal.a(dVar);
        }
        if (i3 == 3) {
            return new com.onesignal.user.internal.b(dVar);
        }
        r.p();
        return null;
    }

    private final void refreshPushSubscriptionState() {
        Object push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            return;
        }
        push.getClass();
        dd.d model = ((com.onesignal.user.internal.d) push).getModel();
        model.setSdk(h.INSTANCE.getSdkVersion());
        String str = Build.VERSION.RELEASE;
        str.getClass();
        model.setDeviceOS(str);
        String carrierName = com.onesignal.common.c.INSTANCE.getCarrierName(this._applicationService.getAppContext());
        if (carrierName != null) {
            model.setCarrier(carrierName);
        }
        String appVersion = AndroidUtils.INSTANCE.getAppVersion(this._applicationService.getAppContext());
        if (appVersion != null) {
            model.setAppVersion(appVersion);
        }
    }

    private final void removeSubscriptionFromModels(fd.e eVar) {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "SubscriptionManager.removeSubscription(subscription: " + eVar + ')');
        com.onesignal.common.modeling.b.remove$default(this._subscriptionModelStore, eVar.getId(), null, 2, null);
    }

    private final void removeSubscriptionFromSubscriptionList(fd.e eVar) {
        ArrayList R = CollectionsKt.R(getSubscriptions().getCollection());
        R.remove(eVar);
        setSubscriptions(new dd.c(R, new com.onesignal.user.internal.e()));
        this.events.fire(new d(eVar));
    }

    @Override // dd.b
    public void addEmailSubscription(String str) {
        str.getClass();
        addSubscriptionToModels$default(this, g.EMAIL, str, null, 4, null);
    }

    @Override // dd.b
    public void addOrUpdatePushSubscriptionToken(String str, dd.f fVar) {
        fVar.getClass();
        Object push = getSubscriptions().getPush();
        if (push instanceof com.onesignal.user.internal.e) {
            g gVar = g.PUSH;
            if (str == null) {
                str = "";
            }
            addSubscriptionToModels(gVar, str, fVar);
            return;
        }
        push.getClass();
        dd.d model = ((com.onesignal.user.internal.d) push).getModel();
        if (str != null) {
            model.setAddress(str);
        }
        model.setStatus(fVar);
    }

    @Override // dd.b
    public void addSmsSubscription(String str) {
        str.getClass();
        addSubscriptionToModels$default(this, g.SMS, str, null, 4, null);
    }

    @Override // dd.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // dd.b
    public dd.d getPushSubscriptionModel() {
        fd.b push = getSubscriptions().getPush();
        push.getClass();
        return ((com.onesignal.user.internal.b) push).getModel();
    }

    @Override // dd.b
    public dd.c getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(dd.d dVar, String str) {
        dVar.getClass();
        str.getClass();
        createSubscriptionAndAddToSubscriptionList(dVar);
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(dd.d dVar, String str) {
        Object obj;
        dVar.getClass();
        str.getClass();
        if (dVar.getType() == g.PUSH) {
            return;
        }
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.a(((fd.e) obj).getId(), dVar.getId())) {
                    break;
                }
            }
        }
        fd.e eVar = (fd.e) obj;
        if (eVar != null) {
            removeSubscriptionFromSubscriptionList(eVar);
        }
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j jVar, String str) {
        Object obj;
        jVar.getClass();
        str.getClass();
        Iterator<T> it = getSubscriptions().getCollection().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            fd.e eVar = (fd.e) obj;
            i model = jVar.getModel();
            eVar.getClass();
            if (Intrinsics.a(model, ((com.onesignal.user.internal.d) eVar).getModel())) {
                break;
            }
        }
        fd.e eVar2 = (fd.e) obj;
        if (eVar2 == null) {
            i model2 = jVar.getModel();
            model2.getClass();
            createSubscriptionAndAddToSubscriptionList((dd.d) model2);
        } else {
            if (eVar2 instanceof com.onesignal.user.internal.b) {
                ((com.onesignal.user.internal.b) eVar2).getChangeHandlersNotifier().fireOnMain(new C0072b(eVar2));
            }
            this.events.fire(new c(eVar2, jVar));
        }
    }

    @Override // sc.a
    public void onSessionStarted() {
        refreshPushSubscriptionState();
    }

    @Override // dd.b
    public void removeEmailSubscription(String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = getSubscriptions().getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            fd.a aVar = (fd.a) obj;
            if ((aVar instanceof com.onesignal.user.internal.a) && Intrinsics.a(aVar.getEmail(), str)) {
                break;
            }
        }
        fd.a aVar2 = (fd.a) obj;
        if (aVar2 != null) {
            removeSubscriptionFromModels(aVar2);
        }
    }

    @Override // dd.b
    public void removeSmsSubscription(String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = getSubscriptions().getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            fd.d dVar = (fd.d) obj;
            if ((dVar instanceof com.onesignal.user.internal.c) && Intrinsics.a(dVar.getNumber(), str)) {
                break;
            }
        }
        fd.d dVar2 = (fd.d) obj;
        if (dVar2 != null) {
            removeSubscriptionFromModels(dVar2);
        }
    }

    @Override // dd.b
    public void setSubscriptions(dd.c cVar) {
        cVar.getClass();
        this.subscriptions = cVar;
    }

    @Override // dd.b, com.onesignal.common.events.d
    public void subscribe(dd.a aVar) {
        aVar.getClass();
        this.events.subscribe(aVar);
    }

    @Override // dd.b, com.onesignal.common.events.d
    public void unsubscribe(dd.a aVar) {
        aVar.getClass();
        this.events.unsubscribe(aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ fd.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fd.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        public final void invoke(dd.a aVar) {
            aVar.getClass();
            aVar.onSubscriptionAdded(this.$subscription);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((dd.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function1 {
        final /* synthetic */ fd.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fd.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        public final void invoke(dd.a aVar) {
            aVar.getClass();
            aVar.onSubscriptionRemoved(this.$subscription);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((dd.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ fd.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fd.e eVar, j jVar) {
            super(1);
            this.$subscription = eVar;
            this.$args = jVar;
        }

        public final void invoke(dd.a aVar) {
            aVar.getClass();
            aVar.onSubscriptionChanged(this.$subscription, this.$args);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((dd.a) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.user.internal.subscriptions.impl.b$b, reason: collision with other inner class name */
    public static final class C0072b extends p implements Function1 {
        final /* synthetic */ fd.e $subscription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0072b(fd.e eVar) {
            super(1);
            this.$subscription = eVar;
        }

        public final void invoke(fd.c cVar) {
            cVar.getClass();
            new fd.f(((com.onesignal.user.internal.b) this.$subscription).getSavedState(), ((com.onesignal.user.internal.b) this.$subscription).refreshState());
            cVar.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                invoke((fd.c) null);
                return Unit.f5554a;
            }
            i0.j();
            return null;
        }
    }

    @Override // sc.a
    public void onSessionActive() {
    }

    @Override // sc.a
    public void onSessionEnded(long j) {
    }
}
