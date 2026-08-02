package squareup.cash.savings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes8.dex */
public final class SavingsHome$SavingsOptionsSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome.SavingsOptionsSection((LocalizableString) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SavingsHome.SavingsOptionsSection.SavingsOptionRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.SavingsOptionsSection savingsOptionsSection = (SavingsHome.SavingsOptionsSection) obj;
        reverseProtoWriter.getClass();
        savingsOptionsSection.getClass();
        reverseProtoWriter.writeBytes(savingsOptionsSection.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsOptionsSection.localizable_accessibility_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, savingsOptionsSection.accessibility_text);
        SavingsHome.SavingsOptionsSection.SavingsOptionRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, savingsOptionsSection.rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.SavingsOptionsSection savingsOptionsSection = (SavingsHome.SavingsOptionsSection) obj;
        savingsOptionsSection.getClass();
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, savingsOptionsSection.localizable_accessibility_text) + ProtoAdapter.STRING.encodedSizeWithTag(2, savingsOptionsSection.accessibility_text) + SavingsHome.SavingsOptionsSection.SavingsOptionRow.ADAPTER.asRepeated().encodedSizeWithTag(1, savingsOptionsSection.rows) + savingsOptionsSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.SavingsOptionsSection savingsOptionsSection = (SavingsHome.SavingsOptionsSection) obj;
        savingsOptionsSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(savingsOptionsSection.rows, SavingsHome.SavingsOptionsSection.SavingsOptionRow.ADAPTER);
        LocalizableString localizableString = savingsOptionsSection.localizable_accessibility_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = savingsOptionsSection.accessibility_text;
        byteString.getClass();
        return new SavingsHome.SavingsOptionsSection(localizableString2, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.SavingsOptionsSection savingsOptionsSection = (SavingsHome.SavingsOptionsSection) obj;
        savingsOptionsSection.getClass();
        SavingsHome.SavingsOptionsSection.SavingsOptionRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, savingsOptionsSection.rows);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, savingsOptionsSection.accessibility_text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, savingsOptionsSection.localizable_accessibility_text);
        protoWriter.writeBytes(savingsOptionsSection.unknownFields());
    }
}
