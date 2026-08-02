package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ActionButtonGroupSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionButtonGroupSection(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActionButton.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionButtonGroupSection actionButtonGroupSection = (ActionButtonGroupSection) obj;
        reverseProtoWriter.getClass();
        actionButtonGroupSection.getClass();
        reverseProtoWriter.writeBytes(actionButtonGroupSection.unknownFields());
        ActionButton.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, actionButtonGroupSection.buttons);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionButtonGroupSection actionButtonGroupSection = (ActionButtonGroupSection) obj;
        actionButtonGroupSection.getClass();
        return ActionButton.ADAPTER.asRepeated().encodedSizeWithTag(1, actionButtonGroupSection.buttons) + actionButtonGroupSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionButtonGroupSection actionButtonGroupSection = (ActionButtonGroupSection) obj;
        actionButtonGroupSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(actionButtonGroupSection.buttons, ActionButton.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ActionButtonGroupSection(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionButtonGroupSection actionButtonGroupSection = (ActionButtonGroupSection) obj;
        actionButtonGroupSection.getClass();
        ActionButton.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, actionButtonGroupSection.buttons);
        protoWriter.writeBytes(actionButtonGroupSection.unknownFields());
    }
}
