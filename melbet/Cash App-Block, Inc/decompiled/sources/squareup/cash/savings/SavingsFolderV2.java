package squareup.cash.savings;

import android.os.Parcelable;
import androidx.camera.camera2.pipe.AeMode;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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

/* loaded from: classes10.dex */
public final class SavingsFolderV2 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsFolderV2> CREATOR;
    public final Money balance;
    public final AeMode.Companion folder_type;
    public final String icon_accessibility_text;
    public final String icon_id;
    public final String icon_name;
    public final String icon_unicode;
    public final String owning_customer_token;

    static {
        SavingsFolderV2$Companion$ADAPTER$1 savingsFolderV2$Companion$ADAPTER$1 = new SavingsFolderV2$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsFolderV2.class), "type.googleapis.com/squareup.cash.savings.SavingsFolderV2", Syntax.PROTO_2, null, "squareup/cash/savings/VersionedSavingsFolders.proto");
        ADAPTER = savingsFolderV2$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsFolderV2$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsFolderV2(AeMode.Companion companion, Money money, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.folder_type = companion;
        this.balance = money;
        this.owning_customer_token = str;
        this.icon_unicode = str2;
        this.icon_name = str3;
        this.icon_accessibility_text = str4;
        this.icon_id = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsFolderV2)) {
            return false;
        }
        SavingsFolderV2 savingsFolderV2 = (SavingsFolderV2) obj;
        return Intrinsics.areEqual(unknownFields(), savingsFolderV2.unknownFields()) && Intrinsics.areEqual(this.folder_type, savingsFolderV2.folder_type) && Intrinsics.areEqual(this.balance, savingsFolderV2.balance) && Intrinsics.areEqual(this.owning_customer_token, savingsFolderV2.owning_customer_token) && Intrinsics.areEqual(this.icon_unicode, savingsFolderV2.icon_unicode) && Intrinsics.areEqual(this.icon_name, savingsFolderV2.icon_name) && Intrinsics.areEqual(this.icon_accessibility_text, savingsFolderV2.icon_accessibility_text) && Intrinsics.areEqual(this.icon_id, savingsFolderV2.icon_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AeMode.Companion companion = this.folder_type;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        Money money = this.balance;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.owning_customer_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.icon_unicode;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.icon_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.icon_accessibility_text;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.icon_id;
        int hashCode8 = hashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(27, false);
        builder.f1407type = this.folder_type;
        builder.first_verified_at_ms = this.balance;
        builder.scope = this.owning_customer_token;
        builder.value = this.icon_unicode;
        builder.last_verified_at_ms = this.icon_name;
        builder.created_at = this.icon_accessibility_text;
        builder.updated_at = this.icon_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AeMode.Companion companion = this.folder_type;
        if (companion != null) {
            arrayList.add("folder_type=" + companion);
        }
        Money money = this.balance;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("balance=", money, arrayList);
        }
        String str = this.owning_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "owning_customer_token=", arrayList);
        }
        String str2 = this.icon_unicode;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_unicode=", arrayList);
        }
        String str3 = this.icon_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "icon_name=", arrayList);
        }
        String str4 = this.icon_accessibility_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "icon_accessibility_text=", arrayList);
        }
        String str5 = this.icon_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "icon_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsFolderV2{", "}", 0, null, null, 56);
    }
}
