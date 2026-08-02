package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentMgmtSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentMgmtSection> CREATOR;
    public final Button cta_button;
    public final BalanceRow next_due;
    public final BalanceRow over_due;
    public final BalanceRow total_owed;

    static {
        PaymentMgmtSection$Companion$ADAPTER$1 paymentMgmtSection$Companion$ADAPTER$1 = new PaymentMgmtSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentMgmtSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.PaymentMgmtSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = paymentMgmtSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentMgmtSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMgmtSection(BalanceRow balanceRow, BalanceRow balanceRow2, BalanceRow balanceRow3, Button button, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.total_owed = balanceRow;
        this.next_due = balanceRow2;
        this.over_due = balanceRow3;
        this.cta_button = button;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentMgmtSection)) {
            return false;
        }
        PaymentMgmtSection paymentMgmtSection = (PaymentMgmtSection) obj;
        return Intrinsics.areEqual(unknownFields(), paymentMgmtSection.unknownFields()) && Intrinsics.areEqual(this.total_owed, paymentMgmtSection.total_owed) && Intrinsics.areEqual(this.next_due, paymentMgmtSection.next_due) && Intrinsics.areEqual(this.over_due, paymentMgmtSection.over_due) && Intrinsics.areEqual(this.cta_button, paymentMgmtSection.cta_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BalanceRow balanceRow = this.total_owed;
        int hashCode2 = (hashCode + (balanceRow != null ? balanceRow.hashCode() : 0)) * 37;
        BalanceRow balanceRow2 = this.next_due;
        int hashCode3 = (hashCode2 + (balanceRow2 != null ? balanceRow2.hashCode() : 0)) * 37;
        BalanceRow balanceRow3 = this.over_due;
        int hashCode4 = (hashCode3 + (balanceRow3 != null ? balanceRow3.hashCode() : 0)) * 37;
        Button button = this.cta_button;
        int hashCode5 = hashCode4 + (button != null ? button.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(19, false);
        builder.icon = this.total_owed;
        builder.title = this.next_due;
        builder.enabled = this.over_due;
        builder.id = this.cta_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceRow balanceRow = this.total_owed;
        if (balanceRow != null) {
            arrayList.add("total_owed=" + balanceRow);
        }
        BalanceRow balanceRow2 = this.next_due;
        if (balanceRow2 != null) {
            arrayList.add("next_due=" + balanceRow2);
        }
        BalanceRow balanceRow3 = this.over_due;
        if (balanceRow3 != null) {
            arrayList.add("over_due=" + balanceRow3);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentMgmtSection{", "}", 0, null, null, 56);
    }

    public final class BalanceRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BalanceRow> CREATOR;
        public final Money amount;
        public final LocalizedString prefix_text;

        static {
            PaymentMgmtSection$BalanceRow$Companion$ADAPTER$1 paymentMgmtSection$BalanceRow$Companion$ADAPTER$1 = new PaymentMgmtSection$BalanceRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BalanceRow.class), "type.googleapis.com/squareup.cash.cashsuggest.api.PaymentMgmtSection.BalanceRow", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
            ADAPTER = paymentMgmtSection$BalanceRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentMgmtSection$BalanceRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceRow(LocalizedString localizedString, Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.prefix_text = localizedString;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BalanceRow)) {
                return false;
            }
            BalanceRow balanceRow = (BalanceRow) obj;
            return Intrinsics.areEqual(unknownFields(), balanceRow.unknownFields()) && Intrinsics.areEqual(this.prefix_text, balanceRow.prefix_text) && Intrinsics.areEqual(this.amount, balanceRow.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.prefix_text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(21);
            builder.image_url = this.prefix_text;
            builder.asset = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.prefix_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("prefix_text=", localizedString, arrayList);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceRow{", "}", 0, null, null, 56);
        }

        public /* synthetic */ BalanceRow(LocalizedString localizedString, Money money) {
            this(localizedString, money, ByteString.EMPTY);
        }
    }

    public /* synthetic */ PaymentMgmtSection(BalanceRow balanceRow, BalanceRow balanceRow2, Button button) {
        this(balanceRow, balanceRow2, null, button, ByteString.EMPTY);
    }
}
