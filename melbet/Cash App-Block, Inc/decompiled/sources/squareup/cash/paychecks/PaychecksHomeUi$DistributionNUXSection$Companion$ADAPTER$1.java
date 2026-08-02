package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$DistributionNUXSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.DistributionNUXSection((Image) obj, (String) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                switch (nextTag) {
                    case 5:
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                        break;
                    case 7:
                        obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                        break;
                    case 8:
                        obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                        break;
                    case 9:
                        obj6 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.DistributionNUXSection distributionNUXSection = (PaychecksHomeUi.DistributionNUXSection) obj;
        reverseProtoWriter.getClass();
        distributionNUXSection.getClass();
        reverseProtoWriter.writeBytes(distributionNUXSection.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, distributionNUXSection.edit_multi_allocation_client_route);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, distributionNUXSection.call_to_action_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, distributionNUXSection.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, distributionNUXSection.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, distributionNUXSection.call_to_action_client_route);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, distributionNUXSection.header_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.DistributionNUXSection distributionNUXSection = (PaychecksHomeUi.DistributionNUXSection) obj;
        distributionNUXSection.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, distributionNUXSection.header_image) + distributionNUXSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, distributionNUXSection.call_to_action_client_route) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, distributionNUXSection.edit_multi_allocation_client_route) + protoAdapter2.encodedSizeWithTag(8, distributionNUXSection.call_to_action_text) + protoAdapter2.encodedSizeWithTag(7, distributionNUXSection.subtitle) + protoAdapter2.encodedSizeWithTag(6, distributionNUXSection.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.DistributionNUXSection distributionNUXSection = (PaychecksHomeUi.DistributionNUXSection) obj;
        distributionNUXSection.getClass();
        Image image = distributionNUXSection.header_image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = distributionNUXSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = distributionNUXSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = distributionNUXSection.call_to_action_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = distributionNUXSection.call_to_action_client_route;
        String str2 = distributionNUXSection.edit_multi_allocation_client_route;
        byteString.getClass();
        return new PaychecksHomeUi.DistributionNUXSection(image2, str, localizedString2, localizedString4, localizedString6, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.DistributionNUXSection distributionNUXSection = (PaychecksHomeUi.DistributionNUXSection) obj;
        distributionNUXSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, distributionNUXSection.header_image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 5, distributionNUXSection.call_to_action_client_route);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, distributionNUXSection.title);
        protoAdapter2.encodeWithTag(protoWriter, 7, distributionNUXSection.subtitle);
        protoAdapter2.encodeWithTag(protoWriter, 8, distributionNUXSection.call_to_action_text);
        protoAdapter.encodeWithTag(protoWriter, 9, distributionNUXSection.edit_multi_allocation_client_route);
        protoWriter.writeBytes(distributionNUXSection.unknownFields());
    }
}
