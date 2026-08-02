package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.bespoke_elements.TransferButtons;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;

/* loaded from: classes10.dex */
public final class TransferButtons$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransferButtons((ButtonDefaultGroup) obj, (Long) obj2, (TransferButtons.TransferInConfig) obj3, (Long) obj4, (TransferButtons.TransferOutConfig) obj5, (ClientRouteTemplate) obj6, (ClientRouteTemplate) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ButtonDefaultGroup.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(TransferButtons.TransferInConfig.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(TransferButtons.TransferOutConfig.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(ClientRouteTemplate.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(ClientRouteTemplate.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransferButtons transferButtons = (TransferButtons) obj;
        reverseProtoWriter.getClass();
        transferButtons.getClass();
        reverseProtoWriter.writeBytes(transferButtons.unknownFields());
        ProtoAdapter protoAdapter = ClientRouteTemplate.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, transferButtons.transfer_out_button_client_route_template);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, transferButtons.transfer_in_button_client_route_template);
        TransferButtons.TransferOutConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 5, transferButtons.transfer_out_config);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, transferButtons.transfer_out_button_index);
        TransferButtons.TransferInConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 3, transferButtons.transfer_in_config);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, transferButtons.transfer_in_button_index);
        ButtonDefaultGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transferButtons.button_group);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransferButtons transferButtons = (TransferButtons) obj;
        transferButtons.getClass();
        int encodedSizeWithTag = ButtonDefaultGroup.ADAPTER.encodedSizeWithTag(1, transferButtons.button_group) + transferButtons.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = TransferButtons.TransferOutConfig.ADAPTER.encodedSizeWithTag(5, transferButtons.transfer_out_config) + protoAdapter.encodedSizeWithTag(4, transferButtons.transfer_out_button_index) + TransferButtons.TransferInConfig.ADAPTER.encodedSizeWithTag(3, transferButtons.transfer_in_config) + protoAdapter.encodedSizeWithTag(2, transferButtons.transfer_in_button_index) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ClientRouteTemplate.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, transferButtons.transfer_out_button_client_route_template) + protoAdapter2.encodedSizeWithTag(6, transferButtons.transfer_in_button_client_route_template) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransferButtons transferButtons = (TransferButtons) obj;
        transferButtons.getClass();
        ButtonDefaultGroup buttonDefaultGroup = transferButtons.button_group;
        ButtonDefaultGroup buttonDefaultGroup2 = buttonDefaultGroup != null ? (ButtonDefaultGroup) ButtonDefaultGroup.ADAPTER.redact(buttonDefaultGroup) : null;
        TransferButtons.TransferInConfig transferInConfig = transferButtons.transfer_in_config;
        TransferButtons.TransferInConfig transferInConfig2 = transferInConfig != null ? (TransferButtons.TransferInConfig) TransferButtons.TransferInConfig.ADAPTER.redact(transferInConfig) : null;
        TransferButtons.TransferOutConfig transferOutConfig = transferButtons.transfer_out_config;
        TransferButtons.TransferOutConfig transferOutConfig2 = transferOutConfig != null ? (TransferButtons.TransferOutConfig) TransferButtons.TransferOutConfig.ADAPTER.redact(transferOutConfig) : null;
        ClientRouteTemplate clientRouteTemplate = transferButtons.transfer_in_button_client_route_template;
        ClientRouteTemplate clientRouteTemplate2 = clientRouteTemplate != null ? (ClientRouteTemplate) ClientRouteTemplate.ADAPTER.redact(clientRouteTemplate) : null;
        ClientRouteTemplate clientRouteTemplate3 = transferButtons.transfer_out_button_client_route_template;
        ClientRouteTemplate clientRouteTemplate4 = clientRouteTemplate3 != null ? (ClientRouteTemplate) ClientRouteTemplate.ADAPTER.redact(clientRouteTemplate3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = transferButtons.transfer_in_button_index;
        Long l2 = transferButtons.transfer_out_button_index;
        byteString.getClass();
        return new TransferButtons(buttonDefaultGroup2, l, transferInConfig2, l2, transferOutConfig2, clientRouteTemplate2, clientRouteTemplate4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransferButtons transferButtons = (TransferButtons) obj;
        transferButtons.getClass();
        ButtonDefaultGroup.ADAPTER.encodeWithTag(protoWriter, 1, transferButtons.button_group);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 2, transferButtons.transfer_in_button_index);
        TransferButtons.TransferInConfig.ADAPTER.encodeWithTag(protoWriter, 3, transferButtons.transfer_in_config);
        protoAdapter.encodeWithTag(protoWriter, 4, transferButtons.transfer_out_button_index);
        TransferButtons.TransferOutConfig.ADAPTER.encodeWithTag(protoWriter, 5, transferButtons.transfer_out_config);
        ProtoAdapter protoAdapter2 = ClientRouteTemplate.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, transferButtons.transfer_in_button_client_route_template);
        protoAdapter2.encodeWithTag(protoWriter, 7, transferButtons.transfer_out_button_client_route_template);
        protoWriter.writeBytes(transferButtons.unknownFields());
    }
}
