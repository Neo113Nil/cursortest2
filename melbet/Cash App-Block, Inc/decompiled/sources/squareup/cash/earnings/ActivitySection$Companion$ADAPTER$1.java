package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ActivitySection((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 5) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, activitySection.view_all_client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, activitySection.view_all_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, activitySection.load_failure_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activitySection.no_activity_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activitySection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        int size$okio = activitySection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, activitySection.view_all_client_route) + protoAdapter.encodedSizeWithTag(5, activitySection.view_all_button_title) + protoAdapter.encodedSizeWithTag(4, activitySection.load_failure_subtitle) + protoAdapter.encodedSizeWithTag(3, activitySection.no_activity_subtitle) + protoAdapter.encodedSizeWithTag(2, activitySection.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        LocalizedString localizedString = activitySection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = activitySection.no_activity_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = activitySection.load_failure_subtitle;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = activitySection.view_all_button_title;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activitySection.view_all_client_route;
        byteString.getClass();
        return new ActivitySection(localizedString2, localizedString4, localizedString6, localizedString8, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySection activitySection = (ActivitySection) obj;
        activitySection.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, activitySection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, activitySection.no_activity_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, activitySection.load_failure_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 5, activitySection.view_all_button_title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, activitySection.view_all_client_route);
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
