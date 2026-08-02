package squareup.cash.analytics;

import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"squareup/cash/analytics/CdfEvent$Parameters$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/analytics/CdfEvent$Parameters;", "valuesAdapter", "", "", "getValuesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "valuesAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CdfEvent$Parameters$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: valuesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy valuesAdapter;

    public CdfEvent$Parameters$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.cash.analytics.CdfEvent.Parameters", syntax, (Object) null, "squareup/cash/analytics/cdfEvent.proto");
        this.valuesAdapter = LazyKt.lazy(new HazeStyleKt$$ExternalSyntheticLambda0(17));
    }

    private final ProtoAdapter getValuesAdapter() {
        return (ProtoAdapter) this.valuesAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter valuesAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public CdfEvent.Parameters decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new CdfEvent.Parameters(m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.putAll((Map) getValuesAdapter().decode(reader));
            } else {
                reader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, CdfEvent.Parameters value) {
        writer.getClass();
        value.getClass();
        getValuesAdapter().encodeWithTag(writer, 1, value.values);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(CdfEvent.Parameters value) {
        value.getClass();
        return getValuesAdapter().encodedSizeWithTag(1, value.values) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public CdfEvent.Parameters redact(CdfEvent.Parameters value) {
        value.getClass();
        return CdfEvent.Parameters.copy$default(value, null, ByteString.EMPTY, 1, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, CdfEvent.Parameters value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getValuesAdapter().encodeWithTag(writer, 1, value.values);
    }
}
