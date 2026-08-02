package com.withpersona.sdk2.inquiry.ui.network;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.withpersona.sdk2.inquiry.nfc.ChipAuthenticationStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public abstract class ComponentParam implements Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)V", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Adapter extends JsonAdapter {
        public static final Adapter INSTANCE = new Adapter();

        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public ComponentParam fromJson(JsonReader reader) {
            reader.getClass();
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, ComponentParam value) {
            String str;
            writer.getClass();
            if (value instanceof ComponentString) {
                writer.value(((ComponentString) value).value);
                return;
            }
            if (value instanceof ComponentStringList) {
                writer.beginArray();
                Iterator it = ((ComponentStringList) value).value.iterator();
                while (it.hasNext()) {
                    writer.value((String) it.next());
                }
                writer.endArray();
                return;
            }
            if (value instanceof Address) {
                writer.beginObject();
                Address address = (Address) value;
                String str2 = address.street1;
                if (str2 != null) {
                    writer.name("street_1");
                    writer.value(str2);
                }
                String str3 = address.street2;
                if (str3 != null) {
                    writer.name("street_2");
                    writer.value(str3);
                }
                String str4 = address.city;
                if (str4 != null) {
                    writer.name("city");
                    writer.value(str4);
                }
                String str5 = address.subdivision;
                if (str5 != null) {
                    writer.name("subdivision");
                    writer.value(str5);
                }
                String str6 = address.postalCode;
                if (str6 != null) {
                    writer.name("postal_code");
                    writer.value(str6);
                }
                writer.endObject();
                return;
            }
            if (value instanceof ComponentBoolean) {
                writer.value(((ComponentBoolean) value).value);
                return;
            }
            if (value instanceof ComponentNumber) {
                writer.value(new BigDecimal(((ComponentNumber) value).value.doubleValue()).toPlainString());
                return;
            }
            if (value instanceof ESignature) {
                writer.value(((ESignature) value).signatureImageString);
                return;
            }
            if (value instanceof GovernmentIdNfcScan) {
                writer.beginObject();
                GovernmentIdNfcScan governmentIdNfcScan = (GovernmentIdNfcScan) value;
                ChipAuthenticationStatus chipAuthenticationStatus = governmentIdNfcScan.chipAuthenticationStatus;
                if (chipAuthenticationStatus != null) {
                    writer.name("caFlag");
                    int ordinal = chipAuthenticationStatus.ordinal();
                    if (ordinal == 0) {
                        str = "notRequested";
                    } else if (ordinal == 1) {
                        str = "notSupported";
                    } else if (ordinal == 2) {
                        str = "failed";
                    } else {
                        if (ordinal != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        str = "success";
                    }
                    writer.value(str);
                }
                String str7 = governmentIdNfcScan.dg1;
                if (str7 != null) {
                    writer.name("dg1");
                    writer.value(str7);
                }
                String str8 = governmentIdNfcScan.dg2;
                if (str8 != null) {
                    writer.name("dg2");
                    writer.value(str8);
                }
                String str9 = governmentIdNfcScan.sod;
                if (str9 != null) {
                    writer.name("sod");
                    writer.value(str9);
                }
                writer.endObject();
                return;
            }
            if (value instanceof InternationalDbParams) {
                writer.beginObject();
                InternationalDbParams internationalDbParams = (InternationalDbParams) value;
                String str10 = internationalDbParams.country;
                if (str10 != null) {
                    writer.name("idb_country");
                    writer.value(str10);
                }
                String str11 = internationalDbParams.f1517type;
                if (str11 != null) {
                    writer.name("idb_type");
                    writer.value(str11);
                }
                String str12 = internationalDbParams.value;
                if (str12 != null) {
                    writer.name("idb_value");
                    writer.value(str12);
                }
                writer.endObject();
                return;
            }
            if (value instanceof PhoneNumberSnaParams) {
                writer.beginObject();
                PhoneNumberSnaParams phoneNumberSnaParams = (PhoneNumberSnaParams) value;
                String str13 = phoneNumberSnaParams.code;
                if (str13 != null) {
                    writer.name("code");
                    writer.value(str13);
                }
                String str14 = phoneNumberSnaParams.errorName;
                if (str14 != null) {
                    writer.name(BreadcrumbHelper.Category.ERROR);
                    writer.beginObject();
                    writer.name("name");
                    writer.value(str14);
                    writer.name("message");
                    String str15 = phoneNumberSnaParams.errorMessage;
                    writer.value(str15 != null ? str15 : "");
                    writer.endObject();
                }
                writer.endObject();
                return;
            }
            if (!(value instanceof FileUpload)) {
                if (value == null) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            FileUpload fileUpload = (FileUpload) value;
            ArrayList arrayList = fileUpload.uris;
            if (fileUpload.hasPrefill && arrayList.isEmpty()) {
                writer.value("USE PREVIOUS FILE");
                return;
            }
            if (arrayList.isEmpty()) {
                writer.beginArray();
                writer.value("");
                writer.endArray();
                return;
            }
            writer.beginArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = uri.toString();
                    lastPathSegment.getClass();
                }
                writer.value(lastPathSegment);
            }
            writer.endArray();
        }
    }

    public final class Address extends ComponentParam {
        public static final Parcelable.Creator<Address> CREATOR = new Element.AnonymousClass1(15);
        public final String city;
        public final String postalCode;
        public final String street1;
        public final String street2;
        public final String subdivision;

        public Address(String str, String str2, String str3, String str4, String str5) {
            this.street1 = str;
            this.street2 = str2;
            this.city = str3;
            this.subdivision = str4;
            this.postalCode = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.street1);
            parcel.writeString(this.street2);
            parcel.writeString(this.city);
            parcel.writeString(this.subdivision);
            parcel.writeString(this.postalCode);
        }
    }

    public final class ComponentBoolean extends ComponentParam {
        public static final Parcelable.Creator<ComponentBoolean> CREATOR = new Element.AnonymousClass1(16);
        public final boolean value;

        public ComponentBoolean(boolean z) {
            this.value = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.value ? 1 : 0);
        }
    }

    public final class ComponentNumber extends ComponentParam {
        public static final Parcelable.Creator<ComponentNumber> CREATOR = new Element.AnonymousClass1(17);
        public final Number value;

        public ComponentNumber(Number number) {
            number.getClass();
            this.value = number;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.value);
        }
    }

    public final class ComponentString extends ComponentParam {
        public static final Parcelable.Creator<ComponentString> CREATOR = new Element.AnonymousClass1(18);
        public final String value;

        public ComponentString(String str) {
            str.getClass();
            this.value = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.value);
        }
    }

    public final class ComponentStringList extends ComponentParam {
        public static final Parcelable.Creator<ComponentStringList> CREATOR = new Element.AnonymousClass1(19);
        public final List value;

        public ComponentStringList(List list) {
            list.getClass();
            this.value = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeStringList(this.value);
        }
    }

    public final class ESignature extends ComponentParam {
        public static final Parcelable.Creator<ESignature> CREATOR = new Element.AnonymousClass1(20);
        public final String signatureImageString;

        public ESignature(String str) {
            this.signatureImageString = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.signatureImageString);
        }
    }

    public final class FileUpload extends ComponentParam {
        public static final Parcelable.Creator<FileUpload> CREATOR = new Element.AnonymousClass1(21);
        public final boolean hasPrefill;
        public final ArrayList uris;

        public FileUpload(ArrayList arrayList, boolean z) {
            this.uris = arrayList;
            this.hasPrefill = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.uris, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeInt(this.hasPrefill ? 1 : 0);
        }
    }

    public final class GovernmentIdNfcScan extends ComponentParam {
        public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new Element.AnonymousClass1(22);
        public final ChipAuthenticationStatus chipAuthenticationStatus;
        public final String dg1;
        public final String dg2;
        public final String sod;

        public GovernmentIdNfcScan(String str, String str2, String str3, ChipAuthenticationStatus chipAuthenticationStatus) {
            this.dg1 = str;
            this.dg2 = str2;
            this.sod = str3;
            this.chipAuthenticationStatus = chipAuthenticationStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.dg1);
            parcel.writeString(this.dg2);
            parcel.writeString(this.sod);
            ChipAuthenticationStatus chipAuthenticationStatus = this.chipAuthenticationStatus;
            if (chipAuthenticationStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(chipAuthenticationStatus.name());
            }
        }
    }

    public final class InternationalDbParams extends ComponentParam {
        public static final Parcelable.Creator<InternationalDbParams> CREATOR = new Element.AnonymousClass1(23);
        public final String country;

        /* renamed from: type, reason: collision with root package name */
        public final String f1517type;
        public final String value;

        public InternationalDbParams(String str, String str2, String str3) {
            this.country = str;
            this.f1517type = str2;
            this.value = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.country);
            parcel.writeString(this.f1517type);
            parcel.writeString(this.value);
        }
    }

    public final class PhoneNumberSnaParams extends ComponentParam {
        public static final Parcelable.Creator<PhoneNumberSnaParams> CREATOR = new Element.AnonymousClass1(24);
        public final String code;
        public final String errorMessage;
        public final String errorName;

        public PhoneNumberSnaParams(String str, String str2, String str3) {
            this.code = str;
            this.errorName = str2;
            this.errorMessage = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.code);
            parcel.writeString(this.errorName);
            parcel.writeString(this.errorMessage);
        }
    }
}
