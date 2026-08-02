package com.squareup.protos.cash.kgoose.api.v3;

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

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR-\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CustomerContext$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerContext;", "", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CustomerData;", "data_attributesAdapter$delegate", "Lkotlin/Lazy;", "getData_attributesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "data_attributesAdapter", "headers_attributesAdapter$delegate", "getHeaders_attributesAdapter", "headers_attributesAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomerContext$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: data_attributesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy data_attributesAdapter;

    /* renamed from: headers_attributesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy headers_attributesAdapter;

    public CustomerContext$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.CustomerContext", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/customer_context.proto");
        this.data_attributesAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(9));
        this.headers_attributesAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(10));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CustomerContext(m, linkedHashMap, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.putAll((Map) ((ProtoAdapter) this.data_attributesAdapter.getValue()).decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                linkedHashMap.putAll((Map) ((ProtoAdapter) this.headers_attributesAdapter.getValue()).decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        reverseProtoWriter.getClass();
        customerContext.getClass();
        reverseProtoWriter.writeBytes(customerContext.unknownFields());
        ((ProtoAdapter) this.headers_attributesAdapter.getValue()).encodeWithTag(reverseProtoWriter, 2, customerContext.headers_attributes);
        ((ProtoAdapter) this.data_attributesAdapter.getValue()).encodeWithTag(reverseProtoWriter, 1, customerContext.data_attributes);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        customerContext.getClass();
        return ((ProtoAdapter) this.headers_attributesAdapter.getValue()).encodedSizeWithTag(2, customerContext.headers_attributes) + ((ProtoAdapter) this.data_attributesAdapter.getValue()).encodedSizeWithTag(1, customerContext.data_attributes) + customerContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        customerContext.getClass();
        LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(customerContext.data_attributes, CustomerData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Map<String, String> map = customerContext.headers_attributes;
        map.getClass();
        byteString.getClass();
        return new CustomerContext(m1170redactElements, map, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomerContext customerContext = (CustomerContext) obj;
        customerContext.getClass();
        ((ProtoAdapter) this.data_attributesAdapter.getValue()).encodeWithTag(protoWriter, 1, customerContext.data_attributes);
        ((ProtoAdapter) this.headers_attributesAdapter.getValue()).encodeWithTag(protoWriter, 2, customerContext.headers_attributes);
        protoWriter.writeBytes(customerContext.unknownFields());
    }
}
