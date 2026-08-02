package com.squareup.protos.cash.unicorn.dismiss_badge;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class DismissBadgeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DismissBadgeRequest> CREATOR;
    public final String option_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DismissBadgeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.unicorn.dismiss_badge.DismissBadgeRequest$Companion$ADAPTER$1
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
                        return new DismissBadgeRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                DismissBadgeRequest dismissBadgeRequest = (DismissBadgeRequest) obj;
                reverseProtoWriter.getClass();
                dismissBadgeRequest.getClass();
                reverseProtoWriter.writeBytes(dismissBadgeRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, dismissBadgeRequest.option_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DismissBadgeRequest dismissBadgeRequest = (DismissBadgeRequest) obj;
                dismissBadgeRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, dismissBadgeRequest.option_id) + dismissBadgeRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DismissBadgeRequest dismissBadgeRequest = (DismissBadgeRequest) obj;
                dismissBadgeRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = dismissBadgeRequest.option_id;
                byteString.getClass();
                return new DismissBadgeRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DismissBadgeRequest dismissBadgeRequest = (DismissBadgeRequest) obj;
                dismissBadgeRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dismissBadgeRequest.option_id);
                protoWriter.writeBytes(dismissBadgeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissBadgeRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.option_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DismissBadgeRequest)) {
            return false;
        }
        DismissBadgeRequest dismissBadgeRequest = (DismissBadgeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), dismissBadgeRequest.unknownFields()) && Intrinsics.areEqual(this.option_id, dismissBadgeRequest.option_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.option_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(4);
        builder.client_route = this.option_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.option_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "option_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DismissBadgeRequest{", "}", 0, null, null, 56);
    }
}
