package com.squareup.protos.franklin.sca;

import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
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

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"com/squareup/protos/franklin/sca/ThreeDomainSecureRedirectUrl$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/sca/ThreeDomainSecureRedirectUrl;", "paramsAdapter", "", "", "getParamsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "paramsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThreeDomainSecureRedirectUrl$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: paramsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy paramsAdapter;

    public ThreeDomainSecureRedirectUrl$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.franklin.sca.ThreeDomainSecureRedirectUrl", syntax, (Object) null, "squareup/franklin/sca/three_domain_secure.proto");
        this.paramsAdapter = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(2));
    }

    private final ProtoAdapter getParamsAdapter() {
        return (ProtoAdapter) this.paramsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter paramsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ThreeDomainSecureRedirectUrl decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new ThreeDomainSecureRedirectUrl((String) obj, (String) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(reader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(reader);
            } else if (nextTag != 3) {
                reader.readUnknownField(nextTag);
            } else {
                m.putAll((Map) getParamsAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, ThreeDomainSecureRedirectUrl value) {
        writer.getClass();
        value.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.method);
        protoAdapter.encodeWithTag(writer, 2, value.base_uri);
        getParamsAdapter().encodeWithTag(writer, 3, value.params);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(ThreeDomainSecureRedirectUrl value) {
        value.getClass();
        int size$okio = value.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return getParamsAdapter().encodedSizeWithTag(3, value.params) + protoAdapter.encodedSizeWithTag(2, value.base_uri) + protoAdapter.encodedSizeWithTag(1, value.method) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public ThreeDomainSecureRedirectUrl redact(ThreeDomainSecureRedirectUrl value) {
        value.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = value.method;
        String str2 = value.base_uri;
        Map<String, String> map = value.params;
        value.getClass();
        map.getClass();
        byteString.getClass();
        return new ThreeDomainSecureRedirectUrl(str, str2, map, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, ThreeDomainSecureRedirectUrl value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getParamsAdapter().encodeWithTag(writer, 3, value.params);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 2, value.base_uri);
        protoAdapter.encodeWithTag(writer, 1, value.method);
    }
}
