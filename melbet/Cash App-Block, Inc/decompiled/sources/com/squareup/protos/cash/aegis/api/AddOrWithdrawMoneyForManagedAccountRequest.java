package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountRequest;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AddOrWithdrawMoneyForManagedAccountRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddOrWithdrawMoneyForManagedAccountRequest> CREATOR;
    public final Action action;
    public final Money amount;
    public final String external_id;
    public final String sender_instrument_token;

    /* loaded from: classes7.dex */
    public enum Action implements WireEnum {
        ADD(1),
        WITHDRAW(2);

        public final int value;
        public static final WorkCookieJar Companion = new WorkCookieJar(14);
        public static final AddOrWithdrawMoneyForManagedAccountRequest$Action$Companion$ADAPTER$1 ADAPTER = new AddOrWithdrawMoneyForManagedAccountRequest$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ADD;
            }
            if (i != 2) {
                return null;
            }
            return WITHDRAW;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddOrWithdrawMoneyForManagedAccountRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountRequest$Companion$ADAPTER$1
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
                        return new AddOrWithdrawMoneyForManagedAccountRequest((String) obj, (Money) obj2, (String) obj3, (AddOrWithdrawMoneyForManagedAccountRequest.Action) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = AddOrWithdrawMoneyForManagedAccountRequest.Action.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = (AddOrWithdrawMoneyForManagedAccountRequest) obj;
                reverseProtoWriter.getClass();
                addOrWithdrawMoneyForManagedAccountRequest.getClass();
                reverseProtoWriter.writeBytes(addOrWithdrawMoneyForManagedAccountRequest.unknownFields());
                AddOrWithdrawMoneyForManagedAccountRequest.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, addOrWithdrawMoneyForManagedAccountRequest.action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, addOrWithdrawMoneyForManagedAccountRequest.sender_instrument_token);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addOrWithdrawMoneyForManagedAccountRequest.amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, addOrWithdrawMoneyForManagedAccountRequest.external_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = (AddOrWithdrawMoneyForManagedAccountRequest) obj;
                addOrWithdrawMoneyForManagedAccountRequest.getClass();
                int size$okio = addOrWithdrawMoneyForManagedAccountRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return AddOrWithdrawMoneyForManagedAccountRequest.Action.ADAPTER.encodedSizeWithTag(4, addOrWithdrawMoneyForManagedAccountRequest.action) + protoAdapter2.encodedSizeWithTag(3, addOrWithdrawMoneyForManagedAccountRequest.sender_instrument_token) + Money.ADAPTER.encodedSizeWithTag(2, addOrWithdrawMoneyForManagedAccountRequest.amount) + protoAdapter2.encodedSizeWithTag(1, addOrWithdrawMoneyForManagedAccountRequest.external_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = (AddOrWithdrawMoneyForManagedAccountRequest) obj;
                addOrWithdrawMoneyForManagedAccountRequest.getClass();
                Money money = addOrWithdrawMoneyForManagedAccountRequest.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = addOrWithdrawMoneyForManagedAccountRequest.external_id;
                String str2 = addOrWithdrawMoneyForManagedAccountRequest.sender_instrument_token;
                AddOrWithdrawMoneyForManagedAccountRequest.Action action = addOrWithdrawMoneyForManagedAccountRequest.action;
                byteString.getClass();
                return new AddOrWithdrawMoneyForManagedAccountRequest(str, money2, str2, action, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = (AddOrWithdrawMoneyForManagedAccountRequest) obj;
                addOrWithdrawMoneyForManagedAccountRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, addOrWithdrawMoneyForManagedAccountRequest.external_id);
                Money.ADAPTER.encodeWithTag(protoWriter, 2, addOrWithdrawMoneyForManagedAccountRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 3, addOrWithdrawMoneyForManagedAccountRequest.sender_instrument_token);
                AddOrWithdrawMoneyForManagedAccountRequest.Action.ADAPTER.encodeWithTag(protoWriter, 4, addOrWithdrawMoneyForManagedAccountRequest.action);
                protoWriter.writeBytes(addOrWithdrawMoneyForManagedAccountRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddOrWithdrawMoneyForManagedAccountRequest(String str, Money money, String str2, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.external_id = str;
        this.amount = money;
        this.sender_instrument_token = str2;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddOrWithdrawMoneyForManagedAccountRequest)) {
            return false;
        }
        AddOrWithdrawMoneyForManagedAccountRequest addOrWithdrawMoneyForManagedAccountRequest = (AddOrWithdrawMoneyForManagedAccountRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addOrWithdrawMoneyForManagedAccountRequest.unknownFields()) && Intrinsics.areEqual(this.external_id, addOrWithdrawMoneyForManagedAccountRequest.external_id) && Intrinsics.areEqual(this.amount, addOrWithdrawMoneyForManagedAccountRequest.amount) && Intrinsics.areEqual(this.sender_instrument_token, addOrWithdrawMoneyForManagedAccountRequest.sender_instrument_token) && this.action == addOrWithdrawMoneyForManagedAccountRequest.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.sender_instrument_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(18);
        builder.item_variable = this.external_id;
        builder.collection = this.amount;
        builder.template = this.sender_instrument_token;
        builder.source = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str2 = this.sender_instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_instrument_token=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddOrWithdrawMoneyForManagedAccountRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AddOrWithdrawMoneyForManagedAccountRequest(String str, Money money, String str2, Action action) {
        this(str, money, str2, action, ByteString.EMPTY);
    }
}
