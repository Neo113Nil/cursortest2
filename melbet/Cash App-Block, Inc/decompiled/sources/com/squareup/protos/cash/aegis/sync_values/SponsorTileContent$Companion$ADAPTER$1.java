package com.squareup.protos.cash.aegis.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SponsorTileContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SponsorTileContent(m, (LocalizedString) obj, (LocalizedString) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag == 5) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 6) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SponsorTileContent sponsorTileContent = (SponsorTileContent) obj;
        reverseProtoWriter.getClass();
        sponsorTileContent.getClass();
        reverseProtoWriter.writeBytes(sponsorTileContent.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 7, sponsorTileContent.became_active_sponsor_at);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, sponsorTileContent.localized_pending_requests);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, sponsorTileContent.localized_dependent_names);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, sponsorTileContent.avatar_customer_tokens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SponsorTileContent sponsorTileContent = (SponsorTileContent) obj;
        sponsorTileContent.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, sponsorTileContent.avatar_customer_tokens) + sponsorTileContent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(7, sponsorTileContent.became_active_sponsor_at) + protoAdapter.encodedSizeWithTag(6, sponsorTileContent.localized_pending_requests) + protoAdapter.encodedSizeWithTag(5, sponsorTileContent.localized_dependent_names) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SponsorTileContent sponsorTileContent = (SponsorTileContent) obj;
        sponsorTileContent.getClass();
        LocalizedString localizedString = sponsorTileContent.localized_pending_requests;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = sponsorTileContent.avatar_customer_tokens;
        Long l = sponsorTileContent.became_active_sponsor_at;
        list.getClass();
        byteString.getClass();
        return new SponsorTileContent(list, null, localizedString2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SponsorTileContent sponsorTileContent = (SponsorTileContent) obj;
        sponsorTileContent.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, sponsorTileContent.avatar_customer_tokens);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, sponsorTileContent.localized_dependent_names);
        protoAdapter.encodeWithTag(protoWriter, 6, sponsorTileContent.localized_pending_requests);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, sponsorTileContent.became_active_sponsor_at);
        protoWriter.writeBytes(sponsorTileContent.unknownFields());
    }
}
