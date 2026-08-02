package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.layout.view.FlexboxHelpersKt;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
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
        FlexboxHelpersKt flexboxHelpersKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarOverlayCardSection.OverlayCardItem(flexboxHelpersKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                flexboxHelpersKt = new AvatarOverlayCardSection$OverlayCardItem$Content$Info((AvatarOverlayCardSection.InfoOverlayCardItem) AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                flexboxHelpersKt = new AvatarOverlayCardSection$OverlayCardItem$Content$Avatar((AvatarOverlayCardSection.AvatarOverlayCardItem) AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        reverseProtoWriter.getClass();
        overlayCardItem.getClass();
        reverseProtoWriter.writeBytes(overlayCardItem.unknownFields());
        FlexboxHelpersKt flexboxHelpersKt = overlayCardItem.content;
        if (flexboxHelpersKt instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) {
            AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) flexboxHelpersKt).value);
        } else if (flexboxHelpersKt instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) {
            AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) flexboxHelpersKt).value);
        } else {
            if (flexboxHelpersKt == null) {
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
        FlexboxHelpersKt flexboxHelpersKt = overlayCardItem.content;
        if (flexboxHelpersKt instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) {
            encodedSizeWithTag = AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.encodedSizeWithTag(1, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) flexboxHelpersKt).value);
        } else {
            if (!(flexboxHelpersKt instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar)) {
                if (flexboxHelpersKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.encodedSizeWithTag(2, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) flexboxHelpersKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        overlayCardItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        FlexboxHelpersKt flexboxHelpersKt = overlayCardItem.content;
        byteString.getClass();
        return new AvatarOverlayCardSection.OverlayCardItem(flexboxHelpersKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarOverlayCardSection.OverlayCardItem overlayCardItem = (AvatarOverlayCardSection.OverlayCardItem) obj;
        overlayCardItem.getClass();
        FlexboxHelpersKt flexboxHelpersKt = overlayCardItem.content;
        if (flexboxHelpersKt instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Info) {
            AvatarOverlayCardSection.InfoOverlayCardItem.ADAPTER.encodeWithTag(protoWriter, 1, ((AvatarOverlayCardSection$OverlayCardItem$Content$Info) flexboxHelpersKt).value);
        } else if (flexboxHelpersKt instanceof AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) {
            AvatarOverlayCardSection.AvatarOverlayCardItem.ADAPTER.encodeWithTag(protoWriter, 2, ((AvatarOverlayCardSection$OverlayCardItem$Content$Avatar) flexboxHelpersKt).value);
        } else if (flexboxHelpersKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(overlayCardItem.unknownFields());
    }
}
