package curtains;

import android.view.View;
import android.view.Window;
import bo.app.a$$ExternalSyntheticBUOutline0;
import curtains.internal.WindowCallbackWrapper;
import curtains.internal.WindowSpy;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.internal.DefaultSocket;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class WindowsKt {
    public static final Lazy tooltipString$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) Curtains$rootViewsSpy$2.INSTANCE$1);

    public static final Window getPhoneWindow(View view) {
        Field field;
        view.getClass();
        Lazy lazy = WindowSpy.decorViewClass$delegate;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) WindowSpy.decorViewClass$delegate.getValue();
        if (cls != null && cls.isInstance(rootView) && (field = (Field) WindowSpy.windowField$delegate.getValue()) != null) {
            Object obj = field.get(rootView);
            if (obj != null) {
                return (Window) obj;
            }
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.Window");
        }
        return null;
    }

    public static final void onDecorViewReady(Window window, Function1 function1) {
        window.getClass();
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            function1.invoke(peekDecorView);
            return;
        }
        Lazy lazy = WindowCallbackWrapper.jetpackWrapperClass$delegate;
        DefaultSocket listeners = PapaEvent.getListeners(window);
        ((CopyOnWriteArrayList) listeners.source).add(new WindowsKt$onDecorViewReady$$inlined$run$lambda$1(listeners, window, function1));
    }
}
