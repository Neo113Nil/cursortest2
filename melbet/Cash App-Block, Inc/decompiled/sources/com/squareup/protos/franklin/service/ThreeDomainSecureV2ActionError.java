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
public final class ThreeDomainSecureV2ActionError extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDomainSecureV2ActionError> CREATOR;
    public final String adyen_lib_error_message;
    public final String adyen_lib_error_type;

    static {
        ThreeDomainSecureV2ActionError$Companion$ADAPTER$1 threeDomainSecureV2ActionError$Companion$ADAPTER$1 = new ThreeDomainSecureV2ActionError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ThreeDomainSecureV2ActionError.class), "type.googleapis.com/squareup.franklin.rpc.ThreeDomainSecureV2ActionError", Syntax.PROTO_2, null, "squareup/franklin/rpc/handle_three_domain_secure_v2_action.proto");
        ADAPTER = threeDomainSecureV2ActionError$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(threeDomainSecureV2ActionError$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDomainSecureV2ActionError(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.adyen_lib_error_type = str;
        this.adyen_lib_error_message = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDomainSecureV2ActionError)) {
            return false;
        }
        ThreeDomainSecureV2ActionError threeDomainSecureV2ActionError = (ThreeDomainSecureV2ActionError) obj;
        return Intrinsics.areEqual(unknownFields(), threeDomainSecureV2ActionError.unknownFields()) && Intrinsics.areEqual(this.adyen_lib_error_type, threeDomainSecureV2ActionError.adyen_lib_error_type) && Intrinsics.areEqual(this.adyen_lib_error_message, threeDomainSecureV2ActionError.adyen_lib_error_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.adyen_lib_error_type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.adyen_lib_error_message;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(11);
        builder.server = this.adyen_lib_error_type;
        builder.local = this.adyen_lib_error_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.adyen_lib_error_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "adyen_lib_error_type=", arrayList);
        }
        String str2 = this.adyen_lib_error_message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "adyen_lib_error_message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDomainSecureV2ActionError{", "}", 0, null, null, 56);
    }
}
