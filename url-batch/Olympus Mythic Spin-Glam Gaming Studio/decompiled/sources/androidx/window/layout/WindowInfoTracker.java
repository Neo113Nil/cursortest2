package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;

/* compiled from: WindowInfoTracker.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "windowLayoutInfo", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "Landroid/app/Activity;", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface WindowInfoTracker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    static WindowInfoTracker getOrCreate(Context context) {
        return INSTANCE.getOrCreate(context);
    }

    Flow windowLayoutInfo(Activity activity);

    /* compiled from: WindowInfoTracker.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "(Landroid/content/Context;)Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "(Landroid/content/Context;)Landroidx/window/layout/WindowBackend;", "windowBackend", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = Reflection.getOrCreateKotlinClass(WindowInfoTracker.class).getSimpleName();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        public final WindowBackend windowBackend$window_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
                if (DEBUG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            return extensionWindowLayoutInfoBackend == null ? SidecarWindowBackend.INSTANCE.getInstance(context) : extensionWindowLayoutInfoBackend;
        }
    }
}
