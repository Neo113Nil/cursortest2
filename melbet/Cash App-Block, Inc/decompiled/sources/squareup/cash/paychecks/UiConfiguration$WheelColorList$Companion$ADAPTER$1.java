package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes10.dex */
public final class UiConfiguration$WheelColorList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiConfiguration.WheelColorList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Color.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiConfiguration.WheelColorList wheelColorList = (UiConfiguration.WheelColorList) obj;
        reverseProtoWriter.getClass();
        wheelColorList.getClass();
        reverseProtoWriter.writeBytes(wheelColorList.unknownFields());
        Color.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, wheelColorList.product_tint_wheel_color_list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiConfiguration.WheelColorList wheelColorList = (UiConfiguration.WheelColorList) obj;
        wheelColorList.getClass();
        return Color.ADAPTER.asRepeated().encodedSizeWithTag(1, wheelColorList.product_tint_wheel_color_list) + wheelColorList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiConfiguration.WheelColorList wheelColorList = (UiConfiguration.WheelColorList) obj;
        wheelColorList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(wheelColorList.product_tint_wheel_color_list, Color.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiConfiguration.WheelColorList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiConfiguration.WheelColorList wheelColorList = (UiConfiguration.WheelColorList) obj;
        wheelColorList.getClass();
        Color.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, wheelColorList.product_tint_wheel_color_list);
        protoWriter.writeBytes(wheelColorList.unknownFields());
    }
}
