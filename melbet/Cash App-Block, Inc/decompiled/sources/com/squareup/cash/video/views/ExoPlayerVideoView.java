package com.squareup.cash.video.views;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Slide;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.ui.Ui;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip$$ExternalSyntheticLambda0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.IconHelper;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.common.zzb;
import com.google.mlkit.vision.face.internal.zzm;
import com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda4;
import com.squareup.cash.R;
import com.squareup.cash.advertising.viewmodels.FullscreenAdEvent;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentRequest;
import com.squareup.cash.cashlynxflow.plasma.v1.UpdateDefaultInstrumentResponse;
import com.squareup.cash.cashlynxflow.service.v2.AppService;
import com.squareup.cash.cdf.InstrumentLinkFlowEntryPoint;
import com.squareup.cash.cdf.instrument.InstrumentLinkSetDefault;
import com.squareup.cash.cdf.mintstatus.MintStatusTimelineActionTapped;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationDelayComplete;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.ClearAppUserDataApplicationWorker;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.instruments.backend.api.InstrumentManager$UnlinkResult;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndIssuerLogoSpan;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsWarningsRepository;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter$models$2$1$WhenMappings;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.screens.InstrumentDetailsScreen;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import com.squareup.cash.ui.gcm.SuspendingFirebaseMessagingService;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidget;
import com.squareup.cash.wallet.screens.PresentationTimelineScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewEvent$TapButton;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewEvent;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileEvent$OnAppletTileClick;
import com.squareup.cash.work.data.api.DashboardScheduleState;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.screens.MerchantPickerBottomSheetScreen;
import com.squareup.cash.work.screens.ShiftListScreen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import com.squareup.cash.work.screens.WorkPayHomeScreen;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewEvent$Dismiss;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewEvent$CancelClicked;
import com.squareup.cash.work.viewmodels.TimecardDetailViewEvent;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent$PayCellViewEvent$DetailsClicked;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.TickerKt;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import com.stripe.android.challenge.passive.PassiveChallengeActivityResult;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerCompleted;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.exit.ExitState;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessState;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.success.SuccessState;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewEffect;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerArea;
import com.withpersona.sdk2.camera.CameraState;
import com.withpersona.sdk2.camera.ImageToAnalyzeKt;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoiceHelper;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepViewModel;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepViewModel;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2FragmentWorkflowBinding;
import com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment;
import com.withpersona.sdk2.inquiry.internal.state.CompleteStepModel;
import com.withpersona.sdk2.inquiry.internal.state.DocumentStepModel;
import com.withpersona.sdk2.inquiry.internal.state.DocumentStepRendering;
import com.withpersona.sdk2.inquiry.internal.state.DocumentStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.DocumentWorkflowRendering;
import com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepModel;
import com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepRendering;
import com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.GovernmentIdWorkflowRendering;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda17;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.internal.state.IntegrationStepModel;
import com.withpersona.sdk2.inquiry.internal.state.IntegrationStepRendering;
import com.withpersona.sdk2.inquiry.internal.state.IntegrationStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.IntegrationWorkflowRendering;
import com.withpersona.sdk2.inquiry.internal.state.IntermediateStepModel;
import com.withpersona.sdk2.inquiry.internal.state.LoadingRendering;
import com.withpersona.sdk2.inquiry.internal.state.LoadingStepModel;
import com.withpersona.sdk2.inquiry.internal.state.SelfieStepModel;
import com.withpersona.sdk2.inquiry.internal.state.SelfieStepRendering;
import com.withpersona.sdk2.inquiry.internal.state.SelfieStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.SelfieWorkflowRendering;
import com.withpersona.sdk2.inquiry.internal.state.StepRendering;
import com.withpersona.sdk2.inquiry.internal.state.UiStepModel;
import com.withpersona.sdk2.inquiry.internal.state.UiStepRendering;
import com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowModel;
import com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowRendering;
import com.withpersona.sdk2.inquiry.internal.state.WorkflowStepModel;
import com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieViewModel;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ControllerRequest$CancelRequest;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.Cache;
import okio.ByteString;
import papa.InputEventTrigger;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class ExoPlayerVideoView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Flow activityEvents;
    public final Set analyticsListeners;
    public final AspectRatioFrameLayout aspectContainerView;
    public int currentWindow;
    public boolean hasPreparedMedia;
    public boolean isMuted;
    public ExoPlayerVideoViewListener listener;
    public ProgressiveMediaSource mediaSource;
    public long playPosition;
    public ExoPlayer player;
    public int repeatMode;
    public final TextureView textureView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerVideoView(Context context, Flow flow) {
        super(context, null);
        context.getClass();
        this.activityEvents = flow;
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context, null);
        this.aspectContainerView = aspectRatioFrameLayout;
        TextureView textureView = new TextureView(context, null);
        this.textureView = textureView;
        this.isMuted = true;
        this.analyticsListeners = SetsKt__SetsKt.mutableSetOf(new AnalyticsListener() { // from class: com.squareup.cash.video.views.ExoPlayerVideoView$analyticsListeners$1
            public long bufferStartMillis = -1;

            @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
            public final void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format2) {
                format2.getClass();
                ExoPlayerVideoViewListener exoPlayerVideoViewListener = ExoPlayerVideoView.this.listener;
                if (exoPlayerVideoViewListener != null) {
                    Ui.EventReceiver eventReceiver = ((FullscreenAdView) ((zzb) exoPlayerVideoViewListener).zza).eventReceiver;
                    if (eventReceiver != null) {
                        eventReceiver.sendEvent(FullscreenAdEvent.HasAudioTrack.INSTANCE);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                }
            }

            @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
            public final void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException) {
                iOException.getClass();
                Timber.Forest forest = Timber.Forest;
                String asString = ExoPlayerExtensionsKt.asString(eventTime);
                Uri uri = loadEventInfo.uri;
                Uri uri2 = loadEventInfo.dataSpec.uri;
                long j = loadEventInfo.elapsedRealtimeMs;
                long j2 = loadEventInfo.loadDurationMs;
                long j3 = loadEventInfo.bytesLoaded;
                StringBuilder sb = new StringBuilder("(uri=");
                sb.append(uri);
                sb.append(", dataSpec=(uri=");
                sb.append(uri2);
                sb.append("), elapsedRealtimeMs=");
                sb.append(j);
                Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", loadDurationMs=", ", bytesLoaded=", sb);
                String m = CameraState$Type$EnumUnboxingLocalUtility.m(j3, ")", sb);
                forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error loading video. (eventTime=", asString, " loadEventInfo=", m, " mediaLoadData="), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(mediaLoadData.trackType, "(dataType=1, trackType=", ")"), ")"), new Object[0], iOException);
            }

            @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
            public final void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
                long j = eventTime.realtimeMs;
                if (i == 2) {
                    this.bufferStartMillis = j;
                    return;
                }
                long j2 = this.bufferStartMillis;
                if (j2 != -1) {
                    ExoPlayerVideoViewListener exoPlayerVideoViewListener = ExoPlayerVideoView.this.listener;
                    if (exoPlayerVideoViewListener != null) {
                        long j3 = j - j2;
                        Ui.EventReceiver eventReceiver = ((FullscreenAdView) ((zzb) exoPlayerVideoViewListener).zza).eventReceiver;
                        if (eventReceiver == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        eventReceiver.sendEvent(new FullscreenAdEvent.PlaybackBuffer(j3));
                    }
                    this.bufferStartMillis = -1L;
                }
            }

            @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
            public final void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
                playbackException.getClass();
                Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error playing video. (eventTime=", ExoPlayerExtensionsKt.asString(eventTime), ")"), new Object[0], playbackException);
            }
        });
        aspectRatioFrameLayout.addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(aspectRatioFrameLayout, layoutParams);
        ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new AnonymousClass2(this, null, 0));
    }

    public final void initializePlayer() {
        ExoPlayerImpl build = new ExoPlayer.Builder(getContext()).build();
        build.setPlayWhenReady(true);
        build.setRepeatMode(this.repeatMode);
        build.setVolume(this.isMuted ? RecyclerView.DECELERATION_RATE : 1.0f);
        build.seekTo(this.playPosition, this.currentWindow, false);
        build.setVideoTextureView(this.textureView);
        build.listeners.add(new Player.Listener() { // from class: com.squareup.cash.video.views.ExoPlayerVideoView$initializePlayer$1
            @Override // androidx.media3.common.Player.Listener
            public final void onVideoSizeChanged(VideoSize videoSize) {
                videoSize.getClass();
                ExoPlayerVideoView.this.aspectContainerView.setAspectRatio((videoSize.width * videoSize.pixelWidthHeightRatio) / videoSize.height);
            }
        });
        for (AnalyticsListener analyticsListener : this.analyticsListeners) {
            DefaultAnalyticsCollector defaultAnalyticsCollector = build.analyticsCollector;
            analyticsListener.getClass();
            defaultAnalyticsCollector.getClass();
            defaultAnalyticsCollector.listeners.add(analyticsListener);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            ((ExoPlayerImpl) exoPlayer).release();
        }
        this.player = build;
        ProgressiveMediaSource progressiveMediaSource = this.mediaSource;
        if (progressiveMediaSource != null) {
            build.verifyApplicationThread();
            List singletonList = Collections.singletonList(progressiveMediaSource);
            build.verifyApplicationThread();
            build.setMediaSources(singletonList);
            build.prepare();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        initializePlayer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        releasePlayer();
    }

    public final void releasePlayer() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) exoPlayer;
            this.playPosition = exoPlayerImpl.getCurrentPosition();
            this.currentWindow = exoPlayerImpl.getCurrentMediaItemIndex();
            exoPlayerImpl.release();
            for (AnalyticsListener analyticsListener : this.analyticsListeners) {
                exoPlayerImpl.verifyApplicationThread();
                DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
                analyticsListener.getClass();
                defaultAnalyticsCollector.listeners.remove(analyticsListener);
            }
            this.hasPreparedMedia = false;
            ExoPlayer exoPlayer2 = this.player;
            if (exoPlayer2 != null) {
                ((ExoPlayerImpl) exoPlayer2).release();
            }
            this.player = null;
        }
    }

    public final void setListener(ExoPlayerVideoViewListener exoPlayerVideoViewListener) {
        this.listener = exoPlayerVideoViewListener;
    }

    public final void setResizeMode(int i) {
        this.aspectContainerView.setResizeMode(i);
    }

    /* renamed from: com.squareup.cash.video.views.ExoPlayerVideoView$2, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Continuation continuation, int i) {
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
                    return new AnonymousClass2((ExoPlayerVideoView) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass2((TaxWebAppPresenter) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass2((RealThreeDsWarningsRepository) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass2((ThreeDsPresenter) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass2((InstrumentDetailsPresenter) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass2((InviteErrorPresenter) obj2, continuation, 5);
                case 6:
                    return new AnonymousClass2((ShareSheetPresenter) obj2, continuation, 6);
                case 7:
                    return new AnonymousClass2((PoolsListPresenter) obj2, continuation, 7);
                case 8:
                    return new AnonymousClass2((InviteErrorPresenter) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass2((SetDefaultInstrumentPresenter) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass2((WithdrawPresenter) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass2((HostActivityDataBridge) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass2((SuspendingFirebaseMessagingService) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass2((ClearAppUserDataApplicationWorker) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass2((MarkwonConfiguration) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass2((CardScene) obj2, continuation, 15);
                case 16:
                    return new AnonymousClass2((Flow) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass2((WorkHomePresenter) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass2((HCaptcha) obj2, continuation, 18);
                case 19:
                    return new AnonymousClass2((RealWagesTaxDocumentManager) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass2((SharedPreferencesKeyValue) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass2((IntentConfirmationChallengeActivity) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass2((DefaultFraudDetectionDataRepository) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass2((ExitViewModel) obj2, continuation, 23);
                case 24:
                    return new AnonymousClass2((ManualEntrySuccessViewModel) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass2((SuccessViewModel) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass2((FinancialConnectionsLiteViewModel) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass2((FinancialConnectionsSheetLiteActivity) obj2, continuation, 27);
                case 28:
                    return new AnonymousClass2((BottomSheetNavigator) obj2, continuation, 28);
                default:
                    return new AnonymousClass2((FinancialConnectionsViewModel) obj2, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 1:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 2:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 3:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 4:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 5:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 6:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 7:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 8:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 9:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 10:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 11:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 12:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 13:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 14:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 15:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 16:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 17:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 18:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 19:
                    return ((AnonymousClass2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 20:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 21:
                    ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 22:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 23:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 24:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 25:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 26:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                case 27:
                    ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
                case 28:
                    return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object first;
            Object unlink;
            Object updateDefaultInstrument;
            Object first2;
            Object value;
            Object value2;
            Object value3;
            int i = this.$r8$classId;
            int i2 = 0;
            int i3 = 2;
            int i4 = 12;
            Object obj2 = this.this$0;
            int i5 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ExoPlayerVideoView exoPlayerVideoView = (ExoPlayerVideoView) obj2;
                        Flow flow = exoPlayerVideoView.activityEvents;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(exoPlayerVideoView, i2);
                        this.label = 1;
                        if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider = ((TaxWebAppPresenter) obj2).taxEntryTileUserDataProvider;
                        this.label = 1;
                        if (realTaxEntryTileUserDataProvider.getEntryTileUserDataAndRefreshBadging(this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlowImpl stateFlowImpl = ((RealThreeDsWarningsRepository) obj2).warnings;
                        ChatInputView$Content$1$1$1 chatInputView$Content$1$1$1 = new ChatInputView$Content$1$1$1(i3, continuation);
                        this.label = 1;
                        first = FlowKt.first(stateFlowImpl, chatInputView$Content$1$1$1, this);
                        if (first == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                    }
                    first.getClass();
                    return first;
                case 3:
                    ThreeDsPresenter threeDsPresenter = (ThreeDsPresenter) obj2;
                    BlockersScreens.ThreeDsAuthenticationScreen threeDsAuthenticationScreen = threeDsPresenter.args;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Long l = threeDsAuthenticationScreen.minimumDelayMs;
                        l.getClass();
                        long longValue = l.longValue();
                        this.label = 1;
                        if (JobKt.delay(longValue, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    threeDsPresenter.spanTrackingService.onAction(ThreeDsSpanAction$EndIssuerLogoSpan.INSTANCE);
                    threeDsPresenter.analytics.track(new ThreeDsAuthenticationDelayComplete(threeDsAuthenticationScreen.blockersData.flowToken), null);
                    return Unit.INSTANCE;
                case 4:
                    InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator = instrumentDetailsPresenter.navigator;
                    AndroidStringManager androidStringManager = instrumentDetailsPresenter.stringManager;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) instrumentDetailsPresenter.instrumentManager;
                        String instrumentToken = ((InstrumentDetailsScreen) instrumentDetailsPresenter.args).getInstrumentToken();
                        ClientScenario clientScenario = ClientScenario.PROFILE;
                        this.label = 1;
                        unlink = realInstrumentManager.unlink(clientScenario, instrumentToken, this);
                        if (unlink == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        unlink = obj;
                    }
                    InstrumentManager$UnlinkResult instrumentManager$UnlinkResult = (InstrumentManager$UnlinkResult) unlink;
                    if (Intrinsics.areEqual(instrumentManager$UnlinkResult, InstrumentManager$UnlinkResult.Failure.INSTANCE)) {
                        screenNavigator.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(R.string.profile_error_message_update), androidStringManager.get(R.string.transfers_card_removal_generic_error_title), i4));
                    } else if (instrumentManager$UnlinkResult instanceof InstrumentManager$UnlinkResult.Ineligible) {
                        String str = ((InstrumentManager$UnlinkResult.Ineligible) instrumentManager$UnlinkResult).message;
                        Pair pair = str != null ? new Pair(androidStringManager.get(R.string.transfers_card_removal_ineligible_error_title), str) : new Pair(androidStringManager.get(R.string.transfers_card_removal_generic_error_title), androidStringManager.get(R.string.profile_error_message_update));
                        String str2 = (String) pair.first;
                        String str3 = (String) pair.second;
                        str3.getClass();
                        screenNavigator.goTo(new ProfileScreens.ErrorScreen(str3, str2, i4));
                    } else if (!Intrinsics.areEqual(instrumentManager$UnlinkResult, InstrumentManager$UnlinkResult.Success.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    return Unit.INSTANCE;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue = (KeyValue) ((InviteErrorPresenter) obj2).args;
                        Boolean bool = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue.set(bool, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (ShareSheetPresenter.access$continueTransfer((ShareSheetPresenter) obj2, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBalanceBasedAddCashManager realBalanceBasedAddCashManager = (RealBalanceBasedAddCashManager) ((PoolsListPresenter) obj2).sessionManager;
                        this.label = 1;
                        if (realBalanceBasedAddCashManager.disableOptimistically(this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Lazy lazy = (Lazy) ((InviteErrorPresenter) obj2).args;
                        this.label = 1;
                        if (lazy.goToLinkedAccountsScreen(this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    SetDefaultInstrumentPresenter setDefaultInstrumentPresenter = (SetDefaultInstrumentPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = setDefaultInstrumentPresenter.navigator;
                    SetDefaultInstrumentScreen setDefaultInstrumentScreen = (SetDefaultInstrumentScreen) setDefaultInstrumentPresenter.args;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Analytics analytics = (Analytics) setDefaultInstrumentPresenter.analytics;
                        String str4 = setDefaultInstrumentScreen.instrumentToken;
                        BlockersData blockersData = setDefaultInstrumentScreen.blockersData;
                        String str5 = blockersData.flowToken;
                        ClientScenario clientScenario2 = blockersData.clientScenario;
                        int i16 = clientScenario2 == null ? -1 : SetDefaultInstrumentPresenter$models$2$1$WhenMappings.$EnumSwitchMapping$0[clientScenario2.ordinal()];
                        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = i16 != 1 ? i16 != 2 ? null : InstrumentLinkFlowEntryPoint.TRANSFER_FUNDS : InstrumentLinkFlowEntryPoint.PROFILE;
                        str4.getClass();
                        analytics.track(new InstrumentLinkSetDefault(str5, str4, instrumentLinkFlowEntryPoint), null);
                        AppService appService = (AppService) setDefaultInstrumentPresenter.appService;
                        BlockersData blockersData2 = setDefaultInstrumentScreen.blockersData;
                        ClientScenario clientScenario3 = blockersData2.clientScenario;
                        String str6 = blockersData2.flowToken;
                        UpdateDefaultInstrumentRequest updateDefaultInstrumentRequest = new UpdateDefaultInstrumentRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), Boolean.valueOf(setDefaultInstrumentPresenter.useInstrumentCardArt), setDefaultInstrumentScreen.instrumentToken, ByteString.EMPTY);
                        this.label = 1;
                        updateDefaultInstrument = appService.updateDefaultInstrument(clientScenario3, str6, updateDefaultInstrumentRequest, this);
                        if (updateDefaultInstrument == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        updateDefaultInstrument = obj;
                    }
                    ApiResult apiResult = (ApiResult) updateDefaultInstrument;
                    if (apiResult instanceof ApiResult.Failure) {
                        screenNavigator2.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, setDefaultInstrumentScreen, setDefaultInstrumentPresenter.stringManager));
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) setDefaultInstrumentPresenter.blockersDataNavigator;
                        BlockersData blockersData3 = setDefaultInstrumentScreen.blockersData;
                        ResponseContext responseContext = ((UpdateDefaultInstrumentResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext.getClass();
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        screenNavigator2.goTo(blockersDataNavigator.getNext(setDefaultInstrumentScreen, blockersData3.updateFromResponseContext(responseContext, false)));
                    }
                    return Unit.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        WithdrawPresenter withdrawPresenter = (WithdrawPresenter) obj2;
                        n nVar = withdrawPresenter.transferActionProcessor;
                        WithdrawScreen withdrawScreen = withdrawPresenter.args;
                        BetterNavigator.ScreenNavigator screenNavigator3 = withdrawPresenter.navigator;
                        this.label = 1;
                        if (nVar.processActions(withdrawScreen, screenNavigator3, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((HostActivityDataBridge) obj2).delegateFlow, 24);
                    this.label = 1;
                    Object first3 = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                    return first3 == coroutineSingletons12 ? coroutineSingletons12 : first3;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (Unit.INSTANCE == coroutineSingletons13) {
                            return coroutineSingletons13;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CashQrWidget cashQrWidget = new CashQrWidget();
                        Application application = ((ClearAppUserDataApplicationWorker) obj2).context;
                        this.label = 1;
                        if (GlanceAppWidgetKt.updateAll(cashQrWidget, application, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (MarkwonConfiguration.access$refreshSpendingInsights((MarkwonConfiguration) obj2, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CardScene cardScene = (CardScene) obj2;
                        if (cardScene != null) {
                            this.label = 1;
                            first2 = FlowKt.first(cardScene._copyPanTextureReady, new SessionWorkerKt$runSession$5(i3, continuation, i5), this);
                            if (first2 == coroutineSingletons16) {
                                return coroutineSingletons16;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first2 = obj;
                    return Unit.INSTANCE;
                case 16:
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        Object first4 = FlowKt.first((Flow) obj2, this);
                        return first4 == coroutineSingletons17 ? coroutineSingletons17 : first4;
                    }
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                case 17:
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (WorkHomePresenter.access$downloadAndNavigate((WorkHomePresenter) obj2, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    HCaptcha hCaptcha = (HCaptcha) obj2;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) hCaptcha.exception;
                        this.label = 1;
                        if (realClockInEssentialsProvider.refresh(this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (!(((StateFlow) ((RealDashboardScheduleProvider) hCaptcha.onSuccessListeners).upcomingSchedules$delegate.getValue()).getValue() instanceof DashboardScheduleState.Loading)) {
                        StateFlowImpl stateFlowImpl2 = ((RealDashboardScheduleProvider) hCaptcha.onSuccessListeners).refreshTrigger;
                        stateFlowImpl2.updateState(null, Integer.valueOf(((Number) stateFlowImpl2.getValue()).intValue() + 1));
                    }
                    return Unit.INSTANCE;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (RealWagesTaxDocumentManager.access$ensureMerchantRepositoryInitialized((RealWagesTaxDocumentManager) obj2, this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (((SharedPreferencesKeyValue) obj2).delete(this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) obj2;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 != 0) {
                        if (i28 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    int i29 = IntentConfirmationChallengeActivity.$r8$clinit;
                    SharedFlowImpl sharedFlowImpl = intentConfirmationChallengeActivity.getViewModel().result;
                    PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1(intentConfirmationChallengeActivity, 7);
                    this.label = 1;
                    sharedFlowImpl.collect(paymentPasscodeActivity$loadView$3$1, this);
                    return coroutineSingletons22;
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = (DefaultFraudDetectionDataRepository) obj2;
                        this.label = 1;
                        if (JobKt.withContext(defaultFraudDetectionDataRepository.workContext, new WorkerWorkflow$render$1(defaultFraudDetectionDataRepository, continuation, 21), this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 23:
                    ExitViewModel exitViewModel = (ExitViewModel) obj2;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsSessionManifest.Pane pane = ExitViewModel.PANE;
                        exitViewModel.getClass();
                        StateFlowImpl stateFlowImpl3 = exitViewModel._stateFlow;
                        do {
                            value = stateFlowImpl3.getValue();
                        } while (!stateFlowImpl3.compareAndSet(value, ExitState.copy$default((ExitState) value, null, 3)));
                        SharedFlowImpl sharedFlowImpl2 = exitViewModel.coordinator.flow;
                        NativeAuthFlowCoordinator.Message.Complete complete = new NativeAuthFlowCoordinator.Message.Complete(null);
                        this.label = 1;
                        if (sharedFlowImpl2.emit(complete, this) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 24:
                    ManualEntrySuccessViewModel manualEntrySuccessViewModel = (ManualEntrySuccessViewModel) obj2;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        manualEntrySuccessViewModel.getClass();
                        StateFlowImpl stateFlowImpl4 = manualEntrySuccessViewModel._stateFlow;
                        do {
                            value2 = stateFlowImpl4.getValue();
                        } while (!stateFlowImpl4.compareAndSet(value2, ManualEntrySuccessState.copy$default((ManualEntrySuccessState) value2, null, new Async.Loading(null), 1)));
                        manualEntrySuccessViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, 12));
                        SharedFlowImpl sharedFlowImpl3 = manualEntrySuccessViewModel.nativeAuthFlowCoordinator.flow;
                        NativeAuthFlowCoordinator.Message.Complete complete2 = new NativeAuthFlowCoordinator.Message.Complete(null);
                        this.label = 1;
                        if (sharedFlowImpl3.emit(complete2, this) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 25:
                    SuccessViewModel successViewModel = (SuccessViewModel) obj2;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        successViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(SuccessViewModel.PANE, 12));
                        StateFlowImpl stateFlowImpl5 = successViewModel._stateFlow;
                        do {
                            value3 = stateFlowImpl5.getValue();
                        } while (!stateFlowImpl5.compareAndSet(value3, SuccessState.copy$default((SuccessState) value3, null, new Async.Loading(null), 1)));
                        this.label = 1;
                        Object emit = successViewModel.nativeAuthFlowCoordinator.flow.emit(new NativeAuthFlowCoordinator.Message.Complete(null), this);
                        if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            emit = Unit.INSTANCE;
                        }
                        if (emit == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl4 = ((FinancialConnectionsLiteViewModel) obj2)._viewEffects;
                        FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult finishWithResult = new FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult(FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
                        this.label = 1;
                        if (sharedFlowImpl4.emit(finishWithResult, this) == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) obj2;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int i36 = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                        ReadonlySharedFlow readonlySharedFlow = ((FinancialConnectionsLiteViewModel) financialConnectionsSheetLiteActivity.viewModel$delegate.getValue()).viewEffects;
                        AnonymousClass1 anonymousClass12 = new AnonymousClass1(financialConnectionsSheetLiteActivity, 14);
                        this.label = 1;
                        if (readonlySharedFlow.$$delegate_0.collect(anonymousClass12, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        if (i35 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 28:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    if (i37 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ModalBottomSheetState modalBottomSheetState = ((BottomSheetNavigator) obj2).sheetState;
                        this.label = 1;
                        if (modalBottomSheetState.show(this) == coroutineSingletons29) {
                            return coroutineSingletons29;
                        }
                    } else {
                        if (i37 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = this.label;
                    if (i38 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinancialConnectionsViewModel financialConnectionsViewModel = (FinancialConnectionsViewModel) obj2;
                        ReadonlyStateFlow readonlyStateFlow = financialConnectionsViewModel.stateFlow;
                        PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$12 = new PaymentPasscodeActivity$loadView$3$1(financialConnectionsViewModel, 8);
                        this.label = 1;
                        if (readonlyStateFlow.$$delegate_0.collect(paymentPasscodeActivity$loadView$3$12, this) == coroutineSingletons30) {
                            return coroutineSingletons30;
                        }
                    } else {
                        if (i38 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
            }
        }

        /* renamed from: com.squareup.cash.video.views.ExoPlayerVideoView$2$1, reason: invalid class name */
        /* loaded from: classes9.dex */
        public final class AnonymousClass1 implements FlowCollector {
            public final /* synthetic */ int $r8$classId;
            public final /* synthetic */ Object this$0;

            public /* synthetic */ AnonymousClass1(Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Object value;
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState;
                File newRandomSessionFile;
                Object access$handleState;
                StepRendering stepRendering;
                DocumentStepFragment documentStepFragment;
                SelfieStepFragment selfieStepFragment;
                GovernmentIdStepFragment governmentIdStepFragment;
                IntegrationStepFragment integrationStepFragment;
                UiStepFragment uiStepFragment;
                StateFlowImpl stateFlowImpl;
                switch (this.$r8$classId) {
                    case 0:
                        ExoPlayerVideoView exoPlayerVideoView = (ExoPlayerVideoView) this.this$0;
                        int ordinal = ((ActivityEvent) obj).ordinal();
                        if (ordinal == 1) {
                            int i = ExoPlayerVideoView.$r8$clinit;
                            exoPlayerVideoView.initializePlayer();
                        } else if (ordinal != 2) {
                            if (ordinal == 4) {
                                int i2 = ExoPlayerVideoView.$r8$clinit;
                                exoPlayerVideoView.releasePlayer();
                            }
                        } else if (exoPlayerVideoView.player == null) {
                            exoPlayerVideoView.initializePlayer();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Object updateAll = GlanceAppWidgetKt.updateAll(new CashQrWidget(), ((ClearAppUserDataApplicationWorker) this.this$0).context, continuation);
                        return updateAll == CoroutineSingletons.COROUTINE_SUSPENDED ? updateAll : Unit.INSTANCE;
                    case 2:
                        CardControlDialogViewEvent$TapButton cardControlDialogViewEvent$TapButton = (CardControlDialogViewEvent$TapButton) obj;
                        if (cardControlDialogViewEvent$TapButton != null) {
                            ((ErrorPresenter) this.this$0).navigator.goTo(new Finish(cardControlDialogViewEvent$TapButton.result));
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 3:
                        TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) this.this$0;
                        PresentationTimelineViewEvent presentationTimelineViewEvent = (PresentationTimelineViewEvent) obj;
                        if (presentationTimelineViewEvent instanceof PresentationTimelineViewEvent.ActionClicked) {
                            Analytics analytics = (Analytics) taxReturnsPresenter.args;
                            PresentationTimelineViewModel presentationTimelineViewModel = ((PresentationTimelineScreen) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider).viewModel;
                            String str = presentationTimelineViewModel.themeToken;
                            String str2 = presentationTimelineViewModel.deviceId;
                            PresentationAction presentationAction = ((PresentationTimelineViewEvent.ActionClicked) presentationTimelineViewEvent).action;
                            analytics.track(new MintStatusTimelineActionTapped(str, str2, presentationAction.label), null);
                            ((RealRouter) taxReturnsPresenter.router).route(new RoutingParams(new WalletHomeScreen(7, (Integer) null, (String) null), null, null, null, null, null, 510), presentationAction.clientRouteUrl);
                        } else {
                            if (!Intrinsics.areEqual(presentationTimelineViewEvent, PresentationTimelineViewEvent.Dismiss.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ((BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator).goTo(Back.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        Pair pair = (Pair) obj;
                        ((CardScene) this.this$0).updateTransform((Quat) pair.first, (Vector4) pair.second);
                        return Unit.INSTANCE;
                    case 5:
                        ((Boolean) obj).getClass();
                        Object animateScrollTo$default = ScrollState.animateScrollTo$default((ScrollState) this.this$0, 0, continuation);
                        return animateScrollTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? animateScrollTo$default : Unit.INSTANCE;
                    case 6:
                        if (Intrinsics.areEqual((WorkAppletTileEvent$OnAppletTileClick) obj, WorkAppletTileEvent$OnAppletTileClick.INSTANCE)) {
                            ((Navigator) ((TaxReturnsPresenter) this.this$0).taxesDocumentsTaxReturnsDataProvider).goTo(WorkHomeScreen.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 7:
                        UnleashContext unleashContext = (UnleashContext) this.this$0;
                        WorkHomeViewEvent.TitleBarViewEvent titleBarViewEvent = (WorkHomeViewEvent.TitleBarViewEvent) obj;
                        if (Intrinsics.areEqual(titleBarViewEvent, WorkHomeViewEvent.TitleBarViewEvent.GoBack.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) unleashContext.userId).goTo(Back.INSTANCE);
                        } else if (Intrinsics.areEqual(titleBarViewEvent, WorkHomeViewEvent.TitleBarViewEvent.ShowMerchantPicker.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) unleashContext.userId).goTo(MerchantPickerBottomSheetScreen.INSTANCE);
                        } else {
                            if (!Intrinsics.areEqual(titleBarViewEvent, WorkHomeViewEvent.TitleBarViewEvent.ShowShiftList.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            ((BetterNavigator.ScreenNavigator) unleashContext.userId).goTo(ShiftListScreen.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    case 8:
                        if (Intrinsics.areEqual((WorkHomeViewEvent$PayCellViewEvent$DetailsClicked) obj, WorkHomeViewEvent$PayCellViewEvent$DetailsClicked.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) ((TextSetter) this.this$0).textView).goTo(WorkPayHomeScreen.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 9:
                        if (Intrinsics.areEqual((TaxFormDownloaderViewEvent$CancelClicked) obj, TaxFormDownloaderViewEvent$CancelClicked.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) ((WorkHomePresenter) this.this$0).shiftSection2Presenter).goTo(Back.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 10:
                        if (Intrinsics.areEqual((ShiftNotStartedDialogViewEvent$Dismiss) obj, ShiftNotStartedDialogViewEvent$Dismiss.INSTANCE)) {
                            ((BetterNavigator.ScreenNavigator) ((WorkHomePresenter) this.this$0).titleBarPresenter).goTo(Back.INSTANCE);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 11:
                        TimecardDetailViewEvent timecardDetailViewEvent = (TimecardDetailViewEvent) obj;
                        if (Intrinsics.areEqual(timecardDetailViewEvent, TimecardDetailViewEvent.BackClicked.INSTANCE)) {
                            ((AddAliasPresenter) this.this$0).navigator.goTo(Back.INSTANCE);
                        } else if (!Intrinsics.areEqual(timecardDetailViewEvent, TimecardDetailViewEvent.EditClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return Unit.INSTANCE;
                    case 12:
                        PassiveChallengeActivity passiveChallengeActivity = (PassiveChallengeActivity) this.this$0;
                        int i3 = PassiveChallengeActivity.$r8$clinit;
                        passiveChallengeActivity.setResult(4638, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.challenge.PassiveChallengeActivityContract.extra_result", (PassiveChallengeActivityResult) obj))));
                        passiveChallengeActivity.finish();
                        return Unit.INSTANCE;
                    case 13:
                        PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = (PassiveChallengeWarmerActivity) this.this$0;
                        int i4 = PassiveChallengeWarmerActivity.$r8$clinit;
                        passiveChallengeWarmerActivity.setResult(4639, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.challenge.warmer.activity.PassiveChallengeWarmerContract.extra_result", (PassiveChallengeWarmerCompleted) obj))));
                        passiveChallengeWarmerActivity.finish();
                        return Unit.INSTANCE;
                    case 14:
                        FinancialConnectionsLiteViewModel.ViewEffect viewEffect = (FinancialConnectionsLiteViewModel.ViewEffect) obj;
                        FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.this$0;
                        if (viewEffect instanceof FinancialConnectionsLiteViewModel.ViewEffect.OpenAuthFlowWithUrl) {
                            WebView webView = financialConnectionsSheetLiteActivity.webView;
                            if (webView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("webView");
                                throw null;
                            }
                            webView.loadUrl(((FinancialConnectionsLiteViewModel.ViewEffect.OpenAuthFlowWithUrl) viewEffect).url);
                        } else if (viewEffect instanceof FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult) {
                            FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult = ((FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult) viewEffect).result;
                            int i5 = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                            financialConnectionsSheetLiteActivity.setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result", financialConnectionsSheetActivityResult))));
                            financialConnectionsSheetLiteActivity.finish();
                        } else {
                            if (!(viewEffect instanceof FinancialConnectionsLiteViewModel.ViewEffect.OpenCustomTab)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            String str3 = ((FinancialConnectionsLiteViewModel.ViewEffect.OpenCustomTab) viewEffect).url;
                            int i6 = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                            try {
                                zzm zzmVar = new zzm();
                                Intent intent = (Intent) zzmVar.zzb;
                                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                zzmVar.setShareState(2);
                                intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
                                Recorder.AnonymousClass1 build = zzmVar.build();
                                String packageName = InputEventTrigger.Companion.getPackageName(financialConnectionsSheetLiteActivity);
                                if (packageName != null) {
                                    ((Intent) build.val$videoEncoderSession).setPackage(packageName);
                                }
                                build.launchUrl(financialConnectionsSheetLiteActivity, Uri.parse(str3));
                            } catch (ActivityNotFoundException unused) {
                                financialConnectionsSheetLiteActivity.finish();
                            } catch (SecurityException unused2) {
                                financialConnectionsSheetLiteActivity.finish();
                            }
                        }
                        return Unit.INSTANCE;
                    case 15:
                        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect = (FinancialConnectionsSheetNativeViewEffect) obj;
                        FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) this.this$0;
                        if (financialConnectionsSheetNativeViewEffect instanceof FinancialConnectionsSheetNativeViewEffect.OpenUrl) {
                            try {
                                RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = financialConnectionsSheetNativeActivity.browserManager;
                                if (realStandardIntegrityManagerFactory == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("browserManager");
                                    throw null;
                                }
                                Uri parse = Uri.parse(((FinancialConnectionsSheetNativeViewEffect.OpenUrl) financialConnectionsSheetNativeViewEffect).url);
                                parse.getClass();
                                financialConnectionsSheetNativeActivity.startActivity(realStandardIntegrityManagerFactory.createBrowserIntentForUrl(parse));
                            } catch (ActivityNotFoundException | SecurityException unused3) {
                            }
                        } else {
                            if (!(financialConnectionsSheetNativeViewEffect instanceof FinancialConnectionsSheetNativeViewEffect.Finish)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            financialConnectionsSheetNativeActivity.setResult(-1, new Intent().putExtra("result", ((FinancialConnectionsSheetNativeViewEffect.Finish) financialConnectionsSheetNativeViewEffect).result));
                            financialConnectionsSheetNativeActivity.finish();
                        }
                        StateFlowImpl stateFlowImpl2 = financialConnectionsSheetNativeActivity.getViewModel()._stateFlow;
                        do {
                            value = stateFlowImpl2.getValue();
                            financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) value;
                            financialConnectionsSheetNativeState.getClass();
                        } while (!stateFlowImpl2.compareAndSet(value, FinancialConnectionsSheetNativeState.copy$default(financialConnectionsSheetNativeState, null, null, null, 16319)));
                        return Unit.INSTANCE;
                    case 16:
                        GooglePayLauncher$Result googlePayLauncher$Result = (GooglePayLauncher$Result) obj;
                        if (googlePayLauncher$Result != null) {
                            GooglePayLauncherActivity googlePayLauncherActivity = (GooglePayLauncherActivity) this.this$0;
                            int i7 = GooglePayLauncherActivity.$r8$clinit;
                            googlePayLauncherActivity.finishWithResult(googlePayLauncher$Result);
                        }
                        return Unit.INSTANCE;
                    case 17:
                        GooglePayPaymentMethodLauncher$Result googlePayPaymentMethodLauncher$Result = (GooglePayPaymentMethodLauncher$Result) obj;
                        if (googlePayPaymentMethodLauncher$Result != null) {
                            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.this$0;
                            int i8 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                            googlePayPaymentMethodLauncherActivity.finishWithResult(googlePayPaymentMethodLauncher$Result);
                        }
                        return Unit.INSTANCE;
                    case 18:
                        CollectBankAccountViewEffect collectBankAccountViewEffect = (CollectBankAccountViewEffect) obj;
                        CollectBankAccountActivity collectBankAccountActivity = (CollectBankAccountActivity) this.this$0;
                        if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.OpenConnectionsFlow) {
                            CollectBankAccountViewEffect.OpenConnectionsFlow openConnectionsFlow = (CollectBankAccountViewEffect.OpenConnectionsFlow) collectBankAccountViewEffect;
                            FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher = collectBankAccountActivity.financialConnectionsLauncher;
                            if (financialConnectionsSheetLauncher == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("financialConnectionsLauncher");
                                throw null;
                            }
                            financialConnectionsSheetLauncher.present(new FinancialConnectionsSheetConfiguration(openConnectionsFlow.financialConnectionsSessionSecret, openConnectionsFlow.publishableKey, openConnectionsFlow.stripeAccountId), openConnectionsFlow.elementsSessionContext);
                        } else {
                            if (!(collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.FinishWithResult)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            int i9 = CollectBankAccountActivity.$r8$clinit;
                            collectBankAccountActivity.setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", new CollectBankAccountContract.Result(((CollectBankAccountViewEffect.FinishWithResult) collectBankAccountViewEffect).result)))));
                            collectBankAccountActivity.finish();
                        }
                        return Unit.INSTANCE;
                    case 19:
                        InternalPaymentResult internalPaymentResult = (InternalPaymentResult) obj;
                        if (internalPaymentResult != null) {
                            PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = (PaymentLauncherConfirmationActivity) this.this$0;
                            int i10 = PaymentLauncherConfirmationActivity.$r8$clinit;
                            paymentLauncherConfirmationActivity.finishWithResult(internalPaymentResult);
                        }
                        return Unit.INSTANCE;
                    case 20:
                        if (((Boolean) obj).booleanValue()) {
                            PaymentAuthWebViewActivity paymentAuthWebViewActivity = (PaymentAuthWebViewActivity) this.this$0;
                            int i11 = PaymentAuthWebViewActivity.$r8$clinit;
                            paymentAuthWebViewActivity.getViewBinding().progressBar.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    case 21:
                        Rect rect = (Rect) obj;
                        ShimmerArea shimmerArea = (ShimmerArea) this.this$0;
                        if (!Intrinsics.areEqual(shimmerArea.requestedShimmerBounds, rect)) {
                            shimmerArea.requestedShimmerBounds = rect;
                            shimmerArea.computeShimmerBounds();
                        }
                        return Unit.INSTANCE;
                    case 22:
                        Camera2Manager.State state = (Camera2Manager.State) obj;
                        Camera2Controller camera2Controller = (Camera2Controller) this.this$0;
                        StateFlowImpl stateFlowImpl3 = (StateFlowImpl) camera2Controller._previewState;
                        if (!Intrinsics.areEqual(state, Camera2Manager.State.Created.INSTANCE)) {
                            if (Intrinsics.areEqual(state, Camera2Manager.State.Started.INSTANCE)) {
                                CameraState.Error error = CameraState.Error.INSTANCE$3;
                                stateFlowImpl3.getClass();
                                stateFlowImpl3.updateState(null, error);
                            } else if (Intrinsics.areEqual(state, Camera2Manager.State.Destroyed.INSTANCE)) {
                                CameraState.Closed closed = new CameraState.Closed(camera2Controller.recordingOngoing, false);
                                stateFlowImpl3.getClass();
                                stateFlowImpl3.updateState(null, closed);
                                camera2Controller.currentManager = ((Camera2ManagerFactory) camera2Controller.camera2ManagerFactory).newInstance();
                                camera2Controller.recordingOngoing = false;
                            } else {
                                if (!(state instanceof Camera2Manager.State.Error)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Camera2Manager.Error error2 = ((Camera2Manager.State.Error) state).error;
                                if (error2 instanceof Camera2Manager.Error.InitializationError) {
                                    Camera2Controller.access$tryNextCameraChoice(camera2Controller);
                                } else if (error2 instanceof Camera2Manager.Error.ImageWidthStrideMismatch) {
                                    CameraChoiceHelper cameraChoiceHelper = (CameraChoiceHelper) camera2Controller.cameraChoiceHelper;
                                    CameraChoice cameraChoice = ((Camera2Manager) camera2Controller.currentManager).cameraChoice;
                                    cameraChoiceHelper.getClass();
                                    cameraChoice.getClass();
                                    cameraChoiceHelper.badCameraChoices = CollectionsKt.plus((Collection) cameraChoiceHelper.badCameraChoices, (Object) cameraChoice);
                                    Camera2Controller.access$tryNextCameraChoice(camera2Controller);
                                } else {
                                    if (!(error2 instanceof Camera2Manager.Error.MissingPermissionsCameraError)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    CameraState.Error error3 = CameraState.Error.INSTANCE$1;
                                    stateFlowImpl3.getClass();
                                    stateFlowImpl3.updateState(null, error3);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 23:
                        Image image = (Image) obj;
                        Camera2Manager camera2Manager = (Camera2Manager) this.this$0;
                        try {
                            try {
                                if (Intrinsics.areEqual(camera2Manager._state.getValue(), Camera2Manager.State.Destroyed.INSTANCE)) {
                                    camera2Manager.processImageHaltedCv.open();
                                    Cache.Companion.closeFinally(image, null);
                                } else if (camera2Manager.isAnalyzerEnabled || camera2Manager.isImageCaptureRequested) {
                                    if (camera2Manager.isImageCaptureRequested) {
                                        Bitmap bitmap = ImageToAnalyzeKt.toBitmap(image, camera2Manager.orientation, null);
                                        if (bitmap == null) {
                                            newRandomSessionFile = null;
                                        } else {
                                            newRandomSessionFile = camera2Manager.sdkFilesManager.newRandomSessionFile("jpg");
                                            FileOutputStream fileOutputStream = new FileOutputStream(newRandomSessionFile);
                                            try {
                                                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                                                fileOutputStream.close();
                                                bitmap.recycle();
                                            } finally {
                                            }
                                        }
                                        if (newRandomSessionFile != null) {
                                            StateFlowImpl stateFlowImpl4 = camera2Manager.imageCaptureResult;
                                            Result result = new Result(newRandomSessionFile);
                                            stateFlowImpl4.getClass();
                                            stateFlowImpl4.updateState(null, result);
                                        }
                                    } else if (camera2Manager.isAnalyzerEnabled) {
                                        try {
                                            camera2Manager.analyzer.analyze(image, camera2Manager.orientation);
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    Cache.Companion.closeFinally(image, null);
                                } else {
                                    Cache.Companion.closeFinally(image, null);
                                }
                            } finally {
                            }
                        } catch (IllegalArgumentException unused5) {
                        }
                        return Unit.INSTANCE;
                    case 24:
                        DocumentWorkflow.Input input = (DocumentWorkflow.Input) obj;
                        DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) this.this$0;
                        DocumentWorkflow.State state2 = (DocumentWorkflow.State) ((SubtreeManager) documentStepStateManager.lastChild).getState();
                        if (state2 == null) {
                            return Unit.INSTANCE;
                        }
                        DocumentStepStateManager.access$handleState(documentStepStateManager, input, state2);
                        return Unit.INSTANCE;
                    case 25:
                        GovernmentIdWorkflow.Input input2 = (GovernmentIdWorkflow.Input) obj;
                        GovernmentIdStepStateManager governmentIdStepStateManager = (GovernmentIdStepStateManager) this.this$0;
                        GovernmentIdState governmentIdState = (GovernmentIdState) ((SubtreeManager) governmentIdStepStateManager.lastChild).getState();
                        return (governmentIdState != null && (access$handleState = GovernmentIdStepStateManager.access$handleState(governmentIdStepStateManager, input2, governmentIdState, continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? access$handleState : Unit.INSTANCE;
                    case 26:
                        IntegrationWorkflow.Input input3 = (IntegrationWorkflow.Input) obj;
                        IntegrationStepStateManager integrationStepStateManager = (IntegrationStepStateManager) this.this$0;
                        IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting = (IntegrationWorkflow$State$Starting) ((SubtreeManager) integrationStepStateManager.lastChild).getState();
                        if (integrationWorkflow$State$Starting == null) {
                            return Unit.INSTANCE;
                        }
                        integrationStepStateManager.handleState(input3, integrationWorkflow$State$Starting);
                        return Unit.INSTANCE;
                    case 27:
                        ControllerRequest$CancelRequest controllerRequest$CancelRequest = (ControllerRequest$CancelRequest) obj;
                        if (controllerRequest$CancelRequest != null) {
                            InquiryStateManager.handleState$onCancel((InquiryStateManager) this.this$0, true, controllerRequest$CancelRequest.skipBackendCall);
                            return Unit.INSTANCE;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 28:
                        if (obj == null) {
                            return Unit.INSTANCE;
                        }
                        ((StateFlowImpl) this.this$0).updateState(null, obj);
                        Unit unit = Unit.INSTANCE;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return unit;
                    default:
                        IntermediateStepModel intermediateStepModel = (IntermediateStepModel) obj;
                        InquiryWorkflowFragment inquiryWorkflowFragment = (InquiryWorkflowFragment) this.this$0;
                        final TextSetter textSetter = inquiryWorkflowFragment.inquiryStateRenderer;
                        if (textSetter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("inquiryStateRenderer");
                            throw null;
                        }
                        ViewBinding viewBinding = inquiryWorkflowFragment._binding;
                        viewBinding.getClass();
                        Pi2FragmentWorkflowBinding pi2FragmentWorkflowBinding = (Pi2FragmentWorkflowBinding) viewBinding;
                        FloatingActionButton floatingActionButton = pi2FragmentWorkflowBinding.floatingActionButton;
                        FragmentManager childFragmentManager = inquiryWorkflowFragment.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (intermediateStepModel != null) {
                            if (((SandboxFlags) textSetter.textView).isSandboxModeEnabled) {
                                final Context context = pi2FragmentWorkflowBinding.rootView.getContext();
                                floatingActionButton.setVisibility(0);
                                floatingActionButton.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(6, textSetter, pi2FragmentWorkflowBinding));
                                floatingActionButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.withpersona.sdk2.inquiry.internal.state.InquiryStateRenderer$$ExternalSyntheticLambda1
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        Context context2 = context;
                                        context2.getClass();
                                        TextSetter textSetter2 = TextSetter.this;
                                        if (((Dialog) textSetter2.textSwitcher) == null) {
                                            Dialog dialog = new Dialog(context2, R.style.Theme_Material3_DayNight_Dialog_Alert);
                                            boolean z = false;
                                            View inflate = LayoutInflater.from(dialog.getContext()).inflate(R.layout.pi2_sandbox_options_dialog, (ViewGroup) null, false);
                                            int i12 = R.id.gov_id_nfc_switch;
                                            MaterialSwitch materialSwitch = (MaterialSwitch) ViewBindings.findChildViewById(inflate, R.id.gov_id_nfc_switch);
                                            if (materialSwitch != null) {
                                                i12 = R.id.toolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar);
                                                if (materialToolbar != null) {
                                                    dialog.setContentView((ConstraintLayout) inflate);
                                                    materialToolbar.setTitle("Sandbox options");
                                                    materialToolbar.setNavigationIcon(R.drawable.pi2_shared_close_icon);
                                                    materialToolbar.setNavigationOnClickListener(new ChatView$$ExternalSyntheticLambda28(dialog, 23));
                                                    SandboxFlags sandboxFlags = (SandboxFlags) textSetter2.textView;
                                                    if (sandboxFlags.isSandboxModeEnabled && sandboxFlags.simulateGovIdNfc) {
                                                        z = true;
                                                    }
                                                    materialSwitch.setChecked(z);
                                                    materialSwitch.setOnCheckedChangeListener(new Chip$$ExternalSyntheticLambda0(textSetter2, 7));
                                                    Window window = dialog.getWindow();
                                                    if (window != null) {
                                                        window.setBackgroundDrawable(null);
                                                    }
                                                    dialog.setOnDismissListener(new HelpFragment$$ExternalSyntheticLambda4(textSetter2, 5));
                                                    textSetter2.textSwitcher = dialog;
                                                    dialog.show();
                                                }
                                            }
                                            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
                                            return false;
                                        }
                                        return true;
                                    }
                                });
                                InsetsUtilsKt.onInsetsChanged(floatingActionButton, new HCaptcha$$ExternalSyntheticLambda2(pi2FragmentWorkflowBinding, 26));
                            } else {
                                floatingActionButton.setVisibility(8);
                            }
                            StepRendering stepRendering2 = (StepRendering) textSetter.scannerText;
                            if (Intrinsics.areEqual(stepRendering2 != null ? stepRendering2.getName() : null, intermediateStepModel.getName())) {
                                stepRendering = (StepRendering) textSetter.scannerText;
                            } else {
                                int id = pi2FragmentWorkflowBinding.fragmentContainerView.getId();
                                if (intermediateStepModel instanceof WorkflowStepModel) {
                                    WorkflowStepModel workflowStepModel = (WorkflowStepModel) intermediateStepModel;
                                    String name = workflowStepModel.getName();
                                    boolean didGoBack = workflowStepModel.getDidGoBack();
                                    Fragment findFragmentById = childFragmentManager.findFragmentById(id);
                                    Fragment workflowStepFragment = ((findFragmentById instanceof WorkflowStepFragment) && Intrinsics.areEqual(findFragmentById.getTag(), name)) ? findFragmentById : new WorkflowStepFragment();
                                    if (didGoBack) {
                                        if (findFragmentById != null) {
                                            Slide slide = new Slide(8388613);
                                            slide.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById.setExitTransition(slide);
                                        }
                                        Slide slide2 = new Slide(8388611);
                                        slide2.mInterpolator = new DecelerateInterpolator();
                                        workflowStepFragment.setEnterTransition(slide2);
                                    } else {
                                        if (findFragmentById != null) {
                                            Slide slide3 = new Slide(8388611);
                                            slide3.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById.setExitTransition(slide3);
                                        }
                                        Slide slide4 = new Slide(8388613);
                                        slide4.mInterpolator = new DecelerateInterpolator();
                                        workflowStepFragment.setEnterTransition(slide4);
                                    }
                                    BackStackRecord backStackRecord = new BackStackRecord(childFragmentManager);
                                    backStackRecord.replace(id, name, workflowStepFragment);
                                    backStackRecord.commitNowAllowingStateLoss();
                                    WorkflowStepFragment workflowStepFragment2 = (WorkflowStepFragment) workflowStepFragment;
                                    workflowStepFragment2.initialize$inquiry_internal_release(workflowStepModel);
                                    if (workflowStepModel instanceof DocumentStepWorkflowModel) {
                                        stepRendering = new DocumentWorkflowRendering(((DocumentStepWorkflowModel) intermediateStepModel).key, workflowStepFragment2);
                                    } else if (workflowStepModel instanceof GovernmentIdStepWorkflowModel) {
                                        stepRendering = new GovernmentIdWorkflowRendering(((GovernmentIdStepWorkflowModel) intermediateStepModel).key, workflowStepFragment2);
                                    } else if (workflowStepModel instanceof IntegrationStepWorkflowModel) {
                                        stepRendering = new IntegrationWorkflowRendering(((IntegrationStepWorkflowModel) intermediateStepModel).key, workflowStepFragment2);
                                    } else if (workflowStepModel instanceof SelfieStepWorkflowModel) {
                                        stepRendering = new SelfieWorkflowRendering(((SelfieStepWorkflowModel) intermediateStepModel).key, workflowStepFragment2);
                                    } else {
                                        if (!(workflowStepModel instanceof UiStepWorkflowModel)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        stepRendering = new UiStepWorkflowRendering(((UiStepWorkflowModel) intermediateStepModel).key, workflowStepFragment2);
                                    }
                                } else if (intermediateStepModel instanceof LoadingStepModel) {
                                    LoadingFragment loadingFragment = new LoadingFragment();
                                    BackStackRecord backStackRecord2 = new BackStackRecord(childFragmentManager);
                                    backStackRecord2.replace(id, null, loadingFragment);
                                    backStackRecord2.commitInternal(true, true);
                                    stepRendering = new LoadingRendering(loadingFragment);
                                } else if (intermediateStepModel instanceof UiStepModel) {
                                    UiStepModel uiStepModel = (UiStepModel) intermediateStepModel;
                                    String str4 = uiStepModel.key;
                                    boolean z = uiStepModel.didGoBack;
                                    Fragment findFragmentById2 = childFragmentManager.findFragmentById(id);
                                    if ((findFragmentById2 instanceof UiStepFragment) && Intrinsics.areEqual(findFragmentById2.getTag(), str4)) {
                                        uiStepFragment = findFragmentById2;
                                    } else {
                                        UiWorkflow.Input input4 = uiStepModel.props;
                                        uiStepFragment = new UiStepFragment();
                                        IconHelper.withArgs(uiStepFragment, new UiStepFragment.UiStepFragmentArgs(input4));
                                    }
                                    if (z) {
                                        if (findFragmentById2 != 0) {
                                            Slide slide5 = new Slide(8388613);
                                            slide5.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById2.setExitTransition(slide5);
                                        }
                                        Slide slide6 = new Slide(8388611);
                                        slide6.mInterpolator = new DecelerateInterpolator();
                                        uiStepFragment.setEnterTransition(slide6);
                                    } else {
                                        if (findFragmentById2 != 0) {
                                            Slide slide7 = new Slide(8388611);
                                            slide7.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById2.setExitTransition(slide7);
                                        }
                                        Slide slide8 = new Slide(8388613);
                                        slide8.mInterpolator = new DecelerateInterpolator();
                                        uiStepFragment.setEnterTransition(slide8);
                                    }
                                    BackStackRecord backStackRecord3 = new BackStackRecord(childFragmentManager);
                                    backStackRecord3.replace(id, str4, uiStepFragment);
                                    backStackRecord3.commitNowAllowingStateLoss();
                                    stepRendering = new UiStepRendering(str4, uiStepFragment);
                                } else if (intermediateStepModel instanceof IntegrationStepModel) {
                                    IntegrationStepModel integrationStepModel = (IntegrationStepModel) intermediateStepModel;
                                    String str5 = integrationStepModel.key;
                                    boolean z2 = integrationStepModel.didGoBack;
                                    Fragment findFragmentById3 = childFragmentManager.findFragmentById(id);
                                    if ((findFragmentById3 instanceof IntegrationStepFragment) && Intrinsics.areEqual(findFragmentById3.getTag(), str5)) {
                                        integrationStepFragment = findFragmentById3;
                                    } else {
                                        IntegrationWorkflow.Input input5 = integrationStepModel.props;
                                        integrationStepFragment = new IntegrationStepFragment();
                                        IconHelper.withArgs(integrationStepFragment, new IntegrationStepFragment.IntegrationStepFragmentArgs(input5));
                                    }
                                    if (z2) {
                                        if (findFragmentById3 != 0) {
                                            Slide slide9 = new Slide(8388613);
                                            slide9.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById3.setExitTransition(slide9);
                                        }
                                        Slide slide10 = new Slide(8388611);
                                        slide10.mInterpolator = new DecelerateInterpolator();
                                        integrationStepFragment.setEnterTransition(slide10);
                                    } else {
                                        if (findFragmentById3 != 0) {
                                            Slide slide11 = new Slide(8388611);
                                            slide11.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById3.setExitTransition(slide11);
                                        }
                                        Slide slide12 = new Slide(8388613);
                                        slide12.mInterpolator = new DecelerateInterpolator();
                                        integrationStepFragment.setEnterTransition(slide12);
                                    }
                                    BackStackRecord backStackRecord4 = new BackStackRecord(childFragmentManager);
                                    backStackRecord4.replace(id, str5, integrationStepFragment);
                                    backStackRecord4.commitNowAllowingStateLoss();
                                    stepRendering = new IntegrationStepRendering(str5, integrationStepFragment);
                                } else if (intermediateStepModel instanceof GovernmentIdStepModel) {
                                    GovernmentIdStepModel governmentIdStepModel = (GovernmentIdStepModel) intermediateStepModel;
                                    String str6 = governmentIdStepModel.key;
                                    boolean z3 = governmentIdStepModel.didGoBack;
                                    Fragment findFragmentById4 = childFragmentManager.findFragmentById(id);
                                    if ((findFragmentById4 instanceof GovernmentIdStepFragment) && Intrinsics.areEqual(findFragmentById4.getTag(), str6)) {
                                        governmentIdStepFragment = findFragmentById4;
                                    } else {
                                        GovernmentIdWorkflow.Input input6 = governmentIdStepModel.props;
                                        governmentIdStepFragment = new GovernmentIdStepFragment();
                                        IconHelper.withArgs(governmentIdStepFragment, new GovernmentIdStepFragment.GovernmentIdStepFragmentArgs(input6));
                                    }
                                    if (z3) {
                                        if (findFragmentById4 != 0) {
                                            Slide slide13 = new Slide(8388613);
                                            slide13.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById4.setExitTransition(slide13);
                                        }
                                        Slide slide14 = new Slide(8388611);
                                        slide14.mInterpolator = new DecelerateInterpolator();
                                        governmentIdStepFragment.setEnterTransition(slide14);
                                    } else {
                                        if (findFragmentById4 != 0) {
                                            Slide slide15 = new Slide(8388611);
                                            slide15.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById4.setExitTransition(slide15);
                                        }
                                        Slide slide16 = new Slide(8388613);
                                        slide16.mInterpolator = new DecelerateInterpolator();
                                        governmentIdStepFragment.setEnterTransition(slide16);
                                    }
                                    BackStackRecord backStackRecord5 = new BackStackRecord(childFragmentManager);
                                    backStackRecord5.replace(id, str6, governmentIdStepFragment);
                                    backStackRecord5.commitNowAllowingStateLoss();
                                    stepRendering = new GovernmentIdStepRendering(str6, governmentIdStepFragment);
                                } else if (intermediateStepModel instanceof SelfieStepModel) {
                                    SelfieStepModel selfieStepModel = (SelfieStepModel) intermediateStepModel;
                                    String str7 = selfieStepModel.key;
                                    boolean z4 = selfieStepModel.didGoBack;
                                    Fragment findFragmentById5 = childFragmentManager.findFragmentById(id);
                                    if ((findFragmentById5 instanceof SelfieStepFragment) && Intrinsics.areEqual(findFragmentById5.getTag(), str7)) {
                                        selfieStepFragment = findFragmentById5;
                                    } else {
                                        SelfieWorkflow.Input input7 = selfieStepModel.props;
                                        selfieStepFragment = new SelfieStepFragment();
                                        IconHelper.withArgs(selfieStepFragment, new SelfieStepFragment.SelfieStepFragmentArgs(input7));
                                    }
                                    if (z4) {
                                        if (findFragmentById5 != 0) {
                                            Slide slide17 = new Slide(8388613);
                                            slide17.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById5.setExitTransition(slide17);
                                        }
                                        Slide slide18 = new Slide(8388611);
                                        slide18.mInterpolator = new DecelerateInterpolator();
                                        selfieStepFragment.setEnterTransition(slide18);
                                    } else {
                                        if (findFragmentById5 != 0) {
                                            Slide slide19 = new Slide(8388611);
                                            slide19.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById5.setExitTransition(slide19);
                                        }
                                        Slide slide20 = new Slide(8388613);
                                        slide20.mInterpolator = new DecelerateInterpolator();
                                        selfieStepFragment.setEnterTransition(slide20);
                                    }
                                    BackStackRecord backStackRecord6 = new BackStackRecord(childFragmentManager);
                                    backStackRecord6.replace(id, str7, selfieStepFragment);
                                    backStackRecord6.commitNowAllowingStateLoss();
                                    stepRendering = new SelfieStepRendering(str7, selfieStepFragment);
                                } else if (intermediateStepModel instanceof DocumentStepModel) {
                                    DocumentStepModel documentStepModel = (DocumentStepModel) intermediateStepModel;
                                    String str8 = documentStepModel.key;
                                    boolean z5 = documentStepModel.didGoBack;
                                    Fragment findFragmentById6 = childFragmentManager.findFragmentById(id);
                                    if ((findFragmentById6 instanceof DocumentStepFragment) && Intrinsics.areEqual(findFragmentById6.getTag(), str8)) {
                                        documentStepFragment = findFragmentById6;
                                    } else {
                                        DocumentWorkflow.Input input8 = documentStepModel.props;
                                        documentStepFragment = new DocumentStepFragment();
                                        IconHelper.withArgs(documentStepFragment, new DocumentStepFragment.DocumentStepFragmentArgs(input8));
                                    }
                                    if (z5) {
                                        if (findFragmentById6 != 0) {
                                            Slide slide21 = new Slide(8388613);
                                            slide21.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById6.setExitTransition(slide21);
                                        }
                                        Slide slide22 = new Slide(8388611);
                                        slide22.mInterpolator = new DecelerateInterpolator();
                                        documentStepFragment.setEnterTransition(slide22);
                                    } else {
                                        if (findFragmentById6 != 0) {
                                            Slide slide23 = new Slide(8388611);
                                            slide23.mInterpolator = new DecelerateInterpolator();
                                            findFragmentById6.setExitTransition(slide23);
                                        }
                                        Slide slide24 = new Slide(8388613);
                                        slide24.mInterpolator = new DecelerateInterpolator();
                                        documentStepFragment.setEnterTransition(slide24);
                                    }
                                    BackStackRecord backStackRecord7 = new BackStackRecord(childFragmentManager);
                                    backStackRecord7.replace(id, str8, documentStepFragment);
                                    backStackRecord7.commitNowAllowingStateLoss();
                                    stepRendering = new DocumentStepRendering(str8, documentStepFragment);
                                } else {
                                    if (!(intermediateStepModel instanceof CompleteStepModel)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    stepRendering = null;
                                }
                                textSetter.scannerText = stepRendering;
                            }
                            if (intermediateStepModel instanceof UiStepWorkflowModel) {
                                stepRendering.getClass();
                                ((UiStepWorkflowRendering) stepRendering).fragment.render$inquiry_internal_release((WorkflowStepModel) intermediateStepModel);
                            } else if (intermediateStepModel instanceof UiStepModel) {
                                stepRendering.getClass();
                                UiStepFragment uiStepFragment2 = ((UiStepRendering) stepRendering).fragment;
                                UiStepModel uiStepModel2 = (UiStepModel) intermediateStepModel;
                                UiWorkflow.Input input9 = uiStepModel2.props;
                                InquiryStateManager$$ExternalSyntheticLambda9 inquiryStateManager$$ExternalSyntheticLambda9 = uiStepModel2.handler;
                                StateFlowImpl stateFlowImpl5 = (StateFlowImpl) ((UiStepViewModel) uiStepFragment2.viewModel$delegate.getValue()).uiStepStateManager.firstChild;
                                stateFlowImpl5.getClass();
                                stateFlowImpl5.updateState(null, input9);
                                uiStepFragment2.currentOutputHandler = inquiryStateManager$$ExternalSyntheticLambda9;
                            } else if (intermediateStepModel instanceof LoadingStepModel) {
                                stepRendering.getClass();
                                ((LoadingRendering) stepRendering).fragment.render$inquiry_internal_release((LoadingStepModel) intermediateStepModel);
                            } else if (!(intermediateStepModel instanceof CompleteStepModel)) {
                                if (intermediateStepModel instanceof DocumentStepWorkflowModel) {
                                    stepRendering.getClass();
                                    ((DocumentWorkflowRendering) stepRendering).fragment.render$inquiry_internal_release((WorkflowStepModel) intermediateStepModel);
                                } else if (intermediateStepModel instanceof DocumentStepModel) {
                                    stepRendering.getClass();
                                    DocumentStepFragment documentStepFragment2 = ((DocumentStepRendering) stepRendering).fragment;
                                    DocumentStepModel documentStepModel2 = (DocumentStepModel) intermediateStepModel;
                                    DocumentWorkflow.Input input10 = documentStepModel2.props;
                                    HCaptcha$$ExternalSyntheticLambda1 hCaptcha$$ExternalSyntheticLambda1 = documentStepModel2.handler;
                                    StateFlowImpl stateFlowImpl6 = (StateFlowImpl) ((DocumentStepViewModel) documentStepFragment2.viewModel$delegate.getValue()).stateManager.firstChild;
                                    stateFlowImpl6.getClass();
                                    stateFlowImpl6.updateState(null, input10);
                                    documentStepFragment2.currentOutputHandler = hCaptcha$$ExternalSyntheticLambda1;
                                } else if (intermediateStepModel instanceof GovernmentIdStepWorkflowModel) {
                                    stepRendering.getClass();
                                    ((GovernmentIdWorkflowRendering) stepRendering).fragment.render$inquiry_internal_release((WorkflowStepModel) intermediateStepModel);
                                } else if (intermediateStepModel instanceof GovernmentIdStepModel) {
                                    stepRendering.getClass();
                                    GovernmentIdStepFragment governmentIdStepFragment2 = ((GovernmentIdStepRendering) stepRendering).fragment;
                                    GovernmentIdStepModel governmentIdStepModel2 = (GovernmentIdStepModel) intermediateStepModel;
                                    GovernmentIdWorkflow.Input input11 = governmentIdStepModel2.props;
                                    InquiryStateManager$$ExternalSyntheticLambda3 inquiryStateManager$$ExternalSyntheticLambda3 = governmentIdStepModel2.handler;
                                    StateFlowImpl stateFlowImpl7 = (StateFlowImpl) ((GovernmentIdStepViewModel) governmentIdStepFragment2.viewModel$delegate.getValue()).governmentIdStepStateManager.firstChild;
                                    stateFlowImpl7.getClass();
                                    stateFlowImpl7.updateState(null, input11);
                                    governmentIdStepFragment2.currentOutputHandler = inquiryStateManager$$ExternalSyntheticLambda3;
                                } else if (intermediateStepModel instanceof IntegrationStepModel) {
                                    stepRendering.getClass();
                                    IntegrationStepFragment integrationStepFragment2 = ((IntegrationStepRendering) stepRendering).fragment;
                                    IntegrationStepModel integrationStepModel2 = (IntegrationStepModel) intermediateStepModel;
                                    IntegrationWorkflow.Input input12 = integrationStepModel2.props;
                                    InquiryStateManager$$ExternalSyntheticLambda7 inquiryStateManager$$ExternalSyntheticLambda7 = integrationStepModel2.handler;
                                    IntegrationStepStateManager integrationStepStateManager2 = ((IntegrationStepViewModel) integrationStepFragment2.viewModel$delegate.getValue()).integrationStepStateManager;
                                    if (integrationStepStateManager2 != null && (stateFlowImpl = (StateFlowImpl) integrationStepStateManager2.firstChild) != null) {
                                        stateFlowImpl.updateState(null, input12);
                                    }
                                    integrationStepFragment2.currentOutputHandler = inquiryStateManager$$ExternalSyntheticLambda7;
                                } else if (intermediateStepModel instanceof IntegrationStepWorkflowModel) {
                                    stepRendering.getClass();
                                    ((IntegrationWorkflowRendering) stepRendering).fragment.render$inquiry_internal_release((WorkflowStepModel) intermediateStepModel);
                                } else if (intermediateStepModel instanceof SelfieStepWorkflowModel) {
                                    stepRendering.getClass();
                                    ((SelfieWorkflowRendering) stepRendering).fragment.render$inquiry_internal_release((WorkflowStepModel) intermediateStepModel);
                                } else {
                                    if (!(intermediateStepModel instanceof SelfieStepModel)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    stepRendering.getClass();
                                    SelfieStepFragment selfieStepFragment2 = ((SelfieStepRendering) stepRendering).fragment;
                                    SelfieStepModel selfieStepModel2 = (SelfieStepModel) intermediateStepModel;
                                    SelfieWorkflow.Input input13 = selfieStepModel2.props;
                                    InquiryStateManager$$ExternalSyntheticLambda17 inquiryStateManager$$ExternalSyntheticLambda17 = selfieStepModel2.handler;
                                    StateFlowImpl stateFlowImpl8 = (StateFlowImpl) ((SelfieViewModel) selfieStepFragment2.viewModel$delegate.getValue()).selfieStepStateManager.firstChild;
                                    stateFlowImpl8.getClass();
                                    stateFlowImpl8.updateState(null, input13);
                                    selfieStepFragment2.currentOutputHandler = inquiryStateManager$$ExternalSyntheticLambda17;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                }
            }

            public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, Object obj, int i) {
                this.$r8$classId = i;
                this.this$0 = obj;
            }
        }
    }
}
