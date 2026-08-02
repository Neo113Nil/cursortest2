package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ActiveDistributionSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActiveDistributionSection((LocalizedString) obj2, (LocalizedString) obj3, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(UiAvatar.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
        reverseProtoWriter.getClass();
        activeDistributionSection.getClass();
        reverseProtoWriter.writeBytes(activeDistributionSection.unknownFields());
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, activeDistributionSection.stream_avatars);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activeDistributionSection.edit_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activeDistributionSection.title_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, activeDistributionSection.client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
        activeDistributionSection.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, activeDistributionSection.client_route) + activeDistributionSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return UiAvatar.ADAPTER.asRepeated().encodedSizeWithTag(4, activeDistributionSection.stream_avatars) + protoAdapter.encodedSizeWithTag(3, activeDistributionSection.edit_button_text) + protoAdapter.encodedSizeWithTag(2, activeDistributionSection.title_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
        activeDistributionSection.getClass();
        LocalizedString localizedString = activeDistributionSection.title_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = activeDistributionSection.edit_button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activeDistributionSection.stream_avatars, UiAvatar.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = activeDistributionSection.client_route;
        byteString.getClass();
        return new ActiveDistributionSection(localizedString2, localizedString4, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
        activeDistributionSection.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, activeDistributionSection.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, activeDistributionSection.title_text);
        protoAdapter.encodeWithTag(protoWriter, 3, activeDistributionSection.edit_button_text);
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, activeDistributionSection.stream_avatars);
        protoWriter.writeBytes(activeDistributionSection.unknownFields());
    }
}
