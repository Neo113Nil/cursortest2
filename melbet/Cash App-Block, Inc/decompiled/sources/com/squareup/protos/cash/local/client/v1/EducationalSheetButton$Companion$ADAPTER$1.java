package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EducationalSheetButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhs zzhsVar = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EducationalSheetButton(zzhsVar, (String) obj, (EducationalSheetButton.Style) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    zzhsVar = new EducationalSheetButton$Action$Finish(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
                    break;
                case 2:
                    zzhsVar = new EducationalSheetButton$Action$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 3:
                    zzhsVar = new EducationalSheetButton$Action$PaginatedSheet((PaginatedSheet) PaginatedSheet.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj2 = EducationalSheetButton.Style.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    zzhsVar = new EducationalSheetButton$Action$Shortlink((ShortlinkAction) ShortlinkAction.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EducationalSheetButton educationalSheetButton = (EducationalSheetButton) obj;
        reverseProtoWriter.getClass();
        educationalSheetButton.getClass();
        reverseProtoWriter.writeBytes(educationalSheetButton.unknownFields());
        zzhs zzhsVar = educationalSheetButton.action;
        if (zzhsVar instanceof EducationalSheetButton$Action$Finish) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, Boolean.valueOf(((EducationalSheetButton$Action$Finish) zzhsVar).value));
        } else if (zzhsVar instanceof EducationalSheetButton$Action$ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, ((EducationalSheetButton$Action$ClientRoute) zzhsVar).value);
        } else if (zzhsVar instanceof EducationalSheetButton$Action$PaginatedSheet) {
            PaginatedSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((EducationalSheetButton$Action$PaginatedSheet) zzhsVar).value);
        } else if (zzhsVar instanceof EducationalSheetButton$Action$Shortlink) {
            ShortlinkAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((EducationalSheetButton$Action$Shortlink) zzhsVar).value);
        } else if (zzhsVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        EducationalSheetButton.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 5, educationalSheetButton.style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, educationalSheetButton.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EducationalSheetButton educationalSheetButton = (EducationalSheetButton) obj;
        educationalSheetButton.getClass();
        int size$okio = educationalSheetButton.unknownFields().getSize$okio();
        zzhs zzhsVar = educationalSheetButton.action;
        if (zzhsVar instanceof EducationalSheetButton$Action$Finish) {
            size$okio = SizeMode$EnumUnboxingLocalUtility.m(((EducationalSheetButton$Action$Finish) zzhsVar).value, ProtoAdapter.BOOL, 1, size$okio);
        } else {
            if (zzhsVar instanceof EducationalSheetButton$Action$ClientRoute) {
                encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(2, ((EducationalSheetButton$Action$ClientRoute) zzhsVar).value);
            } else if (zzhsVar instanceof EducationalSheetButton$Action$PaginatedSheet) {
                encodedSizeWithTag = PaginatedSheet.ADAPTER.encodedSizeWithTag(3, ((EducationalSheetButton$Action$PaginatedSheet) zzhsVar).value);
            } else if (zzhsVar instanceof EducationalSheetButton$Action$Shortlink) {
                encodedSizeWithTag = ShortlinkAction.ADAPTER.encodedSizeWithTag(6, ((EducationalSheetButton$Action$Shortlink) zzhsVar).value);
            } else if (zzhsVar != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            size$okio += encodedSizeWithTag;
        }
        return EducationalSheetButton.Style.ADAPTER.encodedSizeWithTag(5, educationalSheetButton.style) + ProtoAdapter.STRING.encodedSizeWithTag(4, educationalSheetButton.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EducationalSheetButton educationalSheetButton = (EducationalSheetButton) obj;
        educationalSheetButton.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhs zzhsVar = educationalSheetButton.action;
        String str = educationalSheetButton.label;
        EducationalSheetButton.Style style = educationalSheetButton.style;
        byteString.getClass();
        return new EducationalSheetButton(zzhsVar, str, style, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EducationalSheetButton educationalSheetButton = (EducationalSheetButton) obj;
        educationalSheetButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, educationalSheetButton.label);
        EducationalSheetButton.Style.ADAPTER.encodeWithTag(protoWriter, 5, educationalSheetButton.style);
        zzhs zzhsVar = educationalSheetButton.action;
        if (zzhsVar instanceof EducationalSheetButton$Action$Finish) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, Boolean.valueOf(((EducationalSheetButton$Action$Finish) zzhsVar).value));
        } else if (zzhsVar instanceof EducationalSheetButton$Action$ClientRoute) {
            protoAdapter.encodeWithTag(protoWriter, 2, ((EducationalSheetButton$Action$ClientRoute) zzhsVar).value);
        } else if (zzhsVar instanceof EducationalSheetButton$Action$PaginatedSheet) {
            PaginatedSheet.ADAPTER.encodeWithTag(protoWriter, 3, ((EducationalSheetButton$Action$PaginatedSheet) zzhsVar).value);
        } else if (zzhsVar instanceof EducationalSheetButton$Action$Shortlink) {
            ShortlinkAction.ADAPTER.encodeWithTag(protoWriter, 6, ((EducationalSheetButton$Action$Shortlink) zzhsVar).value);
        } else if (zzhsVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(educationalSheetButton.unknownFields());
    }
}
