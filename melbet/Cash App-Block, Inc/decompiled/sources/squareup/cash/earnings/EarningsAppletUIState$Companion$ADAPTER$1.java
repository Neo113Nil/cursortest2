package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningsAppletUIState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsAppletUIState((EarningsAppletState) obj, (LocalizedString) obj2, (LocalizedString) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = EarningsAppletState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(UiAvatar.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) obj;
        reverseProtoWriter.getClass();
        earningsAppletUIState.getClass();
        reverseProtoWriter.writeBytes(earningsAppletUIState.unknownFields());
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, earningsAppletUIState.stream_avatars);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, earningsAppletUIState.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, earningsAppletUIState.subtitle_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earningsAppletUIState.title_text);
        EarningsAppletState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningsAppletUIState.applet_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) obj;
        earningsAppletUIState.getClass();
        int encodedSizeWithTag = EarningsAppletState.ADAPTER.encodedSizeWithTag(1, earningsAppletUIState.applet_state) + earningsAppletUIState.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return UiAvatar.ADAPTER.asRepeated().encodedSizeWithTag(5, earningsAppletUIState.stream_avatars) + ProtoAdapter.STRING.encodedSizeWithTag(4, earningsAppletUIState.client_route) + protoAdapter.encodedSizeWithTag(3, earningsAppletUIState.subtitle_text) + protoAdapter.encodedSizeWithTag(2, earningsAppletUIState.title_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) obj;
        earningsAppletUIState.getClass();
        LocalizedString localizedString = earningsAppletUIState.title_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = earningsAppletUIState.subtitle_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earningsAppletUIState.stream_avatars, UiAvatar.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        EarningsAppletState earningsAppletState = earningsAppletUIState.applet_state;
        String str = earningsAppletUIState.client_route;
        byteString.getClass();
        return new EarningsAppletUIState(earningsAppletState, localizedString2, localizedString4, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) obj;
        earningsAppletUIState.getClass();
        EarningsAppletState.ADAPTER.encodeWithTag(protoWriter, 1, earningsAppletUIState.applet_state);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, earningsAppletUIState.title_text);
        protoAdapter.encodeWithTag(protoWriter, 3, earningsAppletUIState.subtitle_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, earningsAppletUIState.client_route);
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, earningsAppletUIState.stream_avatars);
        protoWriter.writeBytes(earningsAppletUIState.unknownFields());
    }
}
