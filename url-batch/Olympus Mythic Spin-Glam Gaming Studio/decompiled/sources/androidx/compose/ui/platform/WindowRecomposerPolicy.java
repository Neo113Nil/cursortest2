package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* compiled from: WindowRecomposer.android.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui_release", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "factory", "Ljava/util/concurrent/atomic/AtomicReference;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@InternalComposeUiApi
/* loaded from: classes14.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference factory = new AtomicReference(WindowRecomposerFactory.INSTANCE.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View rootView) {
        final Job launch$default;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Recomposer createRecomposer = ((WindowRecomposerFactory) factory.get()).createRecomposer(rootView);
        WindowRecomposer_androidKt.setCompositionContext(rootView, createRecomposer);
        GlobalScope globalScope = GlobalScope.INSTANCE;
        Handler handler = rootView.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "rootView.handler");
        launch$default = BuildersKt__Builders_commonKt.launch$default(globalScope, HandlerDispatcherKt.from(handler, "windowRecomposer cleanup").getImmediate(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, rootView, null), 2, null);
        rootView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                v.removeOnAttachStateChangeListener(this);
                Job.DefaultImpls.cancel$default(Job.this, null, 1, null);
            }
        });
        return createRecomposer;
    }
}
