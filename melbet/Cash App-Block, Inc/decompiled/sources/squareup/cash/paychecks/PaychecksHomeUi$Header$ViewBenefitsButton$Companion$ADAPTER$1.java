package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Header$ViewBenefitsButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.Header.ViewBenefitsButton((LocalizedString) obj, paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = new PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.Header.ViewBenefitsButton viewBenefitsButton = (PaychecksHomeUi.Header.ViewBenefitsButton) obj;
        reverseProtoWriter.getClass();
        viewBenefitsButton.getClass();
        reverseProtoWriter.writeBytes(viewBenefitsButton.unknownFields());
        PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = viewBenefitsButton.Action;
        if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute.value);
        } else if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, viewBenefitsButton.button_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.Header.ViewBenefitsButton viewBenefitsButton = (PaychecksHomeUi.Header.ViewBenefitsButton) obj;
        viewBenefitsButton.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, viewBenefitsButton.button_text) + viewBenefitsButton.unknownFields().getSize$okio();
        PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = viewBenefitsButton.Action;
        if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute.value) + encodedSizeWithTag;
        }
        if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.Header.ViewBenefitsButton viewBenefitsButton = (PaychecksHomeUi.Header.ViewBenefitsButton) obj;
        viewBenefitsButton.getClass();
        LocalizedString localizedString = viewBenefitsButton.button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = viewBenefitsButton.Action;
        byteString.getClass();
        return new PaychecksHomeUi.Header.ViewBenefitsButton(localizedString2, paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.Header.ViewBenefitsButton viewBenefitsButton = (PaychecksHomeUi.Header.ViewBenefitsButton) obj;
        viewBenefitsButton.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, viewBenefitsButton.button_text);
        PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = viewBenefitsButton.Action;
        if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute.value);
        } else if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(viewBenefitsButton.unknownFields());
    }
}
