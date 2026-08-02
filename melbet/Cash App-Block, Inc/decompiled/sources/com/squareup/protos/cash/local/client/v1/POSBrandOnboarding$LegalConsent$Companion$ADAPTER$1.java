package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSBrandOnboarding$LegalConsent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new POSBrandOnboarding.LegalConsent((String) obj, (String) obj2, (ShortlinkAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(ShortlinkAction.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        POSBrandOnboarding.LegalConsent legalConsent = (POSBrandOnboarding.LegalConsent) obj;
        reverseProtoWriter.getClass();
        legalConsent.getClass();
        reverseProtoWriter.writeBytes(legalConsent.unknownFields());
        ShortlinkAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, legalConsent.accept_button_shortlink);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, legalConsent.fine_print);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, legalConsent.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSBrandOnboarding.LegalConsent legalConsent = (POSBrandOnboarding.LegalConsent) obj;
        legalConsent.getClass();
        int size$okio = legalConsent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ShortlinkAction.ADAPTER.encodedSizeWithTag(3, legalConsent.accept_button_shortlink) + protoAdapter.encodedSizeWithTag(2, legalConsent.fine_print) + protoAdapter.encodedSizeWithTag(1, legalConsent.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSBrandOnboarding.LegalConsent legalConsent = (POSBrandOnboarding.LegalConsent) obj;
        legalConsent.getClass();
        ShortlinkAction shortlinkAction = legalConsent.accept_button_shortlink;
        ShortlinkAction shortlinkAction2 = shortlinkAction != null ? (ShortlinkAction) ShortlinkAction.ADAPTER.redact(shortlinkAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = legalConsent.title;
        String str2 = legalConsent.fine_print;
        byteString.getClass();
        return new POSBrandOnboarding.LegalConsent(str, str2, shortlinkAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSBrandOnboarding.LegalConsent legalConsent = (POSBrandOnboarding.LegalConsent) obj;
        legalConsent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, legalConsent.title);
        protoAdapter.encodeWithTag(protoWriter, 2, legalConsent.fine_print);
        ShortlinkAction.ADAPTER.encodeWithTag(protoWriter, 3, legalConsent.accept_button_shortlink);
        protoWriter.writeBytes(legalConsent.unknownFields());
    }
}
