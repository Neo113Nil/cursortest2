package squareup.cash.savings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.savings.SavingsScreen;

/* loaded from: classes10.dex */
public final class SavingsScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsScreen(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SavingsScreen.Element.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsScreen savingsScreen = (SavingsScreen) obj;
        reverseProtoWriter.getClass();
        savingsScreen.getClass();
        reverseProtoWriter.writeBytes(savingsScreen.unknownFields());
        SavingsScreen.Element.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, savingsScreen.elements);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsScreen savingsScreen = (SavingsScreen) obj;
        savingsScreen.getClass();
        return SavingsScreen.Element.ADAPTER.asRepeated().encodedSizeWithTag(1, savingsScreen.elements) + savingsScreen.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsScreen savingsScreen = (SavingsScreen) obj;
        savingsScreen.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(savingsScreen.elements, SavingsScreen.Element.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsScreen(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsScreen savingsScreen = (SavingsScreen) obj;
        savingsScreen.getClass();
        SavingsScreen.Element.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, savingsScreen.elements);
        protoWriter.writeBytes(savingsScreen.unknownFields());
    }
}
