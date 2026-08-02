package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ValidateTapToPayPolicyRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ValidateTapToPayPolicyRequest> CREATOR;
    public final String idempotency_key;
    public final SignedSerializedMRIContext signed_mri_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ValidateTapToPayPolicyRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.ValidateTapToPayPolicyRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ValidateTapToPayPolicyRequest((SignedSerializedMRIContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest = (ValidateTapToPayPolicyRequest) obj;
                reverseProtoWriter.getClass();
                validateTapToPayPolicyRequest.getClass();
                reverseProtoWriter.writeBytes(validateTapToPayPolicyRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, validateTapToPayPolicyRequest.idempotency_key);
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, validateTapToPayPolicyRequest.signed_mri_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest = (ValidateTapToPayPolicyRequest) obj;
                validateTapToPayPolicyRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, validateTapToPayPolicyRequest.idempotency_key) + SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(1, validateTapToPayPolicyRequest.signed_mri_context) + validateTapToPayPolicyRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest = (ValidateTapToPayPolicyRequest) obj;
                validateTapToPayPolicyRequest.getClass();
                SignedSerializedMRIContext signedSerializedMRIContext = validateTapToPayPolicyRequest.signed_mri_context;
                SignedSerializedMRIContext signedSerializedMRIContext2 = signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = validateTapToPayPolicyRequest.idempotency_key;
                byteString.getClass();
                return new ValidateTapToPayPolicyRequest(signedSerializedMRIContext2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest = (ValidateTapToPayPolicyRequest) obj;
                validateTapToPayPolicyRequest.getClass();
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(protoWriter, 1, validateTapToPayPolicyRequest.signed_mri_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, validateTapToPayPolicyRequest.idempotency_key);
                protoWriter.writeBytes(validateTapToPayPolicyRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateTapToPayPolicyRequest(SignedSerializedMRIContext signedSerializedMRIContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.signed_mri_context = signedSerializedMRIContext;
        this.idempotency_key = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ValidateTapToPayPolicyRequest)) {
            return false;
        }
        ValidateTapToPayPolicyRequest validateTapToPayPolicyRequest = (ValidateTapToPayPolicyRequest) obj;
        return Intrinsics.areEqual(unknownFields(), validateTapToPayPolicyRequest.unknownFields()) && Intrinsics.areEqual(this.signed_mri_context, validateTapToPayPolicyRequest.signed_mri_context) && Intrinsics.areEqual(this.idempotency_key, validateTapToPayPolicyRequest.idempotency_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        int hashCode2 = (hashCode + (signedSerializedMRIContext != null ? signedSerializedMRIContext.hashCode() : 0)) * 37;
        String str = this.idempotency_key;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(15);
        builder.errors = this.signed_mri_context;
        builder.result = this.idempotency_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        if (signedSerializedMRIContext != null) {
            arrayList.add("signed_mri_context=" + signedSerializedMRIContext);
        }
        String str = this.idempotency_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotency_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateTapToPayPolicyRequest{", "}", 0, null, null, 56);
    }
}
