package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import kotlin.Metadata;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "ESignatureComponentStyle", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ESignature implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1484type = "input_e_signature";
    private final Attributes attributes;
    private final String name;
    private final ESignatureComponentStyle styles;
    public static final Parcelable.Creator<ESignature> CREATOR = new Creator();

    public ESignature(String str, Attributes attributes, ESignatureComponentStyle eSignatureComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = eSignatureComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final ESignatureComponentStyle getStyles() {
        return this.styles;
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
        ESignatureComponentStyle eSignatureComponentStyle = this.styles;
        if (eSignatureComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eSignatureComponentStyle.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", AnnotatedPrivateKey.LABEL, "", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "placeholder", "saveButtonText", "clearButtonText", "dialogTitle", "dialogText", "prefill", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getPlaceholder", "getSaveButtonText", "getClearButtonText", "getDialogTitle", "getDialogText", "getPrefill", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String clearButtonText;
        private final String dialogText;
        private final String dialogTitle;
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final String placeholder;
        private final String prefill;
        private final String saveButtonText;

        public Attributes(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.label = str;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.placeholder = str2;
            this.saveButtonText = str3;
            this.clearButtonText = str4;
            this.dialogTitle = str5;
            this.dialogText = str6;
            this.prefill = str7;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String getClearButtonText() {
            return this.clearButtonText;
        }

        public final String getDialogText() {
            return this.dialogText;
        }

        public final String getDialogTitle() {
            return this.dialogTitle;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getPrefill() {
            return this.prefill;
        }

        public final String getSaveButtonText() {
            return this.saveButtonText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.label);
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
            dest.writeString(this.placeholder);
            dest.writeString(this.saveButtonText);
            dest.writeString(this.clearButtonText);
            dest.writeString(this.dialogTitle);
            dest.writeString(this.dialogText);
            dest.writeString(this.prefill);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0006\u0010`\u001a\u00020SJ\u0016\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020SR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010H\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010L\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010P\u001a\u0004\u0018\u00010M8F¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0013\u0010R\u001a\u0004\u0018\u00010S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010V\u001a\u0004\u0018\u00010S8F¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0013\u0010X\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "Landroid/os/Parcelable;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTitleStylesContainer;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextStylesContainer;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureFillColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderWidthStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderColorStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTitleStylesContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextStylesContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureFillColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;)V", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTitleStylesContainer;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextStylesContainer;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureFillColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderWidthStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderColorStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "submitButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getSubmitButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "clearSignatureButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getClearSignatureButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "dialogTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getDialogTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "dialogTextStyle", "getDialogTextStyle", "fillColorValue", "", "getFillColorValue", "()Ljava/lang/Integer;", "signaturePreviewBackgroundColor", "getSignaturePreviewBackgroundColor", "margins", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureComponentStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ESignatureBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ESignatureBorderColorStyle borderColor;
        private final AttributeStyles.ESignatureBorderRadiusStyle borderRadius;
        private final AttributeStyles.ESignatureBorderWidthStyle borderWidth;
        private final AttributeStyles.ESignaturePrimaryButtonStyles buttonPrimaryStyle;
        private final AttributeStyles.ESignatureSecondaryButtonStyles buttonSecondaryStyle;
        private final AttributeStyles.ESignatureFillColorStyle fillColor;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.ESignatureTextColorStyle textColor;
        private final AttributeStyles.ESignatureTextStylesContainer textStyle;
        private final AttributeStyles.ESignatureTitleStylesContainer titleStyle;

        public ESignatureComponentStyle(AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles, AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles, AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer, AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer, AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle, AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle, AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle, AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle, AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle, AttributeStyles.InputMarginStyle inputMarginStyle) {
            this.buttonPrimaryStyle = eSignaturePrimaryButtonStyles;
            this.buttonSecondaryStyle = eSignatureSecondaryButtonStyles;
            this.titleStyle = eSignatureTitleStylesContainer;
            this.textStyle = eSignatureTextStylesContainer;
            this.fillColor = eSignatureFillColorStyle;
            this.backgroundColor = eSignatureBackgroundColorStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = eSignatureTextColorStyle;
            this.borderRadius = eSignatureBorderRadiusStyle;
            this.borderWidth = eSignatureBorderWidthStyle;
            this.borderColor = eSignatureBorderColorStyle;
            this.margin = inputMarginStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.ESignatureBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.ESignatureBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ESignatureBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.ESignatureBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.ESignaturePrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        public final AttributeStyles.ESignatureSecondaryButtonStyles getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        public final ButtonCancelComponentStyle getClearSignatureButtonStyle() {
            AttributeStyles.ESignatureSecondaryButtonStylesContainer clearSignatureButton;
            AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (eSignatureSecondaryButtonStyles == null || (clearSignatureButton = eSignatureSecondaryButtonStyles.getClearSignatureButton()) == null) {
                return null;
            }
            return clearSignatureButton.getBase();
        }

        public final TextBasedComponentStyle getDialogTextStyle() {
            AttributeStyles.ESignatureBaseTextStyle dialogText;
            AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = this.textStyle;
            if (eSignatureTextStylesContainer == null || (dialogText = eSignatureTextStylesContainer.getDialogText()) == null) {
                return null;
            }
            return dialogText.getBase();
        }

        public final TextBasedComponentStyle getDialogTitleStyle() {
            AttributeStyles.ESignatureBaseTextStyle dialogTitle;
            AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = this.titleStyle;
            if (eSignatureTitleStylesContainer == null || (dialogTitle = eSignatureTitleStylesContainer.getDialogTitle()) == null) {
                return null;
            }
            return dialogTitle.getBase();
        }

        public final AttributeStyles.ESignatureFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = this.fillColor;
            if (eSignatureFillColorStyle == null || (base = eSignatureFillColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = this.textColor;
            StyleElements.ComplexElementColor value = eSignatureTextColorStyle != null ? eSignatureTextColorStyle.getValue() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle2 = this.textColor;
            StyleElements.ComplexElementColor value2 = eSignatureTextColorStyle2 != null ? eSignatureTextColorStyle2.getValue() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle3 = this.textColor;
            StyleElements.ComplexElementColor placeholder = eSignatureTextColorStyle3 != null ? eSignatureTextColorStyle3.getPlaceholder() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle4 = this.textColor;
            StyleElements.ComplexElementColor label = eSignatureTextColorStyle4 != null ? eSignatureTextColorStyle4.getLabel() : null;
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle5 = this.textColor;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = new AttributeStyles.ComplexTextBasedTextColorStyle(value, value2, placeholder, label, eSignatureTextColorStyle5 != null ? eSignatureTextColorStyle5.getError() : null);
            AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = this.borderRadius;
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = new AttributeStyles.InputTextBorderRadiusStyle(eSignatureBorderRadiusStyle != null ? eSignatureBorderRadiusStyle.getBase() : null);
            AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = this.borderWidth;
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = new AttributeStyles.InputTextBorderWidthStyle(eSignatureBorderWidthStyle != null ? eSignatureBorderWidthStyle.getBase() : null);
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = new AttributeStyles.InputTextBackgroundColorStyle(eSignatureBackgroundColorStyle != null ? eSignatureBackgroundColorStyle.getBase() : null, null);
            AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = this.borderColor;
            return new InputTextBasedComponentStyle(inputMarginStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, complexTextBasedTextColorStyle, inputTextBorderRadiusStyle, inputTextBorderWidthStyle, inputTextBackgroundColorStyle, new AttributeStyles.InputTextBorderColorStyle(eSignatureBorderColorStyle != null ? eSignatureBorderColorStyle.getBase() : null), null);
        }

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMargins() {
            StyleElements.MeasurementSet base;
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getSignaturePreviewBackgroundColor() {
            StyleElements.SimpleElementColor signaturePreview;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            if (eSignatureBackgroundColorStyle == null || (signaturePreview = eSignatureBackgroundColorStyle.getSignaturePreview()) == null || (base = signaturePreview.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final ButtonSubmitComponentStyle getSubmitButtonStyle() {
            AttributeStyles.ESignaturePrimaryButtonStylesContainer saveSignatureButton;
            AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = this.buttonPrimaryStyle;
            if (eSignaturePrimaryButtonStyles == null || (saveSignatureButton = eSignaturePrimaryButtonStyles.getSaveSignatureButton()) == null) {
                return null;
            }
            return saveSignatureButton.getBase();
        }

        public final AttributeStyles.ESignatureTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.ESignatureTextStylesContainer getTextStyle() {
            return this.textStyle;
        }

        public final AttributeStyles.ESignatureTitleStylesContainer getTitleStyle() {
            return this.titleStyle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = this.buttonPrimaryStyle;
            if (eSignaturePrimaryButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignaturePrimaryButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (eSignatureSecondaryButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureSecondaryButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = this.titleStyle;
            if (eSignatureTitleStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureTitleStylesContainer.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = this.textStyle;
            if (eSignatureTextStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureTextStylesContainer.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = this.fillColor;
            if (eSignatureFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureFillColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = this.backgroundColor;
            if (eSignatureBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureBackgroundColorStyle.writeToParcel(dest, flags);
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
            AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = this.textColor;
            if (eSignatureTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = this.borderRadius;
            if (eSignatureBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = this.borderWidth;
            if (eSignatureBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureBorderWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = this.borderColor;
            if (eSignatureBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureBorderColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputMarginStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureComponentStyle> {
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle, still in use, count: 2, list:
                  (r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle) from 0x00f1: MOVE (r16v2 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle) = (r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle)
                  (r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle) from 0x00ed: MOVE (r16v5 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle) = (r1v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature.ESignatureComponentStyle createFromParcel(android.os.Parcel r19) {
                /*
                    Method dump skipped, instructions count: 294
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature.ESignatureComponentStyle.Creator.createFromParcel(android.os.Parcel):com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature$ESignatureComponentStyle");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureComponentStyle[] newArray(int i) {
                return new ESignatureComponentStyle[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ESignature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ESignature createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ESignature(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ESignatureComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ESignature[] newArray(int i) {
            return new ESignature[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }
}
