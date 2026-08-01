package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.swmansion.rnscreens.bottomsheet.DimmingViewManager;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.ScreenAnimationDelegate;
import com.swmansion.rnscreens.events.ScreenDismissedEvent;
import com.swmansion.rnscreens.events.ScreenEventEmitter;
import com.swmansion.rnscreens.ext.ViewExtKt;
import com.swmansion.rnscreens.transition.ExternalBoundaryValuesEvaluator;
import com.swmansion.rnscreens.utils.DeviceUtils;
import com.swmansion.rnscreens.utils.ViewBackgroundUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenStackFragment.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002^_B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\b\u0010*\u001a\u00020\u001bH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\rH\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\rH\u0016J\b\u00100\u001a\u00020\u001bH\u0016J\b\u00101\u001a\u00020\u001bH\u0016J\b\u00102\u001a\u00020\u001bH\u0002J\r\u00103\u001a\u00020\u001bH\u0000¢\u0006\u0002\b4J\r\u00105\u001a\u00020\u001bH\u0000¢\u0006\u0002\b6J\u0012\u00107\u001a\u00020\u001b2\b\u00108\u001a\u0004\u0018\u000109H\u0016J$\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u000109H\u0016J\"\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020DH\u0016J\"\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020DH\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040JH\u0002J\u0017\u0010K\u001a\u0004\u0018\u00010D2\u0006\u0010L\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010MJ\u0010\u0010N\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\u0004H\u0002J\b\u0010O\u001a\u00020\u001bH\u0016J\b\u0010P\u001a\u00020\u001bH\u0016J\u0010\u0010Q\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020SH\u0016J\u0018\u0010T\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020S2\u0006\u0010;\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020\rH\u0002J\u0010\u0010W\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020SH\u0002J\n\u0010X\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010Y\u001a\u00020\rH\u0016J\b\u0010Z\u001a\u00020\u001bH\u0016J\u0012\u0010[\u001a\u00020'2\b\b\u0002\u0010\\\u001a\u00020\rH\u0002J\b\u0010]\u001a\u00020)H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R7\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackFragment;", "Lcom/swmansion/rnscreens/ScreenFragment;", "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "screenView", "Lcom/swmansion/rnscreens/Screen;", "<init>", "(Lcom/swmansion/rnscreens/Screen;)V", "()V", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "isToolbarShadowHidden", "", "isToolbarTranslucent", "lastFocusedChild", "Landroid/view/View;", "searchView", "Lcom/swmansion/rnscreens/CustomSearchView;", "getSearchView", "()Lcom/swmansion/rnscreens/CustomSearchView;", "setSearchView", "(Lcom/swmansion/rnscreens/CustomSearchView;)V", "onSearchViewCreate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "setOnSearchViewCreate", "(Lkotlin/jvm/functions/Function1;)V", "coordinatorLayout", "Lcom/swmansion/rnscreens/ScreenStackFragment$ScreensCoordinatorLayout;", "screenStack", "Lcom/swmansion/rnscreens/ScreenStack;", "getScreenStack", "()Lcom/swmansion/rnscreens/ScreenStack;", "dimmingDelegate", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;", "sheetDelegate", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "removeToolbar", "setToolbar", "setToolbarShadowHidden", ViewProps.HIDDEN, "setToolbarTranslucent", "translucent", "onContainerUpdate", "onViewAnimationEnd", "notifyViewAppearTransitionEnd", "dismissSelf", "dismissSelf$react_native_screens_release", "onSheetCornerRadiusChange", "onSheetCornerRadiusChange$react_native_screens_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateAnimator", "Landroid/animation/Animator;", "createBottomSheetBehaviour", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "resolveBackgroundColor", "screen", "(Lcom/swmansion/rnscreens/Screen;)Ljava/lang/Integer;", "attachShapeToScreen", "onStart", "onStop", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onCreateOptionsMenu", "Landroid/view/MenuInflater;", "shouldShowSearchBar", "updateToolbarMenu", "findLastFocusedChild", "canNavigateBack", "dismissFromContainer", "requireDimmingDelegate", "forceCreation", "requireSheetDelegate", "ScreensCoordinatorLayout", "ScreensAnimation", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStackFragment extends ScreenFragment implements ScreenStackFragmentWrapper {
    private AppBarLayout appBarLayout;
    private ScreensCoordinatorLayout coordinatorLayout;
    private DimmingViewManager dimmingDelegate;
    private boolean isToolbarShadowHidden;
    private boolean isToolbarTranslucent;
    private View lastFocusedChild;
    private Function1<? super CustomSearchView, Unit> onSearchViewCreate;
    private CustomSearchView searchView;
    private SheetDelegate sheetDelegate;
    private Toolbar toolbar;

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public final CustomSearchView getSearchView() {
        return this.searchView;
    }

    public final void setSearchView(CustomSearchView customSearchView) {
        this.searchView = customSearchView;
    }

    public final Function1<CustomSearchView, Unit> getOnSearchViewCreate() {
        return this.onSearchViewCreate;
    }

    public final void setOnSearchViewCreate(Function1<? super CustomSearchView, Unit> function1) {
        this.onSearchViewCreate = function1;
    }

    private final ScreenStack getScreenStack() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        }
        return (ScreenStack) container;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStackFragment(Screen screenView) {
        super(screenView);
        Intrinsics.checkNotNullParameter(screenView, "screenView");
    }

    public ScreenStackFragment() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void removeToolbar() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbar(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(0);
        toolbar.setLayoutParams(layoutParams);
        this.toolbar = toolbar;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarShadowHidden(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(hidden ? 0.0f : PixelUtil.toPixelFromDIP(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void setToolbarTranslucent(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = getScreen().getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onContainerUpdate() {
        super.onContainerUpdate();
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.onUpdate();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, com.swmansion.rnscreens.ScreenFragmentWrapper
    public void onViewAnimationEnd() {
        super.onViewAnimationEnd();
        notifyViewAppearTransitionEnd();
        getScreen().endRemovalTransition();
    }

    private final void notifyViewAppearTransitionEnd() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ScreenStack) {
            ((ScreenStack) parent).onViewAppearTransitionEnd();
        }
    }

    public final void dismissSelf$react_native_screens_release() {
        if (isRemoving() && isDetached()) {
            return;
        }
        ThemedReactContext reactContext = getScreen().getReactContext();
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getScreen().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ScreenDismissedEvent(surfaceId, getScreen().getId()));
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        getScreen().onSheetCornerRadiusChange$react_native_screens_release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.coordinatorLayout = new ScreensCoordinatorLayout(requireContext, this);
        Screen screen = getScreen();
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        if (SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            scrollingViewBehavior = createBottomSheetBehaviour();
        } else {
            scrollingViewBehavior = this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior();
        }
        layoutParams.setBehavior(scrollingViewBehavior);
        screen.setLayoutParams(layoutParams);
        ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
        if (screensCoordinatorLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            screensCoordinatorLayout2 = null;
        }
        screensCoordinatorLayout2.addView(ViewExtKt.recycle(getScreen()));
        if (!SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            Context context = getContext();
            if (context != null) {
                appBarLayout = new AppBarLayout(context);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            ScreensCoordinatorLayout screensCoordinatorLayout3 = this.coordinatorLayout;
            if (screensCoordinatorLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout3 = null;
            }
            screensCoordinatorLayout3.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(ViewExtKt.recycle(toolbar));
            }
            setHasOptionsMenu(true);
        } else {
            getScreen().setClipToOutline(true);
            attachShapeToScreen(getScreen());
            getScreen().setElevation(getScreen().getSheetElevation());
            SheetDelegate requireSheetDelegate = requireSheetDelegate();
            BottomSheetBehavior<Screen> sheetBehavior = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            SheetDelegate.configureBottomSheetBehaviour$react_native_screens_release$default(requireSheetDelegate, sheetBehavior, null, 0, 6, null);
            DimmingViewManager requireDimmingDelegate = requireDimmingDelegate(true);
            Screen screen2 = getScreen();
            ScreensCoordinatorLayout screensCoordinatorLayout4 = this.coordinatorLayout;
            if (screensCoordinatorLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout4 = null;
            }
            requireDimmingDelegate.onViewHierarchyCreated(screen2, screensCoordinatorLayout4);
            Screen screen3 = getScreen();
            BottomSheetBehavior<Screen> sheetBehavior2 = getScreen().getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior2);
            requireDimmingDelegate.onBehaviourAttached(screen3, sheetBehavior2);
            ScreenContainer container2 = getScreen().getContainer();
            Intrinsics.checkNotNull(container2);
            ScreensCoordinatorLayout screensCoordinatorLayout5 = this.coordinatorLayout;
            if (screensCoordinatorLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout5 = null;
            }
            screensCoordinatorLayout5.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), BasicMeasure.EXACTLY));
            ScreensCoordinatorLayout screensCoordinatorLayout6 = this.coordinatorLayout;
            if (screensCoordinatorLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
                screensCoordinatorLayout6 = null;
            }
            screensCoordinatorLayout6.layout(0, 0, container2.getWidth(), container2.getHeight());
        }
        ScreensCoordinatorLayout screensCoordinatorLayout7 = this.coordinatorLayout;
        if (screensCoordinatorLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
        } else {
            screensCoordinatorLayout = screensCoordinatorLayout7;
        }
        return screensCoordinatorLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        ScreenAnimationDelegate.AnimationType animationType;
        ScreensCoordinatorLayout screensCoordinatorLayout = null;
        if (!SheetUtilsKt.usesFormSheetPresentation(getScreen())) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        final DimmingViewManager requireDimmingDelegate$default = requireDimmingDelegate$default(this, false, 1, null);
        if (enter) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, requireDimmingDelegate$default.getMaxAlpha());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$10$lambda$9(DimmingViewManager.this, valueAnimator);
                }
            });
            ValueAnimator ofObject = ValueAnimator.ofObject(new ExternalBoundaryValuesEvaluator(new Function1() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float onCreateAnimator$lambda$11;
                    onCreateAnimator$lambda$11 = ScreenStackFragment.onCreateAnimator$lambda$11(ScreenStackFragment.this, (Number) obj);
                    return Float.valueOf(onCreateAnimator$lambda$11);
                }
            }, new Function1() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Float onCreateAnimator$lambda$12;
                    onCreateAnimator$lambda$12 = ScreenStackFragment.onCreateAnimator$lambda$12((Number) obj);
                    return onCreateAnimator$lambda$12;
                }
            }), Float.valueOf(getScreen().getHeight()), Float.valueOf(0.0f));
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$15$lambda$14(ScreenStackFragment.this, valueAnimator);
                }
            });
            AnimatorSet.Builder play = requireDimmingDelegate$default.willDimForDetentIndex(getScreen(), getScreen().getSheetInitialDetentIndex()) ? animatorSet.play(ofObject) : null;
            if (play != null) {
                play.with(ofFloat);
            }
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(requireDimmingDelegate$default.getDimmingView().getAlpha(), 0.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$19$lambda$18(DimmingViewManager.this, valueAnimator);
                }
            });
            ScreensCoordinatorLayout screensCoordinatorLayout2 = this.coordinatorLayout;
            if (screensCoordinatorLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coordinatorLayout");
            } else {
                screensCoordinatorLayout = screensCoordinatorLayout2;
            }
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, screensCoordinatorLayout.getBottom() - getScreen().getTop());
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$$ExternalSyntheticLambda5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ScreenStackFragment.onCreateAnimator$lambda$22$lambda$21(ScreenStackFragment.this, valueAnimator);
                }
            });
            animatorSet.play(ofFloat2).with(ofFloat3);
        }
        ScreenStackFragment screenStackFragment = this;
        ScreenEventEmitter screenEventEmitter = new ScreenEventEmitter(getScreen());
        if (enter) {
            animationType = ScreenAnimationDelegate.AnimationType.ENTER;
        } else {
            animationType = ScreenAnimationDelegate.AnimationType.EXIT;
        }
        animatorSet.addListener(new ScreenAnimationDelegate(screenStackFragment, screenEventEmitter, animationType));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$10$lambda$9(DimmingViewManager dimmingViewManager, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            dimmingViewManager.getDimmingView().setAlpha(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float onCreateAnimator$lambda$11(ScreenStackFragment screenStackFragment, Number number) {
        return screenStackFragment.getScreen().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float onCreateAnimator$lambda$12(Number number) {
        return Float.valueOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$15$lambda$14(ScreenStackFragment screenStackFragment, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            screenStackFragment.getScreen().setTranslationY(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$19$lambda$18(DimmingViewManager dimmingViewManager, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            dimmingViewManager.getDimmingView().setAlpha(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateAnimator$lambda$22$lambda$21(ScreenStackFragment screenStackFragment, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            screenStackFragment.getScreen().setTranslationY(f.floatValue());
        }
    }

    private final BottomSheetBehavior<Screen> createBottomSheetBehaviour() {
        return new BottomSheetBehavior<>();
    }

    private final Integer resolveBackgroundColor(Screen screen) {
        Integer valueOf;
        ColorStateList tintList;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            valueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            MaterialShapeDrawable materialShapeDrawable = background2 instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background2 : null;
            valueOf = (materialShapeDrawable == null || (tintList = materialShapeDrawable.getTintList()) == null) ? null : Integer.valueOf(tintList.getDefaultColor());
        }
        if (valueOf != null) {
            return valueOf;
        }
        ScreenContentWrapper screenContentWrapper = screen.getContentWrapper().get();
        if (screenContentWrapper == null) {
            return null;
        }
        return ViewBackgroundUtilsKt.resolveBackgroundColor(screenContentWrapper);
    }

    private final void attachShapeToScreen(Screen screen) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(screen.getSheetCornerRadius());
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        builder.setTopLeftCorner(0, pixelFromDIP);
        builder.setTopRightCorner(0, pixelFromDIP);
        ShapeAppearanceModel build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(build);
        Integer resolveBackgroundColor = resolveBackgroundColor(screen);
        materialShapeDrawable.setTint(resolveBackgroundColor != null ? resolveBackgroundColor.intValue() : 0);
        screen.setBackground(materialShapeDrawable);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (DeviceUtils.INSTANCE.isPlatformAndroidTV(getContext())) {
            this.lastFocusedChild = findLastFocusedChild();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        ScreenStackHeaderConfig headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!getScreen().isTransparent() || ((headerConfig = getScreen().getHeaderConfig()) != null && !headerConfig.getIsHeaderHidden())) {
            updateToolbarMenu(menu);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        updateToolbarMenu(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    private final boolean shouldShowSearchBar() {
        ScreenStackHeaderConfig headerConfig = getScreen().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i = 0; i < configSubviewsCount; i++) {
                if (headerConfig.getConfigSubview(i).getType() == ScreenStackHeaderSubview.Type.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateToolbarMenu(Menu menu) {
        menu.clear();
        if (shouldShowSearchBar()) {
            Context context = getContext();
            if (this.searchView == null && context != null) {
                CustomSearchView customSearchView = new CustomSearchView(context, this);
                this.searchView = customSearchView;
                Function1<? super CustomSearchView, Unit> function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(customSearchView);
                }
            }
            MenuItem add = menu.add("");
            add.setShowAsAction(2);
            add.setActionView(this.searchView);
        }
    }

    private final View findLastFocusedChild() {
        Screen screen = getScreen();
        while (screen != null) {
            if (screen.isFocused()) {
                return screen;
            }
            screen = screen instanceof ViewGroup ? ((ViewGroup) screen).getFocusedChild() : null;
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public boolean canNavigateBack() {
        ScreenContainer container = getScreen().getContainer();
        if (!(container instanceof ScreenStack)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        }
        if (!Intrinsics.areEqual(((ScreenStack) container).getRootScreen(), getScreen())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof ScreenStackFragment) {
            return ((ScreenStackFragment) parentFragment).canNavigateBack();
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.ScreenStackFragmentWrapper
    public void dismissFromContainer() {
        getScreenStack().dismiss(this);
    }

    static /* synthetic */ DimmingViewManager requireDimmingDelegate$default(ScreenStackFragment screenStackFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return screenStackFragment.requireDimmingDelegate(z);
    }

    private final DimmingViewManager requireDimmingDelegate(boolean forceCreation) {
        DimmingViewManager dimmingViewManager = this.dimmingDelegate;
        if (dimmingViewManager == null || forceCreation) {
            if (dimmingViewManager != null) {
                dimmingViewManager.invalidate(getScreen().getSheetBehavior());
            }
            this.dimmingDelegate = new DimmingViewManager(getScreen().getReactContext(), getScreen());
        }
        DimmingViewManager dimmingViewManager2 = this.dimmingDelegate;
        Intrinsics.checkNotNull(dimmingViewManager2);
        return dimmingViewManager2;
    }

    private final SheetDelegate requireSheetDelegate() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new SheetDelegate(getScreen());
        }
        SheetDelegate sheetDelegate = this.sheetDelegate;
        Intrinsics.checkNotNull(sheetDelegate);
        return sheetDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScreenStackFragment.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J0\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackFragment$ScreensCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "context", "Landroid/content/Context;", "fragment", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "pointerEventsImpl", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/ScreenStackFragment;Lcom/facebook/react/uimanager/ReactPointerEventsView;)V", "(Landroid/content/Context;Lcom/swmansion/rnscreens/ScreenStackFragment;)V", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "animationListener", "Landroid/view/animation/Animation$AnimationListener;", "startAnimation", "", "animation", "Landroid/view/animation/Animation;", "clearFocus", "onLayout", "changed", "", "l", "", "t", "r", "b", ViewProps.POINTER_EVENTS, "Lcom/facebook/react/uimanager/PointerEvents;", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ScreensCoordinatorLayout extends CoordinatorLayout implements ReactPointerEventsView {
        private final Animation.AnimationListener animationListener;
        private final ScreenStackFragment fragment;
        private final ReactPointerEventsView pointerEventsImpl;

        @Override // com.facebook.react.uimanager.ReactPointerEventsView
        public PointerEvents getPointerEvents() {
            return this.pointerEventsImpl.getPointerEvents();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreensCoordinatorLayout(Context context, ScreenStackFragment fragment, ReactPointerEventsView pointerEventsImpl) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(pointerEventsImpl, "pointerEventsImpl");
            this.fragment = fragment;
            this.pointerEventsImpl = pointerEventsImpl;
            this.animationListener = new Animation.AnimationListener() { // from class: com.swmansion.rnscreens.ScreenStackFragment$ScreensCoordinatorLayout$animationListener$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    ScreenStackFragment screenStackFragment;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    screenStackFragment = ScreenStackFragment.ScreensCoordinatorLayout.this.fragment;
                    screenStackFragment.onViewAnimationStart();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    ScreenStackFragment screenStackFragment;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    screenStackFragment = ScreenStackFragment.ScreensCoordinatorLayout.this.fragment;
                    screenStackFragment.onViewAnimationEnd();
                }
            };
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ScreensCoordinatorLayout(Context context, ScreenStackFragment fragment) {
            this(context, fragment, new PointerEventsBoxNoneImpl());
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
        }

        @Override // android.view.View
        public WindowInsets onApplyWindowInsets(WindowInsets insets) {
            WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsets(...)");
            return onApplyWindowInsets;
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ScreensAnimation screensAnimation = new ScreensAnimation(this.fragment);
            screensAnimation.setDuration(animation.getDuration());
            if ((animation instanceof AnimationSet) && !this.fragment.isRemoving()) {
                AnimationSet animationSet = (AnimationSet) animation;
                animationSet.addAnimation(screensAnimation);
                animationSet.setAnimationListener(this.animationListener);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(animation);
            animationSet2.addAnimation(screensAnimation);
            animationSet2.setAnimationListener(this.animationListener);
            super.startAnimation(animationSet2);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean changed, int l, int t, int r, int b) {
            super.onLayout(changed, l, t, r, b);
            if (SheetUtilsKt.usesFormSheetPresentation(this.fragment.getScreen())) {
                this.fragment.getScreen().onBottomSheetBehaviorDidLayout$react_native_screens_release(changed);
            }
        }
    }

    /* compiled from: ScreenStackFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackFragment$ScreensAnimation;", "Landroid/view/animation/Animation;", "mFragment", "Lcom/swmansion/rnscreens/ScreenFragment;", "<init>", "(Lcom/swmansion/rnscreens/ScreenFragment;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ScreensAnimation extends Animation {
        private final ScreenFragment mFragment;

        public ScreensAnimation(ScreenFragment mFragment) {
            Intrinsics.checkNotNullParameter(mFragment, "mFragment");
            this.mFragment = mFragment;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            this.mFragment.dispatchTransitionProgressEvent(interpolatedTime, !r3.isResumed());
        }
    }
}
