package com.squareup.cash.treehouse.activity;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public final class SerializableRenderedActivityItem {
    public static final Companion Companion = new Companion();
    public final String itemId;
    public final String paymentHistoryDataJson;
    public final String rowId;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/SerializableRenderedActivityItem$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/SerializableRenderedActivityItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SerializableRenderedActivityItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SerializableRenderedActivityItem(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, SerializableRenderedActivityItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rowId = str;
        this.itemId = str2;
        this.paymentHistoryDataJson = str3;
    }

    public SerializableRenderedActivityItem(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.rowId = str;
        this.itemId = str2;
        this.paymentHistoryDataJson = str3;
    }
}
