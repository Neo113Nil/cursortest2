package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class TreehouseAppletBrief$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TreehouseAppletBrief((Long) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Employer) obj4, (Employer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Employer.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Employer.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TreehouseAppletBrief treehouseAppletBrief = (TreehouseAppletBrief) obj;
        reverseProtoWriter.getClass();
        treehouseAppletBrief.getClass();
        reverseProtoWriter.writeBytes(treehouseAppletBrief.unknownFields());
        ProtoAdapter protoAdapter = Employer.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, treehouseAppletBrief.post_rollover_employer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, treehouseAppletBrief.pre_rollover_employer);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, treehouseAppletBrief.post_rollover_markdown_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, treehouseAppletBrief.pre_rollover_markdown_text);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, treehouseAppletBrief.applet_text_rollover_date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TreehouseAppletBrief treehouseAppletBrief = (TreehouseAppletBrief) obj;
        treehouseAppletBrief.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, treehouseAppletBrief.applet_text_rollover_date) + treehouseAppletBrief.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, treehouseAppletBrief.post_rollover_markdown_text) + protoAdapter.encodedSizeWithTag(2, treehouseAppletBrief.pre_rollover_markdown_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Employer.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, treehouseAppletBrief.post_rollover_employer) + protoAdapter2.encodedSizeWithTag(4, treehouseAppletBrief.pre_rollover_employer) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TreehouseAppletBrief treehouseAppletBrief = (TreehouseAppletBrief) obj;
        treehouseAppletBrief.getClass();
        LocalizedString localizedString = treehouseAppletBrief.pre_rollover_markdown_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = treehouseAppletBrief.post_rollover_markdown_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Employer employer = treehouseAppletBrief.pre_rollover_employer;
        Employer employer2 = employer != null ? (Employer) Employer.ADAPTER.redact(employer) : null;
        Employer employer3 = treehouseAppletBrief.post_rollover_employer;
        Employer employer4 = employer3 != null ? (Employer) Employer.ADAPTER.redact(employer3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = treehouseAppletBrief.applet_text_rollover_date;
        byteString.getClass();
        return new TreehouseAppletBrief(l, localizedString2, localizedString4, employer2, employer4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TreehouseAppletBrief treehouseAppletBrief = (TreehouseAppletBrief) obj;
        treehouseAppletBrief.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, treehouseAppletBrief.applet_text_rollover_date);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, treehouseAppletBrief.pre_rollover_markdown_text);
        protoAdapter.encodeWithTag(protoWriter, 3, treehouseAppletBrief.post_rollover_markdown_text);
        ProtoAdapter protoAdapter2 = Employer.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, treehouseAppletBrief.pre_rollover_employer);
        protoAdapter2.encodeWithTag(protoWriter, 5, treehouseAppletBrief.post_rollover_employer);
        protoWriter.writeBytes(treehouseAppletBrief.unknownFields());
    }
}
