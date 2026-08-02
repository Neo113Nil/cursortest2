package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.StackedImage;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/StackedImage$StackedImageContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/StackedImage$StackedImageContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StackedImage$StackedImageContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        StackedImage.StackedImageContent.Content content = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StackedImage.StackedImageContent(content, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                content = new StackedImage.StackedImageContent.Content.Text((StackedImage.StackedImageContent.TextContent) StackedImage.StackedImageContent.TextContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                content = new StackedImage.StackedImageContent.Content.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                content = new StackedImage.StackedImageContent.Content.Image((Image) Image.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StackedImage.StackedImageContent stackedImageContent = (StackedImage.StackedImageContent) obj;
        reverseProtoWriter.getClass();
        stackedImageContent.getClass();
        reverseProtoWriter.writeBytes(stackedImageContent.unknownFields());
        StackedImage.StackedImageContent.Content content = stackedImageContent.content;
        if (content instanceof StackedImage.StackedImageContent.Content.Text) {
            StackedImage.StackedImageContent.TextContent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((StackedImage.StackedImageContent.Content.Text) content).getValue());
            return;
        }
        if (content instanceof StackedImage.StackedImageContent.Content.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((StackedImage.StackedImageContent.Content.Avatar) content).getValue());
        } else if (content instanceof StackedImage.StackedImageContent.Content.Image) {
            Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((StackedImage.StackedImageContent.Content.Image) content).getValue());
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
        StackedImage.StackedImageContent stackedImageContent = (StackedImage.StackedImageContent) obj;
        stackedImageContent.getClass();
        int size$okio = stackedImageContent.unknownFields().getSize$okio();
        StackedImage.StackedImageContent.Content content = stackedImageContent.content;
        if (content instanceof StackedImage.StackedImageContent.Content.Text) {
            encodedSizeWithTag = StackedImage.StackedImageContent.TextContent.ADAPTER.encodedSizeWithTag(1, ((StackedImage.StackedImageContent.Content.Text) content).getValue());
        } else if (content instanceof StackedImage.StackedImageContent.Content.Avatar) {
            encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(2, ((StackedImage.StackedImageContent.Content.Avatar) content).getValue());
        } else {
            if (!(content instanceof StackedImage.StackedImageContent.Content.Image)) {
                if (content == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(3, ((StackedImage.StackedImageContent.Content.Image) content).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StackedImage.StackedImageContent stackedImageContent = (StackedImage.StackedImageContent) obj;
        stackedImageContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        StackedImage.StackedImageContent.Content content = stackedImageContent.content;
        byteString.getClass();
        return new StackedImage.StackedImageContent(content, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StackedImage.StackedImageContent stackedImageContent = (StackedImage.StackedImageContent) obj;
        stackedImageContent.getClass();
        StackedImage.StackedImageContent.Content content = stackedImageContent.content;
        if (content instanceof StackedImage.StackedImageContent.Content.Text) {
            StackedImage.StackedImageContent.TextContent.ADAPTER.encodeWithTag(protoWriter, 1, ((StackedImage.StackedImageContent.Content.Text) content).getValue());
        } else if (content instanceof StackedImage.StackedImageContent.Content.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 2, ((StackedImage.StackedImageContent.Content.Avatar) content).getValue());
        } else if (content instanceof StackedImage.StackedImageContent.Content.Image) {
            Image.ADAPTER.encodeWithTag(protoWriter, 3, ((StackedImage.StackedImageContent.Content.Image) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(stackedImageContent.unknownFields());
    }
}
