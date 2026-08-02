package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes10.dex */
public final class ArcadeElement$TappableCellDefault$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ArcadeElement.TappableCellDefault((CellDefault) obj, (SavingsAction) obj2, (CdfEvent) obj3, (ClientRouteTemplate) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CellDefault.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SavingsAction.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ClientRouteTemplate.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeElement.TappableCellDefault tappableCellDefault = (ArcadeElement.TappableCellDefault) obj;
        reverseProtoWriter.getClass();
        tappableCellDefault.getClass();
        reverseProtoWriter.writeBytes(tappableCellDefault.unknownFields());
        ClientRouteTemplate.ADAPTER.encodeWithTag(reverseProtoWriter, 5, tappableCellDefault.tap_client_route_template);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tappableCellDefault.tap_client_route_template_cdf_event);
        SavingsAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tappableCellDefault.tap_action);
        CellDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tappableCellDefault.cell_default);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeElement.TappableCellDefault tappableCellDefault = (ArcadeElement.TappableCellDefault) obj;
        tappableCellDefault.getClass();
        return ClientRouteTemplate.ADAPTER.encodedSizeWithTag(5, tappableCellDefault.tap_client_route_template) + CdfEvent.ADAPTER.encodedSizeWithTag(3, tappableCellDefault.tap_client_route_template_cdf_event) + SavingsAction.ADAPTER.encodedSizeWithTag(2, tappableCellDefault.tap_action) + CellDefault.ADAPTER.encodedSizeWithTag(1, tappableCellDefault.cell_default) + tappableCellDefault.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeElement.TappableCellDefault tappableCellDefault = (ArcadeElement.TappableCellDefault) obj;
        tappableCellDefault.getClass();
        CellDefault cellDefault = tappableCellDefault.cell_default;
        CellDefault cellDefault2 = cellDefault != null ? (CellDefault) CellDefault.ADAPTER.redact(cellDefault) : null;
        SavingsAction savingsAction = tappableCellDefault.tap_action;
        SavingsAction savingsAction2 = savingsAction != null ? (SavingsAction) SavingsAction.ADAPTER.redact(savingsAction) : null;
        CdfEvent cdfEvent = tappableCellDefault.tap_client_route_template_cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ClientRouteTemplate clientRouteTemplate = tappableCellDefault.tap_client_route_template;
        ClientRouteTemplate clientRouteTemplate2 = clientRouteTemplate != null ? (ClientRouteTemplate) ClientRouteTemplate.ADAPTER.redact(clientRouteTemplate) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ArcadeElement.TappableCellDefault(cellDefault2, savingsAction2, cdfEvent2, clientRouteTemplate2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeElement.TappableCellDefault tappableCellDefault = (ArcadeElement.TappableCellDefault) obj;
        tappableCellDefault.getClass();
        CellDefault.ADAPTER.encodeWithTag(protoWriter, 1, tappableCellDefault.cell_default);
        SavingsAction.ADAPTER.encodeWithTag(protoWriter, 2, tappableCellDefault.tap_action);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 3, tappableCellDefault.tap_client_route_template_cdf_event);
        ClientRouteTemplate.ADAPTER.encodeWithTag(protoWriter, 5, tappableCellDefault.tap_client_route_template);
        protoWriter.writeBytes(tappableCellDefault.unknownFields());
    }
}
