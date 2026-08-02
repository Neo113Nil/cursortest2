package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBuyer$LocalBuyerAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalBuyer.LocalBuyerAccount((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, m, (PreferredPaymentMethod) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    m.add(LocalPaymentMethod.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(PreferredPaymentMethod.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBuyer.LocalBuyerAccount localBuyerAccount = (LocalBuyer.LocalBuyerAccount) obj;
        reverseProtoWriter.getClass();
        localBuyerAccount.getClass();
        reverseProtoWriter.writeBytes(localBuyerAccount.unknownFields());
        PreferredPaymentMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 9, localBuyerAccount.preferred_payment_method);
        LocalPaymentMethod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, localBuyerAccount.payment_methods);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, localBuyerAccount.cashtag_with_currency_symbol);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, localBuyerAccount.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localBuyerAccount.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localBuyerAccount.sms_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localBuyerAccount.email);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localBuyerAccount.profile_picture_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localBuyerAccount.cashtag);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBuyer.LocalBuyerAccount localBuyerAccount = (LocalBuyer.LocalBuyerAccount) obj;
        localBuyerAccount.getClass();
        int size$okio = localBuyerAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return PreferredPaymentMethod.ADAPTER.encodedSizeWithTag(9, localBuyerAccount.preferred_payment_method) + LocalPaymentMethod.ADAPTER.asRepeated().encodedSizeWithTag(8, localBuyerAccount.payment_methods) + protoAdapter.encodedSizeWithTag(7, localBuyerAccount.cashtag_with_currency_symbol) + protoAdapter.encodedSizeWithTag(6, localBuyerAccount.name) + protoAdapter.encodedSizeWithTag(5, localBuyerAccount.customer_token) + protoAdapter.encodedSizeWithTag(4, localBuyerAccount.sms_number) + protoAdapter.encodedSizeWithTag(3, localBuyerAccount.email) + protoAdapter.encodedSizeWithTag(2, localBuyerAccount.profile_picture_url) + protoAdapter.encodedSizeWithTag(1, localBuyerAccount.cashtag) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBuyer.LocalBuyerAccount localBuyerAccount = (LocalBuyer.LocalBuyerAccount) obj;
        localBuyerAccount.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localBuyerAccount.payment_methods, LocalPaymentMethod.ADAPTER);
        PreferredPaymentMethod preferredPaymentMethod = localBuyerAccount.preferred_payment_method;
        PreferredPaymentMethod preferredPaymentMethod2 = preferredPaymentMethod != null ? (PreferredPaymentMethod) PreferredPaymentMethod.ADAPTER.redact(preferredPaymentMethod) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localBuyerAccount.customer_token;
        byteString.getClass();
        return new LocalBuyer.LocalBuyerAccount(null, null, null, null, str, null, null, m1169redactElements, preferredPaymentMethod2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBuyer.LocalBuyerAccount localBuyerAccount = (LocalBuyer.LocalBuyerAccount) obj;
        localBuyerAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localBuyerAccount.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 2, localBuyerAccount.profile_picture_url);
        protoAdapter.encodeWithTag(protoWriter, 3, localBuyerAccount.email);
        protoAdapter.encodeWithTag(protoWriter, 4, localBuyerAccount.sms_number);
        protoAdapter.encodeWithTag(protoWriter, 5, localBuyerAccount.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 6, localBuyerAccount.name);
        protoAdapter.encodeWithTag(protoWriter, 7, localBuyerAccount.cashtag_with_currency_symbol);
        LocalPaymentMethod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, localBuyerAccount.payment_methods);
        PreferredPaymentMethod.ADAPTER.encodeWithTag(protoWriter, 9, localBuyerAccount.preferred_payment_method);
        protoWriter.writeBytes(localBuyerAccount.unknownFields());
    }
}
