package com.squareup.protos.giftly;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCard$Options$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GiftCard.Options((String) obj, (LocalizableString) obj2, (ClientScenario) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj3 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCard.Options options = (GiftCard.Options) obj;
        reverseProtoWriter.getClass();
        options.getClass();
        reverseProtoWriter.writeBytes(options.unknownFields());
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, options.client_scenario);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, options.localizable_label);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, options.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCard.Options options = (GiftCard.Options) obj;
        options.getClass();
        return ClientScenario.ADAPTER.encodedSizeWithTag(2, options.client_scenario) + LocalizableString.ADAPTER.encodedSizeWithTag(3, options.localizable_label) + ProtoAdapter.STRING.encodedSizeWithTag(1, options.label) + options.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCard.Options options = (GiftCard.Options) obj;
        options.getClass();
        LocalizableString localizableString = options.localizable_label;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = options.label;
        ClientScenario clientScenario = options.client_scenario;
        byteString.getClass();
        return new GiftCard.Options(str, localizableString2, clientScenario, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCard.Options options = (GiftCard.Options) obj;
        options.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, options.label);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, options.localizable_label);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, options.client_scenario);
        protoWriter.writeBytes(options.unknownFields());
    }
}
