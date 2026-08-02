package com.withpersona.sdk2.inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField;", "Landroid/os/Parcelable;", "<init>", "()V", "IntegerField", "BooleanField", "StringField", "FloatField", "DateField", "DatetimeField", "ChoicesField", "MultiChoicesField", "UnknownField", "Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class InquiryField implements Parcelable {
    public /* synthetic */ InquiryField(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BooleanField extends InquiryField {
        public static final Parcelable.Creator<BooleanField> CREATOR = new Creator();
        private final Boolean value;

        public BooleanField(Boolean bool) {
            super(null);
            this.value = bool;
        }

        public static /* synthetic */ BooleanField copy$default(BooleanField booleanField, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = booleanField.value;
            }
            return booleanField.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        public final BooleanField copy(Boolean value) {
            return new BooleanField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BooleanField) && Intrinsics.areEqual(this.value, ((BooleanField) other).value);
        }

        public final Boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            Boolean bool = this.value;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.value, "BooleanField(value=", ")");
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
                return new BooleanField(valueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField[] newArray(int i) {
                return new BooleanField[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChoicesField extends InquiryField {
        public static final Parcelable.Creator<ChoicesField> CREATOR = new Creator();
        private final String value;

        public ChoicesField(String str) {
            super(null);
            this.value = str;
        }

        public static /* synthetic */ ChoicesField copy$default(ChoicesField choicesField, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = choicesField.value;
            }
            return choicesField.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final ChoicesField copy(String value) {
            return new ChoicesField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChoicesField) && Intrinsics.areEqual(this.value, ((ChoicesField) other).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChoicesField(value=", this.value, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.value);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ChoicesField(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField[] newArray(int i) {
                return new ChoicesField[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getValue", "()Ljava/util/Date;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DateField extends InquiryField {
        public static final Parcelable.Creator<DateField> CREATOR = new Creator();
        private final Date value;

        public DateField(Date date) {
            super(null);
            this.value = date;
        }

        public static /* synthetic */ DateField copy$default(DateField dateField, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = dateField.value;
            }
            return dateField.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getValue() {
            return this.value;
        }

        public final DateField copy(Date value) {
            return new DateField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DateField) && Intrinsics.areEqual(this.value, ((DateField) other).value);
        }

        public final Date getValue() {
            return this.value;
        }

        public int hashCode() {
            Date date = this.value;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public String toString() {
            return "DateField(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeSerializable(this.value);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DateField((Date) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField[] newArray(int i) {
                return new DateField[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getValue", "()Ljava/util/Date;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DatetimeField extends InquiryField {
        public static final Parcelable.Creator<DatetimeField> CREATOR = new Creator();
        private final Date value;

        public DatetimeField(Date date) {
            super(null);
            this.value = date;
        }

        public static /* synthetic */ DatetimeField copy$default(DatetimeField datetimeField, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = datetimeField.value;
            }
            return datetimeField.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getValue() {
            return this.value;
        }

        public final DatetimeField copy(Date value) {
            return new DatetimeField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DatetimeField) && Intrinsics.areEqual(this.value, ((DatetimeField) other).value);
        }

        public final Date getValue() {
            return this.value;
        }

        public int hashCode() {
            Date date = this.value;
            if (date == null) {
                return 0;
            }
            return date.hashCode();
        }

        public String toString() {
            return "DatetimeField(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeSerializable(this.value);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DatetimeField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DatetimeField((Date) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField[] newArray(int i) {
                return new DatetimeField[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/Float;)V", "getValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "copy", "(Ljava/lang/Float;)Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FloatField extends InquiryField {
        public static final Parcelable.Creator<FloatField> CREATOR = new Creator();
        private final Float value;

        public FloatField(Float f) {
            super(null);
            this.value = f;
        }

        public static /* synthetic */ FloatField copy$default(FloatField floatField, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = floatField.value;
            }
            return floatField.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final Float getValue() {
            return this.value;
        }

        public final FloatField copy(Float value) {
            return new FloatField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FloatField) && Intrinsics.areEqual((Object) this.value, (Object) ((FloatField) other).value);
        }

        public final Float getValue() {
            return this.value;
        }

        public int hashCode() {
            Float f = this.value;
            if (f == null) {
                return 0;
            }
            return f.hashCode();
        }

        public String toString() {
            return "FloatField(value=" + this.value + ")";
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
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FloatField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FloatField(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField[] newArray(int i) {
                return new FloatField[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IntegerField extends InquiryField {
        public static final Parcelable.Creator<IntegerField> CREATOR = new Creator();
        private final Integer value;

        public IntegerField(Integer num) {
            super(null);
            this.value = num;
        }

        public static /* synthetic */ IntegerField copy$default(IntegerField integerField, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = integerField.value;
            }
            return integerField.copy(num);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        public final IntegerField copy(Integer value) {
            return new IntegerField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntegerField) && Intrinsics.areEqual(this.value, ((IntegerField) other).value);
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            Integer num = this.value;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "IntegerField(value=" + this.value + ")";
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
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new IntegerField(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField[] newArray(int i) {
                return new IntegerField[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "", "<init>", "([Ljava/lang/String;)V", "getValue", "()[Ljava/lang/String;", "[Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "component1", "copy", "([Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MultiChoicesField extends InquiryField {
        public static final Parcelable.Creator<MultiChoicesField> CREATOR = new Creator();
        private final String[] value;

        public MultiChoicesField(String[] strArr) {
            super(null);
            this.value = strArr;
        }

        public static /* synthetic */ MultiChoicesField copy$default(MultiChoicesField multiChoicesField, String[] strArr, int i, Object obj) {
            if ((i & 1) != 0) {
                strArr = multiChoicesField.value;
            }
            return multiChoicesField.copy(strArr);
        }

        /* renamed from: component1, reason: from getter */
        public final String[] getValue() {
            return this.value;
        }

        public final MultiChoicesField copy(String[] value) {
            return new MultiChoicesField(value);
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
            return Arrays.equals(this.value, ((MultiChoicesField) other).value);
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
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MultiChoicesField(value=", Arrays.toString(this.value), ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeStringArray(this.value);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MultiChoicesField(parcel.createStringArray());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField[] newArray(int i) {
                return new MultiChoicesField[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StringField extends InquiryField {
        public static final Parcelable.Creator<StringField> CREATOR = new Creator();
        private final String value;

        public StringField(String str) {
            super(null);
            this.value = str;
        }

        public static /* synthetic */ StringField copy$default(StringField stringField, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringField.value;
            }
            return stringField.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final StringField copy(String value) {
            return new StringField(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StringField) && Intrinsics.areEqual(this.value, ((StringField) other).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StringField(value=", this.value, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.value);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StringField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new StringField(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField[] newArray(int i) {
                return new StringField[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnknownField extends InquiryField {
        public static final Parcelable.Creator<UnknownField> CREATOR = new Creator();
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownField(String str) {
            super(null);
            str.getClass();
            this.type = str;
        }

        public static /* synthetic */ UnknownField copy$default(UnknownField unknownField, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownField.type;
            }
            return unknownField.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final UnknownField copy(String type2) {
            type2.getClass();
            return new UnknownField(type2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownField) && Intrinsics.areEqual(this.type, ((UnknownField) other).type);
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnknownField(type=", this.type, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.type);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UnknownField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownField createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new UnknownField(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownField[] newArray(int i) {
                return new UnknownField[i];
            }
        }
    }

    private InquiryField() {
    }
}
