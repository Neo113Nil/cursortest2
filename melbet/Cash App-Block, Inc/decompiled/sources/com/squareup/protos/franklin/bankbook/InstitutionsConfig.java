package com.squareup.protos.franklin.bankbook;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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
public final class InstitutionsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstitutionsConfig> CREATOR;
    public final List institutions;

    static {
        InstitutionsConfig$Companion$ADAPTER$1 institutionsConfig$Companion$ADAPTER$1 = new InstitutionsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstitutionsConfig.class), "type.googleapis.com/squareup.franklin.bankbook.InstitutionsConfig", Syntax.PROTO_2, null, "squareup/franklin/bankbook.proto");
        ADAPTER = institutionsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(institutionsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionsConfig(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.institutions = TransactorKt.immutableCopyOf("institutions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstitutionsConfig)) {
            return false;
        }
        InstitutionsConfig institutionsConfig = (InstitutionsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), institutionsConfig.unknownFields()) && Intrinsics.areEqual(this.institutions, institutionsConfig.institutions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.institutions.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(21, false);
        builder.header = this.institutions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.institutions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("institutions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstitutionsConfig{", "}", 0, null, null, 56);
    }
}
