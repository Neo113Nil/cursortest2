package com.squareup.protos.cash.discover.api.app.v1.model;

import app.cash.zipline.loader.ZiplineFile;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$OverlayCardItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ZiplineFile.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarOverlayCardSection.OverlayCardItem(companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new AvatarOverlayCardSection$OverlayCardItem$Content$Info((AvatarOverlayCardSection.InfoOverlayCardItem) AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new AvatarOverlayCardSection$OverlayCardItem$Content$Avatar((AvatarOverlayCardSection.AvatarOverlayCardItem) AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        reverseProtoWriter.getClass();
        overlayCardItem.getClass();
        reverseProtoWriter.writeBytes(overlayCardItem.unknownFields());
        ZiplineFile.Companion companion = overlayCardItem.content;
        if (companion instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) {
            AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) companion).value);
        } else if (companion instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) {
            AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) companion).value);
        } else {
            if (companion == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        overlayCardItem.getClass();
        int size$okio = overlayCardItem.unknownFields().getSize$okio();
        ZiplineFile.Companion companion = overlayCardItem.content;
        if (companion instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) {
            encodedSizeWithTag = AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.encodedSizeWithTag(1, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) companion).value);
        } else {
            if (!(companion instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar)) {
                if (companion == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.encodedSizeWithTag(2, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) companion).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        overlayCardItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        ZiplineFile.Companion companion = overlayCardItem.content;
        byteString.getClass();
        return new AvatarOverlayCardSection.OverlayCardItem(companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        overlayCardItem.getClass();
        ZiplineFile.Companion companion = overlayCardItem.content;
        if (companion instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) {
            AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.encodeWithTag(protoWriter, 1, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) companion).value);
        } else if (companion instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) {
            AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.encodeWithTag(protoWriter, 2, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(overlayCardItem.unknownFields());
    }
}
