package com.onesignal.common.modeling;

import k5.v;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public class m implements f, d {
    private final com.onesignal.common.events.b changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final k store;

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return v.f5219a;
        }

        public final void invoke(g it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    public static final class b extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ i $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$existingModel = iVar;
            this.$tag = str;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return v.f5219a;
        }

        public final void invoke(g it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public m(k store) {
        kotlin.jvm.internal.i.e(store, "store");
        this.store = store;
        this.changeSubscription = new com.onesignal.common.events.b();
        this.singletonId = "-singleton-";
        this.replaceLock = new Object();
        store.subscribe((d) this);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeSubscription.getHasSubscribers();
    }

    @Override // com.onesignal.common.modeling.f
    public i getModel() {
        synchronized (this) {
            i iVar = this.store.get(this.singletonId);
            if (iVar != null) {
                return iVar;
            }
            i create$default = com.onesignal.common.modeling.b.create$default(this.store, null, 1, null);
            if (create$default != null) {
                create$default.setId(this.singletonId);
                com.onesignal.common.modeling.b.add$default(this.store, create$default, null, 2, null);
                return create$default;
            }
            throw new Exception("Unable to initialize model from store " + this.store);
        }
    }

    public final k getStore() {
        return this.store;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(i model, String tag) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i model, String tag) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        kotlin.jvm.internal.i.e(args, "args");
        kotlin.jvm.internal.i.e(tag, "tag");
        this.changeSubscription.fire(new a(args, tag));
    }

    @Override // com.onesignal.common.modeling.f
    public void replace(i model, String tag) {
        kotlin.jvm.internal.i.e(model, "model");
        kotlin.jvm.internal.i.e(tag, "tag");
        synchronized (this.replaceLock) {
            i model2 = getModel();
            model2.initializeFromModel(this.singletonId, model);
            this.store.persist();
            this.changeSubscription.fire(new b(model2, tag));
        }
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void subscribe(g handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void unsubscribe(g handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }
}
