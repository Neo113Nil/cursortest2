package com.yandex.div.core.view2;

import a2.AbstractC1241b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@f(c = "com.yandex.div.core.view2.DivViewCreator$viewPreCreationProfile$1$1", f = "DivViewCreator.kt", l = {IronSourceConstants.REGISTER_TRIGGER}, m = "invokeSuspend")
@Metadata
/* loaded from: classes2.dex */
final class DivViewCreator$viewPreCreationProfile$1$1 extends l implements Function2<InterfaceC3316J, d, Object> {
    final /* synthetic */ String $it;
    final /* synthetic */ ViewPreCreationProfileRepository $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivViewCreator$viewPreCreationProfile$1$1(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, d dVar) {
        super(2, dVar);
        this.$repository = viewPreCreationProfileRepository;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final d create(@Nullable Object obj, @NotNull d dVar) {
        return new DivViewCreator$viewPreCreationProfile$1$1(this.$repository, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            return obj;
        }
        ResultKt.a(obj);
        ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.$repository;
        String str = this.$it;
        this.label = 1;
        Object obj2 = viewPreCreationProfileRepository.get(str, this);
        return obj2 == f4 ? f4 : obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable d dVar) {
        return ((DivViewCreator$viewPreCreationProfile$1$1) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
    }
}
