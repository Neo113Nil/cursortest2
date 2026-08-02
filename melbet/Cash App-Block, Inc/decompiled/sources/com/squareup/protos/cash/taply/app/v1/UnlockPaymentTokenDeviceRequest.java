package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class UnlockPaymentTokenDeviceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnlockPaymentTokenDeviceRequest> CREATOR;
    public final String device_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UnlockPaymentTokenDeviceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.taply.app.v1.UnlockPaymentTokenDeviceRequest$Companion$ADAPTER$1
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
                        return new UnlockPaymentTokenDeviceRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UnlockPaymentTokenDeviceRequest unlockPaymentTokenDeviceRequest = (UnlockPaymentTokenDeviceRequest) obj;
                reverseProtoWriter.getClass();
                unlockPaymentTokenDeviceRequest.getClass();
                reverseProtoWriter.writeBytes(unlockPaymentTokenDeviceRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, unlockPaymentTokenDeviceRequest.device_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UnlockPaymentTokenDeviceRequest unlockPaymentTokenDeviceRequest = (UnlockPaymentTokenDeviceRequest) obj;
                unlockPaymentTokenDeviceRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, unlockPaymentTokenDeviceRequest.device_id) + unlockPaymentTokenDeviceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UnlockPaymentTokenDeviceRequest unlockPaymentTokenDeviceRequest = (UnlockPaymentTokenDeviceRequest) obj;
                unlockPaymentTokenDeviceRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = unlockPaymentTokenDeviceRequest.device_id;
                byteString.getClass();
                return new UnlockPaymentTokenDeviceRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UnlockPaymentTokenDeviceRequest unlockPaymentTokenDeviceRequest = (UnlockPaymentTokenDeviceRequest) obj;
                unlockPaymentTokenDeviceRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unlockPaymentTokenDeviceRequest.device_id);
                protoWriter.writeBytes(unlockPaymentTokenDeviceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockPaymentTokenDeviceRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnlockPaymentTokenDeviceRequest)) {
            return false;
        }
        UnlockPaymentTokenDeviceRequest unlockPaymentTokenDeviceRequest = (UnlockPaymentTokenDeviceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), unlockPaymentTokenDeviceRequest.unknownFields()) && Intrinsics.areEqual(this.device_id, unlockPaymentTokenDeviceRequest.device_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(29);
        builder.bio = this.device_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnlockPaymentTokenDeviceRequest{", "}", 0, null, null, 56);
    }
}
