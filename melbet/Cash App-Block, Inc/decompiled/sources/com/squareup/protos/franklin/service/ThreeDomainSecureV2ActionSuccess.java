package com.squareup.protos.franklin.service;

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
public final class ThreeDomainSecureV2ActionSuccess extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDomainSecureV2ActionSuccess> CREATOR;
    public final String action_details;
    public final String security_code;

    static {
        ThreeDomainSecureV2ActionSuccess$Companion$ADAPTER$1 threeDomainSecureV2ActionSuccess$Companion$ADAPTER$1 = new ThreeDomainSecureV2ActionSuccess$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ThreeDomainSecureV2ActionSuccess.class), "type.googleapis.com/squareup.franklin.rpc.ThreeDomainSecureV2ActionSuccess", Syntax.PROTO_2, null, "squareup/franklin/rpc/handle_three_domain_secure_v2_action.proto");
        ADAPTER = threeDomainSecureV2ActionSuccess$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(threeDomainSecureV2ActionSuccess$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDomainSecureV2ActionSuccess(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action_details = str;
        this.security_code = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDomainSecureV2ActionSuccess)) {
            return false;
        }
        ThreeDomainSecureV2ActionSuccess threeDomainSecureV2ActionSuccess = (ThreeDomainSecureV2ActionSuccess) obj;
        return Intrinsics.areEqual(unknownFields(), threeDomainSecureV2ActionSuccess.unknownFields()) && Intrinsics.areEqual(this.action_details, threeDomainSecureV2ActionSuccess.action_details) && Intrinsics.areEqual(this.security_code, threeDomainSecureV2ActionSuccess.security_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.action_details;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.security_code;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(12);
        builder.server = this.action_details;
        builder.local = this.security_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.action_details;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_details=", arrayList);
        }
        if (this.security_code != null) {
            arrayList.add("security_code=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDomainSecureV2ActionSuccess{", "}", 0, null, null, 56);
    }
}
