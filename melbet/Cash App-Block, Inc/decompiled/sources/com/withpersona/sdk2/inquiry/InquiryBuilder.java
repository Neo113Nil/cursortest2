package com.withpersona.sdk2.inquiry;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "", "<init>", "()V", "inquiryId", "", "oneTimeLinkCode", "theme", "", "Ljava/lang/Integer;", "userProvidedTheme", "", "sessionToken", "useServerStyles", "Ljava/lang/Boolean;", "locale", "styleVariant", "Lcom/withpersona/sdk2/inquiry/StyleVariant;", "consumeExceptions", "redirectUri", "shareToken", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "routingCountry", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "resolveTheme", "()Ljava/lang/Integer;", "Companion", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Boolean consumeExceptions;
    private String inquiryId;
    private String locale;
    private String oneTimeLinkCode;
    private String redirectUri;
    private String sessionToken;
    private String shareToken;
    private StyleVariant styleVariant;
    private Integer theme;
    private Boolean useServerStyles;
    private boolean userProvidedTheme;

    private final Integer resolveTheme() {
        if (!this.userProvidedTheme && this.styleVariant == StyleVariant.DARK) {
            return Integer.valueOf(com.squareup.cash.R.style.Base_Persona_Inquiry2_Theme_Dark);
        }
        return this.theme;
    }

    public final Inquiry build() {
        String str = this.inquiryId;
        String str2 = this.oneTimeLinkCode;
        String str3 = this.sessionToken;
        Integer resolveTheme = resolveTheme();
        String str4 = this.inquiryId;
        return new Inquiry(null, null, str, str3, str2, null, null, null, resolveTheme, null, null, null, null, (str4 == null || !StringsKt__StringsJVMKt.startsWith(str4, "iqfs", false)) ? FallbackMode.NEVER : FallbackMode.ALWAYS, this.useServerStyles, null, null, this.locale, this.styleVariant, this.consumeExceptions, this.redirectUri, this.shareToken);
    }

    public final InquiryBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    public final InquiryBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public final InquiryBuilder redirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    @Deprecated
    public final InquiryBuilder routingCountry(String routingCountry) {
        return this;
    }

    public final InquiryBuilder sessionToken(String sessionToken) {
        if (sessionToken != null && sessionToken.length() != 0) {
            this.sessionToken = sessionToken;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if ((r3.length() > 0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InquiryBuilder shareToken(String shareToken) {
        if (shareToken != null) {
        }
        shareToken = null;
        this.shareToken = shareToken;
        return this;
    }

    public final InquiryBuilder styleVariant(StyleVariant styleVariant) {
        this.styleVariant = styleVariant;
        return this;
    }

    public final InquiryBuilder theme(ThemeSource themeSource) {
        themeSource.getClass();
        this.theme = themeSource.getTheme();
        this.userProvidedTheme = themeSource.getTheme() != null;
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;", "", "<init>", "()V", "fromInquiryId", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "inquiryId", "", "fromInquiryId$inquiry_dynamic_feature_release", "fromOneTimeLinkCode", "code", "fromOneTimeLinkCode$inquiry_dynamic_feature_release", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InquiryBuilder fromInquiryId$inquiry_dynamic_feature_release(String inquiryId) {
            inquiryId.getClass();
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.inquiryId = inquiryId;
            return inquiryBuilder;
        }

        public final InquiryBuilder fromOneTimeLinkCode$inquiry_dynamic_feature_release(String code) {
            code.getClass();
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.oneTimeLinkCode = code;
            return inquiryBuilder;
        }

        private Companion() {
        }
    }

    @Deprecated
    public final InquiryBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.userProvidedTheme = true;
        this.useServerStyles = Boolean.FALSE;
        return this;
    }
}
