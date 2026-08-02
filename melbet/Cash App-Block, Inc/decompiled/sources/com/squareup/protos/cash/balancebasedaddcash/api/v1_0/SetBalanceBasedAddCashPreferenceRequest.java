package com.squareup.protos.cash.balancebasedaddcash.api.v1_0;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.local.primitives.CartEntryWithQuantityKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.protos.common.Money;
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
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftUsage;

/* loaded from: classes.dex */
public final class SetBalanceBasedAddCashPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetBalanceBasedAddCashPreferenceRequest> CREATOR;
    public final CartEntryWithQuantityKt preference;
    public final RequestContext request_context;

    /* loaded from: classes7.dex */
    public final class Disabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disabled> CREATOR;

        static {
            SetBalanceBasedAddCashPreferenceRequest$Disabled$Companion$ADAPTER$1 setBalanceBasedAddCashPreferenceRequest$Disabled$Companion$ADAPTER$1 = new SetBalanceBasedAddCashPreferenceRequest$Disabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disabled.class), "type.googleapis.com/squareup.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest.Disabled", Syntax.PROTO_2, null, "squareup/cash/balancebasedaddcash/api/v1_0/BalanceBasedAddCashPreference.proto");
            ADAPTER = setBalanceBasedAddCashPreferenceRequest$Disabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(setBalanceBasedAddCashPreferenceRequest$Disabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disabled(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Disabled) && Intrinsics.areEqual(unknownFields(), ((Disabled) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(17);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Disabled{}";
        }
    }

    /* loaded from: classes7.dex */
    public final class Enabled extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Enabled> CREATOR;
        public final Money increment_amount;
        public final Money minimum_balance_amount;

        static {
            SetBalanceBasedAddCashPreferenceRequest$Enabled$Companion$ADAPTER$1 setBalanceBasedAddCashPreferenceRequest$Enabled$Companion$ADAPTER$1 = new SetBalanceBasedAddCashPreferenceRequest$Enabled$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Enabled.class), "type.googleapis.com/squareup.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest.Enabled", Syntax.PROTO_2, null, "squareup/cash/balancebasedaddcash/api/v1_0/BalanceBasedAddCashPreference.proto");
            ADAPTER = setBalanceBasedAddCashPreferenceRequest$Enabled$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(setBalanceBasedAddCashPreferenceRequest$Enabled$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enabled(Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.minimum_balance_amount = money;
            this.increment_amount = money2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) obj;
            return Intrinsics.areEqual(unknownFields(), enabled.unknownFields()) && Intrinsics.areEqual(this.minimum_balance_amount, enabled.minimum_balance_amount) && Intrinsics.areEqual(this.increment_amount, enabled.increment_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.minimum_balance_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.increment_amount;
            int hashCode3 = hashCode2 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OverdraftUsage.Builder builder = new OverdraftUsage.Builder(1);
            builder.limit = this.minimum_balance_amount;
            builder.usage = this.increment_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.minimum_balance_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum_balance_amount=", money, arrayList);
            }
            Money money2 = this.increment_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("increment_amount=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Enabled{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetBalanceBasedAddCashPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                CartEntryWithQuantityKt cartEntryWithQuantityKt = null;
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetBalanceBasedAddCashPreferenceRequest(cartEntryWithQuantityKt, (RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        cartEntryWithQuantityKt = new SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled((SetBalanceBasedAddCashPreferenceRequest.Enabled) SetBalanceBasedAddCashPreferenceRequest.Enabled.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        cartEntryWithQuantityKt = new SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled((SetBalanceBasedAddCashPreferenceRequest.Disabled) SetBalanceBasedAddCashPreferenceRequest.Disabled.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest = (SetBalanceBasedAddCashPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                setBalanceBasedAddCashPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(setBalanceBasedAddCashPreferenceRequest.unknownFields());
                CartEntryWithQuantityKt cartEntryWithQuantityKt = setBalanceBasedAddCashPreferenceRequest.preference;
                if (cartEntryWithQuantityKt instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) {
                    SetBalanceBasedAddCashPreferenceRequest.Enabled.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) cartEntryWithQuantityKt).value);
                } else if (cartEntryWithQuantityKt instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) {
                    SetBalanceBasedAddCashPreferenceRequest.Disabled.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) cartEntryWithQuantityKt).value);
                } else if (cartEntryWithQuantityKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setBalanceBasedAddCashPreferenceRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest = (SetBalanceBasedAddCashPreferenceRequest) obj;
                setBalanceBasedAddCashPreferenceRequest.getClass();
                int size$okio = setBalanceBasedAddCashPreferenceRequest.unknownFields().getSize$okio();
                CartEntryWithQuantityKt cartEntryWithQuantityKt = setBalanceBasedAddCashPreferenceRequest.preference;
                if (cartEntryWithQuantityKt instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) {
                    encodedSizeWithTag = SetBalanceBasedAddCashPreferenceRequest.Enabled.ADAPTER.encodedSizeWithTag(1, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) cartEntryWithQuantityKt).value);
                } else {
                    if (!(cartEntryWithQuantityKt instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled)) {
                        if (cartEntryWithQuantityKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return RequestContext.ADAPTER.encodedSizeWithTag(3, setBalanceBasedAddCashPreferenceRequest.request_context) + size$okio;
                    }
                    encodedSizeWithTag = SetBalanceBasedAddCashPreferenceRequest.Disabled.ADAPTER.encodedSizeWithTag(2, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) cartEntryWithQuantityKt).value);
                }
                size$okio += encodedSizeWithTag;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, setBalanceBasedAddCashPreferenceRequest.request_context) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest = (SetBalanceBasedAddCashPreferenceRequest) obj;
                setBalanceBasedAddCashPreferenceRequest.getClass();
                RequestContext requestContext = setBalanceBasedAddCashPreferenceRequest.request_context;
                return SetBalanceBasedAddCashPreferenceRequest.copy$default(setBalanceBasedAddCashPreferenceRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest = (SetBalanceBasedAddCashPreferenceRequest) obj;
                setBalanceBasedAddCashPreferenceRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, setBalanceBasedAddCashPreferenceRequest.request_context);
                CartEntryWithQuantityKt cartEntryWithQuantityKt = setBalanceBasedAddCashPreferenceRequest.preference;
                if (cartEntryWithQuantityKt instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) {
                    SetBalanceBasedAddCashPreferenceRequest.Enabled.ADAPTER.encodeWithTag(protoWriter, 1, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled) cartEntryWithQuantityKt).value);
                } else if (cartEntryWithQuantityKt instanceof SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) {
                    SetBalanceBasedAddCashPreferenceRequest.Disabled.ADAPTER.encodeWithTag(protoWriter, 2, ((SetBalanceBasedAddCashPreferenceRequest$Preference$Disabled) cartEntryWithQuantityKt).value);
                } else if (cartEntryWithQuantityKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(setBalanceBasedAddCashPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetBalanceBasedAddCashPreferenceRequest(CartEntryWithQuantityKt cartEntryWithQuantityKt, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.preference = cartEntryWithQuantityKt;
        this.request_context = requestContext;
    }

    public static SetBalanceBasedAddCashPreferenceRequest copy$default(SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest, RequestContext requestContext, ByteString byteString, int i) {
        CartEntryWithQuantityKt cartEntryWithQuantityKt = setBalanceBasedAddCashPreferenceRequest.preference;
        if ((i & 4) != 0) {
            byteString = setBalanceBasedAddCashPreferenceRequest.unknownFields();
        }
        setBalanceBasedAddCashPreferenceRequest.getClass();
        byteString.getClass();
        return new SetBalanceBasedAddCashPreferenceRequest(cartEntryWithQuantityKt, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetBalanceBasedAddCashPreferenceRequest)) {
            return false;
        }
        SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest = (SetBalanceBasedAddCashPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setBalanceBasedAddCashPreferenceRequest.unknownFields()) && Intrinsics.areEqual(this.preference, setBalanceBasedAddCashPreferenceRequest.preference) && Intrinsics.areEqual(this.request_context, setBalanceBasedAddCashPreferenceRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CartEntryWithQuantityKt cartEntryWithQuantityKt = this.preference;
        int hashCode2 = (hashCode + (cartEntryWithQuantityKt != null ? cartEntryWithQuantityKt.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(3);
        builder.errors = this.preference;
        builder.result = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CartEntryWithQuantityKt cartEntryWithQuantityKt = this.preference;
        if (cartEntryWithQuantityKt != null) {
            arrayList.add("preference=" + cartEntryWithQuantityKt);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetBalanceBasedAddCashPreferenceRequest{", "}", 0, null, null, 56);
    }
}
