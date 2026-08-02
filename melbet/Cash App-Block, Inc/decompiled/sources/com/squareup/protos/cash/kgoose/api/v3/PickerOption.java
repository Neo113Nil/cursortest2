package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0012\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Builder;", "", "value", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon;", "icon", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon;", "subtitle", "Lcom/squareup/protos/common/Money;", "max_amount", "Lcom/squareup/protos/common/Money;", "Companion", "Builder", "Icon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PickerOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PickerOption> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 2)
    public final Icon icon;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString label;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
    public final Money max_amount;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalizedString subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String value;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption;", "<init>", "()V", "value", "", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "icon", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon;", "subtitle", "max_amount", "Lcom/squareup/protos/common/Money;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Icon icon;
        public LocalizedString label;
        public Money max_amount;
        public LocalizedString subtitle;
        public String value;

        @Override // com.squareup.wire.Message.Builder
        public PickerOption build() {
            return new PickerOption(this.value, this.label, this.icon, this.subtitle, this.max_amount, buildUnknownFields());
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder label(LocalizedString label) {
            this.label = label;
            return this;
        }

        public final Builder max_amount(Money max_amount) {
            this.max_amount = max_amount;
            return this;
        }

        public final Builder subtitle(LocalizedString subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder value(String value) {
            this.value = value;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon;", "", "SavingsGoalIcon", "Avatar", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon$SavingsGoalIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Icon {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "avatar", tag = 7)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Avatar extends Icon {
            private final UiAvatar value;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.value = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.value, ((Avatar) obj).value);
            }

            public final UiAvatar getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon#ADAPTER", declaredName = "savings_goal_icon", tag = 6)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon$SavingsGoalIcon;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption$Icon;", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/SavingsGoalIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SavingsGoalIcon extends Icon {
            private final com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon value;

            public SavingsGoalIcon(com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon savingsGoalIcon) {
                savingsGoalIcon.getClass();
                this.value = savingsGoalIcon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SavingsGoalIcon) && Intrinsics.areEqual(this.value, ((SavingsGoalIcon) obj).value);
            }

            public final com.squareup.protos.cash.kgoose.api.v3.SavingsGoalIcon getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SavingsGoalIcon(value=" + this.value + ")";
            }
        }
    }

    static {
        PickerOption$Companion$ADAPTER$1 pickerOption$Companion$ADAPTER$1 = new PickerOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PickerOption.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.PickerOption", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/template_card.proto");
        ADAPTER = pickerOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pickerOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerOption(String str, LocalizedString localizedString, Icon icon, LocalizedString localizedString2, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.value = str;
        this.label = localizedString;
        this.icon = icon;
        this.subtitle = localizedString2;
        this.max_amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PickerOption)) {
            return false;
        }
        PickerOption pickerOption = (PickerOption) obj;
        return Intrinsics.areEqual(unknownFields(), pickerOption.unknownFields()) && Intrinsics.areEqual(this.value, pickerOption.value) && Intrinsics.areEqual(this.label, pickerOption.label) && Intrinsics.areEqual(this.icon, pickerOption.icon) && Intrinsics.areEqual(this.subtitle, pickerOption.subtitle) && Intrinsics.areEqual(this.max_amount, pickerOption.max_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.value;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.label;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        Money money = this.max_amount;
        int hashCode6 = hashCode5 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.value = this.value;
        builder.label = this.label;
        builder.icon = this.icon;
        builder.subtitle = this.subtitle;
        builder.max_amount = this.max_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.value;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "value=", arrayList);
        }
        LocalizedString localizedString = this.label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        Money money = this.max_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("max_amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PickerOption{", "}", 0, null, null, 56);
    }
}
