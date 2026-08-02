package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/StaticPickerSource$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/StaticPickerSource;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StaticPickerSource$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StaticPickerSource(m, (String) obj, (LocalizedString) obj2, (LocalizedString) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PickerOption.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StaticPickerSource staticPickerSource = (StaticPickerSource) obj;
        reverseProtoWriter.getClass();
        staticPickerSource.getClass();
        reverseProtoWriter.writeBytes(staticPickerSource.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, staticPickerSource.amount_field_placeholder_key);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, staticPickerSource.cta);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, staticPickerSource.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, staticPickerSource.prefilled_value);
        PickerOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, staticPickerSource.options);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StaticPickerSource staticPickerSource = (StaticPickerSource) obj;
        staticPickerSource.getClass();
        int encodedSizeWithTag = PickerOption.ADAPTER.asRepeated().encodedSizeWithTag(1, staticPickerSource.options) + staticPickerSource.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, staticPickerSource.prefilled_value) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, staticPickerSource.amount_field_placeholder_key) + protoAdapter2.encodedSizeWithTag(3, staticPickerSource.cta) + protoAdapter2.encodedSizeWithTag(2, staticPickerSource.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StaticPickerSource staticPickerSource = (StaticPickerSource) obj;
        staticPickerSource.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(staticPickerSource.options, PickerOption.ADAPTER);
        LocalizedString localizedString = staticPickerSource.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = staticPickerSource.cta;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = staticPickerSource.prefilled_value;
        String str2 = staticPickerSource.amount_field_placeholder_key;
        byteString.getClass();
        return new StaticPickerSource(m1169redactElements, str, localizedString2, localizedString4, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StaticPickerSource staticPickerSource = (StaticPickerSource) obj;
        staticPickerSource.getClass();
        PickerOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, staticPickerSource.options);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, staticPickerSource.prefilled_value);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, staticPickerSource.title);
        protoAdapter2.encodeWithTag(protoWriter, 3, staticPickerSource.cta);
        protoAdapter.encodeWithTag(protoWriter, 5, staticPickerSource.amount_field_placeholder_key);
        protoWriter.writeBytes(staticPickerSource.unknownFields());
    }
}
