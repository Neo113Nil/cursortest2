package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;

/* compiled from: ExtensionInterfaceCompat.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\r"}, d2 = {"Landroidx/window/layout/ExtensionInterfaceCompat;", "", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "", "setExtensionCallback", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "Landroid/app/Activity;", "activity", "onWindowLayoutChangeListenerAdded", "(Landroid/app/Activity;)V", "onWindowLayoutChangeListenerRemoved", "ExtensionCallbackInterface", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ExtensionInterfaceCompat {

    /* compiled from: ExtensionInterfaceCompat.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "", "onWindowLayoutChanged", "", "activity", "Landroid/app/Activity;", "newLayout", "Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout);
    }

    void onWindowLayoutChangeListenerAdded(Activity activity);

    void onWindowLayoutChangeListenerRemoved(Activity activity);

    void setExtensionCallback(ExtensionCallbackInterface extensionCallback);
}
