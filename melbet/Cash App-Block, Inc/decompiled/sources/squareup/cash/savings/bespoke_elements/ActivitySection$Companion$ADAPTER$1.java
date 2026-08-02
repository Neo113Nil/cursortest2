package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.SectionHeader;

/* loaded from: classes10.dex */
public final class ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ActivitySection((SectionHeader) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SectionHeader.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activitySection.load_failure_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activitySection.no_activity_subtitle);
        SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activitySection.activity_section_header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        int encodedSizeWithTag = SectionHeader.ADAPTER.encodedSizeWithTag(1, activitySection.activity_section_header) + activitySection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, activitySection.load_failure_subtitle) + protoAdapter.encodedSizeWithTag(2, activitySection.no_activity_subtitle) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        SectionHeader sectionHeader = activitySection.activity_section_header;
        SectionHeader sectionHeader2 = sectionHeader != null ? (SectionHeader) SectionHeader.ADAPTER.redact(sectionHeader) : null;
        LocalizedString localizedString = activitySection.no_activity_subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = activitySection.load_failure_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ActivitySection(sectionHeader2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        SectionHeader.ADAPTER.encodeWithTag(protoWriter, 1, activitySection.activity_section_header);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, activitySection.no_activity_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, activitySection.load_failure_subtitle);
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
