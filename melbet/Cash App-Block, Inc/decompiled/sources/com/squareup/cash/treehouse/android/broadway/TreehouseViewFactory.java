package com.squareup.cash.treehouse.android.broadway;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.redwood.treehouse.RealTreehouseApp;
import coil3.RealImageLoader;
import com.squareup.cash.blockers.views.FormBlockerView$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.requestsponsorship.screens.ContactPermissionDialogScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectContactMethodScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorErrorScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.screens.SponsorSelectionDetailsScreen;
import com.squareup.cash.family.requestsponsorship.views.ContactPermissionDialog;
import com.squareup.cash.family.requestsponsorship.views.SelectSponsorErrorView;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.android.viewmodels.TreehouseUiModel;
import com.withpersona.sdk2.camera.CameraPreview$rebind$1$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.Map;
import okio.ByteString;

/* loaded from: classes.dex */
public final class TreehouseViewFactory implements ViewFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object cashTreehouseLayoutFactory;
    public final Object treehouseApps;

    /* loaded from: classes7.dex */
    public final class RetainedTreehouseUi extends TreehouseUi {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetainedTreehouseUi(Context context, CashTreehouseLayout.Factory factory, RealTreehouseApp realTreehouseApp, ByteString byteString, OnBackPressedDispatcher onBackPressedDispatcher) {
            super(context, factory, realTreehouseApp, byteString, onBackPressedDispatcher);
            context.getClass();
            realTreehouseApp.getClass();
            onBackPressedDispatcher.getClass();
        }

        @Override // com.squareup.cash.treehouse.android.broadway.TreehouseViewFactory.TreehouseUi, app.cash.broadway.ui.Ui
        public final void setModel(TreehouseUiModel treehouseUiModel) {
            treehouseUiModel.getClass();
            CashTreehouseLayout cashTreehouseLayout = this.view;
            if (cashTreehouseLayout.bindState != CashTreehouseLayout.BindState.NotBound) {
                return;
            }
            cashTreehouseLayout.setContent(treehouseUiModel.path, treehouseUiModel.navigator, this.parameters);
            CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.Bound, null, 2);
            LifecycleOwner lifecycleOwner = DBUtil.get(cashTreehouseLayout);
            lifecycleOwner.getClass();
            lifecycleOwner.getLifecycle().addObserver(new CameraPreview$rebind$1$1$1(this, 2));
        }
    }

    /* loaded from: classes7.dex */
    public class TreehouseUi implements Ui {
        public final ByteString parameters;
        public final CashTreehouseLayout view;

        public TreehouseUi(Context context, CashTreehouseLayout.Factory factory, RealTreehouseApp realTreehouseApp, ByteString byteString, OnBackPressedDispatcher onBackPressedDispatcher) {
            context.getClass();
            realTreehouseApp.getClass();
            onBackPressedDispatcher.getClass();
            this.parameters = byteString;
            this.view = CashTreehouseLayout.Factory.create$default(factory, context, realTreehouseApp, onBackPressedDispatcher);
        }

        public final CashTreehouseLayout getView() {
            return this.view;
        }

        @Override // app.cash.broadway.ui.Ui
        public final void setEventReceiver(Ui.EventReceiver eventReceiver) {
            eventReceiver.getClass();
        }

        @Override // app.cash.broadway.ui.Ui
        public void setModel(TreehouseUiModel treehouseUiModel) {
            treehouseUiModel.getClass();
            String str = treehouseUiModel.path;
            BetterNavigator.ScreenNavigator screenNavigator = treehouseUiModel.navigator;
            ByteString byteString = this.parameters;
            CashTreehouseLayout cashTreehouseLayout = this.view;
            cashTreehouseLayout.setContent(str, screenNavigator, byteString);
            cashTreehouseLayout.getClass();
            CashTreehouseLayout.updateState$default(cashTreehouseLayout, CashTreehouseLayout.BindState.BoundWhenReady, null, 2);
        }
    }

    public /* synthetic */ TreehouseViewFactory(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.treehouseApps = obj;
        this.cashTreehouseLayoutFactory = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v18, types: [com.squareup.cash.blockers.views.FormBlockerView] */
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        RegisteredTreehouseApp registeredTreehouseApp;
        TreehouseUi treehouseUi;
        ComposeUiView p2PListView;
        ComposeUiView composeUiView;
        int i = this.$r8$classId;
        Object obj = this.treehouseApps;
        Object obj2 = this.cashTreehouseLayoutFactory;
        switch (i) {
            case 0:
                CashTreehouseLayout.Factory factory = (CashTreehouseLayout.Factory) obj2;
                context.getClass();
                if (!(screen instanceof TreehouseScreen)) {
                    return null;
                }
                TreehouseScreen treehouseScreen = (TreehouseScreen) screen;
                Provider provider = (Provider) ((Map) obj).get(treehouseScreen.f1218app);
                if (provider == null || (registeredTreehouseApp = (RegisteredTreehouseApp) provider.invoke()) == null) {
                    return null;
                }
                boolean z = treehouseScreen.retainInstance;
                if (z) {
                    RealTreehouseApp treehouseApp = registeredTreehouseApp.getTreehouseApp();
                    ByteString byteString = treehouseScreen.parameters;
                    OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = Trace.get(viewGroup);
                    onBackPressedDispatcherOwner.getClass();
                    treehouseUi = new RetainedTreehouseUi(context, factory, treehouseApp, byteString, onBackPressedDispatcherOwner.getOnBackPressedDispatcher());
                } else {
                    if (z) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RealTreehouseApp treehouseApp2 = registeredTreehouseApp.getTreehouseApp();
                    ByteString byteString2 = treehouseScreen.parameters;
                    OnBackPressedDispatcherOwner onBackPressedDispatcherOwner2 = Trace.get(viewGroup);
                    onBackPressedDispatcherOwner2.getClass();
                    treehouseUi = new TreehouseUi(context, factory, treehouseApp2, byteString2, onBackPressedDispatcherOwner2.getOnBackPressedDispatcher());
                }
                return new ViewFactory.ScreenView(treehouseUi.getView(), treehouseUi);
            default:
                RealImageLoader realImageLoader = (RealImageLoader) obj2;
                context.getClass();
                if (screen instanceof SponsorSelectionDetailsScreen) {
                    composeUiView = ((FormBlockerView$Factory$Impl) obj).create(context);
                } else {
                    if (screen instanceof SelectContactMethodScreen) {
                        p2PListView = new P2PListView(context, realImageLoader, 11);
                    } else if ((screen instanceof SelectSponsorScreen) || (screen instanceof SelectDependentScreen)) {
                        p2PListView = new P2PListView(realImageLoader, context, 12);
                    } else if (screen instanceof SelectSponsorErrorScreen) {
                        composeUiView = new SelectSponsorErrorView(context);
                    } else {
                        if (!(screen instanceof ContactPermissionDialogScreen)) {
                            return null;
                        }
                        composeUiView = new ContactPermissionDialog(context);
                    }
                    composeUiView = p2PListView;
                }
                return new ViewFactory.ScreenView(composeUiView, composeUiView);
        }
    }
}
