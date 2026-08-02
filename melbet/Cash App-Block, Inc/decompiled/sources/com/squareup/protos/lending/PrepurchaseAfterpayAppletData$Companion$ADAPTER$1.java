package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PrepurchaseAfterpayAppletData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
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
                return new PrepurchaseAfterpayAppletData((UiAvatar) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, m, arrayList, (ByteString) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    arrayList.add(PrepurchaseAfterpayAppletData.ButtonData.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    m.add(PrepurchaseAfterpayAppletData.AppletRow.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj5 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 9:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = (PrepurchaseAfterpayAppletData) obj;
        reverseProtoWriter.getClass();
        prepurchaseAfterpayAppletData.getClass();
        reverseProtoWriter.writeBytes(prepurchaseAfterpayAppletData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 9, prepurchaseAfterpayAppletData.analytics_sheet_type);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 8, prepurchaseAfterpayAppletData.opaque_request_data);
        PrepurchaseAfterpayAppletData.ButtonData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, prepurchaseAfterpayAppletData.button_stack);
        PrepurchaseAfterpayAppletData.AppletRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, prepurchaseAfterpayAppletData.applet_rows);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, prepurchaseAfterpayAppletData.footer_markdown);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, prepurchaseAfterpayAppletData.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, prepurchaseAfterpayAppletData.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, prepurchaseAfterpayAppletData.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = (PrepurchaseAfterpayAppletData) obj;
        prepurchaseAfterpayAppletData.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, prepurchaseAfterpayAppletData.avatar) + prepurchaseAfterpayAppletData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(9, prepurchaseAfterpayAppletData.analytics_sheet_type) + ProtoAdapter.BYTES.encodedSizeWithTag(8, prepurchaseAfterpayAppletData.opaque_request_data) + PrepurchaseAfterpayAppletData.ButtonData.ADAPTER.asRepeated().encodedSizeWithTag(6, prepurchaseAfterpayAppletData.button_stack) + PrepurchaseAfterpayAppletData.AppletRow.ADAPTER.asRepeated().encodedSizeWithTag(7, prepurchaseAfterpayAppletData.applet_rows) + protoAdapter.encodedSizeWithTag(4, prepurchaseAfterpayAppletData.footer_markdown) + protoAdapter.encodedSizeWithTag(3, prepurchaseAfterpayAppletData.subtitle) + protoAdapter.encodedSizeWithTag(2, prepurchaseAfterpayAppletData.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = (PrepurchaseAfterpayAppletData) obj;
        prepurchaseAfterpayAppletData.getClass();
        UiAvatar uiAvatar = prepurchaseAfterpayAppletData.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = prepurchaseAfterpayAppletData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = prepurchaseAfterpayAppletData.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = prepurchaseAfterpayAppletData.footer_markdown;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(prepurchaseAfterpayAppletData.applet_rows, PrepurchaseAfterpayAppletData.AppletRow.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(prepurchaseAfterpayAppletData.button_stack, PrepurchaseAfterpayAppletData.ButtonData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = prepurchaseAfterpayAppletData.opaque_request_data;
        String str = prepurchaseAfterpayAppletData.analytics_sheet_type;
        byteString.getClass();
        return new PrepurchaseAfterpayAppletData(uiAvatar2, localizedString2, localizedString4, localizedString6, m1169redactElements, m1169redactElements2, byteString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseAfterpayAppletData prepurchaseAfterpayAppletData = (PrepurchaseAfterpayAppletData) obj;
        prepurchaseAfterpayAppletData.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, prepurchaseAfterpayAppletData.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, prepurchaseAfterpayAppletData.title);
        protoAdapter.encodeWithTag(protoWriter, 3, prepurchaseAfterpayAppletData.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, prepurchaseAfterpayAppletData.footer_markdown);
        PrepurchaseAfterpayAppletData.AppletRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, prepurchaseAfterpayAppletData.applet_rows);
        PrepurchaseAfterpayAppletData.ButtonData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, prepurchaseAfterpayAppletData.button_stack);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, prepurchaseAfterpayAppletData.opaque_request_data);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, prepurchaseAfterpayAppletData.analytics_sheet_type);
        protoWriter.writeBytes(prepurchaseAfterpayAppletData.unknownFields());
    }
}
