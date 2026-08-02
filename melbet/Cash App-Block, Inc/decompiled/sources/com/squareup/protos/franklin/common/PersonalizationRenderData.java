package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.protos.franklin.bankbook.Institution;
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
public final class PersonalizationRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizationRenderData> CREATOR;
    public final Boolean customer_viewed;
    public final Personalization personalization;
    public final com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization_payload;

    static {
        PersonalizationRenderData$Companion$ADAPTER$1 personalizationRenderData$Companion$ADAPTER$1 = new PersonalizationRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PersonalizationRenderData.class), "type.googleapis.com/squareup.franklin.PersonalizationRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = personalizationRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(personalizationRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizationRenderData(Personalization personalization, Boolean bool, com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.personalization = personalization;
        this.customer_viewed = bool;
        this.personalization_payload = personalization2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizationRenderData)) {
            return false;
        }
        PersonalizationRenderData personalizationRenderData = (PersonalizationRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), personalizationRenderData.unknownFields()) && Intrinsics.areEqual(this.personalization, personalizationRenderData.personalization) && Intrinsics.areEqual(this.customer_viewed, personalizationRenderData.customer_viewed) && Intrinsics.areEqual(this.personalization_payload, personalizationRenderData.personalization_payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Personalization personalization = this.personalization;
        int hashCode2 = (hashCode + (personalization != null ? personalization.hashCode() : 0)) * 37;
        Boolean bool = this.customer_viewed;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = this.personalization_payload;
        int hashCode4 = hashCode3 + (personalization2 != null ? personalization2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(25, false);
        builder.institution_token = this.personalization;
        builder.display_info = this.customer_viewed;
        builder.help_menu_items = this.personalization_payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Personalization personalization = this.personalization;
        if (personalization != null) {
            arrayList.add("personalization=" + personalization);
        }
        Boolean bool = this.customer_viewed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_viewed=", bool, arrayList);
        }
        com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization2 = this.personalization_payload;
        if (personalization2 != null) {
            arrayList.add("personalization_payload=" + personalization2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizationRenderData{", "}", 0, null, null, 56);
    }
}
