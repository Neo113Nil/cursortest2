package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/LinkTransferOption$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/LinkTransferOption;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LinkTransferOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkTransferOption((TransferOptionKind) obj, (LinkVisibility) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = TransferOptionKind.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = LinkVisibility.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkTransferOption linkTransferOption = (LinkTransferOption) obj;
        reverseProtoWriter.getClass();
        linkTransferOption.getClass();
        reverseProtoWriter.writeBytes(linkTransferOption.unknownFields());
        LinkVisibility.ADAPTER.encodeWithTag(reverseProtoWriter, 2, linkTransferOption.visibility);
        TransferOptionKind.ADAPTER.encodeWithTag(reverseProtoWriter, 1, linkTransferOption.kind);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkTransferOption linkTransferOption = (LinkTransferOption) obj;
        linkTransferOption.getClass();
        return LinkVisibility.ADAPTER.encodedSizeWithTag(2, linkTransferOption.visibility) + TransferOptionKind.ADAPTER.encodedSizeWithTag(1, linkTransferOption.kind) + linkTransferOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkTransferOption linkTransferOption = (LinkTransferOption) obj;
        linkTransferOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        TransferOptionKind transferOptionKind = linkTransferOption.kind;
        LinkVisibility linkVisibility = linkTransferOption.visibility;
        byteString.getClass();
        return new LinkTransferOption(transferOptionKind, linkVisibility, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkTransferOption linkTransferOption = (LinkTransferOption) obj;
        linkTransferOption.getClass();
        TransferOptionKind.ADAPTER.encodeWithTag(protoWriter, 1, linkTransferOption.kind);
        LinkVisibility.ADAPTER.encodeWithTag(protoWriter, 2, linkTransferOption.visibility);
        protoWriter.writeBytes(linkTransferOption.unknownFields());
    }
}
