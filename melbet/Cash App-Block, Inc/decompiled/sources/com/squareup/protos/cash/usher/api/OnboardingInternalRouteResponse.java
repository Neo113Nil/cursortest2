package com.squareup.protos.cash.usher.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/usher/api/OnboardingInternalRouteResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "Instruction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnboardingInternalRouteResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnboardingInternalRouteResponse> CREATOR;
    public final Instruction instruction;
    public final String internal_navigation_url;
    public final ResponseContext response_context;

    public enum Instruction implements WireEnum {
        INSTRUCTION_INTERNAL_NAV(0),
        INSTRUCTION_RESPONSE_CONTEXT(1);

        public static final OnboardingInternalRouteResponse$Instruction$Companion$ADAPTER$1 ADAPTER;
        public static final TaxEnvironment.Companion Companion;
        public final int value;

        static {
            Instruction instruction = INSTRUCTION_INTERNAL_NAV;
            Companion = new TaxEnvironment.Companion();
            ADAPTER = new OnboardingInternalRouteResponse$Instruction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Instruction.class), Syntax.PROTO_2, instruction);
        }

        Instruction(int i) {
            this.value = i;
        }

        public static final Instruction fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INSTRUCTION_INTERNAL_NAV;
            }
            if (i != 1) {
                return null;
            }
            return INSTRUCTION_RESPONSE_CONTEXT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        OnboardingInternalRouteResponse$Companion$ADAPTER$1 onboardingInternalRouteResponse$Companion$ADAPTER$1 = new OnboardingInternalRouteResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnboardingInternalRouteResponse.class), "type.googleapis.com/squareup.cash.usher.api.v1.OnboardingInternalRouteResponse", Syntax.PROTO_2, null, "squareup/cash/usher/api/v1/onboarding_internal_nav.proto");
        ADAPTER = onboardingInternalRouteResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(onboardingInternalRouteResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingInternalRouteResponse(Instruction instruction, String str, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instruction = instruction;
        this.internal_navigation_url = str;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnboardingInternalRouteResponse)) {
            return false;
        }
        OnboardingInternalRouteResponse onboardingInternalRouteResponse = (OnboardingInternalRouteResponse) obj;
        return Intrinsics.areEqual(unknownFields(), onboardingInternalRouteResponse.unknownFields()) && this.instruction == onboardingInternalRouteResponse.instruction && Intrinsics.areEqual(this.internal_navigation_url, onboardingInternalRouteResponse.internal_navigation_url) && Intrinsics.areEqual(this.response_context, onboardingInternalRouteResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Instruction instruction = this.instruction;
        int hashCode2 = (hashCode + (instruction != null ? instruction.hashCode() : 0)) * 37;
        String str = this.internal_navigation_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode4 = hashCode3 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(3);
        builder.f1364type = this.instruction;
        builder.canonical_text = this.internal_navigation_url;
        builder.formatted = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Instruction instruction = this.instruction;
        if (instruction != null) {
            arrayList.add("instruction=" + instruction);
        }
        String str = this.internal_navigation_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "internal_navigation_url=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingInternalRouteResponse{", "}", 0, null, null, 56);
    }
}
