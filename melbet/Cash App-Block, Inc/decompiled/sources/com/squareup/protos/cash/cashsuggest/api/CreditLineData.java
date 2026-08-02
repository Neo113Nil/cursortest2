package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditLineData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditLineData> CREATOR;
    public final CreditLineType line_type;
    public final PaymentDue next_payment_due;
    public final Money outstanding_balance;
    public final Money overdue_balance;
    public final List payment_dues;
    public final Money remaining_credit;
    public final Money total_credit;
    public final Money total_granted_credit;

    static {
        CreditLineData$Companion$ADAPTER$1 creditLineData$Companion$ADAPTER$1 = new CreditLineData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditLineData.class), "type.googleapis.com/squareup.cash.cashsuggest.api.CreditLineData", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/CreditLineSnapshot.proto");
        ADAPTER = creditLineData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditLineData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLineData(CreditLineType creditLineType, Money money, Money money2, Money money3, Money money4, List list, Money money5, PaymentDue paymentDue, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.line_type = creditLineType;
        this.total_credit = money;
        this.total_granted_credit = money2;
        this.remaining_credit = money3;
        this.outstanding_balance = money4;
        this.overdue_balance = money5;
        this.next_payment_due = paymentDue;
        this.payment_dues = TransactorKt.immutableCopyOf("payment_dues", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    public static CreditLineData copy$default(CreditLineData creditLineData, Money money, Money money2, Money money3, Money money4, ArrayList arrayList, Money money5, PaymentDue paymentDue, ByteString byteString, int i) {
        Money money6 = money;
        CreditLineType creditLineType = creditLineData.line_type;
        if ((i & 2) != 0) {
            money6 = creditLineData.total_credit;
        }
        if ((i & 4) != 0) {
            money2 = creditLineData.total_granted_credit;
        }
        if ((i & 16) != 0) {
            money4 = creditLineData.outstanding_balance;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 32) != 0) {
            arrayList2 = creditLineData.payment_dues;
        }
        if ((i & 64) != 0) {
            money5 = creditLineData.overdue_balance;
        }
        if ((i & 128) != 0) {
            paymentDue = creditLineData.next_payment_due;
        }
        if ((i & 256) != 0) {
            byteString = creditLineData.unknownFields();
        }
        ByteString byteString2 = byteString;
        creditLineData.getClass();
        arrayList2.getClass();
        byteString2.getClass();
        PaymentDue paymentDue2 = paymentDue;
        Money money7 = money5;
        Money money8 = money2;
        return new CreditLineData(creditLineType, money6, money8, money3, money4, arrayList2, money7, paymentDue2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditLineData)) {
            return false;
        }
        CreditLineData creditLineData = (CreditLineData) obj;
        return Intrinsics.areEqual(unknownFields(), creditLineData.unknownFields()) && this.line_type == creditLineData.line_type && Intrinsics.areEqual(this.total_credit, creditLineData.total_credit) && Intrinsics.areEqual(this.total_granted_credit, creditLineData.total_granted_credit) && Intrinsics.areEqual(this.remaining_credit, creditLineData.remaining_credit) && Intrinsics.areEqual(this.outstanding_balance, creditLineData.outstanding_balance) && Intrinsics.areEqual(this.payment_dues, creditLineData.payment_dues) && Intrinsics.areEqual(this.overdue_balance, creditLineData.overdue_balance) && Intrinsics.areEqual(this.next_payment_due, creditLineData.next_payment_due);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CreditLineType creditLineType = this.line_type;
        int hashCode2 = (hashCode + (creditLineType != null ? creditLineType.hashCode() : 0)) * 37;
        Money money = this.total_credit;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_granted_credit;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.remaining_credit;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.outstanding_balance;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (money4 != null ? money4.hashCode() : 0)) * 37, 37, this.payment_dues);
        Money money5 = this.overdue_balance;
        int hashCode6 = (m + (money5 != null ? money5.hashCode() : 0)) * 37;
        PaymentDue paymentDue = this.next_payment_due;
        int hashCode7 = hashCode6 + (paymentDue != null ? paymentDue.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(14, false);
        builder.external_token = this.line_type;
        builder.customer_token = this.total_credit;
        builder.external_version = this.total_granted_credit;
        builder.updated_at = this.remaining_credit;
        builder.created_at = this.outstanding_balance;
        builder.count_groups = this.payment_dues;
        builder.is_badged = this.overdue_balance;
        builder.item_type = this.next_payment_due;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CreditLineType creditLineType = this.line_type;
        if (creditLineType != null) {
            arrayList.add("line_type=" + creditLineType);
        }
        Money money = this.total_credit;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_credit=", money, arrayList);
        }
        Money money2 = this.total_granted_credit;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_granted_credit=", money2, arrayList);
        }
        Money money3 = this.remaining_credit;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_credit=", money3, arrayList);
        }
        Money money4 = this.outstanding_balance;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("outstanding_balance=", money4, arrayList);
        }
        List list = this.payment_dues;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_dues=", arrayList, list);
        }
        Money money5 = this.overdue_balance;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("overdue_balance=", money5, arrayList);
        }
        PaymentDue paymentDue = this.next_payment_due;
        if (paymentDue != null) {
            arrayList.add("next_payment_due=" + paymentDue);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditLineData{", "}", 0, null, null, 56);
    }

    public CreditLineData(CreditLineType creditLineType, Money money, Money money2, Money money3, Money money4, Money money5, int i) {
        this(creditLineType, money, money2, money3, money4, EmptyList.INSTANCE, (i & 64) != 0 ? null : money5, null, ByteString.EMPTY);
    }
}
