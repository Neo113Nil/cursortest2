package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetEffectiveCustomerLimitsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEffectiveCustomerLimitsRequest> CREATOR;
    public final List limited_actions;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetEffectiveCustomerLimitsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetEffectiveCustomerLimitsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetEffectiveCustomerLimitsRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            LimitedAction.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetEffectiveCustomerLimitsRequest getEffectiveCustomerLimitsRequest = (GetEffectiveCustomerLimitsRequest) obj;
                reverseProtoWriter.getClass();
                getEffectiveCustomerLimitsRequest.getClass();
                reverseProtoWriter.writeBytes(getEffectiveCustomerLimitsRequest.unknownFields());
                LimitedAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getEffectiveCustomerLimitsRequest.limited_actions);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetEffectiveCustomerLimitsRequest getEffectiveCustomerLimitsRequest = (GetEffectiveCustomerLimitsRequest) obj;
                getEffectiveCustomerLimitsRequest.getClass();
                return LimitedAction.ADAPTER.asRepeated().encodedSizeWithTag(1, getEffectiveCustomerLimitsRequest.limited_actions) + getEffectiveCustomerLimitsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetEffectiveCustomerLimitsRequest getEffectiveCustomerLimitsRequest = (GetEffectiveCustomerLimitsRequest) obj;
                getEffectiveCustomerLimitsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = getEffectiveCustomerLimitsRequest.limited_actions;
                list.getClass();
                byteString.getClass();
                return new GetEffectiveCustomerLimitsRequest(list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetEffectiveCustomerLimitsRequest getEffectiveCustomerLimitsRequest = (GetEffectiveCustomerLimitsRequest) obj;
                getEffectiveCustomerLimitsRequest.getClass();
                LimitedAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getEffectiveCustomerLimitsRequest.limited_actions);
                protoWriter.writeBytes(getEffectiveCustomerLimitsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEffectiveCustomerLimitsRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.limited_actions = TransactorKt.immutableCopyOf("limited_actions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEffectiveCustomerLimitsRequest)) {
            return false;
        }
        GetEffectiveCustomerLimitsRequest getEffectiveCustomerLimitsRequest = (GetEffectiveCustomerLimitsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEffectiveCustomerLimitsRequest.unknownFields()) && Intrinsics.areEqual(this.limited_actions, getEffectiveCustomerLimitsRequest.limited_actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.limited_actions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(13);
        builder.header = this.limited_actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.limited_actions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("limited_actions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEffectiveCustomerLimitsRequest{", "}", 0, null, null, 56);
    }
}
