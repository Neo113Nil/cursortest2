package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import coil3.size.ViewSizeResolverKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CellActivityComponent$Companion$ADAPTER$1 extends ProtoAdapter {
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
        ViewSizeResolverKt viewSizeResolverKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CellActivityComponent((BaseElement) obj, (String) obj2, (BaseElement) obj3, viewSizeResolverKt, (Action) obj4, (String) obj5, (String) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(BaseElement.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    viewSizeResolverKt = new CellActivityComponent$AccessoryType$Push(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    break;
                case 5:
                    viewSizeResolverKt = new CellActivityComponent$AccessoryType$Amount((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(Action.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CellActivityComponent cellActivityComponent = (CellActivityComponent) obj;
        reverseProtoWriter.getClass();
        cellActivityComponent.getClass();
        reverseProtoWriter.writeBytes(cellActivityComponent.unknownFields());
        ViewSizeResolverKt viewSizeResolverKt = cellActivityComponent.accessoryType;
        if (viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Push) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, Boolean.valueOf(((CellActivityComponent$AccessoryType$Push) viewSizeResolverKt).value));
        } else if (viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Amount) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, ((CellActivityComponent$AccessoryType$Amount) viewSizeResolverKt).value);
        } else if (viewSizeResolverKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, cellActivityComponent.forceCenterAlignment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cellActivityComponent.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cellActivityComponent.body);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 6, cellActivityComponent.onClick);
        ProtoAdapter protoAdapter2 = BaseElement.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, cellActivityComponent.accessory);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cellActivityComponent.label);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cellActivityComponent.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CellActivityComponent cellActivityComponent = (CellActivityComponent) obj;
        cellActivityComponent.getClass();
        int size$okio = cellActivityComponent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, cellActivityComponent.avatar) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, cellActivityComponent.accessory) + protoAdapter2.encodedSizeWithTag(2, cellActivityComponent.label) + encodedSizeWithTag;
        ViewSizeResolverKt viewSizeResolverKt = cellActivityComponent.accessoryType;
        if (viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Push) {
            encodedSizeWithTag2 = SizeMode$EnumUnboxingLocalUtility.m(((CellActivityComponent$AccessoryType$Push) viewSizeResolverKt).value, ProtoAdapter.BOOL, 4, encodedSizeWithTag2);
        } else if (viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Amount) {
            encodedSizeWithTag2 += protoAdapter2.encodedSizeWithTag(5, ((CellActivityComponent$AccessoryType$Amount) viewSizeResolverKt).value);
        } else if (viewSizeResolverKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return ProtoAdapter.BOOL.encodedSizeWithTag(9, cellActivityComponent.forceCenterAlignment) + protoAdapter2.encodedSizeWithTag(8, cellActivityComponent.status) + protoAdapter2.encodedSizeWithTag(7, cellActivityComponent.body) + Action.ADAPTER.encodedSizeWithTag(6, cellActivityComponent.onClick) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CellActivityComponent cellActivityComponent = (CellActivityComponent) obj;
        cellActivityComponent.getClass();
        BaseElement baseElement = cellActivityComponent.avatar;
        BaseElement baseElement2 = baseElement != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement) : null;
        BaseElement baseElement3 = cellActivityComponent.accessory;
        BaseElement baseElement4 = baseElement3 != null ? (BaseElement) BaseElement.ADAPTER.redact(baseElement3) : null;
        Action action = cellActivityComponent.onClick;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cellActivityComponent.label;
        ViewSizeResolverKt viewSizeResolverKt = cellActivityComponent.accessoryType;
        String str2 = cellActivityComponent.body;
        String str3 = cellActivityComponent.status;
        Boolean bool = cellActivityComponent.forceCenterAlignment;
        byteString.getClass();
        return new CellActivityComponent(baseElement2, str, baseElement4, viewSizeResolverKt, action2, str2, str3, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CellActivityComponent cellActivityComponent = (CellActivityComponent) obj;
        cellActivityComponent.getClass();
        ProtoAdapter protoAdapter = BaseElement.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, cellActivityComponent.avatar);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, cellActivityComponent.label);
        protoAdapter.encodeWithTag(protoWriter, 3, cellActivityComponent.accessory);
        Action.ADAPTER.encodeWithTag(protoWriter, 6, cellActivityComponent.onClick);
        protoAdapter2.encodeWithTag(protoWriter, 7, cellActivityComponent.body);
        protoAdapter2.encodeWithTag(protoWriter, 8, cellActivityComponent.status);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 9, cellActivityComponent.forceCenterAlignment);
        ViewSizeResolverKt viewSizeResolverKt = cellActivityComponent.accessoryType;
        if (viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Push) {
            protoAdapter3.encodeWithTag(protoWriter, 4, Boolean.valueOf(((CellActivityComponent$AccessoryType$Push) viewSizeResolverKt).value));
        } else if (viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Amount) {
            protoAdapter2.encodeWithTag(protoWriter, 5, ((CellActivityComponent$AccessoryType$Amount) viewSizeResolverKt).value);
        } else if (viewSizeResolverKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(cellActivityComponent.unknownFields());
    }
}
