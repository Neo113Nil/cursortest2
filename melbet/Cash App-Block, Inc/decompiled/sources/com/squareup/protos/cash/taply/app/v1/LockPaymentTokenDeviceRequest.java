package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.model.v1.LockActor;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class LockPaymentTokenDeviceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LockPaymentTokenDeviceRequest> CREATOR;
    public final LockActor actor;
    public final String device_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LockPaymentTokenDeviceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.taply.app.v1.LockPaymentTokenDeviceRequest$Companion$ADAPTER$1
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
                        return new LockPaymentTokenDeviceRequest((String) obj, (LockActor) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = LockActor.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                LockPaymentTokenDeviceRequest lockPaymentTokenDeviceRequest = (LockPaymentTokenDeviceRequest) obj;
                reverseProtoWriter.getClass();
                lockPaymentTokenDeviceRequest.getClass();
                reverseProtoWriter.writeBytes(lockPaymentTokenDeviceRequest.unknownFields());
                LockActor.ADAPTER.encodeWithTag(reverseProtoWriter, 2, lockPaymentTokenDeviceRequest.actor);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, lockPaymentTokenDeviceRequest.device_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LockPaymentTokenDeviceRequest lockPaymentTokenDeviceRequest = (LockPaymentTokenDeviceRequest) obj;
                lockPaymentTokenDeviceRequest.getClass();
                return LockActor.ADAPTER.encodedSizeWithTag(2, lockPaymentTokenDeviceRequest.actor) + ProtoAdapter.STRING.encodedSizeWithTag(1, lockPaymentTokenDeviceRequest.device_id) + lockPaymentTokenDeviceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                LockPaymentTokenDeviceRequest lockPaymentTokenDeviceRequest = (LockPaymentTokenDeviceRequest) obj;
                lockPaymentTokenDeviceRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = lockPaymentTokenDeviceRequest.device_id;
                LockActor lockActor = lockPaymentTokenDeviceRequest.actor;
                byteString.getClass();
                return new LockPaymentTokenDeviceRequest(str, lockActor, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LockPaymentTokenDeviceRequest lockPaymentTokenDeviceRequest = (LockPaymentTokenDeviceRequest) obj;
                lockPaymentTokenDeviceRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, lockPaymentTokenDeviceRequest.device_id);
                LockActor.ADAPTER.encodeWithTag(protoWriter, 2, lockPaymentTokenDeviceRequest.actor);
                protoWriter.writeBytes(lockPaymentTokenDeviceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockPaymentTokenDeviceRequest(String str, LockActor lockActor, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.device_id = str;
        this.actor = lockActor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LockPaymentTokenDeviceRequest)) {
            return false;
        }
        LockPaymentTokenDeviceRequest lockPaymentTokenDeviceRequest = (LockPaymentTokenDeviceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), lockPaymentTokenDeviceRequest.unknownFields()) && Intrinsics.areEqual(this.device_id, lockPaymentTokenDeviceRequest.device_id) && this.actor == lockPaymentTokenDeviceRequest.actor;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.device_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LockActor lockActor = this.actor;
        int hashCode3 = hashCode2 + (lockActor != null ? lockActor.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(13);
        builder.primary_button = this.device_id;
        builder.secondary_button = this.actor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
        }
        LockActor lockActor = this.actor;
        if (lockActor != null) {
            arrayList.add("actor=" + lockActor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LockPaymentTokenDeviceRequest{", "}", 0, null, null, 56);
    }
}
