package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceOrder;
import com.stripe.android.model.SourceOrderParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class SourceParams implements Parcelable {
    public static final Parcelable.Creator<SourceParams> CREATOR = new Creator(0);
    public final Long amount;
    public final ApiParams apiParams;
    public final LinkedHashSet attribution;
    public final String currency;
    public final Map metadata;
    public final OwnerParams owner;
    public final SourceOrderParams sourceOrder;
    public final String token;
    public final String typeRaw;
    public final Source.Usage usage;

    public final class ApiParams implements Parcelable {
        public static final Parcelable.Creator<ApiParams> CREATOR = new Creator(6);
        public final Map value;

        public ApiParams(Map map) {
            this.value = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiParams) && this.value.equals(((ApiParams) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("ApiParams(value=", ")", this.value);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(StripeJsonUtils.mapToJsonObject(this.value).toString());
        }
    }

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Integer valueOf;
            SourceOrder.Item.Type type2;
            Integer num;
            String str;
            int i = 0;
            LinkedHashMap linkedHashMap = null;
            ArrayList arrayList = null;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    String readString = parcel.readString();
                    if (parcel.readParcelable(SourceParams.class.getClassLoader()) != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                    Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    String readString2 = parcel.readString();
                    OwnerParams createFromParcel = parcel.readInt() == 0 ? null : OwnerParams.CREATOR.createFromParcel(parcel);
                    Source.Usage valueOf3 = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
                    SourceOrderParams createFromParcel2 = parcel.readInt() == 0 ? null : SourceOrderParams.CREATOR.createFromParcel(parcel);
                    LinkedHashMap linkedHashMap2 = null;
                    Source.Usage usage = valueOf3;
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                        for (int i2 = 0; i2 != readInt; i2++) {
                            linkedHashMap3.put(parcel.readString(), parcel.readString());
                        }
                        linkedHashMap2 = linkedHashMap3;
                    }
                    ApiParams createFromParcel3 = ApiParams.CREATOR.createFromParcel(parcel);
                    int readInt2 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
                    while (i != readInt2) {
                        linkedHashSet.add(parcel.readString());
                        i++;
                    }
                    return new SourceParams(readString, valueOf2, readString2, createFromParcel, usage, createFromParcel2, readString3, linkedHashMap2, createFromParcel3, linkedHashSet);
                case 1:
                    parcel.getClass();
                    SourceOrder.Item.Type valueOf4 = SourceOrder.Item.Type.valueOf(parcel.readString());
                    Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        type2 = valueOf4;
                        num = valueOf5;
                        str = readString4;
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(parcel.readInt());
                        type2 = valueOf4;
                        num = valueOf5;
                        str = readString4;
                    }
                    return new SourceOrder.Item(type2, num, str, readString5, valueOf);
                case 2:
                    parcel.getClass();
                    return new SourceOrder.Shipping(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 3:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    while (i != readInt3) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(SourceOrderParams.Item.CREATOR, parcel, arrayList2, i, 1);
                    }
                    return new SourceOrderParams(arrayList2, parcel.readInt() != 0 ? SourceOrderParams.Shipping.CREATOR.createFromParcel(parcel) : null);
                case 4:
                    parcel.getClass();
                    return new SourceOrderParams.Item(parcel.readInt() == 0 ? null : SourceOrderParams.Item.Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                case 5:
                    parcel.getClass();
                    return new SourceOrderParams.Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    String readString6 = parcel.readString();
                    Map jsonObjectToMap = StripeJsonUtils.jsonObjectToMap(readString6 != null ? new JSONObject(readString6) : null);
                    if (jsonObjectToMap == null) {
                        jsonObjectToMap = EmptyMap.INSTANCE;
                        jsonObjectToMap.getClass();
                    }
                    return new ApiParams(jsonObjectToMap);
                case 7:
                    parcel.getClass();
                    Address createFromParcel4 = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null;
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    OwnerParams ownerParams = new OwnerParams();
                    ownerParams.address = createFromParcel4;
                    ownerParams.email = readString7;
                    ownerParams.name = readString8;
                    ownerParams.phone = readString9;
                    return ownerParams;
                case 8:
                    parcel.getClass();
                    return new Stripe3ds2AuthParams(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 9:
                    parcel.getClass();
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt4 = parcel.readInt();
                        arrayList = new ArrayList(readInt4);
                        while (i != readInt4) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(Stripe3ds2AuthResult.MessageExtension.CREATOR, parcel, arrayList, i, 1);
                        }
                    }
                    return new Stripe3ds2AuthResult.Ares(readString10, readString11, readString12, readString13, readString14, readString15, readString16, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 10:
                    parcel.getClass();
                    return new Stripe3ds2AuthResult(parcel.readString(), parcel.readInt() == 0 ? null : Stripe3ds2AuthResult.Ares.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? Stripe3ds2AuthResult.ThreeDS2Error.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                case 11:
                    parcel.getClass();
                    String readString17 = parcel.readString();
                    boolean z = parcel.readInt() != 0;
                    String readString18 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt5 = parcel.readInt();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt5);
                        while (i != readInt5) {
                            linkedHashMap4.put(parcel.readString(), parcel.readString());
                            i++;
                        }
                        linkedHashMap = linkedHashMap4;
                    }
                    return new Stripe3ds2AuthResult.MessageExtension(readString17, z, readString18, linkedHashMap);
                case 12:
                    parcel.getClass();
                    return new Stripe3ds2AuthResult.ThreeDS2Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new Stripe3ds2Fingerprint(parcel.readString(), parcel.readString(), parcel.readString(), Stripe3ds2Fingerprint.DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
                case 14:
                    parcel.getClass();
                    String readString19 = parcel.readString();
                    PublicKey publicKey = (PublicKey) parcel.readSerializable();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt6);
                    while (i != readInt6) {
                        arrayList3.add(parcel.readSerializable());
                        i++;
                    }
                    return new Stripe3ds2Fingerprint.DirectoryServerEncryption(readString19, publicKey, arrayList3, parcel.readString());
                case 15:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.AlipayRedirect((Uri) parcel.readParcelable(StripeIntent.NextActionData.AlipayRedirect.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    parcel.readInt();
                    return StripeIntent.NextActionData.BlikAuthorize.INSTANCE;
                case 17:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.CashAppRedirect(parcel.readString());
                case 18:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.DisplayBoletoDetails(parcel.readString());
                case 19:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.DisplayKonbiniDetails(parcel.readString());
                case 20:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.DisplayMultibancoDetails(parcel.readString());
                case 21:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.DisplayOxxoDetails(parcel.readInt(), parcel.readString(), parcel.readString());
                case 22:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.DisplayPayNowDetails(parcel.readString());
                case 23:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.DisplayPromptPayDetails(parcel.readString());
                case 24:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.RedirectToUrl((Uri) parcel.readParcelable(StripeIntent.NextActionData.RedirectToUrl.class.getClassLoader()), parcel.readString());
                case 25:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge(StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.StripeJs.CREATOR.createFromParcel(parcel));
                case 26:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.StripeJs(parcel.readString());
                case 27:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.SdkData.Use3DS2(parcel.readString(), parcel.readString(), parcel.readString(), StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                case 28:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
                default:
                    parcel.getClass();
                    return new StripeIntent.NextActionData.SwishRedirect(parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new SourceParams[i];
                case 1:
                    return new SourceOrder.Item[i];
                case 2:
                    return new SourceOrder.Shipping[i];
                case 3:
                    return new SourceOrderParams[i];
                case 4:
                    return new SourceOrderParams.Item[i];
                case 5:
                    return new SourceOrderParams.Shipping[i];
                case 6:
                    return new ApiParams[i];
                case 7:
                    return new OwnerParams[i];
                case 8:
                    return new Stripe3ds2AuthParams[i];
                case 9:
                    return new Stripe3ds2AuthResult.Ares[i];
                case 10:
                    return new Stripe3ds2AuthResult[i];
                case 11:
                    return new Stripe3ds2AuthResult.MessageExtension[i];
                case 12:
                    return new Stripe3ds2AuthResult.ThreeDS2Error[i];
                case 13:
                    return new Stripe3ds2Fingerprint[i];
                case 14:
                    return new Stripe3ds2Fingerprint.DirectoryServerEncryption[i];
                case 15:
                    return new StripeIntent.NextActionData.AlipayRedirect[i];
                case 16:
                    return new StripeIntent.NextActionData.BlikAuthorize[i];
                case 17:
                    return new StripeIntent.NextActionData.CashAppRedirect[i];
                case 18:
                    return new StripeIntent.NextActionData.DisplayBoletoDetails[i];
                case 19:
                    return new StripeIntent.NextActionData.DisplayKonbiniDetails[i];
                case 20:
                    return new StripeIntent.NextActionData.DisplayMultibancoDetails[i];
                case 21:
                    return new StripeIntent.NextActionData.DisplayOxxoDetails[i];
                case 22:
                    return new StripeIntent.NextActionData.DisplayPayNowDetails[i];
                case 23:
                    return new StripeIntent.NextActionData.DisplayPromptPayDetails[i];
                case 24:
                    return new StripeIntent.NextActionData.RedirectToUrl[i];
                case 25:
                    return new StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge[i];
                case 26:
                    return new StripeIntent.NextActionData.SdkData.IntentConfirmationChallenge.StripeJs[i];
                case 27:
                    return new StripeIntent.NextActionData.SdkData.Use3DS2[i];
                case 28:
                    return new StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption[i];
                default:
                    return new StripeIntent.NextActionData.SwishRedirect[i];
            }
        }
    }

    public final class OwnerParams implements Parcelable {
        public static final Parcelable.Creator<OwnerParams> CREATOR = new Creator(7);
        public Address address;
        public String email;
        public String name;
        public String phone;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OwnerParams)) {
                return false;
            }
            OwnerParams ownerParams = (OwnerParams) obj;
            return Intrinsics.areEqual(this.address, ownerParams.address) && Intrinsics.areEqual(this.email, ownerParams.email) && Intrinsics.areEqual(this.name, ownerParams.name) && Intrinsics.areEqual(this.phone, ownerParams.phone);
        }

        public final int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            Address address = this.address;
            String str = this.email;
            String str2 = this.name;
            String str3 = this.phone;
            StringBuilder sb = new StringBuilder("OwnerParams(address=");
            sb.append(address);
            sb.append(", email=");
            sb.append(str);
            sb.append(", name=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, ", phone=", str3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, i);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }
    }

    public SourceParams(String str, Long l, String str2, OwnerParams ownerParams, Source.Usage usage, SourceOrderParams sourceOrderParams, String str3, LinkedHashMap linkedHashMap, ApiParams apiParams, LinkedHashSet linkedHashSet) {
        str.getClass();
        apiParams.getClass();
        this.typeRaw = str;
        this.amount = l;
        this.currency = str2;
        this.owner = ownerParams;
        this.usage = usage;
        this.sourceOrder = sourceOrderParams;
        this.token = str3;
        this.metadata = linkedHashMap;
        this.apiParams = apiParams;
        this.attribution = linkedHashSet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceParams)) {
            return false;
        }
        SourceParams sourceParams = (SourceParams) obj;
        return Intrinsics.areEqual(this.typeRaw, sourceParams.typeRaw) && Intrinsics.areEqual(this.amount, sourceParams.amount) && Intrinsics.areEqual(this.currency, sourceParams.currency) && Intrinsics.areEqual(this.owner, sourceParams.owner) && this.usage == sourceParams.usage && Intrinsics.areEqual(this.sourceOrder, sourceParams.sourceOrder) && Intrinsics.areEqual(this.token, sourceParams.token) && Intrinsics.areEqual(this.metadata, sourceParams.metadata) && Intrinsics.areEqual(this.apiParams, sourceParams.apiParams) && this.attribution.equals(sourceParams.attribution);
    }

    public final int hashCode() {
        int hashCode = this.typeRaw.hashCode() * 961;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.currency;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        OwnerParams ownerParams = this.owner;
        int hashCode4 = (hashCode3 + (ownerParams == null ? 0 : ownerParams.hashCode())) * 31;
        Source.Usage usage = this.usage;
        int hashCode5 = (hashCode4 + (usage == null ? 0 : usage.hashCode())) * 31;
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        int hashCode6 = (hashCode5 + (sourceOrderParams == null ? 0 : sourceOrderParams.hashCode())) * 31;
        String str2 = this.token;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.metadata;
        return this.attribution.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((hashCode7 + (map != null ? map.hashCode() : 0)) * 31, this.apiParams.value, 31);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.amount, "SourceParams(typeRaw=", this.typeRaw, ", typeData=null, amount=", ", currency=");
        m.append(this.currency);
        m.append(", owner=");
        m.append(this.owner);
        m.append(", usage=");
        m.append(this.usage);
        m.append(", sourceOrder=");
        m.append(this.sourceOrder);
        m.append(", token=");
        m.append(this.token);
        m.append(", metadata=");
        m.append(this.metadata);
        m.append(", apiParams=");
        m.append(this.apiParams);
        m.append(", attribution=");
        m.append(this.attribution);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.typeRaw);
        parcel.writeParcelable(null, i);
        Long l = this.amount;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.currency);
        OwnerParams ownerParams = this.owner;
        if (ownerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownerParams.writeToParcel(parcel, i);
        }
        Source.Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        SourceOrderParams sourceOrderParams = this.sourceOrder;
        if (sourceOrderParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceOrderParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.token);
        Map map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        this.apiParams.writeToParcel(parcel, i);
        LinkedHashSet linkedHashSet = this.attribution;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }
}
