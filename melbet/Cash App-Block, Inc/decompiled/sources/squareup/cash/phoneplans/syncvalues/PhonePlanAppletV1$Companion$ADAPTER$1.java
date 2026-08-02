package squareup.cash.phoneplans.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;

/* loaded from: classes10.dex */
public final class PhonePlanAppletV1$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PhonePlanAppletV1((LocalizedString) obj, (LocalizedString) obj2, (PhonePlanAppletV1.State) obj3, (String) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = PhonePlanAppletV1.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) obj;
        reverseProtoWriter.getClass();
        phonePlanAppletV1.getClass();
        reverseProtoWriter.writeBytes(phonePlanAppletV1.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, phonePlanAppletV1.detail);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, phonePlanAppletV1.client_route_url);
        PhonePlanAppletV1.State.ADAPTER.encodeWithTag(reverseProtoWriter, 3, phonePlanAppletV1.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, phonePlanAppletV1.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, phonePlanAppletV1.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) obj;
        phonePlanAppletV1.getClass();
        int size$okio = phonePlanAppletV1.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, phonePlanAppletV1.detail) + ProtoAdapter.STRING.encodedSizeWithTag(4, phonePlanAppletV1.client_route_url) + PhonePlanAppletV1.State.ADAPTER.encodedSizeWithTag(3, phonePlanAppletV1.state) + protoAdapter.encodedSizeWithTag(2, phonePlanAppletV1.subtitle) + protoAdapter.encodedSizeWithTag(1, phonePlanAppletV1.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) obj;
        phonePlanAppletV1.getClass();
        LocalizedString localizedString = phonePlanAppletV1.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = phonePlanAppletV1.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = phonePlanAppletV1.detail;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        PhonePlanAppletV1.State state = phonePlanAppletV1.state;
        String str = phonePlanAppletV1.client_route_url;
        byteString.getClass();
        return new PhonePlanAppletV1(localizedString2, localizedString4, state, str, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) obj;
        phonePlanAppletV1.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, phonePlanAppletV1.title);
        protoAdapter.encodeWithTag(protoWriter, 2, phonePlanAppletV1.subtitle);
        PhonePlanAppletV1.State.ADAPTER.encodeWithTag(protoWriter, 3, phonePlanAppletV1.state);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, phonePlanAppletV1.client_route_url);
        protoAdapter.encodeWithTag(protoWriter, 5, phonePlanAppletV1.detail);
        protoWriter.writeBytes(phonePlanAppletV1.unknownFields());
    }
}
