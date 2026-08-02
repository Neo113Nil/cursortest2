package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetFlowRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFlowRequest> CREATOR;
    public final Input input;
    public final RequestContext request_context;

    /* loaded from: classes4.dex */
    public abstract class Input {

        /* loaded from: classes8.dex */
        public final class FlowType extends Input {
            public final Flow$Type value;

            public FlowType(Flow$Type flow$Type) {
                flow$Type.getClass();
                this.value = flow$Type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FlowType) && this.value == ((FlowType) obj).value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "FlowType(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class InitiationData extends Input {
            public final String value;

            public InitiationData(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiationData) && Intrinsics.areEqual(this.value, ((InitiationData) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InitiationData(value=", this.value, ")");
            }
        }

        public static LongTaskEvent.Usr fromJsonObject(JsonObject jsonObject) {
            try {
                JsonElement jsonElement = jsonObject.get("id");
                String asString = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = jsonObject.get("name");
                String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = jsonObject.get("email");
                String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                JsonElement jsonElement4 = jsonObject.get("anonymous_id");
                String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                    if (!ArraysKt___ArraysKt.contains(LongTaskEvent.Usr.RESERVED_PROPERTIES, entry.getKey())) {
                        String key = entry.getKey();
                        key.getClass();
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                return new LongTaskEvent.Usr(asString, asString2, asString3, asString4, linkedHashMap);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e3);
                return null;
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewShoppingSettings.deepLinkSpecs;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetFlowRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetFlowRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                GetFlowRequest.Input input = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetFlowRequest((RequestContext) obj, input, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        input = new GetFlowRequest.Input.InitiationData((String) ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            input = new GetFlowRequest.Input.FlowType((Flow$Type) Flow$Type.ADAPTER.decode(protoReader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetFlowRequest getFlowRequest = (GetFlowRequest) obj;
                reverseProtoWriter.getClass();
                getFlowRequest.getClass();
                reverseProtoWriter.writeBytes(getFlowRequest.unknownFields());
                GetFlowRequest.Input input = getFlowRequest.input;
                if (input instanceof GetFlowRequest.Input.InitiationData) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((GetFlowRequest.Input.InitiationData) input).value);
                } else if (input instanceof GetFlowRequest.Input.FlowType) {
                    Flow$Type.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetFlowRequest.Input.FlowType) input).value);
                } else if (input != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getFlowRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetFlowRequest getFlowRequest = (GetFlowRequest) obj;
                getFlowRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, getFlowRequest.request_context) + getFlowRequest.unknownFields().getSize$okio();
                GetFlowRequest.Input input = getFlowRequest.input;
                if (input instanceof GetFlowRequest.Input.InitiationData) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, ((GetFlowRequest.Input.InitiationData) input).value) + encodedSizeWithTag;
                }
                if (input instanceof GetFlowRequest.Input.FlowType) {
                    return Flow$Type.ADAPTER.encodedSizeWithTag(3, ((GetFlowRequest.Input.FlowType) input).value) + encodedSizeWithTag;
                }
                if (input == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetFlowRequest getFlowRequest = (GetFlowRequest) obj;
                getFlowRequest.getClass();
                RequestContext requestContext = getFlowRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetFlowRequest(requestContext2, (GetFlowRequest.Input) null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetFlowRequest getFlowRequest = (GetFlowRequest) obj;
                getFlowRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, getFlowRequest.request_context);
                GetFlowRequest.Input input = getFlowRequest.input;
                if (input instanceof GetFlowRequest.Input.InitiationData) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ((GetFlowRequest.Input.InitiationData) input).value);
                } else if (input instanceof GetFlowRequest.Input.FlowType) {
                    Flow$Type.ADAPTER.encodeWithTag(protoWriter, 3, ((GetFlowRequest.Input.FlowType) input).value);
                } else if (input != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(getFlowRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFlowRequest(RequestContext requestContext, Input input, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.input = input;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFlowRequest)) {
            return false;
        }
        GetFlowRequest getFlowRequest = (GetFlowRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getFlowRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, getFlowRequest.request_context) && Intrinsics.areEqual(this.input, getFlowRequest.input);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Input input = this.input;
        int hashCode3 = hashCode2 + (input != null ? input.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(16);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.input;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.input != null) {
            arrayList.add("input=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFlowRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetFlowRequest(RequestContext requestContext, Input input, int i) {
        this((i & 1) != 0 ? null : requestContext, input, ByteString.EMPTY);
    }
}
