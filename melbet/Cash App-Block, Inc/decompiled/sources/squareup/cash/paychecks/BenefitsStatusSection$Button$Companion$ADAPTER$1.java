package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsStatusSection;

/* loaded from: classes10.dex */
public final class BenefitsStatusSection$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsStatusSection.Button((LocalizedString) obj, benefitsStatusSection$Button$Action_$ClientRoute, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                benefitsStatusSection$Button$Action_$ClientRoute = new BenefitsStatusSection$Button$Action_$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsStatusSection.Button button = (BenefitsStatusSection.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = button.Action;
        if (benefitsStatusSection$Button$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, benefitsStatusSection$Button$Action_$ClientRoute.value);
        } else if (benefitsStatusSection$Button$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsStatusSection.Button button = (BenefitsStatusSection.Button) obj;
        button.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, button.text) + button.unknownFields().getSize$okio();
        BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = button.Action;
        if (benefitsStatusSection$Button$Action_$ClientRoute != null) {
            return ProtoAdapter.STRING.encodedSizeWithTag(2, benefitsStatusSection$Button$Action_$ClientRoute.value) + encodedSizeWithTag;
        }
        if (benefitsStatusSection$Button$Action_$ClientRoute == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsStatusSection.Button button = (BenefitsStatusSection.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = button.Action;
        byteString.getClass();
        return new BenefitsStatusSection.Button(localizedString2, benefitsStatusSection$Button$Action_$ClientRoute, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsStatusSection.Button button = (BenefitsStatusSection.Button) obj;
        button.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, button.text);
        BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = button.Action;
        if (benefitsStatusSection$Button$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, benefitsStatusSection$Button$Action_$ClientRoute.value);
        } else if (benefitsStatusSection$Button$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(button.unknownFields());
    }
}
