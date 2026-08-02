package com.squareup.scannerview;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Parcelable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.view.PreviewView$$ExternalSyntheticLambda0;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.navigation.api.RealCashLocalNavigatorHelper;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.R;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter$register$result$1;
import com.squareup.cash.blockers.views.ScannerTextSwapper;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.cash.mooncake.components.LoadingHelper$Position;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda0;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.navigation.CashTabProviderNavigatorHelper;
import com.squareup.cash.stripe.integration.StripeLinkActivity;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult$Failure$InitializationError;
import com.squareup.cash.stripe.integration.StripeLinkActivityResult$Failure$Unknown;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.presenters.shift.RealClockInRepository$updateNote$2;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayMode;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.preferences.BooleanPreference;
import com.squareup.scannerview.scanner.RealObjectScanner;
import com.squareup.util.android.Views;
import com.squareup.workflow1.WorkflowAction;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeViewModel;
import com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent;
import com.stripe.android.core.utils.DefaultDurationProvider;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.exception.CustomManualEntryRequiredError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel$onSubmit$1;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupState;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class ScannerView extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Callback callback;
    public final CameraOperator cameraOperator;
    public int currentStep;
    public final int flashButtonTopMargin;
    public final LegacySessionConfig flashView;
    public final AtomicBoolean isCaptured;
    public int overlayBottom;
    public int overlayHeight;
    public int overlayTopMargin;
    public final OverlayView overlayView;
    public final FrameLayout photoPreviewContainer;
    public final PhotoPreviewView photoPreviewView;
    public View previewButtonsLayout;
    public final ArrayList results;
    public View retakeButton;
    public List steps;
    public final View textLayout;
    public final TextSetter textSetter;
    public final View textView;
    public View usePhotoButton;
    public final Vibrator vibrator;
    public final ArrayList viewsToAlignBelowTargetBounds;

    /* renamed from: com.squareup.scannerview.ScannerView$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1 {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.$r8$classId = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Bitmap bitmap;
            switch (this.$r8$classId) {
                case 0:
                    StepResult stepResult = (StepResult) obj;
                    stepResult.getClass();
                    ScannerView scannerView = (ScannerView) this.receiver;
                    int i = ScannerView.$r8$clinit;
                    scannerView.getClass();
                    Timber.Forest forest = Timber.Forest;
                    Step step = stepResult.step;
                    forest.i("Step " + step.scanType + " completed", new Object[0]);
                    AtomicBoolean atomicBoolean = scannerView.isCaptured;
                    atomicBoolean.set(true);
                    scannerView.vibrator.vibrate(100L);
                    UtilsKt utilsKt = stepResult.bitmapResult;
                    if (!(utilsKt instanceof StepResult$BitmapResult$Lazy)) {
                        if (!(utilsKt instanceof StepResult$BitmapResult$Computed)) {
                            if (utilsKt != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                bitmap = null;
                            }
                        } else {
                            bitmap = ((StepResult$BitmapResult$Computed) utilsKt).bitmap;
                        }
                    } else {
                        bitmap = (Bitmap) ((StepResult$BitmapResult$Lazy) utilsKt).bitmap.getValue();
                    }
                    scannerView.post(new ScannerView$$ExternalSyntheticLambda9(scannerView, stepResult, bitmap));
                    if (!step.previewRequired) {
                        scannerView.results.add(stepResult);
                        step.getClass();
                        scannerView.moveToStep(scannerView.currentStep + 1, true);
                        atomicBoolean.set(false);
                    } else if (bitmap == null) {
                        a$$ExternalSyntheticBUOutline0.m("Not expecting bitmapResult in ", stepResult, " to be null!");
                        break;
                    } else {
                        forest.i("Step " + step.scanType + " requires preview", new Object[0]);
                        scannerView.post(new ScannerView$$ExternalSyntheticLambda9(stepResult, scannerView, bitmap));
                    }
                    break;
                case 1:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 2:
                    FormattedResource formattedResource = (FormattedResource) obj;
                    formattedResource.getClass();
                    break;
                case 3:
                    int intValue = ((Number) obj).intValue();
                    ImageAnalysis imageAnalysis = (ImageAnalysis) this.receiver;
                    if (imageAnalysis.setTargetRotationInternal(intValue)) {
                        imageAnalysis.tryUpdateRelativeRotation();
                    }
                    break;
                case 4:
                    CollectBankAccountResult collectBankAccountResult = (CollectBankAccountResult) obj;
                    collectBankAccountResult.getClass();
                    StripeLinkActivity stripeLinkActivity = (StripeLinkActivity) this.receiver;
                    int i2 = StripeLinkActivity.$r8$clinit;
                    stripeLinkActivity.getClass();
                    boolean z = collectBankAccountResult instanceof CollectBankAccountResult.Completed;
                    Parcelable parcelable = StripeLinkActivityResult.Canceled.INSTANCE;
                    if (!z) {
                        if (!(collectBankAccountResult instanceof CollectBankAccountResult.Cancelled)) {
                            if (!(collectBankAccountResult instanceof CollectBankAccountResult.Failed)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                Throwable th = ((CollectBankAccountResult.Failed) collectBankAccountResult).error;
                                parcelable = th instanceof CustomManualEntryRequiredError ? StripeLinkActivityResult.ManualLink.INSTANCE : th instanceof AppInitializationError ? StripeLinkActivityResult$Failure$InitializationError.INSTANCE : StripeLinkActivityResult$Failure$Unknown.INSTANCE;
                            }
                        }
                    } else {
                        CollectBankAccountResponse collectBankAccountResponse = ((CollectBankAccountResult.Completed) collectBankAccountResult).response;
                        StripeIntent stripeIntent = collectBankAccountResponse.intent;
                        if (stripeIntent.getStatus() != StripeIntent.Status.RequiresPaymentMethod && (stripeIntent.getStatus() == StripeIntent.Status.RequiresConfirmation || stripeIntent.getStatus() == StripeIntent.Status.Succeeded)) {
                            FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) collectBankAccountResponse.financialConnectionsSession.getAccounts().data.get(0);
                            String paymentMethodId = stripeIntent.getPaymentMethodId();
                            if (paymentMethodId != null) {
                                parcelable = new StripeLinkActivityResult.Success(financialConnectionsAccount.id, paymentMethodId, financialConnectionsAccount.institutionName);
                            } else {
                                Timber.Forest.w("No payment method id returned", new Object[0]);
                            }
                        }
                    }
                    Intent intent = new Intent();
                    intent.putExtra("StripeLinkActivityResult", parcelable);
                    stripeLinkActivity.setResult(-1, intent);
                    stripeLinkActivity.finish();
                    break;
                case 5:
                    obj.getClass();
                    ((CashTabProviderNavigatorHelper) this.receiver).getClass();
                    break;
                case 6:
                    obj.getClass();
                    ((RealCashLocalNavigatorHelper) this.receiver).getClass();
                    break;
                case 7:
                    obj.getClass();
                    ((CashTabProviderNavigatorHelper) this.receiver).getClass();
                    break;
                case 8:
                    obj.getClass();
                    ((CashTabProviderNavigatorHelper) this.receiver).getClass();
                    break;
                case 9:
                    obj.getClass();
                    ((CashTabProviderNavigatorHelper) this.receiver).getClass();
                    break;
                case 10:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 11:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 12:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 13:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 14:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 15:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 16:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 17:
                    ((Timber.Forest) this.receiver).e((Throwable) obj);
                    break;
                case 18:
                    ((ClockInOverlayState) this.receiver).endBreakDisabledDialogRemainingMinutes$delegate.setValue(Long.valueOf(((Number) obj).longValue()));
                    break;
                case 19:
                    String str = (String) obj;
                    str.getClass();
                    ClockInOverlayState clockInOverlayState = (ClockInOverlayState) this.receiver;
                    clockInOverlayState.getClass();
                    clockInOverlayState.isClockingOut$delegate.setValue(Boolean.TRUE);
                    clockInOverlayState.onEvent.invoke(new ClockInOverlayViewEvent.DeclareCashTipClockOutClicked(str));
                    break;
                case 20:
                    LocationIdentifier locationIdentifier = (LocationIdentifier) obj;
                    locationIdentifier.getClass();
                    ClockInOverlayState clockInOverlayState2 = (ClockInOverlayState) this.receiver;
                    clockInOverlayState2.getClass();
                    clockInOverlayState2.onEvent.invoke(new ClockInOverlayViewEvent.LocationSelected(locationIdentifier));
                    clockInOverlayState2.setOverlayMode(ClockInOverlayMode.Main);
                    break;
                case 21:
                    JobIdentifier jobIdentifier = (JobIdentifier) obj;
                    jobIdentifier.getClass();
                    ClockInOverlayState clockInOverlayState3 = (ClockInOverlayState) this.receiver;
                    clockInOverlayState3.getClass();
                    clockInOverlayState3.onEvent.invoke(new ClockInOverlayViewEvent.JobSelected(jobIdentifier));
                    clockInOverlayState3.setOverlayMode(ClockInOverlayMode.Main);
                    break;
                case 22:
                    ClockInOverlayViewModel.BreakIdentifier breakIdentifier = (ClockInOverlayViewModel.BreakIdentifier) obj;
                    breakIdentifier.getClass();
                    ClockInOverlayState clockInOverlayState4 = (ClockInOverlayState) this.receiver;
                    clockInOverlayState4.getClass();
                    clockInOverlayState4.isStartingBreak$delegate.setValue(Boolean.TRUE);
                    clockInOverlayState4.onEvent.invoke(new ClockInOverlayViewEvent.StartBreakClicked(breakIdentifier));
                    break;
                case 23:
                    ManualErrorReason manualErrorReason = (ManualErrorReason) obj;
                    manualErrorReason.getClass();
                    Callback callback = ((ScannerView) this.receiver).callback;
                    if (callback != null) {
                        callback.onManualError(manualErrorReason);
                    }
                    break;
                case 24:
                    ((Boolean) obj).booleanValue();
                    ScannerView scannerView2 = (ScannerView) this.receiver;
                    int i3 = ScannerView.$r8$clinit;
                    scannerView2.getClass();
                    break;
                case 25:
                    break;
                case 26:
                    WorkflowAction workflowAction = (WorkflowAction) obj;
                    workflowAction.getClass();
                    break;
                case 27:
                    SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) obj;
                    synchronizeSessionResponse.getClass();
                    break;
                case 28:
                    PartnerAccount partnerAccount = (PartnerAccount) obj;
                    partnerAccount.getClass();
                    AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) this.receiver;
                    accountPickerViewModel.getClass();
                    accountPickerViewModel.withState(new HeroCardViewKt$$ExternalSyntheticLambda0(13, accountPickerViewModel, partnerAccount));
                    break;
                default:
                    Throwable th2 = (Throwable) obj;
                    th2.getClass();
                    ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(th2);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public interface Callback {
        void onComplete(ArrayList arrayList);

        void onError();

        default void onFlashState(FlashState flashState) {
            flashState.getClass();
        }

        void onManualError(ManualErrorReason manualErrorReason);

        default void onOverlayBottom(int i) {
        }

        void onPreviewVisibilityChanged(boolean z, Step step);
    }

    /* loaded from: classes4.dex */
    public final class PhotoPreviewView extends AppCompatImageView {
        public final Path clipPath;
        public final float cornerRadius;
        public boolean drawSuccessOutline;
        public final Paint successOutlinePaint;
        public final RectF viewRect;

        public PhotoPreviewView(Context context, float f) {
            super(context);
            this.cornerRadius = f;
            this.clipPath = new Path();
            this.viewRect = new RectF();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16726023);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(getResources().getDimension(R.dimen.sv_outline_width));
            this.successOutlinePaint = paint;
            this.drawSuccessOutline = true;
            setScaleType(ImageView.ScaleType.FIT_XY);
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onDraw(Canvas canvas) {
            canvas.getClass();
            Path path = this.clipPath;
            path.reset();
            Path.Direction direction = Path.Direction.CW;
            RectF rectF = this.viewRect;
            float f = this.cornerRadius;
            path.addRoundRect(rectF, f, f, direction);
            canvas.clipPath(path);
            super.onDraw(canvas);
            if (this.drawSuccessOutline) {
                canvas.drawRoundRect(rectF, f, f, this.successOutlinePaint);
            }
        }

        public final void setDrawSuccessOutline(boolean z) {
            this.drawSuccessOutline = z;
        }

        @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
        public void setImageDrawable(Drawable drawable) {
            super.setImageDrawable(drawable);
            RectF rectF = this.viewRect;
            if (drawable != null) {
                rectF.set(drawable.getBounds());
            } else {
                rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextSetter textSetter;
        context.getClass();
        Object systemService = context.getSystemService("vibrator");
        systemService.getClass();
        this.vibrator = (Vibrator) systemService;
        OverlayView overlayView = new OverlayView(context, null, 6, 0);
        this.overlayView = overlayView;
        this.results = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.photoPreviewContainer = frameLayout;
        PhotoPreviewView photoPreviewView = new PhotoPreviewView(context, getResources().getDimension(R.dimen.sv_outline_corner_radius));
        this.photoPreviewView = photoPreviewView;
        new PausedCompositionImpl(frameLayout, null, new ToolbarTuckTargets(LoadingHelper$Position.Center, new SplitButtons$$ExternalSyntheticLambda0(2)), null, 54);
        this.steps = EmptyList.INSTANCE;
        this.currentStep = -1;
        this.viewsToAlignBelowTargetBounds = new ArrayList();
        this.flashButtonTopMargin = Views.dip(context, 32);
        this.isCaptured = new AtomicBoolean(false);
        setWillNotDraw(false);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.sv_ScannerView, i, 0);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(1, R.layout.sv_text_view);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(0, R.layout.sv_preview_buttons_layout);
        obtainStyledAttributes.recycle();
        PreviewView previewView = new PreviewView(context);
        previewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(previewView);
        RealObjectScanner realObjectScanner = RealObjectScanner.INSTANCE;
        int i2 = 0;
        int i3 = 0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i3, this, ScannerView.class, "loading", "loading()V", i2, 0);
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(i3, this, ScannerView.class, "loaded", "loaded()V", i2, 2);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(1, this, ScannerView.class, "stepCompleted", "stepCompleted(Lcom/squareup/scannerview/StepResult;)V", i2, 0);
        AnonymousClass1 anonymousClass13 = new AnonymousClass1(0, this, ScannerView.class, BreadcrumbHelper.Category.ERROR, "error()V", i2, 3);
        int i4 = 1;
        CameraOperator cameraOperator = new CameraOperator(context, previewView, anonymousClass1, anonymousClass12, anonymousClass3, anonymousClass13, new AnonymousClass3(i4, this, ScannerView.class, "manualError", "manualError(Lcom/squareup/scannerview/ManualErrorReason;)V", i2, 23), new AnonymousClass3(i4, this, ScannerView.class, "objectFoundCallback", "objectFoundCallback(Z)V", i2, 24));
        this.cameraOperator = cameraOperator;
        overlayView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        overlayView.setCallback(new ScannerView$$ExternalSyntheticLambda1(this, 0));
        addView(overlayView);
        View inflate = from.inflate(resourceId, (ViewGroup) this, false);
        inflate.getClass();
        this.textLayout = inflate;
        inflate.addOnLayoutChangeListener(new PreviewView$$ExternalSyntheticLambda0(this, 5));
        addView(inflate);
        if (resourceId2 != 0) {
            inflate = inflate.findViewById(resourceId2);
            inflate.getClass();
        }
        this.textView = inflate;
        if (inflate instanceof TextView) {
            textSetter = new TextSetter((TextView) inflate, (TextSwitcher) null, (ScannerTextSwapper) null, 6);
        } else if (inflate instanceof TextSwitcher) {
            textSetter = new TextSetter((TextView) null, (TextSwitcher) inflate, (ScannerTextSwapper) null, 5);
        } else {
            if (!(inflate instanceof ScannerTextSwapper)) {
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) inflate.getClass(), (Object) " is not TextView or TextSwitcher");
                throw null;
            }
            textSetter = new TextSetter((TextView) null, (TextSwitcher) null, (ScannerTextSwapper) inflate, 3);
        }
        this.textSetter = textSetter;
        LegacySessionConfig legacySessionConfig = new LegacySessionConfig(context, this);
        this.flashView = legacySessionConfig;
        final int i5 = 0;
        final ScannerView$$ExternalSyntheticLambda3 scannerView$$ExternalSyntheticLambda3 = new ScannerView$$ExternalSyntheticLambda3(this, i5);
        ((MooncakePillButton) legacySessionConfig.preferredFeatureGroup).setOnClickListener(new View.OnClickListener() { // from class: com.squareup.scannerview.ScannerView$FlashView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                ScannerView$$ExternalSyntheticLambda3 scannerView$$ExternalSyntheticLambda32 = scannerView$$ExternalSyntheticLambda3;
                switch (i6) {
                    case 0:
                        scannerView$$ExternalSyntheticLambda32.invoke();
                        break;
                    default:
                        scannerView$$ExternalSyntheticLambda32.invoke();
                        break;
                }
            }
        });
        final int i6 = 1;
        ((ImageButton) legacySessionConfig.effects).setOnClickListener(new View.OnClickListener() { // from class: com.squareup.scannerview.ScannerView$FlashView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                ScannerView$$ExternalSyntheticLambda3 scannerView$$ExternalSyntheticLambda32 = scannerView$$ExternalSyntheticLambda3;
                switch (i62) {
                    case 0:
                        scannerView$$ExternalSyntheticLambda32.invoke();
                        break;
                    default:
                        scannerView$$ExternalSyntheticLambda32.invoke();
                        break;
                }
            }
        });
        ScannerView$$ExternalSyntheticLambda1 scannerView$$ExternalSyntheticLambda1 = new ScannerView$$ExternalSyntheticLambda1(this, i6);
        cameraOperator.flashListener = scannerView$$ExternalSyntheticLambda1;
        scannerView$$ExternalSyntheticLambda1.invoke(cameraOperator.flash);
        frameLayout.addView(photoPreviewView);
        addView(frameLayout);
        View inflate2 = from.inflate(resourceId3, (ViewGroup) this, false);
        inflate2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        inflate2.setVisibility(8);
        this.previewButtonsLayout = inflate2;
        View findViewById = inflate2.findViewById(R.id.sv_preview_retake_button_id);
        findViewById.getClass();
        this.retakeButton = findViewById;
        View findViewById2 = this.previewButtonsLayout.findViewById(R.id.sv_preview_use_photo_button_id);
        findViewById2.getClass();
        this.usePhotoButton = findViewById2;
        addView(this.previewButtonsLayout);
        setKeepScreenOn(true);
    }

    public final boolean isStarted() {
        return this.currentStep > -1;
    }

    public final void moveToStep(int i, boolean z) {
        int i2 = 0;
        boolean z2 = i < this.currentStep;
        this.currentStep = i;
        if (i == this.steps.size()) {
            post(new ScannerView$$ExternalSyntheticLambda5(i2, this, z, z2));
            return;
        }
        Step step = (Step) this.steps.get(i);
        CameraOperator cameraOperator = this.cameraOperator;
        cameraOperator.step = step;
        FlashState flashState = step.defaultFlashState;
        flashState.getClass();
        cameraOperator.defaultFlashState = flashState;
        cameraOperator.setDefaultFlashState$1();
        post(new ScannerView$$ExternalSyntheticLambda6(this, step, z, z2, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Rotation rotation;
        super.onAttachedToWindow();
        LinkResolverDef linkResolverDef = Rotation.Companion;
        int rotation2 = getDisplay().getRotation();
        linkResolverDef.getClass();
        if (rotation2 == 0) {
            rotation = Rotation.ROTATION_0;
        } else if (rotation2 == 1) {
            rotation = Rotation.ROTATION_90;
        } else if (rotation2 == 2) {
            rotation = Rotation.ROTATION_180;
        } else {
            if (rotation2 != 3) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            rotation = Rotation.ROTATION_270;
        }
        CameraOperator cameraOperator = this.cameraOperator;
        cameraOperator.getClass();
        cameraOperator.displayRotation = rotation;
        cameraOperator.previewView.setRotation(rotation);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        CameraOperator cameraOperator = this.cameraOperator;
        if (measuredWidth != cameraOperator.viewWidth || measuredHeight != cameraOperator.viewHeight) {
            cameraOperator.viewWidth = measuredWidth;
            cameraOperator.viewHeight = measuredHeight;
            if (cameraOperator.previewSurface != null) {
                cameraOperator.calculateAdjustedTargetBounds();
                CaptureRequest.Builder builder = cameraOperator.previewRequestBuilder;
                builder.getClass();
                CameraOperator.updatePreviewRegions(builder, cameraOperator.cameraInfo);
                CameraCaptureSession cameraCaptureSession = cameraOperator.captureSession;
                if (cameraCaptureSession != null) {
                    cameraOperator.configureSession(cameraCaptureSession);
                    return;
                }
                return;
            }
            return;
        }
        AspectRatio aspectRatio = cameraOperator.aspectRatio;
        Rotation rotation = cameraOperator.displayRotation;
        if (rotation == Rotation.ROTATION_0 || rotation == Rotation.ROTATION_180) {
            SparseArrayCompat sparseArrayCompat = AspectRatio.sCache;
            aspectRatio = EntitySyncerKt.of(aspectRatio.y, aspectRatio.x);
        }
        int i3 = aspectRatio.y;
        int i4 = aspectRatio.x;
        int i5 = (measuredWidth * i3) / i4;
        PreviewView previewView = cameraOperator.previewView;
        if (measuredHeight < i5) {
            previewView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.y) / i4, 1073741824));
        } else {
            previewView.measure(View.MeasureSpec.makeMeasureSpec((i4 * measuredHeight) / i3, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public final void resetOverlay() {
        CameraOperator cameraOperator = this.cameraOperator;
        CameraCaptureSession cameraCaptureSession = cameraOperator.captureSession;
        if (cameraCaptureSession == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Capture session has not been configured!");
            return;
        }
        cameraOperator.configureSession(cameraCaptureSession);
        this.overlayView.setShowingPreview(false);
        this.photoPreviewView.setImageDrawable(null);
        this.previewButtonsLayout.setVisibility(8);
    }

    public final void setCallback(Callback callback) {
        callback.getClass();
        this.callback = callback;
    }

    public final void setCurrentText(String str) {
        str.getClass();
        this.textSetter.setText(str, false, false);
    }

    public final void setImageProcessingResolution(ImageResolution imageResolution) {
        imageResolution.getClass();
        CameraOperator cameraOperator = this.cameraOperator;
        cameraOperator.getClass();
        imageResolution.getClass();
        cameraOperator.imageProcessingResolution = imageResolution;
        if (cameraOperator.previewRequestBuilder != null) {
            cameraOperator.calculateAdjustedTargetBounds();
            CameraCaptureSession cameraCaptureSession = cameraOperator.captureSession;
            if (cameraCaptureSession != null) {
                cameraOperator.configureSession(cameraCaptureSession);
            }
        }
    }

    public final void setOverlayBottom(int i) {
        this.overlayBottom = i;
    }

    public final void setOverlayHeight(int i) {
        this.overlayHeight = i;
    }

    public final void setOverlayTopMargin(int i) {
        this.overlayTopMargin = i;
    }

    public final void setPreferredFacing(Facing facing) {
        facing.getClass();
        CameraOperator cameraOperator = this.cameraOperator;
        cameraOperator.getClass();
        facing.getClass();
        cameraOperator.preferredFacing = facing;
    }

    public final void setViewToAlignBelowTargetBounds(View view) {
        if (view != null) {
            this.viewsToAlignBelowTargetBounds.add(view);
        }
    }

    public final void start(Step step) {
        step.getClass();
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(step);
        listOf.getClass();
        if (isStarted()) {
            a$$ExternalSyntheticBUOutline0.m$1("Already started");
            return;
        }
        this.steps = listOf;
        this.results.clear();
        moveToStep(this.currentStep + 1, false);
        this.cameraOperator.start();
    }

    public final void stop() {
        if (!isStarted()) {
            a$$ExternalSyntheticBUOutline0.m$1("Not started");
        } else {
            this.cameraOperator.stop();
            this.currentStep = -1;
        }
    }

    /* renamed from: com.squareup.scannerview.ScannerView$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BooleanPreference booleanPreference) {
            super(0, 0, BooleanPreference.class, booleanPreference, "get", "get()Z");
            this.$r8$classId = 1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object value;
            AccountPickerState accountPickerState;
            int i = 23;
            int i2 = 24;
            int i3 = 1;
            int i4 = 0;
            Continuation continuation = null;
            switch (this.$r8$classId) {
                case 0:
                    ScannerView scannerView = (ScannerView) this.receiver;
                    int i5 = ScannerView.$r8$clinit;
                    scannerView.getClass();
                    break;
                case 1:
                    break;
                case 2:
                    ScannerView scannerView2 = (ScannerView) this.receiver;
                    int i6 = ScannerView.$r8$clinit;
                    scannerView2.getClass();
                    break;
                case 3:
                    ScannerView scannerView3 = (ScannerView) this.receiver;
                    int i7 = ScannerView.$r8$clinit;
                    if (scannerView3.isStarted()) {
                        scannerView3.stop();
                    }
                    Callback callback = scannerView3.callback;
                    if (callback != null) {
                        callback.onError();
                    }
                    break;
                case 4:
                    break;
                case 5:
                    IntentConfirmationChallengeViewModel intentConfirmationChallengeViewModel = (IntentConfirmationChallengeViewModel) this.receiver;
                    TextSetter textSetter = intentConfirmationChallengeViewModel.analyticsEventReporter;
                    textSetter.fireEvent(new IntentConfirmationChallengeAnalyticsEvent.Cancel(TextSetter.m3979durationInMsBwNAW2A(((DefaultDurationProvider) ((DurationProvider) textSetter.scannerText)).m4011endLV8wdWc(DurationProvider.Key.IntentConfirmationChallenge)), 0, intentConfirmationChallengeViewModel.args.captchaVendorName));
                    JobKt.launch$default(ViewModelKt.getViewModelScope(intentConfirmationChallengeViewModel), null, null, new IntentConfirmationChallengeViewModel.AnonymousClass1(intentConfirmationChallengeViewModel, continuation, 2), 3);
                    break;
                case 6:
                    FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.receiver;
                    financialConnectionsSheetViewModel.getClass();
                    FinancialConnectionsSheetViewModel.finishWithResult$default(financialConnectionsSheetViewModel, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE, 6);
                    break;
                case 7:
                    AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) this.receiver;
                    accountPickerViewModel.getClass();
                    JobKt.launch$default(ViewModelKt.getViewModelScope(accountPickerViewModel), null, null, new AccountPickerViewModel$onSubmit$1(accountPickerViewModel, continuation, i4), 3);
                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ACCOUNTS_SELECTED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                    AccountPickerState accountPickerState2 = (AccountPickerState) accountPickerViewModel.stateFlow.$$delegate_0.getValue();
                    accountPickerState2.getClass();
                    if (((AccountPickerState.Payload) accountPickerState2.payload.invoke()) != null) {
                        accountPickerViewModel.submitAccounts(accountPickerState2.selectedIds, false);
                    } else {
                        accountPickerViewModel.logger.error("account clicked without available payload.", null);
                    }
                    break;
                case 8:
                    NavigationManagerImpl.tryNavigateTo$default(((AccountPickerViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.Reset.INSTANCE, AccountPickerViewModel.PANE), null, 6);
                    break;
                case 9:
                    NavigationManagerImpl.tryNavigateTo$default(((AccountPickerViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, AccountPickerViewModel.PANE), null, 6);
                    break;
                case 10:
                    AccountPickerViewModel accountPickerViewModel2 = (AccountPickerViewModel) this.receiver;
                    StateFlowImpl stateFlowImpl = accountPickerViewModel2._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                        accountPickerState = (AccountPickerState) value;
                        accountPickerState.getClass();
                    } while (!stateFlowImpl.compareAndSet(value, AccountPickerState.copy$default(accountPickerState, null, null, null, null, null, 59)));
                    FinancialConnectionsViewModel.execute$default(accountPickerViewModel2, new AttachPaymentViewModel.AnonymousClass1(accountPickerViewModel2, continuation, i3), new KotterKnifeKt$$ExternalSyntheticLambda0(i2));
                    break;
                case 11:
                    AccountUpdateRequiredViewModel accountUpdateRequiredViewModel = (AccountUpdateRequiredViewModel) this.receiver;
                    accountUpdateRequiredViewModel.getClass();
                    JobKt.launch$default(ViewModelKt.getViewModelScope(accountUpdateRequiredViewModel), null, null, new CameraHelper$unbind$2(accountUpdateRequiredViewModel, continuation, 12), 3);
                    break;
                case 12:
                    ((AccountUpdateRequiredViewModel) this.receiver).navigationManager.tryNavigateBack();
                    break;
                case 13:
                    NavigationManagerImpl.tryNavigateTo$default(((AttachPaymentViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.Reset.INSTANCE, AttachPaymentViewModel.PANE), null, 6);
                    break;
                case 14:
                    NavigationManagerImpl.tryNavigateTo$default(((AttachPaymentViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, AttachPaymentViewModel.PANE), null, 6);
                    break;
                case 15:
                    ((OTPElement) this.receiver).controller.onValueChanged(0, "000000");
                    break;
                case 16:
                    ConsentViewModel consentViewModel = (ConsentViewModel) this.receiver;
                    consentViewModel.getClass();
                    FinancialConnectionsViewModel.execute$default(consentViewModel, new RealMRIFactory$sign$2.AnonymousClass1(consentViewModel, continuation, 26), new ExitViewModel$$ExternalSyntheticLambda0(10));
                    break;
                case 17:
                    NavigationManagerImpl.tryNavigateTo$default(((ErrorViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, ErrorViewModel.PANE), null, 6);
                    break;
                case 18:
                    ((ExitViewModel) this.receiver).navigationManager.tryNavigateBack();
                    break;
                case 19:
                    NavigationManagerImpl.tryNavigateTo$default(((InstitutionPickerViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.ManualEntry.INSTANCE, InstitutionPickerViewModel.PANE), null, 6);
                    break;
                case 20:
                    InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) this.receiver;
                    institutionPickerViewModel.getClass();
                    JobKt.launch$default(ViewModelKt.getViewModelScope(institutionPickerViewModel), null, null, new CameraHelper$unbind$2(institutionPickerViewModel, continuation, 13), 3);
                    break;
                case 21:
                    LinkAccountPickerViewModel linkAccountPickerViewModel = (LinkAccountPickerViewModel) this.receiver;
                    linkAccountPickerViewModel.getClass();
                    FinancialConnectionsViewModel.execute$default(linkAccountPickerViewModel, new DataStoreImpl$readDataOrHandleCorruption$3(linkAccountPickerViewModel, continuation, 17), new ExitViewModel$$ExternalSyntheticLambda0(19));
                    break;
                case 22:
                    ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) this.receiver;
                    manualEntryViewModel.getClass();
                    FinancialConnectionsViewModel.execute$default(manualEntryViewModel, new RegisterAliasPresenter$register$result$1(manualEntryViewModel, null), new ExitViewModel$$ExternalSyntheticLambda0(i));
                    break;
                case 23:
                    ManualEntryViewModel manualEntryViewModel2 = (ManualEntryViewModel) this.receiver;
                    manualEntryViewModel2._routing$delegate.setValue("110000000");
                    manualEntryViewModel2._account$delegate.setValue("000123456789");
                    manualEntryViewModel2._accountConfirm$delegate.setValue("000123456789");
                    FinancialConnectionsViewModel.execute$default(manualEntryViewModel2, new RegisterAliasPresenter$register$result$1(manualEntryViewModel2, null), new ExitViewModel$$ExternalSyntheticLambda0(i));
                    break;
                case 24:
                    ManualEntrySuccessViewModel manualEntrySuccessViewModel = (ManualEntrySuccessViewModel) this.receiver;
                    manualEntrySuccessViewModel.getClass();
                    JobKt.launch$default(ViewModelKt.getViewModelScope(manualEntrySuccessViewModel), null, null, new ExoPlayerVideoView.AnonymousClass2(manualEntrySuccessViewModel, continuation, i2), 3);
                    break;
                case 25:
                    NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel = (NetworkingLinkLoginWarmupViewModel) this.receiver;
                    if (((NetworkingLinkLoginWarmupState) networkingLinkLoginWarmupViewModel.stateFlow.$$delegate_0.getValue()).isInstantDebits) {
                        networkingLinkLoginWarmupViewModel.navigationManager.tryNavigateBack();
                    } else {
                        FinancialConnectionsViewModel.execute$default(networkingLinkLoginWarmupViewModel, new NetworkingLinkLoginWarmupViewModel.AnonymousClass1(networkingLinkLoginWarmupViewModel, continuation, i3), new ExitViewModel$$ExternalSyntheticLambda0(28));
                    }
                    break;
                case 26:
                    NetworkingLinkLoginWarmupViewModel networkingLinkLoginWarmupViewModel2 = (NetworkingLinkLoginWarmupViewModel) this.receiver;
                    NetworkingLinkLoginWarmupState.Payload payload = (NetworkingLinkLoginWarmupState.Payload) ((NetworkingLinkLoginWarmupState) networkingLinkLoginWarmupViewModel2.stateFlow.$$delegate_0.getValue()).payload.invoke();
                    if (payload != null) {
                        FinancialConnectionsViewModel.execute$default(networkingLinkLoginWarmupViewModel2, new RealClockInRepository$updateNote$2(networkingLinkLoginWarmupViewModel2, networkingLinkLoginWarmupViewModel2.consumerSessionProvider.provideConsumerSession(), payload, null, 1), new ExitViewModel$$ExternalSyntheticLambda0(27));
                    }
                    break;
                case 27:
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) this.receiver;
                    networkingLinkSignupViewModel.getClass();
                    networkingLinkSignupViewModel.withState(new HCaptcha$$ExternalSyntheticLambda2(networkingLinkSignupViewModel, i3));
                    break;
                case 28:
                    NavigationManagerImpl.tryNavigateTo$default(((NetworkingSaveToLinkVerificationViewModel) this.receiver).navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, NetworkingSaveToLinkVerificationViewModel.PANE), null, 6);
                    break;
                default:
                    ((NoticeSheetViewModel) this.receiver).navigationManager.tryNavigateBack();
                    break;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.$r8$classId = i3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ScannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
