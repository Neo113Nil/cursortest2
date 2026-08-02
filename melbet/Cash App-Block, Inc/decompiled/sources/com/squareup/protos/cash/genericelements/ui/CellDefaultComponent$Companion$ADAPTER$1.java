package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import coil3.svg.internal.Utils_androidKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CellDefaultComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ?? r0;
        String str;
        CellDefaultComponent.Type type2;
        String str2;
        Utils_androidKt cellDefaultComponent$AccessoryType$Push;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        String str4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        CellDefaultComponent.Type type3 = null;
        String str5 = null;
        String str6 = null;
        ArcadeTextElement.SemanticTextColor semanticTextColor = null;
        Utils_androidKt utils_androidKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CellDefaultComponent((Action) obj, (BaseElement) obj2, str3, (Color) obj3, (Color) obj4, str4, (BaseElement) obj5, (BaseElement) obj6, (BaseElement) obj7, type3, utils_androidKt, str5, str6, semanticTextColor, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                switch (nextTag) {
                    case 4:
                        obj2 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj2);
                        break;
                    case 5:
                        r0 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
                        break;
                    case 7:
                        obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                        break;
                    case 8:
                        str4 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 9:
                        obj5 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj5);
                        break;
                    case 10:
                        obj6 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj6);
                        break;
                    case 11:
                        obj7 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj7);
                        break;
                    case 12:
                        str = str4;
                        type2 = type3;
                        str2 = str5;
                        try {
                            type3 = CellDefaultComponent.Type.ADAPTER.decode(protoReader);
                            str4 = str;
                            str5 = str2;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                    case 13:
                        cellDefaultComponent$AccessoryType$Push = new CellDefaultComponent$AccessoryType$Push(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                        utils_androidKt = cellDefaultComponent$AccessoryType$Push;
                        break;
                    case 14:
                        cellDefaultComponent$AccessoryType$Push = new CellDefaultComponent$AccessoryType$PushLabel((String) ProtoAdapter.STRING.decode(protoReader));
                        utils_androidKt = cellDefaultComponent$AccessoryType$Push;
                        break;
                    case 15:
                        str5 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 16:
                        str6 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 17:
                        try {
                            semanticTextColor = ArcadeTextElement.SemanticTextColor.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            str = str4;
                            type2 = type3;
                            str2 = str5;
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    default:
                        protoReader.readUnknownField(nextTag);
                        str = str4;
                        type2 = type3;
                        str2 = str5;
                        r0 = str3;
                        str4 = str;
                        type3 = type2;
                        str5 = str2;
                        break;
                }
                str3 = r0;
            } else {
                obj = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj);
            }
            r0 = str3;
            str3 = r0;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CellDefaultComponent cellDefaultComponent = (CellDefaultComponent) obj;
        reverseProtoWriter.getClass();
        cellDefaultComponent.getClass();
        reverseProtoWriter.writeBytes(cellDefaultComponent.unknownFields());
        Utils_androidKt utils_androidKt = cellDefaultComponent.accessoryType;
        if (utils_androidKt instanceof CellDefaultComponent$AccessoryType$Push) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 13, Boolean.valueOf(((CellDefaultComponent$AccessoryType$Push) utils_androidKt).value));
        } else if (utils_androidKt instanceof CellDefaultComponent$AccessoryType$PushLabel) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 14, ((CellDefaultComponent$AccessoryType$PushLabel) utils_androidKt).value);
        } else if (utils_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ArcadeTextElement.SemanticTextColor.ADAPTER.encodeWithTag(reverseProtoWriter, 17, cellDefaultComponent.body_text_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, cellDefaultComponent.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, cellDefaultComponent.label_text);
        CellDefaultComponent.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 12, cellDefaultComponent.f1266type);
        ProtoAdapter protoAdapter2 = BaseElement.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, cellDefaultComponent.accessory);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, cellDefaultComponent.body);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, cellDefaultComponent.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cellDefaultComponent.icon_description);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, cellDefaultComponent.icon_background);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, cellDefaultComponent.icon_tint);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cellDefaultComponent.icon_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, cellDefaultComponent.icon);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cellDefaultComponent.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CellDefaultComponent cellDefaultComponent = (CellDefaultComponent) obj;
        cellDefaultComponent.getClass();
        int encodedSizeWithTag = Action.ADAPTER.encodedSizeWithTag(1, cellDefaultComponent.action) + cellDefaultComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, cellDefaultComponent.icon) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(5, cellDefaultComponent.icon_id) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        int encodedSizeWithTag4 = CellDefaultComponent.Type.ADAPTER.encodedSizeWithTag(12, cellDefaultComponent.f1266type) + protoAdapter.encodedSizeWithTag(11, cellDefaultComponent.accessory) + protoAdapter.encodedSizeWithTag(10, cellDefaultComponent.body) + protoAdapter.encodedSizeWithTag(9, cellDefaultComponent.label) + protoAdapter2.encodedSizeWithTag(8, cellDefaultComponent.icon_description) + protoAdapter3.encodedSizeWithTag(7, cellDefaultComponent.icon_background) + protoAdapter3.encodedSizeWithTag(6, cellDefaultComponent.icon_tint) + encodedSizeWithTag3;
        Utils_androidKt utils_androidKt = cellDefaultComponent.accessoryType;
        if (utils_androidKt instanceof CellDefaultComponent$AccessoryType$Push) {
            encodedSizeWithTag4 = SizeMode$EnumUnboxingLocalUtility.m(((CellDefaultComponent$AccessoryType$Push) utils_androidKt).value, ProtoAdapter.BOOL, 13, encodedSizeWithTag4);
        } else if (utils_androidKt instanceof CellDefaultComponent$AccessoryType$PushLabel) {
            encodedSizeWithTag4 += protoAdapter2.encodedSizeWithTag(14, ((CellDefaultComponent$AccessoryType$PushLabel) utils_androidKt).value);
        } else if (utils_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return ArcadeTextElement.SemanticTextColor.ADAPTER.encodedSizeWithTag(17, cellDefaultComponent.body_text_color) + protoAdapter2.encodedSizeWithTag(16, cellDefaultComponent.body_text) + protoAdapter2.encodedSizeWithTag(15, cellDefaultComponent.label_text) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CellDefaultComponent cellDefaultComponent = (CellDefaultComponent) obj;
        cellDefaultComponent.getClass();
        Action action = cellDefaultComponent.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        BaseElement baseElement = cellDefaultComponent.icon;
        BaseElement baseElement2 = baseElement != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement) : null;
        Color color = cellDefaultComponent.icon_tint;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = cellDefaultComponent.icon_background;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        BaseElement baseElement3 = cellDefaultComponent.label;
        BaseElement baseElement4 = baseElement3 != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement3) : null;
        BaseElement baseElement5 = cellDefaultComponent.body;
        BaseElement baseElement6 = baseElement5 != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement5) : null;
        BaseElement baseElement7 = cellDefaultComponent.accessory;
        BaseElement baseElement8 = baseElement7 != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cellDefaultComponent.icon_id;
        String str2 = cellDefaultComponent.icon_description;
        CellDefaultComponent.Type type2 = cellDefaultComponent.f1266type;
        Utils_androidKt utils_androidKt = cellDefaultComponent.accessoryType;
        String str3 = cellDefaultComponent.label_text;
        String str4 = cellDefaultComponent.body_text;
        ArcadeTextElement.SemanticTextColor semanticTextColor = cellDefaultComponent.body_text_color;
        byteString.getClass();
        return new CellDefaultComponent(action2, baseElement2, str, color2, color4, str2, baseElement4, baseElement6, baseElement8, type2, utils_androidKt, str3, str4, semanticTextColor, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CellDefaultComponent cellDefaultComponent = (CellDefaultComponent) obj;
        cellDefaultComponent.getClass();
        Action.ADAPTER.encodeWithTag(protoWriter, 1, cellDefaultComponent.action);
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, cellDefaultComponent.icon);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 5, cellDefaultComponent.icon_id);
        ProtoAdapter protoAdapter3 = Color.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 6, cellDefaultComponent.icon_tint);
        protoAdapter3.encodeWithTag(protoWriter, 7, cellDefaultComponent.icon_background);
        protoAdapter2.encodeWithTag(protoWriter, 8, cellDefaultComponent.icon_description);
        protoAdapter.encodeWithTag(protoWriter, 9, cellDefaultComponent.label);
        protoAdapter.encodeWithTag(protoWriter, 10, cellDefaultComponent.body);
        protoAdapter.encodeWithTag(protoWriter, 11, cellDefaultComponent.accessory);
        CellDefaultComponent.Type.ADAPTER.encodeWithTag(protoWriter, 12, cellDefaultComponent.f1266type);
        protoAdapter2.encodeWithTag(protoWriter, 15, cellDefaultComponent.label_text);
        protoAdapter2.encodeWithTag(protoWriter, 16, cellDefaultComponent.body_text);
        ArcadeTextElement.SemanticTextColor.ADAPTER.encodeWithTag(protoWriter, 17, cellDefaultComponent.body_text_color);
        Utils_androidKt utils_androidKt = cellDefaultComponent.accessoryType;
        if (utils_androidKt instanceof CellDefaultComponent$AccessoryType$Push) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, Boolean.valueOf(((CellDefaultComponent$AccessoryType$Push) utils_androidKt).value));
        } else if (utils_androidKt instanceof CellDefaultComponent$AccessoryType$PushLabel) {
            protoAdapter2.encodeWithTag(protoWriter, 14, ((CellDefaultComponent$AccessoryType$PushLabel) utils_androidKt).value);
        } else if (utils_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cellDefaultComponent.unknownFields());
    }
}
