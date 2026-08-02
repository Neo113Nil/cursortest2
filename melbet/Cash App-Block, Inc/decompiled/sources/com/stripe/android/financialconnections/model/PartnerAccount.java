package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Serializable
/* loaded from: classes8.dex */
public final class PartnerAccount implements Parcelable {
    public final Boolean _allowSelection;
    public final String allowSelectionMessage;
    public final String authorization;
    public final Integer balanceAmount;
    public final FinancialConnectionsAccount.Category category;
    public final String currency;
    public final String displayableAccountNumbers;
    public final String id;
    public final Integer initialBalanceAmount;
    public final FinancialConnectionsInstitution institution;
    public final String institutionName;
    public final String institutionUrl;
    public final String linkedAccountId;
    public final String name;
    public final FinancialConnectionsSessionManifest.Pane nextPaneOnSelection;
    public final String routingNumber;
    public final FinancialConnectionsAccount.Status status;
    public final FinancialConnectionsAccount.Subcategory subcategory;
    public final List supportedPaymentMethodTypes;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<PartnerAccount> CREATOR = new ServerLink.Creator(7);
    public static final Lazy[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(12)), null, null, null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/PartnerAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return PartnerAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartnerAccount(int i, String str, FinancialConnectionsAccount.Category category, String str2, String str3, FinancialConnectionsAccount.Subcategory subcategory, List list, Integer num, String str4, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, Integer num2, String str6, Boolean bool, String str7, FinancialConnectionsSessionManifest.Pane pane, String str8, String str9, String str10, FinancialConnectionsAccount.Status status) {
        if (63 != (i & 63)) {
            TuplesKt.throwMissingFieldException(i, 63, PartnerAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.authorization = str;
        this.category = category;
        this.id = str2;
        this.name = str3;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = list;
        if ((i & 64) == 0) {
            this.balanceAmount = null;
        } else {
            this.balanceAmount = num;
        }
        if ((i & 128) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 256) == 0) {
            this.institution = null;
        } else {
            this.institution = financialConnectionsInstitution;
        }
        if ((i & 512) == 0) {
            this.displayableAccountNumbers = null;
        } else {
            this.displayableAccountNumbers = str5;
        }
        if ((i & 1024) == 0) {
            this.initialBalanceAmount = null;
        } else {
            this.initialBalanceAmount = num2;
        }
        if ((i & 2048) == 0) {
            this.institutionName = null;
        } else {
            this.institutionName = str6;
        }
        if ((i & 4096) == 0) {
            this._allowSelection = null;
        } else {
            this._allowSelection = bool;
        }
        if ((i & PKIFailureInfo.certRevoked) == 0) {
            this.allowSelectionMessage = null;
        } else {
            this.allowSelectionMessage = str7;
        }
        if ((i & 16384) == 0) {
            this.nextPaneOnSelection = null;
        } else {
            this.nextPaneOnSelection = pane;
        }
        if ((32768 & i) == 0) {
            this.institutionUrl = null;
        } else {
            this.institutionUrl = str8;
        }
        if ((65536 & i) == 0) {
            this.linkedAccountId = null;
        } else {
            this.linkedAccountId = str9;
        }
        if ((131072 & i) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str10;
        }
        if ((i & PKIFailureInfo.transactionIdInUse) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartnerAccount)) {
            return false;
        }
        PartnerAccount partnerAccount = (PartnerAccount) obj;
        return Intrinsics.areEqual(this.authorization, partnerAccount.authorization) && this.category == partnerAccount.category && Intrinsics.areEqual(this.id, partnerAccount.id) && Intrinsics.areEqual(this.name, partnerAccount.name) && this.subcategory == partnerAccount.subcategory && Intrinsics.areEqual(this.supportedPaymentMethodTypes, partnerAccount.supportedPaymentMethodTypes) && Intrinsics.areEqual(this.balanceAmount, partnerAccount.balanceAmount) && Intrinsics.areEqual(this.currency, partnerAccount.currency) && Intrinsics.areEqual(this.institution, partnerAccount.institution) && Intrinsics.areEqual(this.displayableAccountNumbers, partnerAccount.displayableAccountNumbers) && Intrinsics.areEqual(this.initialBalanceAmount, partnerAccount.initialBalanceAmount) && Intrinsics.areEqual(this.institutionName, partnerAccount.institutionName) && Intrinsics.areEqual(this._allowSelection, partnerAccount._allowSelection) && Intrinsics.areEqual(this.allowSelectionMessage, partnerAccount.allowSelectionMessage) && this.nextPaneOnSelection == partnerAccount.nextPaneOnSelection && Intrinsics.areEqual(this.institutionUrl, partnerAccount.institutionUrl) && Intrinsics.areEqual(this.linkedAccountId, partnerAccount.linkedAccountId) && Intrinsics.areEqual(this.routingNumber, partnerAccount.routingNumber) && this.status == partnerAccount.status;
    }

    public final int hashCode() {
        String str = this.authorization;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FinancialConnectionsAccount.Category category = this.category;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (category == null ? 0 : category.hashCode())) * 31, 31, this.id), 31, this.name);
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (subcategory == null ? 0 : subcategory.hashCode())) * 31, 31, this.supportedPaymentMethodTypes);
        Integer num = this.balanceAmount;
        int hashCode2 = (m2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
        int hashCode4 = (hashCode3 + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode())) * 31;
        String str3 = this.displayableAccountNumbers;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.initialBalanceAmount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.institutionName;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this._allowSelection;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.allowSelectionMessage;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnSelection;
        int hashCode10 = (hashCode9 + (pane == null ? 0 : pane.hashCode())) * 31;
        String str6 = this.institutionUrl;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.linkedAccountId;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.routingNumber;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        FinancialConnectionsAccount.Status status = this.status;
        return hashCode13 + (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccount(authorization=");
        sb.append(this.authorization);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.id, ", name=", this.name, ", subcategory=");
        sb.append(this.subcategory);
        sb.append(", supportedPaymentMethodTypes=");
        sb.append(this.supportedPaymentMethodTypes);
        sb.append(", balanceAmount=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.balanceAmount, ", currency=", this.currency, ", institution=");
        sb.append(this.institution);
        sb.append(", displayableAccountNumbers=");
        sb.append(this.displayableAccountNumbers);
        sb.append(", initialBalanceAmount=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.initialBalanceAmount, ", institutionName=", this.institutionName, ", _allowSelection=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this._allowSelection, ", allowSelectionMessage=", this.allowSelectionMessage, ", nextPaneOnSelection=");
        sb.append(this.nextPaneOnSelection);
        sb.append(", institutionUrl=");
        sb.append(this.institutionUrl);
        sb.append(", linkedAccountId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.linkedAccountId, ", routingNumber=", this.routingNumber, ", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.authorization);
        FinancialConnectionsAccount.Category category = this.category;
        if (category == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(category.name());
        }
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        if (subcategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(subcategory.name());
        }
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.supportedPaymentMethodTypes, parcel);
        while (m.hasNext()) {
            parcel.writeString(((FinancialConnectionsAccount.SupportedPaymentMethodTypes) m.next()).name());
        }
        Integer num = this.balanceAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.currency);
        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
        if (financialConnectionsInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financialConnectionsInstitution.writeToParcel(parcel, i);
        }
        parcel.writeString(this.displayableAccountNumbers);
        Integer num2 = this.initialBalanceAmount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
        }
        parcel.writeString(this.institutionName);
        Boolean bool = this._allowSelection;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        parcel.writeString(this.allowSelectionMessage);
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnSelection;
        if (pane == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pane.name());
        }
        parcel.writeString(this.institutionUrl);
        parcel.writeString(this.linkedAccountId);
        parcel.writeString(this.routingNumber);
        FinancialConnectionsAccount.Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
    }

    public PartnerAccount(String str, FinancialConnectionsAccount.Category category, String str2, String str3, FinancialConnectionsAccount.Subcategory subcategory, ArrayList arrayList, Integer num, String str4, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, Integer num2, String str6, Boolean bool, String str7, FinancialConnectionsSessionManifest.Pane pane, String str8, String str9, String str10, FinancialConnectionsAccount.Status status) {
        str2.getClass();
        str3.getClass();
        this.authorization = str;
        this.category = category;
        this.id = str2;
        this.name = str3;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = arrayList;
        this.balanceAmount = num;
        this.currency = str4;
        this.institution = financialConnectionsInstitution;
        this.displayableAccountNumbers = str5;
        this.initialBalanceAmount = num2;
        this.institutionName = str6;
        this._allowSelection = bool;
        this.allowSelectionMessage = str7;
        this.nextPaneOnSelection = pane;
        this.institutionUrl = str8;
        this.linkedAccountId = str9;
        this.routingNumber = str10;
        this.status = status;
    }
}
