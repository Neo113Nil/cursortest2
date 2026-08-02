package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningToolsSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningToolsSection((LocalizedString) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EarningTool.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningToolsSection earningToolsSection = (EarningToolsSection) obj;
        reverseProtoWriter.getClass();
        earningToolsSection.getClass();
        reverseProtoWriter.writeBytes(earningToolsSection.unknownFields());
        EarningTool.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, earningToolsSection.tools);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, earningToolsSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningToolsSection earningToolsSection = (EarningToolsSection) obj;
        earningToolsSection.getClass();
        return EarningTool.ADAPTER.asRepeated().encodedSizeWithTag(1, earningToolsSection.tools) + LocalizedString.ADAPTER.encodedSizeWithTag(2, earningToolsSection.title) + earningToolsSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningToolsSection earningToolsSection = (EarningToolsSection) obj;
        earningToolsSection.getClass();
        LocalizedString localizedString = earningToolsSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earningToolsSection.tools, EarningTool.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningToolsSection(localizedString2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningToolsSection earningToolsSection = (EarningToolsSection) obj;
        earningToolsSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, earningToolsSection.title);
        EarningTool.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, earningToolsSection.tools);
        protoWriter.writeBytes(earningToolsSection.unknownFields());
    }
}
