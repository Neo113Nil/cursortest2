package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.franklin.common.SavingsTransferRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SavingsTransferRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsTransferRenderData((StoredValueBalance.Type) obj, (StoredValueBalance.Type) obj2, (Boolean) obj3, (String) obj4, (String) obj5, (Boolean) obj6, (SavingsTransferRenderData.SavingsFolderMetadata) obj7, (SavingsTransferRenderData.SavingsFolderMetadata) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = StoredValueBalance.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = StoredValueBalance.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 5) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 6) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                switch (nextTag) {
                    case 16:
                        obj6 = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    case 17:
                        obj7 = TransactorKt.decodeMessageOrMerge(SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER, protoReader, obj7);
                        break;
                    case 18:
                        obj8 = TransactorKt.decodeMessageOrMerge(SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER, protoReader, obj8);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsTransferRenderData savingsTransferRenderData = (SavingsTransferRenderData) obj;
        reverseProtoWriter.getClass();
        savingsTransferRenderData.getClass();
        reverseProtoWriter.writeBytes(savingsTransferRenderData.unknownFields());
        ProtoAdapter protoAdapter = SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, savingsTransferRenderData.target_savings_folder_metadata);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, savingsTransferRenderData.source_savings_folder_metadata);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, savingsTransferRenderData.is_savings_render_context);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, savingsTransferRenderData.target_balance_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, savingsTransferRenderData.source_balance_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, savingsTransferRenderData.is_negative_balance_adjustment);
        ProtoAdapter protoAdapter4 = StoredValueBalance.Type.ADAPTER;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 2, savingsTransferRenderData.target_balance_type);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 1, savingsTransferRenderData.source_balance_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsTransferRenderData savingsTransferRenderData = (SavingsTransferRenderData) obj;
        savingsTransferRenderData.getClass();
        int size$okio = savingsTransferRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = StoredValueBalance.Type.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, savingsTransferRenderData.target_balance_type) + protoAdapter.encodedSizeWithTag(1, savingsTransferRenderData.source_balance_type) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(5, savingsTransferRenderData.is_negative_balance_adjustment) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(16, savingsTransferRenderData.is_savings_render_context) + protoAdapter3.encodedSizeWithTag(7, savingsTransferRenderData.target_balance_token) + protoAdapter3.encodedSizeWithTag(6, savingsTransferRenderData.source_balance_token) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER;
        return protoAdapter4.encodedSizeWithTag(18, savingsTransferRenderData.target_savings_folder_metadata) + protoAdapter4.encodedSizeWithTag(17, savingsTransferRenderData.source_savings_folder_metadata) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsTransferRenderData savingsTransferRenderData = (SavingsTransferRenderData) obj;
        savingsTransferRenderData.getClass();
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata = savingsTransferRenderData.source_savings_folder_metadata;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata2 = savingsFolderMetadata != null ? (SavingsTransferRenderData.SavingsFolderMetadata) SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.redact(savingsFolderMetadata) : null;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata3 = savingsTransferRenderData.target_savings_folder_metadata;
        SavingsTransferRenderData.SavingsFolderMetadata savingsFolderMetadata4 = savingsFolderMetadata3 != null ? (SavingsTransferRenderData.SavingsFolderMetadata) SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER.redact(savingsFolderMetadata3) : null;
        ByteString byteString = ByteString.EMPTY;
        StoredValueBalance.Type type2 = savingsTransferRenderData.source_balance_type;
        StoredValueBalance.Type type3 = savingsTransferRenderData.target_balance_type;
        Boolean bool = savingsTransferRenderData.is_negative_balance_adjustment;
        String str = savingsTransferRenderData.source_balance_token;
        String str2 = savingsTransferRenderData.target_balance_token;
        Boolean bool2 = savingsTransferRenderData.is_savings_render_context;
        byteString.getClass();
        return new SavingsTransferRenderData(type2, type3, bool, str, str2, bool2, savingsFolderMetadata2, savingsFolderMetadata4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsTransferRenderData savingsTransferRenderData = (SavingsTransferRenderData) obj;
        savingsTransferRenderData.getClass();
        ProtoAdapter protoAdapter = StoredValueBalance.Type.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsTransferRenderData.source_balance_type);
        protoAdapter.encodeWithTag(protoWriter, 2, savingsTransferRenderData.target_balance_type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, savingsTransferRenderData.is_negative_balance_adjustment);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 6, savingsTransferRenderData.source_balance_token);
        protoAdapter3.encodeWithTag(protoWriter, 7, savingsTransferRenderData.target_balance_token);
        protoAdapter2.encodeWithTag(protoWriter, 16, savingsTransferRenderData.is_savings_render_context);
        ProtoAdapter protoAdapter4 = SavingsTransferRenderData.SavingsFolderMetadata.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 17, savingsTransferRenderData.source_savings_folder_metadata);
        protoAdapter4.encodeWithTag(protoWriter, 18, savingsTransferRenderData.target_savings_folder_metadata);
        protoWriter.writeBytes(savingsTransferRenderData.unknownFields());
    }
}
