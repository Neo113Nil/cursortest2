package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/CreateChangeProposalResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiCashLimits$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateChangeProposalResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateChangeProposalResponse> CREATOR;
    public final ChangeProposal change_proposal;

    static {
        CreateChangeProposalResponse$Companion$ADAPTER$1 createChangeProposalResponse$Companion$ADAPTER$1 = new CreateChangeProposalResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateChangeProposalResponse.class), "type.googleapis.com/squareup.timecards.CreateChangeProposalResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = createChangeProposalResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createChangeProposalResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateChangeProposalResponse(ChangeProposal changeProposal, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.change_proposal = changeProposal;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateChangeProposalResponse)) {
            return false;
        }
        CreateChangeProposalResponse createChangeProposalResponse = (CreateChangeProposalResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createChangeProposalResponse.unknownFields()) && Intrinsics.areEqual(this.change_proposal, createChangeProposalResponse.change_proposal);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ChangeProposal changeProposal = this.change_proposal;
        int hashCode2 = hashCode + (changeProposal != null ? changeProposal.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(29);
        builder.cash_limit_group = this.change_proposal;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ChangeProposal changeProposal = this.change_proposal;
        if (changeProposal != null) {
            arrayList.add("change_proposal=" + changeProposal);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateChangeProposalResponse{", "}", 0, null, null, 56);
    }
}
