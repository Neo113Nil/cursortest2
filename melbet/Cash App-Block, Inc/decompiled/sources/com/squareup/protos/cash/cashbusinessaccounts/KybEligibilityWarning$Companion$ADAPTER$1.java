package com.squareup.protos.cash.cashbusinessaccounts;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KybEligibilityWarning$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new KybEligibilityWarning(m, (String) obj, (String) obj2, (KybEligibilityWarning.Action) obj3, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    KybEligibilityWarning.RestrictedFeature.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(KybEligibilityWarning.Action.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(KybEligibilityWarning.BannerDetail.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        KybEligibilityWarning kybEligibilityWarning = (KybEligibilityWarning) obj;
        reverseProtoWriter.getClass();
        kybEligibilityWarning.getClass();
        reverseProtoWriter.writeBytes(kybEligibilityWarning.unknownFields());
        KybEligibilityWarning.BannerDetail.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, kybEligibilityWarning.banner_details);
        KybEligibilityWarning.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, kybEligibilityWarning.action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, kybEligibilityWarning.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, kybEligibilityWarning.title);
        KybEligibilityWarning.RestrictedFeature.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, kybEligibilityWarning.restricted_feature_set);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KybEligibilityWarning kybEligibilityWarning = (KybEligibilityWarning) obj;
        kybEligibilityWarning.getClass();
        int encodedSizeWithTag = KybEligibilityWarning.RestrictedFeature.ADAPTER.asRepeated().encodedSizeWithTag(1, kybEligibilityWarning.restricted_feature_set) + kybEligibilityWarning.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return KybEligibilityWarning.BannerDetail.ADAPTER.asRepeated().encodedSizeWithTag(5, kybEligibilityWarning.banner_details) + KybEligibilityWarning.Action.ADAPTER.encodedSizeWithTag(4, kybEligibilityWarning.action) + protoAdapter.encodedSizeWithTag(3, kybEligibilityWarning.subtitle) + protoAdapter.encodedSizeWithTag(2, kybEligibilityWarning.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KybEligibilityWarning kybEligibilityWarning = (KybEligibilityWarning) obj;
        kybEligibilityWarning.getClass();
        KybEligibilityWarning.Action action = kybEligibilityWarning.action;
        KybEligibilityWarning.Action action2 = action != null ? (KybEligibilityWarning.Action) KybEligibilityWarning.Action.ADAPTER.redact(action) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(kybEligibilityWarning.banner_details, KybEligibilityWarning.BannerDetail.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = kybEligibilityWarning.restricted_feature_set;
        list.getClass();
        byteString.getClass();
        return new KybEligibilityWarning(list, null, null, action2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KybEligibilityWarning kybEligibilityWarning = (KybEligibilityWarning) obj;
        kybEligibilityWarning.getClass();
        KybEligibilityWarning.RestrictedFeature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, kybEligibilityWarning.restricted_feature_set);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, kybEligibilityWarning.title);
        protoAdapter.encodeWithTag(protoWriter, 3, kybEligibilityWarning.subtitle);
        KybEligibilityWarning.Action.ADAPTER.encodeWithTag(protoWriter, 4, kybEligibilityWarning.action);
        KybEligibilityWarning.BannerDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, kybEligibilityWarning.banner_details);
        protoWriter.writeBytes(kybEligibilityWarning.unknownFields());
    }
}
