package gbcorp.c312.merkmarker.info.ui.composable.screen.productdetails;

import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductDetailsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MRKMRProductDetailsScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class MRKMRProductDetailsScreenKt$ProductDetailsScreen$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    MRKMRProductDetailsScreenKt$ProductDetailsScreen$2$1(Object obj) {
        super(0, obj, MRKMRProductDetailsViewModel.class, "addProductToCart", "addProductToCart()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MRKMRProductDetailsViewModel) this.receiver).addProductToCart();
    }
}
