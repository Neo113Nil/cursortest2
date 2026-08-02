package com.squareup.cash.treehouse.android.platform;

import android.content.Context;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.compose.material.AnchoredDraggableState;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import app.cash.broadway.navigation.Navigator;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.redwood.treehouse.TreehouseAppContent;
import app.cash.redwood.treehouse.TreehouseLayout;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.time.zzc;
import com.google.android.libraries.places.internal.zzcha;
import com.google.android.play.core.appupdate.zzi;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.views.InlineAppMessageView$Factory$Impl;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.treehouse.accessibility.RealAccessibilityCallbackService;
import com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory;
import com.squareup.cash.treehouse.flows.BlockerScreenSpec;
import com.squareup.cash.treehouse.flows.RawFlowService;
import com.squareup.cash.treehouse.hostview.HostViewService;
import com.squareup.cash.treehouse.hostview.LifecycleState;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.CashInsetsListener;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.util.android.coroutines.ViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashTreehouseLayout extends FrameLayout implements CashInsetsListener {
    public static final /* synthetic */ int $r8$clinit = 0;
    public BindState bindState;
    public TreehouseAppContent content;
    public final o0 contentListener;
    public boolean contentLoading;
    public final CoroutineScope coroutineScope;
    public WindowInsetsCompat deferredWindowInsets;
    public final int height;
    public final TreehouseHostViewService hostViewService;
    public final InsetsCollector insetsCollector;
    public final LoadingScrim loadingScrim;
    public final OnBackPressedDispatcher onBackPressedDispatcher;
    public final RealTreehouseApp treehouseApp;
    public TreehouseLayout treehouseLayout;
    public boolean treehouseLoading;
    public final RealTreehouseNavigatorFactory treehouseNavigatorFactory;
    public zzcha unbindClosable;
    public Job updateTreehouseLoadingJob;
    public final Profile.Adapter widgetSystemFactory;
    public final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BindState {
        public static final /* synthetic */ BindState[] $VALUES;
        public static final BindState Bound;
        public static final BindState BoundWhenReady;
        public static final BindState NotBound;

        static {
            BindState bindState = new BindState("NotBound", 0);
            NotBound = bindState;
            BindState bindState2 = new BindState("Bound", 1);
            Bound = bindState2;
            BindState bindState3 = new BindState("BoundWhenReady", 2);
            BoundWhenReady = bindState3;
            $VALUES = new BindState[]{bindState, bindState2, bindState3};
        }

        public static BindState valueOf(String str) {
            return (BindState) Enum.valueOf(BindState.class, str);
        }

        public static BindState[] values() {
            return (BindState[]) $VALUES.clone();
        }
    }

    /* loaded from: classes.dex */
    public final class Factory {
        public final CoroutineScope coroutineScope;
        public final RealTreehouseNavigatorFactory treehouseNavigatorFactory;
        public final Profile.Adapter widgetSystemFactory;

        public Factory(Profile.Adapter adapter, RealTreehouseNavigatorFactory realTreehouseNavigatorFactory, CoroutineScope coroutineScope) {
            this.widgetSystemFactory = adapter;
            this.treehouseNavigatorFactory = realTreehouseNavigatorFactory;
            this.coroutineScope = coroutineScope;
        }

        public static CashTreehouseLayout create$default(Factory factory, Context context, RealTreehouseApp realTreehouseApp, OnBackPressedDispatcher onBackPressedDispatcher) {
            context.getClass();
            realTreehouseApp.getClass();
            onBackPressedDispatcher.getClass();
            return new CashTreehouseLayout(context, realTreehouseApp, onBackPressedDispatcher, factory.treehouseNavigatorFactory, factory.widgetSystemFactory, factory.coroutineScope);
        }
    }

    public final class TreehouseHostViewService implements HostViewService {
        public final StateFlowImpl state = FlowKt.MutableStateFlow(LifecycleState.CREATED);

        @Override // com.squareup.cash.treehouse.hostview.HostViewService
        public final StateFlow lifecycleStateFlow() {
            return this.state;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTreehouseLayout(Context context, RealTreehouseApp realTreehouseApp, OnBackPressedDispatcher onBackPressedDispatcher, RealTreehouseNavigatorFactory realTreehouseNavigatorFactory, Profile.Adapter adapter, CoroutineScope coroutineScope) {
        super(context);
        context.getClass();
        realTreehouseApp.getClass();
        onBackPressedDispatcher.getClass();
        this.treehouseApp = realTreehouseApp;
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        this.treehouseNavigatorFactory = realTreehouseNavigatorFactory;
        this.widgetSystemFactory = adapter;
        this.coroutineScope = coroutineScope;
        this.width = -1;
        this.height = -1;
        this.bindState = BindState.NotBound;
        LoadingScrim loadingScrim = new LoadingScrim(context);
        loadingScrim.setLoading(true);
        this.loadingScrim = loadingScrim;
        this.treehouseLoading = true;
        this.contentListener = new o0(this, 1);
        this.hostViewService = new TreehouseHostViewService();
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        InsetsCollector attachedTo = WindowCompat$Api35Impl.attachedTo(this);
        this.insetsCollector = attachedTo;
        addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(this, 6));
        attachedTo.setInsetsDispatcher(new CashTreehouseLayout$$ExternalSyntheticLambda3(this));
        addView(loadingScrim, 0);
    }

    public static /* synthetic */ void setContent$default(CashTreehouseLayout cashTreehouseLayout, String str, Navigator navigator, ByteString byteString, int i, Object obj) {
        if ((i & 4) != 0) {
            byteString = null;
        }
        cashTreehouseLayout.setContent(str, navigator, byteString);
    }

    public static void setLoading$default(CashTreehouseLayout cashTreehouseLayout, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? cashTreehouseLayout.treehouseLoading : false;
        if ((i & 2) != 0) {
            z = cashTreehouseLayout.contentLoading;
        }
        cashTreehouseLayout.treehouseLoading = z2;
        cashTreehouseLayout.contentLoading = z;
        CoroutineScope coroutineScope = cashTreehouseLayout.coroutineScope;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher, null, new ChatInputView$Content$1$1$1(cashTreehouseLayout, null, 27), 2);
    }

    public static void updateState$default(CashTreehouseLayout cashTreehouseLayout, BindState bindState, TreehouseAppContent treehouseAppContent, int i) {
        int ordinal;
        if ((i & 1) != 0) {
            bindState = cashTreehouseLayout.bindState;
        }
        if ((i & 2) != 0) {
            treehouseAppContent = cashTreehouseLayout.content;
        }
        BindState bindState2 = cashTreehouseLayout.bindState;
        if (bindState2 == bindState && cashTreehouseLayout.content == treehouseAppContent) {
            return;
        }
        Continuation continuation = null;
        int i2 = 1;
        if (bindState2 != BindState.NotBound && cashTreehouseLayout.content != null) {
            int ordinal2 = bindState2.ordinal();
            if (ordinal2 == 0) {
                a$$ExternalSyntheticBUOutline0.m$1("unexpected state");
                return;
            }
            if (ordinal2 == 1) {
                TreehouseAppContent treehouseAppContent2 = cashTreehouseLayout.content;
                treehouseAppContent2.getClass();
                treehouseAppContent2.unbind();
            } else {
                if (ordinal2 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                zzcha zzchaVar = cashTreehouseLayout.unbindClosable;
                zzchaVar.getClass();
                zzchaVar.close();
                cashTreehouseLayout.unbindClosable = null;
            }
        }
        if (treehouseAppContent != null && (ordinal = bindState.ordinal()) != 0) {
            if (ordinal == 1) {
                TreehouseLayout treehouseLayout = cashTreehouseLayout.treehouseLayout;
                treehouseLayout.getClass();
                treehouseAppContent.bind(treehouseLayout);
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                TreehouseLayout treehouseLayout2 = cashTreehouseLayout.treehouseLayout;
                treehouseLayout2.getClass();
                CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 = new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(18, treehouseLayout2, treehouseAppContent);
                treehouseLayout2.setReadyForContentChangeListener(captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0);
                captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0.onReadyForContentChanged(treehouseLayout2);
                cashTreehouseLayout.unbindClosable = new zzcha(treehouseAppContent, treehouseLayout2, i2);
            }
        }
        if (cashTreehouseLayout.content != treehouseAppContent) {
            Job job = cashTreehouseLayout.updateTreehouseLoadingJob;
            if (job != null) {
                job.cancel(null);
            }
            cashTreehouseLayout.updateTreehouseLoadingJob = null;
            if (treehouseAppContent != null) {
                TreehouseLayout treehouseLayout3 = cashTreehouseLayout.treehouseLayout;
                treehouseLayout3.getClass();
                cashTreehouseLayout.updateTreehouseLoadingJob = ViewKt.whileEachAttached(treehouseLayout3, EmptyCoroutineContext.INSTANCE, new TaxWebAppBridge.AnonymousClass3(treehouseAppContent, cashTreehouseLayout, continuation, 19));
            }
        }
        cashTreehouseLayout.bindState = bindState;
        cashTreehouseLayout.content = treehouseAppContent;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(this.width, this.height);
    }

    @Override // com.squareup.cash.ui.CashInsetsListener
    public final void onApplyCashInsets(CashInsets cashInsets) {
        this.insetsCollector.onApplyCashInsets(cashInsets);
    }

    public final void setBlockerScreenContent(BlockerScreenSpec blockerScreenSpec, Navigator navigator, RawFlowService rawFlowService) {
        blockerScreenSpec.getClass();
        navigator.getClass();
        rawFlowService.getClass();
        setContent(navigator, new OpenSourceKt$$ExternalSyntheticLambda9(blockerScreenSpec, this, navigator, rawFlowService, 10));
    }

    public final void setContent(Navigator navigator, Function1 function1) {
        if (this.treehouseLayout == null) {
            Context context = getContext();
            context.getClass();
            Context context2 = getContext();
            context2.getClass();
            Profile.Adapter adapter = this.widgetSystemFactory;
            adapter.getClass();
            navigator.getClass();
            o0 o0Var = this.contentListener;
            o0Var.getClass();
            RealCashVibrator realCashVibrator = (RealCashVibrator) adapter.nearby_visibilityAdapter;
            RealSharedReactionState realSharedReactionState = (RealSharedReactionState) adapter.rate_planAdapter;
            RealImageLoader realImageLoader = (RealImageLoader) adapter.deposit_preferenceAdapter;
            AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) ((Lazy) adapter.available_p2p_target_regionsAdapter).getValue();
            Instrument$Adapter instrument$Adapter = (Instrument$Adapter) adapter.country_codeAdapter;
            InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl = (InlineAppMessagePresenterHelper$Factory$Impl) adapter.incoming_request_policyAdapter;
            InlineAppMessageView$Factory$Impl inlineAppMessageView$Factory$Impl = (InlineAppMessageView$Factory$Impl) adapter.regionAdapter;
            boolean z = false;
            SVG svg = new SVG(new AnchoredDraggableState(context2, navigator, o0Var, realCashVibrator, realSharedReactionState, realImageLoader, androidBiometricsStore, instrument$Adapter, inlineAppMessagePresenterHelper$Factory$Impl, (Flow) adapter.bitcoin_display_unitsAdapter, inlineAppMessageView$Factory$Impl, new BadgeQueries$$ExternalSyntheticLambda5(adapter, 3), (RealAccessibilityCallbackService) adapter.addressAdapter, (LifecycleOwner) adapter.deposit_preference_dataAdapter), new zzc(context2, false), new zzi(context2, 2), z, 4);
            Context context3 = getContext();
            context3.getClass();
            TreehouseLayout treehouseLayout = new TreehouseLayout(context, svg, this.onBackPressedDispatcher, new ActionBarPolicy(context3));
            addView(treehouseLayout, 0);
            WindowInsetsCompat windowInsetsCompat = this.deferredWindowInsets;
            if (windowInsetsCompat != null) {
                this.deferredWindowInsets = null;
                ViewCompat.onApplyWindowInsets(treehouseLayout, windowInsetsCompat);
            }
            this.treehouseLayout = treehouseLayout;
        }
        CashTreehouseLayout$$ExternalSyntheticLambda3 cashTreehouseLayout$$ExternalSyntheticLambda3 = new CashTreehouseLayout$$ExternalSyntheticLambda3(function1);
        RealTreehouseApp realTreehouseApp = this.treehouseApp;
        realTreehouseApp.getClass();
        realTreehouseApp.start();
        updateState$default(this, null, new TreehouseAppContent(realTreehouseApp.codeHost, realTreehouseApp.dispatchers, cashTreehouseLayout$$ExternalSyntheticLambda3, realTreehouseApp.leakDetector), 1);
    }

    public final void setContent(String str, Navigator navigator, ByteString byteString) {
        str.getClass();
        navigator.getClass();
        setTag(str);
        setContent(navigator, new OpenSourceKt$$ExternalSyntheticLambda9(this, navigator, str, byteString));
    }
}
