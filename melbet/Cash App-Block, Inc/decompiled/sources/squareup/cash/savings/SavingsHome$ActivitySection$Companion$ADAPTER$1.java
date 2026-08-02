package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes8.dex */
public final class SavingsHome$ActivitySection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome.ActivitySection((String) obj, (LocalizableString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.ActivitySection activitySection = (SavingsHome.ActivitySection) obj;
        reverseProtoWriter.getClass();
        activitySection.getClass();
        reverseProtoWriter.writeBytes(activitySection.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activitySection.localizable_accessibility_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activitySection.accessibility_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.ActivitySection activitySection = (SavingsHome.ActivitySection) obj;
        activitySection.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(2, activitySection.localizable_accessibility_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, activitySection.accessibility_text) + activitySection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.ActivitySection activitySection = (SavingsHome.ActivitySection) obj;
        activitySection.getClass();
        LocalizableString localizableString = activitySection.localizable_accessibility_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activitySection.accessibility_text;
        byteString.getClass();
        return new SavingsHome.ActivitySection(str, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.ActivitySection activitySection = (SavingsHome.ActivitySection) obj;
        activitySection.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activitySection.accessibility_text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 2, activitySection.localizable_accessibility_text);
        protoWriter.writeBytes(activitySection.unknownFields());
    }
}
