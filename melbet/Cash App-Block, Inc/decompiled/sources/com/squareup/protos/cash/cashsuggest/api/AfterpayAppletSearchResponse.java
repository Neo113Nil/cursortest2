package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/AfterpayAppletSearchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/Error$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AfterpayAppletSearchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletSearchResponse> CREATOR;
    public final Long expire_at_ms;
    public final FilterGroupSection filter_group_sections;
    public final SearchSection home_preview_section;
    public final List invalid_recently_viewed_engaged_tokens;
    public final String screen_title;
    public final List sections;

    static {
        AfterpayAppletSearchResponse$Companion$ADAPTER$1 afterpayAppletSearchResponse$Companion$ADAPTER$1 = new AfterpayAppletSearchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletSearchResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletSearchResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletSearch.proto");
        ADAPTER = afterpayAppletSearchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletSearchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletSearchResponse(String str, List list, FilterGroupSection filterGroupSection, Long l, List list2, SearchSection searchSection, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.screen_title = str;
        this.filter_group_sections = filterGroupSection;
        this.expire_at_ms = l;
        this.home_preview_section = searchSection;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
        this.invalid_recently_viewed_engaged_tokens = TransactorKt.immutableCopyOf("invalid_recently_viewed_engaged_tokens", list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    public static AfterpayAppletSearchResponse copy$default(AfterpayAppletSearchResponse afterpayAppletSearchResponse, List list, FilterGroupSection filterGroupSection, ArrayList arrayList, SearchSection searchSection, ByteString byteString, int i) {
        String str = afterpayAppletSearchResponse.screen_title;
        if ((i & 4) != 0) {
            filterGroupSection = afterpayAppletSearchResponse.filter_group_sections;
        }
        FilterGroupSection filterGroupSection2 = filterGroupSection;
        Long l = afterpayAppletSearchResponse.expire_at_ms;
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = afterpayAppletSearchResponse.invalid_recently_viewed_engaged_tokens;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 32) != 0) {
            searchSection = afterpayAppletSearchResponse.home_preview_section;
        }
        SearchSection searchSection2 = searchSection;
        if ((i & 64) != 0) {
            byteString = afterpayAppletSearchResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        afterpayAppletSearchResponse.getClass();
        list.getClass();
        arrayList3.getClass();
        byteString2.getClass();
        return new AfterpayAppletSearchResponse(str, list, filterGroupSection2, l, arrayList3, searchSection2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletSearchResponse)) {
            return false;
        }
        AfterpayAppletSearchResponse afterpayAppletSearchResponse = (AfterpayAppletSearchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletSearchResponse.unknownFields()) && Intrinsics.areEqual(this.screen_title, afterpayAppletSearchResponse.screen_title) && Intrinsics.areEqual(this.sections, afterpayAppletSearchResponse.sections) && Intrinsics.areEqual(this.filter_group_sections, afterpayAppletSearchResponse.filter_group_sections) && Intrinsics.areEqual(this.expire_at_ms, afterpayAppletSearchResponse.expire_at_ms) && Intrinsics.areEqual(this.invalid_recently_viewed_engaged_tokens, afterpayAppletSearchResponse.invalid_recently_viewed_engaged_tokens) && Intrinsics.areEqual(this.home_preview_section, afterpayAppletSearchResponse.home_preview_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.screen_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.sections);
        FilterGroupSection filterGroupSection = this.filter_group_sections;
        int hashCode2 = (m + (filterGroupSection != null ? filterGroupSection.hashCode() : 0)) * 37;
        Long l = this.expire_at_ms;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.invalid_recently_viewed_engaged_tokens);
        SearchSection searchSection = this.home_preview_section;
        int hashCode3 = m2 + (searchSection != null ? searchSection.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(24, false);
        builder.description = this.screen_title;
        builder.category = this.sections;
        builder.code = this.filter_group_sections;
        builder.field = this.expire_at_ms;
        builder.retryable = this.invalid_recently_viewed_engaged_tokens;
        builder.metadata = this.home_preview_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.screen_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "screen_title=", arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        FilterGroupSection filterGroupSection = this.filter_group_sections;
        if (filterGroupSection != null) {
            arrayList.add("filter_group_sections=" + filterGroupSection);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        List list2 = this.invalid_recently_viewed_engaged_tokens;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("invalid_recently_viewed_engaged_tokens=", arrayList, list2);
        }
        SearchSection searchSection = this.home_preview_section;
        if (searchSection != null) {
            arrayList.add("home_preview_section=" + searchSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletSearchResponse{", "}", 0, null, null, 56);
    }

    public AfterpayAppletSearchResponse(List list, FilterGroupSection filterGroupSection, List list2, int i) {
        this("Browse brands", list, filterGroupSection, Long.MAX_VALUE, (i & 16) != 0 ? EmptyList.INSTANCE : list2, null, ByteString.EMPTY);
    }
}
