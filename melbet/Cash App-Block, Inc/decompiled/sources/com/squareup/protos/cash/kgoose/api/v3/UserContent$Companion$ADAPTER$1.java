package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.protos.cash.kgoose.api.v3.UserContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/UserContent$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        UserContent.Content content = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserContent(content, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                content = new UserContent.Content.Text((TextContent) TextContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                content = new UserContent.Content.Image((ImageContent) ImageContent.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                content = new UserContent.Content.ClientRenderable((ClientRenderable) ClientRenderable.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                content = new UserContent.Content.StructuredContent((StructuredContent) StructuredContent.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                content = new UserContent.Content.Resource((EmbeddedResource) EmbeddedResource.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserContent userContent = (UserContent) obj;
        reverseProtoWriter.getClass();
        userContent.getClass();
        reverseProtoWriter.writeBytes(userContent.unknownFields());
        UserContent.Content content = userContent.content;
        if (content instanceof UserContent.Content.Text) {
            TextContent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((UserContent.Content.Text) content).getValue());
            return;
        }
        if (content instanceof UserContent.Content.Image) {
            ImageContent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((UserContent.Content.Image) content).getValue());
            return;
        }
        if (content instanceof UserContent.Content.ClientRenderable) {
            ClientRenderable.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((UserContent.Content.ClientRenderable) content).getValue());
            return;
        }
        if (content instanceof UserContent.Content.StructuredContent) {
            StructuredContent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((UserContent.Content.StructuredContent) content).getValue());
        } else if (content instanceof UserContent.Content.Resource) {
            EmbeddedResource.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((UserContent.Content.Resource) content).getValue());
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
        UserContent userContent = (UserContent) obj;
        userContent.getClass();
        int size$okio = userContent.unknownFields().getSize$okio();
        UserContent.Content content = userContent.content;
        if (content instanceof UserContent.Content.Text) {
            encodedSizeWithTag = TextContent.ADAPTER.encodedSizeWithTag(1, ((UserContent.Content.Text) content).getValue());
        } else if (content instanceof UserContent.Content.Image) {
            encodedSizeWithTag = ImageContent.ADAPTER.encodedSizeWithTag(2, ((UserContent.Content.Image) content).getValue());
        } else if (content instanceof UserContent.Content.ClientRenderable) {
            encodedSizeWithTag = ClientRenderable.ADAPTER.encodedSizeWithTag(3, ((UserContent.Content.ClientRenderable) content).getValue());
        } else if (content instanceof UserContent.Content.StructuredContent) {
            encodedSizeWithTag = StructuredContent.ADAPTER.encodedSizeWithTag(4, ((UserContent.Content.StructuredContent) content).getValue());
        } else {
            if (!(content instanceof UserContent.Content.Resource)) {
                if (content == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = EmbeddedResource.ADAPTER.encodedSizeWithTag(5, ((UserContent.Content.Resource) content).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserContent userContent = (UserContent) obj;
        userContent.getClass();
        ByteString byteString = ByteString.EMPTY;
        UserContent.Content content = userContent.content;
        byteString.getClass();
        return new UserContent(content, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserContent userContent = (UserContent) obj;
        userContent.getClass();
        UserContent.Content content = userContent.content;
        if (content instanceof UserContent.Content.Text) {
            TextContent.ADAPTER.encodeWithTag(protoWriter, 1, ((UserContent.Content.Text) content).getValue());
        } else if (content instanceof UserContent.Content.Image) {
            ImageContent.ADAPTER.encodeWithTag(protoWriter, 2, ((UserContent.Content.Image) content).getValue());
        } else if (content instanceof UserContent.Content.ClientRenderable) {
            ClientRenderable.ADAPTER.encodeWithTag(protoWriter, 3, ((UserContent.Content.ClientRenderable) content).getValue());
        } else if (content instanceof UserContent.Content.StructuredContent) {
            StructuredContent.ADAPTER.encodeWithTag(protoWriter, 4, ((UserContent.Content.StructuredContent) content).getValue());
        } else if (content instanceof UserContent.Content.Resource) {
            EmbeddedResource.ADAPTER.encodeWithTag(protoWriter, 5, ((UserContent.Content.Resource) content).getValue());
        } else if (content != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(userContent.unknownFields());
    }
}
