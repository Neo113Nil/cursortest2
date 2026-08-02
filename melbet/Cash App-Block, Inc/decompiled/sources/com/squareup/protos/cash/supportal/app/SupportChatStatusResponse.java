package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/SupportChatStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/document/DocumentEntity$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzlo", "Granted", "Denied", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SupportChatStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupportChatStatusResponse> CREATOR;
    public final zzlo access;
    public final String availability_subtitle;
    public final Long current_customer_service_end_time;
    public final Long current_customer_service_open_time;
    public final Boolean customer_service_available;
    public final List ignored_phrases;
    public final Long next_customer_service_end_time;
    public final Long next_customer_service_open_time;

    public final class Denied extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Denied> CREATOR;

        static {
            SupportChatStatusResponse$Denied$Companion$ADAPTER$1 supportChatStatusResponse$Denied$Companion$ADAPTER$1 = new SupportChatStatusResponse$Denied$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Denied.class), "type.googleapis.com/squareup.cash.supportal.app.SupportChatStatusResponse.Denied", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportChatStatusResponse$Denied$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportChatStatusResponse$Denied$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Denied(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Denied) && Intrinsics.areEqual(unknownFields(), ((Denied) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(14);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Denied{}";
        }
    }

    public final class Granted extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Granted> CREATOR;
        public final Boolean has_active_chat;

        static {
            SupportChatStatusResponse$Granted$Companion$ADAPTER$1 supportChatStatusResponse$Granted$Companion$ADAPTER$1 = new SupportChatStatusResponse$Granted$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Granted.class), "type.googleapis.com/squareup.cash.supportal.app.SupportChatStatusResponse.Granted", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = supportChatStatusResponse$Granted$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(supportChatStatusResponse$Granted$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Granted(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.has_active_chat = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Granted)) {
                return false;
            }
            Granted granted = (Granted) obj;
            return Intrinsics.areEqual(unknownFields(), granted.unknownFields()) && Intrinsics.areEqual(this.has_active_chat, granted.has_active_chat);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.has_active_chat;
            int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiAppLock.Builder builder = new UiAppLock.Builder(19);
            builder.activated = this.has_active_chat;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.has_active_chat;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("has_active_chat=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Granted{", "}", 0, null, null, 56);
        }
    }

    static {
        SupportChatStatusResponse$Companion$ADAPTER$1 supportChatStatusResponse$Companion$ADAPTER$1 = new SupportChatStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportChatStatusResponse.class), "type.googleapis.com/squareup.cash.supportal.app.SupportChatStatusResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = supportChatStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supportChatStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatStatusResponse(Boolean bool, Long l, Long l2, Long l3, Long l4, List list, String str, zzlo zzloVar, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_service_available = bool;
        this.current_customer_service_open_time = l;
        this.current_customer_service_end_time = l2;
        this.next_customer_service_open_time = l3;
        this.next_customer_service_end_time = l4;
        this.availability_subtitle = str;
        this.access = zzloVar;
        this.ignored_phrases = TransactorKt.immutableCopyOf("ignored_phrases", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportChatStatusResponse)) {
            return false;
        }
        SupportChatStatusResponse supportChatStatusResponse = (SupportChatStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), supportChatStatusResponse.unknownFields()) && Intrinsics.areEqual(this.customer_service_available, supportChatStatusResponse.customer_service_available) && Intrinsics.areEqual(this.current_customer_service_open_time, supportChatStatusResponse.current_customer_service_open_time) && Intrinsics.areEqual(this.current_customer_service_end_time, supportChatStatusResponse.current_customer_service_end_time) && Intrinsics.areEqual(this.next_customer_service_open_time, supportChatStatusResponse.next_customer_service_open_time) && Intrinsics.areEqual(this.next_customer_service_end_time, supportChatStatusResponse.next_customer_service_end_time) && Intrinsics.areEqual(this.ignored_phrases, supportChatStatusResponse.ignored_phrases) && Intrinsics.areEqual(this.availability_subtitle, supportChatStatusResponse.availability_subtitle) && Intrinsics.areEqual(this.access, supportChatStatusResponse.access);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.customer_service_available;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.current_customer_service_open_time;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.current_customer_service_end_time;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.next_customer_service_open_time;
        int hashCode5 = (hashCode4 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.next_customer_service_end_time;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37, 37, this.ignored_phrases);
        String str = this.availability_subtitle;
        int hashCode6 = (m + (str != null ? str.hashCode() : 0)) * 37;
        zzlo zzloVar = this.access;
        int hashCode7 = hashCode6 + (zzloVar != null ? zzloVar.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(19, false);
        builder.token = this.customer_service_available;
        builder.title = this.current_customer_service_open_time;
        builder.client_route = this.current_customer_service_end_time;
        builder.url = this.next_customer_service_open_time;
        builder.owner_token = this.next_customer_service_end_time;
        builder.version_data = this.ignored_phrases;
        builder.category = this.availability_subtitle;
        builder.localizable_title = this.access;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.customer_service_available;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_service_available=", bool, arrayList);
        }
        Long l = this.current_customer_service_open_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_customer_service_open_time=", l, arrayList);
        }
        Long l2 = this.current_customer_service_end_time;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_customer_service_end_time=", l2, arrayList);
        }
        Long l3 = this.next_customer_service_open_time;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_customer_service_open_time=", l3, arrayList);
        }
        Long l4 = this.next_customer_service_end_time;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_customer_service_end_time=", l4, arrayList);
        }
        List list = this.ignored_phrases;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ignored_phrases=", arrayList, list);
        }
        String str = this.availability_subtitle;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "availability_subtitle=", arrayList);
        }
        zzlo zzloVar = this.access;
        if (zzloVar != null) {
            arrayList.add("access=" + zzloVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportChatStatusResponse{", "}", 0, null, null, 56);
    }
}
