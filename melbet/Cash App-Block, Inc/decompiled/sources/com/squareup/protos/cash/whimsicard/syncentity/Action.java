package com.squareup.protos.cash.whimsicard.syncentity;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.lending.OpaqueRoute;
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

/* loaded from: classes8.dex */
public final class Action extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Action> CREATOR;
    public final LocalizedString label;

    /* renamed from: type, reason: collision with root package name */
    public final Action$Type$ClientRoute f1343type;

    public final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;
        public final String client_route_url;

        static {
            Action$ClientRouteAction$Companion$ADAPTER$1 action$ClientRouteAction$Companion$ADAPTER$1 = new Action$ClientRouteAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.Action.ClientRouteAction", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
            ADAPTER = action$ClientRouteAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(action$ClientRouteAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientRouteAction)) {
                return false;
            }
            ClientRouteAction clientRouteAction = (ClientRouteAction) obj;
            return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, clientRouteAction.client_route_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.client_route_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(6);
            builder.client_route = this.client_route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.client_route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
        }
    }

    static {
        Action$Companion$ADAPTER$1 action$Companion$ADAPTER$1 = new Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.Action", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
        ADAPTER = action$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(action$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Action(LocalizedString localizedString, Action$Type$ClientRoute action$Type$ClientRoute, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = localizedString;
        this.f1343type = action$Type$ClientRoute;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.label, action.label) && Intrinsics.areEqual(this.f1343type, action.f1343type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.label;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Action$Type$ClientRoute action$Type$ClientRoute = this.f1343type;
        int hashCode3 = hashCode2 + (action$Type$ClientRoute != null ? action$Type$ClientRoute.value.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(21);
        builder.primary_button = this.label;
        builder.secondary_button = this.f1343type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
        }
        Action$Type$ClientRoute action$Type$ClientRoute = this.f1343type;
        if (action$Type$ClientRoute != null) {
            arrayList.add("type=" + action$Type$ClientRoute);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
    }
}
