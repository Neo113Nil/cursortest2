package com.onesignal.common.modeling;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class m implements f, d {
    private final com.onesignal.common.events.b changeSubscription;
    private final Object replaceLock;
    private final String singletonId;
    private final k store;

    public static final class a extends p implements Function1 {
        final /* synthetic */ j $args;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$args = jVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.f6114a;
        }

        public final void invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelUpdated(this.$args, this.$tag);
        }
    }

    public static final class b extends p implements Function1 {
        final /* synthetic */ i $existingModel;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, String str) {
            super(1);
            this.$existingModel = iVar;
            this.$tag = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return Unit.f6114a;
        }

        public final void invoke(g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onModelReplaced(this.$existingModel, this.$tag);
        }
    }

    public m(k store) {
        Intrinsics.checkNotNullParameter(store, "store");
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
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(i model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.changeSubscription.fire(new a(args, tag));
    }

    @Override // com.onesignal.common.modeling.f
    public void replace(i model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        synchronized (this.replaceLock) {
            i model2 = getModel();
            model2.initializeFromModel(this.singletonId, model);
            this.store.persist();
            this.changeSubscription.fire(new b(model2, tag));
            Unit unit = Unit.f6114a;
        }
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void subscribe(g handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.subscribe(handler);
    }

    @Override // com.onesignal.common.modeling.f, com.onesignal.common.events.d
    public void unsubscribe(g handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.changeSubscription.unsubscribe(handler);
    }
}
