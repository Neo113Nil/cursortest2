package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$InputFileUploadComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$InputFileUploadComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$InputFileUploadComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InputFileUploadComponentStyle", "ButtonSecondaryStyleWrapper", "ButtonSecondaryStyleContainer", "Attributes", "PrefillItem", "PrefillItemAdapter", "Optional", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputFileUpload implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f1494type = "input_file_upload";
    private final Attributes attributes;
    private final String name;
    private final InputFileUploadComponentStyle styles;
    public static final Parcelable.Creator<InputFileUpload> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\"\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItemAdapter;", "", "<init>", "()V", "fromJson", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItem;", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "", "item", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrefillItemAdapter {
        public static final PrefillItemAdapter INSTANCE = new PrefillItemAdapter();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonReader.Token.values().length];
                try {
                    iArr[5] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[8] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private PrefillItemAdapter() {
        }

        @FromJson
        public final PrefillItem fromJson(JsonReader reader) {
            reader.getClass();
            JsonReader.Token peek = reader.peek();
            int i = peek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[peek.ordinal()];
            if (i == 1) {
                String nextString = reader.nextString();
                nextString.getClass();
                return new PrefillItem(nextString, null);
            }
            if (i != 2) {
                if (i != 3) {
                    reader.skipValue();
                    return null;
                }
                reader.nextNull();
                return null;
            }
            reader.beginObject();
            String str = null;
            String str2 = null;
            while (reader.hasNext()) {
                String nextName = reader.nextName();
                if (Intrinsics.areEqual(nextName, "filename")) {
                    str = reader.nextString();
                } else if (!Intrinsics.areEqual(nextName, "url")) {
                    reader.skipValue();
                } else if (reader.peek() == JsonReader.Token.NULL) {
                    reader.nextNull();
                    str2 = null;
                } else {
                    str2 = reader.nextString();
                }
            }
            reader.endObject();
            if (str != null) {
                return new PrefillItem(str, str2);
            }
            return null;
        }

        @ToJson
        public final Map<String, String> toJson(PrefillItem item) {
            if (item == null) {
                return null;
            }
            return MapsKt__MapsKt.mapOf(new Pair("filename", item.getFilename()), new Pair("url", item.getUrl()));
        }
    }

    public InputFileUpload(String str, Attributes attributes, InputFileUploadComponentStyle inputFileUploadComponentStyle) {
        str.getClass();
        this.name = str;
        this.attributes = attributes;
        this.styles = inputFileUploadComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final InputFileUploadComponentStyle getStyles() {
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
        InputFileUploadComponentStyle inputFileUploadComponentStyle = this.styles;
        if (inputFileUploadComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputFileUploadComponentStyle.writeToParcel(dest, flags);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\nJ\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "field", "", AnnotatedPrivateKey.LABEL, "prefill", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItem;", "allowedFileTypes", "fileUploadLimit", "", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "optional", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Optional;", "tooltipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Optional;Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "getLabel", "getPrefill", "()Ljava/util/List;", "getAllowedFileTypes", "getFileUploadLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getOptional", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Optional;", "getTooltipText", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final List<String> allowedFileTypes;
        private final JsonLogicBoolean disabled;
        private final String field;
        private final Integer fileUploadLimit;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final Optional optional;
        private final List<PrefillItem> prefill;
        private final String tooltipText;

        public Attributes(String str, String str2, List<PrefillItem> list, List<String> list2, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Optional optional, String str3) {
            this.field = str;
            this.label = str2;
            this.prefill = list;
            this.allowedFileTypes = list2;
            this.fileUploadLimit = num;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.optional = optional;
            this.tooltipText = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<String> getAllowedFileTypes() {
            return this.allowedFileTypes;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getField() {
            return this.field;
        }

        public final Integer getFileUploadLimit() {
            return this.fileUploadLimit;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Optional getOptional() {
            return this.optional;
        }

        public final List<PrefillItem> getPrefill() {
            return this.prefill;
        }

        public final String getTooltipText() {
            return this.tooltipText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.field);
            dest.writeString(this.label);
            List<PrefillItem> list = this.prefill;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(dest, 1, list);
                while (m.hasNext()) {
                    ((PrefillItem) m.next()).writeToParcel(dest, flags);
                }
            }
            dest.writeStringList(this.allowedFileTypes);
            Integer num = this.fileUploadLimit;
            if (num == null) {
                dest.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(dest, 1, num);
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
            Optional optional = this.optional;
            if (optional == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                optional.writeToParcel(dest, flags);
            }
            dest.writeString(this.tooltipText);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(PrefillItem.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                return new Attributes(readString, readString2, arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Optional.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonSecondaryStyleContainer implements Parcelable {
        public static final Parcelable.Creator<ButtonSecondaryStyleContainer> CREATOR = new Creator();
        private final ButtonCancelComponentStyle base;

        public ButtonSecondaryStyleContainer(ButtonCancelComponentStyle buttonCancelComponentStyle) {
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
        public static final class Creator implements Parcelable.Creator<ButtonSecondaryStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonSecondaryStyleContainer createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonSecondaryStyleContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonSecondaryStyleContainer[] newArray(int i) {
                return new ButtonSecondaryStyleContainer[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleWrapper;", "Landroid/os/Parcelable;", "button", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleContainer;)V", "getButton", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonSecondaryStyleWrapper implements Parcelable {
        public static final Parcelable.Creator<ButtonSecondaryStyleWrapper> CREATOR = new Creator();
        private final ButtonSecondaryStyleContainer button;

        public ButtonSecondaryStyleWrapper(ButtonSecondaryStyleContainer buttonSecondaryStyleContainer) {
            this.button = buttonSecondaryStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ButtonSecondaryStyleContainer getButton() {
            return this.button;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            ButtonSecondaryStyleContainer buttonSecondaryStyleContainer = this.button;
            if (buttonSecondaryStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonSecondaryStyleContainer.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonSecondaryStyleWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonSecondaryStyleWrapper createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ButtonSecondaryStyleWrapper(parcel.readInt() == 0 ? null : ButtonSecondaryStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonSecondaryStyleWrapper[] newArray(int i) {
                return new ButtonSecondaryStyleWrapper[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010<\u001a\u00020=J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020=R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u0001098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$InputFileUploadComponentStyle;", "Landroid/os/Parcelable;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleWrapper;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleWrapper;)V", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$ButtonSecondaryStyleWrapper;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "chooseFileButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getChooseFileButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputFileUploadComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputFileUploadComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputTextBackgroundColorStyle backgroundColor;
        private final AttributeStyles.InputTextBorderColorStyle borderColor;
        private final AttributeStyles.InputTextBorderRadiusStyle borderRadius;
        private final AttributeStyles.InputTextBorderWidthStyle borderWidth;
        private final ButtonSecondaryStyleWrapper buttonSecondaryStyle;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.InputMarginStyle margin;
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;

        public InputFileUploadComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, ButtonSecondaryStyleWrapper buttonSecondaryStyleWrapper) {
            this.margin = inputMarginStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.borderRadius = inputTextBorderRadiusStyle;
            this.borderWidth = inputTextBorderWidthStyle;
            this.backgroundColor = inputTextBackgroundColorStyle;
            this.borderColor = inputTextBorderColorStyle;
            this.buttonSecondaryStyle = buttonSecondaryStyleWrapper;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final ButtonSecondaryStyleWrapper getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        public final ButtonCancelComponentStyle getChooseFileButtonStyle() {
            ButtonSecondaryStyleContainer button;
            ButtonSecondaryStyleWrapper buttonSecondaryStyleWrapper = this.buttonSecondaryStyle;
            if (buttonSecondaryStyleWrapper == null || (button = buttonSecondaryStyleWrapper.getButton()) == null) {
                return null;
            }
            return button.getBase();
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
            return new InputTextBasedComponentStyle(this.margin, this.fontFamily, this.fontSize, this.fontWeight, this.letterSpacing, this.lineHeight, this.textColor, this.borderRadius, this.borderWidth, this.backgroundColor, this.borderColor, null);
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

        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
            if (inputMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputMarginStyle.writeToParcel(dest, flags);
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
            AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
            if (inputTextBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputTextBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
            if (inputTextBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputTextBorderWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
            if (inputTextBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputTextBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
            if (inputTextBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputTextBorderColorStyle.writeToParcel(dest, flags);
            }
            ButtonSecondaryStyleWrapper buttonSecondaryStyleWrapper = this.buttonSecondaryStyle;
            if (buttonSecondaryStyleWrapper == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonSecondaryStyleWrapper.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputFileUploadComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputFileUploadComponentStyle createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InputFileUploadComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonSecondaryStyleWrapper.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputFileUploadComponentStyle[] newArray(int i) {
                return new InputFileUploadComponentStyle[i];
            }
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Optional;", "Landroid/os/Parcelable;", "logic", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "message", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;)V", "getLogic", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getMessage", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Optional implements Parcelable {
        public static final Parcelable.Creator<Optional> CREATOR = new Creator();
        private final JsonLogicBoolean logic;
        private final String message;

        public Optional(JsonLogicBoolean jsonLogicBoolean, String str) {
            this.logic = jsonLogicBoolean;
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getLogic() {
            return this.logic;
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            JsonLogicBoolean jsonLogicBoolean = this.logic;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            dest.writeString(this.message);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Optional> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Optional createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Optional(parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Optional[] newArray(int i) {
                return new Optional[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItem;", "Landroid/os/Parcelable;", "filename", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrefillItem implements Parcelable {
        public static final Parcelable.Creator<PrefillItem> CREATOR = new Creator();
        private final String filename;
        private final String url;

        public PrefillItem(String str, String str2) {
            str.getClass();
            this.filename = str;
            this.url = str2;
        }

        public static /* synthetic */ PrefillItem copy$default(PrefillItem prefillItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prefillItem.filename;
            }
            if ((i & 2) != 0) {
                str2 = prefillItem.url;
            }
            return prefillItem.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final PrefillItem copy(String filename, String url) {
            filename.getClass();
            return new PrefillItem(filename, url);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrefillItem)) {
                return false;
            }
            PrefillItem prefillItem = (PrefillItem) other;
            return Intrinsics.areEqual(this.filename, prefillItem.filename) && Intrinsics.areEqual(this.url, prefillItem.url);
        }

        public final String getFilename() {
            return this.filename;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.filename.hashCode() * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("PrefillItem(filename=", this.filename, ", url=", this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.filename);
            dest.writeString(this.url);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrefillItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrefillItem createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PrefillItem(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrefillItem[] newArray(int i) {
                return new PrefillItem[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputFileUpload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputFileUpload createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InputFileUpload(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputFileUploadComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputFileUpload[] newArray(int i) {
            return new InputFileUpload[i];
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }
}
