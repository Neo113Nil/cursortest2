package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.lending.Toggle;
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
public final class ExistingCustomSelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExistingCustomSelectionOption> CREATOR;
    public final ByteString encoded_custom_submission;

    static {
        ExistingCustomSelectionOption$Companion$ADAPTER$1 existingCustomSelectionOption$Companion$ADAPTER$1 = new ExistingCustomSelectionOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExistingCustomSelectionOption.class), "type.googleapis.com/squareup.cash.plasma.common.ExistingCustomSelectionOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
        ADAPTER = existingCustomSelectionOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(existingCustomSelectionOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExistingCustomSelectionOption(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.encoded_custom_submission = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExistingCustomSelectionOption)) {
            return false;
        }
        ExistingCustomSelectionOption existingCustomSelectionOption = (ExistingCustomSelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), existingCustomSelectionOption.unknownFields()) && Intrinsics.areEqual(this.encoded_custom_submission, existingCustomSelectionOption.encoded_custom_submission);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.encoded_custom_submission;
        int hashCode2 = hashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Toggle.Builder builder = new Toggle.Builder(1);
        builder.opaque_request_data = this.encoded_custom_submission;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.encoded_custom_submission;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encoded_custom_submission=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExistingCustomSelectionOption{", "}", 0, null, null, 56);
    }
}
