package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.common.ProfileAlias;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetRatePlanRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetRatePlanRequest> CREATOR;
    public final Boolean commit;
    public final String intended_usage;
    public final List payment_tokens;
    public final RatePlan rate_plan;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetRatePlanRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetRatePlanRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetRatePlanRequest((RequestContext) obj, (RatePlan) obj2, (Boolean) obj3, m, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        try {
                            obj2 = RatePlan.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 5) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 6) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 7) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetRatePlanRequest setRatePlanRequest = (SetRatePlanRequest) obj;
                reverseProtoWriter.getClass();
                setRatePlanRequest.getClass();
                reverseProtoWriter.writeBytes(setRatePlanRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, setRatePlanRequest.intended_usage);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, setRatePlanRequest.payment_tokens);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, setRatePlanRequest.commit);
                RatePlan.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setRatePlanRequest.rate_plan);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, setRatePlanRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetRatePlanRequest setRatePlanRequest = (SetRatePlanRequest) obj;
                setRatePlanRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(4, setRatePlanRequest.commit) + RatePlan.ADAPTER.encodedSizeWithTag(3, setRatePlanRequest.rate_plan) + RequestContext.ADAPTER.encodedSizeWithTag(7, setRatePlanRequest.request_context) + setRatePlanRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, setRatePlanRequest.intended_usage) + protoAdapter2.asRepeated().encodedSizeWithTag(5, setRatePlanRequest.payment_tokens) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetRatePlanRequest setRatePlanRequest = (SetRatePlanRequest) obj;
                setRatePlanRequest.getClass();
                RequestContext requestContext = setRatePlanRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                RatePlan ratePlan = setRatePlanRequest.rate_plan;
                Boolean bool = setRatePlanRequest.commit;
                String str = setRatePlanRequest.intended_usage;
                emptyList.getClass();
                byteString.getClass();
                return new SetRatePlanRequest(requestContext2, ratePlan, bool, emptyList, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetRatePlanRequest setRatePlanRequest = (SetRatePlanRequest) obj;
                setRatePlanRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 7, setRatePlanRequest.request_context);
                RatePlan.ADAPTER.encodeWithTag(protoWriter, 3, setRatePlanRequest.rate_plan);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, setRatePlanRequest.commit);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, setRatePlanRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 6, setRatePlanRequest.intended_usage);
                protoWriter.writeBytes(setRatePlanRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRatePlanRequest(RequestContext requestContext, RatePlan ratePlan, Boolean bool, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.rate_plan = ratePlan;
        this.commit = bool;
        this.intended_usage = str;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetRatePlanRequest)) {
            return false;
        }
        SetRatePlanRequest setRatePlanRequest = (SetRatePlanRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setRatePlanRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setRatePlanRequest.request_context) && this.rate_plan == setRatePlanRequest.rate_plan && Intrinsics.areEqual(this.commit, setRatePlanRequest.commit) && Intrinsics.areEqual(this.payment_tokens, setRatePlanRequest.payment_tokens) && Intrinsics.areEqual(this.intended_usage, setRatePlanRequest.intended_usage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode3 = (hashCode2 + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        Boolean bool = this.commit;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.payment_tokens);
        String str = this.intended_usage;
        int hashCode4 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(4);
        builder.alias = this.request_context;
        builder.expires_at = this.rate_plan;
        builder.verified = this.commit;
        builder.version = this.payment_tokens;
        builder.display_date = this.intended_usage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        Boolean bool = this.commit;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("commit=", bool, arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        String str = this.intended_usage;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "intended_usage=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetRatePlanRequest{", "}", 0, null, null, 56);
    }
}
