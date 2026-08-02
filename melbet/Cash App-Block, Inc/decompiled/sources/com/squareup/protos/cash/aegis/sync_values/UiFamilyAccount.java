package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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

/* loaded from: classes7.dex */
public final class UiFamilyAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiFamilyAccount> CREATOR;
    public final FamilyAccount family_account;

    static {
        UiFamilyAccount$Companion$ADAPTER$1 uiFamilyAccount$Companion$ADAPTER$1 = new UiFamilyAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiFamilyAccount.class), "type.googleapis.com/squareup.cash.aegis.sync_values.UiFamilyAccount", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = uiFamilyAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiFamilyAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiFamilyAccount(FamilyAccount familyAccount, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.family_account = familyAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiFamilyAccount)) {
            return false;
        }
        UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
        return Intrinsics.areEqual(unknownFields(), uiFamilyAccount.unknownFields()) && Intrinsics.areEqual(this.family_account, uiFamilyAccount.family_account);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FamilyAccount familyAccount = this.family_account;
        int hashCode2 = hashCode + (familyAccount != null ? familyAccount.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(23);
        builder.f1245type = this.family_account;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FamilyAccount familyAccount = this.family_account;
        if (familyAccount != null) {
            arrayList.add("family_account=" + familyAccount);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiFamilyAccount{", "}", 0, null, null, 56);
    }
}
