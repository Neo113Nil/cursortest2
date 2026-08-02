package papa;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class Handlers$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ Handlers$$ExternalSyntheticLambda2(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                Class cls = AndroidComposeView.systemPropertiesClass;
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
