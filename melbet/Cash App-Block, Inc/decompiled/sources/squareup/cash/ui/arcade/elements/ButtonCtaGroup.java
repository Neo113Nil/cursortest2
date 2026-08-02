package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class ButtonCtaGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonCtaGroup> CREATOR;
    public final Direction direction;
    public final LocalizedString disclaimer_text;
    public final ButtonDefault primary_button;
    public final ButtonDefault secondary_button;
    public final Boolean show_hairline;
    public final ButtonDefault tertiary_button;

    static {
        ButtonCtaGroup$Companion$ADAPTER$1 buttonCtaGroup$Companion$ADAPTER$1 = new ButtonCtaGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonCtaGroup.class), "type.googleapis.com/squareup.cash.ui.arcade.elements.ButtonCtaGroup", Syntax.PROTO_2, null, "squareup/cash/ui/arcade/elements/ButtonCtaGroup.proto");
        ADAPTER = buttonCtaGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonCtaGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonCtaGroup(ButtonDefault buttonDefault, ButtonDefault buttonDefault2, ButtonDefault buttonDefault3, Direction direction, LocalizedString localizedString, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_button = buttonDefault;
        this.secondary_button = buttonDefault2;
        this.tertiary_button = buttonDefault3;
        this.direction = direction;
        this.disclaimer_text = localizedString;
        this.show_hairline = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonCtaGroup)) {
            return false;
        }
        ButtonCtaGroup buttonCtaGroup = (ButtonCtaGroup) obj;
        return Intrinsics.areEqual(unknownFields(), buttonCtaGroup.unknownFields()) && Intrinsics.areEqual(this.primary_button, buttonCtaGroup.primary_button) && Intrinsics.areEqual(this.secondary_button, buttonCtaGroup.secondary_button) && Intrinsics.areEqual(this.tertiary_button, buttonCtaGroup.tertiary_button) && this.direction == buttonCtaGroup.direction && Intrinsics.areEqual(this.disclaimer_text, buttonCtaGroup.disclaimer_text) && Intrinsics.areEqual(this.show_hairline, buttonCtaGroup.show_hairline);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonDefault buttonDefault = this.primary_button;
        int hashCode2 = (hashCode + (buttonDefault != null ? buttonDefault.hashCode() : 0)) * 37;
        ButtonDefault buttonDefault2 = this.secondary_button;
        int hashCode3 = (hashCode2 + (buttonDefault2 != null ? buttonDefault2.hashCode() : 0)) * 37;
        ButtonDefault buttonDefault3 = this.tertiary_button;
        int hashCode4 = (hashCode3 + (buttonDefault3 != null ? buttonDefault3.hashCode() : 0)) * 37;
        Direction direction = this.direction;
        int hashCode5 = (hashCode4 + (direction != null ? direction.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.disclaimer_text;
        int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Boolean bool = this.show_hairline;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(15);
        builder.navigate = this.primary_button;
        builder.set_view_state_value = this.secondary_button;
        builder.open_url = this.tertiary_button;
        builder.compound_action = this.direction;
        builder.submit = this.disclaimer_text;
        builder.collection_mutation = this.show_hairline;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonDefault buttonDefault = this.primary_button;
        if (buttonDefault != null) {
            arrayList.add("primary_button=" + buttonDefault);
        }
        ButtonDefault buttonDefault2 = this.secondary_button;
        if (buttonDefault2 != null) {
            arrayList.add("secondary_button=" + buttonDefault2);
        }
        ButtonDefault buttonDefault3 = this.tertiary_button;
        if (buttonDefault3 != null) {
            arrayList.add("tertiary_button=" + buttonDefault3);
        }
        Direction direction = this.direction;
        if (direction != null) {
            arrayList.add("direction=" + direction);
        }
        LocalizedString localizedString = this.disclaimer_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("disclaimer_text=", localizedString, arrayList);
        }
        Boolean bool = this.show_hairline;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_hairline=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonCtaGroup{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"squareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction", "Lcom/squareup/wire/WireEnum;", "", "Lsquareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "CLIENT_COULD_NOT_PARSE_DIRECTION", "HORIZONTAL", "VERTICAL", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Direction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Direction CLIENT_COULD_NOT_PARSE_DIRECTION;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Direction HORIZONTAL;
        public static final Direction VERTICAL;
        private final int value;

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CLIENT_COULD_NOT_PARSE_DIRECTION, HORIZONTAL, VERTICAL};
        }

        static {
            final Direction direction = new Direction("CLIENT_COULD_NOT_PARSE_DIRECTION", 0, 0);
            CLIENT_COULD_NOT_PARSE_DIRECTION = direction;
            HORIZONTAL = new Direction("HORIZONTAL", 1, 1);
            VERTICAL = new Direction("VERTICAL", 2, 2);
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Direction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, direction) { // from class: squareup.cash.ui.arcade.elements.ButtonCtaGroup$Direction$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public ButtonCtaGroup.Direction fromValue(int value) {
                    return ButtonCtaGroup.Direction.INSTANCE.fromValue(value);
                }
            };
        }

        private Direction(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Direction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Direction fromValue(int value) {
                if (value == 0) {
                    return Direction.CLIENT_COULD_NOT_PARSE_DIRECTION;
                }
                if (value == 1) {
                    return Direction.HORIZONTAL;
                }
                if (value != 2) {
                    return null;
                }
                return Direction.VERTICAL;
            }

            private Companion() {
            }
        }
    }
}
