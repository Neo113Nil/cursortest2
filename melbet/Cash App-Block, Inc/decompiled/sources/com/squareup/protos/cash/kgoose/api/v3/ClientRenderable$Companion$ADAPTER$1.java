package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ClientRenderable$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientRenderable$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ClientRenderable.Component actionCard;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        ClientRenderable.Component component = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientRenderable((ClientRenderType) obj, component, (Integer) obj2, (TapAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = ClientRenderType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    actionCard = new ClientRenderable.Component.ActionCard((ActionCard) ActionCard.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    actionCard = new ClientRenderable.Component.ActivityList((ActivityList) ActivityList.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    actionCard = new ClientRenderable.Component.InsightChart((InsightChart) InsightChart.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    actionCard = new ClientRenderable.Component.CellList((CellList) CellList.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    actionCard = new ClientRenderable.Component.GenericData((Map) ProtoAdapter.STRUCT_MAP.decode(protoReader));
                    break;
                case 7:
                    actionCard = new ClientRenderable.Component.NavigationCard((NavigationCard) NavigationCard.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    actionCard = new ClientRenderable.Component.LayoutElement((LayoutElement) LayoutElement.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    actionCard = new ClientRenderable.Component.GenericComponent((GenericComponent) GenericComponent.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 11:
                    actionCard = new ClientRenderable.Component.TextCard((TextCard) TextCard.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    actionCard = new ClientRenderable.Component.Brief((Brief) Brief.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    actionCard = new ClientRenderable.Component.CellActionCard((CellActionCard) CellActionCard.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    actionCard = new ClientRenderable.Component.TemplateCard((TemplateCard) TemplateCard.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    obj3 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj3);
                    continue;
                case 16:
                    actionCard = new ClientRenderable.Component.McpViewHtml((McpViewHtml) McpViewHtml.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    actionCard = new ClientRenderable.Component.GenieCard((GenieCard) GenieCard.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    actionCard = new ClientRenderable.Component.SuggestionList((SuggestionList) SuggestionList.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    actionCard = new ClientRenderable.Component.SlottedCard((SlottedCard) SlottedCard.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    actionCard = new ClientRenderable.Component.PromptButtonList((PromptButtonList) PromptButtonList.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            component = actionCard;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientRenderable clientRenderable = (ClientRenderable) obj;
        reverseProtoWriter.getClass();
        clientRenderable.getClass();
        reverseProtoWriter.writeBytes(clientRenderable.unknownFields());
        ClientRenderable.Component component = clientRenderable.component;
        if (component instanceof ClientRenderable.Component.ActionCard) {
            ActionCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ClientRenderable.Component.ActionCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.ActivityList) {
            ActivityList.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ClientRenderable.Component.ActivityList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.InsightChart) {
            InsightChart.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ClientRenderable.Component.InsightChart) component).getValue());
        } else if (component instanceof ClientRenderable.Component.CellList) {
            CellList.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ClientRenderable.Component.CellList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenericData) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 6, ((ClientRenderable.Component.GenericData) component).getValue());
        } else if (component instanceof ClientRenderable.Component.NavigationCard) {
            NavigationCard.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ClientRenderable.Component.NavigationCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.LayoutElement) {
            LayoutElement.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ClientRenderable.Component.LayoutElement) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenericComponent) {
            GenericComponent.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ClientRenderable.Component.GenericComponent) component).getValue());
        } else if (component instanceof ClientRenderable.Component.TextCard) {
            TextCard.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((ClientRenderable.Component.TextCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.Brief) {
            Brief.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ClientRenderable.Component.Brief) component).getValue());
        } else if (component instanceof ClientRenderable.Component.CellActionCard) {
            CellActionCard.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((ClientRenderable.Component.CellActionCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.TemplateCard) {
            TemplateCard.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((ClientRenderable.Component.TemplateCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.McpViewHtml) {
            McpViewHtml.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((ClientRenderable.Component.McpViewHtml) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenieCard) {
            GenieCard.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((ClientRenderable.Component.GenieCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.SuggestionList) {
            SuggestionList.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((ClientRenderable.Component.SuggestionList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.SlottedCard) {
            SlottedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((ClientRenderable.Component.SlottedCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.PromptButtonList) {
            PromptButtonList.ADAPTER.encodeWithTag(reverseProtoWriter, 20, ((ClientRenderable.Component.PromptButtonList) component).getValue());
        } else if (component != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 15, clientRenderable.tap_action);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 10, clientRenderable.version);
        ClientRenderType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clientRenderable.type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ClientRenderable clientRenderable = (ClientRenderable) obj;
        clientRenderable.getClass();
        int encodedSizeWithTag2 = ClientRenderType.ADAPTER.encodedSizeWithTag(1, clientRenderable.type) + clientRenderable.unknownFields().getSize$okio();
        ClientRenderable.Component component = clientRenderable.component;
        if (component instanceof ClientRenderable.Component.ActionCard) {
            encodedSizeWithTag = ActionCard.ADAPTER.encodedSizeWithTag(2, ((ClientRenderable.Component.ActionCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.ActivityList) {
            encodedSizeWithTag = ActivityList.ADAPTER.encodedSizeWithTag(3, ((ClientRenderable.Component.ActivityList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.InsightChart) {
            encodedSizeWithTag = InsightChart.ADAPTER.encodedSizeWithTag(4, ((ClientRenderable.Component.InsightChart) component).getValue());
        } else if (component instanceof ClientRenderable.Component.CellList) {
            encodedSizeWithTag = CellList.ADAPTER.encodedSizeWithTag(5, ((ClientRenderable.Component.CellList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenericData) {
            encodedSizeWithTag = ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(6, ((ClientRenderable.Component.GenericData) component).getValue());
        } else if (component instanceof ClientRenderable.Component.NavigationCard) {
            encodedSizeWithTag = NavigationCard.ADAPTER.encodedSizeWithTag(7, ((ClientRenderable.Component.NavigationCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.LayoutElement) {
            encodedSizeWithTag = LayoutElement.ADAPTER.encodedSizeWithTag(8, ((ClientRenderable.Component.LayoutElement) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenericComponent) {
            encodedSizeWithTag = GenericComponent.ADAPTER.encodedSizeWithTag(9, ((ClientRenderable.Component.GenericComponent) component).getValue());
        } else if (component instanceof ClientRenderable.Component.TextCard) {
            encodedSizeWithTag = TextCard.ADAPTER.encodedSizeWithTag(11, ((ClientRenderable.Component.TextCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.Brief) {
            encodedSizeWithTag = Brief.ADAPTER.encodedSizeWithTag(12, ((ClientRenderable.Component.Brief) component).getValue());
        } else if (component instanceof ClientRenderable.Component.CellActionCard) {
            encodedSizeWithTag = CellActionCard.ADAPTER.encodedSizeWithTag(13, ((ClientRenderable.Component.CellActionCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.TemplateCard) {
            encodedSizeWithTag = TemplateCard.ADAPTER.encodedSizeWithTag(14, ((ClientRenderable.Component.TemplateCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.McpViewHtml) {
            encodedSizeWithTag = McpViewHtml.ADAPTER.encodedSizeWithTag(16, ((ClientRenderable.Component.McpViewHtml) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenieCard) {
            encodedSizeWithTag = GenieCard.ADAPTER.encodedSizeWithTag(17, ((ClientRenderable.Component.GenieCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.SuggestionList) {
            encodedSizeWithTag = SuggestionList.ADAPTER.encodedSizeWithTag(18, ((ClientRenderable.Component.SuggestionList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.SlottedCard) {
            encodedSizeWithTag = SlottedCard.ADAPTER.encodedSizeWithTag(19, ((ClientRenderable.Component.SlottedCard) component).getValue());
        } else {
            if (!(component instanceof ClientRenderable.Component.PromptButtonList)) {
                if (component != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return TapAction.ADAPTER.encodedSizeWithTag(15, clientRenderable.tap_action) + ProtoAdapter.INT32.encodedSizeWithTag(10, clientRenderable.version) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = PromptButtonList.ADAPTER.encodedSizeWithTag(20, ((ClientRenderable.Component.PromptButtonList) component).getValue());
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return TapAction.ADAPTER.encodedSizeWithTag(15, clientRenderable.tap_action) + ProtoAdapter.INT32.encodedSizeWithTag(10, clientRenderable.version) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientRenderable clientRenderable = (ClientRenderable) obj;
        clientRenderable.getClass();
        TapAction tapAction = clientRenderable.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        ClientRenderType clientRenderType = clientRenderable.type;
        ClientRenderable.Component component = clientRenderable.component;
        Integer num = clientRenderable.version;
        byteString.getClass();
        return new ClientRenderable(clientRenderType, component, num, tapAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientRenderable clientRenderable = (ClientRenderable) obj;
        clientRenderable.getClass();
        ClientRenderType.ADAPTER.encodeWithTag(protoWriter, 1, clientRenderable.type);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, clientRenderable.version);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 15, clientRenderable.tap_action);
        ClientRenderable.Component component = clientRenderable.component;
        if (component instanceof ClientRenderable.Component.ActionCard) {
            ActionCard.ADAPTER.encodeWithTag(protoWriter, 2, ((ClientRenderable.Component.ActionCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.ActivityList) {
            ActivityList.ADAPTER.encodeWithTag(protoWriter, 3, ((ClientRenderable.Component.ActivityList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.InsightChart) {
            InsightChart.ADAPTER.encodeWithTag(protoWriter, 4, ((ClientRenderable.Component.InsightChart) component).getValue());
        } else if (component instanceof ClientRenderable.Component.CellList) {
            CellList.ADAPTER.encodeWithTag(protoWriter, 5, ((ClientRenderable.Component.CellList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenericData) {
            ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 6, ((ClientRenderable.Component.GenericData) component).getValue());
        } else if (component instanceof ClientRenderable.Component.NavigationCard) {
            NavigationCard.ADAPTER.encodeWithTag(protoWriter, 7, ((ClientRenderable.Component.NavigationCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.LayoutElement) {
            LayoutElement.ADAPTER.encodeWithTag(protoWriter, 8, ((ClientRenderable.Component.LayoutElement) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenericComponent) {
            GenericComponent.ADAPTER.encodeWithTag(protoWriter, 9, ((ClientRenderable.Component.GenericComponent) component).getValue());
        } else if (component instanceof ClientRenderable.Component.TextCard) {
            TextCard.ADAPTER.encodeWithTag(protoWriter, 11, ((ClientRenderable.Component.TextCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.Brief) {
            Brief.ADAPTER.encodeWithTag(protoWriter, 12, ((ClientRenderable.Component.Brief) component).getValue());
        } else if (component instanceof ClientRenderable.Component.CellActionCard) {
            CellActionCard.ADAPTER.encodeWithTag(protoWriter, 13, ((ClientRenderable.Component.CellActionCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.TemplateCard) {
            TemplateCard.ADAPTER.encodeWithTag(protoWriter, 14, ((ClientRenderable.Component.TemplateCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.McpViewHtml) {
            McpViewHtml.ADAPTER.encodeWithTag(protoWriter, 16, ((ClientRenderable.Component.McpViewHtml) component).getValue());
        } else if (component instanceof ClientRenderable.Component.GenieCard) {
            GenieCard.ADAPTER.encodeWithTag(protoWriter, 17, ((ClientRenderable.Component.GenieCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.SuggestionList) {
            SuggestionList.ADAPTER.encodeWithTag(protoWriter, 18, ((ClientRenderable.Component.SuggestionList) component).getValue());
        } else if (component instanceof ClientRenderable.Component.SlottedCard) {
            SlottedCard.ADAPTER.encodeWithTag(protoWriter, 19, ((ClientRenderable.Component.SlottedCard) component).getValue());
        } else if (component instanceof ClientRenderable.Component.PromptButtonList) {
            PromptButtonList.ADAPTER.encodeWithTag(protoWriter, 20, ((ClientRenderable.Component.PromptButtonList) component).getValue());
        } else if (component != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(clientRenderable.unknownFields());
    }
}
