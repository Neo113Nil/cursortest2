package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes10.dex */
public final class BenefitsDetails$ColoredText$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BenefitsDetails.ColoredText((LocalizedString) obj, (String) obj2, m, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsDetails.ColoredText coloredText = (BenefitsDetails.ColoredText) obj;
        reverseProtoWriter.getClass();
        coloredText.getClass();
        reverseProtoWriter.writeBytes(coloredText.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, coloredText.tint_color);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, coloredText.values);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, coloredText.placeholder_string);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, coloredText.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsDetails.ColoredText coloredText = (BenefitsDetails.ColoredText) obj;
        coloredText.getClass();
        int size$okio = coloredText.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(4, coloredText.tint_color) + protoAdapter.asRepeated().encodedSizeWithTag(3, coloredText.values) + ProtoAdapter.STRING.encodedSizeWithTag(2, coloredText.placeholder_string) + protoAdapter.encodedSizeWithTag(1, coloredText.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsDetails.ColoredText coloredText = (BenefitsDetails.ColoredText) obj;
        coloredText.getClass();
        LocalizedString localizedString = coloredText.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(coloredText.values, LocalizedString.ADAPTER);
        Color color = coloredText.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = coloredText.placeholder_string;
        byteString.getClass();
        return new BenefitsDetails.ColoredText(localizedString2, str, m1169redactElements, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsDetails.ColoredText coloredText = (BenefitsDetails.ColoredText) obj;
        coloredText.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, coloredText.text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, coloredText.placeholder_string);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, coloredText.values);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, coloredText.tint_color);
        protoWriter.writeBytes(coloredText.unknownFields());
    }
}
