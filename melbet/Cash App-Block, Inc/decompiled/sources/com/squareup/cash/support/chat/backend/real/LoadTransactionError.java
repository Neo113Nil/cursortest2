package com.squareup.cash.support.chat.backend.real;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/support/chat/backend/real/LoadTransactionError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Source", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadTransactionError extends ReportedError {
    public final Set features;
    public final String message;
    public final Map metadata;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source CHAT;

        /* JADX INFO: Fake field, exist only in values array */
        Source EF0;

        static {
            Source source = new Source("UNKNOWN", 0);
            Source source2 = new Source("CHAT", 1);
            CHAT = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public LoadTransactionError(String str) {
        Source source = Source.CHAT;
        str.getClass();
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Support.INSTANCE);
        this.message = "Unable to load transaction " + str + " in " + source + ".";
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Transaction", MapsKt__MapsKt.mapOf(new Pair("source", source), new Pair("entity Id", str)));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
