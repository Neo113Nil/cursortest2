package com.squareup.protos.cash.cdpproxy.api;

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
import kotlin.collections.EmptyMap;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R/\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"com/squareup/protos/cash/cdpproxy/api/IdentifyMessage$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/cdpproxy/api/IdentifyMessage;", "traitsAdapter", "", "", "", "getTraitsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "traitsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IdentifyMessage$Companion$ADAPTER$1 extends ProtoAdapter {

    /* renamed from: traitsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy traitsAdapter;

    public IdentifyMessage$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/squareup.cash.cdpproxy.service.IdentifyMessage", syntax, (Object) null, "squareup/cash/cdpproxy/api/identify_message.proto");
        this.traitsAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(3));
    }

    private final ProtoAdapter getTraitsAdapter() {
        return (ProtoAdapter) this.traitsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter traitsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
        companion.getClass();
        return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public IdentifyMessage decode(ProtoReader reader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(reader);
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new IdentifyMessage(m, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.putAll((Map) getTraitsAdapter().decode(reader));
            } else {
                reader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, IdentifyMessage value) {
        writer.getClass();
        value.getClass();
        getTraitsAdapter().encodeWithTag(writer, 1, value.traits);
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(IdentifyMessage value) {
        value.getClass();
        return getTraitsAdapter().encodedSizeWithTag(1, value.traits) + value.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public IdentifyMessage redact(IdentifyMessage value) {
        value.getClass();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        ByteString byteString = ByteString.EMPTY;
        value.getClass();
        byteString.getClass();
        return new IdentifyMessage(emptyMap, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, IdentifyMessage value) {
        writer.getClass();
        value.getClass();
        writer.writeBytes(value.unknownFields());
        getTraitsAdapter().encodeWithTag(writer, 1, value.traits);
    }
}
