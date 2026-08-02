package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class OnFidesmoProvisioningStartRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnFidesmoProvisioningStartRequest> CREATOR;
    public final DeviceProvisioningStatus device_provisioning_status;
    public final FidesmoEncryptionData fidesmo_encryption_data;
    public final String fidesmo_id;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OnFidesmoProvisioningStartRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.taply.app.v1.OnFidesmoProvisioningStartRequest$Companion$ADAPTER$1
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
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new OnFidesmoProvisioningStartRequest((String) obj, (FidesmoEncryptionData) obj2, (DeviceProvisioningStatus) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(FidesmoEncryptionData.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(DeviceProvisioningStatus.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest = (OnFidesmoProvisioningStartRequest) obj;
                reverseProtoWriter.getClass();
                onFidesmoProvisioningStartRequest.getClass();
                reverseProtoWriter.writeBytes(onFidesmoProvisioningStartRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, onFidesmoProvisioningStartRequest.request_context);
                DeviceProvisioningStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, onFidesmoProvisioningStartRequest.device_provisioning_status);
                FidesmoEncryptionData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, onFidesmoProvisioningStartRequest.fidesmo_encryption_data);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, onFidesmoProvisioningStartRequest.fidesmo_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest = (OnFidesmoProvisioningStartRequest) obj;
                onFidesmoProvisioningStartRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(4, onFidesmoProvisioningStartRequest.request_context) + DeviceProvisioningStatus.ADAPTER.encodedSizeWithTag(3, onFidesmoProvisioningStartRequest.device_provisioning_status) + FidesmoEncryptionData.ADAPTER.encodedSizeWithTag(2, onFidesmoProvisioningStartRequest.fidesmo_encryption_data) + ProtoAdapter.STRING.encodedSizeWithTag(1, onFidesmoProvisioningStartRequest.fidesmo_id) + onFidesmoProvisioningStartRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest = (OnFidesmoProvisioningStartRequest) obj;
                onFidesmoProvisioningStartRequest.getClass();
                FidesmoEncryptionData fidesmoEncryptionData = onFidesmoProvisioningStartRequest.fidesmo_encryption_data;
                FidesmoEncryptionData fidesmoEncryptionData2 = fidesmoEncryptionData != null ? (FidesmoEncryptionData) FidesmoEncryptionData.ADAPTER.redact(fidesmoEncryptionData) : null;
                DeviceProvisioningStatus deviceProvisioningStatus = onFidesmoProvisioningStartRequest.device_provisioning_status;
                DeviceProvisioningStatus deviceProvisioningStatus2 = deviceProvisioningStatus != null ? (DeviceProvisioningStatus) DeviceProvisioningStatus.ADAPTER.redact(deviceProvisioningStatus) : null;
                RequestContext requestContext = onFidesmoProvisioningStartRequest.request_context;
                return OnFidesmoProvisioningStartRequest.copy$default(onFidesmoProvisioningStartRequest, fidesmoEncryptionData2, deviceProvisioningStatus2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest = (OnFidesmoProvisioningStartRequest) obj;
                onFidesmoProvisioningStartRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, onFidesmoProvisioningStartRequest.fidesmo_id);
                FidesmoEncryptionData.ADAPTER.encodeWithTag(protoWriter, 2, onFidesmoProvisioningStartRequest.fidesmo_encryption_data);
                DeviceProvisioningStatus.ADAPTER.encodeWithTag(protoWriter, 3, onFidesmoProvisioningStartRequest.device_provisioning_status);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, onFidesmoProvisioningStartRequest.request_context);
                protoWriter.writeBytes(onFidesmoProvisioningStartRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnFidesmoProvisioningStartRequest(String str, FidesmoEncryptionData fidesmoEncryptionData, DeviceProvisioningStatus deviceProvisioningStatus, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.fidesmo_id = str;
        this.fidesmo_encryption_data = fidesmoEncryptionData;
        this.device_provisioning_status = deviceProvisioningStatus;
        this.request_context = requestContext;
    }

    public static OnFidesmoProvisioningStartRequest copy$default(OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest, FidesmoEncryptionData fidesmoEncryptionData, DeviceProvisioningStatus deviceProvisioningStatus, RequestContext requestContext, ByteString byteString, int i) {
        FidesmoEncryptionData fidesmoEncryptionData2 = fidesmoEncryptionData;
        String str = onFidesmoProvisioningStartRequest.fidesmo_id;
        if ((i & 2) != 0) {
            fidesmoEncryptionData2 = onFidesmoProvisioningStartRequest.fidesmo_encryption_data;
        }
        if ((i & 4) != 0) {
            deviceProvisioningStatus = onFidesmoProvisioningStartRequest.device_provisioning_status;
        }
        if ((i & 16) != 0) {
            byteString = onFidesmoProvisioningStartRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        onFidesmoProvisioningStartRequest.getClass();
        byteString2.getClass();
        return new OnFidesmoProvisioningStartRequest(str, fidesmoEncryptionData2, deviceProvisioningStatus, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnFidesmoProvisioningStartRequest)) {
            return false;
        }
        OnFidesmoProvisioningStartRequest onFidesmoProvisioningStartRequest = (OnFidesmoProvisioningStartRequest) obj;
        return Intrinsics.areEqual(unknownFields(), onFidesmoProvisioningStartRequest.unknownFields()) && Intrinsics.areEqual(this.fidesmo_id, onFidesmoProvisioningStartRequest.fidesmo_id) && Intrinsics.areEqual(this.fidesmo_encryption_data, onFidesmoProvisioningStartRequest.fidesmo_encryption_data) && Intrinsics.areEqual(this.device_provisioning_status, onFidesmoProvisioningStartRequest.device_provisioning_status) && Intrinsics.areEqual(this.request_context, onFidesmoProvisioningStartRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.fidesmo_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        FidesmoEncryptionData fidesmoEncryptionData = this.fidesmo_encryption_data;
        int hashCode3 = (hashCode2 + (fidesmoEncryptionData != null ? fidesmoEncryptionData.hashCode() : 0)) * 37;
        DeviceProvisioningStatus deviceProvisioningStatus = this.device_provisioning_status;
        int hashCode4 = (hashCode3 + (deviceProvisioningStatus != null ? deviceProvisioningStatus.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(25);
        builder.customer_token_hash_email = this.fidesmo_id;
        builder.card_encryption_data = this.fidesmo_encryption_data;
        builder.device_metadata = this.device_provisioning_status;
        builder.success_screen = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.fidesmo_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fidesmo_id=", arrayList);
        }
        FidesmoEncryptionData fidesmoEncryptionData = this.fidesmo_encryption_data;
        if (fidesmoEncryptionData != null) {
            arrayList.add("fidesmo_encryption_data=" + fidesmoEncryptionData);
        }
        DeviceProvisioningStatus deviceProvisioningStatus = this.device_provisioning_status;
        if (deviceProvisioningStatus != null) {
            arrayList.add("device_provisioning_status=" + deviceProvisioningStatus);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnFidesmoProvisioningStartRequest{", "}", 0, null, null, 56);
    }
}
