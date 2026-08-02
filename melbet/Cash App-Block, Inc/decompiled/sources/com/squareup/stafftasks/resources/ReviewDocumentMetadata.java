package com.squareup.stafftasks.resources;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class ReviewDocumentMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReviewDocumentMetadata> CREATOR;
    public final String file_id;
    public final String instructions;

    static {
        ReviewDocumentMetadata$Companion$ADAPTER$1 reviewDocumentMetadata$Companion$ADAPTER$1 = new ReviewDocumentMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReviewDocumentMetadata.class), "type.googleapis.com/squareup.stafftasks.ReviewDocumentMetadata", Syntax.PROTO_2, null, "squareup/stafftasks/resources/datatypes.proto");
        ADAPTER = reviewDocumentMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(reviewDocumentMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewDocumentMetadata(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instructions = str;
        this.file_id = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewDocumentMetadata)) {
            return false;
        }
        ReviewDocumentMetadata reviewDocumentMetadata = (ReviewDocumentMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), reviewDocumentMetadata.unknownFields()) && Intrinsics.areEqual(this.instructions, reviewDocumentMetadata.instructions) && Intrinsics.areEqual(this.file_id, reviewDocumentMetadata.file_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instructions;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.file_id;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(23);
        builder.server = this.instructions;
        builder.local = this.file_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.instructions != null) {
            arrayList.add("instructions=██");
        }
        String str = this.file_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReviewDocumentMetadata{", "}", 0, null, null, 56);
    }
}
