package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.protos.cash.pools.ListPoolsRequest;
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
public final class InstrumentSelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentSelectionOption> CREATOR;
    public final ErrorEvent.Csp.Companion selection_option;

    static {
        InstrumentSelectionOption$Companion$ADAPTER$1 instrumentSelectionOption$Companion$ADAPTER$1 = new InstrumentSelectionOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentSelectionOption.class), "type.googleapis.com/squareup.cash.plasma.common.InstrumentSelectionOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
        ADAPTER = instrumentSelectionOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentSelectionOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionOption(ErrorEvent.Csp.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.selection_option = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionOption)) {
            return false;
        }
        InstrumentSelectionOption instrumentSelectionOption = (InstrumentSelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentSelectionOption.unknownFields()) && Intrinsics.areEqual(this.selection_option, instrumentSelectionOption.selection_option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ErrorEvent.Csp.Companion companion = this.selection_option;
        int hashCode2 = hashCode + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(1);
        builder.pool_lifecycle_filter = this.selection_option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorEvent.Csp.Companion companion = this.selection_option;
        if (companion != null) {
            arrayList.add("selection_option=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentSelectionOption{", "}", 0, null, null, 56);
    }

    public /* synthetic */ InstrumentSelectionOption(ErrorEvent.Csp.Companion companion) {
        this(companion, ByteString.EMPTY);
    }
}
