package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.profiles.ProfileDetails;
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
public final class FamilyAccountsUnlockIssuedCardsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamilyAccountsUnlockIssuedCardsRequest> CREATOR;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FamilyAccountsUnlockIssuedCardsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postcard.app.FamilyAccountsUnlockIssuedCardsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new FamilyAccountsUnlockIssuedCardsRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest = (FamilyAccountsUnlockIssuedCardsRequest) obj;
                reverseProtoWriter.getClass();
                familyAccountsUnlockIssuedCardsRequest.getClass();
                reverseProtoWriter.writeBytes(familyAccountsUnlockIssuedCardsRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, familyAccountsUnlockIssuedCardsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest = (FamilyAccountsUnlockIssuedCardsRequest) obj;
                familyAccountsUnlockIssuedCardsRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, familyAccountsUnlockIssuedCardsRequest.customer_token) + familyAccountsUnlockIssuedCardsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest = (FamilyAccountsUnlockIssuedCardsRequest) obj;
                familyAccountsUnlockIssuedCardsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = familyAccountsUnlockIssuedCardsRequest.customer_token;
                byteString.getClass();
                return new FamilyAccountsUnlockIssuedCardsRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest = (FamilyAccountsUnlockIssuedCardsRequest) obj;
                familyAccountsUnlockIssuedCardsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, familyAccountsUnlockIssuedCardsRequest.customer_token);
                protoWriter.writeBytes(familyAccountsUnlockIssuedCardsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyAccountsUnlockIssuedCardsRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyAccountsUnlockIssuedCardsRequest)) {
            return false;
        }
        FamilyAccountsUnlockIssuedCardsRequest familyAccountsUnlockIssuedCardsRequest = (FamilyAccountsUnlockIssuedCardsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), familyAccountsUnlockIssuedCardsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, familyAccountsUnlockIssuedCardsRequest.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileDetails.Builder builder = new ProfileDetails.Builder(5);
        builder.bio = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamilyAccountsUnlockIssuedCardsRequest{", "}", 0, null, null, 56);
    }
}
