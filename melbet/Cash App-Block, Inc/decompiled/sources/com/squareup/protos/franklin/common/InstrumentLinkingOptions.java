package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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
public final class InstrumentLinkingOptions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentLinkingOptions> CREATOR;
    public final List instrument_linking_option;

    static {
        InstrumentLinkingOptions$Companion$ADAPTER$1 instrumentLinkingOptions$Companion$ADAPTER$1 = new InstrumentLinkingOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingOptions.class), "type.googleapis.com/squareup.franklin.InstrumentLinkingOptions", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = instrumentLinkingOptions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentLinkingOptions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentLinkingOptions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.instrument_linking_option = TransactorKt.immutableCopyOf("instrument_linking_option", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingOptions)) {
            return false;
        }
        InstrumentLinkingOptions instrumentLinkingOptions = (InstrumentLinkingOptions) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentLinkingOptions.unknownFields()) && Intrinsics.areEqual(this.instrument_linking_option, instrumentLinkingOptions.instrument_linking_option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.instrument_linking_option.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(25, false);
        builder.header = this.instrument_linking_option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.instrument_linking_option;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_linking_option=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLinkingOptions{", "}", 0, null, null, 56);
    }
}
