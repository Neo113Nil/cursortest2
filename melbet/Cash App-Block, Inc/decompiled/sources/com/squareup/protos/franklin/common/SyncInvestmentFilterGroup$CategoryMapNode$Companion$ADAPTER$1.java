package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncInvestmentFilterGroup$CategoryMapNode$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentFilterGroup.CategoryMapNode((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj;
        reverseProtoWriter.getClass();
        categoryMapNode.getClass();
        reverseProtoWriter.writeBytes(categoryMapNode.unknownFields());
        SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, categoryMapNode.sub_nodes);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, categoryMapNode.category_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, categoryMapNode.option_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj;
        categoryMapNode.getClass();
        int size$okio = categoryMapNode.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.asRepeated().encodedSizeWithTag(3, categoryMapNode.sub_nodes) + protoAdapter.encodedSizeWithTag(2, categoryMapNode.category_token) + protoAdapter.encodedSizeWithTag(1, categoryMapNode.option_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj;
        categoryMapNode.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(categoryMapNode.sub_nodes, SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = categoryMapNode.option_token;
        String str2 = categoryMapNode.category_token;
        byteString.getClass();
        return new SyncInvestmentFilterGroup.CategoryMapNode(str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentFilterGroup.CategoryMapNode categoryMapNode = (SyncInvestmentFilterGroup.CategoryMapNode) obj;
        categoryMapNode.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, categoryMapNode.option_token);
        protoAdapter.encodeWithTag(protoWriter, 2, categoryMapNode.category_token);
        SyncInvestmentFilterGroup.CategoryMapNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, categoryMapNode.sub_nodes);
        protoWriter.writeBytes(categoryMapNode.unknownFields());
    }
}
