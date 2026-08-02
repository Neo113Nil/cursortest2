package com.squareup.protos.cash.taply.app.v1;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountSubflow;
import com.squareup.protos.cash.deviceintegritly.api.AppAttestAssertion;
import com.squareup.protos.cash.disputron.core.ListClaimDSL3Data;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.protos.franklin.lending.PlasmaPrepurchaseCashCardToggleFlowParameters;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EncryptedCardData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EncryptedCardData> CREATOR;
    public final ByteString encrypted_card_info;
    public final String encrypted_ephemeral_key;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public ByteString encrypted_card_info;
        public String encrypted_ephemeral_key;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EncryptedCardData(this.encrypted_ephemeral_key, this.encrypted_card_info, buildUnknownFields());
                case 1:
                    return new LinkBankAccountSubflow(this.encrypted_ephemeral_key, this.encrypted_card_info, buildUnknownFields());
                case 2:
                    return new AppAttestAssertion(this.encrypted_ephemeral_key, this.encrypted_card_info, buildUnknownFields());
                case 3:
                    return new ListClaimDSL3Data(this.encrypted_ephemeral_key, this.encrypted_card_info, buildUnknownFields());
                case 4:
                    return new OutgoingMessage.SelectedTransaction(this.encrypted_ephemeral_key, this.encrypted_card_info, buildUnknownFields());
                default:
                    return new PlasmaPrepurchaseCashCardToggleFlowParameters(this.encrypted_ephemeral_key, this.encrypted_card_info, buildUnknownFields());
            }
        }
    }

    static {
        EncryptedCardData$Companion$ADAPTER$1 encryptedCardData$Companion$ADAPTER$1 = new EncryptedCardData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EncryptedCardData.class), "type.googleapis.com/squareup.cash.taply.app.v1beta1.EncryptedCardData", Syntax.PROTO_2, null, "squareup/cash/taply/app/v1beta1/on_fidesmo_provisioning_start.proto");
        ADAPTER = encryptedCardData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(encryptedCardData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptedCardData(String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.encrypted_ephemeral_key = str;
        this.encrypted_card_info = byteString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncryptedCardData)) {
            return false;
        }
        EncryptedCardData encryptedCardData = (EncryptedCardData) obj;
        return Intrinsics.areEqual(unknownFields(), encryptedCardData.unknownFields()) && Intrinsics.areEqual(this.encrypted_ephemeral_key, encryptedCardData.encrypted_ephemeral_key) && Intrinsics.areEqual(this.encrypted_card_info, encryptedCardData.encrypted_card_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.encrypted_ephemeral_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.encrypted_card_info;
        int hashCode3 = hashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.encrypted_ephemeral_key = this.encrypted_ephemeral_key;
        builder.encrypted_card_info = this.encrypted_card_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.encrypted_ephemeral_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "encrypted_ephemeral_key=", arrayList);
        }
        ByteString byteString = this.encrypted_card_info;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encrypted_card_info=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EncryptedCardData{", "}", 0, null, null, 56);
    }
}
