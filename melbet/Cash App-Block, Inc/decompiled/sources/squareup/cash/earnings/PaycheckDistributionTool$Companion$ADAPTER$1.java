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
public final class PaycheckDistributionTool$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaycheckDistributionTool((LocalizedString) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(UiAvatar.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaycheckDistributionTool paycheckDistributionTool = (PaycheckDistributionTool) obj;
        reverseProtoWriter.getClass();
        paycheckDistributionTool.getClass();
        reverseProtoWriter.writeBytes(paycheckDistributionTool.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, paycheckDistributionTool.client_route);
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, paycheckDistributionTool.stream_avatars);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paycheckDistributionTool.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaycheckDistributionTool paycheckDistributionTool = (PaycheckDistributionTool) obj;
        paycheckDistributionTool.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, paycheckDistributionTool.client_route) + UiAvatar.ADAPTER.asRepeated().encodedSizeWithTag(2, paycheckDistributionTool.stream_avatars) + LocalizedString.ADAPTER.encodedSizeWithTag(1, paycheckDistributionTool.title) + paycheckDistributionTool.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaycheckDistributionTool paycheckDistributionTool = (PaycheckDistributionTool) obj;
        paycheckDistributionTool.getClass();
        LocalizedString localizedString = paycheckDistributionTool.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paycheckDistributionTool.stream_avatars, UiAvatar.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = paycheckDistributionTool.client_route;
        byteString.getClass();
        return new PaycheckDistributionTool(localizedString2, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaycheckDistributionTool paycheckDistributionTool = (PaycheckDistributionTool) obj;
        paycheckDistributionTool.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, paycheckDistributionTool.title);
        UiAvatar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, paycheckDistributionTool.stream_avatars);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, paycheckDistributionTool.client_route);
        protoWriter.writeBytes(paycheckDistributionTool.unknownFields());
    }
}
