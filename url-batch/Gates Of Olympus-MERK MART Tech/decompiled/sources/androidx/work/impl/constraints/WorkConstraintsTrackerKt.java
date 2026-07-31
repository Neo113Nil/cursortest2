package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\"\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\"\u0013\u0010\r\u001a\u00070\u000e¢\u0006\u0002\b\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000*$\b\u0002\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0016"}, d2 = {"OnConstraintState", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "listen", "Lkotlinx/coroutines/Job;", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "spec", "Landroidx/work/impl/model/WorkSpec;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", "TAG", "", "Lorg/jspecify/annotations/NonNull;", "NetworkRequestConstraintController", "Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "context", "Landroid/content/Context;", "DefaultNetworkRequestTimeoutMs", "", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt {
    private static final long DefaultNetworkRequestTimeoutMs = 1000;
    private static final String TAG;

    public static final Job listen(WorkConstraintsTracker workConstraintsTracker, WorkSpec spec, CoroutineDispatcher dispatcher, OnConstraintsStateChangedListener listener) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(workConstraintsTracker, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, spec, listener, null), 3, null);
        return launch$default;
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(...)");
        TAG = tagWithPrefix;
    }

    public static final NetworkRequestConstraintController NetworkRequestConstraintController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new NetworkRequestConstraintController((ConnectivityManager) systemService, 0L, 2, null);
    }
}
