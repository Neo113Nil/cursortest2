package radiography;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import radiography.internal.ComposeLayoutInfo;

/* loaded from: classes10.dex */
public final /* synthetic */ class ScannableViewKt$toScannableView$3 extends FunctionReferenceImpl implements Function1 {
    public static final ScannableViewKt$toScannableView$3 INSTANCE = new ScannableViewKt$toScannableView$3(1, ViewFilters.class, "toScannableView", "toScannableView(Lradiography/internal/ComposeLayoutInfo;)Lradiography/ScannableView;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ComposeLayoutInfo composeLayoutInfo = (ComposeLayoutInfo) obj;
        composeLayoutInfo.getClass();
        return ViewFilters.toScannableView(composeLayoutInfo);
    }
}
