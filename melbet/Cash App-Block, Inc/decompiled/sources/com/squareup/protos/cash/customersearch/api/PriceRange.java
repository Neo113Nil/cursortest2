package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningsYearMonth;

/* loaded from: classes7.dex */
public final class PriceRange extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PriceRange> CREATOR;
    public final int max;
    public final int min;

    static {
        PriceRange$Companion$ADAPTER$1 priceRange$Companion$ADAPTER$1 = new PriceRange$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PriceRange.class), "type.googleapis.com/squareup.cash.customersearch.api.PriceRange", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = priceRange$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(priceRange$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRange(int i, int i2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.min = i;
        this.max = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PriceRange)) {
            return false;
        }
        PriceRange priceRange = (PriceRange) obj;
        return Intrinsics.areEqual(unknownFields(), priceRange.unknownFields()) && this.min == priceRange.min && this.max == priceRange.max;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Integer.hashCode(this.max) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.min, unknownFields().hashCode() * 37, 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearMonth.Builder builder = new EarningsYearMonth.Builder(1);
        builder.year = Integer.valueOf(this.min);
        builder.month = Integer.valueOf(this.max);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("min=" + this.min);
        arrayList.add("max=" + this.max);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PriceRange{", "}", 0, null, null, 56);
    }
}
