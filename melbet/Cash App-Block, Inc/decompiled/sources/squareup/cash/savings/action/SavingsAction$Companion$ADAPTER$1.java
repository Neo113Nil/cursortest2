package squareup.cash.savings.action;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes10.dex */
public final class SavingsAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SavingsAction.Action action = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsAction(action, (CdfEvent) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                action = new SavingsAction.Action.ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 2) {
                action = new SavingsAction.Action.PresentCard((Card) Card.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsAction savingsAction = (SavingsAction) obj;
        reverseProtoWriter.getClass();
        savingsAction.getClass();
        reverseProtoWriter.writeBytes(savingsAction.unknownFields());
        SavingsAction.Action action = savingsAction.action;
        if (action instanceof SavingsAction.Action.ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, ((SavingsAction.Action.ClientRoute) action).value);
        } else if (action instanceof SavingsAction.Action.PresentCard) {
            Card.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SavingsAction.Action.PresentCard) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsAction.cdfEvent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SavingsAction savingsAction = (SavingsAction) obj;
        savingsAction.getClass();
        int size$okio = savingsAction.unknownFields().getSize$okio();
        SavingsAction.Action action = savingsAction.action;
        if (action instanceof SavingsAction.Action.ClientRoute) {
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((SavingsAction.Action.ClientRoute) action).value);
        } else {
            if (!(action instanceof SavingsAction.Action.PresentCard)) {
                if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return CdfEvent.ADAPTER.encodedSizeWithTag(3, savingsAction.cdfEvent) + size$okio;
            }
            encodedSizeWithTag = Card.ADAPTER.encodedSizeWithTag(2, ((SavingsAction.Action.PresentCard) action).value);
        }
        size$okio += encodedSizeWithTag;
        return CdfEvent.ADAPTER.encodedSizeWithTag(3, savingsAction.cdfEvent) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsAction savingsAction = (SavingsAction) obj;
        savingsAction.getClass();
        CdfEvent cdfEvent = savingsAction.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        SavingsAction.Action action = savingsAction.action;
        byteString.getClass();
        return new SavingsAction(action, cdfEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsAction savingsAction = (SavingsAction) obj;
        savingsAction.getClass();
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 3, savingsAction.cdfEvent);
        SavingsAction.Action action = savingsAction.action;
        if (action instanceof SavingsAction.Action.ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ((SavingsAction.Action.ClientRoute) action).value);
        } else if (action instanceof SavingsAction.Action.PresentCard) {
            Card.ADAPTER.encodeWithTag(protoWriter, 2, ((SavingsAction.Action.PresentCard) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(savingsAction.unknownFields());
    }
}
