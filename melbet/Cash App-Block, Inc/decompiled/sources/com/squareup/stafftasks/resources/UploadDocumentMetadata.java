package com.squareup.stafftasks.resources;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
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

/* loaded from: classes8.dex */
public final class UploadDocumentMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UploadDocumentMetadata> CREATOR;
    public final String instructions;
    public final Boolean show_only_documents_linked_to_task;

    static {
        UploadDocumentMetadata$Companion$ADAPTER$1 uploadDocumentMetadata$Companion$ADAPTER$1 = new UploadDocumentMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UploadDocumentMetadata.class), "type.googleapis.com/squareup.stafftasks.UploadDocumentMetadata", Syntax.PROTO_2, null, "squareup/stafftasks/resources/datatypes.proto");
        ADAPTER = uploadDocumentMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uploadDocumentMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadDocumentMetadata(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instructions = str;
        this.show_only_documents_linked_to_task = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadDocumentMetadata)) {
            return false;
        }
        UploadDocumentMetadata uploadDocumentMetadata = (UploadDocumentMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), uploadDocumentMetadata.unknownFields()) && Intrinsics.areEqual(this.instructions, uploadDocumentMetadata.instructions) && Intrinsics.areEqual(this.show_only_documents_linked_to_task, uploadDocumentMetadata.show_only_documents_linked_to_task);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instructions;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.show_only_documents_linked_to_task;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(11);
        builder.main_text = this.instructions;
        builder.show_payments = this.show_only_documents_linked_to_task;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.instructions != null) {
            arrayList.add("instructions=██");
        }
        Boolean bool = this.show_only_documents_linked_to_task;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_only_documents_linked_to_task=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UploadDocumentMetadata{", "}", 0, null, null, 56);
    }
}
