package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCashMarketingContent$Template$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashMarketingContent.Template((LocalMoney) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashMarketingContent.Template template = (LocalCashMarketingContent.Template) obj;
        reverseProtoWriter.getClass();
        template.getClass();
        reverseProtoWriter.writeBytes(template.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, template.over_threshold_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, template.under_threshold_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, template.over_threshold_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, template.under_threshold_title);
        LocalMoney.ADAPTER.encodeWithTag(reverseProtoWriter, 1, template.threshold);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashMarketingContent.Template template = (LocalCashMarketingContent.Template) obj;
        template.getClass();
        int encodedSizeWithTag = LocalMoney.ADAPTER.encodedSizeWithTag(1, template.threshold) + template.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, template.over_threshold_subtitle) + protoAdapter.encodedSizeWithTag(4, template.under_threshold_subtitle) + protoAdapter.encodedSizeWithTag(3, template.over_threshold_title) + protoAdapter.encodedSizeWithTag(2, template.under_threshold_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashMarketingContent.Template template = (LocalCashMarketingContent.Template) obj;
        template.getClass();
        LocalMoney localMoney = template.threshold;
        LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = template.under_threshold_title;
        String str2 = template.over_threshold_title;
        String str3 = template.under_threshold_subtitle;
        String str4 = template.over_threshold_subtitle;
        byteString.getClass();
        return new LocalCashMarketingContent.Template(localMoney2, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashMarketingContent.Template template = (LocalCashMarketingContent.Template) obj;
        template.getClass();
        LocalMoney.ADAPTER.encodeWithTag(protoWriter, 1, template.threshold);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, template.under_threshold_title);
        protoAdapter.encodeWithTag(protoWriter, 3, template.over_threshold_title);
        protoAdapter.encodeWithTag(protoWriter, 4, template.under_threshold_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, template.over_threshold_subtitle);
        protoWriter.writeBytes(template.unknownFields());
    }
}
