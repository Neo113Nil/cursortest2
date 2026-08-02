package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AfterpayPrepurchaseData$CardsEntryPoint$ToggleEntrypointData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData((LocalizedString) obj, (LocalizedString) obj2, (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) obj3, (Boolean) obj4, (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) obj5, (Icon) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData toggleEntrypointData = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData) obj;
        reverseProtoWriter.getClass();
        toggleEntrypointData.getClass();
        reverseProtoWriter.writeBytes(toggleEntrypointData.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, toggleEntrypointData.icon);
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, toggleEntrypointData.view_detail_button);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, toggleEntrypointData.is_enabled);
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, toggleEntrypointData.toggle_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, toggleEntrypointData.info_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, toggleEntrypointData.main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData toggleEntrypointData = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData) obj;
        toggleEntrypointData.getClass();
        int size$okio = toggleEntrypointData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Icon.ADAPTER.encodedSizeWithTag(6, toggleEntrypointData.icon) + AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button.ADAPTER.encodedSizeWithTag(5, toggleEntrypointData.view_detail_button) + ProtoAdapter.BOOL.encodedSizeWithTag(4, toggleEntrypointData.is_enabled) + AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action.ADAPTER.encodedSizeWithTag(3, toggleEntrypointData.toggle_action) + protoAdapter.encodedSizeWithTag(2, toggleEntrypointData.info_text) + protoAdapter.encodedSizeWithTag(1, toggleEntrypointData.main_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData toggleEntrypointData = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData) obj;
        toggleEntrypointData.getClass();
        LocalizedString localizedString = toggleEntrypointData.main_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = toggleEntrypointData.info_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action action = toggleEntrypointData.toggle_action;
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action action2 = action != null ? (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action) AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action.ADAPTER.redact(action) : null;
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button button = toggleEntrypointData.view_detail_button;
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button button2 = button != null ? (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button) AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button.ADAPTER.redact(button) : null;
        Icon icon = toggleEntrypointData.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = toggleEntrypointData.is_enabled;
        byteString.getClass();
        return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData(localizedString2, localizedString4, action2, bool, button2, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData toggleEntrypointData = (AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData) obj;
        toggleEntrypointData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, toggleEntrypointData.main_text);
        protoAdapter.encodeWithTag(protoWriter, 2, toggleEntrypointData.info_text);
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action.ADAPTER.encodeWithTag(protoWriter, 3, toggleEntrypointData.toggle_action);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, toggleEntrypointData.is_enabled);
        AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Button.ADAPTER.encodeWithTag(protoWriter, 5, toggleEntrypointData.view_detail_button);
        Icon.ADAPTER.encodeWithTag(protoWriter, 6, toggleEntrypointData.icon);
        protoWriter.writeBytes(toggleEntrypointData.unknownFields());
    }
}
