package squareup.cash.cashliteflow;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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
public final class CashLiteDefaultBankAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashLiteDefaultBankAccount> CREATOR;
    public final String bank_avatar_url;
    public final String clabe_information;
    public final String display_name;

    static {
        CashLiteDefaultBankAccount$Companion$ADAPTER$1 cashLiteDefaultBankAccount$Companion$ADAPTER$1 = new CashLiteDefaultBankAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashLiteDefaultBankAccount.class), "type.googleapis.com/squareup.cash.cashliteflow.CashLiteDefaultBankAccount", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/CashLiteDefaultBankAccount.proto");
        ADAPTER = cashLiteDefaultBankAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashLiteDefaultBankAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashLiteDefaultBankAccount(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_name = str;
        this.clabe_information = str2;
        this.bank_avatar_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashLiteDefaultBankAccount)) {
            return false;
        }
        CashLiteDefaultBankAccount cashLiteDefaultBankAccount = (CashLiteDefaultBankAccount) obj;
        return Intrinsics.areEqual(unknownFields(), cashLiteDefaultBankAccount.unknownFields()) && Intrinsics.areEqual(this.display_name, cashLiteDefaultBankAccount.display_name) && Intrinsics.areEqual(this.clabe_information, cashLiteDefaultBankAccount.clabe_information) && Intrinsics.areEqual(this.bank_avatar_url, cashLiteDefaultBankAccount.bank_avatar_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.clabe_information;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.bank_avatar_url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(13);
        builder.nux_details_img_url = this.display_name;
        builder.nux_activity_img_url = this.clabe_information;
        builder.share_background_img_url = this.bank_avatar_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.display_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
        }
        String str2 = this.clabe_information;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "clabe_information=", arrayList);
        }
        String str3 = this.bank_avatar_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "bank_avatar_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashLiteDefaultBankAccount{", "}", 0, null, null, 56);
    }
}
