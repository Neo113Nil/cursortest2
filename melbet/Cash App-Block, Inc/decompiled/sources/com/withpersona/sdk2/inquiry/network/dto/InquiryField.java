package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "Landroid/os/Parcelable;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Companion", "StringField", "IntegerField", "BooleanField", "FloatField", "DateField", "DatetimeField", "ChoicesField", "MultiChoicesField", "Unknown", "UnknownAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class InquiryField implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$UnknownAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "()V", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownAdapter extends JsonAdapter {
        public static final UnknownAdapter INSTANCE = new UnknownAdapter();

        private UnknownAdapter() {
        }

        @Override // com.squareup.moshi.JsonAdapter
        public InquiryField fromJson(JsonReader reader) {
            reader.getClass();
            reader.beginObject();
            String str = "";
            while (reader.hasNext()) {
                if (Intrinsics.areEqual(reader.nextName(), "type")) {
                    str = reader.nextString();
                    str.getClass();
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
            return new Unknown(str);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, InquiryField value) {
            writer.getClass();
            writer.beginObject();
            writer.name("type");
            writer.value(value != null ? value.getType() : null);
            writer.endObject();
        }
    }

    private InquiryField(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BooleanField extends InquiryField {
        public static final String TYPE = "boolean";
        private final String type;
        private final Boolean value;
        public static final Parcelable.Creator<BooleanField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanField(Boolean bool, String str) {
            super(str, null);
            str.getClass();
            this.value = bool;
            this.type = str;
        }

        public static /* synthetic */ BooleanField copy$default(BooleanField booleanField, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = booleanField.value;
            }
            if ((i & 2) != 0) {
                str = booleanField.type;
            }
            return booleanField.copy(bool, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final BooleanField copy(Boolean value, String type2) {
            type2.getClass();
            return new BooleanField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BooleanField)) {
                return false;
            }
            BooleanField booleanField = (BooleanField) other;
            return Intrinsics.areEqual(this.value, booleanField.value) && Intrinsics.areEqual(this.type, booleanField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            Boolean bool = this.value;
            return this.type.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public String toString() {
            return "BooleanField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Boolean bool = this.value;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(dest, 1, bool);
            }
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BooleanField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField createFromParcel(Parcel parcel) {
                Boolean valueOf;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BooleanField(valueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField[] newArray(int i) {
                return new BooleanField[i];
            }
        }

        public /* synthetic */ BooleanField(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i & 2) != 0 ? TYPE : str);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChoicesField extends InquiryField {
        public static final String TYPE = "choices";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<ChoicesField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoicesField(String str, String str2) {
            super(str2, null);
            str2.getClass();
            this.value = str;
            this.type = str2;
        }

        public static /* synthetic */ ChoicesField copy$default(ChoicesField choicesField, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = choicesField.value;
            }
            if ((i & 2) != 0) {
                str2 = choicesField.type;
            }
            return choicesField.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final ChoicesField copy(String value, String type2) {
            type2.getClass();
            return new ChoicesField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChoicesField)) {
                return false;
            }
            ChoicesField choicesField = (ChoicesField) other;
            return Intrinsics.areEqual(this.value, choicesField.value) && Intrinsics.areEqual(this.type, choicesField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ChoicesField(value=", this.value, ", type=", this.type, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ChoicesField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField[] newArray(int i) {
                return new ChoicesField[i];
            }
        }

        public /* synthetic */ ChoicesField(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? TYPE : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;", "", "<init>", "()V", "createAdapter", "Lcom/squareup/moshi/JsonAdapter$Factory;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JsonAdapter.Factory createAdapter() {
            PolymorphicJsonAdapterFactory of = PolymorphicJsonAdapterFactory.of(InquiryField.class, "type");
            UnknownAdapter unknownAdapter = UnknownAdapter.INSTANCE;
            unknownAdapter.getClass();
            return of.withFallbackJsonAdapter(unknownAdapter).withSubtype(StringField.class, StringField.TYPE).withSubtype(IntegerField.class, IntegerField.TYPE).withSubtype(BooleanField.class, BooleanField.TYPE).withSubtype(FloatField.class, FloatField.TYPE).withSubtype(FloatField.class, FloatField.TYPE2).withSubtype(DateField.class, DateField.TYPE).withSubtype(DatetimeField.class, DatetimeField.TYPE).withSubtype(ChoicesField.class, ChoicesField.TYPE).withSubtype(MultiChoicesField.class, MultiChoicesField.TYPE);
        }

        private Companion() {
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DateField extends InquiryField {
        public static final String TYPE = "date";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<DateField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateField(String str, String str2) {
            super(str2, null);
            str2.getClass();
            this.value = str;
            this.type = str2;
        }

        public static /* synthetic */ DateField copy$default(DateField dateField, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dateField.value;
            }
            if ((i & 2) != 0) {
                str2 = dateField.type;
            }
            return dateField.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final DateField copy(String value, String type2) {
            type2.getClass();
            return new DateField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateField)) {
                return false;
            }
            DateField dateField = (DateField) other;
            return Intrinsics.areEqual(this.value, dateField.value) && Intrinsics.areEqual(this.type, dateField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("DateField(value=", this.value, ", type=", this.type, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField[] newArray(int i) {
                return new DateField[i];
            }
        }

        public /* synthetic */ DateField(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? TYPE : str2);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DatetimeField extends InquiryField {
        public static final String TYPE = "datetime";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<DatetimeField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DatetimeField(String str, String str2) {
            super(str2, null);
            str2.getClass();
            this.value = str;
            this.type = str2;
        }

        public static /* synthetic */ DatetimeField copy$default(DatetimeField datetimeField, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = datetimeField.value;
            }
            if ((i & 2) != 0) {
                str2 = datetimeField.type;
            }
            return datetimeField.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final DatetimeField copy(String value, String type2) {
            type2.getClass();
            return new DatetimeField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatetimeField)) {
                return false;
            }
            DatetimeField datetimeField = (DatetimeField) other;
            return Intrinsics.areEqual(this.value, datetimeField.value) && Intrinsics.areEqual(this.type, datetimeField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("DatetimeField(value=", this.value, ", type=", this.type, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DatetimeField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DatetimeField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField[] newArray(int i) {
                return new DatetimeField[i];
            }
        }

        public /* synthetic */ DatetimeField(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? TYPE : str2);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "", "<init>", "(Ljava/lang/Float;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FloatField extends InquiryField {
        public static final String TYPE = "float";
        public static final String TYPE2 = "number";
        private final String type;
        private final Float value;
        public static final Parcelable.Creator<FloatField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FloatField(Float f, String str) {
            super(str, null);
            str.getClass();
            this.value = f;
            this.type = str;
        }

        public static /* synthetic */ FloatField copy$default(FloatField floatField, Float f, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                f = floatField.value;
            }
            if ((i & 2) != 0) {
                str = floatField.type;
            }
            return floatField.copy(f, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Float getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final FloatField copy(Float value, String type2) {
            type2.getClass();
            return new FloatField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatField)) {
                return false;
            }
            FloatField floatField = (FloatField) other;
            return Intrinsics.areEqual((Object) this.value, (Object) floatField.value) && Intrinsics.areEqual(this.type, floatField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final Float getValue() {
            return this.value;
        }

        public int hashCode() {
            Float f = this.value;
            return this.type.hashCode() + ((f == null ? 0 : f.hashCode()) * 31);
        }

        public String toString() {
            return "FloatField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Float f = this.value;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FloatField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FloatField(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField[] newArray(int i) {
                return new FloatField[i];
            }
        }

        public /* synthetic */ FloatField(Float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, (i & 2) != 0 ? TYPE : str);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IntegerField extends InquiryField {
        public static final String TYPE = "integer";
        private final String type;
        private final Integer value;
        public static final Parcelable.Creator<IntegerField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerField(Integer num, String str) {
            super(str, null);
            str.getClass();
            this.value = num;
            this.type = str;
        }

        public static /* synthetic */ IntegerField copy$default(IntegerField integerField, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = integerField.value;
            }
            if ((i & 2) != 0) {
                str = integerField.type;
            }
            return integerField.copy(num, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final IntegerField copy(Integer value, String type2) {
            type2.getClass();
            return new IntegerField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerField)) {
                return false;
            }
            IntegerField integerField = (IntegerField) other;
            return Intrinsics.areEqual(this.value, integerField.value) && Intrinsics.areEqual(this.type, integerField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            Integer num = this.value;
            return this.type.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public String toString() {
            return "IntegerField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            Integer num = this.value;
            if (num == null) {
                dest.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(dest, 1, num);
            }
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new IntegerField(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField[] newArray(int i) {
                return new IntegerField[i];
            }
        }

        public /* synthetic */ IntegerField(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i & 2) != 0 ? TYPE : str);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J*\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "", "type", "<init>", "([Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getType", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "component1", "component2", "copy", "([Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MultiChoicesField extends InquiryField {
        public static final String TYPE = "multi_choices";
        private final String type;
        private final String[] value;
        public static final Parcelable.Creator<MultiChoicesField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiChoicesField(String[] strArr, String str) {
            super(str, null);
            str.getClass();
            this.value = strArr;
            this.type = str;
        }

        public static /* synthetic */ MultiChoicesField copy$default(MultiChoicesField multiChoicesField, String[] strArr, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                strArr = multiChoicesField.value;
            }
            if ((i & 2) != 0) {
                str = multiChoicesField.type;
            }
            return multiChoicesField.copy(strArr, str);
        }

        /* renamed from: component1, reason: from getter */
        public final String[] getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final MultiChoicesField copy(String[] value, String type2) {
            type2.getClass();
            return new MultiChoicesField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!MultiChoicesField.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            String[] strArr = this.value;
            String[] strArr2 = ((MultiChoicesField) other).value;
            if (strArr != null) {
                if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                    return false;
                }
            } else if (strArr2 != null) {
                return false;
            }
            return true;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String[] getValue() {
            return this.value;
        }

        public int hashCode() {
            String[] strArr = this.value;
            if (strArr != null) {
                return Arrays.hashCode(strArr);
            }
            return 0;
        }

        public String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("MultiChoicesField(value=", Arrays.toString(this.value), ", type=", this.type, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeStringArray(this.value);
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MultiChoicesField(parcel.createStringArray(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField[] newArray(int i) {
                return new MultiChoicesField[i];
            }
        }

        public /* synthetic */ MultiChoicesField(String[] strArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, (i & 2) != 0 ? TYPE : str);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "value", "", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StringField extends InquiryField {
        public static final String TYPE = "string";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<StringField> CREATOR = new Creator();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringField(String str, String str2) {
            super(str2, null);
            str2.getClass();
            this.value = str;
            this.type = str2;
        }

        public static /* synthetic */ StringField copy$default(StringField stringField, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringField.value;
            }
            if ((i & 2) != 0) {
                str2 = stringField.type;
            }
            return stringField.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final StringField copy(String value, String type2) {
            type2.getClass();
            return new StringField(value, type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringField)) {
                return false;
            }
            StringField stringField = (StringField) other;
            return Intrinsics.areEqual(this.value, stringField.value) && Intrinsics.areEqual(this.type, stringField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("StringField(value=", this.value, ", type=", this.type, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StringField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new StringField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField[] newArray(int i) {
                return new StringField[i];
            }
        }

        public /* synthetic */ StringField(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? TYPE : str2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unknown extends InquiryField {
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String str) {
            super(str, null);
            str.getClass();
            this.type = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Unknown(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }
    }

    public /* synthetic */ InquiryField(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
