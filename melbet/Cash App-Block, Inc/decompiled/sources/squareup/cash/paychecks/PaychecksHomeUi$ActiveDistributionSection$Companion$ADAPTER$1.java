package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$ActiveDistributionSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaychecksHomeUi.ActiveDistributionSection((LocalizedString) obj2, (LocalizedString) obj3, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.ActiveDistributionSection activeDistributionSection = (PaychecksHomeUi.ActiveDistributionSection) obj;
        reverseProtoWriter.getClass();
        activeDistributionSection.getClass();
        reverseProtoWriter.writeBytes(activeDistributionSection.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, activeDistributionSection.edit_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, activeDistributionSection.title_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, activeDistributionSection.edit_button_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.ActiveDistributionSection activeDistributionSection = (PaychecksHomeUi.ActiveDistributionSection) obj;
        activeDistributionSection.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, activeDistributionSection.edit_button_client_route) + activeDistributionSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, activeDistributionSection.edit_button_text) + protoAdapter.encodedSizeWithTag(4, activeDistributionSection.title_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.ActiveDistributionSection activeDistributionSection = (PaychecksHomeUi.ActiveDistributionSection) obj;
        activeDistributionSection.getClass();
        LocalizedString localizedString = activeDistributionSection.title_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = activeDistributionSection.edit_button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activeDistributionSection.edit_button_client_route;
        byteString.getClass();
        return new PaychecksHomeUi.ActiveDistributionSection(localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.ActiveDistributionSection activeDistributionSection = (PaychecksHomeUi.ActiveDistributionSection) obj;
        activeDistributionSection.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, activeDistributionSection.edit_button_client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, activeDistributionSection.title_text);
        protoAdapter.encodeWithTag(protoWriter, 5, activeDistributionSection.edit_button_text);
        protoWriter.writeBytes(activeDistributionSection.unknownFields());
    }
}
