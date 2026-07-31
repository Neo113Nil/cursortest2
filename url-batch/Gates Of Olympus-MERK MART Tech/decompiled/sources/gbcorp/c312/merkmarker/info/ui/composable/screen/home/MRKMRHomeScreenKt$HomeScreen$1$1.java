package gbcorp.c312.merkmarker.info.ui.composable.screen.home;

import gbcorp.c312.merkmarker.info.ui.viewmodel.MRKMRProductViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MRKMRHomeScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class MRKMRHomeScreenKt$HomeScreen$1$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    MRKMRHomeScreenKt$HomeScreen$1$1(Object obj) {
        super(1, obj, MRKMRProductViewModel.class, "addToCart", "addToCart(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((MRKMRProductViewModel) this.receiver).addToCart(i);
    }
}
