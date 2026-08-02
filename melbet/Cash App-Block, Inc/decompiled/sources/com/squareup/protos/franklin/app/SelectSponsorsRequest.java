package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
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
public final class SelectSponsorsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectSponsorsRequest> CREATOR;
    public final Action action;
    public final Boolean dependent_contacts_synced;
    public final String invite_code;
    public final RequestContext request_context;
    public final List selected_sponsors;
    public final List sponsors;

    /* loaded from: classes8.dex */
    public enum Action implements WireEnum {
        SELECT(0),
        CANCEL(1),
        CONFIRM(2);

        public static final SelectSponsorsRequest$Action$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            Action action = SELECT;
            Companion = new TextSize.Companion();
            ADAPTER = new SelectSponsorsRequest$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, action);
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

    /* loaded from: classes8.dex */
    public final class SelectedSponsor extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectedSponsor> CREATOR;
        public final String full_name;
        public final Boolean is_added_to_favorites;
        public final Boolean is_cash_customer;
        public final Boolean is_in_contacts;
        public final Boolean is_recommended_sponsor;
        public final UiCustomer sponsor;

        static {
            SelectSponsorsRequest$SelectedSponsor$Companion$ADAPTER$1 selectSponsorsRequest$SelectedSponsor$Companion$ADAPTER$1 = new SelectSponsorsRequest$SelectedSponsor$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectedSponsor.class), "type.googleapis.com/squareup.franklin.app.SelectSponsorsRequest.SelectedSponsor", Syntax.PROTO_2, null, "squareup/franklin/app/sponsors.proto");
            ADAPTER = selectSponsorsRequest$SelectedSponsor$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectSponsorsRequest$SelectedSponsor$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedSponsor(UiCustomer uiCustomer, Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sponsor = uiCustomer;
            this.is_in_contacts = bool;
            this.is_added_to_favorites = bool2;
            this.is_recommended_sponsor = bool3;
            this.full_name = str;
            this.is_cash_customer = bool4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedSponsor)) {
                return false;
            }
            SelectedSponsor selectedSponsor = (SelectedSponsor) obj;
            return Intrinsics.areEqual(unknownFields(), selectedSponsor.unknownFields()) && Intrinsics.areEqual(this.sponsor, selectedSponsor.sponsor) && Intrinsics.areEqual(this.is_in_contacts, selectedSponsor.is_in_contacts) && Intrinsics.areEqual(this.is_added_to_favorites, selectedSponsor.is_added_to_favorites) && Intrinsics.areEqual(this.is_recommended_sponsor, selectedSponsor.is_recommended_sponsor) && Intrinsics.areEqual(this.full_name, selectedSponsor.full_name) && Intrinsics.areEqual(this.is_cash_customer, selectedSponsor.is_cash_customer);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiCustomer uiCustomer = this.sponsor;
            int hashCode2 = (hashCode + (uiCustomer != null ? uiCustomer.hashCode() : 0)) * 37;
            Boolean bool = this.is_in_contacts;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_added_to_favorites;
            int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Boolean bool3 = this.is_recommended_sponsor;
            int hashCode5 = (hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
            String str = this.full_name;
            int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool4 = this.is_cash_customer;
            int hashCode7 = hashCode6 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Document.Builder builder = new Document.Builder(16, false);
            builder.token = this.sponsor;
            builder.title = this.is_in_contacts;
            builder.url = this.is_added_to_favorites;
            builder.owner_token = this.is_recommended_sponsor;
            builder.category = this.full_name;
            builder.document_date = this.is_cash_customer;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiCustomer uiCustomer = this.sponsor;
            if (uiCustomer != null) {
                arrayList.add("sponsor=" + uiCustomer);
            }
            Boolean bool = this.is_in_contacts;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_in_contacts=", bool, arrayList);
            }
            Boolean bool2 = this.is_added_to_favorites;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_added_to_favorites=", bool2, arrayList);
            }
            Boolean bool3 = this.is_recommended_sponsor;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_recommended_sponsor=", bool3, arrayList);
            }
            if (this.full_name != null) {
                arrayList.add("full_name=██");
            }
            Boolean bool4 = this.is_cash_customer;
            if (bool4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedSponsor{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectSponsorsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SelectSponsorsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectSponsorsRequest((RequestContext) obj, m, (SelectSponsorsRequest.Action) obj2, (String) obj3, (Boolean) obj4, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 2:
                            m.add(UiCustomer.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            try {
                                obj2 = SelectSponsorsRequest.Action.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            arrayList.add(SelectSponsorsRequest.SelectedSponsor.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectSponsorsRequest selectSponsorsRequest = (SelectSponsorsRequest) obj;
                reverseProtoWriter.getClass();
                selectSponsorsRequest.getClass();
                reverseProtoWriter.writeBytes(selectSponsorsRequest.unknownFields());
                SelectSponsorsRequest.SelectedSponsor.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, selectSponsorsRequest.selected_sponsors);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, selectSponsorsRequest.dependent_contacts_synced);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, selectSponsorsRequest.invite_code);
                SelectSponsorsRequest.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, selectSponsorsRequest.action);
                UiCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, selectSponsorsRequest.sponsors);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectSponsorsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SelectSponsorsRequest selectSponsorsRequest = (SelectSponsorsRequest) obj;
                selectSponsorsRequest.getClass();
                return SelectSponsorsRequest.SelectedSponsor.ADAPTER.asRepeated().encodedSizeWithTag(6, selectSponsorsRequest.selected_sponsors) + ProtoAdapter.BOOL.encodedSizeWithTag(5, selectSponsorsRequest.dependent_contacts_synced) + ProtoAdapter.STRING.encodedSizeWithTag(4, selectSponsorsRequest.invite_code) + SelectSponsorsRequest.Action.ADAPTER.encodedSizeWithTag(3, selectSponsorsRequest.action) + UiCustomer.ADAPTER.asRepeated().encodedSizeWithTag(2, selectSponsorsRequest.sponsors) + RequestContext.ADAPTER.encodedSizeWithTag(1, selectSponsorsRequest.request_context) + selectSponsorsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectSponsorsRequest selectSponsorsRequest = (SelectSponsorsRequest) obj;
                selectSponsorsRequest.getClass();
                RequestContext requestContext = selectSponsorsRequest.request_context;
                return SelectSponsorsRequest.copy$default(selectSponsorsRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, TransactorKt.m1169redactElements(selectSponsorsRequest.sponsors, UiCustomer.ADAPTER), TransactorKt.m1169redactElements(selectSponsorsRequest.selected_sponsors, SelectSponsorsRequest.SelectedSponsor.ADAPTER), ByteString.EMPTY, 28);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectSponsorsRequest selectSponsorsRequest = (SelectSponsorsRequest) obj;
                selectSponsorsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectSponsorsRequest.request_context);
                UiCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, selectSponsorsRequest.sponsors);
                SelectSponsorsRequest.Action.ADAPTER.encodeWithTag(protoWriter, 3, selectSponsorsRequest.action);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, selectSponsorsRequest.invite_code);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, selectSponsorsRequest.dependent_contacts_synced);
                SelectSponsorsRequest.SelectedSponsor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, selectSponsorsRequest.selected_sponsors);
                protoWriter.writeBytes(selectSponsorsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSponsorsRequest(RequestContext requestContext, List list, Action action, String str, Boolean bool, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.request_context = requestContext;
        this.action = action;
        this.invite_code = str;
        this.dependent_contacts_synced = bool;
        this.sponsors = TransactorKt.immutableCopyOf("sponsors", list);
        this.selected_sponsors = TransactorKt.immutableCopyOf("selected_sponsors", list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    public static SelectSponsorsRequest copy$default(SelectSponsorsRequest selectSponsorsRequest, RequestContext requestContext, ArrayList arrayList, ArrayList arrayList2, ByteString byteString, int i) {
        ArrayList arrayList3 = arrayList;
        if ((i & 2) != 0) {
            arrayList3 = selectSponsorsRequest.sponsors;
        }
        ArrayList arrayList4 = arrayList3;
        Action action = selectSponsorsRequest.action;
        String str = selectSponsorsRequest.invite_code;
        Boolean bool = selectSponsorsRequest.dependent_contacts_synced;
        ArrayList arrayList5 = arrayList2;
        if ((i & 32) != 0) {
            arrayList5 = selectSponsorsRequest.selected_sponsors;
        }
        ArrayList arrayList6 = arrayList5;
        if ((i & 64) != 0) {
            byteString = selectSponsorsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        selectSponsorsRequest.getClass();
        arrayList4.getClass();
        arrayList6.getClass();
        byteString2.getClass();
        return new SelectSponsorsRequest(requestContext, arrayList4, action, str, bool, arrayList6, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectSponsorsRequest)) {
            return false;
        }
        SelectSponsorsRequest selectSponsorsRequest = (SelectSponsorsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectSponsorsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectSponsorsRequest.request_context) && Intrinsics.areEqual(this.sponsors, selectSponsorsRequest.sponsors) && this.action == selectSponsorsRequest.action && Intrinsics.areEqual(this.invite_code, selectSponsorsRequest.invite_code) && Intrinsics.areEqual(this.dependent_contacts_synced, selectSponsorsRequest.dependent_contacts_synced) && Intrinsics.areEqual(this.selected_sponsors, selectSponsorsRequest.selected_sponsors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37, 37, this.sponsors);
        Action action = this.action;
        int hashCode2 = (m + (action != null ? action.hashCode() : 0)) * 37;
        String str = this.invite_code;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.dependent_contacts_synced;
        int hashCode4 = this.selected_sponsors.hashCode() + ((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(15);
        builder.token = this.request_context;
        builder.title = this.sponsors;
        builder.url = this.action;
        builder.category = this.invite_code;
        builder.owner_token = this.dependent_contacts_synced;
        builder.document_date = this.selected_sponsors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        List list = this.sponsors;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sponsors=", arrayList, list);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        String str = this.invite_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invite_code=", arrayList);
        }
        Boolean bool = this.dependent_contacts_synced;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dependent_contacts_synced=", bool, arrayList);
        }
        List list2 = this.selected_sponsors;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("selected_sponsors=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectSponsorsRequest{", "}", 0, null, null, 56);
    }
}
