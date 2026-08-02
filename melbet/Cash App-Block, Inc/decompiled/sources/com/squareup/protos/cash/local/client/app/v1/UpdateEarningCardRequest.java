package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
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
public final class UpdateEarningCardRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateEarningCardRequest> CREATOR;
    public final String earning_card_id;
    public final RequestContext request_context;
    public final LocalEarningCard.EarningState state;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateEarningCardRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.app.v1.UpdateEarningCardRequest$Companion$ADAPTER$1
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
                        return new UpdateEarningCardRequest((RequestContext) obj, (String) obj2, (LocalEarningCard.EarningState) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = LocalEarningCard.EarningState.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateEarningCardRequest updateEarningCardRequest = (UpdateEarningCardRequest) obj;
                reverseProtoWriter.getClass();
                updateEarningCardRequest.getClass();
                reverseProtoWriter.writeBytes(updateEarningCardRequest.unknownFields());
                LocalEarningCard.EarningState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, updateEarningCardRequest.state);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, updateEarningCardRequest.earning_card_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateEarningCardRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateEarningCardRequest updateEarningCardRequest = (UpdateEarningCardRequest) obj;
                updateEarningCardRequest.getClass();
                return LocalEarningCard.EarningState.ADAPTER.encodedSizeWithTag(3, updateEarningCardRequest.state) + ProtoAdapter.STRING.encodedSizeWithTag(2, updateEarningCardRequest.earning_card_id) + RequestContext.ADAPTER.encodedSizeWithTag(1, updateEarningCardRequest.request_context) + updateEarningCardRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateEarningCardRequest updateEarningCardRequest = (UpdateEarningCardRequest) obj;
                updateEarningCardRequest.getClass();
                RequestContext requestContext = updateEarningCardRequest.request_context;
                return UpdateEarningCardRequest.copy$default(updateEarningCardRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateEarningCardRequest updateEarningCardRequest = (UpdateEarningCardRequest) obj;
                updateEarningCardRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, updateEarningCardRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateEarningCardRequest.earning_card_id);
                LocalEarningCard.EarningState.ADAPTER.encodeWithTag(protoWriter, 3, updateEarningCardRequest.state);
                protoWriter.writeBytes(updateEarningCardRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateEarningCardRequest(RequestContext requestContext, String str, LocalEarningCard.EarningState earningState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.earning_card_id = str;
        this.state = earningState;
    }

    public static UpdateEarningCardRequest copy$default(UpdateEarningCardRequest updateEarningCardRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = updateEarningCardRequest.earning_card_id;
        LocalEarningCard.EarningState earningState = updateEarningCardRequest.state;
        if ((i & 8) != 0) {
            byteString = updateEarningCardRequest.unknownFields();
        }
        updateEarningCardRequest.getClass();
        byteString.getClass();
        return new UpdateEarningCardRequest(requestContext, str, earningState, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateEarningCardRequest)) {
            return false;
        }
        UpdateEarningCardRequest updateEarningCardRequest = (UpdateEarningCardRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateEarningCardRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, updateEarningCardRequest.request_context) && Intrinsics.areEqual(this.earning_card_id, updateEarningCardRequest.earning_card_id) && this.state == updateEarningCardRequest.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.earning_card_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        LocalEarningCard.EarningState earningState = this.state;
        int hashCode4 = hashCode3 + (earningState != null ? earningState.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(16);
        builder.group_image = this.request_context;
        builder.name = this.earning_card_id;
        builder.participants = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.earning_card_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "earning_card_id=", arrayList);
        }
        LocalEarningCard.EarningState earningState = this.state;
        if (earningState != null) {
            arrayList.add("state=" + earningState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateEarningCardRequest{", "}", 0, null, null, 56);
    }
}
