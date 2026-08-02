package com.withpersona.sdk2.inquiry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import coil3.size.SizeKt;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import com.withpersona.sdk2.inquiry.error_reporting.ExceptionLogger;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldsMap;
import com.withpersona.sdk2.inquiry.internal.InquiryIntentKeys$Status;
import com.withpersona.sdk2.inquiry.internal.InquiryManager;
import com.withpersona.sdk2.inquiry.types.collected_data.CollectedData;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u00020\u0001:\u000234Bå\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\rH\u0007J\b\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0015\u0010/\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry;", "", "templateId", "", "templateVersion", "inquiryId", "sessionToken", "oneTimeLinkCode", "referenceId", "accountId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "theme", "", "environment", "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "enableErrorLogging", "", "returnCollectedData", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "useServerStyles", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "themeSetId", "locale", "styleVariant", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "consumeExceptions", "redirectUri", "shareToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StyleVariant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "start", "", "activity", "Landroid/app/Activity;", "requestCode", "buildInlineInquiry", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "toInquiryActivityIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "addArgumentsToBundle", "bundle", "Landroid/os/Bundle;", "addArgumentsToBundle$inquiry_dynamic_feature_release", "Contract", "Companion", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Inquiry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final Boolean consumeExceptions;
    private final Boolean enableErrorLogging;
    private final Environment environment;
    private final String environmentId;
    private final FallbackMode fallbackMode;
    private final Fields fields;
    private final String inquiryId;
    private final String locale;
    private final String oneTimeLinkCode;
    private final String redirectUri;
    private final String referenceId;
    private final Boolean returnCollectedData;
    private final String sessionToken;
    private final String shareToken;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private final StyleVariant styleVariant;
    private final String templateId;
    private final String templateVersion;
    private final Integer theme;
    private final String themeSetId;
    private final Boolean useServerStyles;

    public Inquiry(String str, String str2, String str3, String str4, String str5, String str6, String str7, Fields fields, Integer num, Environment environment, String str8, Boolean bool, Boolean bool2, FallbackMode fallbackMode, Boolean bool3, StaticInquiryTemplate staticInquiryTemplate, String str9, String str10, StyleVariant styleVariant, Boolean bool4, String str11, String str12) {
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.oneTimeLinkCode = str5;
        this.referenceId = str6;
        this.accountId = str7;
        this.fields = fields;
        this.theme = num;
        this.environment = environment;
        this.environmentId = str8;
        this.enableErrorLogging = bool;
        this.returnCollectedData = bool2;
        this.fallbackMode = fallbackMode;
        this.useServerStyles = bool3;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.themeSetId = str9;
        this.locale = str10;
        this.styleVariant = styleVariant;
        this.consumeExceptions = bool4;
        this.redirectUri = str11;
        this.shareToken = str12;
    }

    public static final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
        return INSTANCE.extractInquiryResponseFromBundle(bundle, context);
    }

    public static final InquiryBuilder fromInquiry(String str) {
        return INSTANCE.fromInquiry(str);
    }

    public static final InquiryBuilder fromOneTimeLinkCode(String str) {
        return INSTANCE.fromOneTimeLinkCode(str);
    }

    public static final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
        return INSTANCE.fromStaticTemplate(staticInquiryTemplate);
    }

    public static final InquiryTemplateBuilder fromTemplate(String str) {
        return INSTANCE.fromTemplate(str);
    }

    public static final InquiryTemplateBuilder fromTemplateVersion(String str) {
        return INSTANCE.fromTemplateVersion(str);
    }

    @Deprecated
    public static final InquiryResponse onActivityResult(Intent intent) {
        return INSTANCE.onActivityResult(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent toInquiryActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.withpersona.sdk2.inquiry.internal.InquiryActivity");
        Bundle bundle = new Bundle();
        addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        intent.replaceExtras(bundle);
        return intent;
    }

    public final void addArgumentsToBundle$inquiry_dynamic_feature_release(Bundle bundle) {
        bundle.getClass();
        String str = this.templateId;
        if (str != null) {
            bundle.putString("TEMPLATE_ID_KEY", str);
        }
        String str2 = this.templateVersion;
        if (str2 != null) {
            bundle.putString("TEMPLATE_VERSION_KEY", str2);
        }
        String str3 = this.inquiryId;
        if (str3 != null) {
            bundle.putString("INQUIRY_ID_KEY", str3);
        }
        String str4 = this.oneTimeLinkCode;
        if (str4 != null) {
            bundle.putString("ONE_TIME_LINK_CODE", str4);
        }
        String str5 = this.sessionToken;
        if (str5 != null) {
            bundle.putString("SESSION_TOKEN_KEY", str5);
        }
        String str6 = this.referenceId;
        if (str6 != null) {
            bundle.putString("REFERENCE_ID_KEY", str6);
        }
        String str7 = this.accountId;
        if (str7 != null) {
            bundle.putString("ACCOUNT_ID_KEY", str7);
        }
        Fields fields = this.fields;
        if (fields != null) {
            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(fields.getFields$inquiry_dynamic_feature_release()));
        }
        Integer num = this.theme;
        if (num != null) {
            bundle.putInt("THEME_KEY", num.intValue());
        }
        StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
        if (staticInquiryTemplate != null) {
            bundle.putParcelable("STATIC_INQUIRY_TEMPLATE_KEY", staticInquiryTemplate);
        }
        Environment environment = this.environment;
        if (environment != null) {
            bundle.putString("ENVIRONMENT_KEY", environment.name());
        }
        String str8 = this.environmentId;
        if (str8 != null) {
            bundle.putString("ENVIRONMENT_ID_KEY", str8);
        }
        Boolean bool = this.enableErrorLogging;
        if (bool != null) {
            bundle.putBoolean("ENABLE_ERROR_LOGGING", bool.booleanValue());
        }
        Boolean bool2 = this.returnCollectedData;
        if (bool2 != null) {
            bundle.putBoolean("RETURN_COLLECTED_DATA", bool2.booleanValue());
        }
        FallbackMode fallbackMode = this.fallbackMode;
        if (fallbackMode != null) {
            bundle.putString("FALLBACK_MODE", fallbackMode.name());
        }
        Boolean bool3 = this.useServerStyles;
        if (bool3 != null) {
            bundle.putBoolean("USE_SERVER_STYLES", bool3.booleanValue());
        }
        String str9 = this.themeSetId;
        if (str9 != null) {
            bundle.putString("THEME_SET_ID_KEY", str9);
        }
        String str10 = this.locale;
        if (str10 != null) {
            bundle.putString("LOCALE", str10);
        }
        StyleVariant styleVariant = this.styleVariant;
        if (styleVariant != null) {
            bundle.putString("STYLE_VARIANT", styleVariant.getValue());
        }
        Boolean bool4 = this.consumeExceptions;
        if (bool4 != null) {
            bundle.putBoolean("CONSUME_EXCEPTIONS", bool4.booleanValue());
        }
        String str11 = this.redirectUri;
        if (str11 != null) {
            bundle.putString("REDIRECT_URI", str11);
        }
        String str12 = this.shareToken;
        if (str12 != null) {
            bundle.putString("SHARE_TOKEN", str12);
        }
    }

    public final InlineInquiryBuilder buildInlineInquiry() {
        return new InlineInquiryBuilder(this);
    }

    @Deprecated
    public final void start(Activity activity, int requestCode) {
        activity.getClass();
        activity.startActivityForResult(toInquiryActivityIntent(activity), requestCode);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007J\u001e\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u001c\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0018\u0010&\u001a\u00020'*\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R.\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;", "", "<init>", "()V", "fromTemplate", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "templateId", "", "fromTemplateVersion", "templateVersion", "fromStaticTemplate", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "fromInquiry", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "inquiryId", "fromOneTimeLinkCode", "oneTimeLinkCode", "onActivityResult", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extractInquiryResponseFromBundle", "bundle", "Landroid/os/Bundle;", "prefetchModels", "", "cancelRunningInquiries", "value", "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "onEventListener", "getOnEventListener$annotations", "getOnEventListener", "()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;", "setOnEventListener", "(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V", "getStatus", "Lcom/withpersona/sdk2/inquiry/internal/InquiryIntentKeys$Status;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InquiryIntentKeys$Status.values().length];
                try {
                    InquiryIntentKeys$Status inquiryIntentKeys$Status = InquiryIntentKeys$Status.INQUIRY_CANCELED;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    InquiryIntentKeys$Status inquiryIntentKeys$Status2 = InquiryIntentKeys$Status.INQUIRY_CANCELED;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    InquiryIntentKeys$Status inquiryIntentKeys$Status3 = InquiryIntentKeys$Status.INQUIRY_CANCELED;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getOnEventListener$annotations() {
        }

        private final InquiryIntentKeys$Status getStatus(Bundle bundle, Context context) {
            String string2;
            InquiryIntentKeys$Status inquiryIntentKeys$Status = null;
            if (bundle != null && (string2 = bundle.getString("PERSONA_ACTIVITY_RESULT")) != null) {
                try {
                    inquiryIntentKeys$Status = InquiryIntentKeys$Status.valueOf(string2);
                } catch (Exception unused) {
                }
            }
            if (inquiryIntentKeys$Status != null) {
                return inquiryIntentKeys$Status;
            }
            if (context != null && new File(new ExceptionLogger(context).errDir, "last_error.txt").exists()) {
                return InquiryIntentKeys$Status.INQUIRY_ERROR;
            }
            return InquiryIntentKeys$Status.INQUIRY_CANCELED;
        }

        public static /* synthetic */ InquiryResponse onActivityResult$default(Companion companion, Intent intent, Context context, int i, Object obj) {
            if ((i & 2) != 0) {
                context = null;
            }
            return companion.onActivityResult(intent, context);
        }

        public final void cancelRunningInquiries() {
            InquiryActivityBroadcastManager.cancelRunningInquiries$default(InquiryActivityBroadcastManager.INSTANCE, false, 1, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #1 {Exception -> 0x008d, blocks: (B:41:0x007b, B:30:0x008a), top: B:40:0x007b }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
            InquiryFieldsMap inquiryFieldsMap;
            String str;
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3;
            InquiryIntentKeys$Status status = getStatus(bundle, context);
            String string2 = bundle != null ? bundle.getString("INQUIRY_ID_KEY") : null;
            int ordinal = status.ordinal();
            if (ordinal == 0) {
                if (bundle == null || (inquiryFieldsMap = (InquiryFieldsMap) SizeKt.getParcelable(bundle, "FIELDS_MAP_KEY", InquiryFieldsMap.class)) == null) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    inquiryFieldsMap = new InquiryFieldsMap(emptyMap);
                }
                String string3 = bundle != null ? bundle.getString("INQUIRY_STATUS_KEY") : null;
                CollectedData collectedData = bundle != null ? (CollectedData) SizeKt.getParcelable(bundle, "COLLECTED_DATA", CollectedData.class) : null;
                string2.getClass();
                string3.getClass();
                return new InquiryResponse.Complete(string2, string3, inquiryFieldsMap.fields, collectedData);
            }
            if (ordinal == 1) {
                return new InquiryResponse.Cancel(string2, bundle != null ? bundle.getString("SESSION_TOKEN_KEY") : null);
            }
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String string4 = bundle != null ? bundle.getString("ERROR_DEBUG_MESSAGE_KEY") : null;
            if (context != null) {
                File file = new File(new ExceptionLogger(context).errDir, "last_error.txt");
                if (file.exists() && file.isFile()) {
                    byte[] bArr = new byte[PKIFailureInfo.certRevoked];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    FileInputStream fileInputStream = new FileInputStream(file);
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    Charset charset = ExceptionLogger.UTF_8;
                    charset.getClass();
                    str = new String(byteArray, charset);
                    fileInputStream.close();
                    if (bundle == null) {
                        try {
                            errorCode = (ErrorCode) bundle.getParcelable("ERROR_CODE_KEY");
                        } catch (Exception unused) {
                            errorCode2 = ErrorCode.UnexpectedError;
                        }
                    } else {
                        errorCode = null;
                    }
                    errorCode3 = errorCode != null ? errorCode : null;
                    if (errorCode3 == null) {
                        errorCode3 = ErrorCode.UnexpectedError;
                    }
                    errorCode2 = errorCode3;
                    if (string4 == null) {
                        string4 = "An otherwise unexpected error occurred.";
                    }
                    return new InquiryResponse.Error(string4, errorCode2, str);
                }
            }
            str = null;
            if (bundle == null) {
            }
            if (errorCode != null) {
            }
            if (errorCode3 == null) {
            }
            errorCode2 = errorCode3;
            if (string4 == null) {
            }
            return new InquiryResponse.Error(string4, errorCode2, str);
        }

        public final InquiryBuilder fromInquiry(String inquiryId) {
            inquiryId.getClass();
            return InquiryBuilder.INSTANCE.fromInquiryId$inquiry_dynamic_feature_release(inquiryId);
        }

        public final InquiryBuilder fromOneTimeLinkCode(String oneTimeLinkCode) {
            oneTimeLinkCode.getClass();
            return InquiryBuilder.INSTANCE.fromOneTimeLinkCode$inquiry_dynamic_feature_release(oneTimeLinkCode);
        }

        public final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
            staticInquiryTemplate.getClass();
            return new InquiryTemplateBuilder(null, null, staticInquiryTemplate, 3, null);
        }

        public final InquiryTemplateBuilder fromTemplate(String templateId) {
            templateId.getClass();
            return new InquiryTemplateBuilder(templateId, null, null, 6, null);
        }

        public final InquiryTemplateBuilder fromTemplateVersion(String templateVersion) {
            templateVersion.getClass();
            return new InquiryTemplateBuilder(null, templateVersion, null, 5, null);
        }

        public final OnInquiryEventListener getOnEventListener() {
            return (OnInquiryEventListener) InquiryManager.Companion.getInstance().onEventListener;
        }

        @Deprecated
        public final InquiryResponse onActivityResult(Intent intent, Context context) {
            return extractInquiryResponseFromBundle(intent != null ? intent.getExtras() : null, context);
        }

        public final void prefetchModels() {
            try {
                Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance().getClass();
                throw new ClassCastException();
            } catch (ClassNotFoundException unused) {
            }
        }

        public final void setOnEventListener(OnInquiryEventListener onInquiryEventListener) {
            InquiryManager.Companion.getInstance().onEventListener = onInquiryEventListener;
        }

        private Companion() {
        }

        @Deprecated
        public final InquiryResponse onActivityResult(Intent intent) {
            return onActivityResult$default(this, intent, null, 2, null);
        }
    }

    @Deprecated
    public static final InquiryResponse onActivityResult(Intent intent, Context context) {
        return INSTANCE.onActivityResult(intent, context);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "<init>", "()V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createIntent", "Landroid/content/Intent;", "input", "parseResult", "resultCode", "", "intent", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Contract extends ActivityResultContract<Inquiry, InquiryResponse> {
        private Context context;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Contract(Context context) {
            this();
            context.getClass();
            this.context = context;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Inquiry input) {
            context.getClass();
            input.getClass();
            return input.toInquiryActivityIntent(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public InquiryResponse parseResult(int resultCode, Intent intent) {
            return Inquiry.INSTANCE.onActivityResult(intent, this.context);
        }

        @Deprecated
        public Contract() {
        }
    }
}
