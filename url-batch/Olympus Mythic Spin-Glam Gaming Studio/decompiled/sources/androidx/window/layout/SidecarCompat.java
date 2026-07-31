package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SidecarCompat.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0007\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020 H\u0017R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "componentCallbackMap", "", "Landroid/app/Activity;", "Landroid/content/ComponentCallbacks;", "extensionCallback", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "windowListenerRegisteredContexts", "Landroid/os/IBinder;", "getWindowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "onWindowLayoutChangeListenerAdded", "", "onWindowLayoutChangeListenerRemoved", "register", "windowToken", "registerConfigurationChangeListener", "setExtensionCallback", "unregisterComponentCallback", "validateExtensionInterface", "", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map componentCallbackMap;
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    private final SidecarAdapter sidecarAdapter;
    private final Map windowListenerRegisteredContexts;

    public SidecarCompat(SidecarInterface sidecarInterface, SidecarAdapter sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(INSTANCE.getSidecarCompat$window_release(context), new SidecarAdapter(null, 1, null));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
    }

    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(CollectionsKt.emptyList());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    public final void register(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration newConfig) {
                    Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        boolean z = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (!z || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks((ComponentCallbacks) this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: all -> 0x018a, TRY_LEAVE, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0058 A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x001e A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[Catch: all -> 0x018a, TryCatch #1 {all -> 0x018a, blocks: (B:2:0x0000, B:7:0x0022, B:9:0x002a, B:12:0x0032, B:15:0x003b, B:21:0x005c, B:23:0x0064, B:28:0x0083, B:30:0x0089, B:35:0x00a8, B:37:0x00ae, B:40:0x00b4, B:41:0x00e6, B:43:0x0102, B:47:0x0106, B:49:0x0131, B:53:0x013a, B:54:0x0141, B:55:0x0142, B:56:0x0149, B:58:0x00b7, B:60:0x00de, B:62:0x014a, B:63:0x0151, B:64:0x0152, B:65:0x0159, B:66:0x015a, B:67:0x0165, B:68:0x00a4, B:69:0x008f, B:72:0x0096, B:73:0x0166, B:74:0x0171, B:75:0x007f, B:76:0x006a, B:79:0x0071, B:80:0x0172, B:81:0x017d, B:82:0x0058, B:83:0x0043, B:86:0x004a, B:87:0x0038, B:88:0x002f, B:89:0x017e, B:90:0x0189, B:91:0x001e, B:92:0x0007, B:95:0x000e), top: B:1:0x0000, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean validateExtensionInterface() {
        Class<?> cls;
        Method method;
        Class<?> returnType;
        Class cls2;
        Class<?> cls3;
        Method method2;
        Class<?> returnType2;
        Class<?> cls4;
        Method method3;
        Class<?> returnType3;
        Class<?> cls5;
        Method method4;
        Class<?> returnType4;
        try {
            SidecarInterface sidecarInterface = this.sidecar;
            if (sidecarInterface != null && (cls = sidecarInterface.getClass()) != null) {
                method = cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                returnType = method != null ? null : method.getReturnType();
                cls2 = Void.TYPE;
                if (Intrinsics.areEqual(returnType, cls2)) {
                    throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'setSidecarCallback': ", returnType));
                }
                SidecarInterface sidecarInterface2 = this.sidecar;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.sidecar;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.sidecar;
                if (sidecarInterface4 != null && (cls3 = sidecarInterface4.getClass()) != null) {
                    method2 = cls3.getMethod("getWindowLayoutInfo", IBinder.class);
                    returnType2 = method2 != null ? null : method2.getReturnType();
                    if (Intrinsics.areEqual(returnType2, SidecarWindowLayoutInfo.class)) {
                        throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
                    }
                    SidecarInterface sidecarInterface5 = this.sidecar;
                    if (sidecarInterface5 != null && (cls4 = sidecarInterface5.getClass()) != null) {
                        method3 = cls4.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                        returnType3 = method3 != null ? null : method3.getReturnType();
                        if (Intrinsics.areEqual(returnType3, cls2)) {
                            throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
                        }
                        SidecarInterface sidecarInterface6 = this.sidecar;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                            returnType4 = method4 != null ? null : method4.getReturnType();
                            if (Intrinsics.areEqual(returnType4, cls2)) {
                                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType4));
                            }
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                if (invoke == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                }
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                                return true;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                if (invoke2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                }
                                if (Intrinsics.areEqual(arrayList, (List) invoke2)) {
                                    return true;
                                }
                                throw new Exception("Invalid display feature getter/setter");
                            }
                        }
                        method4 = null;
                        if (method4 != null) {
                        }
                        if (Intrinsics.areEqual(returnType4, cls2)) {
                        }
                    }
                    method3 = null;
                    if (method3 != null) {
                    }
                    if (Intrinsics.areEqual(returnType3, cls2)) {
                    }
                }
                method2 = null;
                if (method2 != null) {
                }
                if (Intrinsics.areEqual(returnType2, SidecarWindowLayoutInfo.class)) {
                }
            }
            method = null;
            if (method != null) {
            }
            cls2 = Void.TYPE;
            if (Intrinsics.areEqual(returnType, cls2)) {
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "sidecarCompat", "Landroidx/window/layout/SidecarCompat;", "activity", "Landroid/app/Activity;", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference activityWeakReference;
        private final SidecarCompat sidecarCompat;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        public FirstAttachAdapter(SidecarCompat sidecarCompat, Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¨\u0006\f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "(Landroidx/window/layout/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            Collection<Activity> values = this.this$0.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : values) {
                IBinder activityWindowToken$window_release = SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity != null) {
                SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
                SidecarInterface sidecar = this.this$0.getSidecar();
                SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
                if (deviceState == null) {
                    deviceState = new SidecarDeviceState();
                }
                WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, deviceState);
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
                if (extensionCallbackInterface == null) {
                    return;
                }
                extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
                return;
            }
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "callbackInterface", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "activityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "Landroid/app/Activity;", "Landroidx/window/layout/WindowLayoutInfo;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "onWindowLayoutChanged", "", "activity", "newLayout", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final WeakHashMap activityWindowLayoutInfo;
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock;

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (Intrinsics.areEqual(newLayout, (WindowLayoutInfo) this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "callbackInterface", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "lastDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mActivityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "Landroid/os/IBinder;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "onDeviceStateChanged", "", "newDeviceState", "onWindowLayoutChanged", "token", "newLayout", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        private final ReentrantLock lock;
        private final WeakHashMap mActivityWindowLayoutInfo;
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter, SidecarInterface.SidecarCallback callbackInterface) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo((SidecarWindowLayoutInfo) this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", "context", "Landroid/content/Context;", "getSidecarCompat$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.INSTANCE.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final SidecarInterface getSidecarCompat$window_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }
    }
}
