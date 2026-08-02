package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "product_classifier", "Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterContains;", "contains", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterContains;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductClassifierSearchFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProductClassifierSearchFilter> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterContains#ADAPTER", schemaIndex = 1, tag = 2)
    public final SearchFilterContains contains;

    @WireField(adapter = "com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActivityProductClassifier product_classifier;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/ProductClassifierSearchFilter;", "<init>", "()V", "product_classifier", "Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "contains", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterContains;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public SearchFilterContains contains;
        public ActivityProductClassifier product_classifier;

        @Override // com.squareup.wire.Message.Builder
        public ProductClassifierSearchFilter build() {
            return new ProductClassifierSearchFilter(this.product_classifier, this.contains, buildUnknownFields());
        }

        public final Builder contains(SearchFilterContains contains) {
            this.contains = contains;
            return this;
        }

        public final Builder product_classifier(ActivityProductClassifier product_classifier) {
            this.product_classifier = product_classifier;
            return this;
        }
    }

    static {
        ProductClassifierSearchFilter$Companion$ADAPTER$1 productClassifierSearchFilter$Companion$ADAPTER$1 = new ProductClassifierSearchFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProductClassifierSearchFilter.class), "type.googleapis.com/squareup.cash.activity.api.v1.ProductClassifierSearchFilter", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = productClassifierSearchFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(productClassifierSearchFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductClassifierSearchFilter(ActivityProductClassifier activityProductClassifier, SearchFilterContains searchFilterContains, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.product_classifier = activityProductClassifier;
        this.contains = searchFilterContains;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductClassifierSearchFilter)) {
            return false;
        }
        ProductClassifierSearchFilter productClassifierSearchFilter = (ProductClassifierSearchFilter) obj;
        return Intrinsics.areEqual(unknownFields(), productClassifierSearchFilter.unknownFields()) && this.product_classifier == productClassifierSearchFilter.product_classifier && this.contains == productClassifierSearchFilter.contains;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityProductClassifier activityProductClassifier = this.product_classifier;
        int hashCode2 = (hashCode + (activityProductClassifier != null ? activityProductClassifier.hashCode() : 0)) * 37;
        SearchFilterContains searchFilterContains = this.contains;
        int hashCode3 = hashCode2 + (searchFilterContains != null ? searchFilterContains.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.product_classifier = this.product_classifier;
        builder.contains = this.contains;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityProductClassifier activityProductClassifier = this.product_classifier;
        if (activityProductClassifier != null) {
            arrayList.add("product_classifier=" + activityProductClassifier);
        }
        SearchFilterContains searchFilterContains = this.contains;
        if (searchFilterContains != null) {
            arrayList.add("contains=" + searchFilterContains);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProductClassifierSearchFilter{", "}", 0, null, null, 56);
    }

    public /* synthetic */ ProductClassifierSearchFilter(ActivityProductClassifier activityProductClassifier, SearchFilterContains searchFilterContains, int i) {
        this(activityProductClassifier, (i & 2) != 0 ? null : searchFilterContains, ByteString.EMPTY);
    }
}
