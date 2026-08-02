package com.squareup.cash.supportarticles.app.v1;

import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupportArticle$ContactOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Object obj = SupportArticle.Channel.CHANNEL_UNSPECIFIED;
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportArticle.ContactOption((SupportArticle.Channel) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SupportArticle.Channel.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportArticle.ContactOption contactOption = (SupportArticle.ContactOption) obj;
        reverseProtoWriter.getClass();
        contactOption.getClass();
        reverseProtoWriter.writeBytes(contactOption.unknownFields());
        SupportArticle.Channel channel = contactOption.channel;
        if (channel != SupportArticle.Channel.CHANNEL_UNSPECIFIED) {
            SupportArticle.Channel.ADAPTER.encodeWithTag(reverseProtoWriter, 1, channel);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportArticle.ContactOption contactOption = (SupportArticle.ContactOption) obj;
        contactOption.getClass();
        int size$okio = contactOption.unknownFields().getSize$okio();
        SupportArticle.Channel channel = contactOption.channel;
        return channel != SupportArticle.Channel.CHANNEL_UNSPECIFIED ? SupportArticle.Channel.ADAPTER.encodedSizeWithTag(1, channel) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportArticle.ContactOption contactOption = (SupportArticle.ContactOption) obj;
        contactOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        SupportArticle.Channel channel = contactOption.channel;
        channel.getClass();
        byteString.getClass();
        return new SupportArticle.ContactOption(channel, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportArticle.ContactOption contactOption = (SupportArticle.ContactOption) obj;
        contactOption.getClass();
        SupportArticle.Channel channel = contactOption.channel;
        if (channel != SupportArticle.Channel.CHANNEL_UNSPECIFIED) {
            SupportArticle.Channel.ADAPTER.encodeWithTag(protoWriter, 1, channel);
        }
        protoWriter.writeBytes(contactOption.unknownFields());
    }
}
