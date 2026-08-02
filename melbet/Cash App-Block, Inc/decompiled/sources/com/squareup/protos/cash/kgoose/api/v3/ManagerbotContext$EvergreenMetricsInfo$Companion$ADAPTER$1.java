package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.kgoose.api.v3.ManagerbotContext;
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

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotContext$EvergreenMetricsInfo;", "", "", "Lcom/squareup/protos/cash/kgoose/api/v3/DataAttribute;", "data_attributesAdapter$delegate", "Lkotlin/Lazy;", "getData_attributesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "data_attributesAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManagerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: data_attributesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy data_attributesAdapter;

    public ManagerbotContext$EvergreenMetricsInfo$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.ManagerbotContext.EvergreenMetricsInfo", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        this.data_attributesAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(11));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ManagerbotContext.EvergreenMetricsInfo((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.putAll((Map) ((ProtoAdapter) this.data_attributesAdapter.getValue()).decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ManagerbotContext.EvergreenMetricsInfo evergreenMetricsInfo = (ManagerbotContext.EvergreenMetricsInfo) obj;
        reverseProtoWriter.getClass();
        evergreenMetricsInfo.getClass();
        reverseProtoWriter.writeBytes(evergreenMetricsInfo.unknownFields());
        ((ProtoAdapter) this.data_attributesAdapter.getValue()).encodeWithTag(reverseProtoWriter, 3, evergreenMetricsInfo.data_attributes);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, evergreenMetricsInfo.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, evergreenMetricsInfo.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ManagerbotContext.EvergreenMetricsInfo evergreenMetricsInfo = (ManagerbotContext.EvergreenMetricsInfo) obj;
        evergreenMetricsInfo.getClass();
        int size$okio = evergreenMetricsInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ((ProtoAdapter) this.data_attributesAdapter.getValue()).encodedSizeWithTag(3, evergreenMetricsInfo.data_attributes) + protoAdapter.encodedSizeWithTag(2, evergreenMetricsInfo.description) + protoAdapter.encodedSizeWithTag(1, evergreenMetricsInfo.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManagerbotContext.EvergreenMetricsInfo evergreenMetricsInfo = (ManagerbotContext.EvergreenMetricsInfo) obj;
        evergreenMetricsInfo.getClass();
        LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(evergreenMetricsInfo.data_attributes, DataAttribute.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = evergreenMetricsInfo.id;
        String str2 = evergreenMetricsInfo.description;
        byteString.getClass();
        return new ManagerbotContext.EvergreenMetricsInfo(str, str2, m1170redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManagerbotContext.EvergreenMetricsInfo evergreenMetricsInfo = (ManagerbotContext.EvergreenMetricsInfo) obj;
        evergreenMetricsInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, evergreenMetricsInfo.id);
        protoAdapter.encodeWithTag(protoWriter, 2, evergreenMetricsInfo.description);
        ((ProtoAdapter) this.data_attributesAdapter.getValue()).encodeWithTag(protoWriter, 3, evergreenMetricsInfo.data_attributes);
        protoWriter.writeBytes(evergreenMetricsInfo.unknownFields());
    }
}
