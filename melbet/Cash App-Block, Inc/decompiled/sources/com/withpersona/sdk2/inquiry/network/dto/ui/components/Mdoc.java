package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonComponentStylingKt;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0005\"#$%&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "Provider", "ClientMetadata", "MdocComponentStyle", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Mdoc implements Parcelable, UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1506type = "mdoc";
    private final Attributes attributes;
    private final String name;
    private final MdocComponentStyle styles;
    public static final Parcelable.Creator<Mdoc> CREATOR = new Creator();

    public Mdoc(String str, Attributes attributes, MdocComponentStyle mdocComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = mdocComponentStyle;
    }

    public static /* synthetic */ Mdoc copy$default(Mdoc mdoc, String str, Attributes attributes, MdocComponentStyle mdocComponentStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mdoc.name;
        }
        if ((i & 2) != 0) {
            attributes = mdoc.attributes;
        }
        if ((i & 4) != 0) {
            mdocComponentStyle = mdoc.styles;
        }
        return mdoc.copy(str, attributes, mdocComponentStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    /* renamed from: component3, reason: from getter */
    public final MdocComponentStyle getStyles() {
        return this.styles;
    }

    public final Mdoc copy(String name, Attributes attributes, MdocComponentStyle styles) {
        name.getClass();
        return new Mdoc(name, attributes, styles);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mdoc)) {
            return false;
        }
        Mdoc mdoc = (Mdoc) other;
        return Intrinsics.areEqual(this.name, mdoc.name) && Intrinsics.areEqual(this.attributes, mdoc.attributes) && Intrinsics.areEqual(this.styles, mdoc.styles);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final MdocComponentStyle getStyles() {
        return this.styles;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Attributes attributes = this.attributes;
        int hashCode2 = (hashCode + (attributes == null ? 0 : attributes.hashCode())) * 31;
        MdocComponentStyle mdocComponentStyle = this.styles;
        return hashCode2 + (mdocComponentStyle != null ? mdocComponentStyle.hashCode() : 0);
    }

    public String toString() {
        return "Mdoc(name=" + this.name + ", attributes=" + this.attributes + ", styles=" + this.styles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        MdocComponentStyle mdocComponentStyle = this.styles;
        if (mdocComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mdocComponentStyle.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 Jx\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0010J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "provider", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "noMdocAvailableText", "", "errorRetrievingMdocText", "showWhenMdocNotAvailable", "", "successfulMdocRetrievalTransitionComponentName", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDisabled", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "getProvider", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "getNoMdocAvailableText", "()Ljava/lang/String;", "getErrorRetrievingMdocText", "getShowWhenMdocNotAvailable", "()Z", "getSuccessfulMdocRetrievalTransitionComponentName", "getAutoSubmitCountdownText", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Attributes implements Parcelable, UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String autoSubmitCountdownText;
        private final Integer autoSubmitIntervalSeconds;
        private final JsonLogicBoolean disabled;
        private final String errorRetrievingMdocText;
        private final JsonLogicBoolean hidden;
        private final String noMdocAvailableText;
        private final Provider provider;
        private final boolean showWhenMdocNotAvailable;
        private final String successfulMdocRetrievalTransitionComponentName;

        public Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z, String str3, String str4, Integer num) {
            this.disabled = jsonLogicBoolean;
            this.hidden = jsonLogicBoolean2;
            this.provider = provider;
            this.noMdocAvailableText = str;
            this.errorRetrievingMdocText = str2;
            this.showWhenMdocNotAvailable = z;
            this.successfulMdocRetrievalTransitionComponentName = str3;
            this.autoSubmitCountdownText = str4;
            this.autoSubmitIntervalSeconds = num;
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z, String str3, String str4, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonLogicBoolean = attributes.disabled;
            }
            if ((i & 2) != 0) {
                jsonLogicBoolean2 = attributes.hidden;
            }
            if ((i & 4) != 0) {
                provider = attributes.provider;
            }
            if ((i & 8) != 0) {
                str = attributes.noMdocAvailableText;
            }
            if ((i & 16) != 0) {
                str2 = attributes.errorRetrievingMdocText;
            }
            if ((i & 32) != 0) {
                z = attributes.showWhenMdocNotAvailable;
            }
            if ((i & 64) != 0) {
                str3 = attributes.successfulMdocRetrievalTransitionComponentName;
            }
            if ((i & 128) != 0) {
                str4 = attributes.autoSubmitCountdownText;
            }
            if ((i & 256) != 0) {
                num = attributes.autoSubmitIntervalSeconds;
            }
            String str5 = str4;
            Integer num2 = num;
            boolean z2 = z;
            String str6 = str3;
            String str7 = str2;
            Provider provider2 = provider;
            return attributes.copy(jsonLogicBoolean, jsonLogicBoolean2, provider2, str, str7, z2, str6, str5, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component2, reason: from getter */
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        /* renamed from: component3, reason: from getter */
        public final Provider getProvider() {
            return this.provider;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNoMdocAvailableText() {
            return this.noMdocAvailableText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getErrorRetrievingMdocText() {
            return this.errorRetrievingMdocText;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowWhenMdocNotAvailable() {
            return this.showWhenMdocNotAvailable;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSuccessfulMdocRetrievalTransitionComponentName() {
            return this.successfulMdocRetrievalTransitionComponentName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        public final Attributes copy(JsonLogicBoolean disabled, JsonLogicBoolean hidden, Provider provider, String noMdocAvailableText, String errorRetrievingMdocText, boolean showWhenMdocNotAvailable, String successfulMdocRetrievalTransitionComponentName, String autoSubmitCountdownText, Integer autoSubmitIntervalSeconds) {
            return new Attributes(disabled, hidden, provider, noMdocAvailableText, errorRetrievingMdocText, showWhenMdocNotAvailable, successfulMdocRetrievalTransitionComponentName, autoSubmitCountdownText, autoSubmitIntervalSeconds);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attributes)) {
                return false;
            }
            Attributes attributes = (Attributes) other;
            return Intrinsics.areEqual(this.disabled, attributes.disabled) && Intrinsics.areEqual(this.hidden, attributes.hidden) && Intrinsics.areEqual(this.provider, attributes.provider) && Intrinsics.areEqual(this.noMdocAvailableText, attributes.noMdocAvailableText) && Intrinsics.areEqual(this.errorRetrievingMdocText, attributes.errorRetrievingMdocText) && this.showWhenMdocNotAvailable == attributes.showWhenMdocNotAvailable && Intrinsics.areEqual(this.successfulMdocRetrievalTransitionComponentName, attributes.successfulMdocRetrievalTransitionComponentName) && Intrinsics.areEqual(this.autoSubmitCountdownText, attributes.autoSubmitCountdownText) && Intrinsics.areEqual(this.autoSubmitIntervalSeconds, attributes.autoSubmitIntervalSeconds);
        }

        public final String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        public final Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getErrorRetrievingMdocText() {
            return this.errorRetrievingMdocText;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getNoMdocAvailableText() {
            return this.noMdocAvailableText;
        }

        public final Provider getProvider() {
            return this.provider;
        }

        public final boolean getShowWhenMdocNotAvailable() {
            return this.showWhenMdocNotAvailable;
        }

        public final String getSuccessfulMdocRetrievalTransitionComponentName() {
            return this.successfulMdocRetrievalTransitionComponentName;
        }

        public int hashCode() {
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            int hashCode = (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode()) * 31;
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            int hashCode2 = (hashCode + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
            Provider provider = this.provider;
            int hashCode3 = (hashCode2 + (provider == null ? 0 : provider.hashCode())) * 31;
            String str = this.noMdocAvailableText;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorRetrievingMdocText;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showWhenMdocNotAvailable);
            String str3 = this.successfulMdocRetrievalTransitionComponentName;
            int hashCode5 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.autoSubmitCountdownText;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.autoSubmitIntervalSeconds;
            return hashCode6 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            Provider provider = this.provider;
            String str = this.noMdocAvailableText;
            String str2 = this.errorRetrievingMdocText;
            boolean z = this.showWhenMdocNotAvailable;
            String str3 = this.successfulMdocRetrievalTransitionComponentName;
            String str4 = this.autoSubmitCountdownText;
            Integer num = this.autoSubmitIntervalSeconds;
            StringBuilder sb = new StringBuilder("Attributes(disabled=");
            sb.append(jsonLogicBoolean);
            sb.append(", hidden=");
            sb.append(jsonLogicBoolean2);
            sb.append(", provider=");
            sb.append(provider);
            sb.append(", noMdocAvailableText=");
            sb.append(str);
            sb.append(", errorRetrievingMdocText=");
            NavAction$$ExternalSyntheticOutline0.m(sb, str2, ", showWhenMdocNotAvailable=", z, ", successfulMdocRetrievalTransitionComponentName=");
            Boxes$$ExternalSyntheticOutline1.m(sb, str3, ", autoSubmitCountdownText=", str4, ", autoSubmitIntervalSeconds=");
            return NavAction$$ExternalSyntheticOutline0.m(sb, num, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
            Provider provider = this.provider;
            if (provider == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                provider.writeToParcel(dest, flags);
            }
            dest.writeString(this.noMdocAvailableText);
            dest.writeString(this.errorRetrievingMdocText);
            dest.writeInt(this.showWhenMdocNotAvailable ? 1 : 0);
            dest.writeString(this.successfulMdocRetrievalTransitionComponentName);
            dest.writeString(this.autoSubmitCountdownText);
            Integer num = this.autoSubmitIntervalSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(dest, 1, num);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Attributes(parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        public /* synthetic */ Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jsonLogicBoolean, jsonLogicBoolean2, provider, str, str2, z, str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "Landroid/os/Parcelable;", "requestJsonString", "", "<init>", "(Ljava/lang/String;)V", "getRequestJsonString", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClientMetadata implements Parcelable {
        public static final Parcelable.Creator<ClientMetadata> CREATOR = new Creator();
        private final String requestJsonString;

        public ClientMetadata(@Json(name = "requestJSONString") String str) {
            this.requestJsonString = str;
        }

        public static /* synthetic */ ClientMetadata copy$default(ClientMetadata clientMetadata, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientMetadata.requestJsonString;
            }
            return clientMetadata.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRequestJsonString() {
            return this.requestJsonString;
        }

        public final ClientMetadata copy(@Json(name = "requestJSONString") String requestJsonString) {
            return new ClientMetadata(requestJsonString);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientMetadata) && Intrinsics.areEqual(this.requestJsonString, ((ClientMetadata) other).requestJsonString);
        }

        public final String getRequestJsonString() {
            return this.requestJsonString;
        }

        public int hashCode() {
            String str = this.requestJsonString;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientMetadata(requestJsonString=", this.requestJsonString, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.requestJsonString);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClientMetadata> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientMetadata createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClientMetadata(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientMetadata[] newArray(int i) {
                return new ClientMetadata[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000b\u0010{\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J¾\u0001\u0010\u008a\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 HÆ\u0001J\u0007\u0010\u008b\u0001\u001a\u00020PJ\u0017\u0010\u008c\u0001\u001a\u00030\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001HÖ\u0003J\n\u0010\u0090\u0001\u001a\u00020PHÖ\u0001J\n\u0010\u0091\u0001\u001a\u00020ZHÖ\u0001J\u001b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020PR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0016\u0010G\u001a\u0004\u0018\u00010H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010NR\u0016\u0010Y\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u0004\u0018\u00010^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010a\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010NR\u0016\u0010c\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010RR\u0014\u0010e\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010RR\u0016\u0010g\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010RR\u0016\u0010i\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010NR\u0016\u0010k\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010NR\u0016\u0010m\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010RR\u0016\u0010o\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010RR\u0016\u0010q\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010RR\u0016\u0010s\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010NR\u0016\u0010u\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010NR\u0011\u0010w\u001a\u00020x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006\u0097\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;)V", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "paddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "marginValue", "getMarginValue", "justificationValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "fontSizeValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "baseTextColorValue", "", "getBaseTextColorValue", "()Ljava/lang/Integer;", "activeTextColorValue", "getActiveTextColorValue", "disabledTextColorValue", "getDisabledTextColorValue", "letterSpacingValue", "getLetterSpacingValue", "fontNameValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontWeightValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "lineHeightValue", "getLineHeightValue", "baseBackgroundColorValue", "getBaseBackgroundColorValue", "activeBackgroundColorValue", "getActiveBackgroundColorValue", "disabledBackgroundColorValue", "getDisabledBackgroundColorValue", "heightValue", "getHeightValue", "widthValue", "getWidthValue", "baseBorderColorValue", "getBaseBorderColorValue", "activeBorderColorValue", "getActiveBorderColorValue", "disabledBorderColorValue", "getDisabledBorderColorValue", "borderRadiusValue", "getBorderRadiusValue", "borderWidthValue", "getBorderWidthValue", "errorLabelStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorLabelStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MdocComponentStyle implements Parcelable, BaseButtonComponentStyle {
        public static final Parcelable.Creator<MdocComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ButtonBasedBorderColorStyle borderColor;
        private final AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius;
        private final AttributeStyles.ButtonBasedBorderWidthStyle borderWidth;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ButtonBasedHeightStyle height;
        private final AttributeStyles.ButtonBasedJustifyStyle justify;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.ButtonBasedMarginStyle margin;
        private final AttributeStyles.ButtonBasedPaddingStyle padding;
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;
        private final AttributeStyles.ButtonBasedWidthStyle width;

        public MdocComponentStyle(AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle, AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle, AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle, AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle, AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle, AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle, AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle, AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle) {
            this.padding = buttonBasedPaddingStyle;
            this.width = buttonBasedWidthStyle;
            this.height = buttonBasedHeightStyle;
            this.justify = buttonBasedJustifyStyle;
            this.margin = buttonBasedMarginStyle;
            this.borderRadius = buttonBasedBorderRadiusStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.backgroundColor = buttonBasedBackgroundColorStyle;
            this.borderColor = buttonBasedBorderColorStyle;
            this.borderWidth = buttonBasedBorderWidthStyle;
        }

        /* renamed from: component1, reason: from getter */
        public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
            return this.padding;
        }

        /* renamed from: component10, reason: from getter */
        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        /* renamed from: component11, reason: from getter */
        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        /* renamed from: component12, reason: from getter */
        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        /* renamed from: component13, reason: from getter */
        public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component14, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component15, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        /* renamed from: component2, reason: from getter */
        public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
            return this.height;
        }

        /* renamed from: component4, reason: from getter */
        public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
            return this.justify;
        }

        /* renamed from: component5, reason: from getter */
        public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
            return this.margin;
        }

        /* renamed from: component6, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        /* renamed from: component7, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        /* renamed from: component8, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        /* renamed from: component9, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final MdocComponentStyle copy(AttributeStyles.ButtonBasedPaddingStyle padding, AttributeStyles.ButtonBasedWidthStyle width, AttributeStyles.ButtonBasedHeightStyle height, AttributeStyles.ButtonBasedJustifyStyle justify, AttributeStyles.ButtonBasedMarginStyle margin, AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius, AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily, AttributeStyles.ComplexTextBasedFontSizeStyle fontSize, AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight, AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing, AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight, AttributeStyles.ComplexTextBasedTextColorStyle textColor, AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor, AttributeStyles.ButtonBasedBorderColorStyle borderColor, AttributeStyles.ButtonBasedBorderWidthStyle borderWidth) {
            return new MdocComponentStyle(padding, width, height, justify, margin, borderRadius, fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, textColor, backgroundColor, borderColor, borderWidth);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MdocComponentStyle)) {
                return false;
            }
            MdocComponentStyle mdocComponentStyle = (MdocComponentStyle) other;
            return Intrinsics.areEqual(this.padding, mdocComponentStyle.padding) && Intrinsics.areEqual(this.width, mdocComponentStyle.width) && Intrinsics.areEqual(this.height, mdocComponentStyle.height) && Intrinsics.areEqual(this.justify, mdocComponentStyle.justify) && Intrinsics.areEqual(this.margin, mdocComponentStyle.margin) && Intrinsics.areEqual(this.borderRadius, mdocComponentStyle.borderRadius) && Intrinsics.areEqual(this.fontFamily, mdocComponentStyle.fontFamily) && Intrinsics.areEqual(this.fontSize, mdocComponentStyle.fontSize) && Intrinsics.areEqual(this.fontWeight, mdocComponentStyle.fontWeight) && Intrinsics.areEqual(this.letterSpacing, mdocComponentStyle.letterSpacing) && Intrinsics.areEqual(this.lineHeight, mdocComponentStyle.lineHeight) && Intrinsics.areEqual(this.textColor, mdocComponentStyle.textColor) && Intrinsics.areEqual(this.backgroundColor, mdocComponentStyle.backgroundColor) && Intrinsics.areEqual(this.borderColor, mdocComponentStyle.borderColor) && Intrinsics.areEqual(this.borderWidth, mdocComponentStyle.borderWidth);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getActiveBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer active;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            return Integer.valueOf((buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (active = base.getActive()) == null) ? ButtonComponentStylingKt.getDefaultLoadingColor() : active.intValue());
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getActiveBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getActiveTextColorValue() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getActive();
        }

        public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            if (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getBaseTextColorValue() {
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getBase();
        }

        public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getBorderRadiusValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            if (buttonBasedBorderRadiusStyle == null || (base = buttonBasedBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            StyleElements.SizeSet base2;
            StyleElements.Size top;
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            if (buttonBasedBorderWidthStyle == null || (base = buttonBasedBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            Integer disabled;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            return (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            Integer disabled;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            return (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBorderColorValue() : disabled;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Integer getDisabledTextColorValue() {
            StyleElements.ComplexElementColor label;
            Integer disabled;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            return (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null || (disabled = label.getDisabled()) == null) ? getBaseTextColorValue() : disabled;
        }

        public final TextBasedComponentStyle getErrorLabelStyle() {
            StyleElements.ComplexElementColor error;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            Integer num = null;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getError() : null);
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getError() : null);
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getError() : null);
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getError() : null);
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getError() : null);
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle != null && (error = complexTextBasedTextColorStyle.getError()) != null) {
                num = error.getBase();
            }
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(num))), null);
        }

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public String getFontNameValue() {
            StyleElements.FontName base;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
                return null;
            }
            return base.getFontName();
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getFontSizeValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (base = complexTextBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public StyleElements.FontWeight getFontWeightValue() {
            StyleElements.FontWeightContainer base;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (base = complexTextBasedFontWeightStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
            return this.height;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getHeightValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            if (buttonBasedHeightStyle == null || (base = buttonBasedHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public StyleElements.PositionType getJustificationValue() {
            StyleElements.Position base;
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            if (buttonBasedJustifyStyle == null || (base = buttonBasedJustifyStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getLetterSpacingValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getLineHeightValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (base = complexTextBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
            return this.margin;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            if (buttonBasedMarginStyle == null || (base = buttonBasedMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            if (buttonBasedPaddingStyle == null || (base = buttonBasedPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
            return this.width;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            if (buttonBasedWidthStyle == null || (base = buttonBasedWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public int hashCode() {
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            int hashCode = (buttonBasedPaddingStyle == null ? 0 : buttonBasedPaddingStyle.hashCode()) * 31;
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            int hashCode2 = (hashCode + (buttonBasedWidthStyle == null ? 0 : buttonBasedWidthStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            int hashCode3 = (hashCode2 + (buttonBasedHeightStyle == null ? 0 : buttonBasedHeightStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            int hashCode4 = (hashCode3 + (buttonBasedJustifyStyle == null ? 0 : buttonBasedJustifyStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            int hashCode5 = (hashCode4 + (buttonBasedMarginStyle == null ? 0 : buttonBasedMarginStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            int hashCode6 = (hashCode5 + (buttonBasedBorderRadiusStyle == null ? 0 : buttonBasedBorderRadiusStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            int hashCode7 = (hashCode6 + (complexTextBasedFontFamilyStyle == null ? 0 : complexTextBasedFontFamilyStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            int hashCode8 = (hashCode7 + (complexTextBasedFontSizeStyle == null ? 0 : complexTextBasedFontSizeStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            int hashCode9 = (hashCode8 + (complexTextBasedFontWeightStyle == null ? 0 : complexTextBasedFontWeightStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            int hashCode10 = (hashCode9 + (complexTextBasedLetterSpacingStyle == null ? 0 : complexTextBasedLetterSpacingStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            int hashCode11 = (hashCode10 + (complexTextBasedLineHeightStyle == null ? 0 : complexTextBasedLineHeightStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            int hashCode12 = (hashCode11 + (complexTextBasedTextColorStyle == null ? 0 : complexTextBasedTextColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            int hashCode13 = (hashCode12 + (buttonBasedBackgroundColorStyle == null ? 0 : buttonBasedBackgroundColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            int hashCode14 = (hashCode13 + (buttonBasedBorderColorStyle == null ? 0 : buttonBasedBorderColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            return hashCode14 + (buttonBasedBorderWidthStyle != null ? buttonBasedBorderWidthStyle.hashCode() : 0);
        }

        public String toString() {
            return "MdocComponentStyle(padding=" + this.padding + ", width=" + this.width + ", height=" + this.height + ", justify=" + this.justify + ", margin=" + this.margin + ", borderRadius=" + this.borderRadius + ", fontFamily=" + this.fontFamily + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            if (buttonBasedPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            if (buttonBasedWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            if (buttonBasedHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            if (buttonBasedJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            if (buttonBasedMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            if (buttonBasedBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedFontFamilyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedFontSizeStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedFontWeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedLetterSpacingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedLineHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexTextBasedTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            if (buttonBasedBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            if (buttonBasedBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            if (buttonBasedBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderWidthStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MdocComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MdocComponentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MdocComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderWidthStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MdocComponentStyle[] newArray(int i) {
                return new MdocComponentStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\bJ\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Landroid/os/Parcelable;", "providerType", "", "idType", "merchantId", "nonce", "minAge", "", "elementToStoreLength", "", "clientMetadata", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;)V", "getProviderType", "()Ljava/lang/String;", "getIdType", "getMerchantId", "getNonce", "getMinAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getElementToStoreLength", "()Ljava/util/Map;", "getClientMetadata", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Provider implements Parcelable {
        public static final Parcelable.Creator<Provider> CREATOR = new Creator();
        private final ClientMetadata clientMetadata;
        private final Map<String, Integer> elementToStoreLength;
        private final String idType;
        private final String merchantId;
        private final Integer minAge;
        private final String nonce;
        private final String providerType;

        public Provider(String str, String str2, String str3, String str4, Integer num, Map<String, Integer> map, ClientMetadata clientMetadata) {
            this.providerType = str;
            this.idType = str2;
            this.merchantId = str3;
            this.nonce = str4;
            this.minAge = num;
            this.elementToStoreLength = map;
            this.clientMetadata = clientMetadata;
        }

        public static /* synthetic */ Provider copy$default(Provider provider, String str, String str2, String str3, String str4, Integer num, Map map, ClientMetadata clientMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                str = provider.providerType;
            }
            if ((i & 2) != 0) {
                str2 = provider.idType;
            }
            if ((i & 4) != 0) {
                str3 = provider.merchantId;
            }
            if ((i & 8) != 0) {
                str4 = provider.nonce;
            }
            if ((i & 16) != 0) {
                num = provider.minAge;
            }
            if ((i & 32) != 0) {
                map = provider.elementToStoreLength;
            }
            if ((i & 64) != 0) {
                clientMetadata = provider.clientMetadata;
            }
            Map map2 = map;
            ClientMetadata clientMetadata2 = clientMetadata;
            Integer num2 = num;
            String str5 = str3;
            return provider.copy(str, str2, str5, str4, num2, map2, clientMetadata2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderType() {
            return this.providerType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMerchantId() {
            return this.merchantId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getMinAge() {
            return this.minAge;
        }

        public final Map<String, Integer> component6() {
            return this.elementToStoreLength;
        }

        /* renamed from: component7, reason: from getter */
        public final ClientMetadata getClientMetadata() {
            return this.clientMetadata;
        }

        public final Provider copy(String providerType, String idType, String merchantId, String nonce, Integer minAge, Map<String, Integer> elementToStoreLength, ClientMetadata clientMetadata) {
            return new Provider(providerType, idType, merchantId, nonce, minAge, elementToStoreLength, clientMetadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) other;
            return Intrinsics.areEqual(this.providerType, provider.providerType) && Intrinsics.areEqual(this.idType, provider.idType) && Intrinsics.areEqual(this.merchantId, provider.merchantId) && Intrinsics.areEqual(this.nonce, provider.nonce) && Intrinsics.areEqual(this.minAge, provider.minAge) && Intrinsics.areEqual(this.elementToStoreLength, provider.elementToStoreLength) && Intrinsics.areEqual(this.clientMetadata, provider.clientMetadata);
        }

        public final ClientMetadata getClientMetadata() {
            return this.clientMetadata;
        }

        public final Map<String, Integer> getElementToStoreLength() {
            return this.elementToStoreLength;
        }

        public final String getIdType() {
            return this.idType;
        }

        public final String getMerchantId() {
            return this.merchantId;
        }

        public final Integer getMinAge() {
            return this.minAge;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getProviderType() {
            return this.providerType;
        }

        public int hashCode() {
            String str = this.providerType;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.idType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.merchantId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.nonce;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.minAge;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Map<String, Integer> map = this.elementToStoreLength;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            ClientMetadata clientMetadata = this.clientMetadata;
            return hashCode6 + (clientMetadata != null ? clientMetadata.hashCode() : 0);
        }

        public String toString() {
            String str = this.providerType;
            String str2 = this.idType;
            String str3 = this.merchantId;
            String str4 = this.nonce;
            Integer num = this.minAge;
            Map<String, Integer> map = this.elementToStoreLength;
            ClientMetadata clientMetadata = this.clientMetadata;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Provider(providerType=", str, ", idType=", str2, ", merchantId=");
            Boxes$$ExternalSyntheticOutline1.m(m, str3, ", nonce=", str4, ", minAge=");
            m.append(num);
            m.append(", elementToStoreLength=");
            m.append(map);
            m.append(", clientMetadata=");
            m.append(clientMetadata);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.providerType);
            dest.writeString(this.idType);
            dest.writeString(this.merchantId);
            dest.writeString(this.nonce);
            Integer num = this.minAge;
            if (num == null) {
                dest.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(dest, 1, num);
            }
            Map<String, Integer> map = this.elementToStoreLength;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator m = Matcher$$ExternalSyntheticOutline0.m(dest, 1, map);
                while (m.hasNext()) {
                    Map.Entry entry = (Map.Entry) m.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeInt(((Number) entry.getValue()).intValue());
                }
            }
            ClientMetadata clientMetadata = this.clientMetadata;
            if (clientMetadata == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clientMetadata.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Provider> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provider createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                }
                return new Provider(readString, readString2, readString3, readString4, valueOf, linkedHashMap, parcel.readInt() != 0 ? ClientMetadata.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provider[] newArray(int i) {
                return new Provider[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Mdoc> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mdoc createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Mdoc(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MdocComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mdoc[] newArray(int i) {
            return new Mdoc[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }
}
