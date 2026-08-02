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
public final class PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.Header.NullStateUpsell.DetailRow((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Boolean) obj4, paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = new PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell.DetailRow detailRow = (PaychecksHomeUi.Header.NullStateUpsell.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = detailRow.Action;
        if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute.value);
        } else if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, detailRow.step_completed);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailRow.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, detailRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, detailRow.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell.DetailRow detailRow = (PaychecksHomeUi.Header.NullStateUpsell.DetailRow) obj;
        detailRow.getClass();
        int size$okio = detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(5, detailRow.step_completed) + protoAdapter.encodedSizeWithTag(3, detailRow.button_text) + protoAdapter.encodedSizeWithTag(2, detailRow.subtitle) + protoAdapter.encodedSizeWithTag(1, detailRow.title) + size$okio;
        PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = detailRow.Action;
        if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null) {
            return ProtoAdapter.STRING.encodedSizeWithTag(4, paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute.value) + encodedSizeWithTag;
        }
        if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell.DetailRow detailRow = (PaychecksHomeUi.Header.NullStateUpsell.DetailRow) obj;
        detailRow.getClass();
        LocalizedString localizedString = detailRow.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = detailRow.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = detailRow.button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = detailRow.step_completed;
        PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = detailRow.Action;
        byteString.getClass();
        return new PaychecksHomeUi.Header.NullStateUpsell.DetailRow(localizedString2, localizedString4, localizedString6, bool, paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.Header.NullStateUpsell.DetailRow detailRow = (PaychecksHomeUi.Header.NullStateUpsell.DetailRow) obj;
        detailRow.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, detailRow.title);
        protoAdapter.encodeWithTag(protoWriter, 2, detailRow.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, detailRow.button_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, detailRow.step_completed);
        PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = detailRow.Action;
        if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute.value);
        } else if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
