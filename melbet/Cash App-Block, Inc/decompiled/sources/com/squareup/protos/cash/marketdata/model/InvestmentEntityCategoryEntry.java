package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class InvestmentEntityCategoryEntry extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestmentEntityCategoryEntry> CREATOR;
    public final String investment_entity_token;

    static {
        InvestmentEntityCategoryEntry$Companion$ADAPTER$1 investmentEntityCategoryEntry$Companion$ADAPTER$1 = new InvestmentEntityCategoryEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestmentEntityCategoryEntry.class), "type.googleapis.com/squareup.cash.marketdata.model.InvestmentEntityCategoryEntry", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/investment_entities.proto");
        ADAPTER = investmentEntityCategoryEntry$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investmentEntityCategoryEntry$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentEntityCategoryEntry(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestmentEntityCategoryEntry)) {
            return false;
        }
        InvestmentEntityCategoryEntry investmentEntityCategoryEntry = (InvestmentEntityCategoryEntry) obj;
        return Intrinsics.areEqual(unknownFields(), investmentEntityCategoryEntry.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, investmentEntityCategoryEntry.investment_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(16);
        builder.token = this.investment_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentEntityCategoryEntry{", "}", 0, null, null, 56);
    }
}
