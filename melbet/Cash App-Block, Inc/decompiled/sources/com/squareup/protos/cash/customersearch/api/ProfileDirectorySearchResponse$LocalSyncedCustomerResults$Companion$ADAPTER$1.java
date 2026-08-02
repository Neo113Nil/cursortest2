package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$LocalSyncedCustomerResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse.LocalSyncedCustomerResults(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProfileDirectoryRow.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (ProfileDirectorySearchResponse.LocalSyncedCustomerResults) obj;
        reverseProtoWriter.getClass();
        localSyncedCustomerResults.getClass();
        reverseProtoWriter.writeBytes(localSyncedCustomerResults.unknownFields());
        ProfileDirectoryRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localSyncedCustomerResults.results);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (ProfileDirectorySearchResponse.LocalSyncedCustomerResults) obj;
        localSyncedCustomerResults.getClass();
        return ProfileDirectoryRow.ADAPTER.asRepeated().encodedSizeWithTag(1, localSyncedCustomerResults.results) + localSyncedCustomerResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (ProfileDirectorySearchResponse.LocalSyncedCustomerResults) obj;
        localSyncedCustomerResults.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localSyncedCustomerResults.results, ProfileDirectoryRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.LocalSyncedCustomerResults(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults = (ProfileDirectorySearchResponse.LocalSyncedCustomerResults) obj;
        localSyncedCustomerResults.getClass();
        ProfileDirectoryRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localSyncedCustomerResults.results);
        protoWriter.writeBytes(localSyncedCustomerResults.unknownFields());
    }
}
