package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.cash.blockly.api.AllowlistAction;
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
public final class ModifyAllowlistForDependentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ModifyAllowlistForDependentRequest> CREATOR;
    public final AllowlistAction allowlist_action;
    public final String dependent_customer_token;
    public final RequestContext request_context;
    public final String target_customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ModifyAllowlistForDependentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentRequest$Companion$ADAPTER$1
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
                        return new ModifyAllowlistForDependentRequest((String) obj, (String) obj2, (AllowlistAction) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = AllowlistAction.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = (ModifyAllowlistForDependentRequest) obj;
                reverseProtoWriter.getClass();
                modifyAllowlistForDependentRequest.getClass();
                reverseProtoWriter.writeBytes(modifyAllowlistForDependentRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, modifyAllowlistForDependentRequest.request_context);
                AllowlistAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, modifyAllowlistForDependentRequest.allowlist_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, modifyAllowlistForDependentRequest.target_customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, modifyAllowlistForDependentRequest.dependent_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = (ModifyAllowlistForDependentRequest) obj;
                modifyAllowlistForDependentRequest.getClass();
                int size$okio = modifyAllowlistForDependentRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(4, modifyAllowlistForDependentRequest.request_context) + AllowlistAction.ADAPTER.encodedSizeWithTag(3, modifyAllowlistForDependentRequest.allowlist_action) + protoAdapter2.encodedSizeWithTag(2, modifyAllowlistForDependentRequest.target_customer_token) + protoAdapter2.encodedSizeWithTag(1, modifyAllowlistForDependentRequest.dependent_customer_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = (ModifyAllowlistForDependentRequest) obj;
                modifyAllowlistForDependentRequest.getClass();
                RequestContext requestContext = modifyAllowlistForDependentRequest.request_context;
                return ModifyAllowlistForDependentRequest.copy$default(modifyAllowlistForDependentRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 7);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = (ModifyAllowlistForDependentRequest) obj;
                modifyAllowlistForDependentRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, modifyAllowlistForDependentRequest.dependent_customer_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, modifyAllowlistForDependentRequest.target_customer_token);
                AllowlistAction.ADAPTER.encodeWithTag(protoWriter, 3, modifyAllowlistForDependentRequest.allowlist_action);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, modifyAllowlistForDependentRequest.request_context);
                protoWriter.writeBytes(modifyAllowlistForDependentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyAllowlistForDependentRequest(String str, String str2, AllowlistAction allowlistAction, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.dependent_customer_token = str;
        this.target_customer_token = str2;
        this.allowlist_action = allowlistAction;
        this.request_context = requestContext;
    }

    public static ModifyAllowlistForDependentRequest copy$default(ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = modifyAllowlistForDependentRequest.dependent_customer_token;
        String str2 = modifyAllowlistForDependentRequest.target_customer_token;
        AllowlistAction allowlistAction = modifyAllowlistForDependentRequest.allowlist_action;
        if ((i & 16) != 0) {
            byteString = modifyAllowlistForDependentRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        modifyAllowlistForDependentRequest.getClass();
        byteString2.getClass();
        return new ModifyAllowlistForDependentRequest(str, str2, allowlistAction, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ModifyAllowlistForDependentRequest)) {
            return false;
        }
        ModifyAllowlistForDependentRequest modifyAllowlistForDependentRequest = (ModifyAllowlistForDependentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), modifyAllowlistForDependentRequest.unknownFields()) && Intrinsics.areEqual(this.dependent_customer_token, modifyAllowlistForDependentRequest.dependent_customer_token) && Intrinsics.areEqual(this.target_customer_token, modifyAllowlistForDependentRequest.target_customer_token) && this.allowlist_action == modifyAllowlistForDependentRequest.allowlist_action && Intrinsics.areEqual(this.request_context, modifyAllowlistForDependentRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.dependent_customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.target_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AllowlistAction allowlistAction = this.allowlist_action;
        int hashCode4 = (hashCode3 + (allowlistAction != null ? allowlistAction.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(20);
        builder.item_variable = this.dependent_customer_token;
        builder.collection = this.target_customer_token;
        builder.template = this.allowlist_action;
        builder.source = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.dependent_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "dependent_customer_token=", arrayList);
        }
        String str2 = this.target_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "target_customer_token=", arrayList);
        }
        AllowlistAction allowlistAction = this.allowlist_action;
        if (allowlistAction != null) {
            arrayList.add("allowlist_action=" + allowlistAction);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ModifyAllowlistForDependentRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ModifyAllowlistForDependentRequest(String str, String str2, AllowlistAction allowlistAction) {
        this(str, str2, allowlistAction, null, ByteString.EMPTY);
    }
}
