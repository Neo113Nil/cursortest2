package com.squareup.protos.cash.customersearch.api;

import app.cash.zipline.loader.FastCodeUpdatesKt;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorSearchResponse$ResultSource$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        FastCodeUpdatesKt fastCodeUpdatesKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecipientSelectorSearchResponse.ResultSource(fastCodeUpdatesKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                fastCodeUpdatesKt = new RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook((RecipientSelectorSearchResponse.LocalAddressBookResults) RecipientSelectorSearchResponse.LocalAddressBookResults.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                fastCodeUpdatesKt = new RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact((RecipientSelectorSearchResponse.LocalSyncedCustomerResults) RecipientSelectorSearchResponse.LocalSyncedCustomerResults.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                fastCodeUpdatesKt = new RecipientSelectorSearchResponse$ResultSource$Source$ServerResults((RecipientSelectorSearchResponse.ServerResults) RecipientSelectorSearchResponse.ServerResults.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                fastCodeUpdatesKt = new RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite((RecipientSelectorSearchResponse.LocalFavoriteResults) RecipientSelectorSearchResponse.LocalFavoriteResults.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecipientSelectorSearchResponse.ResultSource resultSource = (RecipientSelectorSearchResponse.ResultSource) obj;
        reverseProtoWriter.getClass();
        resultSource.getClass();
        reverseProtoWriter.writeBytes(resultSource.unknownFields());
        FastCodeUpdatesKt fastCodeUpdatesKt = resultSource.source;
        if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) {
            RecipientSelectorSearchResponse.LocalAddressBookResults.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) fastCodeUpdatesKt).value);
            return;
        }
        if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) {
            RecipientSelectorSearchResponse.LocalSyncedCustomerResults.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) fastCodeUpdatesKt).value);
            return;
        }
        if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) {
            RecipientSelectorSearchResponse.ServerResults.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) {
            RecipientSelectorSearchResponse.LocalFavoriteResults.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) fastCodeUpdatesKt).value);
        } else {
            if (fastCodeUpdatesKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        RecipientSelectorSearchResponse.ResultSource resultSource = (RecipientSelectorSearchResponse.ResultSource) obj;
        resultSource.getClass();
        int size$okio = resultSource.unknownFields().getSize$okio();
        FastCodeUpdatesKt fastCodeUpdatesKt = resultSource.source;
        if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) {
            encodedSizeWithTag = RecipientSelectorSearchResponse.LocalAddressBookResults.ADAPTER.encodedSizeWithTag(1, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) {
            encodedSizeWithTag = RecipientSelectorSearchResponse.LocalSyncedCustomerResults.ADAPTER.encodedSizeWithTag(2, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) {
            encodedSizeWithTag = RecipientSelectorSearchResponse.ServerResults.ADAPTER.encodedSizeWithTag(3, ((RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) fastCodeUpdatesKt).value);
        } else {
            if (!(fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite)) {
                if (fastCodeUpdatesKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = RecipientSelectorSearchResponse.LocalFavoriteResults.ADAPTER.encodedSizeWithTag(4, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) fastCodeUpdatesKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecipientSelectorSearchResponse.ResultSource resultSource = (RecipientSelectorSearchResponse.ResultSource) obj;
        resultSource.getClass();
        ByteString byteString = ByteString.EMPTY;
        FastCodeUpdatesKt fastCodeUpdatesKt = resultSource.source;
        byteString.getClass();
        return new RecipientSelectorSearchResponse.ResultSource(fastCodeUpdatesKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecipientSelectorSearchResponse.ResultSource resultSource = (RecipientSelectorSearchResponse.ResultSource) obj;
        resultSource.getClass();
        FastCodeUpdatesKt fastCodeUpdatesKt = resultSource.source;
        if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) {
            RecipientSelectorSearchResponse.LocalAddressBookResults.ADAPTER.encodeWithTag(protoWriter, 1, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) {
            RecipientSelectorSearchResponse.LocalSyncedCustomerResults.ADAPTER.encodeWithTag(protoWriter, 2, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) {
            RecipientSelectorSearchResponse.ServerResults.ADAPTER.encodeWithTag(protoWriter, 3, ((RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) {
            RecipientSelectorSearchResponse.LocalFavoriteResults.ADAPTER.encodeWithTag(protoWriter, 4, ((RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) fastCodeUpdatesKt).value);
        } else if (fastCodeUpdatesKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(resultSource.unknownFields());
    }
}
