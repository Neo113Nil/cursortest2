package curtains;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputConnection;
import androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.SimpleGraphicsLayerModifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.VNode;
import androidx.compose.ui.layout.InsetsListener;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.RectRulersImpl;
import androidx.compose.ui.layout.WindowInsetsRulers;
import androidx.compose.ui.layout.WindowInsetsRulersImpl;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.layout.WindowWindowInsetsAnimationValues;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry;
import androidx.compose.ui.platform.GlobalSnapshotManager;
import androidx.compose.ui.platform.GraphicsLayerOwnerLayer;
import androidx.compose.ui.platform.InputMethodSession;
import androidx.compose.ui.text.input.NullableInputConnectionWrapperApi25;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.viewinterop.BringIntoViewNode;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.FileStorageConnection;
import androidx.datastore.core.Final;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.GatedFrameClock;
import app.cash.molecule.PlatformKt;
import coil3.Extras;
import com.bugsnag.android.EventStore;
import com.bugsnag.android.ThreadState;
import com.bugsnag.android.UnknownConnectivity;
import com.squareup.wire.GrpcMethod;
import curtains.internal.NextDrawListener;
import curtains.internal.RootViewsSpy;
import curtains.internal.RootViewsSpy$delegatingViewList$1;
import java.io.File;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.internal.PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2;

/* loaded from: classes.dex */
public final class WindowsKt$onNextDraw$1 extends Lambda implements Function1 {
    public final /* synthetic */ Object $onNextDraw;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowsKt$onNextDraw$1(ThreadState threadState, Thread thread) {
        super(1);
        this.$r8$classId = 16;
        this.$onNextDraw = thread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Continuation continuation = null;
        boolean z = false;
        int i2 = 0;
        Object obj2 = this.$onNextDraw;
        switch (i) {
            case 0:
                View view = (View) obj;
                view.getClass();
                view.getViewTreeObserver().addOnDrawListener(new NextDrawListener(view, (PerfsActivityLifecycleCallbacks$$ExternalSyntheticLambda2) obj2));
                return Unit.INSTANCE;
            case 1:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) obj2;
                reusableGraphicsLayerScope.setScaleX(simpleGraphicsLayerModifier.scaleX);
                reusableGraphicsLayerScope.setScaleY(simpleGraphicsLayerModifier.scaleY);
                reusableGraphicsLayerScope.setAlpha(simpleGraphicsLayerModifier.alpha);
                reusableGraphicsLayerScope.setTranslationX(RecyclerView.DECELERATION_RATE);
                reusableGraphicsLayerScope.setTranslationY(RecyclerView.DECELERATION_RATE);
                reusableGraphicsLayerScope.setShadowElevation(simpleGraphicsLayerModifier.shadowElevation);
                reusableGraphicsLayerScope.setRotationX(RecyclerView.DECELERATION_RATE);
                reusableGraphicsLayerScope.setRotationY(RecyclerView.DECELERATION_RATE);
                reusableGraphicsLayerScope.setRotationZ(simpleGraphicsLayerModifier.rotationZ);
                reusableGraphicsLayerScope.setCameraDistance(simpleGraphicsLayerModifier.cameraDistance);
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(simpleGraphicsLayerModifier.transformOrigin);
                reusableGraphicsLayerScope.setShape(simpleGraphicsLayerModifier.shape);
                reusableGraphicsLayerScope.setClip(simpleGraphicsLayerModifier.clip);
                reusableGraphicsLayerScope.setRenderEffect(null);
                reusableGraphicsLayerScope.m708setAmbientShadowColor8_81llA(simpleGraphicsLayerModifier.ambientShadowColor);
                reusableGraphicsLayerScope.m710setSpotShadowColor8_81llA(simpleGraphicsLayerModifier.spotShadowColor);
                reusableGraphicsLayerScope.m709setCompositingStrategyaDBOjCE(simpleGraphicsLayerModifier.compositingStrategy);
                int i3 = simpleGraphicsLayerModifier.blendMode;
                if (reusableGraphicsLayerScope.blendMode != i3) {
                    reusableGraphicsLayerScope.mutatedFields |= PKIFailureInfo.signerNotTrusted;
                    reusableGraphicsLayerScope.blendMode = i3;
                }
                return Unit.INSTANCE;
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                GraphicsLayer graphicsLayer = (GraphicsLayer) obj2;
                AndroidPath androidPath = graphicsLayer.outlinePath;
                if (graphicsLayer.usePathForClip && graphicsLayer.clip && androidPath != null) {
                    GrpcMethod drawContext = drawScope.getDrawContext();
                    long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        ((Extras.Key) drawContext.path).m1434clipPathmtrdDE(androidPath, 1);
                        graphicsLayer.drawWithChildTracking(drawScope);
                    } finally {
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    }
                } else {
                    graphicsLayer.drawWithChildTracking(drawScope);
                }
                return Unit.INSTANCE;
            case 3:
                ((Painter) obj2).onDraw((DrawScope) obj);
                return Unit.INSTANCE;
            case 4:
                VNode vNode = (VNode) obj;
                GroupComponent groupComponent = (GroupComponent) obj2;
                groupComponent.markTintForVNode(vNode);
                Function1 function1 = groupComponent.invalidateListener;
                if (function1 != null) {
                    function1.invoke(vNode);
                }
                return Unit.INSTANCE;
            case 5:
                TraversableNode traversableNode = (TraversableNode) obj;
                if (((Modifier.Node) traversableNode).getNode().isAttached()) {
                    ((Ref$ObjectRef) obj2).element = traversableNode;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ((MutableVector) obj2).add((Modifier.Element) obj);
                return Boolean.TRUE;
            case 7:
                LookaheadCapablePlaceable.ResettableRulerScope resettableRulerScope = (LookaheadCapablePlaceable.ResettableRulerScope) obj;
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                if (androidComposeView.insetsListener.generation.getIntValue() > 0) {
                    MutableIntObjectMap mutableIntObjectMap = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
                    resettableRulerScope.coordinatesAccessed = true;
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = LookaheadCapablePlaceable.this;
                    LayoutCoordinates coordinates = lookaheadCapablePlaceable.getCoordinates();
                    if (IntOffset.m1047equalsimpl0(resettableRulerScope.positionOnScreen, 9223372034707292159L)) {
                        resettableRulerScope.positionOnScreen = PlatformKt.m1344roundk4lQ0M(coordinates.mo842localToScreenMKHz9U(0L));
                        resettableRulerScope.size = coordinates.mo838getSizeYbymL2g();
                    }
                    lookaheadCapablePlaceable.getLayoutNode().layoutDelegate.onCoordinatesUsed();
                    long mo838getSizeYbymL2g = coordinates.mo838getSizeYbymL2g();
                    InsetsListener insetsListener = androidComposeView.insetsListener;
                    MutableScatterMap mutableScatterMap = insetsListener.insetsValues;
                    int i4 = (int) (mo838getSizeYbymL2g >> 32);
                    int i5 = (int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax);
                    WindowInsetsRulers[] windowInsetsRulersArr = WindowInsetsRulers_androidKt.AnimatableInsetsRulers;
                    int length = windowInsetsRulersArr.length;
                    int i6 = 0;
                    while (i6 < length) {
                        WindowInsetsRulers windowInsetsRulers = windowInsetsRulersArr[i6];
                        Object obj3 = mutableScatterMap.get(windowInsetsRulers);
                        obj3.getClass();
                        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) obj3;
                        LookaheadCapablePlaceable.ResettableRulerScope resettableRulerScope2 = resettableRulerScope;
                        WindowInsetsRulers_androidKt.m862provideInsetsValuescytEWk0(resettableRulerScope2, ((WindowInsetsRulersImpl) windowInsetsRulers).current, windowWindowInsetsAnimationValues.current, i4, i5);
                        if (((Boolean) windowWindowInsetsAnimationValues.isAnimating$delegate.getValue()).booleanValue()) {
                            WindowInsetsRulers_androidKt.m862provideInsetsValuescytEWk0(resettableRulerScope2, windowWindowInsetsAnimationValues.source, windowWindowInsetsAnimationValues.sourceValueInsets, i4, i5);
                            WindowInsetsRulers_androidKt.m862provideInsetsValuescytEWk0(resettableRulerScope2, windowWindowInsetsAnimationValues.target, windowWindowInsetsAnimationValues.targetValueInsets, i4, i5);
                        }
                        WindowInsetsRulers_androidKt.m862provideInsetsValuescytEWk0(resettableRulerScope2, ((WindowInsetsRulersImpl) windowInsetsRulers).maximum, windowWindowInsetsAnimationValues.maximum, i4, i5);
                        i6++;
                        resettableRulerScope = resettableRulerScope2;
                    }
                    LookaheadCapablePlaceable.ResettableRulerScope resettableRulerScope3 = resettableRulerScope;
                    MutableObjectList mutableObjectList = insetsListener.displayCutouts;
                    if (mutableObjectList.isNotEmpty()) {
                        SnapshotStateList snapshotStateList = insetsListener.displayCutoutRulers;
                        Object[] objArr = mutableObjectList.content;
                        int i7 = mutableObjectList._size;
                        for (int i8 = 0; i8 < i7; i8++) {
                            MutableState mutableState = (MutableState) objArr[i8];
                            RectRulersImpl rectRulersImpl = (RectRulersImpl) snapshotStateList.get(i8);
                            Rect rect = (Rect) mutableState.getValue();
                            resettableRulerScope3.provides(rectRulersImpl.getLeft(), rect.left);
                            resettableRulerScope3.provides(rectRulersImpl.getTop(), rect.top);
                            resettableRulerScope3.provides(rectRulersImpl.getRight(), rect.right);
                            resettableRulerScope3.provides(rectRulersImpl.getBottom(), rect.bottom);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                return new ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2((DisposableSaveableStateRegistry) obj2, 5);
            case 9:
                if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                    ((BufferedChannel) obj2).mo1159trySendJP2dKIU(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 10:
                DrawScope drawScope2 = (DrawScope) obj;
                Canvas canvas = drawScope2.getDrawContext().getCanvas();
                Function2 function2 = ((GraphicsLayerOwnerLayer) obj2).drawBlock;
                if (function2 != null) {
                    function2.invoke(canvas, (GraphicsLayer) drawScope2.getDrawContext().requestAdapter);
                }
                return Unit.INSTANCE;
            case 11:
                NullableInputConnectionWrapperApi25 nullableInputConnectionWrapperApi25 = (NullableInputConnectionWrapperApi25) obj;
                InputConnection inputConnection = nullableInputConnectionWrapperApi25.delegate;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    nullableInputConnectionWrapperApi25.delegate = null;
                }
                InputMethodSession inputMethodSession = (InputMethodSession) obj2;
                MutableVector mutableVector = inputMethodSession.connections;
                Object[] objArr2 = mutableVector.content;
                int i9 = mutableVector.size;
                while (true) {
                    if (i2 >= i9) {
                        i2 = -1;
                    } else if (!Intrinsics.areEqual((WeakReference) objArr2[i2], nullableInputConnectionWrapperApi25)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    mutableVector.removeAt(i2);
                }
                if (mutableVector.size == 0) {
                    inputMethodSession.onAllConnectionsClosed.invoke();
                }
                return Unit.INSTANCE;
            case 12:
                ((LayoutNode) obj2).setDensity((Density) obj);
                return Unit.INSTANCE;
            case 13:
                androidx.compose.ui.geometry.Rect rect2 = (androidx.compose.ui.geometry.Rect) obj;
                BringIntoViewNode bringIntoViewNode = (BringIntoViewNode) obj2;
                if (bringIntoViewNode.isAttached()) {
                    JobKt.launch$default(bringIntoViewNode.getCoroutineScope(), null, null, new GatedFrameClock.AnonymousClass1(bringIntoViewNode, rect2, continuation, 11), 3);
                }
                return Unit.INSTANCE;
            case 14:
                Throwable th = (Throwable) obj;
                DataStoreImpl dataStoreImpl = (DataStoreImpl) obj2;
                Lazy lazy = dataStoreImpl.storageConnectionDelegate;
                if (th != null) {
                    dataStoreImpl.inMemoryCache.tryUpdate(new Final(th));
                }
                if (lazy.isInitialized()) {
                    ((FileStorageConnection) lazy.getValue()).close();
                }
                return Unit.INSTANCE;
            case 15:
                return Boolean.valueOf(UnknownConnectivity.fromFile((File) obj, ((EventStore) obj2).config).isLaunchCrashReport());
            case 16:
                return Integer.valueOf(Intrinsics.compare(ThreadState.getThreadId((Thread) obj), ThreadState.getThreadId((Thread) obj2)));
            default:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                RootViewsSpy$delegatingViewList$1 rootViewsSpy$delegatingViewList$1 = ((RootViewsSpy) obj2).delegatingViewList;
                rootViewsSpy$delegatingViewList$1.addAll(arrayList);
                return rootViewsSpy$delegatingViewList$1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WindowsKt$onNextDraw$1(Object obj, int i) {
        super(1);
        this.$r8$classId = i;
        this.$onNextDraw = obj;
    }
}
