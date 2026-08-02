package com.squareup.protos.common.signing;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SigningData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SigningData> CREATOR;
    public final Integer serialization_version;
    public final ByteString serialized_outer_proto;
    public final zzms signature_data;

    public final class AssertionSigningData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AssertionSigningData> CREATOR;
        public final ByteString assertion_payload;
        public final ByteString attestation_payload;
        public final String key_identifier;

        static {
            SigningData$AssertionSigningData$Companion$ADAPTER$1 signingData$AssertionSigningData$Companion$ADAPTER$1 = new SigningData$AssertionSigningData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AssertionSigningData.class), "type.googleapis.com/squareup.common.signing.SigningData.AssertionSigningData", Syntax.PROTO_2, null, "squareup/common/signing.proto");
            ADAPTER = signingData$AssertionSigningData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(signingData$AssertionSigningData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssertionSigningData(String str, ByteString byteString, ByteString byteString2, ByteString byteString3) {
            super(ADAPTER, byteString3);
            byteString3.getClass();
            this.key_identifier = str;
            this.assertion_payload = byteString;
            this.attestation_payload = byteString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssertionSigningData)) {
                return false;
            }
            AssertionSigningData assertionSigningData = (AssertionSigningData) obj;
            return Intrinsics.areEqual(unknownFields(), assertionSigningData.unknownFields()) && Intrinsics.areEqual(this.key_identifier, assertionSigningData.key_identifier) && Intrinsics.areEqual(this.assertion_payload, assertionSigningData.assertion_payload) && Intrinsics.areEqual(this.attestation_payload, assertionSigningData.attestation_payload);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.key_identifier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ByteString byteString = this.assertion_payload;
            int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
            ByteString byteString2 = this.attestation_payload;
            int hashCode4 = hashCode3 + (byteString2 != null ? byteString2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAlias.Builder builder = new UiAlias.Builder(8);
            builder.canonical_text = this.key_identifier;
            builder.f1364type = this.assertion_payload;
            builder.formatted = this.attestation_payload;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.key_identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key_identifier=", arrayList);
            }
            ByteString byteString = this.assertion_payload;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("assertion_payload=", byteString, arrayList);
            }
            ByteString byteString2 = this.attestation_payload;
            if (byteString2 != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("attestation_payload=", byteString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AssertionSigningData{", "}", 0, null, null, 56);
        }
    }

    static {
        SigningData$Companion$ADAPTER$1 signingData$Companion$ADAPTER$1 = new SigningData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SigningData.class), "type.googleapis.com/squareup.common.signing.SigningData", Syntax.PROTO_2, null, "squareup/common/signing.proto");
        ADAPTER = signingData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(signingData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SigningData(Integer num, ByteString byteString, zzms zzmsVar, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.serialization_version = num;
        this.serialized_outer_proto = byteString;
        this.signature_data = zzmsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SigningData)) {
            return false;
        }
        SigningData signingData = (SigningData) obj;
        return Intrinsics.areEqual(unknownFields(), signingData.unknownFields()) && Intrinsics.areEqual(this.serialization_version, signingData.serialization_version) && Intrinsics.areEqual(this.serialized_outer_proto, signingData.serialized_outer_proto) && Intrinsics.areEqual(this.signature_data, signingData.signature_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.serialization_version;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ByteString byteString = this.serialized_outer_proto;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        zzms zzmsVar = this.signature_data;
        int hashCode4 = hashCode3 + (zzmsVar != null ? zzmsVar.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(9);
        builder.f1364type = this.serialization_version;
        builder.canonical_text = this.serialized_outer_proto;
        builder.formatted = this.signature_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.serialization_version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("serialization_version=", num, arrayList);
        }
        ByteString byteString = this.serialized_outer_proto;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("serialized_outer_proto=", byteString, arrayList);
        }
        zzms zzmsVar = this.signature_data;
        if (zzmsVar != null) {
            arrayList.add("signature_data=" + zzmsVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SigningData{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SigningData(ByteString byteString, SigningData$SignatureData$AttestedKey signingData$SignatureData$AttestedKey) {
        this(1, byteString, signingData$SignatureData$AttestedKey, ByteString.EMPTY);
    }

    public final class AttestedKeySigningData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AttestedKeySigningData> CREATOR;
        public final List certificate_chain;
        public final AttestedKeyClientError client_error;
        public final String key_alias;
        public final ByteString signature;

        static {
            SigningData$AttestedKeySigningData$Companion$ADAPTER$1 signingData$AttestedKeySigningData$Companion$ADAPTER$1 = new SigningData$AttestedKeySigningData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AttestedKeySigningData.class), "type.googleapis.com/squareup.common.signing.SigningData.AttestedKeySigningData", Syntax.PROTO_2, null, "squareup/common/signing.proto");
            ADAPTER = signingData$AttestedKeySigningData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(signingData$AttestedKeySigningData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttestedKeySigningData(ByteString byteString, String str, List list, AttestedKeyClientError attestedKeyClientError, ByteString byteString2) {
            super(ADAPTER, byteString2);
            list.getClass();
            byteString2.getClass();
            this.signature = byteString;
            this.key_alias = str;
            this.client_error = attestedKeyClientError;
            this.certificate_chain = TransactorKt.immutableCopyOf("certificate_chain", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AttestedKeySigningData)) {
                return false;
            }
            AttestedKeySigningData attestedKeySigningData = (AttestedKeySigningData) obj;
            return Intrinsics.areEqual(unknownFields(), attestedKeySigningData.unknownFields()) && Intrinsics.areEqual(this.signature, attestedKeySigningData.signature) && Intrinsics.areEqual(this.key_alias, attestedKeySigningData.key_alias) && Intrinsics.areEqual(this.certificate_chain, attestedKeySigningData.certificate_chain) && Intrinsics.areEqual(this.client_error, attestedKeySigningData.client_error);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ByteString byteString = this.signature;
            int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
            String str = this.key_alias;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.certificate_chain);
            AttestedKeyClientError attestedKeyClientError = this.client_error;
            int hashCode3 = m + (attestedKeyClientError != null ? attestedKeyClientError.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ColoredButton.Builder builder = new ColoredButton.Builder(10);
            builder.button_color = this.signature;
            builder.text_color = this.key_alias;
            builder.text = this.certificate_chain;
            builder.action = this.client_error;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ByteString byteString = this.signature;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("signature=", byteString, arrayList);
            }
            String str = this.key_alias;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key_alias=", arrayList);
            }
            List list = this.certificate_chain;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("certificate_chain=", arrayList, list);
            }
            AttestedKeyClientError attestedKeyClientError = this.client_error;
            if (attestedKeyClientError != null) {
                arrayList.add("client_error=" + attestedKeyClientError);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AttestedKeySigningData{", "}", 0, null, null, 56);
        }

        public AttestedKeySigningData(ByteString byteString, String str, List list, AttestedKeyClientError attestedKeyClientError) {
            this(byteString, str, list, attestedKeyClientError, ByteString.EMPTY);
        }
    }
}
