package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class BalanceSnapshot extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BalanceSnapshot> CREATOR;
    public final Money balance;
    public final String instrument_token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1396type;
    public final Long version;

    /* loaded from: classes8.dex */
    public enum Type implements WireEnum {
        PRIMARY(1),
        SECONDARY(2);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final BalanceSnapshot$Type$Companion$ADAPTER$1 ADAPTER = new BalanceSnapshot$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PRIMARY;
            }
            if (i != 2) {
                return null;
            }
            return SECONDARY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BalanceSnapshot.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.ui.BalanceSnapshot$Companion$ADAPTER$1
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
                        return new BalanceSnapshot((String) obj, (Long) obj2, (Money) obj3, (BalanceSnapshot.Type) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = BalanceSnapshot.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                reverseProtoWriter.getClass();
                balanceSnapshot.getClass();
                reverseProtoWriter.writeBytes(balanceSnapshot.unknownFields());
                BalanceSnapshot.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 4, balanceSnapshot.f1396type);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, balanceSnapshot.balance);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, balanceSnapshot.version);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, balanceSnapshot.instrument_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                balanceSnapshot.getClass();
                return BalanceSnapshot.Type.ADAPTER.encodedSizeWithTag(4, balanceSnapshot.f1396type) + Money.ADAPTER.encodedSizeWithTag(3, balanceSnapshot.balance) + ProtoAdapter.INT64.encodedSizeWithTag(2, balanceSnapshot.version) + ProtoAdapter.STRING.encodedSizeWithTag(1, balanceSnapshot.instrument_token) + balanceSnapshot.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                balanceSnapshot.getClass();
                Money money = balanceSnapshot.balance;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = balanceSnapshot.instrument_token;
                Long l = balanceSnapshot.version;
                BalanceSnapshot.Type type2 = balanceSnapshot.f1396type;
                byteString.getClass();
                return new BalanceSnapshot(str, l, money2, type2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                balanceSnapshot.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, balanceSnapshot.instrument_token);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, balanceSnapshot.version);
                Money.ADAPTER.encodeWithTag(protoWriter, 3, balanceSnapshot.balance);
                BalanceSnapshot.Type.ADAPTER.encodeWithTag(protoWriter, 4, balanceSnapshot.f1396type);
                protoWriter.writeBytes(balanceSnapshot.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceSnapshot(String str, Long l, Money money, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_token = str;
        this.version = l;
        this.balance = money;
        this.f1396type = type2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceSnapshot)) {
            return false;
        }
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
        return Intrinsics.areEqual(unknownFields(), balanceSnapshot.unknownFields()) && Intrinsics.areEqual(this.instrument_token, balanceSnapshot.instrument_token) && Intrinsics.areEqual(this.version, balanceSnapshot.version) && Intrinsics.areEqual(this.balance, balanceSnapshot.balance) && this.f1396type == balanceSnapshot.f1396type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.balance;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Type type2 = this.f1396type;
        int hashCode5 = hashCode4 + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(6);
        builder.account = this.instrument_token;
        builder.enabled = this.version;
        builder.button = this.balance;
        builder.dda_form = this.f1396type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Money money = this.balance;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("balance=", money, arrayList);
        }
        Type type2 = this.f1396type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceSnapshot{", "}", 0, null, null, 56);
    }
}
