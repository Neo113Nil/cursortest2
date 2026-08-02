package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaychecksHomeUi.ActivitySection((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 6:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 9:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 10:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.ActivitySection activitySection = (PaychecksHomeUi.ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, activitySection.stale_activity_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, activitySection.view_all_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, activitySection.load_failure_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, activitySection.no_activity_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, activitySection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.ActivitySection activitySection = (PaychecksHomeUi.ActivitySection) obj;
        activitySection.getClass();
        int size$okio = activitySection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(10, activitySection.stale_activity_title) + protoAdapter.encodedSizeWithTag(9, activitySection.view_all_button_title) + protoAdapter.encodedSizeWithTag(8, activitySection.load_failure_subtitle) + protoAdapter.encodedSizeWithTag(7, activitySection.no_activity_subtitle) + protoAdapter.encodedSizeWithTag(6, activitySection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.ActivitySection activitySection = (PaychecksHomeUi.ActivitySection) obj;
        activitySection.getClass();
        LocalizedString localizedString = activitySection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = activitySection.no_activity_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = activitySection.load_failure_subtitle;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = activitySection.view_all_button_title;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = activitySection.stale_activity_title;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.ActivitySection(localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.ActivitySection activitySection = (PaychecksHomeUi.ActivitySection) obj;
        activitySection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 6, activitySection.title);
        protoAdapter.encodeWithTag(protoWriter, 7, activitySection.no_activity_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 8, activitySection.load_failure_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 9, activitySection.view_all_button_title);
        protoAdapter.encodeWithTag(protoWriter, 10, activitySection.stale_activity_title);
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
