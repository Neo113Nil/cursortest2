package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectDependentsRequest$SelectedDependent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectDependentsRequest.SelectedDependent((UiCustomer) obj, (Boolean) obj2, (Boolean) obj3, (String) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiCustomer.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectDependentsRequest.SelectedDependent selectedDependent = (SelectDependentsRequest.SelectedDependent) obj;
        reverseProtoWriter.getClass();
        selectedDependent.getClass();
        reverseProtoWriter.writeBytes(selectedDependent.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, selectedDependent.is_cash_customer);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, selectedDependent.full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, selectedDependent.is_added_to_favorites);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, selectedDependent.is_in_contacts);
        UiCustomer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectedDependent.dependent);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectDependentsRequest.SelectedDependent selectedDependent = (SelectDependentsRequest.SelectedDependent) obj;
        selectedDependent.getClass();
        int encodedSizeWithTag = UiCustomer.ADAPTER.encodedSizeWithTag(1, selectedDependent.dependent) + selectedDependent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(5, selectedDependent.is_cash_customer) + ProtoAdapter.STRING.encodedSizeWithTag(4, selectedDependent.full_name) + protoAdapter.encodedSizeWithTag(3, selectedDependent.is_added_to_favorites) + protoAdapter.encodedSizeWithTag(2, selectedDependent.is_in_contacts) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectDependentsRequest.SelectedDependent selectedDependent = (SelectDependentsRequest.SelectedDependent) obj;
        selectedDependent.getClass();
        UiCustomer uiCustomer = selectedDependent.dependent;
        UiCustomer uiCustomer2 = uiCustomer != null ? (UiCustomer) UiCustomer.ADAPTER.redact(uiCustomer) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = selectedDependent.is_in_contacts;
        Boolean bool2 = selectedDependent.is_added_to_favorites;
        Boolean bool3 = selectedDependent.is_cash_customer;
        byteString.getClass();
        return new SelectDependentsRequest.SelectedDependent(uiCustomer2, bool, bool2, null, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectDependentsRequest.SelectedDependent selectedDependent = (SelectDependentsRequest.SelectedDependent) obj;
        selectedDependent.getClass();
        UiCustomer.ADAPTER.encodeWithTag(protoWriter, 1, selectedDependent.dependent);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, selectedDependent.is_in_contacts);
        protoAdapter.encodeWithTag(protoWriter, 3, selectedDependent.is_added_to_favorites);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, selectedDependent.full_name);
        protoAdapter.encodeWithTag(protoWriter, 5, selectedDependent.is_cash_customer);
        protoWriter.writeBytes(selectedDependent.unknownFields());
    }
}
