package sqip.internal.event;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.NotNullVar;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import okhttp3.Response;
import sqip.InAppPaymentsSdk;
import sqip.internal.ApkInfo;
import sqip.internal.HttpModule;
import sqip.internal.event.EventModule;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lsqip/internal/event/EventLogger;", "", "log", "", BreadcrumbHelper.Category.EVENT, "Lsqip/internal/event/IapEvent;", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "updateCustomThemeAttributes", "customThemeAttributes", "", "uploadLogs", "Real", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface EventLogger {
    void log(IapEvent event);

    void onRestoreInstanceState(Bundle savedInstanceState);

    void onSaveInstanceState(Bundle outState);

    void updateCustomThemeAttributes(String customThemeAttributes);

    void uploadLogs();

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013BI\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020!H\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020!H\u0016J\u0016\u00100\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\b02H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\b0\u001dj\b\u0012\u0004\u0012\u00020\b`\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lsqip/internal/event/EventLogger$Real;", "Lsqip/internal/event/EventLogger;", "eventStreamService", "Lsqip/internal/event/EventStreamService;", "eventsUploadExecutor", "Ljava/util/concurrent/ExecutorService;", "eventJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/event/IapEventJsonData;", "resources", "Landroid/content/res/Resources;", "apkInfo", "Lsqip/internal/ApkInfo;", "locale", "Ljava/util/Locale;", "squareDeviceId", "", "(Lsqip/internal/event/EventStreamService;Ljava/util/concurrent/ExecutorService;Lcom/squareup/moshi/JsonAdapter;Landroid/content/res/Resources;Lsqip/internal/ApkInfo;Ljava/util/Locale;Ljava/lang/String;)V", "customThemeAttributes", "<set-?>", "", Real.EVENT_ORDER_KEY, "getEventOrder", "()I", "setEventOrder", "(I)V", "eventOrder$delegate", "Lkotlin/properties/ReadWriteProperty;", Real.JSON_DATA_EVENTS_KEY, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Real.SESSION_UUID_KEY, "checkMainThread", "", "log", BreadcrumbHelper.Category.EVENT, "Lsqip/internal/event/IapEvent;", "onRestoreInstanceState", "bundle", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "orientation", "displayMetrics", "Landroid/util/DisplayMetrics;", "reset", "updateCustomThemeAttributes", "uploadLogs", "uploadLogsInBackground", "eventsCopy", "", "Companion", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Real implements EventLogger {
        public static final String CATALOG_NAME = "sqip_card_entry_android";
        public static final String JSON_DATA_EVENTS_KEY = "jsonDataEvents";
        public static final String SESSION_UUID_KEY = "sessionUuid";
        private final ApkInfo apkInfo;
        private String customThemeAttributes;
        private final JsonAdapter eventJsonAdapter;

        /* renamed from: eventOrder$delegate, reason: from kotlin metadata */
        private final ReadWriteProperty eventOrder;
        private final EventStreamService eventStreamService;
        private final ExecutorService eventsUploadExecutor;
        private ArrayList<IapEventJsonData> jsonDataEvents;
        private final Locale locale;
        private final Resources resources;
        private String sessionUuid;
        private final String squareDeviceId;
        public static final String EVENT_ORDER_KEY = "eventOrder";
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.mutableProperty1(new MutablePropertyReference1Impl(Real.class, EVENT_ORDER_KEY, "getEventOrder()I", 0))};

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final String processUuid = Boxes$$ExternalSyntheticOutline1.m();

        public Real(EventStreamService eventStreamService, @EventModule.Events ExecutorService executorService, JsonAdapter jsonAdapter, Resources resources, ApkInfo apkInfo, Locale locale, @HttpModule.SquareDeviceId String str) {
            eventStreamService.getClass();
            executorService.getClass();
            jsonAdapter.getClass();
            resources.getClass();
            apkInfo.getClass();
            locale.getClass();
            str.getClass();
            this.eventStreamService = eventStreamService;
            this.eventsUploadExecutor = executorService;
            this.eventJsonAdapter = jsonAdapter;
            this.resources = resources;
            this.apkInfo = apkInfo;
            this.locale = locale;
            this.squareDeviceId = str;
            Delegates.INSTANCE.getClass();
            this.eventOrder = new NotNullVar();
            this.sessionUuid = Boxes$$ExternalSyntheticOutline1.m();
            reset();
        }

        private final void checkMainThread() {
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Must be called from the main thread.");
        }

        private final int getEventOrder() {
            return ((Number) this.eventOrder.getValue(this, $$delegatedProperties[0])).intValue();
        }

        private final String orientation(DisplayMetrics displayMetrics) {
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            return i > i2 ? "portrait" : i < i2 ? "landscape" : "square";
        }

        private final void reset() {
            this.jsonDataEvents = new ArrayList<>();
            setEventOrder(0);
        }

        private final void setEventOrder(int i) {
            this.eventOrder.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void uploadLogsInBackground(List<IapEventJsonData> eventsCopy) {
            List<IapEventJsonData> list = eventsCopy;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (IapEventJsonData iapEventJsonData : list) {
                String json = this.eventJsonAdapter.toJson(iapEventJsonData);
                long micros = TimeUnit.MILLISECONDS.toMicros(iapEventJsonData.getRecordedAtMs());
                json.getClass();
                arrayList.add(new JsonDataEventWrapper(CATALOG_NAME, micros, json, null, null, null, null, 120, null));
            }
            try {
                Response response = this.eventStreamService.logEvents(new LogEventsRequest(arrayList, false, 2, null)).execute().rawResponse;
            } catch (IOException unused) {
            }
        }

        @Override // sqip.internal.event.EventLogger
        public void log(IapEvent event) {
            event.getClass();
            setEventOrder(getEventOrder() + 1);
            DisplayMetrics displayMetrics = this.resources.getDisplayMetrics();
            TimeZone timeZone = TimeZone.getDefault();
            String flowType = event.getFlowType();
            String squareApplicationId = InAppPaymentsSdk.getSquareApplicationId();
            String country = this.locale.getCountry();
            String language = this.locale.getLanguage();
            String str = this.squareDeviceId;
            boolean hasFlutterPlugin = this.apkInfo.getHasFlutterPlugin();
            boolean hasFlutter = this.apkInfo.getHasFlutter();
            boolean hasReactNative = this.apkInfo.getHasReactNative();
            boolean hasReactNativePlugin = this.apkInfo.getHasReactNativePlugin();
            displayMetrics.getClass();
            String orientation = orientation(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            String id = timeZone.getID();
            boolean debuggable = this.apkInfo.getDebuggable();
            String packageName = this.apkInfo.getPackageName();
            String versionName = this.apkInfo.getVersionName();
            int versionCode = this.apkInfo.getVersionCode();
            int targetSdkVersion = this.apkInfo.getTargetSdkVersion();
            int minSdkVersion = this.apkInfo.getMinSdkVersion();
            int i3 = displayMetrics.densityDpi;
            long apkSize = this.apkInfo.getApkSize();
            boolean usesAndroidX = this.apkInfo.getUsesAndroidX();
            String str2 = processUuid;
            String name = event.getName();
            String str3 = this.sessionUuid;
            int eventOrder = getEventOrder();
            String str4 = this.customThemeAttributes;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customThemeAttributes");
                throw null;
            }
            String validationErrorField = event.getValidationErrorField();
            String nonceErrorCode = event.getNonceErrorCode();
            String appErrorMessage = event.getAppErrorMessage();
            int amount = event.getAmount();
            String buyerAction = event.getBuyerAction();
            String emptyContactFields = event.getEmptyContactFields();
            String currencyCode = event.getCurrencyCode();
            String locationId = event.getLocationId();
            int challengesCompleted = event.getChallengesCompleted();
            int totalChallenges = event.getTotalChallenges();
            String errorCode = event.getErrorCode();
            String errorDescription = event.getErrorDescription();
            boolean hasChallengedUser = event.getHasChallengedUser();
            long verificationDuration = event.getVerificationDuration();
            String threeDSTransactionStatus = event.getThreeDSTransactionStatus();
            String threeDSChallengeType = event.getThreeDSChallengeType();
            String threeDSVerificationToken = event.getThreeDSVerificationToken();
            String threeDSServerTransactionID = event.getThreeDSServerTransactionID();
            String threeDSWarningSeverity = event.getThreeDSWarningSeverity();
            String threeDSWarningCode = event.getThreeDSWarningCode();
            String threeDSWarningDescription = event.getThreeDSWarningDescription();
            country.getClass();
            language.getClass();
            id.getClass();
            IapEventJsonData iapEventJsonData = new IapEventJsonData(0L, squareApplicationId, country, language, str, hasFlutterPlugin, hasFlutter, hasReactNative, hasReactNativePlugin, orientation, i, i2, id, debuggable, false, packageName, versionName, versionCode, targetSdkVersion, minSdkVersion, i3, apkSize, usesAndroidX, str2, name, str3, eventOrder, str4, validationErrorField, nonceErrorCode, appErrorMessage, flowType, amount, buyerAction, emptyContactFields, currencyCode, locationId, challengesCompleted, totalChallenges, errorCode, errorDescription, hasChallengedUser, verificationDuration, threeDSTransactionStatus, threeDSChallengeType, threeDSVerificationToken, threeDSServerTransactionID, threeDSWarningSeverity, threeDSWarningCode, threeDSWarningDescription, null, 0, null, null, null, null, 1, 16515072, null);
            ArrayList<IapEventJsonData> arrayList = this.jsonDataEvents;
            if (arrayList != null) {
                arrayList.add(iapEventJsonData);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(JSON_DATA_EVENTS_KEY);
                throw null;
            }
        }

        @Override // sqip.internal.event.EventLogger
        public void onRestoreInstanceState(Bundle bundle) {
            bundle.getClass();
            ArrayList<IapEventJsonData> parcelableArrayList = bundle.getParcelableArrayList(JSON_DATA_EVENTS_KEY);
            parcelableArrayList.getClass();
            this.jsonDataEvents = parcelableArrayList;
            setEventOrder(bundle.getInt(EVENT_ORDER_KEY));
            String string2 = bundle.getString(SESSION_UUID_KEY);
            string2.getClass();
            this.sessionUuid = string2;
        }

        @Override // sqip.internal.event.EventLogger
        public void onSaveInstanceState(Bundle outState) {
            outState.getClass();
            ArrayList<IapEventJsonData> arrayList = this.jsonDataEvents;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException(JSON_DATA_EVENTS_KEY);
                throw null;
            }
            outState.putParcelableArrayList(JSON_DATA_EVENTS_KEY, arrayList);
            outState.putInt(EVENT_ORDER_KEY, getEventOrder());
            outState.putString(SESSION_UUID_KEY, this.sessionUuid);
        }

        @Override // sqip.internal.event.EventLogger
        public void updateCustomThemeAttributes(String customThemeAttributes) {
            customThemeAttributes.getClass();
            this.customThemeAttributes = customThemeAttributes;
        }

        @Override // sqip.internal.event.EventLogger
        public void uploadLogs() {
            checkMainThread();
            ArrayList<IapEventJsonData> arrayList = this.jsonDataEvents;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException(JSON_DATA_EVENTS_KEY);
                throw null;
            }
            reset();
            this.eventsUploadExecutor.execute(new r6$$ExternalSyntheticLambda0(21, this, arrayList));
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsqip/internal/event/EventLogger$Real$Companion;", "", "()V", "CATALOG_NAME", "", "EVENT_ORDER_KEY", "JSON_DATA_EVENTS_KEY", "SESSION_UUID_KEY", "processUuid", "getProcessUuid", "()Ljava/lang/String;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String getProcessUuid() {
                return Real.processUuid;
            }

            private Companion() {
            }
        }
    }
}
