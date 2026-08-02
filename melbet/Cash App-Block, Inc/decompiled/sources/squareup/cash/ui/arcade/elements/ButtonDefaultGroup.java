package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.Deduction;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class ButtonDefaultGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonDefaultGroup> CREATOR;
    public final Direction direction;
    public final ButtonDefault primary_button;
    public final ButtonDefault secondary_button;
    public final ButtonDefault tertiary_button;

    public enum Direction implements WireEnum {
        CLIENT_COULD_NOT_PARSE_DIRECTION(0),
        HORIZONTAL(1),
        VERTICAL(2);

        public static final ButtonDefaultGroup$Direction$Companion$ADAPTER$1 ADAPTER;
        public static final Navigate.MatchStrategy.Companion Companion;
        public final int value;

        static {
            Direction direction = CLIENT_COULD_NOT_PARSE_DIRECTION;
            Companion = new Navigate.MatchStrategy.Companion();
            ADAPTER = new ButtonDefaultGroup$Direction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Direction.class), Syntax.PROTO_2, direction);
        }

        Direction(int i) {
            this.value = i;
        }

        public static final Direction fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CLIENT_COULD_NOT_PARSE_DIRECTION;
            }
            if (i == 1) {
                return HORIZONTAL;
            }
            if (i != 2) {
                return null;
            }
            return VERTICAL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ButtonDefaultGroup$Companion$ADAPTER$1 buttonDefaultGroup$Companion$ADAPTER$1 = new ButtonDefaultGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonDefaultGroup.class), "type.googleapis.com/squareup.cash.ui.arcade.elements.ButtonDefaultGroup", Syntax.PROTO_2, null, "squareup/cash/ui/arcade/elements/ButtonDefaultGroup.proto");
        ADAPTER = buttonDefaultGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonDefaultGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonDefaultGroup(ButtonDefault buttonDefault, ButtonDefault buttonDefault2, ButtonDefault buttonDefault3, Direction direction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_button = buttonDefault;
        this.secondary_button = buttonDefault2;
        this.tertiary_button = buttonDefault3;
        this.direction = direction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonDefaultGroup)) {
            return false;
        }
        ButtonDefaultGroup buttonDefaultGroup = (ButtonDefaultGroup) obj;
        return Intrinsics.areEqual(unknownFields(), buttonDefaultGroup.unknownFields()) && Intrinsics.areEqual(this.primary_button, buttonDefaultGroup.primary_button) && Intrinsics.areEqual(this.secondary_button, buttonDefaultGroup.secondary_button) && Intrinsics.areEqual(this.tertiary_button, buttonDefaultGroup.tertiary_button) && this.direction == buttonDefaultGroup.direction;
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
        int hashCode5 = hashCode4 + (direction != null ? direction.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(26);
        builder.amount = this.primary_button;
        builder.description = this.secondary_button;
        builder.note = this.tertiary_button;
        builder.tint_color = this.direction;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonDefaultGroup{", "}", 0, null, null, 56);
    }
}
