package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
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

/* loaded from: classes7.dex */
public final class SocialAccounts extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SocialAccounts> CREATOR;
    public final List social;

    static {
        SocialAccounts$Companion$ADAPTER$1 socialAccounts$Companion$ADAPTER$1 = new SocialAccounts$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SocialAccounts.class), "type.googleapis.com/squareup.cash.cashface.api.SocialAccounts", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = socialAccounts$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(socialAccounts$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialAccounts(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.social = TransactorKt.immutableCopyOf("social", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocialAccounts)) {
            return false;
        }
        SocialAccounts socialAccounts = (SocialAccounts) obj;
        return Intrinsics.areEqual(unknownFields(), socialAccounts.unknownFields()) && Intrinsics.areEqual(this.social, socialAccounts.social);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.social.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(2);
        builder.trust = this.social;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.social;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("social=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SocialAccounts{", "}", 0, null, null, 56);
    }
}
