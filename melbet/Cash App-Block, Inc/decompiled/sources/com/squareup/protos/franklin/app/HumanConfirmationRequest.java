package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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
public final class HumanConfirmationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HumanConfirmationRequest> CREATOR;
    public final String blocker_descriptor_id;
    public final String confirmation_id;
    public final String proof;

    static {
        HumanConfirmationRequest$Companion$ADAPTER$1 humanConfirmationRequest$Companion$ADAPTER$1 = new HumanConfirmationRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HumanConfirmationRequest.class), "type.googleapis.com/squareup.franklin.app.HumanConfirmationRequest", Syntax.PROTO_2, null, "squareup/franklin/app/human_confirmation.proto");
        ADAPTER = humanConfirmationRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(humanConfirmationRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HumanConfirmationRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.confirmation_id = str;
        this.proof = str2;
        this.blocker_descriptor_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HumanConfirmationRequest)) {
            return false;
        }
        HumanConfirmationRequest humanConfirmationRequest = (HumanConfirmationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), humanConfirmationRequest.unknownFields()) && Intrinsics.areEqual(this.confirmation_id, humanConfirmationRequest.confirmation_id) && Intrinsics.areEqual(this.proof, humanConfirmationRequest.proof) && Intrinsics.areEqual(this.blocker_descriptor_id, humanConfirmationRequest.blocker_descriptor_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.confirmation_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.proof;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.blocker_descriptor_id;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(4);
        builder.nux_details_img_url = this.confirmation_id;
        builder.nux_activity_img_url = this.proof;
        builder.share_background_img_url = this.blocker_descriptor_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.confirmation_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "confirmation_id=", arrayList);
        }
        String str2 = this.proof;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "proof=", arrayList);
        }
        String str3 = this.blocker_descriptor_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "blocker_descriptor_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HumanConfirmationRequest{", "}", 0, null, null, 56);
    }
}
