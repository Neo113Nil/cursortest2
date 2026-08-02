package com.squareup.cash.tax.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.webkit.WebView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.VideoCapture;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.banking.backend.real.RealBankingOptionBadgeUpdater;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mooncake.components.MooncakeMediumText;
import com.squareup.cash.mooncake.components.MooncakeProgress;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt$overrideTheme$1;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.tax.primitives.Id;
import com.squareup.cash.tax.primitives.MenuItemStyle;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.primitives.TaxMenuItem;
import com.squareup.cash.tax.primitives.TaxToolbarConfig;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.tax.viewmodels.TaxBridgeCommand;
import com.squareup.cash.tax.viewmodels.TaxWebAppBridgeEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewEvent;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel;
import com.squareup.cash.tax.viewmodels.TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult;
import com.squareup.cash.tax.viewmodels.interfaces.CloseKeyboard;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.models.BridgeSavedState;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.cash.ui.drawable.RippleDrawableKt;
import com.squareup.protos.cash.tax.TaxWebBridgeDialog;
import com.squareup.protos.cash.unicorn.dismiss_badge.DismissBadgeRequest;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import com.squareup.util.Strings;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.Views;
import com.squareup.util.android.coroutines.ViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.ContextScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class TaxWebAppView extends ConstraintLayout implements Ui, SecureScreen, OnBackListener, DialogResultListener {
    public final TaxWebAppLayoutBinding binding;
    public Ui.EventReceiver eventReceiver;
    public final TaxWebAppBridge taxWebAppBridge;

    /* renamed from: com.squareup.cash.tax.views.TaxWebAppView$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$1;
        public ReceiveChannel L$2;
        public BufferedChannel.BufferedChannelIterator L$4;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((TaxWebAppView) obj2, continuation, 0);
                default:
                    return new AnonymousClass1((RealBankingOptionBadgeUpdater) obj2, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        
            if (r10.dismissBadge(r11, r14) == r0) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #3 {all -> 0x002c, blocks: (B:9:0x0025, B:11:0x0057, B:18:0x0071, B:20:0x0079, B:28:0x0042, B:30:0x004d), top: B:4:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0100 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:43:0x00c0, B:44:0x00f8, B:46:0x0100, B:48:0x00df, B:59:0x00d3), top: B:39:0x00ae }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.channels.ReceiveChannel] */
        /* JADX WARN: Type inference failed for: r8v10, types: [kotlinx.coroutines.channels.ReceiveChannel] */
        /* JADX WARN: Type inference failed for: r8v11, types: [kotlinx.coroutines.channels.ReceiveChannel] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009a -> B:10:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f5 -> B:42:0x00f8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
            TaxWebAppView taxWebAppView;
            int i;
            int i2;
            BufferedChannel bufferedChannel;
            Object hasNext;
            RealBankingOptionBadgeUpdater realBankingOptionBadgeUpdater;
            BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
            int i3;
            int i4;
            RealBankingOptionBadgeUpdater realBankingOptionBadgeUpdater2;
            BufferedChannel bufferedChannel2;
            BufferedChannel.BufferedChannelIterator bufferedChannelIterator3;
            int i5;
            BufferedChannel bufferedChannel3;
            Object hasNext2;
            int i6 = this.$r8$classId;
            Object obj2 = this.this$0;
            int i7 = 0;
            switch (i6) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    try {
                        if (i8 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            TaxWebAppView taxWebAppView2 = (TaxWebAppView) obj2;
                            BufferedChannel bufferedChannel4 = taxWebAppView2.taxWebAppBridge.webEvents;
                            bufferedChannel4.getClass();
                            bufferedChannelIterator = bufferedChannel4.new BufferedChannelIterator();
                            taxWebAppView = taxWebAppView2;
                            i = 0;
                            i2 = 0;
                            bufferedChannel = bufferedChannel4;
                            this.L$1 = taxWebAppView;
                            this.L$2 = bufferedChannel;
                            this.L$4 = bufferedChannelIterator;
                            this.I$0 = i7;
                            this.I$1 = i;
                            this.I$2 = i2;
                            this.label = 1;
                            hasNext = bufferedChannelIterator.hasNext(this);
                            if (hasNext != coroutineSingletons) {
                            }
                        } else {
                            if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = this.I$2;
                            int i9 = this.I$1;
                            i7 = this.I$0;
                            bufferedChannelIterator = this.L$4;
                            ?? r7 = this.L$2;
                            taxWebAppView = (TaxWebAppView) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            BufferedChannel bufferedChannel5 = r7;
                            if (!((Boolean) obj).booleanValue()) {
                                TaxWebAppView.access$handleWebEvents(taxWebAppView, (TaxWebAppBridgeEvent) bufferedChannelIterator.next());
                                i = i9;
                                bufferedChannel = bufferedChannel5;
                                this.L$1 = taxWebAppView;
                                this.L$2 = bufferedChannel;
                                this.L$4 = bufferedChannelIterator;
                                this.I$0 = i7;
                                this.I$1 = i;
                                this.I$2 = i2;
                                this.label = 1;
                                hasNext = bufferedChannelIterator.hasNext(this);
                                if (hasNext != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                i9 = i;
                                obj = hasNext;
                                bufferedChannel5 = bufferedChannel;
                                if (!((Boolean) obj).booleanValue()) {
                                    bufferedChannel5.cancel(null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } finally {
                    }
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    try {
                        if (i10 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            realBankingOptionBadgeUpdater = (RealBankingOptionBadgeUpdater) obj2;
                            BufferedChannel bufferedChannel6 = realBankingOptionBadgeUpdater.optionIds;
                            bufferedChannel6.getClass();
                            bufferedChannelIterator2 = bufferedChannel6.new BufferedChannelIterator();
                            i3 = 0;
                            i4 = 0;
                            bufferedChannel3 = bufferedChannel6;
                            this.L$1 = realBankingOptionBadgeUpdater;
                            this.L$2 = bufferedChannel3;
                            this.L$4 = bufferedChannelIterator2;
                            this.I$0 = i7;
                            this.I$1 = i3;
                            this.I$2 = i4;
                            this.label = 1;
                            hasNext2 = bufferedChannelIterator2.hasNext(this);
                            if (hasNext2 != coroutineSingletons2) {
                            }
                        } else if (i10 == 1) {
                            i5 = this.I$2;
                            i3 = this.I$1;
                            i7 = this.I$0;
                            bufferedChannelIterator3 = this.L$4;
                            ?? r8 = this.L$2;
                            realBankingOptionBadgeUpdater2 = (RealBankingOptionBadgeUpdater) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            bufferedChannel2 = r8;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            if (i10 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i5 = this.I$2;
                            i3 = this.I$1;
                            i7 = this.I$0;
                            bufferedChannelIterator3 = this.L$4;
                            ?? r82 = this.L$2;
                            realBankingOptionBadgeUpdater2 = (RealBankingOptionBadgeUpdater) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            BufferedChannel bufferedChannel7 = r82;
                            bufferedChannelIterator2 = bufferedChannelIterator3;
                            i4 = i5;
                            realBankingOptionBadgeUpdater = realBankingOptionBadgeUpdater2;
                            bufferedChannel3 = bufferedChannel7;
                            this.L$1 = realBankingOptionBadgeUpdater;
                            this.L$2 = bufferedChannel3;
                            this.L$4 = bufferedChannelIterator2;
                            this.I$0 = i7;
                            this.I$1 = i3;
                            this.I$2 = i4;
                            this.label = 1;
                            hasNext2 = bufferedChannelIterator2.hasNext(this);
                            if (hasNext2 != coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            int i11 = i4;
                            bufferedChannelIterator3 = bufferedChannelIterator2;
                            obj = hasNext2;
                            realBankingOptionBadgeUpdater2 = realBankingOptionBadgeUpdater;
                            i5 = i11;
                            bufferedChannel2 = bufferedChannel3;
                            if (!((Boolean) obj).booleanValue()) {
                                String str = (String) bufferedChannelIterator3.next();
                                UnicornService unicornService = realBankingOptionBadgeUpdater2.appService;
                                DismissBadgeRequest dismissBadgeRequest = new DismissBadgeRequest(str, ByteString.EMPTY);
                                this.L$1 = realBankingOptionBadgeUpdater2;
                                this.L$2 = bufferedChannel2;
                                this.L$4 = bufferedChannelIterator3;
                                this.I$0 = i7;
                                this.I$1 = i3;
                                this.I$2 = i5;
                                this.label = 2;
                                bufferedChannel7 = bufferedChannel2;
                                break;
                            } else {
                                bufferedChannel2.cancel(null);
                                return Unit.INSTANCE;
                            }
                        }
                    } finally {
                    }
            }
        }
    }

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new TaxMenuSheet.Creator(5);
        public final Parcelable superState;
        public final Parcelable webBridgeSaveState;

        public State(Parcelable parcelable, Parcelable parcelable2) {
            this.superState = parcelable;
            this.webBridgeSaveState = parcelable2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.superState, i);
            parcel.writeParcelable(this.webBridgeSaveState, i);
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxWebBridgeDialog.Button.Action.values().length];
            try {
                iArr[TaxWebBridgeDialog.Button.Action.SUBMIT_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxWebBridgeDialog.Button.Action.CLOSE_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxWebAppView(ThemeHelpersKt$overrideTheme$1 themeHelpersKt$overrideTheme$1, String str, Map map, IntentLauncher intentLauncher, AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl, Activity activity, Flow flow, AndroidStringManager androidStringManager, AndroidPermissionManager androidPermissionManager, Storage storage, AndroidFileProvider androidFileProvider, Flow flow2) {
        super(themeHelpersKt$overrideTheme$1);
        map.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.findThemeInfo(themeHelpersKt$overrideTheme$1).colorPalette;
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        final int i = 1;
        Continuation continuation = null;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setId(R.id.tax_view_main_web_app_id);
        int i2 = colorPalette.background;
        int i3 = colorPalette.background;
        setBackgroundColor(i2);
        View inflate = View.inflate(new ContextThemeWrapper(themeHelpersKt$overrideTheme$1, R.style.Theme_Cash_Default_Accent_Taxes), R.layout.tax_web_app_layout, this);
        int i4 = R.id.tax_desktop_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(inflate, R.id.tax_desktop_icon);
        if (appCompatImageView != null) {
            i4 = R.id.tax_web_app_error_text;
            MooncakeMediumText mooncakeMediumText = (MooncakeMediumText) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_error_text);
            if (mooncakeMediumText != null) {
                i4 = R.id.tax_web_app_loading_progress;
                MooncakeProgress mooncakeProgress = (MooncakeProgress) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_loading_progress);
                if (mooncakeProgress != null) {
                    i4 = R.id.tax_web_app_loading_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_loading_view);
                    if (constraintLayout != null) {
                        i4 = R.id.tax_web_app_toolbar;
                        MooncakeToolbar mooncakeToolbar = (MooncakeToolbar) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_toolbar);
                        if (mooncakeToolbar != null) {
                            i4 = R.id.tax_web_app_toolbar_back_button;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_toolbar_back_button);
                            if (appCompatImageView2 != null) {
                                i4 = R.id.tax_web_app_toolbar_title;
                                MooncakeMediumText mooncakeMediumText2 = (MooncakeMediumText) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_toolbar_title);
                                if (mooncakeMediumText2 != null) {
                                    i4 = R.id.tax_web_app_webview;
                                    WebView webView = (WebView) ViewBindings.findChildViewById(inflate, R.id.tax_web_app_webview);
                                    if (webView != null) {
                                        this.binding = new TaxWebAppLayoutBinding(inflate, appCompatImageView, mooncakeMediumText, mooncakeProgress, constraintLayout, mooncakeToolbar, appCompatImageView2, mooncakeMediumText2, webView);
                                        ContextScope plus = JobKt.plus(new CoroutineName(TaxWebAppView.class.getName()), JobKt.MainScope());
                                        addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(8, this, plus));
                                        this.taxWebAppBridge = new TaxWebAppBridge(str, map, webView, intentLauncher, activity, androidStringManager, androidPermissionManager, storage, androidFileProvider, androidDownloadManager$Factory$Impl, flow, flow2, plus);
                                        final int i5 = 0;
                                        ViewKt.whileAttachedOnce$default(this, new AnonymousClass1(this, continuation, i5));
                                        int i6 = colorPalette.label;
                                        constraintLayout.setBackgroundColor(i3);
                                        mooncakeToolbar.setBackgroundColor(i3);
                                        mooncakeToolbar.setElevation(RecyclerView.DECELERATION_RATE);
                                        mooncakeToolbar.setNavigationIcon((Drawable) null);
                                        int i7 = colorPalette.icon;
                                        appCompatImageView2.setColorFilter(i7);
                                        appCompatImageView2.setBackground(RipplesKt.createBorderlessRippleDrawable(appCompatImageView2));
                                        appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.tax.views.TaxWebAppView$$ExternalSyntheticLambda0
                                            public final /* synthetic */ TaxWebAppView f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i8 = i5;
                                                TaxWebAppView taxWebAppView = this.f$0;
                                                switch (i8) {
                                                    case 0:
                                                        TaxWebAppBridge taxWebAppBridge = taxWebAppView.taxWebAppBridge;
                                                        WebView webView2 = taxWebAppBridge.webview;
                                                        if (!webView2.canGoBack()) {
                                                            taxWebAppView.sendEvent(TaxWebAppViewEvent.FinishTaxFlow.INSTANCE);
                                                            break;
                                                        } else {
                                                            webView2.goBack();
                                                            taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.BackButtonTapCommand.INSTANCE);
                                                            break;
                                                        }
                                                    default:
                                                        taxWebAppView.taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.DesktopButtonTapCommand.INSTANCE);
                                                        break;
                                                }
                                            }
                                        });
                                        appCompatImageView.setVisibility(8);
                                        Context context = mooncakeToolbar.getContext();
                                        context.getClass();
                                        appCompatImageView.setImageDrawable(PlatformKt.getDrawableCompat(context, R.drawable.tax_view_desktop_toolbar_icon, Integer.valueOf(i7)));
                                        RippleDrawable createRippleDrawable$default = RippleDrawableKt.createRippleDrawable$default(appCompatImageView);
                                        createRippleDrawable$default.setRadius(Views.dip((View) appCompatImageView, 20));
                                        appCompatImageView.setBackground(createRippleDrawable$default);
                                        appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.tax.views.TaxWebAppView$$ExternalSyntheticLambda0
                                            public final /* synthetic */ TaxWebAppView f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i8 = i;
                                                TaxWebAppView taxWebAppView = this.f$0;
                                                switch (i8) {
                                                    case 0:
                                                        TaxWebAppBridge taxWebAppBridge = taxWebAppView.taxWebAppBridge;
                                                        WebView webView2 = taxWebAppBridge.webview;
                                                        if (!webView2.canGoBack()) {
                                                            taxWebAppView.sendEvent(TaxWebAppViewEvent.FinishTaxFlow.INSTANCE);
                                                            break;
                                                        } else {
                                                            webView2.goBack();
                                                            taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.BackButtonTapCommand.INSTANCE);
                                                            break;
                                                        }
                                                    default:
                                                        taxWebAppView.taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.DesktopButtonTapCommand.INSTANCE);
                                                        break;
                                                }
                                            }
                                        });
                                        MenuItemImpl menuItemImpl = (MenuItemImpl) mooncakeToolbar.getMenu().add(0, R.id.tax_view_menu_item_help, 200, R.string.tax_view_toolbar_help);
                                        menuItemImpl.setShowAsAction(2);
                                        menuItemImpl.setVisible(false);
                                        Context context2 = mooncakeToolbar.getContext();
                                        context2.getClass();
                                        menuItemImpl.setIcon(PlatformKt.getDrawableCompat(context2, R.drawable.mooncake_medium_icon_nav_help, Integer.valueOf(i7)));
                                        MenuItemImpl menuItemImpl2 = (MenuItemImpl) mooncakeToolbar.getMenu().add(0, R.id.tax_view_menu_item_overflow, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, R.string.tax_view_toolbar_menu);
                                        menuItemImpl2.setShowAsAction(2);
                                        menuItemImpl2.setVisible(true);
                                        Context context3 = mooncakeToolbar.getContext();
                                        context3.getClass();
                                        menuItemImpl2.setIcon(PlatformKt.getDrawableCompat(context3, R.drawable.overflow, Integer.valueOf(i7)));
                                        MenuItemImpl menuItemImpl3 = (MenuItemImpl) mooncakeToolbar.getMenu().add(0, R.id.tax_view_menu_item_close, 400, R.string.tax_view_toolbar_close);
                                        menuItemImpl3.setShowAsAction(2);
                                        menuItemImpl3.setVisible(false);
                                        Context context4 = mooncakeToolbar.getContext();
                                        context4.getClass();
                                        menuItemImpl3.setIcon(PlatformKt.getDrawableCompat(context4, R.drawable.close_white, Integer.valueOf(i7)));
                                        mooncakeToolbar.setOnMenuItemClickListener(new MaterialButton$$ExternalSyntheticLambda3(this, 24));
                                        TextThemeInfo textThemeInfo = TextStyles.mainTitle;
                                        textThemeInfo.getClass();
                                        Strings.applyStyle(mooncakeMediumText2, textThemeInfo);
                                        mooncakeMediumText2.setTextColor(i6);
                                        Context context5 = mooncakeMediumText.getContext();
                                        context5.getClass();
                                        mooncakeMediumText.setTypeface(ResourcesCompat.getFont(context5, R.font.cashsans_bold));
                                        mooncakeMediumText.setTextColor(i6);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
        throw null;
    }

    public static final void access$handleWebEvents(final TaxWebAppView taxWebAppView, TaxWebAppBridgeEvent taxWebAppBridgeEvent) {
        TaxWebAppLayoutBinding taxWebAppLayoutBinding = taxWebAppView.binding;
        if (Intrinsics.areEqual(taxWebAppBridgeEvent, TaxWebAppBridgeEvent.NewPageLoad.INSTANCE)) {
            taxWebAppView.showLoadingView();
            return;
        }
        if (Intrinsics.areEqual(taxWebAppBridgeEvent, TaxWebAppBridgeEvent.FinishedPageLoad.INSTANCE)) {
            ((ConstraintLayout) taxWebAppLayoutBinding.taxWebAppLoadingView).setVisibility(8);
            return;
        }
        if (taxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.ToolbarUpdate) {
            TaxToolbarConfig taxToolbarConfig = ((TaxWebAppBridgeEvent.ToolbarUpdate) taxWebAppBridgeEvent).toolbarConfig;
            boolean z = taxToolbarConfig.hidden;
            ArrayList arrayList = taxToolbarConfig.toolbarItems;
            MooncakeToolbar mooncakeToolbar = (MooncakeToolbar) taxWebAppLayoutBinding.taxWebAppToolbar;
            AppCompatImageView appCompatImageView = (AppCompatImageView) taxWebAppLayoutBinding.taxDesktopIcon;
            ((AppCompatImageView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton).setVisibility(((!z && arrayList.contains(TaxToolbarConfig.ToolbarItem.BACK)) && taxWebAppView.taxWebAppBridge.webview.canGoBack()) ? 0 : 8);
            mooncakeToolbar.getMenu().findItem(R.id.tax_view_menu_item_help).setVisible(!z && arrayList.contains(TaxToolbarConfig.ToolbarItem.HELP));
            mooncakeToolbar.getMenu().findItem(R.id.tax_view_menu_item_overflow).setVisible(!z && arrayList.contains(TaxToolbarConfig.ToolbarItem.MENU));
            mooncakeToolbar.getMenu().findItem(R.id.tax_view_menu_item_close).setVisible(!z && arrayList.contains(TaxToolbarConfig.ToolbarItem.CLOSE));
            boolean z2 = !z && arrayList.contains(TaxToolbarConfig.ToolbarItem.DESKTOP);
            appCompatImageView.setVisibility(z2 ? 0 : 8);
            if (z2) {
                final ViewTreeObserver viewTreeObserver = appCompatImageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.squareup.cash.tax.views.TaxWebAppView$toggleDesktopMenuVisibility$1
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                            int[] iArr = new int[2];
                            TaxWebAppView taxWebAppView2 = taxWebAppView;
                            ((AppCompatImageView) taxWebAppView2.binding.taxDesktopIcon).getLocationOnScreen(iArr);
                            int i = iArr[1];
                            TaxWebAppLayoutBinding taxWebAppLayoutBinding2 = taxWebAppView2.binding;
                            taxWebAppView2.sendEvent(new TaxWebAppViewEvent.OpenTooltipEvent(((AppCompatImageView) taxWebAppLayoutBinding2.taxDesktopIcon).getHeight() + i, iArr[0], ((AppCompatImageView) taxWebAppLayoutBinding2.taxDesktopIcon).getWidth()));
                        }
                    });
                }
            }
            MooncakeMediumText mooncakeMediumText = (MooncakeMediumText) taxWebAppLayoutBinding.taxWebAppToolbarTitle;
            String str = taxToolbarConfig.title;
            if (str == null) {
                str = "";
            }
            mooncakeMediumText.setText(str);
            ((MooncakeToolbar) taxWebAppLayoutBinding.taxWebAppToolbar).setVisibility(z ? 8 : 0);
            return;
        }
        if (taxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenExternalUrl) {
            taxWebAppView.sendEvent(new TaxWebAppViewEvent.WebAppBridgeEvent((TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent) taxWebAppBridgeEvent));
            return;
        }
        if (taxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenTaxMenuSheet) {
            Keyboards.hideKeyboard(taxWebAppView);
            List list = ((TaxWebAppBridgeEvent.OpenTaxMenuSheet) taxWebAppBridgeEvent).taxMenuItems;
            String string2 = taxWebAppView.getResources().getString(R.string.tax_view_close);
            string2.getClass();
            taxWebAppView.sendEvent(new TaxWebAppViewEvent.WebAppBridgeEvent(new TaxWebAppBridgeEvent.OpenTaxMenuSheet(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new TaxMenuItem(Id.Close.INSTANCE, string2, MenuItemStyle.Close)), (Collection) list))));
            return;
        }
        if (Intrinsics.areEqual(taxWebAppBridgeEvent, TaxWebAppBridgeEvent.FinishCashAppTaxes.INSTANCE)) {
            taxWebAppView.sendEvent(TaxWebAppViewEvent.FinishTaxFlow.INSTANCE);
            return;
        }
        if (taxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenTaxDialog) {
            taxWebAppView.sendEvent(new TaxWebAppViewEvent.WebAppBridgeEvent((TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent) taxWebAppBridgeEvent));
            return;
        }
        if (taxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenTaxesFlowLoadingScreen) {
            taxWebAppView.sendEvent(new TaxWebAppViewEvent.WebAppBridgeEvent((TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent) taxWebAppBridgeEvent));
        } else if (taxWebAppBridgeEvent instanceof TaxWebAppBridgeEvent.OpenNativeDeepLink) {
            taxWebAppView.sendEvent(new TaxWebAppViewEvent.WebAppBridgeEvent((TaxWebAppBridgeEvent.PresenterHandledTaxWebAppBridgeEvent) taxWebAppBridgeEvent));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        boolean isVisible = ((MooncakeToolbar) this.binding.taxWebAppToolbar).getMenu().findItem(R.id.tax_view_menu_item_close).isVisible();
        TaxWebAppBridge taxWebAppBridge = this.taxWebAppBridge;
        if (isVisible) {
            taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.CloseButtonTapCommand.INSTANCE);
            return true;
        }
        WebView webView = taxWebAppBridge.webview;
        if (!webView.canGoBack()) {
            sendEvent(TaxWebAppViewEvent.FinishTaxFlow.INSTANCE);
            return true;
        }
        webView.goBack();
        taxWebAppBridge.sendWebCommand(TaxBridgeCommand.TaxWebAppCommand.BackButtonTapCommand.INSTANCE);
        return true;
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        if (screen instanceof TaxMenuSheet) {
            this.taxWebAppBridge.sendWebCommand(new TaxBridgeCommand.MenuItemTapCommand(Id.Close.INSTANCE));
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        boolean z = screen instanceof TaxMenuSheet;
        TaxWebAppBridge taxWebAppBridge = this.taxWebAppBridge;
        if (z && (obj instanceof TaxMenuItem)) {
            Id id = ((TaxMenuItem) obj).id;
            if (Intrinsics.areEqual(id, Id.ExitCashAppTaxes.INSTANCE)) {
                sendEvent(TaxWebAppViewEvent.FinishTaxFlow.INSTANCE);
            } else {
                taxWebAppBridge.sendWebCommand(new TaxBridgeCommand.MenuItemTapCommand(id));
            }
        }
        if ((screen instanceof com.squareup.cash.tax.screens.TaxWebBridgeDialog) && (obj instanceof TaxDialogDataModel.Button)) {
            TaxDialogDataModel.Button button = (TaxDialogDataModel.Button) obj;
            TaxWebBridgeDialog.Button.Action fromValue = TaxWebBridgeDialog.Button.Action.INSTANCE.fromValue(button.action.value);
            int i = fromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    taxWebAppBridge.sendWebCommand(new TaxBridgeCommand.TaxWebAppCommand.DialogSubmitRequest(button.id));
                } else {
                    if (i == 2) {
                        return;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        if (!(parcelable instanceof State)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        State state = (State) parcelable;
        Parcelable parcelable2 = state.webBridgeSaveState;
        TaxWebAppBridge taxWebAppBridge = this.taxWebAppBridge;
        taxWebAppBridge.getClass();
        if ((parcelable2 instanceof BridgeSavedState) && (str = ((BridgeSavedState) parcelable2).lastUrlLoaded) != null && !StringsKt.isBlank(str)) {
            taxWebAppBridge.loadUrl(str);
        }
        super.onRestoreInstanceState(state.superState);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new State(super.onSaveInstanceState(), new BridgeSavedState(this.taxWebAppBridge.lastUrlLoaded));
    }

    public final void sendEvent(TaxWebAppViewEvent taxWebAppViewEvent) {
        if ((taxWebAppViewEvent instanceof CloseKeyboard) || ((taxWebAppViewEvent instanceof TaxWebAppViewEvent.WebAppBridgeEvent) && (((TaxWebAppViewEvent.WebAppBridgeEvent) taxWebAppViewEvent).bridgeEvent instanceof CloseKeyboard))) {
            Keyboards.hideKeyboard(this);
        }
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(taxWebAppViewEvent);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(TaxWebAppViewModel taxWebAppViewModel) {
        taxWebAppViewModel.getClass();
        if (taxWebAppViewModel instanceof TaxWebAppViewModel.Loading) {
            showLoadingView();
            return;
        }
        boolean z = taxWebAppViewModel instanceof TaxWebAppViewModel.LoadUrl;
        TaxWebAppBridge taxWebAppBridge = this.taxWebAppBridge;
        if (z) {
            showLoadingView();
            taxWebAppBridge.loadUrl(((TaxWebAppViewModel.LoadUrl) taxWebAppViewModel).url);
            return;
        }
        if (taxWebAppViewModel.equals(TaxWebAppViewModel.ErrorUrl.INSTANCE)) {
            TaxWebAppLayoutBinding taxWebAppLayoutBinding = this.binding;
            MooncakeMediumText mooncakeMediumText = (MooncakeMediumText) taxWebAppLayoutBinding.taxWebAppErrorText;
            mooncakeMediumText.setText(R.string.tax_view_error_url);
            mooncakeMediumText.setVisibility(0);
            ((MooncakeProgress) taxWebAppLayoutBinding.taxWebAppLoadingProgress).setVisibility(8);
            ((ConstraintLayout) taxWebAppLayoutBinding.taxWebAppLoadingView).setVisibility(0);
            return;
        }
        if (taxWebAppViewModel instanceof TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult) {
            taxWebAppBridge.sendWebCommand((TaxBridgeCommand) taxWebAppViewModel);
            return;
        }
        if (!(taxWebAppViewModel instanceof TaxWebAppViewModel.TransitoryWebModel)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        if (!taxWebAppBridge.isWebBridgeLoaded) {
            taxWebAppBridge.loadUrl(((TaxWebAppViewModel.TransitoryWebModel) taxWebAppViewModel).currentUrl);
        }
        Iterator it = ((TaxWebAppViewModel.TransitoryWebModel) taxWebAppViewModel).presenterHandledCommandResponses.iterator();
        while (it.hasNext()) {
            taxWebAppBridge.sendWebCommand((TaxWebAppViewModel$PresenterHandledCommandResponse$NativeDeepLinkResult) it.next());
        }
    }

    public final void showLoadingView() {
        TaxWebAppLayoutBinding taxWebAppLayoutBinding = this.binding;
        ((MooncakeProgress) taxWebAppLayoutBinding.taxWebAppLoadingProgress).setVisibility(0);
        ((ConstraintLayout) taxWebAppLayoutBinding.taxWebAppLoadingView).setVisibility(0);
        MooncakeMediumText mooncakeMediumText = (MooncakeMediumText) taxWebAppLayoutBinding.taxWebAppErrorText;
        mooncakeMediumText.setText("");
        mooncakeMediumText.setVisibility(8);
    }
}
