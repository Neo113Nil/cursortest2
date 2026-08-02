package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.SearchFilter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SearchFilter.AbstractC0069SearchFilter abstractC0069SearchFilter = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchFilter(abstractC0069SearchFilter, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    abstractC0069SearchFilter = new SearchFilter.AbstractC0069SearchFilter.Counterparty((SearchFilterCounterparty) SearchFilterCounterparty.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    abstractC0069SearchFilter = new SearchFilter.AbstractC0069SearchFilter.Amount((SearchFilterAmount) SearchFilterAmount.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    abstractC0069SearchFilter = new SearchFilter.AbstractC0069SearchFilter.Date((SearchFilterDate) SearchFilterDate.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    abstractC0069SearchFilter = new SearchFilter.AbstractC0069SearchFilter.Type((SearchFilterType) SearchFilterType.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    abstractC0069SearchFilter = new SearchFilter.AbstractC0069SearchFilter.RatePlan((SearchFilterRatePlan) SearchFilterRatePlan.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    abstractC0069SearchFilter = new SearchFilter.AbstractC0069SearchFilter.PaymentState((SearchFilterPaymentState) SearchFilterPaymentState.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchFilter searchFilter = (SearchFilter) obj;
        reverseProtoWriter.getClass();
        searchFilter.getClass();
        reverseProtoWriter.writeBytes(searchFilter.unknownFields());
        SearchFilter.AbstractC0069SearchFilter abstractC0069SearchFilter = searchFilter.search_filter;
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Counterparty) {
            SearchFilterCounterparty.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SearchFilter.AbstractC0069SearchFilter.Counterparty) abstractC0069SearchFilter).getValue());
            return;
        }
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Amount) {
            SearchFilterAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SearchFilter.AbstractC0069SearchFilter.Amount) abstractC0069SearchFilter).getValue());
            return;
        }
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Date) {
            SearchFilterDate.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SearchFilter.AbstractC0069SearchFilter.Date) abstractC0069SearchFilter).getValue());
            return;
        }
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Type) {
            SearchFilterType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SearchFilter.AbstractC0069SearchFilter.Type) abstractC0069SearchFilter).getValue());
            return;
        }
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.RatePlan) {
            SearchFilterRatePlan.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SearchFilter.AbstractC0069SearchFilter.RatePlan) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.PaymentState) {
            SearchFilterPaymentState.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SearchFilter.AbstractC0069SearchFilter.PaymentState) abstractC0069SearchFilter).getValue());
        } else {
            if (abstractC0069SearchFilter == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SearchFilter searchFilter = (SearchFilter) obj;
        searchFilter.getClass();
        int size$okio = searchFilter.unknownFields().getSize$okio();
        SearchFilter.AbstractC0069SearchFilter abstractC0069SearchFilter = searchFilter.search_filter;
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Counterparty) {
            encodedSizeWithTag = SearchFilterCounterparty.ADAPTER.encodedSizeWithTag(1, ((SearchFilter.AbstractC0069SearchFilter.Counterparty) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Amount) {
            encodedSizeWithTag = SearchFilterAmount.ADAPTER.encodedSizeWithTag(2, ((SearchFilter.AbstractC0069SearchFilter.Amount) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Date) {
            encodedSizeWithTag = SearchFilterDate.ADAPTER.encodedSizeWithTag(3, ((SearchFilter.AbstractC0069SearchFilter.Date) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Type) {
            encodedSizeWithTag = SearchFilterType.ADAPTER.encodedSizeWithTag(4, ((SearchFilter.AbstractC0069SearchFilter.Type) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.RatePlan) {
            encodedSizeWithTag = SearchFilterRatePlan.ADAPTER.encodedSizeWithTag(5, ((SearchFilter.AbstractC0069SearchFilter.RatePlan) abstractC0069SearchFilter).getValue());
        } else {
            if (!(abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.PaymentState)) {
                if (abstractC0069SearchFilter == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SearchFilterPaymentState.ADAPTER.encodedSizeWithTag(6, ((SearchFilter.AbstractC0069SearchFilter.PaymentState) abstractC0069SearchFilter).getValue());
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchFilter searchFilter = (SearchFilter) obj;
        searchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        SearchFilter.AbstractC0069SearchFilter abstractC0069SearchFilter = searchFilter.search_filter;
        byteString.getClass();
        return new SearchFilter(abstractC0069SearchFilter, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchFilter searchFilter = (SearchFilter) obj;
        searchFilter.getClass();
        SearchFilter.AbstractC0069SearchFilter abstractC0069SearchFilter = searchFilter.search_filter;
        if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Counterparty) {
            SearchFilterCounterparty.ADAPTER.encodeWithTag(protoWriter, 1, ((SearchFilter.AbstractC0069SearchFilter.Counterparty) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Amount) {
            SearchFilterAmount.ADAPTER.encodeWithTag(protoWriter, 2, ((SearchFilter.AbstractC0069SearchFilter.Amount) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Date) {
            SearchFilterDate.ADAPTER.encodeWithTag(protoWriter, 3, ((SearchFilter.AbstractC0069SearchFilter.Date) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.Type) {
            SearchFilterType.ADAPTER.encodeWithTag(protoWriter, 4, ((SearchFilter.AbstractC0069SearchFilter.Type) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.RatePlan) {
            SearchFilterRatePlan.ADAPTER.encodeWithTag(protoWriter, 5, ((SearchFilter.AbstractC0069SearchFilter.RatePlan) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter instanceof SearchFilter.AbstractC0069SearchFilter.PaymentState) {
            SearchFilterPaymentState.ADAPTER.encodeWithTag(protoWriter, 6, ((SearchFilter.AbstractC0069SearchFilter.PaymentState) abstractC0069SearchFilter).getValue());
        } else if (abstractC0069SearchFilter != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(searchFilter.unknownFields());
    }
}
