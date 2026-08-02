package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.DateTime;
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
public final class CheckDepositRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CheckDepositRequest> CREATOR;
    public final Money amount;
    public final ByteString back_of_check_bytes;
    public final ByteString front_of_check_bytes;
    public final String idempotence_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CheckDepositRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.CheckDepositRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CheckDepositRequest((ByteString) obj, (ByteString) obj2, (Money) obj3, (RequestContext) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    } else if (nextTag == 4) {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CheckDepositRequest checkDepositRequest = (CheckDepositRequest) obj;
                reverseProtoWriter.getClass();
                checkDepositRequest.getClass();
                reverseProtoWriter.writeBytes(checkDepositRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, checkDepositRequest.idempotence_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, checkDepositRequest.request_context);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, checkDepositRequest.amount);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, checkDepositRequest.back_of_check_bytes);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, checkDepositRequest.front_of_check_bytes);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CheckDepositRequest checkDepositRequest = (CheckDepositRequest) obj;
                checkDepositRequest.getClass();
                int size$okio = checkDepositRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                return ProtoAdapter.STRING.encodedSizeWithTag(5, checkDepositRequest.idempotence_token) + RequestContext.ADAPTER.encodedSizeWithTag(4, checkDepositRequest.request_context) + Money.ADAPTER.encodedSizeWithTag(3, checkDepositRequest.amount) + protoAdapter2.encodedSizeWithTag(2, checkDepositRequest.back_of_check_bytes) + protoAdapter2.encodedSizeWithTag(1, checkDepositRequest.front_of_check_bytes) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CheckDepositRequest checkDepositRequest = (CheckDepositRequest) obj;
                checkDepositRequest.getClass();
                Money money = checkDepositRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                RequestContext requestContext = checkDepositRequest.request_context;
                return CheckDepositRequest.copy$default(checkDepositRequest, money2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 16);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CheckDepositRequest checkDepositRequest = (CheckDepositRequest) obj;
                checkDepositRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(protoWriter, 1, checkDepositRequest.front_of_check_bytes);
                protoAdapter2.encodeWithTag(protoWriter, 2, checkDepositRequest.back_of_check_bytes);
                Money.ADAPTER.encodeWithTag(protoWriter, 3, checkDepositRequest.amount);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, checkDepositRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, checkDepositRequest.idempotence_token);
                protoWriter.writeBytes(checkDepositRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDepositRequest(ByteString byteString, ByteString byteString2, Money money, RequestContext requestContext, String str, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.front_of_check_bytes = byteString;
        this.back_of_check_bytes = byteString2;
        this.amount = money;
        this.request_context = requestContext;
        this.idempotence_token = str;
    }

    public static CheckDepositRequest copy$default(CheckDepositRequest checkDepositRequest, Money money, RequestContext requestContext, ByteString byteString, int i) {
        ByteString byteString2 = (i & 1) != 0 ? checkDepositRequest.front_of_check_bytes : null;
        ByteString byteString3 = (i & 2) != 0 ? checkDepositRequest.back_of_check_bytes : null;
        if ((i & 4) != 0) {
            money = checkDepositRequest.amount;
        }
        Money money2 = money;
        String str = checkDepositRequest.idempotence_token;
        if ((i & 32) != 0) {
            byteString = checkDepositRequest.unknownFields();
        }
        ByteString byteString4 = byteString;
        checkDepositRequest.getClass();
        byteString4.getClass();
        return new CheckDepositRequest(byteString2, byteString3, money2, requestContext, str, byteString4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckDepositRequest)) {
            return false;
        }
        CheckDepositRequest checkDepositRequest = (CheckDepositRequest) obj;
        return Intrinsics.areEqual(unknownFields(), checkDepositRequest.unknownFields()) && Intrinsics.areEqual(this.front_of_check_bytes, checkDepositRequest.front_of_check_bytes) && Intrinsics.areEqual(this.back_of_check_bytes, checkDepositRequest.back_of_check_bytes) && Intrinsics.areEqual(this.amount, checkDepositRequest.amount) && Intrinsics.areEqual(this.request_context, checkDepositRequest.request_context) && Intrinsics.areEqual(this.idempotence_token, checkDepositRequest.idempotence_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.front_of_check_bytes;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.back_of_check_bytes;
        int hashCode3 = (hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = (hashCode4 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.idempotence_token;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(26, false);
        builder.instant_usec = this.front_of_check_bytes;
        builder.ordinal = this.back_of_check_bytes;
        builder.timezone_offset_min = this.amount;
        builder.tz_name = this.request_context;
        builder.posix_tz = this.idempotence_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.front_of_check_bytes != null) {
            arrayList.add("front_of_check_bytes=██");
        }
        if (this.back_of_check_bytes != null) {
            arrayList.add("back_of_check_bytes=██");
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.idempotence_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotence_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckDepositRequest{", "}", 0, null, null, 56);
    }
}
