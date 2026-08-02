package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.franklin.api.CashInstrumentType;
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
public final class NewLinkSelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NewLinkSelectionOption> CREATOR;
    public final CashInstrumentType instrument_type;

    static {
        NewLinkSelectionOption$Companion$ADAPTER$1 newLinkSelectionOption$Companion$ADAPTER$1 = new NewLinkSelectionOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NewLinkSelectionOption.class), "type.googleapis.com/squareup.cash.plasma.common.NewLinkSelectionOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
        ADAPTER = newLinkSelectionOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(newLinkSelectionOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLinkSelectionOption(CashInstrumentType cashInstrumentType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_type = cashInstrumentType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewLinkSelectionOption)) {
            return false;
        }
        NewLinkSelectionOption newLinkSelectionOption = (NewLinkSelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), newLinkSelectionOption.unknownFields()) && this.instrument_type == newLinkSelectionOption.instrument_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashInstrumentType cashInstrumentType = this.instrument_type;
        int hashCode2 = hashCode + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(2);
        builder.pool_lifecycle_filter = this.instrument_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashInstrumentType cashInstrumentType = this.instrument_type;
        if (cashInstrumentType != null) {
            arrayList.add("instrument_type=" + cashInstrumentType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NewLinkSelectionOption{", "}", 0, null, null, 56);
    }
}
