package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;

/* compiled from: ActivityResultRegistry.kt */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "unregister", "()V", "input", "Landroidx/core/app/ActivityOptionsCompat;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "Landroidx/activity/compose/ActivityResultLauncherHolder;", "launcher", "Landroidx/activity/compose/ActivityResultLauncherHolder;", "Landroidx/compose/runtime/State;", "Landroidx/activity/result/contract/ActivityResultContract;", "currentContract", "Landroidx/compose/runtime/State;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    private final State currentContract;
    private final ActivityResultLauncherHolder launcher;

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(Object input, ActivityOptionsCompat options) {
        this.launcher.launch(input, options);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract getContract() {
        return (ActivityResultContract) this.currentContract.getValue();
    }
}
