package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0003\b\u008e\u0001\u0018\u00002\u00020\u0001:\u009a\u0001\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u008f\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles;", "", "<init>", "()V", "TextBasedMarginStyle", "TextBasedJustifyStyle", "TextBasedFontFamilyStyle", "ComplexTextBasedFontFamilyStyle", "TextBasedFontSizeStyle", "ComplexTextBasedFontSizeStyle", "TextBasedFontWeightStyle", "ComplexTextBasedFontWeightStyle", "TextBasedLetterSpacingStyle", "ComplexTextBasedLetterSpacingStyle", "TextBasedLineHeightStyle", "ComplexTextBasedLineHeightStyle", "TextBasedTextColorStyle", "ComplexTextBasedTextColorStyle", "DateSelectTextColorStyle", "QRCodeWidthStyle", "QRCodeJustifyStyle", "QRCodeMarginStyle", "QRCodeStrokeColorStyle", "QRCodeFillColorStyle", "ESignaturePrimaryButtonStyles", "ESignaturePrimaryButtonStylesContainer", "ESignatureSecondaryButtonStyles", "ESignatureSecondaryButtonStylesContainer", "ESignatureTitleStylesContainer", "ESignatureTextStylesContainer", "ESignatureBaseTextStyle", "ESignatureFillColorStyle", "ESignatureBackgroundColorStyle", "ESignatureTextColorStyle", "ESignatureBorderRadiusStyle", "ESignatureBorderWidthStyle", "ESignatureBorderColorStyle", "GovernmentIdNfcScanPrimaryButtonStyles", "GovernmentIdNfcScanPrimaryButtonStylesContainer", "GovernmentIdNfcScanSecondaryButtonStyles", "GovernmentIdNfcScanSecondaryButtonStylesContainer", "GovernmentIdNfcScanInputTextStyles", "GovernmentIdNfcScanInputTextStylesContainer", "GovernmentIdNfcScanInputDateStyles", "GovernmentIdNfcScanInputDateStylesContainer", "GovernmentIdNfcScanTextStyles", "GovernmentIdNfcScanTextStylesContainer", "GovernmentIdNfcScanTitleStyles", "GovernmentIdNfcScanTitleStylesContainer", "GovernmentIdNfcScanBackgroundColorStyle", "GovernmentIdNfcScanStrokeColorStyle", "GovernmentIdNfcScanFillColorStyle", "AddressTextStyle", "AddressTextStyleContainer", "RemoteImageHeightStyle", "RemoteImageWidthStyle", "RemoteImageJustifyStyle", "RemoteImageMarginStyle", "RemoteImageStrokeColorStyle", "RemoteImageFillColorStyle", "LocalImageHeightStyle", "LocalImageWidthStyle", "LocalImageJustifyStyle", "LocalImageMarginStyle", "LocalImageStrokeColorStyle", "LocalImageFillColorStyle", "FooterColorStyle", "SpacerHeightStyle", "SpacerWidthStyle", "FooterPaddingStyle", "FooterBorderWidthStyle", "HeaderButtonColorStyle", "InputRadioGroupFontFamilyStyle", "InputRadioGroupFontSizeStyle", "InputRadioGroupFontWeightStyle", "InputRadioGroupLetterSpacingStyle", "InputRadioGroupLineHeightStyle", "InputRadioGroupTextColorStyle", "InputCheckboxFontFamilyStyle", "InputCheckboxFontSizeStyle", "InputCheckboxFontWeightStyle", "InputCheckboxLetterSpacingStyle", "InputCheckboxLineHeightStyle", "InputCheckboxTextColorStyle", "InputSelectTextFontFamilyStyle", "InputSelectTextFontSizeStyle", "InputSelectTextFontWeightStyle", "InputSelectTextLetterSpacingStyle", "InputSelectTextLineHeightStyle", "InputSelectTextColorStyle", "InputSelectBorderRadiusStyle", "InputSelectBorderWidthStyle", "InputSelectBackgroundColorStyle", "InputSelectBorderColorStyle", "InputSelectStrokeColorStyle", "InputMarginStyle", "ButtonBasedPaddingStyle", "ButtonBasedMarginStyle", "ButtonBasedJustifyStyle", "ButtonBasedFontFamilyStyle", "ButtonBasedFontSizeStyle", "ButtonBasedFontWeightStyle", "ButtonBasedLetterSpacingStyle", "ButtonBasedLineHeightStyle", "ButtonBasedTextColorStyle", "ButtonBasedHeightStyle", "ButtonBasedWidthStyle", "ButtonBasedBackgroundColorStyle", "ButtonBasedBorderColorStyle", "ButtonBasedBorderRadiusStyle", "ButtonBasedBorderWidthStyle", "InputTextBorderRadiusStyle", "InputTextBorderWidthStyle", "InputTextBackgroundColorStyle", "InputTextBorderColorStyle", "InputTextStrokeColorStyle", "DateSelectStrokeColorStyle", "DateSelectBackgroundColorStyle", "DateSelectBorderRadiusStyle", "DateSelectBorderWidthStyle", "DateSelectBorderColorStyle", "ClickableStackBackgroundColorStyle", "ClickableStackBorderWidthStyle", "ClickableStackBorderColorStyle", "ClickableStackBorderRadiusStyle", "ClickableStackGapStyle", "ClickableStackWidthStyle", "ClickableStackPaddingStyle", "ClickableStackMarginStyle", "ClickableStackAxisStyle", "ClickableStackChildSizesStyle", "ClickableStackAlignmentStyle", "HorizontalStackBackgroundColorStyle", "HorizontalStackBorderWidthStyle", "HorizontalStackBorderColorStyle", "HorizontalStackBorderRadiusStyle", "HorizontalStackGapStyle", "HorizontalStackWidthStyle", "HorizontalStackPaddingStyle", "HorizontalStackMarginStyle", "HorizontalStackAxisStyle", "HorizontalStackChildSizesStyle", "HorizontalStackAlignmentStyle", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributeStyles {

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$AddressTextStyle;", "Landroid/os/Parcelable;", "expandButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$AddressTextStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$AddressTextStyleContainer;)V", "getExpandButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$AddressTextStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressTextStyle implements Parcelable {
        public static final Parcelable.Creator<AddressTextStyle> CREATOR = new Creator();
        private final AddressTextStyleContainer expandButton;

        public AddressTextStyle(AddressTextStyleContainer addressTextStyleContainer) {
            this.expandButton = addressTextStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AddressTextStyleContainer getExpandButton() {
            return this.expandButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AddressTextStyleContainer addressTextStyleContainer = this.expandButton;
            if (addressTextStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressTextStyleContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddressTextStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new AddressTextStyle(parcel.readInt() == 0 ? null : AddressTextStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyle[] newArray(int i) {
                return new AddressTextStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$AddressTextStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressTextStyleContainer implements Parcelable {
        public static final Parcelable.Creator<AddressTextStyleContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public AddressTextStyleContainer(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddressTextStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyleContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new AddressTextStyleContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressTextStyleContainer[] newArray(int i) {
                return new AddressTextStyleContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public ButtonBasedBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBackgroundColorStyle[] newArray(int i) {
                return new ButtonBasedBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public ButtonBasedBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderColorStyle[] newArray(int i) {
                return new ButtonBasedBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ButtonBasedBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderRadiusStyle[] newArray(int i) {
                return new ButtonBasedBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ButtonBasedBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedBorderWidthStyle[] newArray(int i) {
                return new ButtonBasedBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;

        public ButtonBasedFontFamilyStyle(StyleElements.FontName fontName) {
            this.base = fontName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontFamilyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontFamilyStyle[] newArray(int i) {
                return new ButtonBasedFontFamilyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ButtonBasedFontSizeStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontSizeStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontSizeStyle[] newArray(int i) {
                return new ButtonBasedFontSizeStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;

        public ButtonBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer) {
            this.base = fontWeightContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontWeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedFontWeightStyle[] newArray(int i) {
                return new ButtonBasedFontWeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedHeightStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ButtonBasedHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedHeightStyle[] newArray(int i) {
                return new ButtonBasedHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public ButtonBasedJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedJustifyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedJustifyStyle[] newArray(int i) {
                return new ButtonBasedJustifyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ButtonBasedLetterSpacingStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLetterSpacingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLetterSpacingStyle[] newArray(int i) {
                return new ButtonBasedLetterSpacingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ButtonBasedLineHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLineHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedLineHeightStyle[] newArray(int i) {
                return new ButtonBasedLineHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedMarginStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ButtonBasedMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedMarginStyle[] newArray(int i) {
                return new ButtonBasedMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ButtonBasedPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedPaddingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedPaddingStyle[] newArray(int i) {
                return new ButtonBasedPaddingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public ButtonBasedTextColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedTextColorStyle[] newArray(int i) {
                return new ButtonBasedTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonBasedWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ButtonBasedWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ButtonBasedWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBasedWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonBasedWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonBasedWidthStyle[] newArray(int i) {
                return new ButtonBasedWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackAlignmentStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackAlignmentStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public ClickableStackAlignmentStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackAlignmentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAlignmentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackAlignmentStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAlignmentStyle[] newArray(int i) {
                return new ClickableStackAlignmentStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackAxisStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackAxisStyle> CREATOR = new Creator();
        private final StyleElements.AxisContainer base;

        public ClickableStackAxisStyle(StyleElements.AxisContainer axisContainer) {
            this.base = axisContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.AxisContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.AxisContainer axisContainer = this.base;
            if (axisContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                axisContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackAxisStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAxisStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackAxisStyle(parcel.readInt() == 0 ? null : StyleElements.AxisContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackAxisStyle[] newArray(int i) {
                return new ClickableStackAxisStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public ClickableStackBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBackgroundColorStyle[] newArray(int i) {
                return new ClickableStackBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public ClickableStackBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderColorStyle[] newArray(int i) {
                return new ClickableStackBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ClickableStackBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderRadiusStyle[] newArray(int i) {
                return new ClickableStackBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ClickableStackBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackBorderWidthStyle[] newArray(int i) {
                return new ClickableStackBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackChildSizesStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackChildSizesStyle> CREATOR = new Creator();
        private final StyleElements.ChildSizes base;

        public ClickableStackChildSizesStyle(StyleElements.ChildSizes childSizes) {
            this.base = childSizes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ChildSizes getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ChildSizes childSizes = this.base;
            if (childSizes == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                childSizes.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackChildSizesStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackChildSizesStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackChildSizesStyle(parcel.readInt() == 0 ? null : StyleElements.ChildSizes.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackChildSizesStyle[] newArray(int i) {
                return new ClickableStackChildSizesStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackGapStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackGapStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ClickableStackGapStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackGapStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackGapStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackGapStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackGapStyle[] newArray(int i) {
                return new ClickableStackGapStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackMarginStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ClickableStackMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackMarginStyle[] newArray(int i) {
                return new ClickableStackMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ClickableStackPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackPaddingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackPaddingStyle[] newArray(int i) {
                return new ClickableStackPaddingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableStackWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ClickableStackWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClickableStackWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackWidthStyle[] newArray(int i) {
                return new ClickableStackWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "value", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "getValue", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexTextBasedFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName error;
        private final StyleElements.FontName label;
        private final StyleElements.FontName placeholder;
        private final StyleElements.FontName value;

        public ComplexTextBasedFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3, StyleElements.FontName fontName4, StyleElements.FontName fontName5) {
            this.base = fontName;
            this.value = fontName2;
            this.placeholder = fontName3;
            this.label = fontName4;
            this.error = fontName5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        public final StyleElements.FontName getLabel() {
            return this.label;
        }

        public final StyleElements.FontName getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.FontName getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName2 = this.value;
            if (fontName2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName2.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName3 = this.placeholder;
            if (fontName3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName3.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName4 = this.label;
            if (fontName4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName4.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName5 = this.error;
            if (fontName5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontFamilyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexTextBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontFamilyStyle[] newArray(int i) {
                return new ComplexTextBasedFontFamilyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "value", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getValue", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexTextBasedFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;
        private final StyleElements.Measurement placeholder;
        private final StyleElements.Measurement value;

        public ComplexTextBasedFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3, StyleElements.Measurement measurement4, StyleElements.Measurement measurement5) {
            this.base = measurement;
            this.value = measurement2;
            this.placeholder = measurement3;
            this.label = measurement4;
            this.error = measurement5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        public final StyleElements.Measurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.Measurement getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.value;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.placeholder;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement4 = this.label;
            if (measurement4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement4.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement5 = this.error;
            if (measurement5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontSizeStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexTextBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontSizeStyle[] newArray(int i) {
                return new ComplexTextBasedFontSizeStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "value", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "getValue", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexTextBasedFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer error;
        private final StyleElements.FontWeightContainer label;
        private final StyleElements.FontWeightContainer placeholder;
        private final StyleElements.FontWeightContainer value;

        public ComplexTextBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3, StyleElements.FontWeightContainer fontWeightContainer4, StyleElements.FontWeightContainer fontWeightContainer5) {
            this.base = fontWeightContainer;
            this.value = fontWeightContainer2;
            this.placeholder = fontWeightContainer3;
            this.label = fontWeightContainer4;
            this.error = fontWeightContainer5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        public final StyleElements.FontWeightContainer getLabel() {
            return this.label;
        }

        public final StyleElements.FontWeightContainer getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.FontWeightContainer getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.value;
            if (fontWeightContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer2.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.placeholder;
            if (fontWeightContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer3.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer4 = this.label;
            if (fontWeightContainer4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer4.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer5 = this.error;
            if (fontWeightContainer5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontWeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexTextBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedFontWeightStyle[] newArray(int i) {
                return new ComplexTextBasedFontWeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "value", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getValue", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexTextBasedLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;
        private final StyleElements.Measurement placeholder;
        private final StyleElements.Measurement value;

        public ComplexTextBasedLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3, StyleElements.Measurement measurement4, StyleElements.Measurement measurement5) {
            this.base = measurement;
            this.value = measurement2;
            this.placeholder = measurement3;
            this.label = measurement4;
            this.error = measurement5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        public final StyleElements.Measurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.Measurement getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.value;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.placeholder;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement4 = this.label;
            if (measurement4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement4.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement5 = this.error;
            if (measurement5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLetterSpacingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexTextBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLetterSpacingStyle[] newArray(int i) {
                return new ComplexTextBasedLetterSpacingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "value", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getValue", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexTextBasedLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;
        private final StyleElements.Measurement placeholder;
        private final StyleElements.Measurement value;

        public ComplexTextBasedLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3, StyleElements.Measurement measurement4, StyleElements.Measurement measurement5) {
            this.base = measurement;
            this.value = measurement2;
            this.placeholder = measurement3;
            this.label = measurement4;
            this.error = measurement5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        public final StyleElements.Measurement getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.Measurement getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.value;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.placeholder;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement4 = this.label;
            if (measurement4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement4.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement5 = this.error;
            if (measurement5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLineHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexTextBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedLineHeightStyle[] newArray(int i) {
                return new ComplexTextBasedLineHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "value", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getValue", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComplexTextBasedTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<ComplexTextBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public ComplexTextBasedTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4, StyleElements.ComplexElementColor complexElementColor5) {
            this.base = complexElementColor;
            this.value = complexElementColor2;
            this.placeholder = complexElementColor3;
            this.label = complexElementColor4;
            this.error = complexElementColor5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.value;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.placeholder;
            if (complexElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.label;
            if (complexElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor4.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor5 = this.error;
            if (complexElementColor5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor5.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ComplexTextBasedTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ComplexTextBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ComplexTextBasedTextColorStyle[] newArray(int i) {
                return new ComplexTextBasedTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "inputSelectBackgroundColor", "", "getInputSelectBackgroundColor", "()Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelectBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public DateSelectBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final Integer getInputSelectBackgroundColor() {
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor != null) {
                return complexElementColor.getBase();
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateSelectBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateSelectBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBackgroundColorStyle[] newArray(int i) {
                return new DateSelectBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelectBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public DateSelectBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateSelectBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateSelectBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderColorStyle[] newArray(int i) {
                return new DateSelectBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelectBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public DateSelectBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateSelectBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateSelectBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderRadiusStyle[] newArray(int i) {
                return new DateSelectBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelectBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public DateSelectBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateSelectBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateSelectBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectBorderWidthStyle[] newArray(int i) {
                return new DateSelectBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectStrokeColorStyle;", "Landroid/os/Parcelable;", "chevron", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getChevron", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelectStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor chevron;

        public DateSelectStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.chevron = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getChevron() {
            return this.chevron;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.chevron;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateSelectStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateSelectStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectStrokeColorStyle[] newArray(int i) {
                return new DateSelectStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$DateSelectTextColorStyle;", "Landroid/os/Parcelable;", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelectTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<DateSelectTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public DateSelectTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor4.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateSelectTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateSelectTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateSelectTextColorStyle[] newArray(int i) {
                return new DateSelectTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "signaturePreview", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getSignaturePreview", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.SimpleElementColor signaturePreview;

        public ESignatureBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.SimpleElementColor simpleElementColor) {
            this.base = complexElementColor;
            this.signaturePreview = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getSignaturePreview() {
            return this.signaturePreview;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor = this.signaturePreview;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBackgroundColorStyle[] newArray(int i) {
                return new ESignatureBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureBaseTextStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBaseTextStyle> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public ESignatureBaseTextStyle(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureBaseTextStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBaseTextStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureBaseTextStyle(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBaseTextStyle[] newArray(int i) {
                return new ESignatureBaseTextStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public ESignatureBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderColorStyle[] newArray(int i) {
                return new ESignatureBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public ESignatureBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderRadiusStyle[] newArray(int i) {
                return new ESignatureBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public ESignatureBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureBorderWidthStyle[] newArray(int i) {
                return new ESignatureBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureFillColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public ESignatureFillColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureFillColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureFillColorStyle[] newArray(int i) {
                return new ESignatureFillColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "Landroid/os/Parcelable;", "saveSignatureButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;)V", "getSaveSignatureButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignaturePrimaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<ESignaturePrimaryButtonStyles> CREATOR = new Creator();
        private final ESignaturePrimaryButtonStylesContainer saveSignatureButton;

        public ESignaturePrimaryButtonStyles(ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer) {
            this.saveSignatureButton = eSignaturePrimaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ESignaturePrimaryButtonStylesContainer getSaveSignatureButton() {
            return this.saveSignatureButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ESignaturePrimaryButtonStylesContainer eSignaturePrimaryButtonStylesContainer = this.saveSignatureButton;
            if (eSignaturePrimaryButtonStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignaturePrimaryButtonStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignaturePrimaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignaturePrimaryButtonStyles(parcel.readInt() == 0 ? null : ESignaturePrimaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStyles[] newArray(int i) {
                return new ESignaturePrimaryButtonStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignaturePrimaryButtonStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignaturePrimaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignaturePrimaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        public ESignaturePrimaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignaturePrimaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignaturePrimaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignaturePrimaryButtonStylesContainer[] newArray(int i) {
                return new ESignaturePrimaryButtonStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "Landroid/os/Parcelable;", "clearSignatureButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;)V", "getClearSignatureButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureSecondaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<ESignatureSecondaryButtonStyles> CREATOR = new Creator();
        private final ESignatureSecondaryButtonStylesContainer clearSignatureButton;

        public ESignatureSecondaryButtonStyles(ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer) {
            this.clearSignatureButton = eSignatureSecondaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ESignatureSecondaryButtonStylesContainer getClearSignatureButton() {
            return this.clearSignatureButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ESignatureSecondaryButtonStylesContainer eSignatureSecondaryButtonStylesContainer = this.clearSignatureButton;
            if (eSignatureSecondaryButtonStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureSecondaryButtonStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureSecondaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureSecondaryButtonStyles(parcel.readInt() == 0 ? null : ESignatureSecondaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStyles[] newArray(int i) {
                return new ESignatureSecondaryButtonStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureSecondaryButtonStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureSecondaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignatureSecondaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonCancelComponentStyle base;

        public ESignatureSecondaryButtonStylesContainer(ButtonCancelComponentStyle buttonCancelComponentStyle) {
            this.base = buttonCancelComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ButtonCancelComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ButtonCancelComponentStyle buttonCancelComponentStyle = this.base;
            if (buttonCancelComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonCancelComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureSecondaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureSecondaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureSecondaryButtonStylesContainer[] newArray(int i) {
                return new ESignatureSecondaryButtonStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextColorStyle;", "Landroid/os/Parcelable;", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<ESignatureTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public ESignatureTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor4.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextColorStyle[] newArray(int i) {
                return new ESignatureTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTextStylesContainer;", "Landroid/os/Parcelable;", "dialogText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;)V", "getDialogText", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureTextStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignatureTextStylesContainer> CREATOR = new Creator();
        private final ESignatureBaseTextStyle dialogText;

        public ESignatureTextStylesContainer(ESignatureBaseTextStyle eSignatureBaseTextStyle) {
            this.dialogText = eSignatureBaseTextStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ESignatureBaseTextStyle getDialogText() {
            return this.dialogText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ESignatureBaseTextStyle eSignatureBaseTextStyle = this.dialogText;
            if (eSignatureBaseTextStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureBaseTextStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureTextStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureTextStylesContainer(parcel.readInt() == 0 ? null : ESignatureBaseTextStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTextStylesContainer[] newArray(int i) {
                return new ESignatureTextStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureTitleStylesContainer;", "Landroid/os/Parcelable;", "dialogTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;)V", "getDialogTitle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ESignatureBaseTextStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ESignatureTitleStylesContainer implements Parcelable {
        public static final Parcelable.Creator<ESignatureTitleStylesContainer> CREATOR = new Creator();
        private final ESignatureBaseTextStyle dialogTitle;

        public ESignatureTitleStylesContainer(ESignatureBaseTextStyle eSignatureBaseTextStyle) {
            this.dialogTitle = eSignatureBaseTextStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ESignatureBaseTextStyle getDialogTitle() {
            return this.dialogTitle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ESignatureBaseTextStyle eSignatureBaseTextStyle = this.dialogTitle;
            if (eSignatureBaseTextStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                eSignatureBaseTextStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ESignatureTitleStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTitleStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ESignatureTitleStylesContainer(parcel.readInt() == 0 ? null : ESignatureBaseTextStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ESignatureTitleStylesContainer[] newArray(int i) {
                return new ESignatureTitleStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<FooterBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public FooterBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FooterBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FooterBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterBorderWidthStyle[] newArray(int i) {
                return new FooterBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterColorStyle implements Parcelable {
        public static final Parcelable.Creator<FooterColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public FooterColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FooterColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FooterColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterColorStyle[] newArray(int i) {
                return new FooterColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$FooterPaddingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<FooterPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public FooterPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FooterPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterPaddingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FooterPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FooterPaddingStyle[] newArray(int i) {
                return new FooterPaddingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "hintSheet", "errorModal", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getHintSheet", "getErrorModal", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.ComplexElementColor errorModal;
        private final StyleElements.ComplexElementColor hintSheet;

        public GovernmentIdNfcScanBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3) {
            this.base = complexElementColor;
            this.hintSheet = complexElementColor2;
            this.errorModal = complexElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.ComplexElementColor getErrorModal() {
            return this.errorModal;
        }

        public final StyleElements.ComplexElementColor getHintSheet() {
            return this.hintSheet;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.hintSheet;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.errorModal;
            if (complexElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanBackgroundColorStyle[] newArray(int i) {
                return new GovernmentIdNfcScanBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "background", "highlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getBackground", "getHighlight", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanFillColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor background;
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.ComplexElementColor highlight;

        public GovernmentIdNfcScanFillColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3) {
            this.base = complexElementColor;
            this.background = complexElementColor2;
            this.highlight = complexElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.ComplexElementColor getHighlight() {
            return this.highlight;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.background;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.highlight;
            if (complexElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanFillColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanFillColorStyle[] newArray(int i) {
                return new GovernmentIdNfcScanFillColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanInputDateStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputDateStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanInputDateStylesContainer base;

        public GovernmentIdNfcScanInputDateStyles(GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer) {
            this.base = governmentIdNfcScanInputDateStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanInputDateStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            GovernmentIdNfcScanInputDateStylesContainer governmentIdNfcScanInputDateStylesContainer = this.base;
            if (governmentIdNfcScanInputDateStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanInputDateStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputDateStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanInputDateStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanInputDateStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStyles[] newArray(int i) {
                return new GovernmentIdNfcScanInputDateStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanInputDateStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputDateStylesContainer> CREATOR = new Creator();
        private final InputDate.InputDateComponentStyle base;

        public GovernmentIdNfcScanInputDateStylesContainer(InputDate.InputDateComponentStyle inputDateComponentStyle) {
            this.base = inputDateComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final InputDate.InputDateComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            InputDate.InputDateComponentStyle inputDateComponentStyle = this.base;
            if (inputDateComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputDateComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputDateStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanInputDateStylesContainer(parcel.readInt() == 0 ? null : InputDate.InputDateComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputDateStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanInputDateStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanInputTextStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputTextStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanInputTextStylesContainer base;

        public GovernmentIdNfcScanInputTextStyles(GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer) {
            this.base = governmentIdNfcScanInputTextStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanInputTextStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            GovernmentIdNfcScanInputTextStylesContainer governmentIdNfcScanInputTextStylesContainer = this.base;
            if (governmentIdNfcScanInputTextStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanInputTextStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputTextStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanInputTextStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanInputTextStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStyles[] newArray(int i) {
                return new GovernmentIdNfcScanInputTextStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanInputTextStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanInputTextStylesContainer> CREATOR = new Creator();
        private final InputTextBasedComponentStyle base;

        public GovernmentIdNfcScanInputTextStylesContainer(InputTextBasedComponentStyle inputTextBasedComponentStyle) {
            this.base = inputTextBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final InputTextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.base;
            if (inputTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanInputTextStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanInputTextStylesContainer(parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanInputTextStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanInputTextStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanPrimaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanPrimaryButtonStylesContainer base;

        public GovernmentIdNfcScanPrimaryButtonStyles(GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer) {
            this.base = governmentIdNfcScanPrimaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanPrimaryButtonStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            GovernmentIdNfcScanPrimaryButtonStylesContainer governmentIdNfcScanPrimaryButtonStylesContainer = this.base;
            if (governmentIdNfcScanPrimaryButtonStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanPrimaryButtonStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanPrimaryButtonStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanPrimaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStyles[] newArray(int i) {
                return new GovernmentIdNfcScanPrimaryButtonStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanPrimaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        public GovernmentIdNfcScanPrimaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanPrimaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanPrimaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanPrimaryButtonStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanPrimaryButtonStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStylesContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanSecondaryButtonStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanSecondaryButtonStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanSecondaryButtonStylesContainer base;

        public GovernmentIdNfcScanSecondaryButtonStyles(GovernmentIdNfcScanSecondaryButtonStylesContainer governmentIdNfcScanSecondaryButtonStylesContainer) {
            this.base = governmentIdNfcScanSecondaryButtonStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanSecondaryButtonStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            GovernmentIdNfcScanSecondaryButtonStylesContainer governmentIdNfcScanSecondaryButtonStylesContainer = this.base;
            if (governmentIdNfcScanSecondaryButtonStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanSecondaryButtonStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanSecondaryButtonStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanSecondaryButtonStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanSecondaryButtonStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanSecondaryButtonStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanSecondaryButtonStyles[] newArray(int i) {
                return new GovernmentIdNfcScanSecondaryButtonStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanSecondaryButtonStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanSecondaryButtonStylesContainer> CREATOR = new Creator();
        private final ButtonSubmitComponentStyle base;

        public GovernmentIdNfcScanSecondaryButtonStylesContainer(ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanSecondaryButtonStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanSecondaryButtonStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanSecondaryButtonStylesContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanSecondaryButtonStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanSecondaryButtonStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public GovernmentIdNfcScanStrokeColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStrokeColorStyle[] newArray(int i) {
                return new GovernmentIdNfcScanStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStylesContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanTextStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanTextStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanTextStylesContainer base;

        public GovernmentIdNfcScanTextStyles(GovernmentIdNfcScanTextStylesContainer governmentIdNfcScanTextStylesContainer) {
            this.base = governmentIdNfcScanTextStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanTextStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            GovernmentIdNfcScanTextStylesContainer governmentIdNfcScanTextStylesContainer = this.base;
            if (governmentIdNfcScanTextStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanTextStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanTextStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTextStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanTextStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanTextStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTextStyles[] newArray(int i) {
                return new GovernmentIdNfcScanTextStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanTextStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanTextStylesContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public GovernmentIdNfcScanTextStylesContainer(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanTextStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTextStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanTextStylesContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTextStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanTextStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStylesContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStylesContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStylesContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanTitleStyles implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanTitleStyles> CREATOR = new Creator();
        private final GovernmentIdNfcScanTitleStylesContainer base;

        public GovernmentIdNfcScanTitleStyles(GovernmentIdNfcScanTitleStylesContainer governmentIdNfcScanTitleStylesContainer) {
            this.base = governmentIdNfcScanTitleStylesContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final GovernmentIdNfcScanTitleStylesContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            GovernmentIdNfcScanTitleStylesContainer governmentIdNfcScanTitleStylesContainer = this.base;
            if (governmentIdNfcScanTitleStylesContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanTitleStylesContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanTitleStyles> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTitleStyles createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanTitleStyles(parcel.readInt() == 0 ? null : GovernmentIdNfcScanTitleStylesContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTitleStyles[] newArray(int i) {
                return new GovernmentIdNfcScanTitleStyles[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStylesContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GovernmentIdNfcScanTitleStylesContainer implements Parcelable {
        public static final Parcelable.Creator<GovernmentIdNfcScanTitleStylesContainer> CREATOR = new Creator();
        private final TextBasedComponentStyle base;

        public GovernmentIdNfcScanTitleStylesContainer(TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedComponentStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanTitleStylesContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTitleStylesContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GovernmentIdNfcScanTitleStylesContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanTitleStylesContainer[] newArray(int i) {
                return new GovernmentIdNfcScanTitleStylesContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "Landroid/os/Parcelable;", "headerButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getHeaderButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderButtonColorStyle implements Parcelable {
        public static final Parcelable.Creator<HeaderButtonColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor headerButton;

        public HeaderButtonColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.headerButton = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getHeaderButton() {
            return this.headerButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.headerButton;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HeaderButtonColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HeaderButtonColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HeaderButtonColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HeaderButtonColorStyle[] newArray(int i) {
                return new HeaderButtonColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackAlignmentStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackAlignmentStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public HorizontalStackAlignmentStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackAlignmentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAlignmentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackAlignmentStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAlignmentStyle[] newArray(int i) {
                return new HorizontalStackAlignmentStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAxisStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$AxisContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackAxisStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackAxisStyle> CREATOR = new Creator();
        private final StyleElements.AxisContainer base;

        public HorizontalStackAxisStyle(StyleElements.AxisContainer axisContainer) {
            this.base = axisContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.AxisContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.AxisContainer axisContainer = this.base;
            if (axisContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                axisContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackAxisStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAxisStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackAxisStyle(parcel.readInt() == 0 ? null : StyleElements.AxisContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackAxisStyle[] newArray(int i) {
                return new HorizontalStackAxisStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public HorizontalStackBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBackgroundColorStyle[] newArray(int i) {
                return new HorizontalStackBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public HorizontalStackBorderColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderColorStyle[] newArray(int i) {
                return new HorizontalStackBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public HorizontalStackBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderRadiusStyle[] newArray(int i) {
                return new HorizontalStackBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public HorizontalStackBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackBorderWidthStyle[] newArray(int i) {
                return new HorizontalStackBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ChildSizes;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackChildSizesStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackChildSizesStyle> CREATOR = new Creator();
        private final StyleElements.ChildSizes base;

        public HorizontalStackChildSizesStyle(StyleElements.ChildSizes childSizes) {
            this.base = childSizes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ChildSizes getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ChildSizes childSizes = this.base;
            if (childSizes == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                childSizes.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackChildSizesStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackChildSizesStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackChildSizesStyle(parcel.readInt() == 0 ? null : StyleElements.ChildSizes.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackChildSizesStyle[] newArray(int i) {
                return new HorizontalStackChildSizesStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackGapStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackGapStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackGapStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public HorizontalStackGapStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackGapStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackGapStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackGapStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackGapStyle[] newArray(int i) {
                return new HorizontalStackGapStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackMarginStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public HorizontalStackMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackMarginStyle[] newArray(int i) {
                return new HorizontalStackMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackPaddingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackPaddingStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackPaddingStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public HorizontalStackPaddingStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackPaddingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackPaddingStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackPaddingStyle[] newArray(int i) {
                return new HorizontalStackPaddingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalStackWidthStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public HorizontalStackWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HorizontalStackWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackWidthStyle[] newArray(int i) {
                return new HorizontalStackWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName description;
        private final StyleElements.FontName error;

        public InputCheckboxFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.description = fontName2;
            this.error = fontName3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getDescription() {
            return this.description;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName2 = this.description;
            if (fontName2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName2.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontFamilyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontFamilyStyle[] newArray(int i) {
                return new InputCheckboxFontFamilyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public InputCheckboxFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontSizeStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontSizeStyle[] newArray(int i) {
                return new InputCheckboxFontSizeStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer description;
        private final StyleElements.FontWeightContainer error;

        public InputCheckboxFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.description = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getDescription() {
            return this.description;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.description;
            if (fontWeightContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer2.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontWeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxFontWeightStyle[] newArray(int i) {
                return new InputCheckboxFontWeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public InputCheckboxLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLetterSpacingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLetterSpacingStyle[] newArray(int i) {
                return new InputCheckboxLetterSpacingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public InputCheckboxLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLineHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxLineHeightStyle[] newArray(int i) {
                return new InputCheckboxLineHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor description;
        private final StyleElements.SimpleElementColor error;

        public InputCheckboxTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.description = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getDescription() {
            return this.description;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.description;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxTextColorStyle[] newArray(int i) {
                return new InputCheckboxTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "option", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "getOption", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputMarginStyle implements Parcelable {
        public static final Parcelable.Creator<InputMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;
        private final StyleElements.MeasurementSet option;

        public InputMarginStyle(StyleElements.MeasurementSet measurementSet, StyleElements.MeasurementSet measurementSet2) {
            this.base = measurementSet;
            this.option = measurementSet2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        public final StyleElements.MeasurementSet getOption() {
            return this.option;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
            StyleElements.MeasurementSet measurementSet2 = this.option;
            if (measurementSet2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputMarginStyle[] newArray(int i) {
                return new InputMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputRadioGroupFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName description;
        private final StyleElements.FontName error;

        public InputRadioGroupFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.description = fontName2;
            this.error = fontName3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getDescription() {
            return this.description;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName2 = this.description;
            if (fontName2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName2.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontFamilyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputRadioGroupFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontFamilyStyle[] newArray(int i) {
                return new InputRadioGroupFontFamilyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputRadioGroupFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public InputRadioGroupFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontSizeStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputRadioGroupFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontSizeStyle[] newArray(int i) {
                return new InputRadioGroupFontSizeStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputRadioGroupFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer description;
        private final StyleElements.FontWeightContainer error;

        public InputRadioGroupFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.description = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getDescription() {
            return this.description;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.description;
            if (fontWeightContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer2.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontWeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputRadioGroupFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupFontWeightStyle[] newArray(int i) {
                return new InputRadioGroupFontWeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputRadioGroupLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public InputRadioGroupLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLetterSpacingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputRadioGroupLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLetterSpacingStyle[] newArray(int i) {
                return new InputRadioGroupLetterSpacingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputRadioGroupLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement description;
        private final StyleElements.Measurement error;

        public InputRadioGroupLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.description = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getDescription() {
            return this.description;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.description;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLineHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputRadioGroupLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupLineHeightStyle[] newArray(int i) {
                return new InputRadioGroupLineHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "description", BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getDescription", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputRadioGroupTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;
        private final StyleElements.SimpleElementColor description;
        private final StyleElements.SimpleElementColor error;

        public InputRadioGroupTextColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.description = simpleElementColor2;
            this.error = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        public final StyleElements.SimpleElementColor getDescription() {
            return this.description;
        }

        public final StyleElements.SimpleElementColor getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.description;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.error;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputRadioGroupTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupTextColorStyle[] newArray(int i) {
                return new InputRadioGroupTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public InputSelectBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBackgroundColorStyle[] newArray(int i) {
                return new InputSelectBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public InputSelectBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderColorStyle[] newArray(int i) {
                return new InputSelectBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public InputSelectBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderRadiusStyle[] newArray(int i) {
                return new InputSelectBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public InputSelectBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectBorderWidthStyle[] newArray(int i) {
                return new InputSelectBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;", "Landroid/os/Parcelable;", "chevron", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "headerCancelButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getChevron", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getHeaderCancelButton", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor chevron;
        private final StyleElements.SimpleElementColor headerCancelButton;

        public InputSelectStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.chevron = simpleElementColor;
            this.headerCancelButton = simpleElementColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getChevron() {
            return this.chevron;
        }

        public final StyleElements.SimpleElementColor getHeaderCancelButton() {
            return this.headerCancelButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.chevron;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.headerCancelButton;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStrokeColorStyle[] newArray(int i) {
                return new InputSelectStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;", "Landroid/os/Parcelable;", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "placeholder", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getPlaceholder", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor error;
        private final StyleElements.ComplexElementColor label;
        private final StyleElements.ComplexElementColor placeholder;
        private final StyleElements.ComplexElementColor value;

        public InputSelectTextColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2, StyleElements.ComplexElementColor complexElementColor3, StyleElements.ComplexElementColor complexElementColor4) {
            this.value = complexElementColor;
            this.placeholder = complexElementColor2;
            this.label = complexElementColor3;
            this.error = complexElementColor4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getError() {
            return this.error;
        }

        public final StyleElements.ComplexElementColor getLabel() {
            return this.label;
        }

        public final StyleElements.ComplexElementColor getPlaceholder() {
            return this.placeholder;
        }

        public final StyleElements.ComplexElementColor getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.value;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.placeholder;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor3 = this.label;
            if (complexElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor4 = this.error;
            if (complexElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor4.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextColorStyle[] newArray(int i) {
                return new InputSelectTextColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectTextFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;
        private final StyleElements.FontName error;
        private final StyleElements.FontName label;

        public InputSelectTextFontFamilyStyle(StyleElements.FontName fontName, StyleElements.FontName fontName2, StyleElements.FontName fontName3) {
            this.base = fontName;
            this.label = fontName2;
            this.error = fontName3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        public final StyleElements.FontName getError() {
            return this.error;
        }

        public final StyleElements.FontName getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName2 = this.label;
            if (fontName2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName2.writeToParcel(dest, flags);
            }
            StyleElements.FontName fontName3 = this.error;
            if (fontName3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectTextFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontFamilyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectTextFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontName.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontFamilyStyle[] newArray(int i) {
                return new InputSelectTextFontFamilyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectTextFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;

        public InputSelectTextFontSizeStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.label = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.label;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectTextFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontSizeStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectTextFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontSizeStyle[] newArray(int i) {
                return new InputSelectTextFontSizeStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectTextFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;
        private final StyleElements.FontWeightContainer error;
        private final StyleElements.FontWeightContainer label;

        public InputSelectTextFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer, StyleElements.FontWeightContainer fontWeightContainer2, StyleElements.FontWeightContainer fontWeightContainer3) {
            this.base = fontWeightContainer;
            this.label = fontWeightContainer2;
            this.error = fontWeightContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        public final StyleElements.FontWeightContainer getError() {
            return this.error;
        }

        public final StyleElements.FontWeightContainer getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer2 = this.label;
            if (fontWeightContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer2.writeToParcel(dest, flags);
            }
            StyleElements.FontWeightContainer fontWeightContainer3 = this.error;
            if (fontWeightContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectTextFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontWeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectTextFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextFontWeightStyle[] newArray(int i) {
                return new InputSelectTextFontWeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectTextLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;

        public InputSelectTextLetterSpacingStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.label = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.label;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectTextLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLetterSpacingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectTextLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLetterSpacingStyle[] newArray(int i) {
                return new InputSelectTextLetterSpacingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", AnnotatedPrivateKey.LABEL, BreadcrumbHelper.Category.ERROR, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getLabel", "getError", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSelectTextLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<InputSelectTextLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;
        private final StyleElements.Measurement error;
        private final StyleElements.Measurement label;

        public InputSelectTextLineHeightStyle(StyleElements.Measurement measurement, StyleElements.Measurement measurement2, StyleElements.Measurement measurement3) {
            this.base = measurement;
            this.label = measurement2;
            this.error = measurement3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        public final StyleElements.Measurement getError() {
            return this.error;
        }

        public final StyleElements.Measurement getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.label;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.error;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectTextLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLineHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputSelectTextLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectTextLineHeightStyle[] newArray(int i) {
                return new InputSelectTextLineHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "option", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getOption", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputTextBackgroundColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBackgroundColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;
        private final StyleElements.ComplexElementColor option;

        public InputTextBackgroundColorStyle(StyleElements.ComplexElementColor complexElementColor, StyleElements.ComplexElementColor complexElementColor2) {
            this.base = complexElementColor;
            this.option = complexElementColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        public final StyleElements.ComplexElementColor getOption() {
            return this.option;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor2 = this.option;
            if (complexElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputTextBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBackgroundColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputTextBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBackgroundColorStyle[] newArray(int i) {
                return new InputTextBackgroundColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputTextBorderColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBorderColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor base;

        public InputTextBorderColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.base = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.base;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputTextBorderColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputTextBorderColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderColorStyle[] newArray(int i) {
                return new InputTextBorderColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputTextBorderRadiusStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBorderRadiusStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public InputTextBorderRadiusStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputTextBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderRadiusStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputTextBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderRadiusStyle[] newArray(int i) {
                return new InputTextBorderRadiusStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputTextBorderWidthStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextBorderWidthStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public InputTextBorderWidthStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputTextBorderWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputTextBorderWidthStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextBorderWidthStyle[] newArray(int i) {
                return new InputTextBorderWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;", "Landroid/os/Parcelable;", "maskToggle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;)V", "getMaskToggle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputTextStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<InputTextStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.ComplexElementColor maskToggle;

        public InputTextStrokeColorStyle(StyleElements.ComplexElementColor complexElementColor) {
            this.maskToggle = complexElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.ComplexElementColor getMaskToggle() {
            return this.maskToggle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.ComplexElementColor complexElementColor = this.maskToggle;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputTextStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputTextStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputTextStrokeColorStyle[] newArray(int i) {
                return new InputTextStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageFillColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "background", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getBackground", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalImageFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor background;
        private final StyleElements.SimpleElementColor base;

        public LocalImageFillColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.base = simpleElementColor;
            this.background = simpleElementColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.background;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImageFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageFillColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalImageFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageFillColorStyle[] newArray(int i) {
                return new LocalImageFillColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalImageHeightStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public LocalImageHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImageHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalImageHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageHeightStyle[] newArray(int i) {
                return new LocalImageHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageJustifyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalImageJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public LocalImageJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImageJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageJustifyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalImageJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageJustifyStyle[] newArray(int i) {
                return new LocalImageJustifyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalImageMarginStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public LocalImageMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImageMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalImageMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageMarginStyle[] newArray(int i) {
                return new LocalImageMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageStrokeColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalImageStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public LocalImageStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImageStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalImageStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageStrokeColorStyle[] newArray(int i) {
                return new LocalImageStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$LocalImageWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalImageWidthStyle implements Parcelable {
        public static final Parcelable.Creator<LocalImageWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public LocalImageWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalImageWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LocalImageWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalImageWidthStyle[] newArray(int i) {
                return new LocalImageWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeFillColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QRCodeFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public QRCodeFillColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<QRCodeFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeFillColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new QRCodeFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeFillColorStyle[] newArray(int i) {
                return new QRCodeFillColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeJustifyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QRCodeJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public QRCodeJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<QRCodeJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeJustifyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new QRCodeJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeJustifyStyle[] newArray(int i) {
                return new QRCodeJustifyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QRCodeMarginStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public QRCodeMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<QRCodeMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new QRCodeMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeMarginStyle[] newArray(int i) {
                return new QRCodeMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeStrokeColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QRCodeStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public QRCodeStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<QRCodeStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new QRCodeStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeStrokeColorStyle[] newArray(int i) {
                return new QRCodeStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QRCodeWidthStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public QRCodeWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<QRCodeWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new QRCodeWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeWidthStyle[] newArray(int i) {
                return new QRCodeWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "Landroid/os/Parcelable;", "fill", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "highlight", "background", "originalFill", "originalHighlight", "originalBackground", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getFill", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getHighlight", "getBackground", "getOriginalFill", "getOriginalHighlight", "getOriginalBackground", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageFillColorStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageFillColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor background;
        private final StyleElements.SimpleElementColor fill;
        private final StyleElements.SimpleElementColor highlight;
        private final StyleElements.SimpleElementColor originalBackground;
        private final StyleElements.SimpleElementColor originalFill;
        private final StyleElements.SimpleElementColor originalHighlight;

        public RemoteImageFillColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.SimpleElementColor simpleElementColor3, StyleElements.SimpleElementColor simpleElementColor4, StyleElements.SimpleElementColor simpleElementColor5, StyleElements.SimpleElementColor simpleElementColor6) {
            this.fill = simpleElementColor;
            this.highlight = simpleElementColor2;
            this.background = simpleElementColor3;
            this.originalFill = simpleElementColor4;
            this.originalHighlight = simpleElementColor5;
            this.originalBackground = simpleElementColor6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBackground() {
            return this.background;
        }

        public final StyleElements.SimpleElementColor getFill() {
            return this.fill;
        }

        public final StyleElements.SimpleElementColor getHighlight() {
            return this.highlight;
        }

        public final StyleElements.SimpleElementColor getOriginalBackground() {
            return this.originalBackground;
        }

        public final StyleElements.SimpleElementColor getOriginalFill() {
            return this.originalFill;
        }

        public final StyleElements.SimpleElementColor getOriginalHighlight() {
            return this.originalHighlight;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.fill;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.highlight;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.background;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.originalFill;
            if (simpleElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor4.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.originalHighlight;
            if (simpleElementColor5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor5.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor6 = this.originalBackground;
            if (simpleElementColor6 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor6.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageFillColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageFillColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageFillColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageFillColorStyle[] newArray(int i) {
                return new RemoteImageFillColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageHeightStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public RemoteImageHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageHeightStyle[] newArray(int i) {
                return new RemoteImageHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public RemoteImageJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageJustifyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageJustifyStyle[] newArray(int i) {
                return new RemoteImageJustifyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageMarginStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public RemoteImageMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageMarginStyle[] newArray(int i) {
                return new RemoteImageMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "Landroid/os/Parcelable;", "stroke", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "originalStroke", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getStroke", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getOriginalStroke", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageStrokeColorStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageStrokeColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor originalStroke;
        private final StyleElements.SimpleElementColor stroke;

        public RemoteImageStrokeColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2) {
            this.stroke = simpleElementColor;
            this.originalStroke = simpleElementColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getOriginalStroke() {
            return this.originalStroke;
        }

        public final StyleElements.SimpleElementColor getStroke() {
            return this.stroke;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.stroke;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.originalStroke;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageStrokeColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageStrokeColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageStrokeColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageStrokeColorStyle[] newArray(int i) {
                return new RemoteImageStrokeColorStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RemoteImageWidthStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public RemoteImageWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoteImageWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageWidthStyle[] newArray(int i) {
                return new RemoteImageWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$SpacerHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpacerHeightStyle implements Parcelable {
        public static final Parcelable.Creator<SpacerHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public SpacerHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SpacerHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SpacerHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerHeightStyle[] newArray(int i) {
                return new SpacerHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$SpacerWidthStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpacerWidthStyle implements Parcelable {
        public static final Parcelable.Creator<SpacerWidthStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public SpacerWidthStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SpacerWidthStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerWidthStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SpacerWidthStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpacerWidthStyle[] newArray(int i) {
                return new SpacerWidthStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontName;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedFontFamilyStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedFontFamilyStyle> CREATOR = new Creator();
        private final StyleElements.FontName base;

        public TextBasedFontFamilyStyle(StyleElements.FontName fontName) {
            this.base = fontName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontName getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontName fontName = this.base;
            if (fontName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontName.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedFontFamilyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontFamilyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedFontFamilyStyle(parcel.readInt() == 0 ? null : StyleElements.FontName.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontFamilyStyle[] newArray(int i) {
                return new TextBasedFontFamilyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedFontSizeStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedFontSizeStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public TextBasedFontSizeStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedFontSizeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontSizeStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedFontSizeStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontSizeStyle[] newArray(int i) {
                return new TextBasedFontSizeStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeightContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedFontWeightStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedFontWeightStyle> CREATOR = new Creator();
        private final StyleElements.FontWeightContainer base;

        public TextBasedFontWeightStyle(StyleElements.FontWeightContainer fontWeightContainer) {
            this.base = fontWeightContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.FontWeightContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.FontWeightContainer fontWeightContainer = this.base;
            if (fontWeightContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                fontWeightContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedFontWeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontWeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedFontWeightStyle(parcel.readInt() == 0 ? null : StyleElements.FontWeightContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedFontWeightStyle[] newArray(int i) {
                return new TextBasedFontWeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedJustifyStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedJustifyStyle> CREATOR = new Creator();
        private final StyleElements.Position base;

        public TextBasedJustifyStyle(StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedJustifyStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedJustifyStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedJustifyStyle(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedJustifyStyle[] newArray(int i) {
                return new TextBasedJustifyStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedLetterSpacingStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedLetterSpacingStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public TextBasedLetterSpacingStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedLetterSpacingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLetterSpacingStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedLetterSpacingStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLetterSpacingStyle[] newArray(int i) {
                return new TextBasedLetterSpacingStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedLineHeightStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedLineHeightStyle> CREATOR = new Creator();
        private final StyleElements.Measurement base;

        public TextBasedLineHeightStyle(StyleElements.Measurement measurement) {
            this.base = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.Measurement getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.Measurement measurement = this.base;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedLineHeightStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLineHeightStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedLineHeightStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedLineHeightStyle[] newArray(int i) {
                return new TextBasedLineHeightStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedMarginStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedMarginStyle> CREATOR = new Creator();
        private final StyleElements.MeasurementSet base;

        public TextBasedMarginStyle(StyleElements.MeasurementSet measurementSet) {
            this.base = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.MeasurementSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.MeasurementSet measurementSet = this.base;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedMarginStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedMarginStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedMarginStyle(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedMarginStyle[] newArray(int i) {
                return new TextBasedMarginStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TextBasedTextColorStyle implements Parcelable {
        public static final Parcelable.Creator<TextBasedTextColorStyle> CREATOR = new Creator();
        private final StyleElements.SimpleElementColor base;

        public TextBasedTextColorStyle(StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextBasedTextColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedTextColorStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TextBasedTextColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TextBasedTextColorStyle[] newArray(int i) {
                return new TextBasedTextColorStyle[i];
            }
        }
    }
}
