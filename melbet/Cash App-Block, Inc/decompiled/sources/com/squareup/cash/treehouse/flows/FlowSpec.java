package com.squareup.cash.treehouse.flows;

import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
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
public final class FlowSpec {
    public final Integer clientScenarioInt;
    public final ClientRouteUrl exitScreen;
    public final String flowToken;
    public final ByteString scenarioPlan;
    public final String sourceAnalyticsName;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(2)), null, null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/flows/FlowSpec$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/flows/FlowSpec;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FlowSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FlowSpec(int i, String str, ByteString byteString, Integer num, String str2, ClientRouteUrl clientRouteUrl) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, FlowSpec$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.flowToken = str;
        this.scenarioPlan = byteString;
        if ((i & 4) == 0) {
            this.clientScenarioInt = null;
        } else {
            this.clientScenarioInt = num;
        }
        if ((i & 8) == 0) {
            this.sourceAnalyticsName = null;
        } else {
            this.sourceAnalyticsName = str2;
        }
        if ((i & 16) == 0) {
            this.exitScreen = null;
        } else {
            this.exitScreen = clientRouteUrl;
        }
    }
}
