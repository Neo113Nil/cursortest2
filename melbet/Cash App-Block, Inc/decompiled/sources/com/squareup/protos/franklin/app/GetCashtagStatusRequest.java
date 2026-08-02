package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.GetCashtagStatusRequest;
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
public final class GetCashtagStatusRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCashtagStatusRequest> CREATOR;
    public final String cashtag_candidate;
    public final CashtagRestriction cashtag_restriction;

    /* loaded from: classes8.dex */
    public enum CashtagRestriction implements WireEnum {
        DEFAULT(0),
        NO_CASHTAG_REUSE(1);

        public static final GetCashtagStatusRequest$CashtagRestriction$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            CashtagRestriction cashtagRestriction = DEFAULT;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new GetCashtagStatusRequest$CashtagRestriction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CashtagRestriction.class), Syntax.PROTO_2, cashtagRestriction);
        }

        CashtagRestriction(int i) {
            this.value = i;
        }

        public static final CashtagRestriction fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return NO_CASHTAG_REUSE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetCashtagStatusRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetCashtagStatusRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetCashtagStatusRequest((String) obj, (GetCashtagStatusRequest.CashtagRestriction) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = GetCashtagStatusRequest.CashtagRestriction.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetCashtagStatusRequest getCashtagStatusRequest = (GetCashtagStatusRequest) obj;
                reverseProtoWriter.getClass();
                getCashtagStatusRequest.getClass();
                reverseProtoWriter.writeBytes(getCashtagStatusRequest.unknownFields());
                GetCashtagStatusRequest.CashtagRestriction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getCashtagStatusRequest.cashtag_restriction);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getCashtagStatusRequest.cashtag_candidate);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetCashtagStatusRequest getCashtagStatusRequest = (GetCashtagStatusRequest) obj;
                getCashtagStatusRequest.getClass();
                return GetCashtagStatusRequest.CashtagRestriction.ADAPTER.encodedSizeWithTag(4, getCashtagStatusRequest.cashtag_restriction) + ProtoAdapter.STRING.encodedSizeWithTag(3, getCashtagStatusRequest.cashtag_candidate) + getCashtagStatusRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetCashtagStatusRequest getCashtagStatusRequest = (GetCashtagStatusRequest) obj;
                getCashtagStatusRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                GetCashtagStatusRequest.CashtagRestriction cashtagRestriction = getCashtagStatusRequest.cashtag_restriction;
                byteString.getClass();
                return new GetCashtagStatusRequest((String) null, cashtagRestriction, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetCashtagStatusRequest getCashtagStatusRequest = (GetCashtagStatusRequest) obj;
                getCashtagStatusRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getCashtagStatusRequest.cashtag_candidate);
                GetCashtagStatusRequest.CashtagRestriction.ADAPTER.encodeWithTag(protoWriter, 4, getCashtagStatusRequest.cashtag_restriction);
                protoWriter.writeBytes(getCashtagStatusRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashtagStatusRequest(String str, CashtagRestriction cashtagRestriction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cashtag_candidate = str;
        this.cashtag_restriction = cashtagRestriction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCashtagStatusRequest)) {
            return false;
        }
        GetCashtagStatusRequest getCashtagStatusRequest = (GetCashtagStatusRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getCashtagStatusRequest.unknownFields()) && Intrinsics.areEqual(this.cashtag_candidate, getCashtagStatusRequest.cashtag_candidate) && this.cashtag_restriction == getCashtagStatusRequest.cashtag_restriction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cashtag_candidate;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CashtagRestriction cashtagRestriction = this.cashtag_restriction;
        int hashCode3 = hashCode2 + (cashtagRestriction != null ? cashtagRestriction.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(14);
        builder.strings = this.cashtag_candidate;
        builder.recurring_deposits_dda_upsell = this.cashtag_restriction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cashtag_candidate != null) {
            arrayList.add("cashtag_candidate=██");
        }
        CashtagRestriction cashtagRestriction = this.cashtag_restriction;
        if (cashtagRestriction != null) {
            arrayList.add("cashtag_restriction=" + cashtagRestriction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCashtagStatusRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GetCashtagStatusRequest(String str, CashtagRestriction cashtagRestriction, int i) {
        this(str, (i & 2) != 0 ? null : cashtagRestriction, ByteString.EMPTY);
    }
}
