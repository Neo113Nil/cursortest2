package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ActivitySearchFilter.SearchFilter searchFilter = null;
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySearchFilter(searchFilter, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    searchFilter = new ActivitySearchFilter.SearchFilter.Counterparty((CustomerSearchFilter) CustomerSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    searchFilter = new ActivitySearchFilter.SearchFilter.Amount((AmountSearchFilter) AmountSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    searchFilter = new ActivitySearchFilter.SearchFilter.Date((DateSearchFilter) DateSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    searchFilter = new ActivitySearchFilter.SearchFilter.RatePlan((RatePlanSearchFilter) RatePlanSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    searchFilter = new ActivitySearchFilter.SearchFilter.PaymentState((PaymentStateSearchFilter) PaymentStateSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    searchFilter = new ActivitySearchFilter.SearchFilter.DisplayCategory((DisplayCategorySearchFilter) DisplayCategorySearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    searchFilter = new ActivitySearchFilter.SearchFilter.ProductClassifier((ProductClassifierSearchFilter) ProductClassifierSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    searchFilter = new ActivitySearchFilter.SearchFilter.DisplayType((DisplayTypeSearchFilter) DisplayTypeSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    searchFilter = new ActivitySearchFilter.SearchFilter.Section((SectionSearchFilter) SectionSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    searchFilter = new ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf((DisplayCategoryAnyOfSearchFilter) DisplayCategoryAnyOfSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    searchFilter = new ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf((ProductClassifierAnyOfSearchFilter) ProductClassifierAnyOfSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    searchFilter = new ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf((DisplayTypeAnyOfSearchFilter) DisplayTypeAnyOfSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    searchFilter = new ActivitySearchFilter.SearchFilter.CustomerAnyOf((CustomerAnyOfSearchFilter) CustomerAnyOfSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    searchFilter = new ActivitySearchFilter.SearchFilter.MoneyMovement((MoneyMovementSearchFilter) MoneyMovementSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    searchFilter = new ActivitySearchFilter.SearchFilter.PaymentStateAnyOf((PaymentStateAnyOfSearchFilter) PaymentStateAnyOfSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    searchFilter = new ActivitySearchFilter.SearchFilter.CounterpartyCashtag((CustomerCashtagSearchFilter) CustomerCashtagSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    searchFilter = new ActivitySearchFilter.SearchFilter.CounterpartyName((CustomerNameSearchFilter) CustomerNameSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    searchFilter = new ActivitySearchFilter.SearchFilter.PaymentNote((PaymentNoteSearchFilter) PaymentNoteSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    searchFilter = new ActivitySearchFilter.SearchFilter.MerchantCategory((MerchantCategorySearchFilter) MerchantCategorySearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 21:
                    searchFilter = new ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf((MerchantCategoryAnyOfSearchFilter) MerchantCategoryAnyOfSearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 22:
                    searchFilter = new ActivitySearchFilter.SearchFilter.MerchantCategoryExists((MerchantCategoryExistsSearchFilter) MerchantCategoryExistsSearchFilter.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySearchFilter activitySearchFilter = (ActivitySearchFilter) obj;
        reverseProtoWriter.getClass();
        activitySearchFilter.getClass();
        reverseProtoWriter.writeBytes(activitySearchFilter.unknownFields());
        ActivitySearchFilter.SearchFilter searchFilter = activitySearchFilter.search_filter;
        if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Amount) {
            AmountSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ActivitySearchFilter.SearchFilter.Amount) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CustomerAnyOf) {
            CustomerAnyOfSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((ActivitySearchFilter.SearchFilter.CustomerAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CounterpartyCashtag) {
            CustomerCashtagSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((ActivitySearchFilter.SearchFilter.CounterpartyCashtag) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CounterpartyName) {
            CustomerNameSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((ActivitySearchFilter.SearchFilter.CounterpartyName) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Counterparty) {
            CustomerSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ActivitySearchFilter.SearchFilter.Counterparty) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Date) {
            DateSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ActivitySearchFilter.SearchFilter.Date) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayCategory) {
            DisplayCategorySearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ActivitySearchFilter.SearchFilter.DisplayCategory) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf) {
            DisplayCategoryAnyOfSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayType) {
            DisplayTypeSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ActivitySearchFilter.SearchFilter.DisplayType) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf) {
            DisplayTypeAnyOfSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategory) {
            MerchantCategorySearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((ActivitySearchFilter.SearchFilter.MerchantCategory) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf) {
            MerchantCategoryAnyOfSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 21, ((ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategoryExists) {
            MerchantCategoryExistsSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 22, ((ActivitySearchFilter.SearchFilter.MerchantCategoryExists) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MoneyMovement) {
            MoneyMovementSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((ActivitySearchFilter.SearchFilter.MoneyMovement) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentNote) {
            PaymentNoteSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((ActivitySearchFilter.SearchFilter.PaymentNote) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentState) {
            PaymentStateSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ActivitySearchFilter.SearchFilter.PaymentState) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentStateAnyOf) {
            PaymentStateAnyOfSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((ActivitySearchFilter.SearchFilter.PaymentStateAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.ProductClassifier) {
            ProductClassifierSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ActivitySearchFilter.SearchFilter.ProductClassifier) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf) {
            ProductClassifierAnyOfSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.RatePlan) {
            RatePlanSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ActivitySearchFilter.SearchFilter.RatePlan) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Section) {
            SectionSearchFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ActivitySearchFilter.SearchFilter.Section) searchFilter).getValue());
        } else if (searchFilter != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 20, activitySearchFilter.suggested);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ActivitySearchFilter activitySearchFilter = (ActivitySearchFilter) obj;
        activitySearchFilter.getClass();
        int size$okio = activitySearchFilter.unknownFields().getSize$okio();
        ActivitySearchFilter.SearchFilter searchFilter = activitySearchFilter.search_filter;
        if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Amount) {
            encodedSizeWithTag = AmountSearchFilter.ADAPTER.encodedSizeWithTag(2, ((ActivitySearchFilter.SearchFilter.Amount) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CustomerAnyOf) {
            encodedSizeWithTag = CustomerAnyOfSearchFilter.ADAPTER.encodedSizeWithTag(13, ((ActivitySearchFilter.SearchFilter.CustomerAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CounterpartyCashtag) {
            encodedSizeWithTag = CustomerCashtagSearchFilter.ADAPTER.encodedSizeWithTag(16, ((ActivitySearchFilter.SearchFilter.CounterpartyCashtag) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CounterpartyName) {
            encodedSizeWithTag = CustomerNameSearchFilter.ADAPTER.encodedSizeWithTag(17, ((ActivitySearchFilter.SearchFilter.CounterpartyName) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Counterparty) {
            encodedSizeWithTag = CustomerSearchFilter.ADAPTER.encodedSizeWithTag(1, ((ActivitySearchFilter.SearchFilter.Counterparty) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Date) {
            encodedSizeWithTag = DateSearchFilter.ADAPTER.encodedSizeWithTag(3, ((ActivitySearchFilter.SearchFilter.Date) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayCategory) {
            encodedSizeWithTag = DisplayCategorySearchFilter.ADAPTER.encodedSizeWithTag(6, ((ActivitySearchFilter.SearchFilter.DisplayCategory) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf) {
            encodedSizeWithTag = DisplayCategoryAnyOfSearchFilter.ADAPTER.encodedSizeWithTag(10, ((ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayType) {
            encodedSizeWithTag = DisplayTypeSearchFilter.ADAPTER.encodedSizeWithTag(8, ((ActivitySearchFilter.SearchFilter.DisplayType) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf) {
            encodedSizeWithTag = DisplayTypeAnyOfSearchFilter.ADAPTER.encodedSizeWithTag(12, ((ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategory) {
            encodedSizeWithTag = MerchantCategorySearchFilter.ADAPTER.encodedSizeWithTag(19, ((ActivitySearchFilter.SearchFilter.MerchantCategory) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf) {
            encodedSizeWithTag = MerchantCategoryAnyOfSearchFilter.ADAPTER.encodedSizeWithTag(21, ((ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategoryExists) {
            encodedSizeWithTag = MerchantCategoryExistsSearchFilter.ADAPTER.encodedSizeWithTag(22, ((ActivitySearchFilter.SearchFilter.MerchantCategoryExists) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MoneyMovement) {
            encodedSizeWithTag = MoneyMovementSearchFilter.ADAPTER.encodedSizeWithTag(14, ((ActivitySearchFilter.SearchFilter.MoneyMovement) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentNote) {
            encodedSizeWithTag = PaymentNoteSearchFilter.ADAPTER.encodedSizeWithTag(18, ((ActivitySearchFilter.SearchFilter.PaymentNote) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentState) {
            encodedSizeWithTag = PaymentStateSearchFilter.ADAPTER.encodedSizeWithTag(5, ((ActivitySearchFilter.SearchFilter.PaymentState) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentStateAnyOf) {
            encodedSizeWithTag = PaymentStateAnyOfSearchFilter.ADAPTER.encodedSizeWithTag(15, ((ActivitySearchFilter.SearchFilter.PaymentStateAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.ProductClassifier) {
            encodedSizeWithTag = ProductClassifierSearchFilter.ADAPTER.encodedSizeWithTag(7, ((ActivitySearchFilter.SearchFilter.ProductClassifier) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf) {
            encodedSizeWithTag = ProductClassifierAnyOfSearchFilter.ADAPTER.encodedSizeWithTag(11, ((ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.RatePlan) {
            encodedSizeWithTag = RatePlanSearchFilter.ADAPTER.encodedSizeWithTag(4, ((ActivitySearchFilter.SearchFilter.RatePlan) searchFilter).getValue());
        } else {
            if (!(searchFilter instanceof ActivitySearchFilter.SearchFilter.Section)) {
                if (searchFilter != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(20, activitySearchFilter.suggested) + size$okio;
            }
            encodedSizeWithTag = SectionSearchFilter.ADAPTER.encodedSizeWithTag(9, ((ActivitySearchFilter.SearchFilter.Section) searchFilter).getValue());
        }
        size$okio += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(20, activitySearchFilter.suggested) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySearchFilter activitySearchFilter = (ActivitySearchFilter) obj;
        activitySearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        ActivitySearchFilter.SearchFilter searchFilter = activitySearchFilter.search_filter;
        Boolean bool = activitySearchFilter.suggested;
        byteString.getClass();
        return new ActivitySearchFilter(searchFilter, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySearchFilter activitySearchFilter = (ActivitySearchFilter) obj;
        activitySearchFilter.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, activitySearchFilter.suggested);
        ActivitySearchFilter.SearchFilter searchFilter = activitySearchFilter.search_filter;
        if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Amount) {
            AmountSearchFilter.ADAPTER.encodeWithTag(protoWriter, 2, ((ActivitySearchFilter.SearchFilter.Amount) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CustomerAnyOf) {
            CustomerAnyOfSearchFilter.ADAPTER.encodeWithTag(protoWriter, 13, ((ActivitySearchFilter.SearchFilter.CustomerAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CounterpartyCashtag) {
            CustomerCashtagSearchFilter.ADAPTER.encodeWithTag(protoWriter, 16, ((ActivitySearchFilter.SearchFilter.CounterpartyCashtag) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.CounterpartyName) {
            CustomerNameSearchFilter.ADAPTER.encodeWithTag(protoWriter, 17, ((ActivitySearchFilter.SearchFilter.CounterpartyName) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Counterparty) {
            CustomerSearchFilter.ADAPTER.encodeWithTag(protoWriter, 1, ((ActivitySearchFilter.SearchFilter.Counterparty) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Date) {
            DateSearchFilter.ADAPTER.encodeWithTag(protoWriter, 3, ((ActivitySearchFilter.SearchFilter.Date) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayCategory) {
            DisplayCategorySearchFilter.ADAPTER.encodeWithTag(protoWriter, 6, ((ActivitySearchFilter.SearchFilter.DisplayCategory) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf) {
            DisplayCategoryAnyOfSearchFilter.ADAPTER.encodeWithTag(protoWriter, 10, ((ActivitySearchFilter.SearchFilter.DisplayCategoryAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayType) {
            DisplayTypeSearchFilter.ADAPTER.encodeWithTag(protoWriter, 8, ((ActivitySearchFilter.SearchFilter.DisplayType) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf) {
            DisplayTypeAnyOfSearchFilter.ADAPTER.encodeWithTag(protoWriter, 12, ((ActivitySearchFilter.SearchFilter.DisplayTypeAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategory) {
            MerchantCategorySearchFilter.ADAPTER.encodeWithTag(protoWriter, 19, ((ActivitySearchFilter.SearchFilter.MerchantCategory) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf) {
            MerchantCategoryAnyOfSearchFilter.ADAPTER.encodeWithTag(protoWriter, 21, ((ActivitySearchFilter.SearchFilter.MerchantCategoryAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MerchantCategoryExists) {
            MerchantCategoryExistsSearchFilter.ADAPTER.encodeWithTag(protoWriter, 22, ((ActivitySearchFilter.SearchFilter.MerchantCategoryExists) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.MoneyMovement) {
            MoneyMovementSearchFilter.ADAPTER.encodeWithTag(protoWriter, 14, ((ActivitySearchFilter.SearchFilter.MoneyMovement) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentNote) {
            PaymentNoteSearchFilter.ADAPTER.encodeWithTag(protoWriter, 18, ((ActivitySearchFilter.SearchFilter.PaymentNote) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentState) {
            PaymentStateSearchFilter.ADAPTER.encodeWithTag(protoWriter, 5, ((ActivitySearchFilter.SearchFilter.PaymentState) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.PaymentStateAnyOf) {
            PaymentStateAnyOfSearchFilter.ADAPTER.encodeWithTag(protoWriter, 15, ((ActivitySearchFilter.SearchFilter.PaymentStateAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.ProductClassifier) {
            ProductClassifierSearchFilter.ADAPTER.encodeWithTag(protoWriter, 7, ((ActivitySearchFilter.SearchFilter.ProductClassifier) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf) {
            ProductClassifierAnyOfSearchFilter.ADAPTER.encodeWithTag(protoWriter, 11, ((ActivitySearchFilter.SearchFilter.ProductClassifiersAnyOf) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.RatePlan) {
            RatePlanSearchFilter.ADAPTER.encodeWithTag(protoWriter, 4, ((ActivitySearchFilter.SearchFilter.RatePlan) searchFilter).getValue());
        } else if (searchFilter instanceof ActivitySearchFilter.SearchFilter.Section) {
            SectionSearchFilter.ADAPTER.encodeWithTag(protoWriter, 9, ((ActivitySearchFilter.SearchFilter.Section) searchFilter).getValue());
        } else if (searchFilter != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(activitySearchFilter.unknownFields());
    }
}
