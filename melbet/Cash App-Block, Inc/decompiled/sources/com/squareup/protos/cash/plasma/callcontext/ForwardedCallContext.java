package com.squareup.protos.cash.plasma.callcontext;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ForwardedCallContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ForwardedCallContext> CREATOR;
    public final String app_token;
    public final AuthorizationContext authorization_context;
    public final BrowserInteraction browser_interaction;
    public final ClientInfo client_info;
    public final ScenarioInitiatorType scenario_initiator_type;

    static {
        ForwardedCallContext$Companion$ADAPTER$1 forwardedCallContext$Companion$ADAPTER$1 = new ForwardedCallContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ForwardedCallContext.class), "type.googleapis.com/squareup.cash.plasma.callcontext.ForwardedCallContext", Syntax.PROTO_2, null, "squareup/cash/plasma/callcontext/ForwardedCallContext.proto");
        ADAPTER = forwardedCallContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(forwardedCallContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardedCallContext(ClientInfo clientInfo, BrowserInteraction browserInteraction, String str, ScenarioInitiatorType scenarioInitiatorType, AuthorizationContext authorizationContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_info = clientInfo;
        this.browser_interaction = browserInteraction;
        this.app_token = str;
        this.scenario_initiator_type = scenarioInitiatorType;
        this.authorization_context = authorizationContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ForwardedCallContext)) {
            return false;
        }
        ForwardedCallContext forwardedCallContext = (ForwardedCallContext) obj;
        return Intrinsics.areEqual(unknownFields(), forwardedCallContext.unknownFields()) && Intrinsics.areEqual(this.client_info, forwardedCallContext.client_info) && Intrinsics.areEqual(this.browser_interaction, forwardedCallContext.browser_interaction) && Intrinsics.areEqual(this.app_token, forwardedCallContext.app_token) && this.scenario_initiator_type == forwardedCallContext.scenario_initiator_type && Intrinsics.areEqual(this.authorization_context, forwardedCallContext.authorization_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientInfo clientInfo = this.client_info;
        int hashCode2 = (hashCode + (clientInfo != null ? clientInfo.hashCode() : 0)) * 37;
        BrowserInteraction browserInteraction = this.browser_interaction;
        int hashCode3 = (hashCode2 + (browserInteraction != null ? browserInteraction.hashCode() : 0)) * 37;
        String str = this.app_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        ScenarioInitiatorType scenarioInitiatorType = this.scenario_initiator_type;
        int hashCode5 = (hashCode4 + (scenarioInitiatorType != null ? scenarioInitiatorType.hashCode() : 0)) * 37;
        AuthorizationContext authorizationContext = this.authorization_context;
        int hashCode6 = hashCode5 + (authorizationContext != null ? authorizationContext.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(2, false);
        builder.instant_usec = this.client_info;
        builder.ordinal = this.browser_interaction;
        builder.posix_tz = this.app_token;
        builder.timezone_offset_min = this.scenario_initiator_type;
        builder.tz_name = this.authorization_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientInfo clientInfo = this.client_info;
        if (clientInfo != null) {
            arrayList.add("client_info=" + clientInfo);
        }
        BrowserInteraction browserInteraction = this.browser_interaction;
        if (browserInteraction != null) {
            arrayList.add("browser_interaction=" + browserInteraction);
        }
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        ScenarioInitiatorType scenarioInitiatorType = this.scenario_initiator_type;
        if (scenarioInitiatorType != null) {
            arrayList.add("scenario_initiator_type=" + scenarioInitiatorType);
        }
        AuthorizationContext authorizationContext = this.authorization_context;
        if (authorizationContext != null) {
            arrayList.add("authorization_context=" + authorizationContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ForwardedCallContext{", "}", 0, null, null, 56);
    }
}
