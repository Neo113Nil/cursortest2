package com.squareup.protos.cash.cdpproxy.api;

import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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
import kotlin.collections.EmptyMap;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"com/squareup/protos/cash/cdpproxy/api/ProxyAppendedFields$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/cdpproxy/api/ProxyAppendedFields;", "propertiesAdapter", "", "", "getPropertiesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "propertiesAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProxyAppendedFields$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: propertiesAdapter$delegate, reason: from kotlin metadata */
    private final Lazy propertiesAdapter;

    public ProxyAppendedFields$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.cash.cdpproxy.service.ProxyAppendedFields", syntax, (Object) null, "squareup/cash/cdpproxy/api/proxy_appended_fields.proto");
        this.propertiesAdapter = LazyKt.lazy(new Moneys$$ExternalSyntheticLambda0(21));
    }

    private final ProtoAdapter getPropertiesAdapter() {
        return (ProtoAdapter) this.propertiesAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter propertiesAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ProxyAppendedFields decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new ProxyAppendedFields(m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.putAll((Map) getPropertiesAdapter().decode(reader));
            } else {
                reader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ProxyAppendedFields value) {
        writer.getClass();
        value.getClass();
        getPropertiesAdapter().encodeWithTag(writer, 1, value.properties);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ProxyAppendedFields value) {
        value.getClass();
        return getPropertiesAdapter().encodedSizeWithTag(1, value.properties) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ProxyAppendedFields redact(ProxyAppendedFields value) {
        value.getClass();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        ByteString byteString = ByteString.EMPTY;
        value.getClass();
        byteString.getClass();
        return new ProxyAppendedFields(emptyMap, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, ProxyAppendedFields value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getPropertiesAdapter().encodeWithTag(writer, 1, value.properties);
    }
}
