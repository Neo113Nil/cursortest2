package squareup.cash.savings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class SavingsScreens extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsScreens> CREATOR;
    public final SavingsScreen general_savings_details;
    public final LocalizedString general_savings_details_title;
    public final SavingsScreen goal_details;
    public final SavingsScreen home;
    public final Boolean home_binds_to_inferred_folder_from_single_goal_rules;
    public final LocalizedString home_title;

    static {
        SavingsScreens$Companion$ADAPTER$1 savingsScreens$Companion$ADAPTER$1 = new SavingsScreens$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsScreens.class), "type.googleapis.com/squareup.cash.savings.SavingsScreens", Syntax.PROTO_2, null, "squareup/cash/savings/VersionedSavingsScreens.proto");
        ADAPTER = savingsScreens$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsScreens$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsScreens(SavingsScreen savingsScreen, LocalizedString localizedString, SavingsScreen savingsScreen2, SavingsScreen savingsScreen3, LocalizedString localizedString2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.home = savingsScreen;
        this.home_title = localizedString;
        this.goal_details = savingsScreen2;
        this.general_savings_details = savingsScreen3;
        this.general_savings_details_title = localizedString2;
        this.home_binds_to_inferred_folder_from_single_goal_rules = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsScreens)) {
            return false;
        }
        SavingsScreens savingsScreens = (SavingsScreens) obj;
        return Intrinsics.areEqual(unknownFields(), savingsScreens.unknownFields()) && Intrinsics.areEqual(this.home, savingsScreens.home) && Intrinsics.areEqual(this.home_title, savingsScreens.home_title) && Intrinsics.areEqual(this.goal_details, savingsScreens.goal_details) && Intrinsics.areEqual(this.general_savings_details, savingsScreens.general_savings_details) && Intrinsics.areEqual(this.general_savings_details_title, savingsScreens.general_savings_details_title) && Intrinsics.areEqual(this.home_binds_to_inferred_folder_from_single_goal_rules, savingsScreens.home_binds_to_inferred_folder_from_single_goal_rules);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsScreen savingsScreen = this.home;
        int hashCode2 = (hashCode + (savingsScreen != null ? savingsScreen.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.home_title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        SavingsScreen savingsScreen2 = this.goal_details;
        int hashCode4 = (hashCode3 + (savingsScreen2 != null ? savingsScreen2.hashCode() : 0)) * 37;
        SavingsScreen savingsScreen3 = this.general_savings_details;
        int hashCode5 = (hashCode4 + (savingsScreen3 != null ? savingsScreen3.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.general_savings_details_title;
        int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Boolean bool = this.home_binds_to_inferred_folder_from_single_goal_rules;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(11);
        builder.navigate = this.home;
        builder.set_view_state_value = this.home_title;
        builder.open_url = this.goal_details;
        builder.compound_action = this.general_savings_details;
        builder.submit = this.general_savings_details_title;
        builder.collection_mutation = this.home_binds_to_inferred_folder_from_single_goal_rules;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SavingsScreen savingsScreen = this.home;
        if (savingsScreen != null) {
            arrayList.add("home=" + savingsScreen);
        }
        LocalizedString localizedString = this.home_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("home_title=", localizedString, arrayList);
        }
        SavingsScreen savingsScreen2 = this.goal_details;
        if (savingsScreen2 != null) {
            arrayList.add("goal_details=" + savingsScreen2);
        }
        SavingsScreen savingsScreen3 = this.general_savings_details;
        if (savingsScreen3 != null) {
            arrayList.add("general_savings_details=" + savingsScreen3);
        }
        LocalizedString localizedString2 = this.general_savings_details_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("general_savings_details_title=", localizedString2, arrayList);
        }
        Boolean bool = this.home_binds_to_inferred_folder_from_single_goal_rules;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("home_binds_to_inferred_folder_from_single_goal_rules=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsScreens{", "}", 0, null, null, 56);
    }
}
