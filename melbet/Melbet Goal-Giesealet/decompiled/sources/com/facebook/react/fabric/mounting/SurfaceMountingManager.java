package com.facebook.react.fabric.mounting;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.SparseArrayCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.systrace.Systrace;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: SurfaceMountingManager.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u0091\u00012\u00020\u0001:\u0006\u008f\u0001\u0090\u0001\u0091\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\rH\u0007J\u000e\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0003J\u0015\u00107\u001a\u0002022\u0006\u00108\u001a\u00020#H\u0001¢\u0006\u0002\b9J\b\u0010:\u001a\u000202H\u0003J\b\u0010;\u001a\u000202H\u0007J \u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0007J \u0010?\u001a\u0002022\u0006\u00106\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0007JA\u0010@\u001a\u0002022\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u0013H\u0001¢\u0006\u0002\bJJ<\u0010K\u001a\u0002022\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020\u0013H\u0003J\u0016\u0010L\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020DJ\u0016\u0010M\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020DJ\u0016\u0010N\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020DJ \u0010N\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\u0006\u0010O\u001a\u00020\u0013H\u0003J\"\u0010P\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010A\u001a\u0002002\b\u0010Q\u001a\u0004\u0018\u00010RH\u0007J\"\u0010S\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010VH\u0007J \u0010S\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010T\u001a\u0002002\b\u0010U\u001a\u0004\u0018\u00010VJ\u0016\u0010W\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u0003JH\u0010Y\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020\u0003H\u0007J0\u0010`\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u0003H\u0007J0\u0010e\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010f\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0003H\u0007J\u001a\u0010j\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\b\u0010E\u001a\u0004\u0018\u00010FH\u0007J\u001d\u0010k\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010l\u001a\u00020HH\u0001¢\u0006\u0002\bmJ \u0010n\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0006\u0010o\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u0013H\u0007J\u0010\u0010q\u001a\u0002022\u0006\u0010r\u001a\u00020\u001cH\u0003J\u0010\u0010s\u001a\u0002022\u0006\u0010B\u001a\u00020\u0003H\u0007J2\u0010t\u001a\u0002022\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010I\u001a\u00020\u0013H\u0007J\u0017\u0010u\u001a\u0004\u0018\u00010H2\u0006\u0010B\u001a\u00020\u0003H\u0001¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020%2\u0006\u0010B\u001a\u00020\u0003H\u0007J\u0010\u0010x\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u0003H\u0002J\u0012\u0010y\u001a\u0004\u0018\u00010\u001c2\u0006\u0010B\u001a\u00020\u0003H\u0002J\u0012\u0010z\u001a\u0004\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u0003H\u0002J\u0018\u0010{\u001a\u0002022\u0006\u00106\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u001cH\u0002J\u0010\u0010}\u001a\u0002022\u0006\u00106\u001a\u00020\u0003H\u0002J\u0010\u0010~\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0003H\u0002J\u001f\u0010\u007f\u001a\u0002022\u0014\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u0002020\u0081\u0001H\u0082\bJ\u001b\u0010\u0082\u0001\u001a\u0002022\u0006\u00106\u001a\u00020\u00032\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0007J\u0007\u0010\u0085\u0001\u001a\u000202J7\u0010\u0086\u0001\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0007\u0010\u0087\u0001\u001a\u0002002\u0007\u0010\u0088\u0001\u001a\u00020\u00132\t\u0010Q\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0003H\u0007JA\u0010\u0086\u0001\u001a\u0002022\u0006\u0010B\u001a\u00020\u00032\u0007\u0010\u0087\u0001\u001a\u0002002\u0007\u0010\u0088\u0001\u001a\u00020\u00132\t\u0010Q\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00032\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0007J\u000f\u0010\u008d\u0001\u001a\u0002022\u0006\u0010B\u001a\u00020\u0003J\u000f\u0010\u008e\u0001\u001a\u0002022\u0006\u0010B\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0002\b\u0003\u0018\u00010$X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b&\u0010'R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010/0-8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0092\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "", "surfaceId", "", "jsResponderHandler", "Lcom/facebook/react/touch/JSResponderHandler;", "viewManagerRegistry", "Lcom/facebook/react/uimanager/ViewManagerRegistry;", "rootViewManager", "Lcom/facebook/react/uimanager/RootViewManager;", "mountItemExecutor", "Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(ILcom/facebook/react/touch/JSResponderHandler;Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/uimanager/RootViewManager;Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getSurfaceId", "()I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isStopped", "()Z", "isRootViewAttached", "context", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "tagToViewState", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;", "optimizedTagToViewState", "Landroidx/collection/MutableIntObjectMap;", "registryLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "onViewAttachMountItems", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "getRootViewManager$annotations", "()V", "erroneouslyReaddedReactTags", "", "viewsWithActiveTouches", "viewsToDeleteAfterTouchFinishes", "tagSetForStoppedSurface", "Landroidx/collection/SparseArrayCompat;", "tagToSynchronousMountProps", "", "", "attachRootView", "", "rootView", "themedReactContext", "getViewExists", "tag", "scheduleMountItemOnViewAttach", "item", "scheduleMountItemOnViewAttach$ReactAndroid_release", "executeMountItemsOnViewAttach", "stopSurface", "addViewAt", "parentTag", "index", "removeViewAt", "createView", "componentName", "reactTag", "props", "Lcom/facebook/react/bridge/ReadableMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "eventEmitterWrapper", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "isLayoutable", "createView$ReactAndroid_release", "createViewUnsafe", "storeSynchronousMountPropsOverride", "updatePropsSynchronously", "updateProps", "shouldSkipSynchronousMountPropsOverride", "experimental_prefetchResources", "params", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "receiveCommand", "commandId", "commandArgs", "Lcom/facebook/react/bridge/ReadableArray;", "sendAccessibilityEvent", "eventType", "updateLayout", "x", "y", ViewProps.WIDTH, ViewProps.HEIGHT, "displayType", ViewProps.LAYOUT_DIRECTION, "updatePadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateOverflowInset", "overflowInsetLeft", "overflowInsetTop", "overflowInsetRight", "overflowInsetBottom", "updateState", "updateEventEmitter", "eventEmitter", "updateEventEmitter$ReactAndroid_release", "setJSResponder", "initialReactTag", "blockNativeResponder", "onViewStateDeleted", "viewState", "deleteView", "preallocateView", "getEventEmitter", "getEventEmitter$ReactAndroid_release", "getView", "getViewState", "getNullableViewState", "registryGet", "registryPut", "state", "registryRemove", "registryContains", "registryForEachValue", "action", "Lkotlin/Function1;", "applyViewSnapshot", "bitmap", "Landroid/graphics/Bitmap;", "printSurfaceState", "enqueuePendingEvent", "eventName", "canCoalesceEvent", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "eventTimestamp", "", "markActiveTouchForTag", "sweepActiveTouchForTag", "ViewState", "PendingViewEvent", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceMountingManager {
    private static final Companion Companion = new Companion(null);
    private static final String PROP_OPACITY = "opacity";
    private static final String PROP_TRANSFORM = "transform";
    private static final boolean SHOW_CHANGED_VIEW_HIERARCHIES;
    private static final String TAG;
    private ThemedReactContext context;
    private final Set<Integer> erroneouslyReaddedReactTags;
    private volatile boolean isRootViewAttached;
    private volatile boolean isStopped;
    private JSResponderHandler jsResponderHandler;
    private MountingManager.MountItemExecutor mountItemExecutor;
    private final Queue<MountItem> onViewAttachMountItems;
    private final MutableIntObjectMap<ViewState> optimizedTagToViewState;
    private final ReentrantReadWriteLock registryLock;
    private ViewManager<View, ?> rootViewManager;
    private final int surfaceId;
    private SparseArrayCompat<Object> tagSetForStoppedSurface;
    private final SparseArrayCompat<Map<String, Object>> tagToSynchronousMountProps;
    private final ConcurrentHashMap<Integer, ViewState> tagToViewState;
    private final ViewManagerRegistry viewManagerRegistry;
    private final Set<Integer> viewsToDeleteAfterTouchFinishes;
    private final Set<Integer> viewsWithActiveTouches;

    private static /* synthetic */ void getRootViewManager$annotations() {
    }

    public SurfaceMountingManager(int i, JSResponderHandler jsResponderHandler, ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager, MountingManager.MountItemExecutor mountItemExecutor, ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(jsResponderHandler, "jsResponderHandler");
        Intrinsics.checkNotNullParameter(viewManagerRegistry, "viewManagerRegistry");
        Intrinsics.checkNotNullParameter(rootViewManager, "rootViewManager");
        Intrinsics.checkNotNullParameter(mountItemExecutor, "mountItemExecutor");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.surfaceId = i;
        this.context = reactContext;
        this.registryLock = new ReentrantReadWriteLock();
        int i2 = 1;
        int i3 = 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (ReactNativeFeatureFlags.useOptimizedViewRegistryOnAndroid()) {
            this.tagToViewState = null;
            this.optimizedTagToViewState = new MutableIntObjectMap<>(i3, i2, defaultConstructorMarker);
        } else {
            this.tagToViewState = new ConcurrentHashMap<>();
            this.optimizedTagToViewState = null;
        }
        this.onViewAttachMountItems = new ArrayDeque();
        this.jsResponderHandler = jsResponderHandler;
        this.viewManagerRegistry = viewManagerRegistry;
        this.rootViewManager = rootViewManager;
        this.mountItemExecutor = mountItemExecutor;
        this.erroneouslyReaddedReactTags = new HashSet();
        this.viewsWithActiveTouches = new HashSet();
        this.viewsToDeleteAfterTouchFinishes = new HashSet();
        this.tagToSynchronousMountProps = new SparseArrayCompat<>(0, 1, null);
    }

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    /* renamed from: isStopped, reason: from getter */
    public final boolean getIsStopped() {
        return this.isStopped;
    }

    /* renamed from: isRootViewAttached, reason: from getter */
    public final boolean getIsRootViewAttached() {
        return this.isRootViewAttached;
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    public final void attachRootView(final View rootView, ThemedReactContext themedReactContext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(themedReactContext, "themedReactContext");
        this.context = themedReactContext;
        if (this.isStopped) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach root view to a stopped surface"));
            return;
        }
        registryPut(this.surfaceId, new ViewState(this.surfaceId, rootView, this.rootViewManager, true));
        final ThemedReactContext themedReactContext2 = this.context;
        if (themedReactContext2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        GuardedRunnable guardedRunnable = new GuardedRunnable(rootView, themedReactContext2) { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$attachRootView$runnable$1
            final /* synthetic */ View $rootView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(themedReactContext2);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                if (SurfaceMountingManager.this.getIsStopped()) {
                    return;
                }
                if (this.$rootView.getId() == SurfaceMountingManager.this.getSurfaceId()) {
                    ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + SurfaceMountingManager.this.getSurfaceId() + "] on the RootView, but that id has already been set. "));
                } else if (this.$rootView.getId() != -1) {
                    FLog.e(SurfaceMountingManager.TAG, "Trying to add RootTag to RootView that already has a tag: existing tag: [" + this.$rootView.getId() + "] new tag: [" + SurfaceMountingManager.this.getSurfaceId() + "]");
                    ReactSoftExceptionLogger.logSoftException(SurfaceMountingManager.TAG, new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
                }
                this.$rootView.setId(SurfaceMountingManager.this.getSurfaceId());
                KeyEvent.Callback callback = this.$rootView;
                if (callback instanceof ReactRoot) {
                    ((ReactRoot) callback).setRootViewTag(SurfaceMountingManager.this.getSurfaceId());
                }
                SurfaceMountingManager.this.executeMountItemsOnViewAttach();
                SurfaceMountingManager.this.isRootViewAttached = true;
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            guardedRunnable.run();
        } else {
            UiThreadUtil.runOnUiThread(guardedRunnable);
        }
    }

    public final boolean getViewExists(int tag) {
        SparseArrayCompat<Object> sparseArrayCompat = this.tagSetForStoppedSurface;
        if (sparseArrayCompat == null || !sparseArrayCompat.containsKey(tag)) {
            return registryContains(tag);
        }
        return true;
    }

    public final void scheduleMountItemOnViewAttach$ReactAndroid_release(MountItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.onViewAttachMountItems.add(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeMountItemsOnViewAttach() {
        MountingManager.MountItemExecutor mountItemExecutor = this.mountItemExecutor;
        if (mountItemExecutor == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        mountItemExecutor.executeItems(this.onViewAttachMountItems);
    }

    public final void stopSurface() {
        FLog.e(TAG, "Stopping surface [" + this.surfaceId + "]");
        if (this.isStopped) {
            return;
        }
        this.isStopped = true;
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock.ReadLock readLock = this.registryLock.readLock();
            readLock.lock();
            try {
                MutableIntObjectMap<ViewState> mutableIntObjectMap = this.optimizedTagToViewState;
                Object[] objArr = mutableIntObjectMap.values;
                long[] jArr = mutableIntObjectMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ViewState viewState = (ViewState) objArr[(i << 3) + i3];
                                    StateWrapper stateWrapper = viewState.getStateWrapper();
                                    if (stateWrapper != null) {
                                        stateWrapper.destroyState();
                                    }
                                    viewState.setStateWrapper(null);
                                    EventEmitterWrapper eventEmitter = viewState.getEventEmitter();
                                    if (eventEmitter != null) {
                                        eventEmitter.destroy();
                                    }
                                    viewState.setEventEmitter(null);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                readLock.unlock();
            }
        } else {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            Collection<ViewState> values = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (ViewState viewState2 : values) {
                StateWrapper stateWrapper2 = viewState2.getStateWrapper();
                if (stateWrapper2 != null) {
                    stateWrapper2.destroyState();
                }
                viewState2.setStateWrapper(null);
                EventEmitterWrapper eventEmitter2 = viewState2.getEventEmitter();
                if (eventEmitter2 != null) {
                    eventEmitter2.destroy();
                }
                viewState2.setEventEmitter(null);
            }
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceMountingManager.stopSurface$lambda$5(SurfaceMountingManager.this);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopSurface$lambda$5(SurfaceMountingManager surfaceMountingManager) {
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        ViewManagerRegistry viewManagerRegistry;
        if (ReactNativeFeatureFlags.enableViewRecycling() && (viewManagerRegistry = surfaceMountingManager.viewManagerRegistry) != null) {
            viewManagerRegistry.onSurfaceStopped(surfaceMountingManager.surfaceId);
        }
        if (surfaceMountingManager.optimizedTagToViewState != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = surfaceMountingManager.registryLock;
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                SparseArrayCompat<Object> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                surfaceMountingManager.tagSetForStoppedSurface = sparseArrayCompat;
                ArrayList arrayList = new ArrayList(surfaceMountingManager.optimizedTagToViewState.get_size());
                MutableIntObjectMap<ViewState> mutableIntObjectMap = surfaceMountingManager.optimizedTagToViewState;
                int[] iArr = mutableIntObjectMap.keys;
                Object[] objArr = mutableIntObjectMap.values;
                long[] jArr = mutableIntObjectMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        readLock = readLock2;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    try {
                                        int i8 = iArr[i7];
                                        i = i4;
                                        ViewState viewState = (ViewState) objArr[i7];
                                        SurfaceMountingManagerKt.set(sparseArrayCompat, i8, surfaceMountingManager);
                                        arrayList.add(viewState);
                                    } catch (Throwable th) {
                                        th = th;
                                        for (int i9 = 0; i9 < readHoldCount; i9++) {
                                            readLock.lock();
                                        }
                                        writeLock.unlock();
                                        throw th;
                                    }
                                } else {
                                    i = i4;
                                }
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                            if (i5 != i4) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        readLock2 = readLock;
                    }
                } else {
                    readLock = readLock2;
                }
                surfaceMountingManager.optimizedTagToViewState.clear();
                Unit unit = Unit.INSTANCE;
                for (int i10 = 0; i10 < readHoldCount; i10++) {
                    readLock.lock();
                }
                writeLock.unlock();
                Iterator it = arrayList.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    surfaceMountingManager.onViewStateDeleted((ViewState) next);
                }
            } catch (Throwable th2) {
                th = th2;
                readLock = readLock2;
            }
        } else {
            SparseArrayCompat<Object> sparseArrayCompat2 = new SparseArrayCompat<>(0, 1, null);
            surfaceMountingManager.tagSetForStoppedSurface = sparseArrayCompat2;
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = surfaceMountingManager.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            for (Map.Entry<Integer, ViewState> entry : concurrentHashMap.entrySet()) {
                int intValue = entry.getKey().intValue();
                ViewState value = entry.getValue();
                SurfaceMountingManagerKt.set(sparseArrayCompat2, intValue, surfaceMountingManager);
                surfaceMountingManager.onViewStateDeleted(value);
            }
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap2 = surfaceMountingManager.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap2);
            concurrentHashMap2.clear();
        }
        surfaceMountingManager.jsResponderHandler = null;
        surfaceMountingManager.rootViewManager = null;
        surfaceMountingManager.mountItemExecutor = null;
        surfaceMountingManager.context = null;
        surfaceMountingManager.onViewAttachMountItems.clear();
        surfaceMountingManager.tagToSynchronousMountProps.clear();
        FLog.e(TAG, "Surface [" + surfaceMountingManager.surfaceId + "] was stopped on SurfaceMountingManager.");
    }

    public final void addViewAt(final int parentTag, final int tag, final int index) {
        String str;
        boolean z;
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(parentTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag: [" + parentTag + "] for addViewAt"));
            return;
        }
        if (!(nullableViewState.getView() instanceof ViewGroup)) {
            String str2 = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + parentTag + " - Tag: " + tag + " - Index: " + index;
            FLog.e(TAG, str2);
            throw new IllegalStateException(str2);
        }
        View view = nullableViewState.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        final ViewGroup viewGroup = (ViewGroup) view;
        ViewState nullableViewState2 = getNullableViewState(tag);
        if (nullableViewState2 == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag: [" + tag + "] for addViewAt"));
            return;
        }
        View view2 = nullableViewState2.getView();
        if (view2 == null) {
            throw new IllegalStateException(("Unable to find view for viewState " + nullableViewState2 + " and tag " + tag).toString());
        }
        boolean z2 = SHOW_CHANGED_VIEW_HIERARCHIES;
        if (z2) {
            FLog.e(TAG, "addViewAt: [" + tag + "] -> [" + parentTag + "] idx: " + index + " BEFORE");
            Companion.logViewHierarchy(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent == null) {
            str = "] at index ";
            z = z2;
        } else {
            boolean z3 = parent instanceof ViewGroup;
            z = z2;
            str = "] at index ";
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("addViewAt: cannot insert view [" + tag + "] into parent [" + parentTag + "]: View already has a parent: [" + (z3 ? ((ViewGroup) parent).getId() : -1) + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z3) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.erroneouslyReaddedReactTags.add(Integer.valueOf(tag));
        }
        try {
            Companion.getViewGroupManager(nullableViewState).addView(viewGroup, view2, index);
            if (z) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceMountingManager.addViewAt$lambda$7(tag, parentTag, index, viewGroup);
                    }
                });
            }
        } catch (IllegalStateException e) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + tag + "] into parent [" + parentTag + str + index, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + tag + "] into parent [" + parentTag + str + index, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addViewAt$lambda$7(int i, int i2, int i3, ViewGroup viewGroup) {
        FLog.e(TAG, "addViewAt: [" + i + "] -> [" + i2 + "] idx: " + i3 + " AFTER");
        Companion.logViewHierarchy(viewGroup, false);
    }

    public final void removeViewAt(final int tag, final int parentTag, int index) {
        if (this.isStopped) {
            return;
        }
        if (this.erroneouslyReaddedReactTags.contains(Integer.valueOf(tag))) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + tag + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        ViewState nullableViewState = getNullableViewState(parentTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new IllegalStateException("Unable to find viewState for tag: [" + parentTag + "] for removeViewAt"));
            return;
        }
        final View view = nullableViewState.getView();
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + parentTag + " - Tag: " + tag + " - Index: " + index;
            FLog.e(TAG, str);
            throw new IllegalStateException(str);
        }
        int i = 0;
        if (SHOW_CHANGED_VIEW_HIERARCHIES) {
            FLog.e(TAG, "removeViewAt: [" + tag + "] -> [" + parentTag + "] idx: " + index + " BEFORE");
            Companion.logViewHierarchy((ViewGroup) view, false);
        }
        IViewGroupManager viewGroupManager = Companion.getViewGroupManager(nullableViewState);
        View childAt = viewGroupManager.getChildAt(view, index);
        int id = childAt != null ? childAt.getId() : -1;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = index;
        if (id != tag) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                } else if (viewGroup.getChildAt(i).getId() == tag) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                FLog.e(TAG, "removeViewAt: [" + tag + "] -> [" + parentTag + "] @" + index + ": view already removed from parent! Children in parent: " + childCount);
                return;
            } else {
                Companion.logViewHierarchy(viewGroup, true);
                ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Tried to remove view [" + tag + "] of parent [" + parentTag + "] at index " + index + ", but got view tag " + id + " - actual index of view: " + i));
                intRef.element = i;
            }
        }
        try {
            viewGroupManager.removeViewAt(view, intRef.element);
            if (SHOW_CHANGED_VIEW_HIERARCHIES) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceMountingManager.removeViewAt$lambda$8(tag, parentTag, intRef, view);
                    }
                });
            }
        } catch (RuntimeException e) {
            int childCount2 = viewGroupManager.getChildCount(view);
            ViewGroup viewGroup2 = (ViewGroup) view;
            Companion.logViewHierarchy(viewGroup2, true);
            throw new IllegalStateException("Cannot remove child at index " + intRef.element + " from parent ViewGroup [" + viewGroup2.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeViewAt$lambda$8(int i, int i2, Ref.IntRef intRef, View view) {
        FLog.e(TAG, "removeViewAt: [" + i + "] -> [" + i2 + "] idx: " + intRef.element + " AFTER");
        Companion.logViewHierarchy((ViewGroup) view, false);
    }

    public final void createView$ReactAndroid_release(String componentName, int reactTag, ReadableMap props, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean isLayoutable) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(props, "props");
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if ((nullableViewState != null ? nullableViewState.getView() : null) != null) {
            return;
        }
        createViewUnsafe(componentName, reactTag, props, stateWrapper, eventEmitterWrapper, isLayoutable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createViewUnsafe(String componentName, int reactTag, ReadableMap props, StateWrapper stateWrapper, EventEmitterWrapper eventEmitterWrapper, boolean isLayoutable) {
        Systrace.beginSection(0L, "SurfaceMountingManager::createViewUnsafe(" + componentName + ")");
        try {
            ReactStylesDiffMap reactStylesDiffMap = new ReactStylesDiffMap(props);
            ViewState viewState = new ViewState(reactTag, null, null, false, 14, null);
            viewState.setCurrentProps(reactStylesDiffMap);
            viewState.setStateWrapper(stateWrapper);
            viewState.setEventEmitter(eventEmitterWrapper);
            registryPut(reactTag, viewState);
            if (isLayoutable) {
                ViewManagerRegistry viewManagerRegistry = this.viewManagerRegistry;
                ViewManager viewManager = viewManagerRegistry != null ? viewManagerRegistry.get(componentName) : null;
                Intrinsics.checkNotNull(viewManager, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<android.view.View, *>");
                ThemedReactContext themedReactContext = this.context;
                if (themedReactContext != null) {
                    viewState.setView(viewManager.createView(reactTag, themedReactContext, reactStylesDiffMap, stateWrapper, this.jsResponderHandler));
                    viewState.setViewManager(viewManager);
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } finally {
            Systrace.endSection(0L);
        }
    }

    public final void storeSynchronousMountPropsOverride(int reactTag, ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (ReactNativeFeatureFlags.overrideBySynchronousMountPropsAtMountingAndroid()) {
            Map<String, Object> mapFromPropsReadableMap = Companion.getMapFromPropsReadableMap(props);
            Map<String, Object> map = this.tagToSynchronousMountProps.get(reactTag);
            if (map != null) {
                map.putAll(mapFromPropsReadableMap);
                mapFromPropsReadableMap = map;
            }
            SurfaceMountingManagerKt.set(this.tagToSynchronousMountProps, reactTag, mapFromPropsReadableMap);
        }
    }

    public final void updatePropsSynchronously(int reactTag, ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        updateProps(reactTag, props, true);
    }

    public final void updateProps(int reactTag, ReadableMap props) {
        Intrinsics.checkNotNullParameter(props, "props");
        updateProps(reactTag, props, false);
    }

    private final void updateProps(int reactTag, ReadableMap props, boolean shouldSkipSynchronousMountPropsOverride) {
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag " + reactTag + " for updateProps"));
            return;
        }
        if (ReactNativeFeatureFlags.overrideBySynchronousMountPropsAtMountingAndroid() && !shouldSkipSynchronousMountPropsOverride && this.tagToSynchronousMountProps.containsKey(reactTag)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.merge(props);
            Map<String, Object> map = this.tagToSynchronousMountProps.get(reactTag);
            if (map == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Companion.overridePropsReadableMap(map, writableNativeMap);
            nullableViewState.setCurrentProps(new ReactStylesDiffMap(writableNativeMap));
        } else {
            nullableViewState.setCurrentProps(new ReactStylesDiffMap(props));
        }
        View view = nullableViewState.getView();
        if (view == null) {
            return;
        }
        ViewManager<View, ?> viewManager = nullableViewState.getViewManager();
        if (viewManager == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        viewManager.updateProperties(view, nullableViewState.getCurrentProps());
    }

    @UnstableReactNativeAPI
    public final void experimental_prefetchResources(int surfaceId, String componentName, MapBuffer params) {
        ViewManagerRegistry viewManagerRegistry;
        ViewManager<?, ?> viewManager;
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        if (this.isStopped || (viewManagerRegistry = this.viewManagerRegistry) == null || (viewManager = viewManagerRegistry.get(componentName)) == null) {
            return;
        }
        ThemedReactContext themedReactContext = this.context;
        if (themedReactContext == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        viewManager.experimental_prefetchResources(surfaceId, themedReactContext, params);
    }

    @Deprecated(message = "")
    public final void receiveCommand(int reactTag, int commandId, ReadableArray commandArgs) {
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag " + reactTag + " for commandId " + commandId);
        }
        ViewManager<View, ?> viewManager = nullableViewState.getViewManager();
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + reactTag);
        }
        View view = nullableViewState.getView();
        if (view == null) {
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + reactTag);
        }
        viewManager.receiveCommand((ViewManager<View, ?>) view, commandId, commandArgs);
    }

    public final void receiveCommand(int reactTag, String commandId, ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag " + reactTag + " for commandId " + commandId);
        }
        ViewManager<View, ?> viewManager = nullableViewState.getViewManager();
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + reactTag);
        }
        View view = nullableViewState.getView();
        if (view == null) {
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + reactTag);
        }
        viewManager.receiveCommand((ViewManager<View, ?>) view, commandId, commandArgs);
    }

    public final void sendAccessibilityEvent(int reactTag, int eventType) {
        if (this.isStopped) {
            return;
        }
        View view = getViewState(reactTag).getView();
        if (view == null) {
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + reactTag);
        }
        view.sendAccessibilityEvent(eventType);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateLayout(int reactTag, int parentTag, int x, int y, int width, int height, int displayType, int layoutDirection) {
        View view;
        IViewGroupManager iViewGroupManager;
        int i;
        if (this.isStopped) {
            return;
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag " + reactTag + " for updateLayout"));
            return;
        }
        if (nullableViewState.getIsRoot() || (view = nullableViewState.getView()) == null) {
            return;
        }
        int i2 = 1;
        if (layoutDirection == 1) {
            i2 = 0;
        } else if (layoutDirection != 2) {
            i2 = 2;
        }
        view.setLayoutDirection(i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof RootView) {
            parent.requestLayout();
        }
        ViewState nullableViewState2 = getNullableViewState(parentTag);
        if (nullableViewState2 == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag " + parentTag + " for updateLayout"));
        } else if (nullableViewState2.getViewManager() != null) {
            NativeModule viewManager = nullableViewState2.getViewManager();
            Intrinsics.checkNotNull(viewManager, "null cannot be cast to non-null type com.facebook.react.uimanager.IViewGroupManager<*>");
            iViewGroupManager = (IViewGroupManager) viewManager;
            if (iViewGroupManager != null || !iViewGroupManager.needsCustomLayoutForChildren()) {
                view.layout(x, y, width + x, height + y);
            }
            i = displayType == 0 ? 4 : 0;
            if (view.getVisibility() == i) {
                view.setVisibility(i);
                return;
            }
            return;
        }
        iViewGroupManager = null;
        if (iViewGroupManager != null) {
        }
        view.layout(x, y, width + x, height + y);
        if (displayType == 0) {
        }
        if (view.getVisibility() == i) {
        }
    }

    public final void updatePadding(int reactTag, int left, int top, int right, int bottom) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewState viewState = getViewState(reactTag);
        if (viewState.getIsRoot()) {
            return;
        }
        View view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException(("Unable to find View for tag: " + reactTag).toString());
        }
        ViewManager<View, ?> viewManager = viewState.getViewManager();
        if (viewManager == null) {
            throw new IllegalStateException(("Unable to find ViewManager for view: " + viewState).toString());
        }
        viewManager.setPadding(view, left, top, right, bottom);
    }

    public final void updateOverflowInset(int reactTag, int overflowInsetLeft, int overflowInsetTop, int overflowInsetRight, int overflowInsetBottom) {
        if (this.isStopped) {
            return;
        }
        ViewState viewState = getViewState(reactTag);
        if (viewState.getIsRoot()) {
            return;
        }
        KeyEvent.Callback view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException(("Unable to find View for tag: " + reactTag).toString());
        }
        if (view instanceof ReactOverflowViewWithInset) {
            ((ReactOverflowViewWithInset) view).setOverflowInset(overflowInsetLeft, overflowInsetTop, overflowInsetRight, overflowInsetBottom);
        }
    }

    public final void updateState(int reactTag, StateWrapper stateWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        ViewState viewState = getViewState(reactTag);
        StateWrapper stateWrapper2 = viewState.getStateWrapper();
        viewState.setStateWrapper(stateWrapper);
        ViewManager<View, ?> viewManager = viewState.getViewManager();
        if (viewManager == null) {
            throw new IllegalStateException(("Unable to find ViewManager for tag: " + reactTag).toString());
        }
        View view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Object updateState = viewManager.updateState(view, viewState.getCurrentProps(), stateWrapper);
        if (updateState != null) {
            viewManager.updateExtraData(view, updateState);
        }
        if (stateWrapper2 != null) {
            stateWrapper2.destroyState();
        }
    }

    public final void updateEventEmitter$ReactAndroid_release(int reactTag, EventEmitterWrapper eventEmitter) {
        ViewState viewState;
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.registryLock;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                MutableIntObjectMap<ViewState> mutableIntObjectMap = this.optimizedTagToViewState;
                ViewState viewState2 = mutableIntObjectMap.get(reactTag);
                if (viewState2 == null) {
                    viewState2 = new ViewState(reactTag, null, null, false, 14, null);
                    mutableIntObjectMap.set(reactTag, viewState2);
                }
                viewState = viewState2;
            } finally {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } else {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            viewState = concurrentHashMap.get(Integer.valueOf(reactTag));
            if (viewState == null) {
                viewState = new ViewState(reactTag, null, null, false, 14, null);
                Integer valueOf = Integer.valueOf(reactTag);
                ConcurrentHashMap<Integer, ViewState> concurrentHashMap2 = this.tagToViewState;
                Intrinsics.checkNotNull(concurrentHashMap2);
                concurrentHashMap2.put(valueOf, viewState);
            }
        }
        EventEmitterWrapper eventEmitter2 = viewState.getEventEmitter();
        viewState.setEventEmitter(eventEmitter);
        if (!Intrinsics.areEqual(eventEmitter2, eventEmitter) && eventEmitter2 != null) {
            eventEmitter2.destroy();
        }
        Queue<PendingViewEvent> pendingEventQueue = viewState.getPendingEventQueue();
        if (pendingEventQueue != null) {
            Iterator<PendingViewEvent> it = pendingEventQueue.iterator();
            while (it.hasNext()) {
                it.next().dispatch(eventEmitter);
            }
            viewState.setPendingEventQueue(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void setJSResponder(int reactTag, int initialReactTag, boolean blockNativeResponder) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        JSResponderHandler jSResponderHandler = this.jsResponderHandler;
        if (jSResponderHandler == null) {
            return;
        }
        if (!blockNativeResponder) {
            jSResponderHandler.setJSResponder(initialReactTag, null);
            return;
        }
        ViewState viewState = getViewState(reactTag);
        View view = viewState.getView();
        if (initialReactTag != reactTag && (view instanceof ViewParent)) {
            jSResponderHandler.setJSResponder(initialReactTag, (ViewParent) view);
        } else {
            if (view == 0) {
                SoftAssertions.assertUnreachable("Cannot find view for tag [" + reactTag + "].");
                return;
            }
            if (viewState.getIsRoot()) {
                SoftAssertions.assertUnreachable("Cannot block native responder on [" + reactTag + "] that is a root view");
            }
            jSResponderHandler.setJSResponder(initialReactTag, view.getParent());
        }
    }

    private final void onViewStateDeleted(ViewState viewState) {
        StateWrapper stateWrapper = viewState.getStateWrapper();
        if (stateWrapper != null) {
            stateWrapper.destroyState();
        }
        viewState.setStateWrapper(null);
        EventEmitterWrapper eventEmitter = viewState.getEventEmitter();
        if (eventEmitter != null) {
            eventEmitter.destroy();
        }
        viewState.setEventEmitter(null);
        ViewManager<View, ?> viewManager = viewState.getViewManager();
        if (viewState.getIsRoot() || viewManager == null) {
            return;
        }
        View view = viewState.getView();
        if (view == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        viewManager.onDropViewInstance(view);
    }

    public final void deleteView(int reactTag) {
        UiThreadUtil.assertOnUiThread();
        if (this.isStopped) {
            return;
        }
        if (ReactNativeFeatureFlags.overrideBySynchronousMountPropsAtMountingAndroid() && this.tagToSynchronousMountProps.containsKey(reactTag)) {
            this.tagToSynchronousMountProps.remove(reactTag);
        }
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag " + reactTag + " for deleteView"));
        } else if (this.viewsWithActiveTouches.contains(Integer.valueOf(reactTag))) {
            this.viewsToDeleteAfterTouchFinishes.add(Integer.valueOf(reactTag));
        } else {
            registryRemove(reactTag);
            onViewStateDeleted(nullableViewState);
        }
    }

    public final void preallocateView(String componentName, int reactTag, ReadableMap props, StateWrapper stateWrapper, boolean isLayoutable) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(props, "props");
        UiThreadUtil.assertOnUiThread();
        if (!this.isStopped && getNullableViewState(reactTag) == null) {
            createViewUnsafe(componentName, reactTag, props, stateWrapper, null, isLayoutable);
        }
    }

    public final EventEmitterWrapper getEventEmitter$ReactAndroid_release(int reactTag) {
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState != null) {
            return nullableViewState.getEventEmitter();
        }
        return null;
    }

    public final View getView(int reactTag) {
        View view;
        ViewState nullableViewState = getNullableViewState(reactTag);
        if (nullableViewState != null && (view = nullableViewState.getView()) != null) {
            return view;
        }
        throw new IllegalViewOperationException("Unable to find view for tag " + reactTag + ". Surface " + this.surfaceId + " stopped: " + this.isStopped + ", rootViewAttached: " + this.isRootViewAttached);
    }

    private final ViewState getViewState(int reactTag) {
        ViewState registryGet = registryGet(reactTag);
        if (registryGet != null) {
            return registryGet;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + reactTag + ". Surface stopped: " + this.isStopped);
    }

    private final ViewState getNullableViewState(int reactTag) {
        return registryGet(reactTag);
    }

    private final ViewState registryGet(int tag) {
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock.ReadLock readLock = this.registryLock.readLock();
            readLock.lock();
            try {
                return this.optimizedTagToViewState.get(tag);
            } finally {
                readLock.unlock();
            }
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
        Intrinsics.checkNotNull(concurrentHashMap);
        return concurrentHashMap.get(Integer.valueOf(tag));
    }

    private final void registryPut(int tag, ViewState state) {
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.registryLock;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.optimizedTagToViewState.set(tag, state);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
        Integer valueOf = Integer.valueOf(tag);
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
        Intrinsics.checkNotNull(concurrentHashMap);
        concurrentHashMap.put(valueOf, state);
    }

    private final void registryRemove(int tag) {
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.registryLock;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.optimizedTagToViewState.remove(tag);
                return;
            } finally {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
        Intrinsics.checkNotNull(concurrentHashMap);
        concurrentHashMap.remove(Integer.valueOf(tag));
    }

    private final boolean registryContains(int tag) {
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock.ReadLock readLock = this.registryLock.readLock();
            readLock.lock();
            try {
                return this.optimizedTagToViewState.containsKey(tag);
            } finally {
                readLock.unlock();
            }
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
        Intrinsics.checkNotNull(concurrentHashMap);
        return concurrentHashMap.containsKey(Integer.valueOf(tag));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void registryForEachValue(Function1<? super ViewState, Unit> action) {
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock.ReadLock readLock = this.registryLock.readLock();
            readLock.lock();
            try {
                MutableIntObjectMap<ViewState> mutableIntObjectMap = this.optimizedTagToViewState;
                Object[] objArr = mutableIntObjectMap.values;
                long[] jArr = mutableIntObjectMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    action.invoke(objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                readLock.unlock();
            }
        }
        ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
        Intrinsics.checkNotNull(concurrentHashMap);
        Collection<ViewState> values = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public final void applyViewSnapshot(int tag, Bitmap bitmap) {
        View view;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ViewState nullableViewState = getNullableViewState(tag);
        if (nullableViewState == null || (view = nullableViewState.getView()) == null) {
            return;
        }
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        view.setBackground(new BitmapDrawable(resources, bitmap));
    }

    public final void printSurfaceState() {
        ReentrantReadWriteLock.ReadLock readLock;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int i;
        Object[] objArr2;
        int i2;
        long j;
        Integer num;
        FLog.e(TAG, "Views created for surface " + this.surfaceId + ":");
        if (this.optimizedTagToViewState != null) {
            ReentrantReadWriteLock.ReadLock readLock2 = this.registryLock.readLock();
            readLock2.lock();
            try {
                MutableIntObjectMap<ViewState> mutableIntObjectMap = this.optimizedTagToViewState;
                Object[] objArr3 = mutableIntObjectMap.values;
                long[] jArr3 = mutableIntObjectMap.metadata;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr3[i3];
                        readLock = readLock2;
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j2 & 255) < 128) {
                                    try {
                                        ViewState viewState = (ViewState) objArr3[(i3 << 3) + i6];
                                        ViewManager<View, ?> viewManager = viewState.getViewManager();
                                        String name = viewManager != null ? viewManager.getName() : null;
                                        View view = viewState.getView();
                                        View view2 = view != null ? (View) view.getParent() : null;
                                        if (view2 != null) {
                                            Integer valueOf = Integer.valueOf(view2.getId());
                                            i = i4;
                                            num = valueOf;
                                        } else {
                                            i = i4;
                                            num = null;
                                        }
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i2 = i6;
                                        j = j2;
                                        FLog.e(TAG, "<" + name + " id=" + viewState.getReactTag() + " parentTag=" + num + " isRoot=" + viewState.getIsRoot() + " />");
                                    } catch (Throwable th) {
                                        th = th;
                                        readLock.unlock();
                                        throw th;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = i4;
                                    objArr2 = objArr3;
                                    i2 = i6;
                                    j = j2;
                                }
                                j2 = j >> i;
                                i6 = i2 + 1;
                                i4 = i;
                                jArr3 = jArr2;
                                objArr3 = objArr2;
                            }
                            jArr = jArr3;
                            objArr = objArr3;
                            if (i5 != i4) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                            objArr = objArr3;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        readLock2 = readLock;
                        jArr3 = jArr;
                        objArr3 = objArr;
                    }
                } else {
                    readLock = readLock2;
                }
                Unit unit = Unit.INSTANCE;
                readLock.unlock();
            } catch (Throwable th2) {
                th = th2;
                readLock = readLock2;
            }
        } else {
            ConcurrentHashMap<Integer, ViewState> concurrentHashMap = this.tagToViewState;
            Intrinsics.checkNotNull(concurrentHashMap);
            Collection<ViewState> values = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (ViewState viewState2 : values) {
                ViewManager<View, ?> viewManager2 = viewState2.getViewManager();
                String name2 = viewManager2 != null ? viewManager2.getName() : null;
                View view3 = viewState2.getView();
                View view4 = view3 != null ? (View) view3.getParent() : null;
                FLog.e(TAG, "<" + name2 + " id=" + viewState2.getReactTag() + " parentTag=" + (view4 != null ? Integer.valueOf(view4.getId()) : null) + " isRoot=" + viewState2.getIsRoot() + " />");
            }
        }
    }

    public final void enqueuePendingEvent(int reactTag, String eventName, boolean canCoalesceEvent, WritableMap params, int eventCategory) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        enqueuePendingEvent(reactTag, eventName, canCoalesceEvent, params, eventCategory, SystemClock.uptimeMillis());
    }

    public final void enqueuePendingEvent(int reactTag, String eventName, boolean canCoalesceEvent, WritableMap params, int eventCategory, long eventTimestamp) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        final ViewState registryGet = registryGet(reactTag);
        if (registryGet == null) {
            return;
        }
        final PendingViewEvent pendingViewEvent = new PendingViewEvent(eventName, params, eventCategory, canCoalesceEvent, eventTimestamp);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.fabric.mounting.SurfaceMountingManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceMountingManager.enqueuePendingEvent$lambda$23(SurfaceMountingManager.ViewState.this, pendingViewEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueuePendingEvent$lambda$23(ViewState viewState, PendingViewEvent pendingViewEvent) {
        EventEmitterWrapper eventEmitter = viewState.getEventEmitter();
        if (eventEmitter != null) {
            pendingViewEvent.dispatch(eventEmitter);
            return;
        }
        LinkedList pendingEventQueue = viewState.getPendingEventQueue();
        if (pendingEventQueue == null) {
            pendingEventQueue = new LinkedList();
            viewState.setPendingEventQueue(pendingEventQueue);
        }
        pendingEventQueue.add(pendingViewEvent);
    }

    public final void markActiveTouchForTag(int reactTag) {
        this.viewsWithActiveTouches.add(Integer.valueOf(reactTag));
    }

    public final void sweepActiveTouchForTag(int reactTag) {
        this.viewsWithActiveTouches.remove(Integer.valueOf(reactTag));
        if (this.viewsToDeleteAfterTouchFinishes.contains(Integer.valueOf(reactTag))) {
            this.viewsToDeleteAfterTouchFinishes.remove(Integer.valueOf(reactTag));
            deleteView(reactTag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SurfaceMountingManager.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u00100\u001a\u000201H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;", "", "reactTag", "", "view", "Landroid/view/View;", "viewManager", "Lcom/facebook/react/uimanager/ViewManager;", "isRoot", "", "<init>", "(ILandroid/view/View;Lcom/facebook/react/uimanager/ViewManager;Z)V", "getReactTag", "()I", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "getViewManager", "()Lcom/facebook/react/uimanager/ViewManager;", "setViewManager", "(Lcom/facebook/react/uimanager/ViewManager;)V", "()Z", "currentProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getCurrentProps", "()Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "setCurrentProps", "(Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "eventEmitter", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "getEventEmitter", "()Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "setEventEmitter", "(Lcom/facebook/react/fabric/events/EventEmitterWrapper;)V", "pendingEventQueue", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$PendingViewEvent;", "getPendingEventQueue", "()Ljava/util/Queue;", "setPendingEventQueue", "(Ljava/util/Queue;)V", "toString", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ViewState {
        private ReactStylesDiffMap currentProps;
        private EventEmitterWrapper eventEmitter;
        private final boolean isRoot;
        private Queue<PendingViewEvent> pendingEventQueue;
        private final int reactTag;
        private StateWrapper stateWrapper;
        private View view;
        private ViewManager<View, ?> viewManager;

        public ViewState(int i, View view, ViewManager<View, ?> viewManager, boolean z) {
            this.reactTag = i;
            this.view = view;
            this.viewManager = viewManager;
            this.isRoot = z;
        }

        public /* synthetic */ ViewState(int i, View view, ViewManager viewManager, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : view, (i2 & 4) != 0 ? null : viewManager, (i2 & 8) != 0 ? false : z);
        }

        public final int getReactTag() {
            return this.reactTag;
        }

        public final View getView() {
            return this.view;
        }

        public final void setView(View view) {
            this.view = view;
        }

        public final ViewManager<View, ?> getViewManager() {
            return this.viewManager;
        }

        public final void setViewManager(ViewManager<View, ?> viewManager) {
            this.viewManager = viewManager;
        }

        /* renamed from: isRoot, reason: from getter */
        public final boolean getIsRoot() {
            return this.isRoot;
        }

        public final ReactStylesDiffMap getCurrentProps() {
            return this.currentProps;
        }

        public final void setCurrentProps(ReactStylesDiffMap reactStylesDiffMap) {
            this.currentProps = reactStylesDiffMap;
        }

        public final StateWrapper getStateWrapper() {
            return this.stateWrapper;
        }

        public final void setStateWrapper(StateWrapper stateWrapper) {
            this.stateWrapper = stateWrapper;
        }

        public final EventEmitterWrapper getEventEmitter() {
            return this.eventEmitter;
        }

        public final void setEventEmitter(EventEmitterWrapper eventEmitterWrapper) {
            this.eventEmitter = eventEmitterWrapper;
        }

        public final Queue<PendingViewEvent> getPendingEventQueue() {
            return this.pendingEventQueue;
        }

        public final void setPendingEventQueue(Queue<PendingViewEvent> queue) {
            this.pendingEventQueue = queue;
        }

        public String toString() {
            ViewManager<View, ?> viewManager = this.viewManager;
            boolean z = viewManager == null;
            return "ViewState [" + this.reactTag + "] - isRoot: " + this.isRoot + " - props: " + this.currentProps + " - viewManager: " + viewManager + " - isLayoutOnly: " + z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SurfaceMountingManager.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$PendingViewEvent;", "", "eventName", "", "params", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "", "canCoalesceEvent", "", "eventTimestamp", "", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;IZJ)V", "dispatch", "", "eventEmitter", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class PendingViewEvent {
        private final boolean canCoalesceEvent;
        private final int eventCategory;
        private final String eventName;
        private final long eventTimestamp;
        private final WritableMap params;

        public PendingViewEvent(String eventName, WritableMap writableMap, int i, boolean z, long j) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.eventName = eventName;
            this.params = writableMap;
            this.eventCategory = i;
            this.canCoalesceEvent = z;
            this.eventTimestamp = j;
        }

        public final void dispatch(EventEmitterWrapper eventEmitter) {
            Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
            if (this.canCoalesceEvent) {
                eventEmitter.dispatchUnique(this.eventName, this.params, this.eventTimestamp);
            } else {
                eventEmitter.dispatch(this.eventName, this.params, this.eventCategory, this.eventTimestamp);
            }
        }
    }

    /* compiled from: SurfaceMountingManager.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J$\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$Companion;", "", "<init>", "()V", "TAG", "", "SHOW_CHANGED_VIEW_HIERARCHIES", "", "PROP_TRANSFORM", "PROP_OPACITY", "logViewHierarchy", "", "parent", "Landroid/view/ViewGroup;", "recurse", "overridePropsReadableMap", "patchMap", "", "outputReadableMap", "Lcom/facebook/react/bridge/WritableMap;", "getMapFromPropsReadableMap", "", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "getViewGroupManager", "Lcom/facebook/react/uimanager/IViewGroupManager;", "Landroid/view/View;", "viewState", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager$ViewState;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logViewHierarchy(ViewGroup parent, boolean recurse) {
            int id = parent.getId();
            FLog.e(SurfaceMountingManager.TAG, "  <ViewGroup tag=" + id + " class=" + parent.getClass() + ">");
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                FLog.e(SurfaceMountingManager.TAG, "     <View idx=" + i + " tag=" + parent.getChildAt(i).getId() + " class=" + parent.getChildAt(i).getClass() + ">");
            }
            FLog.e(SurfaceMountingManager.TAG, "  </ViewGroup tag=" + id + ">");
            if (recurse) {
                FLog.e(SurfaceMountingManager.TAG, "Displaying Ancestors:");
                for (ViewParent parent2 = parent.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    FLog.e(SurfaceMountingManager.TAG, "<ViewParent tag=" + (viewGroup != null ? viewGroup.getId() : -1) + " class=" + parent2.getClass() + ">");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void overridePropsReadableMap(Map<String, ? extends Object> patchMap, WritableMap outputReadableMap) {
            for (Map.Entry<String, ? extends Object> entry : patchMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (outputReadableMap.hasKey(key)) {
                    if (Intrinsics.areEqual(key, "transform")) {
                        if (outputReadableMap.getType(key) == ReadableType.Array) {
                            boolean z = value instanceof List;
                        }
                        WritableNativeArray writableNativeArray = new WritableNativeArray();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        for (Object obj : (List) value) {
                            if (obj instanceof Map) {
                                WritableNativeMap writableNativeMap = new WritableNativeMap();
                                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                                    String str = (String) entry2.getKey();
                                    Object value2 = entry2.getValue();
                                    if (value2 instanceof String) {
                                        writableNativeMap.putString(str, (String) value2);
                                    } else if (value2 instanceof Number) {
                                        writableNativeMap.putDouble(str, ((Number) value2).doubleValue());
                                    }
                                }
                                writableNativeArray.pushMap(writableNativeMap);
                            }
                        }
                        outputReadableMap.putArray(key, writableNativeArray);
                    } else if (Intrinsics.areEqual(key, "opacity")) {
                        if (outputReadableMap.getType(key) == ReadableType.Number) {
                            boolean z2 = value instanceof Number;
                        }
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Number");
                        outputReadableMap.putDouble(key, ((Number) value).doubleValue());
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Object> getMapFromPropsReadableMap(ReadableMap readableMap) {
            ReadableArray array;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (readableMap.hasKey("transform") && readableMap.getType("transform") == ReadableType.Array && (array = readableMap.getArray("transform")) != null) {
                ArrayList arrayList = new ArrayList(array.size());
                int size = array.size();
                for (int i = 0; i < size; i++) {
                    ReadableMap map = array.getMap(i);
                    if (map != null) {
                        arrayList.add(map.toHashMap());
                    }
                }
                linkedHashMap.put("transform", arrayList);
            }
            if (readableMap.hasKey("opacity") && readableMap.getType("opacity") == ReadableType.Number) {
                linkedHashMap.put("opacity", Double.valueOf(readableMap.getDouble("opacity")));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IViewGroupManager<View> getViewGroupManager(ViewState viewState) {
            NativeModule viewManager = viewState.getViewManager();
            if (viewManager == null) {
                throw new IllegalStateException(("Unable to find ViewManager for view: " + viewState).toString());
            }
            Intrinsics.checkNotNull(viewManager, "null cannot be cast to non-null type com.facebook.react.uimanager.IViewGroupManager<android.view.View>");
            return (IViewGroupManager) viewManager;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("SurfaceMountingManager", "getSimpleName(...)");
        TAG = "SurfaceMountingManager";
        boolean z = ReactBuildConfig.DEBUG;
        SHOW_CHANGED_VIEW_HIERARCHIES = false;
    }
}
