package com.squareup.protos.hieroglyph.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.hieroglyph.AndroidKeystoreCompatibilityReport;
import com.squareup.protos.hieroglyph.ClientPublicKey;
import com.squareup.protos.hieroglyph.KeyScope;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ProvisionKeysRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProvisionKeysRequest> CREATOR;
    public final ClientPublicKey client_key;
    public final AndroidKeystoreCompatibilityReport compatibility_report;
    public final String entity_identifier;
    public final List scopes;
    public final SignedSerializedMRIContext signed_mri_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ProvisionKeysRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.hieroglyph.service.ProvisionKeysRequest$Companion$ADAPTER$1
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
                        return new ProvisionKeysRequest((ClientPublicKey) obj, m, (String) obj2, (AndroidKeystoreCompatibilityReport) obj3, (SignedSerializedMRIContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ClientPublicKey.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        try {
                            KeyScope.ADAPTER.tryDecode(protoReader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(AndroidKeystoreCompatibilityReport.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(SignedSerializedMRIContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ProvisionKeysRequest provisionKeysRequest = (ProvisionKeysRequest) obj;
                reverseProtoWriter.getClass();
                provisionKeysRequest.getClass();
                reverseProtoWriter.writeBytes(provisionKeysRequest.unknownFields());
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, provisionKeysRequest.signed_mri_context);
                AndroidKeystoreCompatibilityReport.ADAPTER.encodeWithTag(reverseProtoWriter, 4, provisionKeysRequest.compatibility_report);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, provisionKeysRequest.entity_identifier);
                KeyScope.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, provisionKeysRequest.scopes);
                ClientPublicKey.ADAPTER.encodeWithTag(reverseProtoWriter, 1, provisionKeysRequest.client_key);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ProvisionKeysRequest provisionKeysRequest = (ProvisionKeysRequest) obj;
                provisionKeysRequest.getClass();
                return SignedSerializedMRIContext.ADAPTER.encodedSizeWithTag(5, provisionKeysRequest.signed_mri_context) + AndroidKeystoreCompatibilityReport.ADAPTER.encodedSizeWithTag(4, provisionKeysRequest.compatibility_report) + ProtoAdapter.STRING.encodedSizeWithTag(3, provisionKeysRequest.entity_identifier) + KeyScope.ADAPTER.asRepeated().encodedSizeWithTag(2, provisionKeysRequest.scopes) + ClientPublicKey.ADAPTER.encodedSizeWithTag(1, provisionKeysRequest.client_key) + provisionKeysRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ProvisionKeysRequest provisionKeysRequest = (ProvisionKeysRequest) obj;
                provisionKeysRequest.getClass();
                ClientPublicKey clientPublicKey = provisionKeysRequest.client_key;
                ClientPublicKey clientPublicKey2 = clientPublicKey != null ? (ClientPublicKey) ClientPublicKey.ADAPTER.redact(clientPublicKey) : null;
                AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = provisionKeysRequest.compatibility_report;
                AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport2 = androidKeystoreCompatibilityReport != null ? (AndroidKeystoreCompatibilityReport) AndroidKeystoreCompatibilityReport.ADAPTER.redact(androidKeystoreCompatibilityReport) : null;
                SignedSerializedMRIContext signedSerializedMRIContext = provisionKeysRequest.signed_mri_context;
                SignedSerializedMRIContext signedSerializedMRIContext2 = signedSerializedMRIContext != null ? (SignedSerializedMRIContext) SignedSerializedMRIContext.ADAPTER.redact(signedSerializedMRIContext) : null;
                ByteString byteString = ByteString.EMPTY;
                List list = provisionKeysRequest.scopes;
                String str = provisionKeysRequest.entity_identifier;
                list.getClass();
                byteString.getClass();
                return new ProvisionKeysRequest(clientPublicKey2, list, str, androidKeystoreCompatibilityReport2, signedSerializedMRIContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ProvisionKeysRequest provisionKeysRequest = (ProvisionKeysRequest) obj;
                provisionKeysRequest.getClass();
                ClientPublicKey.ADAPTER.encodeWithTag(protoWriter, 1, provisionKeysRequest.client_key);
                KeyScope.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, provisionKeysRequest.scopes);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, provisionKeysRequest.entity_identifier);
                AndroidKeystoreCompatibilityReport.ADAPTER.encodeWithTag(protoWriter, 4, provisionKeysRequest.compatibility_report);
                SignedSerializedMRIContext.ADAPTER.encodeWithTag(protoWriter, 5, provisionKeysRequest.signed_mri_context);
                protoWriter.writeBytes(provisionKeysRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProvisionKeysRequest(ClientPublicKey clientPublicKey, List list, String str, AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport, SignedSerializedMRIContext signedSerializedMRIContext, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.client_key = clientPublicKey;
        this.entity_identifier = str;
        this.compatibility_report = androidKeystoreCompatibilityReport;
        this.signed_mri_context = signedSerializedMRIContext;
        this.scopes = TransactorKt.immutableCopyOf("scopes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvisionKeysRequest)) {
            return false;
        }
        ProvisionKeysRequest provisionKeysRequest = (ProvisionKeysRequest) obj;
        return Intrinsics.areEqual(unknownFields(), provisionKeysRequest.unknownFields()) && Intrinsics.areEqual(this.client_key, provisionKeysRequest.client_key) && Intrinsics.areEqual(this.scopes, provisionKeysRequest.scopes) && Intrinsics.areEqual(this.entity_identifier, provisionKeysRequest.entity_identifier) && Intrinsics.areEqual(this.compatibility_report, provisionKeysRequest.compatibility_report) && Intrinsics.areEqual(this.signed_mri_context, provisionKeysRequest.signed_mri_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientPublicKey clientPublicKey = this.client_key;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (clientPublicKey != null ? clientPublicKey.hashCode() : 0)) * 37, 37, this.scopes);
        String str = this.entity_identifier;
        int hashCode2 = (m + (str != null ? str.hashCode() : 0)) * 37;
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = this.compatibility_report;
        int hashCode3 = (hashCode2 + (androidKeystoreCompatibilityReport != null ? androidKeystoreCompatibilityReport.hashCode() : 0)) * 37;
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        int hashCode4 = hashCode3 + (signedSerializedMRIContext != null ? signedSerializedMRIContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(25);
        builder.alias = this.client_key;
        builder.verified = this.scopes;
        builder.expires_at = this.entity_identifier;
        builder.version = this.compatibility_report;
        builder.display_date = this.signed_mri_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientPublicKey clientPublicKey = this.client_key;
        if (clientPublicKey != null) {
            arrayList.add("client_key=" + clientPublicKey);
        }
        List list = this.scopes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("scopes=", arrayList, list);
        }
        String str = this.entity_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_identifier=", arrayList);
        }
        AndroidKeystoreCompatibilityReport androidKeystoreCompatibilityReport = this.compatibility_report;
        if (androidKeystoreCompatibilityReport != null) {
            arrayList.add("compatibility_report=" + androidKeystoreCompatibilityReport);
        }
        SignedSerializedMRIContext signedSerializedMRIContext = this.signed_mri_context;
        if (signedSerializedMRIContext != null) {
            arrayList.add("signed_mri_context=" + signedSerializedMRIContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProvisionKeysRequest{", "}", 0, null, null, 56);
    }
}
