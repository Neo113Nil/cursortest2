package com.squareup.protos.lending.sync_values;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class BorrowAppletCreditLimitAndBorrowButtonTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BorrowAppletCreditLimitAndBorrowButtonTile> CREATOR;
    public final List tiles;

    public final class Data extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Data> CREATOR;
        public final Money available_credit_amount;
        public final Boolean button_enabled;
        public final LocalizedString button_title;
        public final LocalizedString credit_limit_subtitle;
        public final InitiateLoanData picker_data;

        static {
            BorrowAppletCreditLimitAndBorrowButtonTile$Data$Companion$ADAPTER$1 borrowAppletCreditLimitAndBorrowButtonTile$Data$Companion$ADAPTER$1 = new BorrowAppletCreditLimitAndBorrowButtonTile$Data$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Data.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile.Data", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
            ADAPTER = borrowAppletCreditLimitAndBorrowButtonTile$Data$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletCreditLimitAndBorrowButtonTile$Data$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(Money money, LocalizedString localizedString, LocalizedString localizedString2, Boolean bool, InitiateLoanData initiateLoanData, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.available_credit_amount = money;
            this.credit_limit_subtitle = localizedString;
            this.button_title = localizedString2;
            this.button_enabled = bool;
            this.picker_data = initiateLoanData;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.areEqual(unknownFields(), data.unknownFields()) && Intrinsics.areEqual(this.available_credit_amount, data.available_credit_amount) && Intrinsics.areEqual(this.credit_limit_subtitle, data.credit_limit_subtitle) && Intrinsics.areEqual(this.button_title, data.button_title) && Intrinsics.areEqual(this.button_enabled, data.button_enabled) && Intrinsics.areEqual(this.picker_data, data.picker_data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.available_credit_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.credit_limit_subtitle;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.button_title;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Boolean bool = this.button_enabled;
            int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            InitiateLoanData initiateLoanData = this.picker_data;
            int hashCode6 = hashCode5 + (initiateLoanData != null ? initiateLoanData.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(27, false);
            builder.alias = this.available_credit_amount;
            builder.expires_at = this.credit_limit_subtitle;
            builder.version = this.button_title;
            builder.verified = this.button_enabled;
            builder.display_date = this.picker_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.available_credit_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("available_credit_amount=", money, arrayList);
            }
            LocalizedString localizedString = this.credit_limit_subtitle;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("credit_limit_subtitle=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.button_title;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_title=", localizedString2, arrayList);
            }
            Boolean bool = this.button_enabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("button_enabled=", bool, arrayList);
            }
            InitiateLoanData initiateLoanData = this.picker_data;
            if (initiateLoanData != null) {
                arrayList.add("picker_data=" + initiateLoanData);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Data{", "}", 0, null, null, 56);
        }
    }

    static {
        BorrowAppletCreditLimitAndBorrowButtonTile$Companion$ADAPTER$1 borrowAppletCreditLimitAndBorrowButtonTile$Companion$ADAPTER$1 = new BorrowAppletCreditLimitAndBorrowButtonTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BorrowAppletCreditLimitAndBorrowButtonTile.class), "type.googleapis.com/squareup.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile", Syntax.PROTO_2, null, "squareup/lending/sync_values.proto");
        ADAPTER = borrowAppletCreditLimitAndBorrowButtonTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(borrowAppletCreditLimitAndBorrowButtonTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowAppletCreditLimitAndBorrowButtonTile(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tiles = TransactorKt.immutableCopyOf("tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BorrowAppletCreditLimitAndBorrowButtonTile)) {
            return false;
        }
        BorrowAppletCreditLimitAndBorrowButtonTile borrowAppletCreditLimitAndBorrowButtonTile = (BorrowAppletCreditLimitAndBorrowButtonTile) obj;
        return Intrinsics.areEqual(unknownFields(), borrowAppletCreditLimitAndBorrowButtonTile.unknownFields()) && Intrinsics.areEqual(this.tiles, borrowAppletCreditLimitAndBorrowButtonTile.tiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.tiles.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(11, false);
        builder.items = this.tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BorrowAppletCreditLimitAndBorrowButtonTile{", "}", 0, null, null, 56);
    }
}
