package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox$InputCheckboxComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "InputCheckboxComponentStyle", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputCheckboxGroup implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1490type = "input_checkbox_group";
    private final Attributes attributes;
    private final String name;
    private final InputCheckbox.InputCheckboxComponentStyle styles;
    public static final Parcelable.Creator<InputCheckboxGroup> CREATOR = new Creator();

    public InputCheckboxGroup(String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = inputCheckboxComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final InputCheckbox.InputCheckboxComponentStyle getStyles() {
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
        InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle = this.styles;
        if (inputCheckboxComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputCheckboxComponentStyle.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "prefill", "", "", AnnotatedPrivateKey.LABEL, "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getPrefill", "()Ljava/util/List;", "getLabel", "()Ljava/lang/String;", "getOptions", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final List<OptionWithDescription> options;
        private final List<String> prefill;

        public Attributes(List<String> list, String str, List<OptionWithDescription> list2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            list2.getClass();
            this.prefill = list;
            this.label = str;
            this.options = list2;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

        public final List<OptionWithDescription> getOptions() {
            return this.options;
        }

        public final List<String> getPrefill() {
            return this.prefill;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeStringList(this.prefill);
            dest.writeString(this.label);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, dest);
            while (m.hasNext()) {
                ((OptionWithDescription) m.next()).writeToParcel(dest, flags);
            }
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
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                parcel.getClass();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = CameraState$Type$EnumUnboxingLocalUtility.m(OptionWithDescription.CREATOR, parcel, arrayList, i, 1);
                }
                return new Attributes(createStringArrayList, readString, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010(\u001a\u00020)J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010#¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup$InputCheckboxComponentStyle;", "Landroid/os/Parcelable;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;", "textColorHighlight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;)V", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputCheckboxTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "textBasedStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "descriptionTextStyle", "getDescriptionTextStyle", "errorTextStyle", "getErrorTextStyle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputCheckboxComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputCheckboxComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputCheckboxFontFamilyStyle fontFamily;
        private final AttributeStyles.InputCheckboxFontSizeStyle fontSize;
        private final AttributeStyles.InputCheckboxFontWeightStyle fontWeight;
        private final AttributeStyles.InputCheckboxLetterSpacingStyle letterSpacing;
        private final AttributeStyles.InputCheckboxLineHeightStyle lineHeight;
        private final AttributeStyles.InputCheckboxTextColorStyle textColor;
        private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

        public InputCheckboxComponentStyle(AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle, AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle, AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle, AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle, AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle, AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
            this.fontFamily = inputCheckboxFontFamilyStyle;
            this.fontSize = inputCheckboxFontSizeStyle;
            this.fontWeight = inputCheckboxFontWeightStyle;
            this.letterSpacing = inputCheckboxLetterSpacingStyle;
            this.lineHeight = inputCheckboxLineHeightStyle;
            this.textColor = inputCheckboxTextColorStyle;
            this.textColorHighlight = textBasedTextColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getDescriptionTextStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getDescription() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getDescription() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getDescription() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getDescription() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getDescription() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getDescription() : null), null);
        }

        public final TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getError() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getError() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getError() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getError() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getError() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getError() : null), null);
        }

        public final AttributeStyles.InputCheckboxFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.InputCheckboxFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.InputCheckboxFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final AttributeStyles.InputCheckboxLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.InputCheckboxLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputCheckboxFontFamilyStyle != null ? inputCheckboxFontFamilyStyle.getBase() : null);
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputCheckboxFontSizeStyle != null ? inputCheckboxFontSizeStyle.getBase() : null);
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputCheckboxFontWeightStyle != null ? inputCheckboxFontWeightStyle.getBase() : null);
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputCheckboxLetterSpacingStyle != null ? inputCheckboxLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputCheckboxLineHeightStyle != null ? inputCheckboxLineHeightStyle.getBase() : null);
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputCheckboxTextColorStyle != null ? inputCheckboxTextColorStyle.getBase() : null), this.textColorHighlight);
        }

        public final AttributeStyles.InputCheckboxTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
            return this.textColorHighlight;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = this.fontFamily;
            if (inputCheckboxFontFamilyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxFontFamilyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = this.fontSize;
            if (inputCheckboxFontSizeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxFontSizeStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = this.fontWeight;
            if (inputCheckboxFontWeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxFontWeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = this.letterSpacing;
            if (inputCheckboxLetterSpacingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxLetterSpacingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = this.lineHeight;
            if (inputCheckboxLineHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxLineHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = this.textColor;
            if (inputCheckboxTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputCheckboxTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
            if (textBasedTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedTextColorStyle.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputCheckboxComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxComponentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputCheckboxComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputCheckboxTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputCheckboxComponentStyle[] newArray(int i) {
                return new InputCheckboxComponentStyle[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputCheckboxGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxGroup createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InputCheckboxGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputCheckbox.InputCheckboxComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxGroup[] newArray(int i) {
            return new InputCheckboxGroup[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public /* synthetic */ InputCheckboxGroup(String str, Attributes attributes, InputCheckbox.InputCheckboxComponentStyle inputCheckboxComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : inputCheckboxComponentStyle);
    }
}
