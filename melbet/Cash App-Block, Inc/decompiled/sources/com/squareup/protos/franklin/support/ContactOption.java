package com.squareup.protos.franklin.support;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
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
public final class ContactOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContactOption> CREATOR;
    public final Boolean available;
    public final String contact_header;
    public final String contact_terms;
    public final SupportContactType contact_type;
    public final Boolean include_issue_description;
    public final String summary_text;
    public final String time_estimate;

    static {
        ContactOption$Companion$ADAPTER$1 contactOption$Companion$ADAPTER$1 = new ContactOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContactOption.class), "type.googleapis.com/squareup.franklin.support.ContactOption", Syntax.PROTO_2, null, "squareup/franklin/support.proto");
        ADAPTER = contactOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contactOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactOption(SupportContactType supportContactType, Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.contact_type = supportContactType;
        this.available = bool;
        this.summary_text = str;
        this.contact_header = str2;
        this.time_estimate = str3;
        this.include_issue_description = bool2;
        this.contact_terms = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactOption)) {
            return false;
        }
        ContactOption contactOption = (ContactOption) obj;
        return Intrinsics.areEqual(unknownFields(), contactOption.unknownFields()) && this.contact_type == contactOption.contact_type && Intrinsics.areEqual(this.available, contactOption.available) && Intrinsics.areEqual(this.summary_text, contactOption.summary_text) && Intrinsics.areEqual(this.contact_header, contactOption.contact_header) && Intrinsics.areEqual(this.time_estimate, contactOption.time_estimate) && Intrinsics.areEqual(this.include_issue_description, contactOption.include_issue_description) && Intrinsics.areEqual(this.contact_terms, contactOption.contact_terms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SupportContactType supportContactType = this.contact_type;
        int hashCode2 = (hashCode + (supportContactType != null ? supportContactType.hashCode() : 0)) * 37;
        Boolean bool = this.available;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.summary_text;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.contact_header;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.time_estimate;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool2 = this.include_issue_description;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str4 = this.contact_terms;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(17, false);
        builder.f1407type = this.contact_type;
        builder.first_verified_at_ms = this.available;
        builder.scope = this.summary_text;
        builder.value = this.contact_header;
        builder.last_verified_at_ms = this.time_estimate;
        builder.created_at = this.include_issue_description;
        builder.updated_at = this.contact_terms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SupportContactType supportContactType = this.contact_type;
        if (supportContactType != null) {
            arrayList.add("contact_type=" + supportContactType);
        }
        Boolean bool = this.available;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("available=", bool, arrayList);
        }
        String str = this.summary_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "summary_text=", arrayList);
        }
        String str2 = this.contact_header;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "contact_header=", arrayList);
        }
        String str3 = this.time_estimate;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "time_estimate=", arrayList);
        }
        Boolean bool2 = this.include_issue_description;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_issue_description=", bool2, arrayList);
        }
        String str4 = this.contact_terms;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "contact_terms=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContactOption{", "}", 0, null, null, 56);
    }
}
