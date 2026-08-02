package xyz.block.genie.templates;

import androidx.camera.core.impl.DynamicRanges;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.local.presenters.brand.menu.LocalMenuComboDetailsPresenter;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import xyz.block.protos.genie.Expression;

/* loaded from: classes5.dex */
public final /* synthetic */ class GenieNodeInclusionKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ GenieNodeInclusionKt$$ExternalSyntheticLambda0(CoroutineScope coroutineScope, LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter) {
        this.f$0 = coroutineScope;
        this.f$1 = localMenuComboDetailsPresenter;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                DynamicRanges.GenieInclusionGate((Expression) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter = (LocalMenuComboDetailsPresenter) obj3;
                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) obj2;
                ((SchedulingDayTimeQuestion) obj).getClass();
                if (fulfillmentConfiguration != null) {
                    JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$ModuleJob$run$3(localMenuComboDetailsPresenter, fulfillmentConfiguration, null, 6), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GenieNodeInclusionKt$$ExternalSyntheticLambda0(Expression expression, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = expression;
        this.f$1 = composableLambdaImpl;
    }
}
