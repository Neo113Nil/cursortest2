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
import squareup.cash.savings.action.SavingsAction;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class SavingsApplet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsApplet> CREATOR;
    public final SavingsCustomerActiveState active_state;
    public final SavingsAction override_action;
    public final LocalizedString override_subtitle;
    public final LocalizedString override_title;
    public final Boolean visible;

    static {
        SavingsApplet$Companion$ADAPTER$1 savingsApplet$Companion$ADAPTER$1 = new SavingsApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsApplet.class), "type.googleapis.com/squareup.cash.savings.SavingsApplet", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsApplet.proto");
        ADAPTER = savingsApplet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsApplet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsApplet(Boolean bool, SavingsCustomerActiveState savingsCustomerActiveState, SavingsAction savingsAction, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.visible = bool;
        this.active_state = savingsCustomerActiveState;
        this.override_action = savingsAction;
        this.override_title = localizedString;
        this.override_subtitle = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsApplet)) {
            return false;
        }
        SavingsApplet savingsApplet = (SavingsApplet) obj;
        return Intrinsics.areEqual(unknownFields(), savingsApplet.unknownFields()) && Intrinsics.areEqual(this.visible, savingsApplet.visible) && this.active_state == savingsApplet.active_state && Intrinsics.areEqual(this.override_action, savingsApplet.override_action) && Intrinsics.areEqual(this.override_title, savingsApplet.override_title) && Intrinsics.areEqual(this.override_subtitle, savingsApplet.override_subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.visible;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        SavingsCustomerActiveState savingsCustomerActiveState = this.active_state;
        int hashCode3 = (hashCode2 + (savingsCustomerActiveState != null ? savingsCustomerActiveState.hashCode() : 0)) * 37;
        SavingsAction savingsAction = this.override_action;
        int hashCode4 = (hashCode3 + (savingsAction != null ? savingsAction.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.override_title;
        int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.override_subtitle;
        int hashCode6 = hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(22);
        builder.key_path = this.visible;
        builder.get_transform = this.active_state;
        builder.set_transform = this.override_action;
        builder.validation = this.override_title;
        builder.on_invalid = this.override_subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.visible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("visible=", bool, arrayList);
        }
        SavingsCustomerActiveState savingsCustomerActiveState = this.active_state;
        if (savingsCustomerActiveState != null) {
            arrayList.add("active_state=" + savingsCustomerActiveState);
        }
        SavingsAction savingsAction = this.override_action;
        if (savingsAction != null) {
            arrayList.add("override_action=" + savingsAction);
        }
        LocalizedString localizedString = this.override_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("override_title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.override_subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("override_subtitle=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsApplet{", "}", 0, null, null, 56);
    }
}
