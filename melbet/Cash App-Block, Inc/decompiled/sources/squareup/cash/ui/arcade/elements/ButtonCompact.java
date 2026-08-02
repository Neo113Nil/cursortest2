package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
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
import squareup.cash.paychecks.Deduction;

/* loaded from: classes10.dex */
public final class ButtonCompact extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonCompact> CREATOR;
    public final ButtonProminence button_prominence;
    public final Icon icon;
    public final Boolean is_destructive;
    public final LocalizedString text;

    static {
        ButtonCompact$Companion$ADAPTER$1 buttonCompact$Companion$ADAPTER$1 = new ButtonCompact$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonCompact.class), "type.googleapis.com/squareup.cash.ui.arcade.elements.ButtonCompact", Syntax.PROTO_2, null, "squareup/cash/ui/arcade/elements/ButtonCompact.proto");
        ADAPTER = buttonCompact$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonCompact$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonCompact(ButtonProminence buttonProminence, Boolean bool, LocalizedString localizedString, Icon icon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button_prominence = buttonProminence;
        this.is_destructive = bool;
        this.text = localizedString;
        this.icon = icon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonCompact)) {
            return false;
        }
        ButtonCompact buttonCompact = (ButtonCompact) obj;
        return Intrinsics.areEqual(unknownFields(), buttonCompact.unknownFields()) && this.button_prominence == buttonCompact.button_prominence && Intrinsics.areEqual(this.is_destructive, buttonCompact.is_destructive) && Intrinsics.areEqual(this.text, buttonCompact.text) && Intrinsics.areEqual(this.icon, buttonCompact.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonProminence buttonProminence = this.button_prominence;
        int hashCode2 = (hashCode + (buttonProminence != null ? buttonProminence.hashCode() : 0)) * 37;
        Boolean bool = this.is_destructive;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalizedString localizedString = this.text;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode5 = hashCode4 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(25);
        builder.amount = this.button_prominence;
        builder.note = this.is_destructive;
        builder.description = this.text;
        builder.tint_color = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonProminence buttonProminence = this.button_prominence;
        if (buttonProminence != null) {
            arrayList.add("button_prominence=" + buttonProminence);
        }
        Boolean bool = this.is_destructive;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_destructive=", bool, arrayList);
        }
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonCompact{", "}", 0, null, null, 56);
    }
}
