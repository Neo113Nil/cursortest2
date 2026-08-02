package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.signing.SigningData;
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
public final class PublishClientTrustSignalsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PublishClientTrustSignalsRequest> CREATOR;
    public final MRIContext mri_context;
    public final SignedSerializedMRIContext signed_mri_context;
    public final SigningData signing_data_;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PublishClientTrustSignalsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.deviceintegritly.api.PublishClientTrustSignalsRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new PublishClientTrustSignalsRequest((SignedSerializedMRIContext) obj, (MRIContext) obj2, (SigningData) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(MRIContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 1337) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(SigningData.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PublishClientTrustSignalsRequest publishClientTrustSignalsRequest = (PublishClientTrustSignalsRequest) obj;
                reverseProtoWriter.getClass();
                publishClientTrustSignalsRequest.getClass();
                reverseProtoWriter.writeBytes(publishClientTrustSignalsRequest.unknownFields());
                SigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 1337, publishClientTrustSignalsRequest.signing_data_);
                MRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, publishClientTrustSignalsRequest.mri_context);
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, publishClientTrustSignalsRequest.signed_mri_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                PublishClientTrustSignalsRequest publishClientTrustSignalsRequest = (PublishClientTrustSignalsRequest) obj;
                publishClientTrustSignalsRequest.getClass();
                return SigningData.ADAPTER.encodedSizeWithTag(1337, publishClientTrustSignalsRequest.signing_data_) + MRIContext.ADAPTER.encodedSizeWithTag(2, publishClientTrustSignalsRequest.mri_context) + SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(1, publishClientTrustSignalsRequest.signed_mri_context) + publishClientTrustSignalsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PublishClientTrustSignalsRequest publishClientTrustSignalsRequest = (PublishClientTrustSignalsRequest) obj;
                publishClientTrustSignalsRequest.getClass();
                SignedSerializedMRIContext signedSerializedMRIContext = publishClientTrustSignalsRequest.signed_mri_context;
                SignedSerializedMRIContext signedSerializedMRIContext2 = signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null;
                MRIContext mRIContext = publishClientTrustSignalsRequest.mri_context;
                MRIContext mRIContext2 = mRIContext != null ? (MRIContext) MRIContext.ADAPTER.redact(mRIContext) : null;
                SigningData signingData = publishClientTrustSignalsRequest.signing_data_;
                SigningData signingData2 = signingData != null ? (SigningData) SigningData.ADAPTER.redact(signingData) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new PublishClientTrustSignalsRequest(signedSerializedMRIContext2, mRIContext2, signingData2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PublishClientTrustSignalsRequest publishClientTrustSignalsRequest = (PublishClientTrustSignalsRequest) obj;
                publishClientTrustSignalsRequest.getClass();
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(protoWriter, 1, publishClientTrustSignalsRequest.signed_mri_context);
                MRIContext.ADAPTER.encodeWithTag(protoWriter, 2, publishClientTrustSignalsRequest.mri_context);
                SigningData.ADAPTER.encodeWithTag(protoWriter, 1337, publishClientTrustSignalsRequest.signing_data_);
                protoWriter.writeBytes(publishClientTrustSignalsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishClientTrustSignalsRequest(SignedSerializedMRIContext signedSerializedMRIContext, MRIContext mRIContext, SigningData signingData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.signed_mri_context = signedSerializedMRIContext;
        this.mri_context = mRIContext;
        this.signing_data_ = signingData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublishClientTrustSignalsRequest)) {
            return false;
        }
        PublishClientTrustSignalsRequest publishClientTrustSignalsRequest = (PublishClientTrustSignalsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), publishClientTrustSignalsRequest.unknownFields()) && Intrinsics.areEqual(this.signed_mri_context, publishClientTrustSignalsRequest.signed_mri_context) && Intrinsics.areEqual(this.mri_context, publishClientTrustSignalsRequest.mri_context) && Intrinsics.areEqual(this.signing_data_, publishClientTrustSignalsRequest.signing_data_);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        int hashCode2 = (hashCode + (signedSerializedMRIContext != null ? signedSerializedMRIContext.hashCode() : 0)) * 37;
        MRIContext mRIContext = this.mri_context;
        int hashCode3 = (hashCode2 + (mRIContext != null ? mRIContext.hashCode() : 0)) * 37;
        SigningData signingData = this.signing_data_;
        int hashCode4 = hashCode3 + (signingData != null ? signingData.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(8);
        builder.loan_type = this.signed_mri_context;
        builder.payment_schedule = this.mri_context;
        builder.tila_data = this.signing_data_;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        if (signedSerializedMRIContext != null) {
            arrayList.add("signed_mri_context=" + signedSerializedMRIContext);
        }
        MRIContext mRIContext = this.mri_context;
        if (mRIContext != null) {
            arrayList.add("mri_context=" + mRIContext);
        }
        SigningData signingData = this.signing_data_;
        if (signingData != null) {
            arrayList.add("signing_data_=" + signingData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PublishClientTrustSignalsRequest{", "}", 0, null, null, 56);
    }
}
