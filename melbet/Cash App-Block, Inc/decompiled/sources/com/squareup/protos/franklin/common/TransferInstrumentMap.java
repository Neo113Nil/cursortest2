package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.ui.UiDda;
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

/* loaded from: classes8.dex */
public final class TransferInstrumentMap extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransferInstrumentMap> CREATOR;
    public final String source_instrument_token;
    public final CashInstrumentType source_type;
    public final List target_instrument_tokens;
    public final List target_types;

    static {
        TransferInstrumentMap$Companion$ADAPTER$1 transferInstrumentMap$Companion$ADAPTER$1 = new TransferInstrumentMap$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransferInstrumentMap.class), "type.googleapis.com/squareup.franklin.common.TransferInstrumentMap", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = transferInstrumentMap$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transferInstrumentMap$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferInstrumentMap(String str, List list, CashInstrumentType cashInstrumentType, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.source_instrument_token = str;
        this.source_type = cashInstrumentType;
        this.target_instrument_tokens = TransactorKt.immutableCopyOf("target_instrument_tokens", list);
        this.target_types = TransactorKt.immutableCopyOf("target_types", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransferInstrumentMap)) {
            return false;
        }
        TransferInstrumentMap transferInstrumentMap = (TransferInstrumentMap) obj;
        return Intrinsics.areEqual(unknownFields(), transferInstrumentMap.unknownFields()) && Intrinsics.areEqual(this.source_instrument_token, transferInstrumentMap.source_instrument_token) && Intrinsics.areEqual(this.target_instrument_tokens, transferInstrumentMap.target_instrument_tokens) && this.source_type == transferInstrumentMap.source_type && Intrinsics.areEqual(this.target_types, transferInstrumentMap.target_types);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.source_instrument_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.target_instrument_tokens);
        CashInstrumentType cashInstrumentType = this.source_type;
        int hashCode2 = this.target_types.hashCode() + ((m + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(2);
        builder.account = this.source_instrument_token;
        builder.enabled = this.target_instrument_tokens;
        builder.button = this.source_type;
        builder.dda_form = this.target_types;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.source_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_instrument_token=", arrayList);
        }
        List list = this.target_instrument_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("target_instrument_tokens=", arrayList, list);
        }
        CashInstrumentType cashInstrumentType = this.source_type;
        if (cashInstrumentType != null) {
            arrayList.add("source_type=" + cashInstrumentType);
        }
        List list2 = this.target_types;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("target_types=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferInstrumentMap{", "}", 0, null, null, 56);
    }
}
