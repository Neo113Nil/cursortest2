package com.squareup.protos.cash.librarian.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/librarian/api/LegalDocumentsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/SandboxMetadata$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LegalDocumentsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LegalDocumentsResponse> CREATOR;
    public final List documents;

    static {
        LegalDocumentsResponse$Companion$ADAPTER$1 legalDocumentsResponse$Companion$ADAPTER$1 = new LegalDocumentsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LegalDocumentsResponse.class), "type.googleapis.com/squareup.cash.librarian.api.LegalDocumentsResponse", Syntax.PROTO_2, null, "squareup/cash/librarian/api/LibrarianService.proto");
        ADAPTER = legalDocumentsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(legalDocumentsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegalDocumentsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.documents = TransactorKt.immutableCopyOf("documents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LegalDocumentsResponse)) {
            return false;
        }
        LegalDocumentsResponse legalDocumentsResponse = (LegalDocumentsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), legalDocumentsResponse.unknownFields()) && Intrinsics.areEqual(this.documents, legalDocumentsResponse.documents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.documents.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SandboxMetadata.Builder builder = new SandboxMetadata.Builder(26, false);
        builder.scenarios = this.documents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.documents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("documents=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LegalDocumentsResponse{", "}", 0, null, null, 56);
    }
}
