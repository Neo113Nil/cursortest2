package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InfoSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new InfoSheet((LocalizedString) obj, (LocalizedString) obj2, (AnalyticsEvent) obj3, (AnalyticsEvent) obj4, (Button) obj5, m, (UiAvatar) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    m.add(InfoSheet.TextContent.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InfoSheet infoSheet = (InfoSheet) obj;
        reverseProtoWriter.getClass();
        infoSheet.getClass();
        reverseProtoWriter.writeBytes(infoSheet.unknownFields());
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 7, infoSheet.avatar);
        InfoSheet.TextContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, infoSheet.text_content);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 5, infoSheet.cta_button);
        ProtoAdapter protoAdapter = AnalyticsEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, infoSheet.analytic_dismiss_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, infoSheet.analytic_view_event);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, infoSheet.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, infoSheet.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InfoSheet infoSheet = (InfoSheet) obj;
        infoSheet.getClass();
        int size$okio = infoSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, infoSheet.subtitle) + protoAdapter.encodedSizeWithTag(1, infoSheet.title) + size$okio;
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        return UiAvatar.ADAPTER.encodedSizeWithTag(7, infoSheet.avatar) + InfoSheet.TextContent.ADAPTER.asRepeated().encodedSizeWithTag(6, infoSheet.text_content) + Button.ADAPTER.encodedSizeWithTag(5, infoSheet.cta_button) + protoAdapter2.encodedSizeWithTag(4, infoSheet.analytic_dismiss_event) + protoAdapter2.encodedSizeWithTag(3, infoSheet.analytic_view_event) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InfoSheet infoSheet = (InfoSheet) obj;
        infoSheet.getClass();
        LocalizedString localizedString = infoSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = infoSheet.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        AnalyticsEvent analyticsEvent = infoSheet.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        AnalyticsEvent analyticsEvent3 = infoSheet.analytic_dismiss_event;
        AnalyticsEvent analyticsEvent4 = analyticsEvent3 != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent3) : null;
        Button button = infoSheet.cta_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(infoSheet.text_content, InfoSheet.TextContent.ADAPTER);
        UiAvatar uiAvatar = infoSheet.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InfoSheet(localizedString2, localizedString4, analyticsEvent2, analyticsEvent4, button2, m1169redactElements, uiAvatar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InfoSheet infoSheet = (InfoSheet) obj;
        infoSheet.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, infoSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 2, infoSheet.subtitle);
        ProtoAdapter protoAdapter2 = AnalyticsEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, infoSheet.analytic_view_event);
        protoAdapter2.encodeWithTag(protoWriter, 4, infoSheet.analytic_dismiss_event);
        Button.ADAPTER.encodeWithTag(protoWriter, 5, infoSheet.cta_button);
        InfoSheet.TextContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, infoSheet.text_content);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 7, infoSheet.avatar);
        protoWriter.writeBytes(infoSheet.unknownFields());
    }
}
