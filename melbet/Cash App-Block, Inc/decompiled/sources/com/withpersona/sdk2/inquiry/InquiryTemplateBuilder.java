package com.withpersona.sdk2.inquiry;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u0012\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0003J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u0006\u0010&\u001a\u00020'J\u000f\u0010(\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010)R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "", "templateId", "", "templateVersion", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "accountId", "referenceId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "theme", "", "Ljava/lang/Integer;", "userProvidedTheme", "", "themeSetId", "environment", "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "enableErrorLogging", "Ljava/lang/Boolean;", "returnCollectedData", "fallbackMode", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "useServerStyles", "locale", "styleVariant", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "consumeExceptions", "redirectUri", "shareToken", "fromTemplateId", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "routingCountry", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "resolveTheme", "()Ljava/lang/Integer;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryTemplateBuilder {
    private String accountId;
    private Boolean consumeExceptions;
    private Boolean enableErrorLogging;
    private Environment environment;
    private String environmentId;
    private FallbackMode fallbackMode;
    private Fields fields;
    private String locale;
    private String redirectUri;
    private String referenceId;
    private Boolean returnCollectedData;
    private String shareToken;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private StyleVariant styleVariant;
    private final String templateId;
    private final String templateVersion;
    private Integer theme;
    private String themeSetId;
    private Boolean useServerStyles;
    private boolean userProvidedTheme;

    public /* synthetic */ InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : staticInquiryTemplate);
    }

    private final Integer resolveTheme() {
        if (!this.userProvidedTheme && this.styleVariant == StyleVariant.DARK) {
            return Integer.valueOf(com.squareup.cash.R.style.Base_Persona_Inquiry2_Theme_Dark);
        }
        return this.theme;
    }

    public final InquiryTemplateBuilder accountId(String accountId) {
        this.referenceId = null;
        this.accountId = accountId;
        return this;
    }

    public final Inquiry build() {
        return new Inquiry(this.templateId, this.templateVersion, null, null, null, this.referenceId, this.accountId, this.fields, resolveTheme(), this.environment, this.environmentId, this.enableErrorLogging, this.returnCollectedData, this.fallbackMode, this.useServerStyles, this.staticInquiryTemplate, this.themeSetId, this.locale, this.styleVariant, this.consumeExceptions, this.redirectUri, this.shareToken);
    }

    public final InquiryTemplateBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    public final InquiryTemplateBuilder enableErrorLogging(boolean enableErrorLogging) {
        this.enableErrorLogging = Boolean.valueOf(enableErrorLogging);
        return this;
    }

    public final InquiryTemplateBuilder environment(Environment environment) {
        environment.getClass();
        this.environment = environment;
        return this;
    }

    public final InquiryTemplateBuilder environmentId(String environmentId) {
        environmentId.getClass();
        this.environmentId = environmentId;
        return this;
    }

    @ExperimentalFallbackMode
    public final InquiryTemplateBuilder fallbackMode(FallbackMode fallbackMode) {
        fallbackMode.getClass();
        this.fallbackMode = fallbackMode;
        return this;
    }

    public final InquiryTemplateBuilder fields(Fields fields) {
        this.fields = fields;
        return this;
    }

    public final InquiryTemplateBuilder fromTemplateId(String templateId) {
        templateId.getClass();
        return new InquiryTemplateBuilder(templateId, null, null, 6, null);
    }

    public final InquiryTemplateBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public final InquiryTemplateBuilder redirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    public final InquiryTemplateBuilder referenceId(String referenceId) {
        this.accountId = null;
        this.referenceId = referenceId;
        return this;
    }

    public final InquiryTemplateBuilder returnCollectedData(boolean returnCollectedData) {
        this.returnCollectedData = Boolean.valueOf(returnCollectedData);
        return this;
    }

    @Deprecated
    public final InquiryTemplateBuilder routingCountry(String routingCountry) {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if ((r3.length() > 0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InquiryTemplateBuilder shareToken(String shareToken) {
        if (shareToken != null) {
        }
        shareToken = null;
        this.shareToken = shareToken;
        return this;
    }

    public final InquiryTemplateBuilder styleVariant(StyleVariant styleVariant) {
        this.styleVariant = styleVariant;
        return this;
    }

    public final InquiryTemplateBuilder theme(ThemeSource themeSource) {
        themeSource.getClass();
        this.theme = themeSource.getTheme();
        this.userProvidedTheme = themeSource.getTheme() != null;
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }

    @ExperimentalThemeSetId
    public final InquiryTemplateBuilder themeSetId(String themeSetId) {
        themeSetId.getClass();
        this.themeSetId = themeSetId;
        return this;
    }

    public InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate) {
        this.templateId = str;
        this.templateVersion = str2;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.fallbackMode = FallbackMode.NEVER;
    }

    public InquiryTemplateBuilder() {
        this(null, null, null, 7, null);
    }

    @Deprecated
    public final InquiryTemplateBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.userProvidedTheme = true;
        this.useServerStyles = Boolean.FALSE;
        return this;
    }
}
