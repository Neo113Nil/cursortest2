package squareup.cash.bills;

import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class BillsApplet$BillsAppletAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        HeaderSectionKt headerSectionKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BillsApplet.BillsAppletAction(headerSectionKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                headerSectionKt = new BillsApplet$BillsAppletAction$Action$OpenDialog((BillsApplet.BillsAppletAction.OpenDialog) BillsApplet.BillsAppletAction.OpenDialog.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                headerSectionKt = new BillsApplet$BillsAppletAction$Action$ClientRoute((BillsApplet.BillsAppletAction.ClientRoute) BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BillsApplet.BillsAppletAction billsAppletAction = (BillsApplet.BillsAppletAction) obj;
        reverseProtoWriter.getClass();
        billsAppletAction.getClass();
        reverseProtoWriter.writeBytes(billsAppletAction.unknownFields());
        HeaderSectionKt headerSectionKt = billsAppletAction.action;
        if (headerSectionKt instanceof BillsApplet$BillsAppletAction$Action$OpenDialog) {
            BillsApplet.BillsAppletAction.OpenDialog.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((BillsApplet$BillsAppletAction$Action$OpenDialog) headerSectionKt).value);
        } else if (headerSectionKt instanceof BillsApplet$BillsAppletAction$Action$ClientRoute) {
            BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BillsApplet$BillsAppletAction$Action$ClientRoute) headerSectionKt).value);
        } else {
            if (headerSectionKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        BillsApplet.BillsAppletAction billsAppletAction = (BillsApplet.BillsAppletAction) obj;
        billsAppletAction.getClass();
        int size$okio = billsAppletAction.unknownFields().getSize$okio();
        HeaderSectionKt headerSectionKt = billsAppletAction.action;
        if (headerSectionKt instanceof BillsApplet$BillsAppletAction$Action$OpenDialog) {
            encodedSizeWithTag = BillsApplet.BillsAppletAction.OpenDialog.ADAPTER.encodedSizeWithTag(1, ((BillsApplet$BillsAppletAction$Action$OpenDialog) headerSectionKt).value);
        } else {
            if (!(headerSectionKt instanceof BillsApplet$BillsAppletAction$Action$ClientRoute)) {
                if (headerSectionKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.encodedSizeWithTag(2, ((BillsApplet$BillsAppletAction$Action$ClientRoute) headerSectionKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BillsApplet.BillsAppletAction billsAppletAction = (BillsApplet.BillsAppletAction) obj;
        billsAppletAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        HeaderSectionKt headerSectionKt = billsAppletAction.action;
        byteString.getClass();
        return new BillsApplet.BillsAppletAction(headerSectionKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BillsApplet.BillsAppletAction billsAppletAction = (BillsApplet.BillsAppletAction) obj;
        billsAppletAction.getClass();
        HeaderSectionKt headerSectionKt = billsAppletAction.action;
        if (headerSectionKt instanceof BillsApplet$BillsAppletAction$Action$OpenDialog) {
            BillsApplet.BillsAppletAction.OpenDialog.ADAPTER.encodeWithTag(protoWriter, 1, ((BillsApplet$BillsAppletAction$Action$OpenDialog) headerSectionKt).value);
        } else if (headerSectionKt instanceof BillsApplet$BillsAppletAction$Action$ClientRoute) {
            BillsApplet.BillsAppletAction.ClientRoute.ADAPTER.encodeWithTag(protoWriter, 2, ((BillsApplet$BillsAppletAction$Action$ClientRoute) headerSectionKt).value);
        } else if (headerSectionKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(billsAppletAction.unknownFields());
    }
}
