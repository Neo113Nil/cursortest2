package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalOnboardingUpsell;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalOnboardingUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalOnboardingUpsell((String) obj, (String) obj2, (LocalOnboardingUpsell.Button) obj3, (LegalConsent) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalOnboardingUpsell.Button.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LegalConsent.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalOnboardingUpsell localOnboardingUpsell = (LocalOnboardingUpsell) obj;
        reverseProtoWriter.getClass();
        localOnboardingUpsell.getClass();
        reverseProtoWriter.writeBytes(localOnboardingUpsell.unknownFields());
        LegalConsent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localOnboardingUpsell.legal_consent);
        LocalOnboardingUpsell.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localOnboardingUpsell.learn_more_button);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localOnboardingUpsell.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localOnboardingUpsell.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalOnboardingUpsell localOnboardingUpsell = (LocalOnboardingUpsell) obj;
        localOnboardingUpsell.getClass();
        int size$okio = localOnboardingUpsell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LegalConsent.ADAPTER.encodedSizeWithTag(4, localOnboardingUpsell.legal_consent) + LocalOnboardingUpsell.Button.ADAPTER.encodedSizeWithTag(3, localOnboardingUpsell.learn_more_button) + protoAdapter.encodedSizeWithTag(2, localOnboardingUpsell.body) + protoAdapter.encodedSizeWithTag(1, localOnboardingUpsell.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalOnboardingUpsell localOnboardingUpsell = (LocalOnboardingUpsell) obj;
        localOnboardingUpsell.getClass();
        LocalOnboardingUpsell.Button button = localOnboardingUpsell.learn_more_button;
        LocalOnboardingUpsell.Button button2 = button != null ? (LocalOnboardingUpsell.Button) LocalOnboardingUpsell.Button.ADAPTER.redact(button) : null;
        LegalConsent legalConsent = localOnboardingUpsell.legal_consent;
        LegalConsent legalConsent2 = legalConsent != null ? (LegalConsent) LegalConsent.ADAPTER.redact(legalConsent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = localOnboardingUpsell.title;
        String str2 = localOnboardingUpsell.body;
        byteString.getClass();
        return new LocalOnboardingUpsell(str, str2, button2, legalConsent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalOnboardingUpsell localOnboardingUpsell = (LocalOnboardingUpsell) obj;
        localOnboardingUpsell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localOnboardingUpsell.title);
        protoAdapter.encodeWithTag(protoWriter, 2, localOnboardingUpsell.body);
        LocalOnboardingUpsell.Button.ADAPTER.encodeWithTag(protoWriter, 3, localOnboardingUpsell.learn_more_button);
        LegalConsent.ADAPTER.encodeWithTag(protoWriter, 4, localOnboardingUpsell.legal_consent);
        protoWriter.writeBytes(localOnboardingUpsell.unknownFields());
    }
}
