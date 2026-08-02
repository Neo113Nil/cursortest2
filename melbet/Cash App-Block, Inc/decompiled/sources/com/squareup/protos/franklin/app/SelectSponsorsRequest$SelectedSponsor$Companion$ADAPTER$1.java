package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SelectSponsorsRequest$SelectedSponsor$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectSponsorsRequest.SelectedSponsor((UiCustomer) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (String) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectSponsorsRequest.SelectedSponsor selectedSponsor = (SelectSponsorsRequest.SelectedSponsor) obj;
        reverseProtoWriter.getClass();
        selectedSponsor.getClass();
        reverseProtoWriter.writeBytes(selectedSponsor.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, selectedSponsor.is_cash_customer);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, selectedSponsor.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, selectedSponsor.is_recommended_sponsor);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, selectedSponsor.is_added_to_favorites);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, selectedSponsor.is_in_contacts);
        UiCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectedSponsor.sponsor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectSponsorsRequest.SelectedSponsor selectedSponsor = (SelectSponsorsRequest.SelectedSponsor) obj;
        selectedSponsor.getClass();
        int encodedSizeWithTag = UiCustomer.ADAPTER.encodedSizeWithTag(1, selectedSponsor.sponsor) + selectedSponsor.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(6, selectedSponsor.is_cash_customer) + ProtoAdapter.STRING.encodedSizeWithTag(5, selectedSponsor.full_name) + protoAdapter.encodedSizeWithTag(4, selectedSponsor.is_recommended_sponsor) + protoAdapter.encodedSizeWithTag(3, selectedSponsor.is_added_to_favorites) + protoAdapter.encodedSizeWithTag(2, selectedSponsor.is_in_contacts) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectSponsorsRequest.SelectedSponsor selectedSponsor = (SelectSponsorsRequest.SelectedSponsor) obj;
        selectedSponsor.getClass();
        UiCustomer uiCustomer = selectedSponsor.sponsor;
        UiCustomer uiCustomer2 = uiCustomer != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = selectedSponsor.is_in_contacts;
        Boolean bool2 = selectedSponsor.is_added_to_favorites;
        Boolean bool3 = selectedSponsor.is_recommended_sponsor;
        Boolean bool4 = selectedSponsor.is_cash_customer;
        byteString.getClass();
        return new SelectSponsorsRequest.SelectedSponsor(uiCustomer2, bool, bool2, bool3, null, bool4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectSponsorsRequest.SelectedSponsor selectedSponsor = (SelectSponsorsRequest.SelectedSponsor) obj;
        selectedSponsor.getClass();
        UiCustomer.ADAPTER.encodeWithTag(protoWriter, 1, selectedSponsor.sponsor);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, selectedSponsor.is_in_contacts);
        protoAdapter.encodeWithTag(protoWriter, 3, selectedSponsor.is_added_to_favorites);
        protoAdapter.encodeWithTag(protoWriter, 4, selectedSponsor.is_recommended_sponsor);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, selectedSponsor.full_name);
        protoAdapter.encodeWithTag(protoWriter, 6, selectedSponsor.is_cash_customer);
        protoWriter.writeBytes(selectedSponsor.unknownFields());
    }
}
