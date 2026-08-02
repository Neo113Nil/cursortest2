package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.ProgressRing;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressRing$ProgressRingContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ProgressRing.ProgressRingContent.Content content = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProgressRing.ProgressRingContent(content, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                content = new ProgressRing.ProgressRingContent.Content.Text((ProgressRing.ProgressRingContent.TextContent) ProgressRing.ProgressRingContent.TextContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                content = new ProgressRing.ProgressRingContent.Content.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                content = new ProgressRing.ProgressRingContent.Content.Image((Image) Image.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProgressRing.ProgressRingContent progressRingContent = (ProgressRing.ProgressRingContent) obj;
        reverseProtoWriter.getClass();
        progressRingContent.getClass();
        reverseProtoWriter.writeBytes(progressRingContent.unknownFields());
        ProgressRing.ProgressRingContent.Content content = progressRingContent.content;
        if (content instanceof ProgressRing.ProgressRingContent.Content.Text) {
            ProgressRing.ProgressRingContent.TextContent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ProgressRing.ProgressRingContent.Content.Text) content).getValue());
            return;
        }
        if (content instanceof ProgressRing.ProgressRingContent.Content.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ProgressRing.ProgressRingContent.Content.Avatar) content).getValue());
        } else if (content instanceof ProgressRing.ProgressRingContent.Content.Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ProgressRing.ProgressRingContent.Content.Image) content).getValue());
        } else {
            if (content == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ProgressRing.ProgressRingContent progressRingContent = (ProgressRing.ProgressRingContent) obj;
        progressRingContent.getClass();
        int size$okio = progressRingContent.unknownFields().getSize$okio();
        ProgressRing.ProgressRingContent.Content content = progressRingContent.content;
        if (content instanceof ProgressRing.ProgressRingContent.Content.Text) {
            encodedSizeWithTag = ProgressRing.ProgressRingContent.TextContent.ADAPTER.encodedSizeWithTag(1, ((ProgressRing.ProgressRingContent.Content.Text) content).getValue());
        } else if (content instanceof ProgressRing.ProgressRingContent.Content.Avatar) {
            encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(2, ((ProgressRing.ProgressRingContent.Content.Avatar) content).getValue());
        } else {
            if (!(content instanceof ProgressRing.ProgressRingContent.Content.Image)) {
                if (content == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(3, ((ProgressRing.ProgressRingContent.Content.Image) content).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProgressRing.ProgressRingContent progressRingContent = (ProgressRing.ProgressRingContent) obj;
        progressRingContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        ProgressRing.ProgressRingContent.Content content = progressRingContent.content;
        byteString.getClass();
        return new ProgressRing.ProgressRingContent(content, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProgressRing.ProgressRingContent progressRingContent = (ProgressRing.ProgressRingContent) obj;
        progressRingContent.getClass();
        ProgressRing.ProgressRingContent.Content content = progressRingContent.content;
        if (content instanceof ProgressRing.ProgressRingContent.Content.Text) {
            ProgressRing.ProgressRingContent.TextContent.ADAPTER.encodeWithTag(protoWriter, 1, ((ProgressRing.ProgressRingContent.Content.Text) content).getValue());
        } else if (content instanceof ProgressRing.ProgressRingContent.Content.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 2, ((ProgressRing.ProgressRingContent.Content.Avatar) content).getValue());
        } else if (content instanceof ProgressRing.ProgressRingContent.Content.Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 3, ((ProgressRing.ProgressRingContent.Content.Image) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(progressRingContent.unknownFields());
    }
}
