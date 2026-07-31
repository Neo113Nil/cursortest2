package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityResultCaller.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "input", "Landroidx/core/app/ActivityOptionsCompat;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "launch", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "()V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "callerInput", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "contract", "getContract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {
    private final ActivityResultContract callerContract;
    private final Object callerInput;
    private final ActivityResultContract contract;
    private final ActivityResultLauncher launcher;

    public final ActivityResultContract getCallerContract() {
        return this.callerContract;
    }

    public final Object getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(Unit input, ActivityOptionsCompat options) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.launcher.launch(this.callerInput, options);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract getContract() {
        return this.contract;
    }
}
