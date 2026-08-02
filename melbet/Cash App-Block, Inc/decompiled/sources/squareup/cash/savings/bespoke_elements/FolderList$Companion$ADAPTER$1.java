package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.bespoke_elements.FolderList;

/* loaded from: classes10.dex */
public final class FolderList$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FolderList((LocalizedString) obj, (LocalizedString) obj2, (FolderList.LocalizedTemplateString) obj3, (ClientRouteTemplate) obj4, (String) obj5, (LocalizedString) obj6, (CdfEvent) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(FolderList.LocalizedTemplateString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(ClientRouteTemplate.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FolderList folderList = (FolderList) obj;
        reverseProtoWriter.getClass();
        folderList.getClass();
        reverseProtoWriter.writeBytes(folderList.unknownFields());
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 7, folderList.tap_cdf_event);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, folderList.goal_folder_completed_body);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, folderList.general_folder_tap_client_route);
        ClientRouteTemplate.ADAPTER.encodeWithTag(reverseProtoWriter, 4, folderList.goal_folder_tap_client_route_template);
        FolderList.LocalizedTemplateString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, folderList.goal_folder_body_template);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, folderList.general_savings_body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, folderList.general_savings_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FolderList folderList = (FolderList) obj;
        folderList.getClass();
        int size$okio = folderList.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return CdfEvent.ADAPTER.encodedSizeWithTag(7, folderList.tap_cdf_event) + protoAdapter.encodedSizeWithTag(6, folderList.goal_folder_completed_body) + ProtoAdapter.STRING.encodedSizeWithTag(5, folderList.general_folder_tap_client_route) + ClientRouteTemplate.ADAPTER.encodedSizeWithTag(4, folderList.goal_folder_tap_client_route_template) + FolderList.LocalizedTemplateString.ADAPTER.encodedSizeWithTag(3, folderList.goal_folder_body_template) + protoAdapter.encodedSizeWithTag(2, folderList.general_savings_body) + protoAdapter.encodedSizeWithTag(1, folderList.general_savings_label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FolderList folderList = (FolderList) obj;
        folderList.getClass();
        LocalizedString localizedString = folderList.general_savings_label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = folderList.general_savings_body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        FolderList.LocalizedTemplateString localizedTemplateString = folderList.goal_folder_body_template;
        FolderList.LocalizedTemplateString localizedTemplateString2 = localizedTemplateString != null ? (FolderList.LocalizedTemplateString) FolderList.LocalizedTemplateString.ADAPTER.redact(localizedTemplateString) : null;
        ClientRouteTemplate clientRouteTemplate = folderList.goal_folder_tap_client_route_template;
        ClientRouteTemplate clientRouteTemplate2 = clientRouteTemplate != null ? (ClientRouteTemplate) ClientRouteTemplate.ADAPTER.redact(clientRouteTemplate) : null;
        LocalizedString localizedString5 = folderList.goal_folder_completed_body;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        CdfEvent cdfEvent = folderList.tap_cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = folderList.general_folder_tap_client_route;
        byteString.getClass();
        return new FolderList(localizedString2, localizedString4, localizedTemplateString2, clientRouteTemplate2, str, localizedString6, cdfEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FolderList folderList = (FolderList) obj;
        folderList.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, folderList.general_savings_label);
        protoAdapter.encodeWithTag(protoWriter, 2, folderList.general_savings_body);
        FolderList.LocalizedTemplateString.ADAPTER.encodeWithTag(protoWriter, 3, folderList.goal_folder_body_template);
        ClientRouteTemplate.ADAPTER.encodeWithTag(protoWriter, 4, folderList.goal_folder_tap_client_route_template);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, folderList.general_folder_tap_client_route);
        protoAdapter.encodeWithTag(protoWriter, 6, folderList.goal_folder_completed_body);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 7, folderList.tap_cdf_event);
        protoWriter.writeBytes(folderList.unknownFields());
    }
}
