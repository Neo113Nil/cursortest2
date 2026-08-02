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
public final class ATMPicker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ATMPicker> CREATOR;
    public final List options;

    static {
        ATMPicker$Companion$ADAPTER$1 aTMPicker$Companion$ADAPTER$1 = new ATMPicker$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ATMPicker.class), "type.googleapis.com/squareup.franklin.ATMPicker", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = aTMPicker$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(aTMPicker$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATMPicker(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.options = TransactorKt.immutableCopyOf("options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ATMPicker)) {
            return false;
        }
        ATMPicker aTMPicker = (ATMPicker) obj;
        return Intrinsics.areEqual(unknownFields(), aTMPicker.unknownFields()) && Intrinsics.areEqual(this.options, aTMPicker.options);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.options.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(22, false);
        builder.header = this.options;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ATMPicker{", "}", 0, null, null, 56);
    }
}
