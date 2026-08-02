package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.VerifyPasscodeRequest;
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
public final class AddOrUpdateRewardRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddOrUpdateRewardRequest> CREATOR;
    public final String replace_selected_reward_token;
    public final RequestContext request_context;
    public final String reward_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddOrUpdateRewardRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.AddOrUpdateRewardRequest$Companion$ADAPTER$1
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
                        return new AddOrUpdateRewardRequest((RequestContext) obj3, (String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddOrUpdateRewardRequest addOrUpdateRewardRequest = (AddOrUpdateRewardRequest) obj;
                reverseProtoWriter.getClass();
                addOrUpdateRewardRequest.getClass();
                reverseProtoWriter.writeBytes(addOrUpdateRewardRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, addOrUpdateRewardRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, addOrUpdateRewardRequest.reward_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addOrUpdateRewardRequest.replace_selected_reward_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddOrUpdateRewardRequest addOrUpdateRewardRequest = (AddOrUpdateRewardRequest) obj;
                addOrUpdateRewardRequest.getClass();
                int size$okio = addOrUpdateRewardRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, addOrUpdateRewardRequest.request_context) + protoAdapter2.encodedSizeWithTag(2, addOrUpdateRewardRequest.reward_token) + protoAdapter2.encodedSizeWithTag(1, addOrUpdateRewardRequest.replace_selected_reward_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddOrUpdateRewardRequest addOrUpdateRewardRequest = (AddOrUpdateRewardRequest) obj;
                addOrUpdateRewardRequest.getClass();
                RequestContext requestContext = addOrUpdateRewardRequest.request_context;
                return AddOrUpdateRewardRequest.copy$default(addOrUpdateRewardRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddOrUpdateRewardRequest addOrUpdateRewardRequest = (AddOrUpdateRewardRequest) obj;
                addOrUpdateRewardRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, addOrUpdateRewardRequest.replace_selected_reward_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, addOrUpdateRewardRequest.reward_token);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, addOrUpdateRewardRequest.request_context);
                protoWriter.writeBytes(addOrUpdateRewardRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddOrUpdateRewardRequest(RequestContext requestContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.replace_selected_reward_token = str;
        this.reward_token = str2;
        this.request_context = requestContext;
    }

    public static AddOrUpdateRewardRequest copy$default(AddOrUpdateRewardRequest addOrUpdateRewardRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = addOrUpdateRewardRequest.replace_selected_reward_token;
        String str2 = addOrUpdateRewardRequest.reward_token;
        if ((i & 8) != 0) {
            byteString = addOrUpdateRewardRequest.unknownFields();
        }
        addOrUpdateRewardRequest.getClass();
        byteString.getClass();
        return new AddOrUpdateRewardRequest(requestContext, str, str2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddOrUpdateRewardRequest)) {
            return false;
        }
        AddOrUpdateRewardRequest addOrUpdateRewardRequest = (AddOrUpdateRewardRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addOrUpdateRewardRequest.unknownFields()) && Intrinsics.areEqual(this.replace_selected_reward_token, addOrUpdateRewardRequest.replace_selected_reward_token) && Intrinsics.areEqual(this.reward_token, addOrUpdateRewardRequest.reward_token) && Intrinsics.areEqual(this.request_context, addOrUpdateRewardRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.replace_selected_reward_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.reward_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        VerifyPasscodeRequest.Builder builder = new VerifyPasscodeRequest.Builder(5);
        builder.passcode = this.replace_selected_reward_token;
        builder.passcode_token = this.reward_token;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.replace_selected_reward_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "replace_selected_reward_token=", arrayList);
        }
        String str2 = this.reward_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "reward_token=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddOrUpdateRewardRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AddOrUpdateRewardRequest(String str, String str2) {
        this(null, str, str2, ByteString.EMPTY);
    }
}
