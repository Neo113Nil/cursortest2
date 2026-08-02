package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayServiceChargeRenderData;
import com.squareup.protos.cash.pay.CashAppPayShippingChargeRenderData;
import com.squareup.protos.common.Money;
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
public final class CreatePoolRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreatePoolRequest> CREATOR;
    public final Money goal_amount;
    public final String idempotency_key;
    public final String pool_name;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Money goal_amount;
        public String idempotency_key;
        public String pool_name;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CreatePoolRequest(this.goal_amount, this.pool_name, this.idempotency_key, buildUnknownFields());
                case 1:
                    return new CashAppPayServiceChargeRenderData(this.goal_amount, this.pool_name, this.idempotency_key, buildUnknownFields());
                default:
                    return new CashAppPayShippingChargeRenderData(this.goal_amount, this.pool_name, this.idempotency_key, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreatePoolRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.pools.CreatePoolRequest$Companion$ADAPTER$1
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
                        return new CreatePoolRequest((Money) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreatePoolRequest createPoolRequest = (CreatePoolRequest) obj;
                reverseProtoWriter.getClass();
                createPoolRequest.getClass();
                reverseProtoWriter.writeBytes(createPoolRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, createPoolRequest.idempotency_key);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, createPoolRequest.pool_name);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createPoolRequest.goal_amount);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreatePoolRequest createPoolRequest = (CreatePoolRequest) obj;
                createPoolRequest.getClass();
                int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, createPoolRequest.goal_amount) + createPoolRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, createPoolRequest.idempotency_key) + protoAdapter2.encodedSizeWithTag(2, createPoolRequest.pool_name) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreatePoolRequest createPoolRequest = (CreatePoolRequest) obj;
                createPoolRequest.getClass();
                Money money = createPoolRequest.goal_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = createPoolRequest.idempotency_key;
                byteString.getClass();
                return new CreatePoolRequest(money2, null, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreatePoolRequest createPoolRequest = (CreatePoolRequest) obj;
                createPoolRequest.getClass();
                Money.ADAPTER.encodeWithTag(protoWriter, 1, createPoolRequest.goal_amount);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, createPoolRequest.pool_name);
                protoAdapter2.encodeWithTag(protoWriter, 3, createPoolRequest.idempotency_key);
                protoWriter.writeBytes(createPoolRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePoolRequest(Money money, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.goal_amount = money;
        this.pool_name = str;
        this.idempotency_key = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreatePoolRequest)) {
            return false;
        }
        CreatePoolRequest createPoolRequest = (CreatePoolRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createPoolRequest.unknownFields()) && Intrinsics.areEqual(this.goal_amount, createPoolRequest.goal_amount) && Intrinsics.areEqual(this.pool_name, createPoolRequest.pool_name) && Intrinsics.areEqual(this.idempotency_key, createPoolRequest.idempotency_key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.goal_amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.pool_name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.idempotency_key;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.goal_amount = this.goal_amount;
        builder.pool_name = this.pool_name;
        builder.idempotency_key = this.idempotency_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.goal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_amount=", money, arrayList);
        }
        if (this.pool_name != null) {
            arrayList.add("pool_name=██");
        }
        String str = this.idempotency_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotency_key=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePoolRequest{", "}", 0, null, null, 56);
    }
}
