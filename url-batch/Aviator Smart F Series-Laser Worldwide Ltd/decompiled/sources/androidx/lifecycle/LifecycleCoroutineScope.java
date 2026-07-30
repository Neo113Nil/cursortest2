package androidx.lifecycle;

import f6.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.l1;

/* loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements i0 {
    @Override // kotlinx.coroutines.i0
    public abstract /* synthetic */ CoroutineContext getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final l1 launchWhenCreated(p block) {
        l1 launch$default;
        s.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.i.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3, null);
        return launch$default;
    }

    public final l1 launchWhenResumed(p block) {
        l1 launch$default;
        s.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.i.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3, null);
        return launch$default;
    }

    public final l1 launchWhenStarted(p block) {
        l1 launch$default;
        s.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.i.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3, null);
        return launch$default;
    }
}
