package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.TintInfo;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.PopBackStackState;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.material.textfield.IconHelper;
import com.nimbusds.jose.util.DeflateUtils;
import com.plaid.internal.Z4$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import com.stripe.android.GooglePayConfig;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StyleVariant;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventState;
import com.withpersona.sdk2.inquiry.appdomethreatevents.ThreatEventStateKt;
import com.withpersona.sdk2.inquiry.device.DeviceModule;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.error_reporting.ExceptionLogger;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagModule;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiControllerParams;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.nfc.NfcTrackingEventsHolder;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import com.withpersona.sdk2.inquiry.shared.baseFragment.InquiryArgsProvider;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.data_collection.DummyDataCollector;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.FontDownloader;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.MarkwonImpl;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.e3;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.face.iad.capture.internal.y0;
import net.idrnd.misnap.iad.Payload;
import okhttp3.FormBody;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryFragment;", "Landroidx/fragment/app/Fragment;", "", "Lcom/withpersona/sdk2/inquiry/shared/baseFragment/InquiryArgsProvider;", "<init>", "()V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryFragment extends Fragment implements InquiryArgsProvider {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy args$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 22));
    public Context themedContext;
    public final ViewModelLazy viewModel$delegate;

    public InquiryFragment() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new e3(new e3(this, 15), 16));
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(InquiryViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 7), new ViewRegistryKt$buildView$1$2$1$1(14, this, lazy), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 8));
    }

    public final void createAndLaunchInquiry(boolean z) {
        InquiryWorkflow$Props templateProps;
        Context context = this.themedContext;
        if (context == null) {
            return;
        }
        String str = (String) getViewModel$1().inquiryId.getValue();
        Bundle bundle = getArgs$1().bundle;
        String string2 = bundle != null ? bundle.getString("ONE_TIME_LINK_CODE") : null;
        String str2 = (String) getViewModel$1().sessionToken.getValue();
        if (str != null) {
            Environment environment = getArgs$1().getEnvironment();
            Bundle bundle2 = getArgs$1().bundle;
            String string3 = bundle2 != null ? bundle2.getString("ENVIRONMENT_ID_KEY") : null;
            Integer theme = getArgs$1().getTheme();
            Bundle bundle3 = getArgs$1().bundle;
            templateProps = new InquiryWorkflow$Props.InquiryProps(str, str2, string3, environment, theme, false, bundle3 != null ? bundle3.getString("SHARE_TOKEN") : null);
        } else if (string2 != null) {
            Environment environment2 = getArgs$1().getEnvironment();
            Integer theme2 = getArgs$1().getTheme();
            Bundle bundle4 = getArgs$1().bundle;
            templateProps = new InquiryWorkflow$Props.OneTimeCodeProps(string2, environment2, theme2, false, bundle4 != null ? bundle4.getString("SHARE_TOKEN") : null);
        } else {
            Bundle bundle5 = getArgs$1().bundle;
            String string4 = bundle5 != null ? bundle5.getString("TEMPLATE_ID_KEY") : null;
            Bundle bundle6 = getArgs$1().bundle;
            String string5 = bundle6 != null ? bundle6.getString("TEMPLATE_VERSION_KEY") : null;
            Bundle bundle7 = getArgs$1().bundle;
            String string6 = bundle7 != null ? bundle7.getString("ACCOUNT_ID_KEY") : null;
            Bundle bundle8 = getArgs$1().bundle;
            String string7 = bundle8 != null ? bundle8.getString("REFERENCE_ID_KEY") : null;
            Bundle bundle9 = getArgs$1().bundle;
            InquiryFieldsMap inquiryFieldsMap = bundle9 != null ? (InquiryFieldsMap) SizeKt.getParcelable(bundle9, "FIELDS_MAP_KEY", InquiryFieldsMap.class) : null;
            Map map = inquiryFieldsMap != null ? inquiryFieldsMap.fields : null;
            Environment environment3 = getArgs$1().getEnvironment();
            Bundle bundle10 = getArgs$1().bundle;
            String string8 = bundle10 != null ? bundle10.getString("ENVIRONMENT_ID_KEY") : null;
            Integer theme3 = getArgs$1().getTheme();
            Bundle bundle11 = getArgs$1().bundle;
            String string9 = bundle11 != null ? bundle11.getString("THEME_SET_ID_KEY") : null;
            Bundle bundle12 = getArgs$1().bundle;
            StaticInquiryTemplate staticInquiryTemplate = bundle12 != null ? (StaticInquiryTemplate) SizeKt.getParcelable(bundle12, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class) : null;
            Bundle bundle13 = getArgs$1().bundle;
            String string10 = bundle13 != null ? bundle13.getString("REDIRECT_URI") : null;
            Bundle bundle14 = getArgs$1().bundle;
            templateProps = new InquiryWorkflow$Props.TemplateProps(string4, string5, string6, string7, string8, map, string9, staticInquiryTemplate, environment3, theme3, false, string10, bundle14 != null ? bundle14.getString("SHARE_TOKEN") : null);
        }
        if (z) {
            createInquiryComponentIfNeeded(context);
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            BackStackRecord backStackRecord = new BackStackRecord(childFragmentManager);
            Bundle bundle15 = getArgs$1().bundle;
            String string11 = bundle15 != null ? bundle15.getString("INQUIRY_ID_KEY") : null;
            String sessionToken = getArgs$1().getSessionToken();
            InquiryWorkflowFragment inquiryWorkflowFragment = new InquiryWorkflowFragment();
            IconHelper.withArgs(inquiryWorkflowFragment, new InquiryWorkflowFragment.WorkflowFragmentArgs(string11, sessionToken, templateProps));
            backStackRecord.replace(R.id.fragment_container, null, inquiryWorkflowFragment);
            backStackRecord.commit();
            return;
        }
        if (getChildFragmentManager().findFragmentById(R.id.fragment_container) == null) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            BackStackRecord backStackRecord2 = new BackStackRecord(childFragmentManager2);
            Bundle bundle16 = getArgs$1().bundle;
            String string12 = bundle16 != null ? bundle16.getString("INQUIRY_ID_KEY") : null;
            String sessionToken2 = getArgs$1().getSessionToken();
            InquiryWorkflowFragment inquiryWorkflowFragment2 = new InquiryWorkflowFragment();
            IconHelper.withArgs(inquiryWorkflowFragment2, new InquiryWorkflowFragment.WorkflowFragmentArgs(string12, sessionToken2, templateProps));
            backStackRecord2.replace(R.id.fragment_container, null, inquiryWorkflowFragment2);
            backStackRecord2.commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createInquiryComponentIfNeeded(Context context) {
        FallbackMode fallbackMode;
        FallbackMode fallbackMode2;
        Payload payload;
        Payload payload2;
        String string2;
        Context context2;
        Bundle bundle;
        boolean z;
        boolean z2;
        Bundle bundle2;
        String string3;
        Bundle bundle3;
        String string4;
        Bundle bundle4;
        String string5;
        Bundle bundle5;
        String string6;
        if (getViewModel$1().component != null) {
            return;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        boolean startsWith = StringsKt__StringsJVMKt.startsWith(packageName, "com.withpersona", false);
        String str = "https://withpersona.com";
        if (startsWith && (bundle5 = getArgs$1().bundle) != null && (string6 = bundle5.getString("SERVER_ENDPOINT")) != null) {
            str = string6;
        }
        String str2 = "https://webrtc-consumer.withpersona.com";
        if (startsWith && (bundle4 = getArgs$1().bundle) != null && (string5 = bundle4.getString("WEB_RTC_SERVER_ENDPOINT")) != null) {
            str2 = string5;
        }
        String str3 = "https://inquiry-fallback.withpersona.com";
        if (startsWith && (bundle3 = getArgs$1().bundle) != null && (string4 = bundle3.getString("FALLBACK_MODE_SERVER_ENDPOINT")) != null) {
            str3 = string4;
        }
        String str4 = "https://tg.withpersona.com";
        if (startsWith && (bundle2 = getArgs$1().bundle) != null && (string3 = bundle2.getString("TRACKING_EVENTS_SERVER_ENDPOINT")) != null) {
            str4 = string3;
        }
        Bundle bundle6 = getArgs$1().bundle;
        DataCollector dummyDataCollector = bundle6 != null ? bundle6.getBoolean("RETURN_COLLECTED_DATA", false) : false ? getViewModel$1().dataCollector : new DummyDataCollector();
        if (!((Boolean) getViewModel$1().forceFallbackModeFlow.$$delegate_0.getValue()).booleanValue()) {
            Bundle bundle7 = getArgs$1().bundle;
            if ((bundle7 != null ? (StaticInquiryTemplate) SizeKt.getParcelable(bundle7, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class) : null) == null) {
                Bundle bundle8 = getArgs$1().bundle;
                String string7 = bundle8 != null ? bundle8.getString("FALLBACK_MODE") : null;
                if (string7 != null) {
                    int hashCode = string7.hashCode();
                    if (hashCode != 64924498) {
                        if (hashCode != 74175084) {
                            if (hashCode == 1933739535 && string7.equals("ALWAYS")) {
                                fallbackMode = FallbackMode.ALWAYS;
                            }
                        } else if (string7.equals("NEVER")) {
                            fallbackMode = FallbackMode.NEVER;
                        }
                    } else if (string7.equals("DEFER")) {
                        fallbackMode = FallbackMode.DEFER;
                    }
                    fallbackMode2 = FallbackMode.ALWAYS;
                    int i = 10;
                    ApiControllerParams.Fallback fallback = ApiControllerParams.Fallback.INSTANCE;
                    if (fallbackMode == fallbackMode2) {
                        payload = new Payload(fallback, i);
                    } else {
                        Bundle bundle9 = getArgs$1().bundle;
                        StaticInquiryTemplate staticInquiryTemplate = bundle9 != null ? (StaticInquiryTemplate) SizeKt.getParcelable(bundle9, "STATIC_INQUIRY_TEMPLATE_KEY", StaticInquiryTemplate.class) : null;
                        LocalStaticInquiryTemplate localStaticInquiryTemplate = staticInquiryTemplate instanceof LocalStaticInquiryTemplate ? (LocalStaticInquiryTemplate) staticInquiryTemplate : null;
                        if (localStaticInquiryTemplate != null) {
                            payload2 = new Payload(new ApiControllerParams.Offline(localStaticInquiryTemplate.getResourceId()), i);
                            InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 = new InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1(this);
                            FragmentActivity requireActivity = requireActivity();
                            requireActivity.getClass();
                            Bundle bundle10 = getArgs$1().bundle;
                            string2 = bundle10 == null ? bundle10.getString("LOCALE") : null;
                            requireActivity.getClass();
                            FormBody.Builder builder = new FormBody.Builder();
                            Application application = requireActivity.getApplication();
                            builder.names = application;
                            if (string2 != null) {
                                if (StringsKt.isBlank(string2)) {
                                    string2 = null;
                                }
                                if (string2 != null) {
                                    Configuration configuration = new Configuration(application.getResources().getConfiguration());
                                    configuration.setLocale(Locale.forLanguageTag(StringsKt__StringsJVMKt.replace$default(string2, "_", "-")));
                                    context2 = application.createConfigurationContext(configuration);
                                    builder.values = context2;
                                    MarkwonImpl markwonImpl = new MarkwonImpl(getViewModel$1().pictureLaunchResultLauncher, getViewModel$1().documentsSelectResultLauncher, getViewModel$1().selectFromPhotoLibraryLauncher);
                                    DocumentSelectLauncherModule documentSelectLauncherModule = new DocumentSelectLauncherModule(getViewModel$1().documentSelectResultLauncher);
                                    o0 o0Var = new o0(getViewModel$1().requestPermissionResultLauncher);
                                    CustomTabsLauncherModule customTabsLauncherModule = new CustomTabsLauncherModule(getViewModel$1().passportNfcReaderLauncher, 3);
                                    CustomTabsLauncherModule customTabsLauncherModule2 = new CustomTabsLauncherModule(getViewModel$1().customTabsLauncher, 0);
                                    Bundle bundle11 = getArgs$1().bundle;
                                    boolean z3 = bundle11 != null ? bundle11.getBoolean("USE_SERVER_STYLES", true) : true;
                                    Bundle bundle12 = getArgs$1().bundle;
                                    String string8 = bundle12 != null ? bundle12.getString("ENVIRONMENT_ID_KEY") : null;
                                    Bundle bundle13 = getArgs$1().bundle;
                                    String string9 = bundle13 != null ? bundle13.getString("LOCALE") : null;
                                    InquiryArguments args$1 = getArgs$1();
                                    args$1.getClass();
                                    StyleVariant.Companion companion = StyleVariant.INSTANCE;
                                    Bundle bundle14 = args$1.bundle;
                                    StyleVariant fromValue = companion.fromValue(bundle14 != null ? bundle14.getString("STYLE_VARIANT") : null);
                                    NetworkCoreModule networkCoreModule = new NetworkCoreModule(z3, string8, string9, fromValue != null ? fromValue.getValue() : null);
                                    Payload payload3 = new Payload(dummyDataCollector);
                                    GooglePayConfig googlePayConfig = new GooglePayConfig(str, str2, str3);
                                    Pool pool = new Pool(inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1);
                                    bundle = getArgs$1().bundle;
                                    if (bundle != null) {
                                        z = true;
                                        z2 = bundle.getBoolean("CONTROL_NAVIGATION_BAR", true);
                                    } else {
                                        z = true;
                                        z2 = true;
                                    }
                                    Bundle bundle15 = getArgs$1().bundle;
                                    SharedModule sharedModule = new SharedModule(z2, bundle15 != null ? bundle15.getBoolean("CONTROL_STATUS_BAR", z) : z);
                                    Payload payload4 = new Payload(getViewModel$1().resolvableApiLauncher);
                                    TextSetter textSetter = new TextSetter(fallbackMode, getArgs$1().getEnvironment(), getViewModel$1().savedStateHandle);
                                    SdkFilesManager sdkFilesManager = getViewModel$1().sdkFilesManager;
                                    sdkFilesManager.getClass();
                                    MatchResult.Destructured destructured = new MatchResult.Destructured();
                                    destructured.match = sdkFilesManager;
                                    DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = new DaggerInquiryComponent$InquiryComponentImpl(networkCoreModule, googlePayConfig, documentSelectLauncherModule, new CameraHelper(), o0Var, destructured, builder, customTabsLauncherModule2, markwonImpl, new LinkResolverDef(19), customTabsLauncherModule, payload3, textSetter, sharedModule, new y0(), payload2, pool, payload4, new DeviceModule(), new FeatureFlagModule(), new TrackingEventsModule(str4));
                                    getViewModel$1().component = daggerInquiryComponent$InquiryComponentImpl;
                                    FontDownloader fontDownloader = (FontDownloader) daggerInquiryComponent$InquiryComponentImpl.realFontDownloaderProvider.get();
                                    fontDownloader.getClass();
                                    FontDownloader.Companion._instance = fontDownloader;
                                    NfcTrackingEventsHolder.trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl.trackingEventsLogger();
                                }
                            }
                            context2 = null;
                            builder.values = context2;
                            MarkwonImpl markwonImpl2 = new MarkwonImpl(getViewModel$1().pictureLaunchResultLauncher, getViewModel$1().documentsSelectResultLauncher, getViewModel$1().selectFromPhotoLibraryLauncher);
                            DocumentSelectLauncherModule documentSelectLauncherModule2 = new DocumentSelectLauncherModule(getViewModel$1().documentSelectResultLauncher);
                            o0 o0Var2 = new o0(getViewModel$1().requestPermissionResultLauncher);
                            CustomTabsLauncherModule customTabsLauncherModule3 = new CustomTabsLauncherModule(getViewModel$1().passportNfcReaderLauncher, 3);
                            CustomTabsLauncherModule customTabsLauncherModule22 = new CustomTabsLauncherModule(getViewModel$1().customTabsLauncher, 0);
                            Bundle bundle112 = getArgs$1().bundle;
                            if (bundle112 != null) {
                            }
                            Bundle bundle122 = getArgs$1().bundle;
                            if (bundle122 != null) {
                            }
                            Bundle bundle132 = getArgs$1().bundle;
                            if (bundle132 != null) {
                            }
                            InquiryArguments args$12 = getArgs$1();
                            args$12.getClass();
                            StyleVariant.Companion companion2 = StyleVariant.INSTANCE;
                            Bundle bundle142 = args$12.bundle;
                            StyleVariant fromValue2 = companion2.fromValue(bundle142 != null ? bundle142.getString("STYLE_VARIANT") : null);
                            NetworkCoreModule networkCoreModule2 = new NetworkCoreModule(z3, string8, string9, fromValue2 != null ? fromValue2.getValue() : null);
                            Payload payload32 = new Payload(dummyDataCollector);
                            GooglePayConfig googlePayConfig2 = new GooglePayConfig(str, str2, str3);
                            Pool pool2 = new Pool(inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1);
                            bundle = getArgs$1().bundle;
                            if (bundle != null) {
                            }
                            Bundle bundle152 = getArgs$1().bundle;
                            SharedModule sharedModule2 = new SharedModule(z2, bundle152 != null ? bundle152.getBoolean("CONTROL_STATUS_BAR", z) : z);
                            Payload payload42 = new Payload(getViewModel$1().resolvableApiLauncher);
                            TextSetter textSetter2 = new TextSetter(fallbackMode, getArgs$1().getEnvironment(), getViewModel$1().savedStateHandle);
                            SdkFilesManager sdkFilesManager2 = getViewModel$1().sdkFilesManager;
                            sdkFilesManager2.getClass();
                            MatchResult.Destructured destructured2 = new MatchResult.Destructured();
                            destructured2.match = sdkFilesManager2;
                            DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl2 = new DaggerInquiryComponent$InquiryComponentImpl(networkCoreModule2, googlePayConfig2, documentSelectLauncherModule2, new CameraHelper(), o0Var2, destructured2, builder, customTabsLauncherModule22, markwonImpl2, new LinkResolverDef(19), customTabsLauncherModule3, payload32, textSetter2, sharedModule2, new y0(), payload2, pool2, payload42, new DeviceModule(), new FeatureFlagModule(), new TrackingEventsModule(str4));
                            getViewModel$1().component = daggerInquiryComponent$InquiryComponentImpl2;
                            FontDownloader fontDownloader2 = (FontDownloader) daggerInquiryComponent$InquiryComponentImpl2.realFontDownloaderProvider.get();
                            fontDownloader2.getClass();
                            FontDownloader.Companion._instance = fontDownloader2;
                            NfcTrackingEventsHolder.trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLogger();
                        }
                        payload = new Payload(fallback, i);
                    }
                    payload2 = payload;
                    InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$12 = new InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1(this);
                    FragmentActivity requireActivity2 = requireActivity();
                    requireActivity2.getClass();
                    Bundle bundle102 = getArgs$1().bundle;
                    if (bundle102 == null) {
                    }
                    requireActivity2.getClass();
                    FormBody.Builder builder2 = new FormBody.Builder();
                    Application application2 = requireActivity2.getApplication();
                    builder2.names = application2;
                    if (string2 != null) {
                    }
                    context2 = null;
                    builder2.values = context2;
                    MarkwonImpl markwonImpl22 = new MarkwonImpl(getViewModel$1().pictureLaunchResultLauncher, getViewModel$1().documentsSelectResultLauncher, getViewModel$1().selectFromPhotoLibraryLauncher);
                    DocumentSelectLauncherModule documentSelectLauncherModule22 = new DocumentSelectLauncherModule(getViewModel$1().documentSelectResultLauncher);
                    o0 o0Var22 = new o0(getViewModel$1().requestPermissionResultLauncher);
                    CustomTabsLauncherModule customTabsLauncherModule32 = new CustomTabsLauncherModule(getViewModel$1().passportNfcReaderLauncher, 3);
                    CustomTabsLauncherModule customTabsLauncherModule222 = new CustomTabsLauncherModule(getViewModel$1().customTabsLauncher, 0);
                    Bundle bundle1122 = getArgs$1().bundle;
                    if (bundle1122 != null) {
                    }
                    Bundle bundle1222 = getArgs$1().bundle;
                    if (bundle1222 != null) {
                    }
                    Bundle bundle1322 = getArgs$1().bundle;
                    if (bundle1322 != null) {
                    }
                    InquiryArguments args$122 = getArgs$1();
                    args$122.getClass();
                    StyleVariant.Companion companion22 = StyleVariant.INSTANCE;
                    Bundle bundle1422 = args$122.bundle;
                    StyleVariant fromValue22 = companion22.fromValue(bundle1422 != null ? bundle1422.getString("STYLE_VARIANT") : null);
                    NetworkCoreModule networkCoreModule22 = new NetworkCoreModule(z3, string8, string9, fromValue22 != null ? fromValue22.getValue() : null);
                    Payload payload322 = new Payload(dummyDataCollector);
                    GooglePayConfig googlePayConfig22 = new GooglePayConfig(str, str2, str3);
                    Pool pool22 = new Pool(inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$12);
                    bundle = getArgs$1().bundle;
                    if (bundle != null) {
                    }
                    Bundle bundle1522 = getArgs$1().bundle;
                    SharedModule sharedModule22 = new SharedModule(z2, bundle1522 != null ? bundle1522.getBoolean("CONTROL_STATUS_BAR", z) : z);
                    Payload payload422 = new Payload(getViewModel$1().resolvableApiLauncher);
                    TextSetter textSetter22 = new TextSetter(fallbackMode, getArgs$1().getEnvironment(), getViewModel$1().savedStateHandle);
                    SdkFilesManager sdkFilesManager22 = getViewModel$1().sdkFilesManager;
                    sdkFilesManager22.getClass();
                    MatchResult.Destructured destructured22 = new MatchResult.Destructured();
                    destructured22.match = sdkFilesManager22;
                    DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl22 = new DaggerInquiryComponent$InquiryComponentImpl(networkCoreModule22, googlePayConfig22, documentSelectLauncherModule22, new CameraHelper(), o0Var22, destructured22, builder2, customTabsLauncherModule222, markwonImpl22, new LinkResolverDef(19), customTabsLauncherModule32, payload322, textSetter22, sharedModule22, new y0(), payload2, pool22, payload422, new DeviceModule(), new FeatureFlagModule(), new TrackingEventsModule(str4));
                    getViewModel$1().component = daggerInquiryComponent$InquiryComponentImpl22;
                    FontDownloader fontDownloader22 = (FontDownloader) daggerInquiryComponent$InquiryComponentImpl22.realFontDownloaderProvider.get();
                    fontDownloader22.getClass();
                    FontDownloader.Companion._instance = fontDownloader22;
                    NfcTrackingEventsHolder.trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl22.trackingEventsLogger();
                }
                fallbackMode = FallbackMode.NEVER;
                fallbackMode2 = FallbackMode.ALWAYS;
                int i2 = 10;
                ApiControllerParams.Fallback fallback2 = ApiControllerParams.Fallback.INSTANCE;
                if (fallbackMode == fallbackMode2) {
                }
                payload2 = payload;
                InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$122 = new InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1(this);
                FragmentActivity requireActivity22 = requireActivity();
                requireActivity22.getClass();
                Bundle bundle1022 = getArgs$1().bundle;
                if (bundle1022 == null) {
                }
                requireActivity22.getClass();
                FormBody.Builder builder22 = new FormBody.Builder();
                Application application22 = requireActivity22.getApplication();
                builder22.names = application22;
                if (string2 != null) {
                }
                context2 = null;
                builder22.values = context2;
                MarkwonImpl markwonImpl222 = new MarkwonImpl(getViewModel$1().pictureLaunchResultLauncher, getViewModel$1().documentsSelectResultLauncher, getViewModel$1().selectFromPhotoLibraryLauncher);
                DocumentSelectLauncherModule documentSelectLauncherModule222 = new DocumentSelectLauncherModule(getViewModel$1().documentSelectResultLauncher);
                o0 o0Var222 = new o0(getViewModel$1().requestPermissionResultLauncher);
                CustomTabsLauncherModule customTabsLauncherModule322 = new CustomTabsLauncherModule(getViewModel$1().passportNfcReaderLauncher, 3);
                CustomTabsLauncherModule customTabsLauncherModule2222 = new CustomTabsLauncherModule(getViewModel$1().customTabsLauncher, 0);
                Bundle bundle11222 = getArgs$1().bundle;
                if (bundle11222 != null) {
                }
                Bundle bundle12222 = getArgs$1().bundle;
                if (bundle12222 != null) {
                }
                Bundle bundle13222 = getArgs$1().bundle;
                if (bundle13222 != null) {
                }
                InquiryArguments args$1222 = getArgs$1();
                args$1222.getClass();
                StyleVariant.Companion companion222 = StyleVariant.INSTANCE;
                Bundle bundle14222 = args$1222.bundle;
                StyleVariant fromValue222 = companion222.fromValue(bundle14222 != null ? bundle14222.getString("STYLE_VARIANT") : null);
                NetworkCoreModule networkCoreModule222 = new NetworkCoreModule(z3, string8, string9, fromValue222 != null ? fromValue222.getValue() : null);
                Payload payload3222 = new Payload(dummyDataCollector);
                GooglePayConfig googlePayConfig222 = new GooglePayConfig(str, str2, str3);
                Pool pool222 = new Pool(inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$122);
                bundle = getArgs$1().bundle;
                if (bundle != null) {
                }
                Bundle bundle15222 = getArgs$1().bundle;
                SharedModule sharedModule222 = new SharedModule(z2, bundle15222 != null ? bundle15222.getBoolean("CONTROL_STATUS_BAR", z) : z);
                Payload payload4222 = new Payload(getViewModel$1().resolvableApiLauncher);
                TextSetter textSetter222 = new TextSetter(fallbackMode, getArgs$1().getEnvironment(), getViewModel$1().savedStateHandle);
                SdkFilesManager sdkFilesManager222 = getViewModel$1().sdkFilesManager;
                sdkFilesManager222.getClass();
                MatchResult.Destructured destructured222 = new MatchResult.Destructured();
                destructured222.match = sdkFilesManager222;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl222 = new DaggerInquiryComponent$InquiryComponentImpl(networkCoreModule222, googlePayConfig222, documentSelectLauncherModule222, new CameraHelper(), o0Var222, destructured222, builder22, customTabsLauncherModule2222, markwonImpl222, new LinkResolverDef(19), customTabsLauncherModule322, payload3222, textSetter222, sharedModule222, new y0(), payload2, pool222, payload4222, new DeviceModule(), new FeatureFlagModule(), new TrackingEventsModule(str4));
                getViewModel$1().component = daggerInquiryComponent$InquiryComponentImpl222;
                FontDownloader fontDownloader222 = (FontDownloader) daggerInquiryComponent$InquiryComponentImpl222.realFontDownloaderProvider.get();
                fontDownloader222.getClass();
                FontDownloader.Companion._instance = fontDownloader222;
                NfcTrackingEventsHolder.trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl222.trackingEventsLogger();
            }
        }
        fallbackMode = FallbackMode.ALWAYS;
        fallbackMode2 = FallbackMode.ALWAYS;
        int i22 = 10;
        ApiControllerParams.Fallback fallback22 = ApiControllerParams.Fallback.INSTANCE;
        if (fallbackMode == fallbackMode2) {
        }
        payload2 = payload;
        InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1 inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1222 = new InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1(this);
        FragmentActivity requireActivity222 = requireActivity();
        requireActivity222.getClass();
        Bundle bundle10222 = getArgs$1().bundle;
        if (bundle10222 == null) {
        }
        requireActivity222.getClass();
        FormBody.Builder builder222 = new FormBody.Builder();
        Application application222 = requireActivity222.getApplication();
        builder222.names = application222;
        if (string2 != null) {
        }
        context2 = null;
        builder222.values = context2;
        MarkwonImpl markwonImpl2222 = new MarkwonImpl(getViewModel$1().pictureLaunchResultLauncher, getViewModel$1().documentsSelectResultLauncher, getViewModel$1().selectFromPhotoLibraryLauncher);
        DocumentSelectLauncherModule documentSelectLauncherModule2222 = new DocumentSelectLauncherModule(getViewModel$1().documentSelectResultLauncher);
        o0 o0Var2222 = new o0(getViewModel$1().requestPermissionResultLauncher);
        CustomTabsLauncherModule customTabsLauncherModule3222 = new CustomTabsLauncherModule(getViewModel$1().passportNfcReaderLauncher, 3);
        CustomTabsLauncherModule customTabsLauncherModule22222 = new CustomTabsLauncherModule(getViewModel$1().customTabsLauncher, 0);
        Bundle bundle112222 = getArgs$1().bundle;
        if (bundle112222 != null) {
        }
        Bundle bundle122222 = getArgs$1().bundle;
        if (bundle122222 != null) {
        }
        Bundle bundle132222 = getArgs$1().bundle;
        if (bundle132222 != null) {
        }
        InquiryArguments args$12222 = getArgs$1();
        args$12222.getClass();
        StyleVariant.Companion companion2222 = StyleVariant.INSTANCE;
        Bundle bundle142222 = args$12222.bundle;
        StyleVariant fromValue2222 = companion2222.fromValue(bundle142222 != null ? bundle142222.getString("STYLE_VARIANT") : null);
        NetworkCoreModule networkCoreModule2222 = new NetworkCoreModule(z3, string8, string9, fromValue2222 != null ? fromValue2222.getValue() : null);
        Payload payload32222 = new Payload(dummyDataCollector);
        GooglePayConfig googlePayConfig2222 = new GooglePayConfig(str, str2, str3);
        Pool pool2222 = new Pool(inquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1222);
        bundle = getArgs$1().bundle;
        if (bundle != null) {
        }
        Bundle bundle152222 = getArgs$1().bundle;
        SharedModule sharedModule2222 = new SharedModule(z2, bundle152222 != null ? bundle152222.getBoolean("CONTROL_STATUS_BAR", z) : z);
        Payload payload42222 = new Payload(getViewModel$1().resolvableApiLauncher);
        TextSetter textSetter2222 = new TextSetter(fallbackMode, getArgs$1().getEnvironment(), getViewModel$1().savedStateHandle);
        SdkFilesManager sdkFilesManager2222 = getViewModel$1().sdkFilesManager;
        sdkFilesManager2222.getClass();
        MatchResult.Destructured destructured2222 = new MatchResult.Destructured();
        destructured2222.match = sdkFilesManager2222;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl2222 = new DaggerInquiryComponent$InquiryComponentImpl(networkCoreModule2222, googlePayConfig2222, documentSelectLauncherModule2222, new CameraHelper(), o0Var2222, destructured2222, builder222, customTabsLauncherModule22222, markwonImpl2222, new LinkResolverDef(19), customTabsLauncherModule3222, payload32222, textSetter2222, sharedModule2222, new y0(), payload2, pool2222, payload42222, new DeviceModule(), new FeatureFlagModule(), new TrackingEventsModule(str4));
        getViewModel$1().component = daggerInquiryComponent$InquiryComponentImpl2222;
        FontDownloader fontDownloader2222 = (FontDownloader) daggerInquiryComponent$InquiryComponentImpl2222.realFontDownloaderProvider.get();
        fontDownloader2222.getClass();
        FontDownloader.Companion._instance = fontDownloader2222;
        NfcTrackingEventsHolder.trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl2222.trackingEventsLogger();
    }

    public final InquiryArguments getArgs$1() {
        return (InquiryArguments) this.args$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.themedContext;
        return context == null ? super.getContext() : context;
    }

    public final Integer getTheme() {
        int i;
        if (requireActivity().getClass() != InquiryActivity.class) {
            Integer theme = getArgs$1().getTheme();
            i = (theme == null || theme.intValue() == 0) ? R.style.Persona_Inquiry_Theme : theme.intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public final InquiryViewModel getViewModel$1() {
        return (InquiryViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (requireActivity().getClass() != InquiryActivity.class) {
            context = new ContextThemeWrapper(context, getTheme().intValue());
        }
        this.themedContext = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCancelClick$inquiry_internal_release(InquiryWorkflow$Output.Cancel cancel) {
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl;
        ErrorReportingManager errorReportingManager;
        TrackingEventsLogger trackingEventsLogger;
        cancel.getClass();
        long currentTimeMillis = System.currentTimeMillis() - getViewModel$1().inquiryStartTimeMs;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl2 = getViewModel$1().component;
        if (daggerInquiryComponent$InquiryComponentImpl2 != null && (trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLogger()) != null) {
            TrackingEventsLogger.DefaultImpls.logInquiryEndEvent$default(trackingEventsLogger, InquiryEndReason.Cancel, currentTimeMillis, null, false, 12, null);
        }
        boolean z = cancel.skipBackendCall;
        String str = cancel.inquiryId;
        String str2 = cancel.sessionToken;
        int i = 1;
        Object[] objArr = 0;
        if (!z && str2 != null && (daggerInquiryComponent$InquiryComponentImpl = getViewModel$1().component) != null && (errorReportingManager = (ErrorReportingManager) daggerInquiryComponent$InquiryComponentImpl.errorReportingManagerProvider.get()) != null) {
            ContextScope contextScope = errorReportingManager.coroutineScope;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            JobKt.launch$default(contextScope, DefaultIoScheduler.INSTANCE, null, new ErrorReportingManager$reportErrors$1(errorReportingManager, str2, objArr == true ? 1 : 0, i), 2);
        }
        String requestKey = getArgs$1().getRequestKey();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        DisplayMetrics displayMetrics = ExtensionsKt.displayMetrics;
        if (str != null ? StringsKt__StringsJVMKt.startsWith(str, "inq_", true) : false) {
            bundle.putString("INQUIRY_ID_KEY", str);
            bundle.putString("SESSION_TOKEN_KEY", str2 != null ? StringsKt.substringAfter(str2, "Bearer ", str2) : null);
        }
        FragmentKt.setFragmentResult(bundle, this, requestKey);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext.getClass();
        Context context = this.themedContext;
        if (context == null) {
            context = requireContext;
        }
        createInquiryComponentIfNeeded(context);
        super.onCreate(bundle);
        ExceptionLogger exceptionLogger = (ExceptionLogger) DeflateUtils.getErrorHandler(requireContext).mTintList;
        exceptionLogger.getClass();
        new File(exceptionLogger.errDir, "last_error.txt").delete();
        Bundle bundle2 = getArgs$1().bundle;
        if (!(bundle2 != null ? bundle2.getBoolean("ENABLE_ERROR_LOGGING", true) : true)) {
            Bundle bundle3 = getArgs$1().bundle;
            if (!(bundle3 != null ? bundle3.getBoolean("CONSUME_EXCEPTIONS", false) : false)) {
                return;
            }
        }
        SdkFilesManager sdkFilesManager = getViewModel$1().sdkFilesManager;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new File[]{sdkFilesManager.sessionDir, sdkFilesManager.sessionCacheDir});
        listOf.getClass();
        TintInfo errorHandler = DeflateUtils.getErrorHandler(requireContext);
        synchronized (errorHandler) {
            if (!errorHandler.mHasTintMode) {
                errorHandler.mHasTintMode = true;
                Thread.setDefaultUncaughtExceptionHandler(new Z4$$ExternalSyntheticLambda1(errorHandler, Thread.getDefaultUncaughtExceptionHandler(), 1));
            }
        }
        errorHandler.mTintMode = listOf;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.pi2_inquiry_fragment, viewGroup, false);
        if (inflate != null) {
            return (FrameLayout) inflate;
        }
        a$$ExternalSyntheticBUOutline0.m$2("rootView");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context requireContext = requireContext();
        requireContext.getClass();
        TintInfo errorHandler = DeflateUtils.getErrorHandler(requireContext);
        synchronized (errorHandler) {
            if (errorHandler.mHasTintMode) {
                errorHandler.mHasTintList = false;
            }
        }
        getParentFragment();
        getActivity();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InquiryViewModel viewModel$1 = getViewModel$1();
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel$1), Dispatchers.Default, null, new InquiryViewModel$logUiLifecycle$1(false, viewModel$1, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        DeviceVendorIDProvider deviceVendorIDProvider;
        super.onResume();
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = getViewModel$1().component;
        if (daggerInquiryComponent$InquiryComponentImpl != null && (deviceVendorIDProvider = (DeviceVendorIDProvider) daggerInquiryComponent$InquiryComponentImpl.appSetIdHelperProvider.get()) != null) {
            ((RealDeviceVendorIDProvider) deviceVendorIDProvider).refreshDeviceVendorId();
        }
        InquiryViewModel viewModel$1 = getViewModel$1();
        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel$1), Dispatchers.Default, null, new InquiryViewModel$logUiLifecycle$1(true, viewModel$1, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        FontDownloader fontDownloader = FontDownloader.Companion._instance;
        fontDownloader.getClass();
        bundle.putParcelable("font_downloader_mapping", new RealFontDownloader.FontDownloaderState(((RealFontDownloader) fontDownloader).fontDownloaderMapping));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        requireContext.getClass();
        Lazy lazy = ThreatEventStateKt.threatEventReceiver$delegate;
        Context applicationContext = requireContext.getApplicationContext();
        Lazy lazy2 = ThreatEventStateKt.threatEventReceiver$delegate;
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) lazy2.getValue();
        if (((BroadcastReceiver) lazy2.getValue()) == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = ThreatEventState.knownThreatEventNames.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(broadcastReceiver, intentFilter, null, null, 4);
        } else {
            applicationContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        requireContext.getClass();
        Lazy lazy = ThreatEventStateKt.threatEventReceiver$delegate;
        Context applicationContext = requireContext.getApplicationContext();
        Lazy lazy2 = ThreatEventStateKt.threatEventReceiver$delegate;
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) lazy2.getValue();
        if (((BroadcastReceiver) lazy2.getValue()) == null) {
            return;
        }
        try {
            applicationContext.unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Map linkedHashMap;
        RealFontDownloader.FontDownloaderState fontDownloaderState;
        view.getClass();
        super.onViewCreated(view, bundle);
        try {
            if (validateArgumentsOrFinish$1()) {
                FontDownloader fontDownloader = FontDownloader.Companion._instance;
                fontDownloader.getClass();
                RealFontDownloader realFontDownloader = (RealFontDownloader) fontDownloader;
                if (bundle == null || (fontDownloaderState = (RealFontDownloader.FontDownloaderState) SizeKt.getParcelable(bundle, "font_downloader_mapping", RealFontDownloader.FontDownloaderState.class)) == null || (linkedHashMap = fontDownloaderState.fontDownloaderMapping) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                realFontDownloader.fontDownloaderMapping = linkedHashMap;
                getViewModel$1().init$inquiry_internal_release(this);
                SavedStateHandle.SavingStateLiveData savingStateLiveData = getViewModel$1().inquiryId;
                Bundle bundle2 = getArgs$1().bundle;
                Continuation continuation = null;
                savingStateLiveData.setValue(bundle2 != null ? bundle2.getString("INQUIRY_ID_KEY") : null);
                getViewModel$1().sessionToken.setValue(getArgs$1().getSessionToken());
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner.getLifecycle()), null, null, new HazeSourceNode$launchPreDraw$1(this, continuation, 18), 3);
                createAndLaunchInquiry(false);
                getParentFragment();
                getActivity();
            }
        } catch (Exception e) {
            Bundle bundle3 = getArgs$1().bundle;
            if (!(bundle3 != null ? bundle3.getBoolean("CONSUME_EXCEPTIONS", false) : false)) {
                throw e;
            }
            Bundle bundle4 = getArgs$1().bundle;
            if (bundle4 != null ? bundle4.getBoolean("ENABLE_ERROR_LOGGING", true) : true) {
                Context requireContext = requireContext();
                requireContext.getClass();
                DeflateUtils.getErrorHandler(requireContext).recordError(e);
            }
            String requestKey = getArgs$1().getRequestKey();
            Bundle bundle5 = new Bundle();
            bundle5.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle5.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle5.putParcelable("ERROR_CODE_KEY", ErrorCode.ExceptionError);
            FragmentKt.setFragmentResult(bundle5, this, requestKey);
        }
    }

    public final boolean validateArgumentsOrFinish$1() {
        String sessionToken = getArgs$1().getSessionToken();
        if (sessionToken == null || !StringsKt.contains((CharSequence) sessionToken, '\n', false)) {
            return true;
        }
        String requestKey = getArgs$1().getRequestKey();
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.SessionTokenError);
        FragmentKt.setFragmentResult(bundle, this, requestKey);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        parentFragmentManager.enqueueAction(parentFragmentManager.new PopBackStackState(null, -1, 0), false);
        return false;
    }
}
