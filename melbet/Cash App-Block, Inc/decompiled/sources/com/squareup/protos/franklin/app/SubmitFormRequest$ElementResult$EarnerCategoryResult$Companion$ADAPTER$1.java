package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$EarnerCategoryResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.EarnerCategoryResult((EarnerCategory) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = EarnerCategory.ADAPTER.decode(protoReader);
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
        SubmitFormRequest.ElementResult.EarnerCategoryResult earnerCategoryResult = (SubmitFormRequest.ElementResult.EarnerCategoryResult) obj;
        reverseProtoWriter.getClass();
        earnerCategoryResult.getClass();
        reverseProtoWriter.writeBytes(earnerCategoryResult.unknownFields());
        EarnerCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earnerCategoryResult.earner_category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.EarnerCategoryResult earnerCategoryResult = (SubmitFormRequest.ElementResult.EarnerCategoryResult) obj;
        earnerCategoryResult.getClass();
        return EarnerCategory.ADAPTER.encodedSizeWithTag(1, earnerCategoryResult.earner_category) + earnerCategoryResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.EarnerCategoryResult earnerCategoryResult = (SubmitFormRequest.ElementResult.EarnerCategoryResult) obj;
        earnerCategoryResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        EarnerCategory earnerCategory = earnerCategoryResult.earner_category;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.EarnerCategoryResult(earnerCategory, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.EarnerCategoryResult earnerCategoryResult = (SubmitFormRequest.ElementResult.EarnerCategoryResult) obj;
        earnerCategoryResult.getClass();
        EarnerCategory.ADAPTER.encodeWithTag(protoWriter, 1, earnerCategoryResult.earner_category);
        protoWriter.writeBytes(earnerCategoryResult.unknownFields());
    }
}
