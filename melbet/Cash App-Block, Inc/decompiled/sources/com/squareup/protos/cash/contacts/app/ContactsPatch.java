package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes7.dex */
public final class ContactsPatch extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContactsPatch> CREATOR;
    public final List removed_contact_ids;
    public final List upserted_contacts;

    static {
        ContactsPatch$Companion$ADAPTER$1 contactsPatch$Companion$ADAPTER$1 = new ContactsPatch$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContactsPatch.class), "type.googleapis.com/squareup.cash.contacts.app.ContactsPatch", Syntax.PROTO_2, null, "squareup/cash/contacts/app/api.proto");
        ADAPTER = contactsPatch$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contactsPatch$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsPatch(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.upserted_contacts = TransactorKt.immutableCopyOf("upserted_contacts", list);
        this.removed_contact_ids = TransactorKt.immutableCopyOf("removed_contact_ids", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactsPatch)) {
            return false;
        }
        ContactsPatch contactsPatch = (ContactsPatch) obj;
        return Intrinsics.areEqual(unknownFields(), contactsPatch.unknownFields()) && Intrinsics.areEqual(this.upserted_contacts, contactsPatch.upserted_contacts) && Intrinsics.areEqual(this.removed_contact_ids, contactsPatch.removed_contact_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.removed_contact_ids.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.upserted_contacts);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(9, false);
        builder.card_holder_benefits = this.upserted_contacts;
        builder.green_status_benefits = this.removed_contact_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.upserted_contacts;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("upserted_contacts=", arrayList, list);
        }
        List list2 = this.removed_contact_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("removed_contact_ids=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContactsPatch{", "}", 0, null, null, 56);
    }

    public ContactsPatch(List list, List list2) {
        this(list, list2, ByteString.EMPTY);
    }
}
