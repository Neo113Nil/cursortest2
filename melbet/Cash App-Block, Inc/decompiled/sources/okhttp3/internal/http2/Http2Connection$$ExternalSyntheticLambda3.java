package okhttp3.internal.http2;

import android.widget.ImageView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_AudioProfileProxy;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import androidx.camera.video.EncoderProfilesResolver;
import androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import androidx.compose.runtime.MutableState;
import androidx.room.TransactorKt;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.blockers.viewmodels.CancelHelpItem;
import com.squareup.cash.blockers.viewmodels.DisplayHelpItem;
import com.squareup.cash.blockers.viewmodels.HelpOptionsViewEvent;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewEvent$SelectPaymentInstrument;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.SelfieCaptureButtonType;
import io.noties.markwon.MarkwonImpl;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.EnumDescriptor;
import okhttp3.internal.Tags;
import utils.StringUtilsKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class Http2Connection$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ Http2Connection$$ExternalSyntheticLambda3(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy;
        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy2 = null;
        switch (this.$r8$classId) {
            case 0:
                Http2Connection http2Connection = (Http2Connection) this.f$0;
                try {
                    http2Connection.writer.rstStream(this.f$1, (ErrorCode) this.f$2);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode, errorCode, e);
                }
                return Unit.INSTANCE;
            case 1:
                CameraInfo cameraInfo = (CameraInfo) this.f$0;
                int i = this.f$1;
                VideoEncoderInfoImpl$$ExternalSyntheticLambda0 videoEncoderInfoImpl$$ExternalSyntheticLambda0 = (VideoEncoderInfoImpl$$ExternalSyntheticLambda0) this.f$2;
                cameraInfo.getClass();
                CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
                int i2 = i == 2 ? 2 : 1;
                videoEncoderInfoImpl$$ExternalSyntheticLambda0.getClass();
                EncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
                encoderProfilesProvider.getClass();
                if (i2 != 2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    TreeMap treeMap = new TreeMap(new CompareSizesByArea(false));
                    AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = AutoValue_Quality_ConstantQuality.SD;
                    Iterator it = new ArrayList(AutoValue_Quality_ConstantQuality.QUALITIES_ORDER_BY_SIZE).iterator();
                    while (it.hasNext()) {
                        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = (AutoValue_Quality_ConstantQuality) it.next();
                        TransactorKt.checkState("Currently only support ConstantQuality", autoValue_Quality_ConstantQuality2 instanceof AutoValue_Quality_ConstantQuality);
                        EncoderProfilesProxy all = encoderProfilesProvider.getAll(autoValue_Quality_ConstantQuality2.getQualityValue(i2));
                        if (all != null) {
                            StringUtilsKt.d("CapabilitiesByQuality", "profiles = " + all);
                            if (all.getVideoProfiles().isEmpty()) {
                                autoValue_VideoValidatedEncoderProfilesProxy = autoValue_VideoValidatedEncoderProfilesProxy2;
                            } else {
                                int defaultDurationSeconds = all.getDefaultDurationSeconds();
                                int recommendedFileFormat = all.getRecommendedFileFormat();
                                List audioProfiles = all.getAudioProfiles();
                                List videoProfiles = all.getVideoProfiles();
                                TransactorKt.checkArgument("Should contain at least one VideoProfile.", !videoProfiles.isEmpty());
                                autoValue_VideoValidatedEncoderProfilesProxy = new AutoValue_VideoValidatedEncoderProfilesProxy(defaultDurationSeconds, recommendedFileFormat, Collections.unmodifiableList(new ArrayList(audioProfiles)), Collections.unmodifiableList(new ArrayList(videoProfiles)), !audioProfiles.isEmpty() ? (AutoValue_EncoderProfilesProxy_AudioProfileProxy) audioProfiles.get(0) : null, (AutoValue_EncoderProfilesProxy_VideoProfileProxy) videoProfiles.get(0));
                            }
                            if (autoValue_VideoValidatedEncoderProfilesProxy == null) {
                                StringUtilsKt.w("CapabilitiesByQuality", "EncoderProfiles of quality " + autoValue_Quality_ConstantQuality2 + " has no video validated profiles.");
                            } else {
                                treeMap.put(autoValue_VideoValidatedEncoderProfilesProxy.defaultVideoProfile.getResolution(), autoValue_Quality_ConstantQuality2);
                                linkedHashMap.put(autoValue_Quality_ConstantQuality2, autoValue_VideoValidatedEncoderProfilesProxy);
                            }
                            autoValue_VideoValidatedEncoderProfilesProxy2 = null;
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        StringUtilsKt.e("CapabilitiesByQuality", "No supported EncoderProfiles");
                    } else {
                        ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
                    }
                    if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                        StringUtilsKt.w("EncoderProfilesResolver", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                        encoderProfilesProvider = new DefaultEncoderProfilesProvider(cameraInfoInternal, CollectionsKt__CollectionsKt.listOf((Object[]) new AutoValue_Quality_ConstantQuality[]{AutoValue_Quality_ConstantQuality.FHD, AutoValue_Quality_ConstantQuality.HD, AutoValue_Quality_ConstantQuality.SD}), videoEncoderInfoImpl$$ExternalSyntheticLambda0);
                    }
                    Quirks quirks = DeviceQuirks.sQuirks;
                    quirks.getClass();
                    BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(new QualityAddedEncoderProfilesProvider(encoderProfilesProvider, quirks, cameraInfoInternal, videoEncoderInfoImpl$$ExternalSyntheticLambda0), quirks);
                    Set supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
                    supportedDynamicRanges.getClass();
                    Set set = supportedDynamicRanges;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                DynamicRange dynamicRange = (DynamicRange) it2.next();
                                if (dynamicRange.mEncoding == 3 && dynamicRange.mBitDepth == 10) {
                                    backupHdrProfileEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(backupHdrProfileEncoderProfilesProvider, videoEncoderInfoImpl$$ExternalSyntheticLambda0);
                                }
                            }
                        }
                    }
                    encoderProfilesProvider = new QualityValidatedEncoderProfilesProvider(backupHdrProfileEncoderProfilesProvider, cameraInfoInternal, quirks);
                } else if (!cameraInfoInternal.isHighSpeedSupported()) {
                    encoderProfilesProvider = EncoderProfilesProvider.EMPTY;
                }
                Set supportedDynamicRanges2 = cameraInfoInternal.getSupportedDynamicRanges();
                supportedDynamicRanges2.getClass();
                return new EncoderProfilesResolver(encoderProfilesProvider, i2, supportedDynamicRanges2);
            case 2:
                Function1 function1 = (Function1) this.f$0;
                int i3 = this.f$1;
                EducationalButtonAction educationalButtonAction = ((EducationalSheetModel) this.f$2).closeButtonAction;
                educationalButtonAction.getClass();
                function1.invoke(new EducationalSheetEvent.ButtonTap(i3, educationalButtonAction));
                return Unit.INSTANCE;
            case 3:
                ((Function1) this.f$0).invoke(new EducationalSheetEvent.ButtonTap(this.f$1, ((EducationalSheetModel.Button) this.f$2).action));
                return Unit.INSTANCE;
            case 4:
                ((Function1) this.f$2).invoke(((DisplayHelpItem) this.f$0) instanceof CancelHelpItem ? HelpOptionsViewEvent.CancelClick.INSTANCE : new HelpOptionsViewEvent.OptionSelected(this.f$1));
                return Unit.INSTANCE;
            case 5:
                ((Function1) this.f$0).invoke(new SelectPaymentInstrumentViewEvent$SelectPaymentInstrument((SelectPaymentInstrumentViewModel.PaymentInstrument) ((SelectPaymentInstrumentViewModel) this.f$2).instruments.get(this.f$1)));
                return Unit.INSTANCE;
            case 6:
                ((Function1) this.f$0).invoke(new InvestingCryptoNewsViewEvent.ArticleClicked((InvestingCryptoNewsArticleViewModel) this.f$2, this.f$1));
                return Unit.INSTANCE;
            case 7:
                ((Function2) this.f$0).invoke((TransactionViewModel) this.f$2, Integer.valueOf(this.f$1));
                return Unit.INSTANCE;
            case 8:
                LegacySessionConfig legacySessionConfig = (LegacySessionConfig) this.f$0;
                int i4 = this.f$1;
                ((MutableState) this.f$2).setValue(Boolean.FALSE);
                legacySessionConfig.safelyUpdateSelectedIndex(Integer.valueOf(i4));
                return Unit.INSTANCE;
            case 9:
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) this.f$0;
                SelfieWorkflow.Screen.CameraScreen cameraScreen = (SelfieWorkflow.Screen.CameraScreen) this.f$2;
                int i5 = this.f$1;
                TrackingEventsLogger.DefaultImpls.logSelfieCaptureButtonClickedEvent$default(cameraScreenRunner.trackingEventsLogger, new SelfieCaptureButtonEventData(SelfieCaptureButtonType.SWITCH_CAMERA, null, 2, null), false, 2, null);
                cameraScreen.onCameraFacingModeSelected.invoke(cameraScreenRunner.cameraFacingDirections.get(i5));
                return Unit.INSTANCE;
            case 10:
                o oVar = (o) this.f$0;
                RemoteImage remoteImage = (RemoteImage) this.f$2;
                int i6 = this.f$1;
                ImageView imageView = (ImageView) oVar.c;
                ImageStylingKt.applyStyles(imageView, remoteImage);
                imageView.setImageResource(i6);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setAdjustViewBounds(true);
                return Unit.INSTANCE;
            case 11:
                int i7 = this.f$1;
                MarkwonImpl markwonImpl = (MarkwonImpl) this.f$0;
                String[] strArr = (String[]) this.f$2;
                if (i7 == 1) {
                    ((ActivityResultLauncher) markwonImpl.visitorFactory).launch(strArr);
                } else {
                    ((ActivityResultLauncher) markwonImpl.parser).launch(strArr);
                }
                return Unit.INSTANCE;
            default:
                int i8 = this.f$1;
                String str = (String) this.f$0;
                EnumDescriptor enumDescriptor = (EnumDescriptor) this.f$2;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    serialDescriptorArr[i9] = Tags.buildSerialDescriptor$default(str + '.' + enumDescriptor.names[i9], StructureKind.CLASS.INSTANCE$1, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
        }
    }

    public /* synthetic */ Http2Connection$$ExternalSyntheticLambda3(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    public /* synthetic */ Http2Connection$$ExternalSyntheticLambda3(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }
}
