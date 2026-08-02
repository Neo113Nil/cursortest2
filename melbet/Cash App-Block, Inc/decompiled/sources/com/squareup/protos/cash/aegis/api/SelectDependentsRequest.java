package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.notifications.Op;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SelectDependentsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectDependentsRequest> CREATOR;
    public final Action action;
    public final Boolean are_contacts_synced;
    public final List dependents;
    public final String invite_code;
    public final RequestContext request_context;

    /* loaded from: classes7.dex */
    public enum Action implements WireEnum {
        SELECT(0),
        CANCEL(1),
        CONFIRM(2);

        public static final SelectDependentsRequest$Action$Companion$ADAPTER$1 ADAPTER;
        public static final Op.Companion Companion;
        public final int value;

        static {
            Action action = SELECT;
            Companion = new Op.Companion();
            ADAPTER = new SelectDependentsRequest$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, action);
        }

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SELECT;
            }
            if (i == 1) {
                return CANCEL;
            }
            if (i != 2) {
                return null;
            }
            return CONFIRM;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public final class SelectedDependent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectedDependent> CREATOR;
        public final UiCustomer dependent;
        public final String full_name;
        public final Boolean is_added_to_favorites;
        public final Boolean is_cash_customer;
        public final Boolean is_in_contacts;

        static {
            SelectDependentsRequest$SelectedDependent$Companion$ADAPTER$1 selectDependentsRequest$SelectedDependent$Companion$ADAPTER$1 = new SelectDependentsRequest$SelectedDependent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectedDependent.class), "type.googleapis.com/squareup.cash.aegis.api.SelectDependentsRequest.SelectedDependent", Syntax.PROTO_2, null, "squareup/cash/aegis/api/SelectDependentsRequest.proto");
            ADAPTER = selectDependentsRequest$SelectedDependent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectDependentsRequest$SelectedDependent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedDependent(UiCustomer uiCustomer, Boolean bool, Boolean bool2, String str, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.dependent = uiCustomer;
            this.is_in_contacts = bool;
            this.is_added_to_favorites = bool2;
            this.full_name = str;
            this.is_cash_customer = bool3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedDependent)) {
                return false;
            }
            SelectedDependent selectedDependent = (SelectedDependent) obj;
            return Intrinsics.areEqual(unknownFields(), selectedDependent.unknownFields()) && Intrinsics.areEqual(this.dependent, selectedDependent.dependent) && Intrinsics.areEqual(this.is_in_contacts, selectedDependent.is_in_contacts) && Intrinsics.areEqual(this.is_added_to_favorites, selectedDependent.is_added_to_favorites) && Intrinsics.areEqual(this.full_name, selectedDependent.full_name) && Intrinsics.areEqual(this.is_cash_customer, selectedDependent.is_cash_customer);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiCustomer uiCustomer = this.dependent;
            int hashCode2 = (hashCode + (uiCustomer != null ? uiCustomer.hashCode() : 0)) * 37;
            Boolean bool = this.is_in_contacts;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_added_to_favorites;
            int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str = this.full_name;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool3 = this.is_cash_customer;
            int hashCode6 = hashCode5 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(14);
            builder.for_each = this.dependent;
            builder.moneybot_scaffold = this.is_in_contacts;
            builder.compose_platform = this.is_added_to_favorites;
            builder.is_included = this.full_name;
            builder.motion = this.is_cash_customer;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiCustomer uiCustomer = this.dependent;
            if (uiCustomer != null) {
                arrayList.add("dependent=" + uiCustomer);
            }
            Boolean bool = this.is_in_contacts;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_in_contacts=", bool, arrayList);
            }
            Boolean bool2 = this.is_added_to_favorites;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_added_to_favorites=", bool2, arrayList);
            }
            if (this.full_name != null) {
                arrayList.add("full_name=██");
            }
            Boolean bool3 = this.is_cash_customer;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedDependent{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectDependentsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.aegis.api.SelectDependentsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectDependentsRequest((RequestContext) obj, m, (SelectDependentsRequest.Action) obj2, (String) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        m.add(SelectDependentsRequest.SelectedDependent.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        try {
                            obj2 = SelectDependentsRequest.Action.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectDependentsRequest selectDependentsRequest = (SelectDependentsRequest) obj;
                reverseProtoWriter.getClass();
                selectDependentsRequest.getClass();
                reverseProtoWriter.writeBytes(selectDependentsRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, selectDependentsRequest.are_contacts_synced);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, selectDependentsRequest.invite_code);
                SelectDependentsRequest.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, selectDependentsRequest.action);
                SelectDependentsRequest.SelectedDependent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, selectDependentsRequest.dependents);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectDependentsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SelectDependentsRequest selectDependentsRequest = (SelectDependentsRequest) obj;
                selectDependentsRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(5, selectDependentsRequest.are_contacts_synced) + ProtoAdapter.STRING.encodedSizeWithTag(4, selectDependentsRequest.invite_code) + SelectDependentsRequest.Action.ADAPTER.encodedSizeWithTag(3, selectDependentsRequest.action) + SelectDependentsRequest.SelectedDependent.ADAPTER.asRepeated().encodedSizeWithTag(2, selectDependentsRequest.dependents) + RequestContext.ADAPTER.encodedSizeWithTag(1, selectDependentsRequest.request_context) + selectDependentsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectDependentsRequest selectDependentsRequest = (SelectDependentsRequest) obj;
                selectDependentsRequest.getClass();
                RequestContext requestContext = selectDependentsRequest.request_context;
                return SelectDependentsRequest.copy$default(selectDependentsRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, TransactorKt.m1169redactElements(selectDependentsRequest.dependents, SelectDependentsRequest.SelectedDependent.ADAPTER), ByteString.EMPTY, 28);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectDependentsRequest selectDependentsRequest = (SelectDependentsRequest) obj;
                selectDependentsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectDependentsRequest.request_context);
                SelectDependentsRequest.SelectedDependent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, selectDependentsRequest.dependents);
                SelectDependentsRequest.Action.ADAPTER.encodeWithTag(protoWriter, 3, selectDependentsRequest.action);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, selectDependentsRequest.invite_code);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, selectDependentsRequest.are_contacts_synced);
                protoWriter.writeBytes(selectDependentsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectDependentsRequest(RequestContext requestContext, List list, Action action, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.action = action;
        this.invite_code = str;
        this.are_contacts_synced = bool;
        this.dependents = TransactorKt.immutableCopyOf("dependents", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    public static SelectDependentsRequest copy$default(SelectDependentsRequest selectDependentsRequest, RequestContext requestContext, ArrayList arrayList, ByteString byteString, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = selectDependentsRequest.dependents;
        }
        ArrayList arrayList3 = arrayList2;
        Action action = selectDependentsRequest.action;
        String str = selectDependentsRequest.invite_code;
        Boolean bool = selectDependentsRequest.are_contacts_synced;
        if ((i & 32) != 0) {
            byteString = selectDependentsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        selectDependentsRequest.getClass();
        arrayList3.getClass();
        byteString2.getClass();
        return new SelectDependentsRequest(requestContext, arrayList3, action, str, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectDependentsRequest)) {
            return false;
        }
        SelectDependentsRequest selectDependentsRequest = (SelectDependentsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectDependentsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectDependentsRequest.request_context) && Intrinsics.areEqual(this.dependents, selectDependentsRequest.dependents) && this.action == selectDependentsRequest.action && Intrinsics.areEqual(this.invite_code, selectDependentsRequest.invite_code) && Intrinsics.areEqual(this.are_contacts_synced, selectDependentsRequest.are_contacts_synced);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37, 37, this.dependents);
        Action action = this.action;
        int hashCode2 = (m + (action != null ? action.hashCode() : 0)) * 37;
        String str = this.invite_code;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.are_contacts_synced;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder();
        builder.for_each = this.request_context;
        builder.moneybot_scaffold = this.dependents;
        builder.compose_platform = this.action;
        builder.is_included = this.invite_code;
        builder.motion = this.are_contacts_synced;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        List list = this.dependents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("dependents=", arrayList, list);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        String str = this.invite_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invite_code=", arrayList);
        }
        Boolean bool = this.are_contacts_synced;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("are_contacts_synced=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectDependentsRequest{", "}", 0, null, null, 56);
    }
}
