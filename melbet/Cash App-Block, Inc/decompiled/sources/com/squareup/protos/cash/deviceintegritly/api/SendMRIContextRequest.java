package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
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
public final class SendMRIContextRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendMRIContextRequest> CREATOR;
    public final MRIContext mri_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendMRIContextRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.deviceintegritly.api.SendMRIContextRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        break;
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(MRIContext.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                MRIContext mRIContext = (MRIContext) obj;
                if (mRIContext != null) {
                    return new SendMRIContextRequest(mRIContext, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "mri_context");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SendMRIContextRequest sendMRIContextRequest = (SendMRIContextRequest) obj;
                reverseProtoWriter.getClass();
                sendMRIContextRequest.getClass();
                reverseProtoWriter.writeBytes(sendMRIContextRequest.unknownFields());
                MRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, sendMRIContextRequest.mri_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SendMRIContextRequest sendMRIContextRequest = (SendMRIContextRequest) obj;
                sendMRIContextRequest.getClass();
                return MRIContext.ADAPTER.encodedSizeWithTag(1, sendMRIContextRequest.mri_context) + sendMRIContextRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SendMRIContextRequest sendMRIContextRequest = (SendMRIContextRequest) obj;
                sendMRIContextRequest.getClass();
                MRIContext mRIContext = (MRIContext) MRIContext.ADAPTER.redact(sendMRIContextRequest.mri_context);
                ByteString byteString = ByteString.EMPTY;
                mRIContext.getClass();
                byteString.getClass();
                return new SendMRIContextRequest(mRIContext, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SendMRIContextRequest sendMRIContextRequest = (SendMRIContextRequest) obj;
                sendMRIContextRequest.getClass();
                MRIContext.ADAPTER.encodeWithTag(protoWriter, 1, sendMRIContextRequest.mri_context);
                protoWriter.writeBytes(sendMRIContextRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMRIContextRequest(MRIContext mRIContext, ByteString byteString) {
        super(ADAPTER, byteString);
        mRIContext.getClass();
        byteString.getClass();
        this.mri_context = mRIContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendMRIContextRequest)) {
            return false;
        }
        SendMRIContextRequest sendMRIContextRequest = (SendMRIContextRequest) obj;
        return Intrinsics.areEqual(unknownFields(), sendMRIContextRequest.unknownFields()) && Intrinsics.areEqual(this.mri_context, sendMRIContextRequest.mri_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.mri_context.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(11);
        builder.asset_type = this.mri_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("mri_context=" + this.mri_context);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendMRIContextRequest{", "}", 0, null, null, 56);
    }
}
