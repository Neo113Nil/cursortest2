package com.squareup.scannerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.ui.PlayerControlView;
import androidx.viewbinding.ViewBindings;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.math.MathUtils;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.common.collect.ImmutableList;
import com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog;
import com.knotapi.knot.utilities.SsoCookieHelper;
import com.knotapi.knot.webview.KnotView;
import com.squareup.cash.R;
import com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.BottomSheetCaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsBottomSheetController;
import com.withpersona.sdk2.inquiry.governmentid.captureTips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCaptureTipsBinding;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.A11yUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.TextBlock;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import io.noties.markwon.core.spans.BulletListItemSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import timber.log.Timber;

/* loaded from: classes9.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda12 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage;
        ArrayList arrayList;
        RemoteImage idFrontHelpModalPictograph;
        StyleElements.SizeSet modalPaddingValue;
        Double dp;
        StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base5;
        TextBasedComponentStyle base6;
        StyleElements.SizeSet marginValue;
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2;
        StepStyles.StepTextBasedComponentStyleContainer base7;
        int i = this.$r8$classId;
        int i2 = 20;
        Continuation continuation = null;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ScannerView scannerView = (ScannerView) obj3;
                StepResult stepResult = (StepResult) obj2;
                int i3 = ScannerView.$r8$clinit;
                Timber.Forest.i("Choosing to use photo for step " + ((Step) obj4).scanType, new Object[0]);
                stepResult.step.getClass();
                int i4 = ScannerView.$r8$clinit;
                scannerView.resetOverlay();
                StepResult$BitmapResult$Computed stepResult$BitmapResult$Computed = new StepResult$BitmapResult$Computed((Bitmap) obj);
                Step step = stepResult.step;
                String str = stepResult.text;
                step.getClass();
                scannerView.results.add(new StepResult(step, str, stepResult$BitmapResult$Computed));
                scannerView.moveToStep(scannerView.currentStep + 1, true);
                scannerView.isCaptured.set(false);
                scannerView.cameraOperator.setDefaultFlashState$1();
                break;
            case 1:
                PlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter = (PlayerControlView.TextTrackSelectionAdapter) obj4;
                TrackGroup trackGroup = (TrackGroup) obj2;
                PlayerControlView.TrackInformation trackInformation = (PlayerControlView.TrackInformation) obj;
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) ((Player) obj3);
                if (exoPlayerImpl.isCommandAvailable(29)) {
                    DefaultTrackSelector.Parameters parameters = (DefaultTrackSelector.Parameters) exoPlayerImpl.getTrackSelectionParameters();
                    parameters.getClass();
                    DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
                    builder.setOverrideForType(new TrackSelectionOverride(trackGroup, ImmutableList.of((Object) Integer.valueOf(trackInformation.trackIndex))));
                    builder.setTrackTypeDisabled(trackInformation.trackGroup.mediaTrackGroup.f871type, false);
                    exoPlayerImpl.setTrackSelectionParameters(builder.build());
                    String str2 = trackInformation.trackName;
                    switch (textTrackSelectionAdapter.$r8$classId) {
                        case 0:
                            break;
                        default:
                            textTrackSelectionAdapter.this$0.settingsAdapter.subTexts[1] = str2;
                            break;
                    }
                    textTrackSelectionAdapter.this$0$1.settingsWindow.dismiss();
                    break;
                }
                break;
            case 2:
                ((SsoCookieHelper) obj4).lambda$checkAndPromptForDialog$3((KnotView) obj3, "Reuse Google Account Overlay", (WebView) obj2, (KnotBottomSheetDialog) obj, view);
                break;
            case 3:
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj;
                ((MooncakeFlatRowItemView) obj4).onActionButtonClick.invoke();
                ((Ui.EventReceiver) obj3).sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.ActionClick(((Button) obj2).action_url, DirectoryAnalyticsData.copy$default(itemViewModel.analyticsData, null, DirectoryAnalyticsData.TapSurface.ACTION_BUTTON, DirectoryAnalyticsData.EventType.TAP_PROFILE_DIRECTORY_ITEM, 431), itemViewModel.recipient));
                break;
            case 4:
                SearchResult searchResult = (SearchResult) obj3;
                Function1 function1 = (Function1) obj2;
                InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) obj;
                ((MooncakeInvestingStockRowView) obj4).setWasClicked(true);
                if (!(searchResult instanceof SearchResult.CategoryResult)) {
                    if (!(searchResult instanceof SearchResult.StockResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        function1.invoke(new InvestingSearchViewEvent.StockClicked(investmentEntityToken, InvestingSearchViewEvent.StockClicked.SearchStockOrigin.StockRow.INSTANCE, ((SearchResult.StockResult) searchResult).symbol));
                        break;
                    }
                } else {
                    function1.invoke(new InvestingSearchViewEvent.CategoryClicked(new CategoryToken(investmentEntityToken.value)));
                    break;
                }
            case 5:
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) obj3;
                NextStep.GovernmentId.AssetConfig.CapturePage capturePage2 = (NextStep.GovernmentId.AssetConfig.CapturePage) obj;
                CaptureTipsBottomSheetController captureTipsBottomSheetController = ((BasicGovIdCaptureViewController) obj4).captureTipsBottomSheetController;
                BottomSheetCaptureTipsViewModel bottomSheetCaptureTipsViewModel = (BottomSheetCaptureTipsViewModel) ((CaptureTipsViewModel) obj2);
                ViewGroup viewGroup = captureTipsBottomSheetController.contentView;
                bottomSheetCaptureTipsViewModel.getClass();
                Pi2GovernmentidCaptureTipsBinding pi2GovernmentidCaptureTipsBinding = captureTipsBottomSheetController.binding;
                if (pi2GovernmentidCaptureTipsBinding == null) {
                    View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pi2_governmentid_capture_tips, viewGroup, false);
                    viewGroup.addView(inflate);
                    int i5 = R.id.bottom_inset;
                    Space space = (Space) ViewBindings.findChildViewById(inflate, R.id.bottom_inset);
                    if (space != null) {
                        i5 = R.id.bottom_sheet;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet);
                        if (frameLayout != null) {
                            i5 = R.id.bottom_sheet_content;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet_content);
                            if (linearLayout != null) {
                                i5 = R.id.content_container;
                                if (((ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.content_container)) != null) {
                                    i5 = R.id.continue_button;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.continue_button);
                                    if (personaMaterialButton != null) {
                                        i5 = R.id.illustration;
                                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.illustration);
                                        if (themeableLottieAnimationView != null) {
                                            i5 = R.id.illustration_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.illustration_container);
                                            if (constraintLayout != null) {
                                                i5 = R.id.prompt;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.prompt);
                                                if (textView != null) {
                                                    i5 = R.id.shadow;
                                                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.shadow);
                                                    if (findChildViewById != null) {
                                                        i5 = R.id.tips_container;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.tips_container);
                                                        if (linearLayout2 != null) {
                                                            i5 = R.id.title;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                                            if (textView2 != null) {
                                                                pi2GovernmentidCaptureTipsBinding = new Pi2GovernmentidCaptureTipsBinding((FrameLayout) inflate, space, frameLayout, linearLayout, personaMaterialButton, themeableLottieAnimationView, constraintLayout, textView, findChildViewById, linearLayout2, textView2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                    break;
                }
                LinearLayout linearLayout3 = pi2GovernmentidCaptureTipsBinding.bottomSheetContent;
                PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidCaptureTipsBinding.continueButton;
                ThemeableLottieAnimationView themeableLottieAnimationView2 = pi2GovernmentidCaptureTipsBinding.illustration;
                TextView textView3 = pi2GovernmentidCaptureTipsBinding.prompt;
                TextView textView4 = pi2GovernmentidCaptureTipsBinding.title;
                FrameLayout frameLayout2 = pi2GovernmentidCaptureTipsBinding.bottomSheet;
                captureTipsBottomSheetController.binding = pi2GovernmentidCaptureTipsBinding;
                View view2 = pi2GovernmentidCaptureTipsBinding.shadow;
                int i6 = 8;
                if (!captureTipsBottomSheetController.setup) {
                    captureTipsBottomSheetController.setup = true;
                    BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
                    zzbk.setup(from, new CameraHelper$$ExternalSyntheticLambda0(captureTipsBottomSheetController, i6), frameLayout2, linearLayout3, view2);
                    view2.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from, 1));
                    personaMaterialButton2.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from, 2));
                    from.updateImportantForAccessibilityOnSiblings = true;
                }
                captureTipsBottomSheetController.isShowing = true;
                captureTipsBottomSheetController.updateBackPressedHandler();
                String str3 = bottomSheetCaptureTipsViewModel.title;
                IdConfig.Side side = bottomSheetCaptureTipsViewModel.side;
                ExtensionsKt.setMarkdown(textView4, str3);
                ExtensionsKt.setMarkdown(textView3, bottomSheetCaptureTipsViewModel.prompt);
                personaMaterialButton2.setText(bottomSheetCaptureTipsViewModel.buttonText);
                LinearLayout linearLayout4 = pi2GovernmentidCaptureTipsBinding.tipsContainer;
                String str4 = bottomSheetCaptureTipsViewModel.tips;
                TextBasedComponentStyle base8 = (governmentIdStepStyle == null || (textStyle2 = governmentIdStepStyle.getTextStyle()) == null || (base7 = textStyle2.getBase()) == null) ? null : base7.getBase();
                str4.getClass();
                Context context = linearLayout4.getContext();
                context.getClass();
                MarkwonImpl markwonImpl = ExtensionsKt.markwon;
                if (markwonImpl == null) {
                    markwonImpl = MarkwonImpl.create(context);
                    ExtensionsKt.markwon = markwonImpl;
                }
                SpannableStringBuilder markdown = markwonImpl.toMarkdown(str4);
                Object[] spans = markdown.getSpans(0, markdown.length(), Object.class);
                spans.getClass();
                List sortedWith = ArraysKt___ArraysKt.sortedWith(spans, new SemanticsSortKt$special$$inlined$thenBy$1(markdown, 20));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = sortedWith.iterator();
                int i7 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = it;
                        Object next = it2.next();
                        capturePage = capturePage2;
                        if (next instanceof BulletListItemSpan) {
                            int spanStart = markdown.getSpanStart(next);
                            int spanEnd = markdown.getSpanEnd(next);
                            if (i7 > spanStart) {
                                arrayList = CollectionsKt__CollectionsJVMKt.listOf(new TextBlock.RegularTextBlock(markdown));
                            } else {
                                FrameLayout frameLayout3 = frameLayout2;
                                if (spanStart != i7) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append((CharSequence) markdown, i7, spanStart);
                                    if (!StringsKt.isBlank(spannableStringBuilder)) {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        spannableStringBuilder2.append((CharSequence) markdown, i7, spanStart);
                                        arrayList2.add(new TextBlock.RegularTextBlock(spannableStringBuilder2));
                                    }
                                }
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) markdown, spanStart, spanEnd);
                                TextBlock.RegularTextBlock regularTextBlock = new TextBlock.RegularTextBlock(spannableStringBuilder3);
                                TextBlock textBlock = (TextBlock) CollectionsKt.lastOrNull((List) arrayList2);
                                if (textBlock instanceof TextBlock.ListTextBlock) {
                                    arrayList2.set(arrayList2.size() - 1, new TextBlock.ListTextBlock(CollectionsKt.plus((Collection) ((TextBlock.ListTextBlock) textBlock).textBlocks, (Object) regularTextBlock)));
                                } else {
                                    arrayList2.add(new TextBlock.ListTextBlock(CollectionsKt__CollectionsJVMKt.listOf(regularTextBlock)));
                                }
                                i7 = spanEnd;
                                capturePage2 = capturePage;
                                frameLayout2 = frameLayout3;
                                it = it2;
                            }
                        } else {
                            it = it2;
                            capturePage2 = capturePage;
                        }
                    } else {
                        capturePage = capturePage2;
                        arrayList = arrayList2;
                    }
                }
                FrameLayout frameLayout4 = frameLayout2;
                linearLayout4.removeAllViews();
                A11yUtilsKt.generateAndAddViews(linearLayout4, arrayList, base8, false);
                if (base8 != null && (marginValue = base8.getMarginValue()) != null) {
                    ViewUtilsKt.setMargins(linearLayout4, marginValue);
                }
                BottomSheetBehavior from2 = BottomSheetBehavior.from(frameLayout4);
                if (governmentIdStepStyle != null && (titleStyle = governmentIdStepStyle.getTitleStyle()) != null && (base5 = titleStyle.getBase()) != null && (base6 = base5.getBase()) != null) {
                    TextStylingKt.style(textView4, base6, EmptySet.INSTANCE);
                }
                if (governmentIdStepStyle != null && (textStyle = governmentIdStepStyle.getTextStyle()) != null && (base3 = textStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                    TextStylingKt.style(textView3, base4, EmptySet.INSTANCE);
                }
                if (governmentIdStepStyle != null && (buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle()) != null && (base = buttonPrimaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                    ButtonStylingKt.style$default(personaMaterialButton2, base2, false, false, 14);
                }
                BottomSheetStylingKt.applyBottomSheetStyles$default(linearLayout3, governmentIdStepStyle, null, null, 14);
                if (governmentIdStepStyle != null && (modalPaddingValue = governmentIdStepStyle.getModalPaddingValue()) != null) {
                    ViewGroup.LayoutParams layoutParams = personaMaterialButton2.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        StyleElements.Size top = modalPaddingValue.getTop();
                        if (top != null && (dp = top.getDp()) != null) {
                            marginLayoutParams.topMargin = (int) com.withpersona.sdk2.inquiry.shared.ExtensionsKt.getDpToPx(dp.doubleValue());
                        }
                        personaMaterialButton2.setLayoutParams(marginLayoutParams);
                    }
                }
                int ordinal = side.ordinal();
                if (ordinal == 0) {
                    if (capturePage != null) {
                        idFrontHelpModalPictograph = capturePage.getIdFrontHelpModalPictograph();
                    }
                    idFrontHelpModalPictograph = null;
                } else if (ordinal == 1) {
                    if (capturePage != null) {
                        idFrontHelpModalPictograph = capturePage.getIdBackHelpModalPictograph();
                    }
                    idFrontHelpModalPictograph = null;
                } else if (ordinal != 3) {
                    if (capturePage != null) {
                        idFrontHelpModalPictograph = capturePage.getIdFrontHelpModalPictograph();
                    }
                    idFrontHelpModalPictograph = null;
                } else {
                    if (capturePage != null) {
                        idFrontHelpModalPictograph = capturePage.getBarcodeHelpModalPictograph();
                    }
                    idFrontHelpModalPictograph = null;
                }
                if (idFrontHelpModalPictograph == null) {
                    int ordinal2 = side.ordinal();
                    int i8 = R.raw.pi2_capture_tips_front_lottie;
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            i8 = R.raw.pi2_capture_tips_back_lottie;
                        } else if (ordinal2 == 3) {
                            i8 = R.raw.pi2_capture_tips_barcode_lottie;
                        }
                    }
                    themeableLottieAnimationView2.setAnimation(i8);
                    int ordinal3 = side.ordinal();
                    if (ordinal3 == 1) {
                        ImageStylingKt.replaceColors(themeableLottieAnimationView2, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconStrokeColor() : null, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconFillColor() : null, null, null, new String[]{"#000000", "#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                    } else if (ordinal3 != 3) {
                        ImageStylingKt.replaceColors(themeableLottieAnimationView2, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconStrokeColor() : null, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconFillColor() : null, null, null, new String[]{"#000000"}, new String[]{"#8751FF"}, new String[0], new String[0]);
                    } else {
                        ImageStylingKt.replaceColors(themeableLottieAnimationView2, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconStrokeColor() : null, governmentIdStepStyle != null ? governmentIdStepStyle.getCaptureHintIconFillColor() : null, null, null, new String[]{"#190051"}, new String[]{"#AA84FF", "#AA85FF"}, new String[0], new String[0]);
                    }
                } else if (captureTipsBottomSheetController.currentAssetIllustrationView == null) {
                    captureTipsBottomSheetController.currentAssetIllustrationView = RemoteImageUtilsKt.renderToContainer(idFrontHelpModalPictograph, pi2GovernmentidCaptureTipsBinding.illustrationContainer, false);
                    themeableLottieAnimationView2.setVisibility(8);
                }
                InsetsUtilsKt.onInsetsChanged(pi2GovernmentidCaptureTipsBinding.bottomInset, new HCaptcha$$ExternalSyntheticLambda2(pi2GovernmentidCaptureTipsBinding, 21));
                pi2GovernmentidCaptureTipsBinding.rootView.postDelayed(new UiStepBottomSheet$$ExternalSyntheticLambda1(from2, 1), 200L);
                break;
            default:
                Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding = (Pi2OldSelfieCameraBinding) obj4;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) obj3;
                OldCameraScreenRunner oldCameraScreenRunner = (OldCameraScreenRunner) obj2;
                MathUtils mathUtils = (MathUtils) obj;
                pi2OldSelfieCameraBinding.button.setEnabled(false);
                TaxWebAppLayoutBinding taxWebAppLayoutBinding = pi2OldSelfieCameraBinding.selfieWindow.binding;
                Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton;
                if (pi2CircleMaskView.getScaleX() != 5.0f || pi2CircleMaskView.getScaleY() != 5.0f) {
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    JobKt.launch$default(lifecycleCoroutineScopeImpl, MainDispatcherLoader.dispatcher, null, new TransitionWorker$run$1(oldCameraScreenRunner, mathUtils, continuation, i2), 2);
                    break;
                } else {
                    Pi2CircleMaskView.close$default((Pi2CircleMaskView) taxWebAppLayoutBinding.taxWebAppToolbarBackButton, new UiScreenRunner$$ExternalSyntheticLambda29(11, lifecycleCoroutineScopeImpl, oldCameraScreenRunner, mathUtils), 1);
                    break;
                }
                break;
        }
    }
}
