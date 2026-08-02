package com.squareup.cash.treehouse.flows;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okio.ByteString;

@Serializable
/* loaded from: classes7.dex */
public final class BlockerScreenSpec {
    public final String blockerId;
    public final Integer clientScenarioInt;
    public final String flowToken;
    public final ByteString parameters;
    public final String path;
    public final String plasmaFlowToken;
    public final String proposedTreehouseFlowToken;
    public final String sourceAnalyticsName;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new AlertBannerKt$$ExternalSyntheticLambda0(1)), null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/flows/BlockerScreenSpec$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/flows/BlockerScreenSpec;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return BlockerScreenSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlockerScreenSpec(int i, String str, String str2, ByteString byteString, String str3, Integer num, String str4, String str5, String str6) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, BlockerScreenSpec$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.flowToken = str;
        this.path = str2;
        if ((i & 4) == 0) {
            this.parameters = null;
        } else {
            this.parameters = byteString;
        }
        if ((i & 8) == 0) {
            this.blockerId = null;
        } else {
            this.blockerId = str3;
        }
        if ((i & 16) == 0) {
            this.clientScenarioInt = null;
        } else {
            this.clientScenarioInt = num;
        }
        if ((i & 32) == 0) {
            this.sourceAnalyticsName = null;
        } else {
            this.sourceAnalyticsName = str4;
        }
        if ((i & 64) == 0) {
            this.proposedTreehouseFlowToken = null;
        } else {
            this.proposedTreehouseFlowToken = str5;
        }
        if ((i & 128) == 0) {
            this.plasmaFlowToken = null;
        } else {
            this.plasmaFlowToken = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerScreenSpec)) {
            return false;
        }
        BlockerScreenSpec blockerScreenSpec = (BlockerScreenSpec) obj;
        return Intrinsics.areEqual(this.flowToken, blockerScreenSpec.flowToken) && Intrinsics.areEqual(this.path, blockerScreenSpec.path) && Intrinsics.areEqual(this.parameters, blockerScreenSpec.parameters) && Intrinsics.areEqual(this.blockerId, blockerScreenSpec.blockerId) && Intrinsics.areEqual(this.clientScenarioInt, blockerScreenSpec.clientScenarioInt) && Intrinsics.areEqual(this.sourceAnalyticsName, blockerScreenSpec.sourceAnalyticsName) && Intrinsics.areEqual(this.proposedTreehouseFlowToken, blockerScreenSpec.proposedTreehouseFlowToken) && Intrinsics.areEqual(this.plasmaFlowToken, blockerScreenSpec.plasmaFlowToken);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.path);
        ByteString byteString = this.parameters;
        int hashCode = (m + (byteString == null ? 0 : byteString.hashCode())) * 31;
        String str = this.blockerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.clientScenarioInt;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.sourceAnalyticsName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.proposedTreehouseFlowToken;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.plasmaFlowToken;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerScreenSpec(flowToken=", this.flowToken, ", path=", this.path, ", parameters=");
        m.append(this.parameters);
        m.append(", blockerId=");
        m.append(this.blockerId);
        m.append(", clientScenarioInt=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.clientScenarioInt, ", sourceAnalyticsName=", this.sourceAnalyticsName, ", proposedTreehouseFlowToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.proposedTreehouseFlowToken, ", plasmaFlowToken=", this.plasmaFlowToken, ")");
    }

    public BlockerScreenSpec(String str, String str2, ByteString byteString, String str3, Integer num, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        this.flowToken = str;
        this.path = str2;
        this.parameters = byteString;
        this.blockerId = str3;
        this.clientScenarioInt = num;
        this.sourceAnalyticsName = str4;
        this.proposedTreehouseFlowToken = str5;
        this.plasmaFlowToken = str6;
    }
}
