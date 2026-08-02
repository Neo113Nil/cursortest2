package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarnerOnboardingTool$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EarnerOnboardingTool((LocalizedString) obj, (LocalizedString) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarnerOnboardingTool earnerOnboardingTool = (EarnerOnboardingTool) obj;
        reverseProtoWriter.getClass();
        earnerOnboardingTool.getClass();
        reverseProtoWriter.writeBytes(earnerOnboardingTool.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, earnerOnboardingTool.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earnerOnboardingTool.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, earnerOnboardingTool.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarnerOnboardingTool earnerOnboardingTool = (EarnerOnboardingTool) obj;
        earnerOnboardingTool.getClass();
        int size$okio = earnerOnboardingTool.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, earnerOnboardingTool.client_route) + protoAdapter.encodedSizeWithTag(2, earnerOnboardingTool.subtitle) + protoAdapter.encodedSizeWithTag(1, earnerOnboardingTool.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarnerOnboardingTool earnerOnboardingTool = (EarnerOnboardingTool) obj;
        earnerOnboardingTool.getClass();
        LocalizedString localizedString = earnerOnboardingTool.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = earnerOnboardingTool.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = earnerOnboardingTool.client_route;
        byteString.getClass();
        return new EarnerOnboardingTool(localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarnerOnboardingTool earnerOnboardingTool = (EarnerOnboardingTool) obj;
        earnerOnboardingTool.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, earnerOnboardingTool.title);
        protoAdapter.encodeWithTag(protoWriter, 2, earnerOnboardingTool.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, earnerOnboardingTool.client_route);
        protoWriter.writeBytes(earnerOnboardingTool.unknownFields());
    }
}
