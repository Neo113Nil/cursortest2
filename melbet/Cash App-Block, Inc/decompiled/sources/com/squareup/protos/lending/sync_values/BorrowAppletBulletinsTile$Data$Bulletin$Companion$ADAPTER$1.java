package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.SegmentedCircle;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowAppletBulletinsTile$Data$Bulletin$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        zzjg borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
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
        zzjg zzjgVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowAppletBulletinsTile.Data.Bulletin((BorrowAppletBulletinsTile.Data.Bulletin.Icon) obj5, (BorrowAppletBulletinsTile.Data.Bulletin.IconShape) obj6, (SegmentedCircle) obj7, (LocalizedString) obj8, (LocalizedString) obj9, (BorrowAppletBulletinsTile.Data.Bulletin.Accessory) obj10, zzjgVar, (Boolean) obj11, (String) obj12, (Color) obj13, (Float) obj14, (LocalizedString) obj15, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj5 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj7 = obj3;
                    obj6 = obj2;
                    break;
                case 2:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj8);
                    break;
                case 3:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    break;
                case 4:
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj5 = obj;
                        obj10 = BorrowAppletBulletinsTile.Data.Bulletin.Accessory.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    obj7 = obj3;
                    obj6 = obj2;
                    break;
                case 5:
                    obj4 = obj5;
                    borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet = new BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet((BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.ADAPTER.decode(protoReader));
                    obj5 = obj4;
                    zzjgVar = borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet;
                    break;
                case 6:
                    obj4 = obj5;
                    borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet = new BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl((String) ProtoAdapter.STRING.decode(protoReader));
                    obj5 = obj4;
                    zzjgVar = borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet;
                    break;
                case 7:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj13 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj13);
                    break;
                case 10:
                    try {
                        obj6 = BorrowAppletBulletinsTile.Data.Bulletin.IconShape.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj5;
                        obj2 = obj6;
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 11:
                    obj14 = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 12:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj6;
                    obj3 = obj7;
                    obj5 = obj;
                    obj7 = obj3;
                    obj6 = obj2;
                    break;
                case 13:
                    obj15 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj15);
                    break;
                case 14:
                    obj7 = TransactorKt.decodeMessageOrMerge(SegmentedCircle.ADAPTER, protoReader, obj7);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin bulletin = (BorrowAppletBulletinsTile.Data.Bulletin) obj;
        reverseProtoWriter.getClass();
        bulletin.getClass();
        reverseProtoWriter.writeBytes(bulletin.unknownFields());
        zzjg zzjgVar = bulletin.routing;
        if (zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) {
            BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) zzjgVar).value);
        } else if (zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) zzjgVar).value);
        } else if (zzjgVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, bulletin.accessibility_description);
        ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 11, bulletin.fill_percent);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 9, bulletin.override_tint_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, bulletin.identifier);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, bulletin.badged);
        BorrowAppletBulletinsTile.Data.Bulletin.Accessory.ADAPTER.encodeWithTag(reverseProtoWriter, 4, bulletin.accessory);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bulletin.detail_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bulletin.primary_text);
        SegmentedCircle.ADAPTER.encodeWithTag(reverseProtoWriter, 14, bulletin.segmented_circle);
        BorrowAppletBulletinsTile.Data.Bulletin.IconShape.ADAPTER.encodeWithTag(reverseProtoWriter, 10, bulletin.icon_shape);
        BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulletin.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        BorrowAppletBulletinsTile.Data.Bulletin bulletin = (BorrowAppletBulletinsTile.Data.Bulletin) obj;
        bulletin.getClass();
        int encodedSizeWithTag2 = SegmentedCircle.ADAPTER.encodedSizeWithTag(14, bulletin.segmented_circle) + BorrowAppletBulletinsTile.Data.Bulletin.IconShape.ADAPTER.encodedSizeWithTag(10, bulletin.icon_shape) + BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.encodedSizeWithTag(1, bulletin.icon) + bulletin.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = BorrowAppletBulletinsTile.Data.Bulletin.Accessory.ADAPTER.encodedSizeWithTag(4, bulletin.accessory) + protoAdapter.encodedSizeWithTag(3, bulletin.detail_text) + protoAdapter.encodedSizeWithTag(2, bulletin.primary_text) + encodedSizeWithTag2;
        zzjg zzjgVar = bulletin.routing;
        if (zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) {
            encodedSizeWithTag = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.ADAPTER.encodedSizeWithTag(5, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) zzjgVar).value);
        } else {
            if (!(zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl)) {
                if (zzjgVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(13, bulletin.accessibility_description) + ProtoAdapter.FLOAT.encodedSizeWithTag(11, bulletin.fill_percent) + Color.ADAPTER.encodedSizeWithTag(9, bulletin.override_tint_color) + ProtoAdapter.STRING.encodedSizeWithTag(8, bulletin.identifier) + ProtoAdapter.BOOL.encodedSizeWithTag(7, bulletin.badged) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(6, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) zzjgVar).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(13, bulletin.accessibility_description) + ProtoAdapter.FLOAT.encodedSizeWithTag(11, bulletin.fill_percent) + Color.ADAPTER.encodedSizeWithTag(9, bulletin.override_tint_color) + ProtoAdapter.STRING.encodedSizeWithTag(8, bulletin.identifier) + ProtoAdapter.BOOL.encodedSizeWithTag(7, bulletin.badged) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin bulletin = (BorrowAppletBulletinsTile.Data.Bulletin) obj;
        bulletin.getClass();
        SegmentedCircle segmentedCircle = bulletin.segmented_circle;
        SegmentedCircle segmentedCircle2 = segmentedCircle != null ? (SegmentedCircle) SegmentedCircle.ADAPTER.redact(segmentedCircle) : null;
        LocalizedString localizedString = bulletin.primary_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = bulletin.detail_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Color color = bulletin.override_tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizedString localizedString5 = bulletin.accessibility_description;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        BorrowAppletBulletinsTile.Data.Bulletin.Icon icon = bulletin.icon;
        BorrowAppletBulletinsTile.Data.Bulletin.IconShape iconShape = bulletin.icon_shape;
        BorrowAppletBulletinsTile.Data.Bulletin.Accessory accessory = bulletin.accessory;
        zzjg zzjgVar = bulletin.routing;
        Boolean bool = bulletin.badged;
        String str = bulletin.identifier;
        Float f = bulletin.fill_percent;
        byteString.getClass();
        return new BorrowAppletBulletinsTile.Data.Bulletin(icon, iconShape, segmentedCircle2, localizedString2, localizedString4, accessory, zzjgVar, bool, str, color2, f, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowAppletBulletinsTile.Data.Bulletin bulletin = (BorrowAppletBulletinsTile.Data.Bulletin) obj;
        bulletin.getClass();
        BorrowAppletBulletinsTile.Data.Bulletin.Icon.ADAPTER.encodeWithTag(protoWriter, 1, bulletin.icon);
        BorrowAppletBulletinsTile.Data.Bulletin.IconShape.ADAPTER.encodeWithTag(protoWriter, 10, bulletin.icon_shape);
        SegmentedCircle.ADAPTER.encodeWithTag(protoWriter, 14, bulletin.segmented_circle);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, bulletin.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 3, bulletin.detail_text);
        BorrowAppletBulletinsTile.Data.Bulletin.Accessory.ADAPTER.encodeWithTag(protoWriter, 4, bulletin.accessory);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, bulletin.badged);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 8, bulletin.identifier);
        Color.ADAPTER.encodeWithTag(protoWriter, 9, bulletin.override_tint_color);
        ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 11, bulletin.fill_percent);
        protoAdapter.encodeWithTag(protoWriter, 13, bulletin.accessibility_description);
        zzjg zzjgVar = bulletin.routing;
        if (zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) {
            BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.ADAPTER.encodeWithTag(protoWriter, 5, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) zzjgVar).value);
        } else if (zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) {
            protoAdapter2.encodeWithTag(protoWriter, 6, ((BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) zzjgVar).value);
        } else if (zzjgVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(bulletin.unknownFields());
    }
}
