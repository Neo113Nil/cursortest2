package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
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

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"com/squareup/protos/cash/local/client/v1/FeatureSet$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/FeatureSet;", "featuresAdapter", "", "", "Lcom/squareup/protos/cash/local/client/v1/Feature;", "getFeaturesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "featuresAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeatureSet$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: featuresAdapter$delegate, reason: from kotlin metadata */
    private final Lazy featuresAdapter;

    public FeatureSet$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.cash.local.client.v1.FeatureSet", syntax, (Object) null, "squareup/cash/local/client/v1/local_common.proto");
        this.featuresAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter featuresAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        ProtoAdapter protoAdapter2 = Feature.ADAPTER;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    private final ProtoAdapter getFeaturesAdapter() {
        return (ProtoAdapter) this.featuresAdapter.getValue();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public FeatureSet decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new FeatureSet(m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.putAll((Map) getFeaturesAdapter().decode(reader));
            } else {
                reader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, FeatureSet value) {
        writer.getClass();
        value.getClass();
        getFeaturesAdapter().encodeWithTag(writer, 1, value.features);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(FeatureSet value) {
        value.getClass();
        return getFeaturesAdapter().encodedSizeWithTag(1, value.features) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public FeatureSet redact(FeatureSet value) {
        value.getClass();
        LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(value.features, Feature.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FeatureSet(m1170redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, FeatureSet value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getFeaturesAdapter().encodeWithTag(writer, 1, value.features);
    }
}
