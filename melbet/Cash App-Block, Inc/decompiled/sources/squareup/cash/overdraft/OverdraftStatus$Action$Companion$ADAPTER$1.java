package squareup.cash.overdraft;

import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Action$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        MoneyTabBookletKt moneyTabBookletKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Action(moneyTabBookletKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                moneyTabBookletKt = new OverdraftStatus$Action$Action$ActivateOverdraftAction((OverdraftStatus.Action.ActivateOverdraftAction) OverdraftStatus.Action.ActivateOverdraftAction.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                moneyTabBookletKt = new OverdraftStatus$Action$Action$EnableOverdraftAction((OverdraftStatus.Action.EnableOverdraftAction) OverdraftStatus.Action.EnableOverdraftAction.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                moneyTabBookletKt = new OverdraftStatus$Action$Action$DisableOverdraftAction((OverdraftStatus.Action.DisableOverdraftAction) OverdraftStatus.Action.DisableOverdraftAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.Action action = (OverdraftStatus.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        MoneyTabBookletKt moneyTabBookletKt = action.action;
        if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$ActivateOverdraftAction) {
            OverdraftStatus.Action.ActivateOverdraftAction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((OverdraftStatus$Action$Action$ActivateOverdraftAction) moneyTabBookletKt).value);
            return;
        }
        if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$EnableOverdraftAction) {
            OverdraftStatus.Action.EnableOverdraftAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((OverdraftStatus$Action$Action$EnableOverdraftAction) moneyTabBookletKt).value);
        } else if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$DisableOverdraftAction) {
            OverdraftStatus.Action.DisableOverdraftAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OverdraftStatus$Action$Action$DisableOverdraftAction) moneyTabBookletKt).value);
        } else {
            if (moneyTabBookletKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OverdraftStatus.Action action = (OverdraftStatus.Action) obj;
        action.getClass();
        int size$okio = action.unknownFields().getSize$okio();
        MoneyTabBookletKt moneyTabBookletKt = action.action;
        if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$ActivateOverdraftAction) {
            encodedSizeWithTag = OverdraftStatus.Action.ActivateOverdraftAction.ADAPTER.encodedSizeWithTag(1, ((OverdraftStatus$Action$Action$ActivateOverdraftAction) moneyTabBookletKt).value);
        } else if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$EnableOverdraftAction) {
            encodedSizeWithTag = OverdraftStatus.Action.EnableOverdraftAction.ADAPTER.encodedSizeWithTag(2, ((OverdraftStatus$Action$Action$EnableOverdraftAction) moneyTabBookletKt).value);
        } else {
            if (!(moneyTabBookletKt instanceof OverdraftStatus$Action$Action$DisableOverdraftAction)) {
                if (moneyTabBookletKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = OverdraftStatus.Action.DisableOverdraftAction.ADAPTER.encodedSizeWithTag(3, ((OverdraftStatus$Action$Action$DisableOverdraftAction) moneyTabBookletKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.Action action = (OverdraftStatus.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        MoneyTabBookletKt moneyTabBookletKt = action.action;
        byteString.getClass();
        return new OverdraftStatus.Action(moneyTabBookletKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Action action = (OverdraftStatus.Action) obj;
        action.getClass();
        MoneyTabBookletKt moneyTabBookletKt = action.action;
        if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$ActivateOverdraftAction) {
            OverdraftStatus.Action.ActivateOverdraftAction.ADAPTER.encodeWithTag(protoWriter, 1, ((OverdraftStatus$Action$Action$ActivateOverdraftAction) moneyTabBookletKt).value);
        } else if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$EnableOverdraftAction) {
            OverdraftStatus.Action.EnableOverdraftAction.ADAPTER.encodeWithTag(protoWriter, 2, ((OverdraftStatus$Action$Action$EnableOverdraftAction) moneyTabBookletKt).value);
        } else if (moneyTabBookletKt instanceof OverdraftStatus$Action$Action$DisableOverdraftAction) {
            OverdraftStatus.Action.DisableOverdraftAction.ADAPTER.encodeWithTag(protoWriter, 3, ((OverdraftStatus$Action$Action$DisableOverdraftAction) moneyTabBookletKt).value);
        } else if (moneyTabBookletKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(action.unknownFields());
    }
}
