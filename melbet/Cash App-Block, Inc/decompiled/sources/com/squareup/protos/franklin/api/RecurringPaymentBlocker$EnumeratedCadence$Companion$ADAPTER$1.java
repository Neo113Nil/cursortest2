package com.squareup.protos.franklin.api;

import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"com/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RecurringPaymentBlocker$EnumeratedCadence;", "enumerated_descriptionsAdapter", "", "", "", "getEnumerated_descriptionsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "enumerated_descriptionsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: enumerated_descriptionsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy enumerated_descriptionsAdapter;

    public RecurringPaymentBlocker$EnumeratedCadence$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.franklin.api.RecurringPaymentBlocker.EnumeratedCadence", syntax, (Object) null, "squareup/franklin/blockers/recurring_payment_blocker.proto");
        this.enumerated_descriptionsAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter enumerated_descriptionsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    private final ProtoAdapter getEnumerated_descriptionsAdapter() {
        return (ProtoAdapter) this.enumerated_descriptionsAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public RecurringPaymentBlocker.EnumeratedCadence decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new RecurringPaymentBlocker.EnumeratedCadence((String) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(reader);
            } else if (nextTag != 2) {
                reader.readUnknownField(nextTag);
            } else {
                m.putAll((Map) getEnumerated_descriptionsAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, RecurringPaymentBlocker.EnumeratedCadence value) {
        writer.getClass();
        value.getClass();
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.cadence);
        getEnumerated_descriptionsAdapter().encodeWithTag(writer, 2, value.enumerated_descriptions);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(RecurringPaymentBlocker.EnumeratedCadence value) {
        value.getClass();
        return getEnumerated_descriptionsAdapter().encodedSizeWithTag(2, value.enumerated_descriptions) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.cadence) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public RecurringPaymentBlocker.EnumeratedCadence redact(RecurringPaymentBlocker.EnumeratedCadence value) {
        value.getClass();
        return RecurringPaymentBlocker.EnumeratedCadence.copy$default(value, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, RecurringPaymentBlocker.EnumeratedCadence value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getEnumerated_descriptionsAdapter().encodeWithTag(writer, 2, value.enumerated_descriptions);
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.cadence);
    }
}
