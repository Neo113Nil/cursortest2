package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.CellList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.CellDefault;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellList$TappableCell$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        CellList.TappableCell.TapAction tapAction = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CellList.TappableCell((CellDefault) obj, tapAction, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CellDefault.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                tapAction = new CellList.TappableCell.TapAction.SendMessage((CellList.TappableCell.SendMessageAction) CellList.TappableCell.SendMessageAction.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                tapAction = new CellList.TappableCell.TapAction.RequestFreeformInput((CellList.TappableCell.RequestFreeformInputAction) CellList.TappableCell.RequestFreeformInputAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CellList.TappableCell tappableCell = (CellList.TappableCell) obj;
        reverseProtoWriter.getClass();
        tappableCell.getClass();
        reverseProtoWriter.writeBytes(tappableCell.unknownFields());
        CellList.TappableCell.TapAction tapAction = tappableCell.tap_action;
        if (tapAction instanceof CellList.TappableCell.TapAction.SendMessage) {
            CellList.TappableCell.SendMessageAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CellList.TappableCell.TapAction.SendMessage) tapAction).getValue());
        } else if (tapAction instanceof CellList.TappableCell.TapAction.RequestFreeformInput) {
            CellList.TappableCell.RequestFreeformInputAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CellList.TappableCell.TapAction.RequestFreeformInput) tapAction).getValue());
        } else if (tapAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, tappableCell.campaign_category);
        CellDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tappableCell.cells);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CellList.TappableCell tappableCell = (CellList.TappableCell) obj;
        tappableCell.getClass();
        int encodedSizeWithTag2 = CellDefault.ADAPTER.encodedSizeWithTag(1, tappableCell.cells) + tappableCell.unknownFields().getSize$okio();
        CellList.TappableCell.TapAction tapAction = tappableCell.tap_action;
        if (tapAction instanceof CellList.TappableCell.TapAction.SendMessage) {
            encodedSizeWithTag = CellList.TappableCell.SendMessageAction.ADAPTER.encodedSizeWithTag(2, ((CellList.TappableCell.TapAction.SendMessage) tapAction).getValue());
        } else {
            if (!(tapAction instanceof CellList.TappableCell.TapAction.RequestFreeformInput)) {
                if (tapAction != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, tappableCell.campaign_category) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = CellList.TappableCell.RequestFreeformInputAction.ADAPTER.encodedSizeWithTag(4, ((CellList.TappableCell.TapAction.RequestFreeformInput) tapAction).getValue());
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, tappableCell.campaign_category) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CellList.TappableCell tappableCell = (CellList.TappableCell) obj;
        tappableCell.getClass();
        CellDefault cellDefault = tappableCell.cells;
        CellDefault cellDefault2 = cellDefault != null ? (CellDefault) CellDefault.ADAPTER.redact(cellDefault) : null;
        ByteString byteString = ByteString.EMPTY;
        CellList.TappableCell.TapAction tapAction = tappableCell.tap_action;
        String str = tappableCell.campaign_category;
        byteString.getClass();
        return new CellList.TappableCell(cellDefault2, tapAction, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CellList.TappableCell tappableCell = (CellList.TappableCell) obj;
        tappableCell.getClass();
        CellDefault.ADAPTER.encodeWithTag(protoWriter, 1, tappableCell.cells);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, tappableCell.campaign_category);
        CellList.TappableCell.TapAction tapAction = tappableCell.tap_action;
        if (tapAction instanceof CellList.TappableCell.TapAction.SendMessage) {
            CellList.TappableCell.SendMessageAction.ADAPTER.encodeWithTag(protoWriter, 2, ((CellList.TappableCell.TapAction.SendMessage) tapAction).getValue());
        } else if (tapAction instanceof CellList.TappableCell.TapAction.RequestFreeformInput) {
            CellList.TappableCell.RequestFreeformInputAction.ADAPTER.encodeWithTag(protoWriter, 4, ((CellList.TappableCell.TapAction.RequestFreeformInput) tapAction).getValue());
        } else if (tapAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(tappableCell.unknownFields());
    }
}
