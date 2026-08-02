package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SessionScope extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SessionScope> CREATOR;
    public final SessionScope$Details$RequestsDecideScopeDetails details;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1274type;

    public final class RequestsDecideScopeDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RequestsDecideScopeDetails> CREATOR;
        public final List action_types;

        public enum ActionType implements WireEnum {
            ONE_TIME_PAYMENT(1),
            ON_FILE_PAYMENT(2);

            public final int value;
            public static final RadioType.Companion Companion = new RadioType.Companion();
            public static final SessionScope$RequestsDecideScopeDetails$ActionType$Companion$ADAPTER$1 ADAPTER = new SessionScope$RequestsDecideScopeDetails$ActionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActionType.class), Syntax.PROTO_2, null);

            ActionType(int i) {
                this.value = i;
            }

            public static final ActionType fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return ONE_TIME_PAYMENT;
                }
                if (i != 2) {
                    return null;
                }
                return ON_FILE_PAYMENT;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            SessionScope$RequestsDecideScopeDetails$Companion$ADAPTER$1 sessionScope$RequestsDecideScopeDetails$Companion$ADAPTER$1 = new SessionScope$RequestsDecideScopeDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequestsDecideScopeDetails.class), "type.googleapis.com/squareup.cash.grantly.api.SessionScope.RequestsDecideScopeDetails", Syntax.PROTO_2, null, "squareup/cash/grantly/api/session.proto");
            ADAPTER = sessionScope$RequestsDecideScopeDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(sessionScope$RequestsDecideScopeDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestsDecideScopeDetails(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.action_types = TransactorKt.immutableCopyOf("action_types", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RequestsDecideScopeDetails)) {
                return false;
            }
            RequestsDecideScopeDetails requestsDecideScopeDetails = (RequestsDecideScopeDetails) obj;
            return Intrinsics.areEqual(unknownFields(), requestsDecideScopeDetails.unknownFields()) && Intrinsics.areEqual(this.action_types, requestsDecideScopeDetails.action_types);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.action_types.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SandboxMetadata.Builder builder = new SandboxMetadata.Builder(17, false);
            builder.scenarios = this.action_types;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.action_types;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("action_types=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RequestsDecideScopeDetails{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type implements WireEnum {
        public static final /* synthetic */ Type[] $VALUES;
        public static final SessionScope$Type$Companion$ADAPTER$1 ADAPTER;
        public static final ImageLayout.Companion Companion;
        public static final Type REQUESTS_DECIDE;

        static {
            Type type2 = new Type("REQUESTS_DECIDE", 0);
            REQUESTS_DECIDE = type2;
            $VALUES = new Type[]{type2};
            Companion = new ImageLayout.Companion();
            ADAPTER = new SessionScope$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return REQUESTS_DECIDE;
            }
            return null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    static {
        SessionScope$Companion$ADAPTER$1 sessionScope$Companion$ADAPTER$1 = new SessionScope$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SessionScope.class), "type.googleapis.com/squareup.cash.grantly.api.SessionScope", Syntax.PROTO_2, null, "squareup/cash/grantly/api/session.proto");
        ADAPTER = sessionScope$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sessionScope$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionScope(Type type2, SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        type2.getClass();
        byteString.getClass();
        this.f1274type = type2;
        this.details = sessionScope$Details$RequestsDecideScopeDetails;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionScope)) {
            return false;
        }
        SessionScope sessionScope = (SessionScope) obj;
        return Intrinsics.areEqual(unknownFields(), sessionScope.unknownFields()) && this.f1274type == sessionScope.f1274type && Intrinsics.areEqual(this.details, sessionScope.details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.f1274type.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = this.details;
        int hashCode2 = hashCode + (sessionScope$Details$RequestsDecideScopeDetails != null ? sessionScope$Details$RequestsDecideScopeDetails.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(3);
        builder.card_type = this.f1274type;
        builder.card_pii = this.details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.f1274type);
        SessionScope$Details$RequestsDecideScopeDetails sessionScope$Details$RequestsDecideScopeDetails = this.details;
        if (sessionScope$Details$RequestsDecideScopeDetails != null) {
            arrayList.add("details=" + sessionScope$Details$RequestsDecideScopeDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SessionScope{", "}", 0, null, null, 56);
    }
}
