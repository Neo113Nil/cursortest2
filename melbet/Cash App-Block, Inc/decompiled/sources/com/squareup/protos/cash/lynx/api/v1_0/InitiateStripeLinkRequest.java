package com.squareup.protos.cash.lynx.api.v1_0;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class InitiateStripeLinkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateStripeLinkRequest> CREATOR;
    public final Boolean manual_ach_enabled;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateStripeLinkRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.lynx.api.v1_0.InitiateStripeLinkRequest$Companion$ADAPTER$1
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
                        return new InitiateStripeLinkRequest((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateStripeLinkRequest initiateStripeLinkRequest = (InitiateStripeLinkRequest) obj;
                reverseProtoWriter.getClass();
                initiateStripeLinkRequest.getClass();
                reverseProtoWriter.writeBytes(initiateStripeLinkRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, initiateStripeLinkRequest.manual_ach_enabled);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InitiateStripeLinkRequest initiateStripeLinkRequest = (InitiateStripeLinkRequest) obj;
                initiateStripeLinkRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, initiateStripeLinkRequest.manual_ach_enabled) + initiateStripeLinkRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateStripeLinkRequest initiateStripeLinkRequest = (InitiateStripeLinkRequest) obj;
                initiateStripeLinkRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = initiateStripeLinkRequest.manual_ach_enabled;
                byteString.getClass();
                return new InitiateStripeLinkRequest(bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateStripeLinkRequest initiateStripeLinkRequest = (InitiateStripeLinkRequest) obj;
                initiateStripeLinkRequest.getClass();
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, initiateStripeLinkRequest.manual_ach_enabled);
                protoWriter.writeBytes(initiateStripeLinkRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateStripeLinkRequest(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.manual_ach_enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateStripeLinkRequest)) {
            return false;
        }
        InitiateStripeLinkRequest initiateStripeLinkRequest = (InitiateStripeLinkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiateStripeLinkRequest.unknownFields()) && Intrinsics.areEqual(this.manual_ach_enabled, initiateStripeLinkRequest.manual_ach_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.manual_ach_enabled;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(15);
        builder.activated = this.manual_ach_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.manual_ach_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("manual_ach_enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateStripeLinkRequest{", "}", 0, null, null, 56);
    }
}
