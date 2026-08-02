package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SocialAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SocialAccount((Image) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SocialAccount socialAccount = (SocialAccount) obj;
        reverseProtoWriter.getClass();
        socialAccount.getClass();
        reverseProtoWriter.writeBytes(socialAccount.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, socialAccount.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, socialAccount.name);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, socialAccount.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SocialAccount socialAccount = (SocialAccount) obj;
        socialAccount.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, socialAccount.icon) + socialAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, socialAccount.url) + protoAdapter.encodedSizeWithTag(2, socialAccount.name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SocialAccount socialAccount = (SocialAccount) obj;
        socialAccount.getClass();
        Image image = socialAccount.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SocialAccount(image2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SocialAccount socialAccount = (SocialAccount) obj;
        socialAccount.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, socialAccount.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, socialAccount.name);
        protoAdapter.encodeWithTag(protoWriter, 3, socialAccount.url);
        protoWriter.writeBytes(socialAccount.unknownFields());
    }
}
