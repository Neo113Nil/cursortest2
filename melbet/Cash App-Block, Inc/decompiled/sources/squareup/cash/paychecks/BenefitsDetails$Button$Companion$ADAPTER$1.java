package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes10.dex */
public final class BenefitsDetails$Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsDetails.Button((LocalizedString) obj, benefitsDetails$Button$Action_$ClientRoute, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                benefitsDetails$Button$Action_$ClientRoute = new BenefitsDetails$Button$Action_$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsDetails.Button button = (BenefitsDetails.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = button.Action;
        if (benefitsDetails$Button$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, benefitsDetails$Button$Action_$ClientRoute.value);
        } else if (benefitsDetails$Button$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.tint_color);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsDetails.Button button = (BenefitsDetails.Button) obj;
        button.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, button.text) + button.unknownFields().getSize$okio();
        BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = button.Action;
        if (benefitsDetails$Button$Action_$ClientRoute != null) {
            encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, benefitsDetails$Button$Action_$ClientRoute.value);
        } else if (benefitsDetails$Button$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return Color.ADAPTER.encodedSizeWithTag(3, button.tint_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsDetails.Button button = (BenefitsDetails.Button) obj;
        button.getClass();
        LocalizedString localizedString = button.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Color color = button.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = button.Action;
        byteString.getClass();
        return new BenefitsDetails.Button(localizedString2, benefitsDetails$Button$Action_$ClientRoute, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsDetails.Button button = (BenefitsDetails.Button) obj;
        button.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, button.text);
        Color.ADAPTER.encodeWithTag(protoWriter, 3, button.tint_color);
        BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = button.Action;
        if (benefitsDetails$Button$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, benefitsDetails$Button$Action_$ClientRoute.value);
        } else if (benefitsDetails$Button$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(button.unknownFields());
    }
}
