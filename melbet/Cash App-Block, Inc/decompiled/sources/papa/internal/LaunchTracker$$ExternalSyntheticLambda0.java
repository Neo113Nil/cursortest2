package papa.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.AwaiterQueue$Awaiter;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.ui.compose.DialogEventDispatcher;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import coil3.ComponentRegistry;
import com.datadog.android.Datadog$getInstance$1$1;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import papa.Choreographers;

/* loaded from: classes3.dex */
public final /* synthetic */ class LaunchTracker$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ LaunchTracker$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        Object obj;
        int i2 = this.$r8$classId;
        int i3 = 0;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i2) {
            case 0:
                Choreographers choreographers = Choreographers.INSTANCE;
                LaunchTracker$onActivityResumed$1$1 launchTracker$onActivityResumed$1$1 = new LaunchTracker$onActivityResumed$1$1(i3, (LaunchTracker) obj4, (String) obj3, (LaunchedActivityStartingTransition) obj2);
                choreographers.getClass();
                Choreographers.postOnCurrentFrameRendered$papa_release(launchTracker$onActivityResumed$1$1);
                return Unit.INSTANCE;
            case 1:
                BringIntoViewResponderNode bringIntoViewResponderNode = (BringIntoViewResponderNode) obj4;
                Rect bringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(bringIntoViewResponderNode, (NodeCoordinator) obj3, (Datadog$getInstance$1$1) obj2);
                if (bringIntoView$localRect == null) {
                    return null;
                }
                ContentInViewNode contentInViewNode = bringIntoViewResponderNode.responder;
                if (IntSize.m1055equalsimpl0(contentInViewNode.viewportSize, -1L)) {
                    InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return bringIntoView$localRect.m637translatek4lQ0M(contentInViewNode.m198relocationOffsetfbGrOKE(bringIntoView$localRect, contentInViewNode.m195getViewportSizeOrZeroYbymL2g$foundation(), 0L) ^ (-9223372034707292160L));
            case 2:
                ((AwaiterQueue$Awaiter) obj4).cancel();
                AtomicInt atomicInt = (AtomicInt) ((ComponentRegistry.Builder) obj3).keyers;
                int i4 = ((Ref$IntRef) obj2).element;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i4 ? i - 1 : i));
                return Unit.INSTANCE;
            case 3:
                ((RealHapticVibrator) obj4).vibrate((Haptics.VibrationEffectFactory) obj3);
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 4:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj4;
                TextFieldState textFieldState = (TextFieldState) obj3;
                Function1 function1 = (Function1) obj2;
                boolean z = registerAliasViewModel.canSwitchMode;
                RegisterAliasViewModel.Mode mode = registerAliasViewModel.mode;
                if (z && mode == RegisterAliasViewModel.Mode.SMS) {
                    TextFieldStateKt.clearText(textFieldState);
                    function1.invoke(RegisterAliasViewEvent.SwitchToEmail.INSTANCE);
                } else if (z && mode == RegisterAliasViewModel.Mode.EMAIL) {
                    TextFieldStateKt.clearText(textFieldState);
                    function1.invoke(RegisterAliasViewEvent.SwitchToSms.INSTANCE);
                } else {
                    function1.invoke(RegisterAliasViewEvent.SecondaryButtonClicked.INSTANCE);
                }
                return Unit.INSTANCE;
            case 5:
                Set set = (Set) obj3;
                DialogEventDispatcher dialogEventDispatcher = (DialogEventDispatcher) obj2;
                ImmutableList immutableList = ((NavigationModel.Ready.FullScreenLocation) ((NavigationModel.Ready.Location) obj4)).overlayResults;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : immutableList) {
                    if (!set.contains(((NavigationModel.Ready.FullScreenLocation.OverlayResult) obj5).getStateKey())) {
                        arrayList.add(obj5);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    NavigationModel.Ready.FullScreenLocation.OverlayResult overlayResult = (NavigationModel.Ready.FullScreenLocation.OverlayResult) it.next();
                    if (overlayResult.getResult() == null) {
                        dialogEventDispatcher.dispatch(new DialogListenerEvent.OnDialogCanceled(overlayResult.getScreen()));
                    } else {
                        dialogEventDispatcher.dispatch(new DialogListenerEvent.OnDialogResult(overlayResult.getScreen(), overlayResult.getResult()));
                    }
                    set.add(overlayResult.getStateKey());
                }
                return Unit.INSTANCE;
            case 6:
                Set set2 = (Set) obj4;
                SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj3;
                PersistentOrderedSet persistentOrderedSet = (PersistentOrderedSet) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : set2) {
                    if (!persistentOrderedSet.hashMap.containsKey((String) obj6)) {
                        arrayList2.add(obj6);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    saveableStateHolder.removeState(it2.next());
                }
                set2.clear();
                set2.addAll(persistentOrderedSet);
                return Unit.INSTANCE;
            case 7:
                UnsignedKt unsignedKt = ((CertificatePinner) obj4).certificateChainCleaner;
                unsignedKt.getClass();
                return unsignedKt.clean(((Address) obj2).url.host, ((Handshake) obj3).peerCertificates());
            default:
                OnPreDrawListenerWrapper onPreDrawListenerWrapper = (OnPreDrawListenerWrapper) obj3;
                View rootView = ((Window) obj4).getDecorView().getRootView();
                WeakReference weakReference = new WeakReference(rootView);
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final ViewTreeObservers$$ExternalSyntheticLambda2 viewTreeObservers$$ExternalSyntheticLambda2 = new ViewTreeObservers$$ExternalSyntheticLambda2(ref$BooleanRef, weakReference, (Function0) obj2, onPreDrawListenerWrapper, ref$ObjectRef, 0);
                switch (onPreDrawListenerWrapper.$r8$classId) {
                    case 0:
                        obj = new ViewTreeObserver.OnPreDrawListener() { // from class: papa.internal.OnPreDrawListenerWrapper$$ExternalSyntheticLambda0
                            @Override // android.view.ViewTreeObserver.OnPreDrawListener
                            public final boolean onPreDraw() {
                                ViewTreeObservers$$ExternalSyntheticLambda2.this.invoke();
                                return true;
                            }
                        };
                        break;
                    default:
                        obj = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: papa.internal.OnGlobalLayoutListenerWrapper$$ExternalSyntheticLambda0
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                ViewTreeObservers$$ExternalSyntheticLambda2.this.invoke();
                            }
                        };
                        break;
                }
                ref$ObjectRef.element = obj;
                rootView.getClass();
                ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3 = new ViewTreeObservers$$ExternalSyntheticLambda3(i3, onPreDrawListenerWrapper, ref$ObjectRef);
                if (rootView.getViewTreeObserver().isAlive() && rootView.isAttachedToWindow()) {
                    ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                    viewTreeObserver.getClass();
                    viewTreeObservers$$ExternalSyntheticLambda3.invoke(viewTreeObserver);
                } else {
                    rootView.addOnAttachStateChangeListener(new ViewTreeObserversKt$onViewTreeObserverReady$1(viewTreeObservers$$ExternalSyntheticLambda3, rootView));
                }
                return Unit.INSTANCE;
        }
    }
}
