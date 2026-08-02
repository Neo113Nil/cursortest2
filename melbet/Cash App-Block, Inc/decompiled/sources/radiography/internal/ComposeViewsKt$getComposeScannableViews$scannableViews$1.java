package radiography.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import radiography.ViewFilters;

/* loaded from: classes10.dex */
public final /* synthetic */ class ComposeViewsKt$getComposeScannableViews$scannableViews$1 extends FunctionReferenceImpl implements Function1 {
    public static final ComposeViewsKt$getComposeScannableViews$scannableViews$1 INSTANCE = new ComposeViewsKt$getComposeScannableViews$scannableViews$1(1, ViewFilters.class, "toScannableView", "toScannableView(Lradiography/internal/ComposeLayoutInfo;)Lradiography/ScannableView;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ComposeLayoutInfo composeLayoutInfo = (ComposeLayoutInfo) obj;
        composeLayoutInfo.getClass();
        return ViewFilters.toScannableView(composeLayoutInfo);
    }
}
