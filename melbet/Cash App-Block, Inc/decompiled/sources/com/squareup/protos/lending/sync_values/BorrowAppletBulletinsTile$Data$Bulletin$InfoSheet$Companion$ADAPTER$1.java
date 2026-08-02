package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        long j;
        Object obj2;
        ArrayList arrayList;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                Object obj18 = obj13;
                return new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet((BorrowAppletBulletinsTile.Data.Bulletin.Icon) obj4, (Image) obj6, (LocalizedString) obj7, (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment) obj15, (LocalizedString) obj9, (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment) obj17, m, (Timeline) obj10, (LocalizedString) obj11, (LocalizedString) obj12, (String) obj18, (LoanRepaymentSelectionData) obj14, (LocalizedString) obj5, (Color) obj8, (Boolean) obj16, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj2 = obj7;
                    try {
                        obj3 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj7 = obj2;
                    obj13 = obj;
                    break;
                case 2:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 3:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 4:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj2 = obj7;
                    arrayList.add(BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.ADAPTER.decode(protoReader));
                    obj3 = obj4;
                    obj7 = obj2;
                    obj13 = obj;
                    break;
                case 5:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 6:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj11 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj11);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 7:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj12);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 8:
                    j = beginMessage;
                    arrayList = m;
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    obj3 = obj4;
                    break;
                case 9:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 10:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj6 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj6);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 11:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj16 = ProtoAdapter.BOOL.decode(protoReader);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 12:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj10 = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, protoReader, obj10);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 13:
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj14 = TransactorKt.decodeMessageOrMerge(LoanRepaymentSelectionData.ADAPTER, protoReader, obj14);
                    obj13 = obj;
                    obj3 = obj4;
                    break;
                case 14:
                    j = beginMessage;
                    obj = obj13;
                    try {
                        obj15 = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.ADAPTER.decode(protoReader);
                        arrayList = m;
                        obj13 = obj;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj2 = obj7;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 15:
                    try {
                        obj17 = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.ADAPTER.decode(protoReader);
                        j = beginMessage;
                        arrayList = m;
                        obj3 = obj4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj13;
                        j = beginMessage;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        obj2 = obj7;
                        arrayList = m;
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    j = beginMessage;
                    arrayList = m;
                    obj = obj13;
                    obj2 = obj7;
                    obj3 = obj4;
                    obj7 = obj2;
                    obj13 = obj;
                    break;
            }
            obj4 = obj3;
            m = arrayList;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) obj;
        reverseProtoWriter.getClass();
        infoSheet.getClass();
        reverseProtoWriter.writeBytes(infoSheet.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, infoSheet.render_as_modal);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 9, infoSheet.tint_color);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, infoSheet.dismiss_button_text);
        LoanRepaymentSelectionData.ADAPTER.encodeWithTag(reverseProtoWriter, 13, infoSheet.primary_repayment_selection);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, infoSheet.primary_action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, infoSheet.primary_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, infoSheet.footer_text);
        Timeline.ADAPTER.encodeWithTag(reverseProtoWriter, 12, infoSheet.timeline);
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, infoSheet.bullets);
        BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.ADAPTER;
        borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 15, infoSheet.detail_text_alignment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, infoSheet.detail_text);
        borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 14, infoSheet.primary_text_alignment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, infoSheet.primary_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 10, infoSheet.image);
        BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, infoSheet.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) obj;
        infoSheet.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(10, infoSheet.image) + BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.encodedSizeWithTag(1, infoSheet.icon) + infoSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, infoSheet.primary_text) + encodedSizeWithTag;
        BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(11, infoSheet.render_as_modal) + Color.ADAPTER.encodedSizeWithTag(9, infoSheet.tint_color) + protoAdapter.encodedSizeWithTag(5, infoSheet.dismiss_button_text) + LoanRepaymentSelectionData.ADAPTER.encodedSizeWithTag(13, infoSheet.primary_repayment_selection) + ProtoAdapter.STRING.encodedSizeWithTag(8, infoSheet.primary_action_url) + protoAdapter.encodedSizeWithTag(7, infoSheet.primary_button_text) + protoAdapter.encodedSizeWithTag(6, infoSheet.footer_text) + Timeline.ADAPTER.encodedSizeWithTag(12, infoSheet.timeline) + BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.ADAPTER.asRepeated().encodedSizeWithTag(4, infoSheet.bullets) + borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1.encodedSizeWithTag(15, infoSheet.detail_text_alignment) + protoAdapter.encodedSizeWithTag(3, infoSheet.detail_text) + borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1.encodedSizeWithTag(14, infoSheet.primary_text_alignment) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) obj;
        infoSheet.getClass();
        Image image = infoSheet.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = infoSheet.primary_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = infoSheet.detail_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(infoSheet.bullets, BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.ADAPTER);
        Timeline timeline = infoSheet.timeline;
        Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
        LocalizedString localizedString5 = infoSheet.footer_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = infoSheet.primary_button_text;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LoanRepaymentSelectionData loanRepaymentSelectionData = infoSheet.primary_repayment_selection;
        LoanRepaymentSelectionData loanRepaymentSelectionData2 = loanRepaymentSelectionData != null ? (LoanRepaymentSelectionData) LoanRepaymentSelectionData.ADAPTER.redact(loanRepaymentSelectionData) : null;
        LocalizedString localizedString9 = infoSheet.dismiss_button_text;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        Color color = infoSheet.tint_color;
        return BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.copy$default(infoSheet, image2, localizedString2, localizedString4, m1169redactElements, timeline2, localizedString6, localizedString8, loanRepaymentSelectionData2, localizedString10, color != null ? (Color) Color.ADAPTER.redact(color) : null, ByteString.EMPTY, 17449);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) obj;
        infoSheet.getClass();
        BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.encodeWithTag(protoWriter, 1, infoSheet.icon);
        Image.ADAPTER.encodeWithTag(protoWriter, 10, infoSheet.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, infoSheet.primary_text);
        BorrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1 = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.ADAPTER;
        borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1.encodeWithTag(protoWriter, 14, infoSheet.primary_text_alignment);
        protoAdapter.encodeWithTag(protoWriter, 3, infoSheet.detail_text);
        borrowAppletBulletinsTile$Data$Bulletin$InfoSheet$TextAlignment$Companion$ADAPTER$1.encodeWithTag(protoWriter, 15, infoSheet.detail_text_alignment);
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, infoSheet.bullets);
        Timeline.ADAPTER.encodeWithTag(protoWriter, 12, infoSheet.timeline);
        protoAdapter.encodeWithTag(protoWriter, 6, infoSheet.footer_text);
        protoAdapter.encodeWithTag(protoWriter, 7, infoSheet.primary_button_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, infoSheet.primary_action_url);
        LoanRepaymentSelectionData.ADAPTER.encodeWithTag(protoWriter, 13, infoSheet.primary_repayment_selection);
        protoAdapter.encodeWithTag(protoWriter, 5, infoSheet.dismiss_button_text);
        Color.ADAPTER.encodeWithTag(protoWriter, 9, infoSheet.tint_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, infoSheet.render_as_modal);
        protoWriter.writeBytes(infoSheet.unknownFields());
    }
}
