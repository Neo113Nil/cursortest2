package com.squareup.cash.ui;

import androidx.activity.OnBackPressedDispatcher;
import app.cash.broadway.presenter.Presenter;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewEvent;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.overlays.OverlaysKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class MainContainerDelegate$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainContainerDelegate f$0;

    public /* synthetic */ MainContainerDelegate$$ExternalSyntheticLambda0(MainContainerDelegate mainContainerDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = mainContainerDelegate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r0 == true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r3.onBack() == true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (r0 == true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        if (r3.onBack() != true) goto L48;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MainContainerDelegate mainContainerDelegate = this.f$0;
        switch (i) {
            case 0:
                MainScreensViewEvent mainScreensViewEvent = (MainScreensViewEvent) obj;
                mainScreensViewEvent.getClass();
                Object value = mainContainerDelegate.containerPresenterBinding.getValue();
                value.getClass();
                ((Presenter.Binding) value).sendEvent(mainScreensViewEvent);
                return Unit.INSTANCE;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = mainContainerDelegate.container;
                if (uiContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("container");
                    throw null;
                }
                boolean z = true;
                if (booleanValue) {
                    OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) uiContainer.overlayBackPressedDispatcher.get();
                    if (onBackPressedDispatcher != null) {
                        boolean z2 = onBackPressedDispatcher.hasEnabledCallbacks;
                        if (z2) {
                            onBackPressedDispatcher.onBackPressed();
                            break;
                        }
                    }
                    OnBackListener onBackListener = (OnBackListener) uiContainer.overlayBackListener.get();
                    if (onBackListener != null) {
                        break;
                    }
                    z = false;
                } else {
                    if (((NavigationModel.Ready.Swipe.Page) uiContainer.swipeActivePage$delegate.getValue()) == NavigationModel.Ready.Swipe.Page.SidePanel) {
                        ContainerUiModel containerUiModel = (ContainerUiModel) uiContainer.containerModel$delegate.getValue();
                        NavigationModel navigationModel = containerUiModel != null ? containerUiModel.navigation : null;
                        NavigationModel.Ready ready = navigationModel instanceof NavigationModel.Ready ? (NavigationModel.Ready) navigationModel : null;
                        if ((ready != null ? ready.swipe : null) != null) {
                            uiContainer.requestedSwipePage$delegate.setValue(NavigationModel.Ready.Swipe.Page.MainTabs);
                        }
                    }
                    OnBackPressedDispatcher onBackPressedDispatcher2 = (OnBackPressedDispatcher) uiContainer.fullScreenBackPressedDispatcher.get();
                    if (onBackPressedDispatcher2 != null) {
                        boolean z3 = onBackPressedDispatcher2.hasEnabledCallbacks;
                        if (z3) {
                            onBackPressedDispatcher2.onBackPressed();
                            break;
                        }
                    }
                    if (!OverlaysKt.getOverlayLayer(uiContainer).onBack()) {
                        OnBackListener onBackListener2 = (OnBackListener) uiContainer.fullScreenBackListener.get();
                        if (onBackListener2 != null) {
                            break;
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
