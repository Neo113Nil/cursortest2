package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SavingsTransferRenderData$SavingsFolderMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsTransferRenderData.SavingsFolderMetadata((String) obj, (String) obj2, (String) obj3, (LocalizableString) obj4, (Image) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = (SavingsTransferRenderData.SavingsFolderMetadata) obj;
        reverseProtoWriter.getClass();
        savingsFolderMetadata.getClass();
        reverseProtoWriter.writeBytes(savingsFolderMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, savingsFolderMetadata.icon_id);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, savingsFolderMetadata.image);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsFolderMetadata.localizable_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsFolderMetadata.activity_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, savingsFolderMetadata.avatar_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, savingsFolderMetadata.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = (SavingsTransferRenderData.SavingsFolderMetadata) obj;
        savingsFolderMetadata.getClass();
        int size$okio = savingsFolderMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, savingsFolderMetadata.icon_id) + Image.ADAPTER.encodedSizeWithTag(5, savingsFolderMetadata.image) + LocalizableString.ADAPTER.encodedSizeWithTag(4, savingsFolderMetadata.localizable_label) + protoAdapter.encodedSizeWithTag(3, savingsFolderMetadata.activity_token) + protoAdapter.encodedSizeWithTag(2, savingsFolderMetadata.avatar_url) + protoAdapter.encodedSizeWithTag(1, savingsFolderMetadata.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = (SavingsTransferRenderData.SavingsFolderMetadata) obj;
        savingsFolderMetadata.getClass();
        LocalizableString localizableString = savingsFolderMetadata.localizable_label;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        Image image = savingsFolderMetadata.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsFolderMetadata.avatar_url;
        String str2 = savingsFolderMetadata.activity_token;
        String str3 = savingsFolderMetadata.icon_id;
        byteString.getClass();
        return new SavingsTransferRenderData.SavingsFolderMetadata(null, str, str2, localizableString2, image2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = (SavingsTransferRenderData.SavingsFolderMetadata) obj;
        savingsFolderMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsFolderMetadata.label);
        protoAdapter.encodeWithTag(protoWriter, 2, savingsFolderMetadata.avatar_url);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsFolderMetadata.activity_token);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, savingsFolderMetadata.localizable_label);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, savingsFolderMetadata.image);
        protoAdapter.encodeWithTag(protoWriter, 6, savingsFolderMetadata.icon_id);
        protoWriter.writeBytes(savingsFolderMetadata.unknownFields());
    }
}
