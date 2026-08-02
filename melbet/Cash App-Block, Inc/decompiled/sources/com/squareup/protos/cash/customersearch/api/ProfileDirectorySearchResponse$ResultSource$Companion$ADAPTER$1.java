package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.internal.bridge.ZiplineServiceAdapterKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$ResultSource$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ZiplineServiceAdapterKt ziplineServiceAdapterKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse.ResultSource(ziplineServiceAdapterKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                ziplineServiceAdapterKt = new ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook((ProfileDirectorySearchResponse.LocalAddressBookResults) ProfileDirectorySearchResponse.LocalAddressBookResults.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                ziplineServiceAdapterKt = new ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact((ProfileDirectorySearchResponse.LocalSyncedCustomerResults) ProfileDirectorySearchResponse.LocalSyncedCustomerResults.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                ziplineServiceAdapterKt = new ProfileDirectorySearchResponse$ResultSource$Source$ServerResults((ProfileDirectorySearchResponse.ServerResults) ProfileDirectorySearchResponse.ServerResults.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                ziplineServiceAdapterKt = new ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite((ProfileDirectorySearchResponse.LocalFavoriteResults) ProfileDirectorySearchResponse.LocalFavoriteResults.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.ResultSource resultSource = (ProfileDirectorySearchResponse.ResultSource) obj;
        reverseProtoWriter.getClass();
        resultSource.getClass();
        reverseProtoWriter.writeBytes(resultSource.unknownFields());
        ZiplineServiceAdapterKt ziplineServiceAdapterKt = resultSource.source;
        if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) {
            ProfileDirectorySearchResponse.LocalAddressBookResults.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) ziplineServiceAdapterKt).value);
            return;
        }
        if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) {
            ProfileDirectorySearchResponse.LocalSyncedCustomerResults.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) ziplineServiceAdapterKt).value);
            return;
        }
        if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) {
            ProfileDirectorySearchResponse.ServerResults.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) {
            ProfileDirectorySearchResponse.LocalFavoriteResults.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) ziplineServiceAdapterKt).value);
        } else {
            if (ziplineServiceAdapterKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ProfileDirectorySearchResponse.ResultSource resultSource = (ProfileDirectorySearchResponse.ResultSource) obj;
        resultSource.getClass();
        int size$okio = resultSource.unknownFields().getSize$okio();
        ZiplineServiceAdapterKt ziplineServiceAdapterKt = resultSource.source;
        if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) {
            encodedSizeWithTag = ProfileDirectorySearchResponse.LocalAddressBookResults.ADAPTER.encodedSizeWithTag(1, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) {
            encodedSizeWithTag = ProfileDirectorySearchResponse.LocalSyncedCustomerResults.ADAPTER.encodedSizeWithTag(2, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) {
            encodedSizeWithTag = ProfileDirectorySearchResponse.ServerResults.ADAPTER.encodedSizeWithTag(3, ((ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) ziplineServiceAdapterKt).value);
        } else {
            if (!(ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite)) {
                if (ziplineServiceAdapterKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ProfileDirectorySearchResponse.LocalFavoriteResults.ADAPTER.encodedSizeWithTag(4, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) ziplineServiceAdapterKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse.ResultSource resultSource = (ProfileDirectorySearchResponse.ResultSource) obj;
        resultSource.getClass();
        ByteString byteString = ByteString.EMPTY;
        ZiplineServiceAdapterKt ziplineServiceAdapterKt = resultSource.source;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.ResultSource(ziplineServiceAdapterKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.ResultSource resultSource = (ProfileDirectorySearchResponse.ResultSource) obj;
        resultSource.getClass();
        ZiplineServiceAdapterKt ziplineServiceAdapterKt = resultSource.source;
        if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) {
            ProfileDirectorySearchResponse.LocalAddressBookResults.ADAPTER.encodeWithTag(protoWriter, 1, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalAddressBook) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) {
            ProfileDirectorySearchResponse.LocalSyncedCustomerResults.ADAPTER.encodeWithTag(protoWriter, 2, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalSyncedContact) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) {
            ProfileDirectorySearchResponse.ServerResults.ADAPTER.encodeWithTag(protoWriter, 3, ((ProfileDirectorySearchResponse$ResultSource$Source$ServerResults) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt instanceof ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) {
            ProfileDirectorySearchResponse.LocalFavoriteResults.ADAPTER.encodeWithTag(protoWriter, 4, ((ProfileDirectorySearchResponse$ResultSource$Source$LocalFavorite) ziplineServiceAdapterKt).value);
        } else if (ziplineServiceAdapterKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(resultSource.unknownFields());
    }
}
