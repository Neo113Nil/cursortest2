package com.onesignal.common.modeling;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* JADX WARN: Incorrect field signature: TTModel; */
/* loaded from: classes.dex */
public final class ModelStore$removeItem$2 extends j implements InterfaceC1441l {
    final /* synthetic */ Model $model;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TTModel;Ljava/lang/String;)V */
    public ModelStore$removeItem$2(Model model, String str) {
        super(1);
        this.$model = model;
        this.$tag = str;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IModelStoreChangeHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IModelStoreChangeHandler<TModel> it) {
        i.e(it, "it");
        it.onModelRemoved(this.$model, this.$tag);
    }
}
