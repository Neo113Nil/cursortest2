package papa.internal;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PerfsActivityLifecycleCallbacks f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda13(PerfsActivityLifecycleCallbacks perfsActivityLifecycleCallbacks, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = perfsActivityLifecycleCallbacks;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        PerfsActivityLifecycleCallbacks perfsActivityLifecycleCallbacks = this.f$0;
        switch (i) {
            case 0:
                perfsActivityLifecycleCallbacks.updateAppStart(str, new SaversKt$$ExternalSyntheticLambda5(22));
                break;
            default:
                perfsActivityLifecycleCallbacks.updateAppStart(str, new SaversKt$$ExternalSyntheticLambda5(21));
                break;
        }
        return Unit.INSTANCE;
    }
}
