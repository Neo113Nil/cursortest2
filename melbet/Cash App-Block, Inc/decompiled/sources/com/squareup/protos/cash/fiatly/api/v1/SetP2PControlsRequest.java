package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class SetP2PControlsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetP2PControlsRequest> CREATOR;
    public final String customer_token;
    public final P2PControls p2p_controls;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetP2PControlsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.fiatly.api.v1.SetP2PControlsRequest$Companion$ADAPTER$1
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
                        return new SetP2PControlsRequest((String) obj, (P2PControls) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(P2PControls.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetP2PControlsRequest setP2PControlsRequest = (SetP2PControlsRequest) obj;
                reverseProtoWriter.getClass();
                setP2PControlsRequest.getClass();
                reverseProtoWriter.writeBytes(setP2PControlsRequest.unknownFields());
                P2PControls.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setP2PControlsRequest.p2p_controls);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setP2PControlsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetP2PControlsRequest setP2PControlsRequest = (SetP2PControlsRequest) obj;
                setP2PControlsRequest.getClass();
                return P2PControls.ADAPTER.encodedSizeWithTag(2, setP2PControlsRequest.p2p_controls) + ProtoAdapter.STRING.encodedSizeWithTag(1, setP2PControlsRequest.customer_token) + setP2PControlsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetP2PControlsRequest setP2PControlsRequest = (SetP2PControlsRequest) obj;
                setP2PControlsRequest.getClass();
                P2PControls p2PControls = setP2PControlsRequest.p2p_controls;
                P2PControls p2PControls2 = p2PControls != null ? (P2PControls) P2PControls.ADAPTER.redact(p2PControls) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = setP2PControlsRequest.customer_token;
                byteString.getClass();
                return new SetP2PControlsRequest(str, p2PControls2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetP2PControlsRequest setP2PControlsRequest = (SetP2PControlsRequest) obj;
                setP2PControlsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setP2PControlsRequest.customer_token);
                P2PControls.ADAPTER.encodeWithTag(protoWriter, 2, setP2PControlsRequest.p2p_controls);
                protoWriter.writeBytes(setP2PControlsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetP2PControlsRequest(String str, P2PControls p2PControls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.p2p_controls = p2PControls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetP2PControlsRequest)) {
            return false;
        }
        SetP2PControlsRequest setP2PControlsRequest = (SetP2PControlsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setP2PControlsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, setP2PControlsRequest.customer_token) && Intrinsics.areEqual(this.p2p_controls, setP2PControlsRequest.p2p_controls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        P2PControls p2PControls = this.p2p_controls;
        int hashCode3 = hashCode2 + (p2PControls != null ? p2PControls.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(13);
        builder.f1268type = this.customer_token;
        builder.details = this.p2p_controls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        P2PControls p2PControls = this.p2p_controls;
        if (p2PControls != null) {
            arrayList.add("p2p_controls=" + p2PControls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetP2PControlsRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SetP2PControlsRequest(String str, P2PControls p2PControls) {
        this(str, p2PControls, ByteString.EMPTY);
    }
}
