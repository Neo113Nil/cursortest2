package com.squareup.protos.cash.plasma.common;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.common.Header;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DigitalWalletSelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DigitalWalletSelectionOption> CREATOR;
    public final zzkh additional_params;
    public final InstrumentLink instrument_link;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1326type;

    public final class ApplePayPayload extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ApplePayPayload> CREATOR;
        public final String data;
        public final Header header;
        public final String signature;
        public final String version;

        public final class Header extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Header> CREATOR;
            public final String application_data;
            public final String ephemeral_public_key;
            public final String public_key_hash;
            public final String transaction_id;
            public final String wrapped_key;

            static {
                DigitalWalletSelectionOption$ApplePayPayload$Header$Companion$ADAPTER$1 digitalWalletSelectionOption$ApplePayPayload$Header$Companion$ADAPTER$1 = new DigitalWalletSelectionOption$ApplePayPayload$Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.cash.plasma.common.DigitalWalletSelectionOption.ApplePayPayload.Header", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
                ADAPTER = digitalWalletSelectionOption$ApplePayPayload$Header$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletSelectionOption$ApplePayPayload$Header$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.application_data = str;
                this.ephemeral_public_key = str2;
                this.wrapped_key = str3;
                this.public_key_hash = str4;
                this.transaction_id = str5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.application_data, header.application_data) && Intrinsics.areEqual(this.ephemeral_public_key, header.ephemeral_public_key) && Intrinsics.areEqual(this.wrapped_key, header.wrapped_key) && Intrinsics.areEqual(this.public_key_hash, header.public_key_hash) && Intrinsics.areEqual(this.transaction_id, header.transaction_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.application_data;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.ephemeral_public_key;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.wrapped_key;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.public_key_hash;
                int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                String str5 = this.transaction_id;
                int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ProfileRow.Builder builder = new ProfileRow.Builder(8);
                builder.client_route = this.application_data;
                builder.icon_id = this.ephemeral_public_key;
                builder.title = this.wrapped_key;
                builder.subtitle = this.public_key_hash;
                builder.call_to_action = this.transaction_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.application_data;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "application_data=", arrayList);
                }
                String str2 = this.ephemeral_public_key;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ephemeral_public_key=", arrayList);
                }
                String str3 = this.wrapped_key;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "wrapped_key=", arrayList);
                }
                String str4 = this.public_key_hash;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "public_key_hash=", arrayList);
                }
                String str5 = this.transaction_id;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "transaction_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
            }
        }

        static {
            DigitalWalletSelectionOption$ApplePayPayload$Companion$ADAPTER$1 digitalWalletSelectionOption$ApplePayPayload$Companion$ADAPTER$1 = new DigitalWalletSelectionOption$ApplePayPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ApplePayPayload.class), "type.googleapis.com/squareup.cash.plasma.common.DigitalWalletSelectionOption.ApplePayPayload", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
            ADAPTER = digitalWalletSelectionOption$ApplePayPayload$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletSelectionOption$ApplePayPayload$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplePayPayload(String str, Header header, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.data = str;
            this.header = header;
            this.signature = str2;
            this.version = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApplePayPayload)) {
                return false;
            }
            ApplePayPayload applePayPayload = (ApplePayPayload) obj;
            return Intrinsics.areEqual(unknownFields(), applePayPayload.unknownFields()) && Intrinsics.areEqual(this.data, applePayPayload.data) && Intrinsics.areEqual(this.header, applePayPayload.header) && Intrinsics.areEqual(this.signature, applePayPayload.signature) && Intrinsics.areEqual(this.version, applePayPayload.version);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.data;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Header header = this.header;
            int hashCode3 = (hashCode2 + (header != null ? header.hashCode() : 0)) * 37;
            String str2 = this.signature;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.version;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Allowed.Builder builder = new Allowed.Builder(5);
            builder.customer_token_hash_email = this.data;
            builder.card_encryption_data = this.header;
            builder.device_metadata = this.signature;
            builder.success_screen = this.version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.data;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "data=", arrayList);
            }
            Header header = this.header;
            if (header != null) {
                arrayList.add("header=" + header);
            }
            String str2 = this.signature;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "signature=", arrayList);
            }
            String str3 = this.version;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "version=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ApplePayPayload{", "}", 0, null, null, 56);
        }
    }

    public final class GooglePayPayload extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GooglePayPayload> CREATOR;
        public final String idempotence_token;
        public final String token;

        static {
            DigitalWalletSelectionOption$GooglePayPayload$Companion$ADAPTER$1 digitalWalletSelectionOption$GooglePayPayload$Companion$ADAPTER$1 = new DigitalWalletSelectionOption$GooglePayPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GooglePayPayload.class), "type.googleapis.com/squareup.cash.plasma.common.DigitalWalletSelectionOption.GooglePayPayload", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
            ADAPTER = digitalWalletSelectionOption$GooglePayPayload$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletSelectionOption$GooglePayPayload$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayPayload(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.idempotence_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GooglePayPayload)) {
                return false;
            }
            GooglePayPayload googlePayPayload = (GooglePayPayload) obj;
            return Intrinsics.areEqual(unknownFields(), googlePayPayload.unknownFields()) && Intrinsics.areEqual(this.token, googlePayPayload.token) && Intrinsics.areEqual(this.idempotence_token, googlePayPayload.idempotence_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.idempotence_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(5);
            builder.name = this.token;
            builder.value = this.idempotence_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            String str2 = this.idempotence_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotence_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GooglePayPayload{", "}", 0, null, null, 56);
        }
    }

    public final class InstrumentLink extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstrumentLink> CREATOR;
        public final String finplat_instrument_token;
        public final CashInstrumentType instrument_type;
        public final String owner_token;

        static {
            DigitalWalletSelectionOption$InstrumentLink$Companion$ADAPTER$1 digitalWalletSelectionOption$InstrumentLink$Companion$ADAPTER$1 = new DigitalWalletSelectionOption$InstrumentLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentLink.class), "type.googleapis.com/squareup.cash.plasma.common.DigitalWalletSelectionOption.InstrumentLink", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
            ADAPTER = digitalWalletSelectionOption$InstrumentLink$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletSelectionOption$InstrumentLink$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentLink(String str, CashInstrumentType cashInstrumentType, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.finplat_instrument_token = str;
            this.instrument_type = cashInstrumentType;
            this.owner_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstrumentLink)) {
                return false;
            }
            InstrumentLink instrumentLink = (InstrumentLink) obj;
            return Intrinsics.areEqual(unknownFields(), instrumentLink.unknownFields()) && Intrinsics.areEqual(this.finplat_instrument_token, instrumentLink.finplat_instrument_token) && this.instrument_type == instrumentLink.instrument_type && Intrinsics.areEqual(this.owner_token, instrumentLink.owner_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.finplat_instrument_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            CashInstrumentType cashInstrumentType = this.instrument_type;
            int hashCode3 = (hashCode2 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
            String str2 = this.owner_token;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardScheme.Builder builder = new CardScheme.Builder(1);
            builder.modules = this.finplat_instrument_token;
            builder.overflow_modules = this.instrument_type;
            builder.card_home_actions = this.owner_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.finplat_instrument_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "finplat_instrument_token=", arrayList);
            }
            CashInstrumentType cashInstrumentType = this.instrument_type;
            if (cashInstrumentType != null) {
                arrayList.add("instrument_type=" + cashInstrumentType);
            }
            String str2 = this.owner_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "owner_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLink{", "}", 0, null, null, 56);
        }
    }

    public enum Type implements WireEnum {
        APPLE_PAY(1),
        GOOGLE_PAY(2);

        public final int value;
        public static final TaxEnvironment.Companion Companion = new TaxEnvironment.Companion();
        public static final DigitalWalletSelectionOption$Type$Companion$ADAPTER$1 ADAPTER = new DigitalWalletSelectionOption$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return APPLE_PAY;
            }
            if (i != 2) {
                return null;
            }
            return GOOGLE_PAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DigitalWalletSelectionOption$Companion$ADAPTER$1 digitalWalletSelectionOption$Companion$ADAPTER$1 = new DigitalWalletSelectionOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DigitalWalletSelectionOption.class), "type.googleapis.com/squareup.cash.plasma.common.DigitalWalletSelectionOption", Syntax.PROTO_2, null, "squareup/cash/plasma/common/InstrumentSelectionOption.proto");
        ADAPTER = digitalWalletSelectionOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(digitalWalletSelectionOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalWalletSelectionOption(Type type2, zzkh zzkhVar, InstrumentLink instrumentLink, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1326type = type2;
        this.additional_params = zzkhVar;
        this.instrument_link = instrumentLink;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DigitalWalletSelectionOption)) {
            return false;
        }
        DigitalWalletSelectionOption digitalWalletSelectionOption = (DigitalWalletSelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), digitalWalletSelectionOption.unknownFields()) && this.f1326type == digitalWalletSelectionOption.f1326type && Intrinsics.areEqual(this.additional_params, digitalWalletSelectionOption.additional_params) && Intrinsics.areEqual(this.instrument_link, digitalWalletSelectionOption.instrument_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1326type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        zzkh zzkhVar = this.additional_params;
        int hashCode3 = (hashCode2 + (zzkhVar != null ? zzkhVar.hashCode() : 0)) * 37;
        InstrumentLink instrumentLink = this.instrument_link;
        int hashCode4 = hashCode3 + (instrumentLink != null ? instrumentLink.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(29, false);
        builder.advertisement_data = this.f1326type;
        builder.transmission_level = this.additional_params;
        builder.frequency = this.instrument_link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1326type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        zzkh zzkhVar = this.additional_params;
        if (zzkhVar != null) {
            arrayList.add("additional_params=" + zzkhVar);
        }
        InstrumentLink instrumentLink = this.instrument_link;
        if (instrumentLink != null) {
            arrayList.add("instrument_link=" + instrumentLink);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigitalWalletSelectionOption{", "}", 0, null, null, 56);
    }
}
