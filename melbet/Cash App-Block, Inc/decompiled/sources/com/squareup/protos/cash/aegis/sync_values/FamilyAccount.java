package com.squareup.protos.cash.aegis.sync_values;

import android.os.Parcelable;
import app.cash.local.primitives.BrandCollectionDataKt;
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
public final class FamilyAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamilyAccount> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final BrandCollectionDataKt f1246type;

    static {
        FamilyAccount$Companion$ADAPTER$1 familyAccount$Companion$ADAPTER$1 = new FamilyAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FamilyAccount.class), "type.googleapis.com/squareup.cash.aegis.sync_values.FamilyAccount", Syntax.PROTO_2, null, "squareup/cash/aegis/sync_values/UiFamilyAccount.proto");
        ADAPTER = familyAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(familyAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyAccount(BrandCollectionDataKt brandCollectionDataKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1246type = brandCollectionDataKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyAccount)) {
            return false;
        }
        FamilyAccount familyAccount = (FamilyAccount) obj;
        return Intrinsics.areEqual(unknownFields(), familyAccount.unknownFields()) && Intrinsics.areEqual(this.f1246type, familyAccount.f1246type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BrandCollectionDataKt brandCollectionDataKt = this.f1246type;
        int hashCode2 = hashCode + (brandCollectionDataKt != null ? brandCollectionDataKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(21);
        builder.f1245type = this.f1246type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BrandCollectionDataKt brandCollectionDataKt = this.f1246type;
        if (brandCollectionDataKt != null) {
            arrayList.add("type=" + brandCollectionDataKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamilyAccount{", "}", 0, null, null, 56);
    }
}
