package com.squareup.protos.person;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
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

/* loaded from: classes8.dex */
public final class Person extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Person> CREATOR;
    public final List DO_NOT_USE_alias;
    public final Long created_at_ms;
    public final String person_token;
    public final List previous_person_token;
    public final Long retired_at_ms;
    public final List scoped_alias;
    public final Long updated_at_ms;

    static {
        Person$Companion$ADAPTER$1 person$Companion$ADAPTER$1 = new Person$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Person.class), "type.googleapis.com/squareup.person.Person", Syntax.PROTO_2, null, "squareup/person/service.proto");
        ADAPTER = person$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(person$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Person(String str, Long l, Long l2, Long l3, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.person_token = str;
        this.created_at_ms = l;
        this.updated_at_ms = l2;
        this.retired_at_ms = l3;
        this.previous_person_token = TransactorKt.immutableCopyOf("previous_person_token", list);
        this.DO_NOT_USE_alias = TransactorKt.immutableCopyOf("DO_NOT_USE_alias", list2);
        this.scoped_alias = TransactorKt.immutableCopyOf("scoped_alias", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return Intrinsics.areEqual(unknownFields(), person.unknownFields()) && Intrinsics.areEqual(this.person_token, person.person_token) && Intrinsics.areEqual(this.created_at_ms, person.created_at_ms) && Intrinsics.areEqual(this.updated_at_ms, person.updated_at_ms) && Intrinsics.areEqual(this.retired_at_ms, person.retired_at_ms) && Intrinsics.areEqual(this.previous_person_token, person.previous_person_token) && Intrinsics.areEqual(this.DO_NOT_USE_alias, person.DO_NOT_USE_alias) && Intrinsics.areEqual(this.scoped_alias, person.scoped_alias);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.person_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at_ms;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at_ms;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.retired_at_ms;
        int hashCode5 = this.scoped_alias.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37, 37, this.previous_person_token), 37, this.DO_NOT_USE_alias);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(21, false);
        builder.scope = this.person_token;
        builder.first_verified_at_ms = this.created_at_ms;
        builder.last_verified_at_ms = this.updated_at_ms;
        builder.created_at = this.retired_at_ms;
        builder.f1407type = this.previous_person_token;
        builder.value = this.DO_NOT_USE_alias;
        builder.updated_at = this.scoped_alias;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.person_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "person_token=", arrayList);
        }
        Long l = this.created_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_ms=", l, arrayList);
        }
        Long l2 = this.updated_at_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at_ms=", l2, arrayList);
        }
        Long l3 = this.retired_at_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("retired_at_ms=", l3, arrayList);
        }
        List list = this.previous_person_token;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("previous_person_token=", arrayList, list);
        }
        if (!this.DO_NOT_USE_alias.isEmpty()) {
            arrayList.add("DO_NOT_USE_alias=██");
        }
        List list2 = this.scoped_alias;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("scoped_alias=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Person{", "}", 0, null, null, 56);
    }
}
