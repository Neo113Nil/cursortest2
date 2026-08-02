package radiography;

import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import app.cash.local.views.internal.LocalMapKt;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ViewStateRenderers$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ ViewStateRenderers$$ExternalSyntheticLambda5(int i, int i2, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                AttributeAppendable attributeAppendable = (AttributeAppendable) obj;
                TextView textView = (TextView) obj2;
                attributeAppendable.getClass();
                textView.getClass();
                ViewStateRenderers$$ExternalSyntheticLambda0 viewStateRenderers$$ExternalSyntheticLambda0 = ViewStateRenderers.NoRenderer;
                ViewStateRenderers.appendTextValue$radiography_release(attributeAppendable, "text", textView.getText(), z, i2);
                if (textView.isInputMethodTarget()) {
                    attributeAppendable.append("ime-target");
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                SecureScreenKt.SecureScreen(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                CheckoutExpandableReviewRowKt.CheckoutReviewRowCaret(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                LocalMapKt.Checkmark(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalLoadingView(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                CheckboxKt.StaticCheckmark(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                BitcoinMapViewKt.BitcoinLocationMarker(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ListItemKt.SharedPartnerLoading(z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
