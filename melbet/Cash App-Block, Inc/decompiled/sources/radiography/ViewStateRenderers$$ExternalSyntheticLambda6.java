package radiography;

import android.view.View;
import kotlin.jvm.functions.Function2;
import radiography.ScannableView;

/* loaded from: classes10.dex */
public final /* synthetic */ class ViewStateRenderers$$ExternalSyntheticLambda6 implements ViewStateRenderer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ViewStateRenderers$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // radiography.ViewStateRenderer
    public final void render(AttributeAppendable attributeAppendable, ScannableView scannableView) {
        View view;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                scannableView.getClass();
                ((ViewStateRenderers$$ExternalSyntheticLambda6) obj2).render(attributeAppendable, scannableView);
                ((ViewStateRenderer) obj).render(attributeAppendable, scannableView);
                break;
            default:
                Class cls = (Class) obj2;
                Function2 function2 = (Function2) obj;
                scannableView.getClass();
                ScannableView.AndroidView androidView = scannableView instanceof ScannableView.AndroidView ? (ScannableView.AndroidView) scannableView : null;
                if (androidView != null && (view = androidView.view) != null && cls.isInstance(view)) {
                    function2.invoke(attributeAppendable, view);
                    break;
                }
                break;
        }
    }
}
