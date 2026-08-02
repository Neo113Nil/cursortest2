package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
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
public final class P2pPoolContributionRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2pPoolContributionRenderData> CREATOR;
    public final P2pPoolComment contributor_root_comment;

    static {
        P2pPoolContributionRenderData$Companion$ADAPTER$1 p2pPoolContributionRenderData$Companion$ADAPTER$1 = new P2pPoolContributionRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2pPoolContributionRenderData.class), "type.googleapis.com/squareup.franklin.P2pPoolContributionRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = p2pPoolContributionRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pPoolContributionRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pPoolContributionRenderData(P2pPoolComment p2pPoolComment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.contributor_root_comment = p2pPoolComment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2pPoolContributionRenderData)) {
            return false;
        }
        P2pPoolContributionRenderData p2pPoolContributionRenderData = (P2pPoolContributionRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), p2pPoolContributionRenderData.unknownFields()) && Intrinsics.areEqual(this.contributor_root_comment, p2pPoolContributionRenderData.contributor_root_comment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        P2pPoolComment p2pPoolComment = this.contributor_root_comment;
        int hashCode2 = hashCode + (p2pPoolComment != null ? p2pPoolComment.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(29);
        builder.claimable_payment = this.contributor_root_comment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        P2pPoolComment p2pPoolComment = this.contributor_root_comment;
        if (p2pPoolComment != null) {
            arrayList.add("contributor_root_comment=" + p2pPoolComment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2pPoolContributionRenderData{", "}", 0, null, null, 56);
    }
}
