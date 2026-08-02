package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SendSignedMRIContextRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendSignedMRIContextRequest> CREATOR;
    public final Map experimental_signals;
    public final MRIContext mri_context;
    public final SignedSerializedMRIContext signed_mri_context;
    public final SigningData signing_data_;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendSignedMRIContextRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.deviceintegritly.api.SendSignedMRIContextRequest$Companion$ADAPTER$1
            public final Lazy experimental_signalsAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.experimental_signalsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(4));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SendSignedMRIContextRequest((SignedSerializedMRIContext) obj, (MRIContext) obj2, m, (SigningData) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(MRIContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        m.putAll((Map) ((ProtoAdapter) this.experimental_signalsAdapter$delegate.getValue()).decode(protoReader));
                    } else if (nextTag != 1337) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(SigningData.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SendSignedMRIContextRequest sendSignedMRIContextRequest = (SendSignedMRIContextRequest) obj;
                reverseProtoWriter.getClass();
                sendSignedMRIContextRequest.getClass();
                reverseProtoWriter.writeBytes(sendSignedMRIContextRequest.unknownFields());
                SigningData.ADAPTER.encodeWithTag(reverseProtoWriter, 1337, sendSignedMRIContextRequest.signing_data_);
                ((ProtoAdapter) this.experimental_signalsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 3, sendSignedMRIContextRequest.experimental_signals);
                MRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, sendSignedMRIContextRequest.mri_context);
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sendSignedMRIContextRequest.signed_mri_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SendSignedMRIContextRequest sendSignedMRIContextRequest = (SendSignedMRIContextRequest) obj;
                sendSignedMRIContextRequest.getClass();
                return SigningData.ADAPTER.encodedSizeWithTag(1337, sendSignedMRIContextRequest.signing_data_) + ((ProtoAdapter) this.experimental_signalsAdapter$delegate.getValue()).encodedSizeWithTag(3, sendSignedMRIContextRequest.experimental_signals) + MRIContext.ADAPTER.encodedSizeWithTag(2, sendSignedMRIContextRequest.mri_context) + SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(1, sendSignedMRIContextRequest.signed_mri_context) + sendSignedMRIContextRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SendSignedMRIContextRequest sendSignedMRIContextRequest = (SendSignedMRIContextRequest) obj;
                sendSignedMRIContextRequest.getClass();
                SignedSerializedMRIContext signedSerializedMRIContext = sendSignedMRIContextRequest.signed_mri_context;
                SignedSerializedMRIContext signedSerializedMRIContext2 = signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null;
                MRIContext mRIContext = sendSignedMRIContextRequest.mri_context;
                MRIContext mRIContext2 = mRIContext != null ? (MRIContext) MRIContext.ADAPTER.redact(mRIContext) : null;
                SigningData signingData = sendSignedMRIContextRequest.signing_data_;
                SigningData signingData2 = signingData != null ? (SigningData) SigningData.ADAPTER.redact(signingData) : null;
                ByteString byteString = ByteString.EMPTY;
                Map map = sendSignedMRIContextRequest.experimental_signals;
                map.getClass();
                byteString.getClass();
                return new SendSignedMRIContextRequest(signedSerializedMRIContext2, mRIContext2, map, signingData2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SendSignedMRIContextRequest sendSignedMRIContextRequest = (SendSignedMRIContextRequest) obj;
                sendSignedMRIContextRequest.getClass();
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(protoWriter, 1, sendSignedMRIContextRequest.signed_mri_context);
                MRIContext.ADAPTER.encodeWithTag(protoWriter, 2, sendSignedMRIContextRequest.mri_context);
                ((ProtoAdapter) this.experimental_signalsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 3, sendSignedMRIContextRequest.experimental_signals);
                SigningData.ADAPTER.encodeWithTag(protoWriter, 1337, sendSignedMRIContextRequest.signing_data_);
                protoWriter.writeBytes(sendSignedMRIContextRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSignedMRIContextRequest(SignedSerializedMRIContext signedSerializedMRIContext, MRIContext mRIContext, Map map, SigningData signingData, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.signed_mri_context = signedSerializedMRIContext;
        this.mri_context = mRIContext;
        this.signing_data_ = signingData;
        this.experimental_signals = TransactorKt.immutableCopyOf("experimental_signals", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendSignedMRIContextRequest)) {
            return false;
        }
        SendSignedMRIContextRequest sendSignedMRIContextRequest = (SendSignedMRIContextRequest) obj;
        return Intrinsics.areEqual(unknownFields(), sendSignedMRIContextRequest.unknownFields()) && Intrinsics.areEqual(this.signed_mri_context, sendSignedMRIContextRequest.signed_mri_context) && Intrinsics.areEqual(this.mri_context, sendSignedMRIContextRequest.mri_context) && Intrinsics.areEqual(this.experimental_signals, sendSignedMRIContextRequest.experimental_signals) && Intrinsics.areEqual(this.signing_data_, sendSignedMRIContextRequest.signing_data_);
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
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode2 + (mRIContext != null ? mRIContext.hashCode() : 0)) * 37, this.experimental_signals, 37);
        SigningData signingData = this.signing_data_;
        int hashCode3 = m + (signingData != null ? signingData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(3);
        builder.postal_code = this.signed_mri_context;
        builder.last_four_digits = this.mri_context;
        builder.expiration = this.experimental_signals;
        builder.ciphertext_ = this.signing_data_;
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
        Map map = this.experimental_signals;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("experimental_signals=", map, arrayList);
        }
        SigningData signingData = this.signing_data_;
        if (signingData != null) {
            arrayList.add("signing_data_=" + signingData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendSignedMRIContextRequest{", "}", 0, null, null, 56);
    }
}
