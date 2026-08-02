package com.squareup.cash.treehouse.activity;

import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okio.ByteString;

@Serializable
/* loaded from: classes7.dex */
public final class SerializablePaymentActivityItem {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ByteString activityRowSectionProto;
    public final boolean isBadged;
    public final boolean isOffline;
    public final String itemId;
    public final ByteString itemTypeProto;
    public final String paymentHistoryDataJson;
    public final String rowId;
    public final ByteString uiPaymentProto;
    public final ByteString uiRecipientProto;
    public final ByteString uiSenderProto;
    public final long version;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/SerializablePaymentActivityItem$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/SerializablePaymentActivityItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return SerializablePaymentActivityItem$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(17)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(18)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(19)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(20)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(21)), null, null, null};
    }

    public /* synthetic */ SerializablePaymentActivityItem(int i, String str, String str2, ByteString byteString, String str3, ByteString byteString2, ByteString byteString3, ByteString byteString4, ByteString byteString5, boolean z, boolean z2, long j) {
        if (2047 != (i & 2047)) {
            TuplesKt.throwMissingFieldException(i, 2047, SerializablePaymentActivityItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rowId = str;
        this.itemId = str2;
        this.uiPaymentProto = byteString;
        this.paymentHistoryDataJson = str3;
        this.uiSenderProto = byteString2;
        this.uiRecipientProto = byteString3;
        this.itemTypeProto = byteString4;
        this.activityRowSectionProto = byteString5;
        this.isBadged = z;
        this.isOffline = z2;
        this.version = j;
    }
}
