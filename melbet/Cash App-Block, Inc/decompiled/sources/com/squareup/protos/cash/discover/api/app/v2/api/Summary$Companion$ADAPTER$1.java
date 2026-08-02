package com.squareup.protos.cash.discover.api.app.v2.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.discover.api.app.v2.api.Summary;
import com.squareup.protos.cash.discover.api.app.v2.model.Text;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Summary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Summary((Text) obj, (Text) obj2, (Text) obj3, (Text) obj4, m, arrayList, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    arrayList.add(ActivityRow.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    m.add(Summary.LineItem.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Summary summary = (Summary) obj;
        reverseProtoWriter.getClass();
        summary.getClass();
        reverseProtoWriter.writeBytes(summary.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 7, summary.cursor);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, summary.activity_rows);
        Summary.LineItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, summary.line_items);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, summary.trailingFooter);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, summary.leadingFooter);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, summary.brief);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, summary.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Summary summary = (Summary) obj;
        summary.getClass();
        int size$okio = summary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(7, summary.cursor) + ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(5, summary.activity_rows) + Summary.LineItem.ADAPTER.asRepeated().encodedSizeWithTag(6, summary.line_items) + protoAdapter.encodedSizeWithTag(4, summary.trailingFooter) + protoAdapter.encodedSizeWithTag(3, summary.leadingFooter) + protoAdapter.encodedSizeWithTag(2, summary.brief) + protoAdapter.encodedSizeWithTag(1, summary.header) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Summary summary = (Summary) obj;
        summary.getClass();
        Text text = summary.header;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = summary.brief;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = summary.leadingFooter;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Text text7 = summary.trailingFooter;
        Text text8 = text7 != null ? (Text) Text.ADAPTER.redact(text7) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(summary.line_items, Summary.LineItem.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(summary.activity_rows, ActivityRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = summary.cursor;
        byteString.getClass();
        return new Summary(text2, text4, text6, text8, m1169redactElements, m1169redactElements2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Summary summary = (Summary) obj;
        summary.getClass();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, summary.header);
        protoAdapter.encodeWithTag(protoWriter, 2, summary.brief);
        protoAdapter.encodeWithTag(protoWriter, 3, summary.leadingFooter);
        protoAdapter.encodeWithTag(protoWriter, 4, summary.trailingFooter);
        Summary.LineItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, summary.line_items);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, summary.activity_rows);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, summary.cursor);
        protoWriter.writeBytes(summary.unknownFields());
    }
}
