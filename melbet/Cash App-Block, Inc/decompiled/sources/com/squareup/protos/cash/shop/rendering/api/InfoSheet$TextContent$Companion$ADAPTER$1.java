package com.squareup.protos.cash.shop.rendering.api;

import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InfoSheet$TextContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzkv zzkvVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InfoSheet.TextContent(zzkvVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkvVar = new InfoSheet$TextContent$Content$TextBulletList((InfoSheet.TextBulletList) InfoSheet.TextBulletList.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                zzkvVar = new InfoSheet$TextContent$Content$TextLine((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkvVar = new InfoSheet$TextContent$Content$NumberedList((InfoSheet.NumberedList) InfoSheet.NumberedList.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InfoSheet.TextContent textContent = (InfoSheet.TextContent) obj;
        reverseProtoWriter.getClass();
        textContent.getClass();
        reverseProtoWriter.writeBytes(textContent.unknownFields());
        zzkv zzkvVar = textContent.content;
        if (zzkvVar instanceof InfoSheet$TextContent$Content$TextBulletList) {
            InfoSheet.TextBulletList.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((InfoSheet$TextContent$Content$TextBulletList) zzkvVar).value);
            return;
        }
        if (zzkvVar instanceof InfoSheet$TextContent$Content$TextLine) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((InfoSheet$TextContent$Content$TextLine) zzkvVar).value);
        } else if (zzkvVar instanceof InfoSheet$TextContent$Content$NumberedList) {
            InfoSheet.NumberedList.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((InfoSheet$TextContent$Content$NumberedList) zzkvVar).value);
        } else {
            if (zzkvVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        InfoSheet.TextContent textContent = (InfoSheet.TextContent) obj;
        textContent.getClass();
        int size$okio = textContent.unknownFields().getSize$okio();
        zzkv zzkvVar = textContent.content;
        if (zzkvVar instanceof InfoSheet$TextContent$Content$TextBulletList) {
            encodedSizeWithTag = InfoSheet.TextBulletList.ADAPTER.encodedSizeWithTag(1, ((InfoSheet$TextContent$Content$TextBulletList) zzkvVar).value);
        } else if (zzkvVar instanceof InfoSheet$TextContent$Content$TextLine) {
            encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(2, ((InfoSheet$TextContent$Content$TextLine) zzkvVar).value);
        } else {
            if (!(zzkvVar instanceof InfoSheet$TextContent$Content$NumberedList)) {
                if (zzkvVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = InfoSheet.NumberedList.ADAPTER.encodedSizeWithTag(3, ((InfoSheet$TextContent$Content$NumberedList) zzkvVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InfoSheet.TextContent textContent = (InfoSheet.TextContent) obj;
        textContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzkv zzkvVar = textContent.content;
        byteString.getClass();
        return new InfoSheet.TextContent(zzkvVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InfoSheet.TextContent textContent = (InfoSheet.TextContent) obj;
        textContent.getClass();
        zzkv zzkvVar = textContent.content;
        if (zzkvVar instanceof InfoSheet$TextContent$Content$TextBulletList) {
            InfoSheet.TextBulletList.ADAPTER.encodeWithTag(protoWriter, 1, ((InfoSheet$TextContent$Content$TextBulletList) zzkvVar).value);
        } else if (zzkvVar instanceof InfoSheet$TextContent$Content$TextLine) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, ((InfoSheet$TextContent$Content$TextLine) zzkvVar).value);
        } else if (zzkvVar instanceof InfoSheet$TextContent$Content$NumberedList) {
            InfoSheet.NumberedList.ADAPTER.encodeWithTag(protoWriter, 3, ((InfoSheet$TextContent$Content$NumberedList) zzkvVar).value);
        } else if (zzkvVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(textContent.unknownFields());
    }
}
