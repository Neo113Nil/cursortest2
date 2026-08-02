package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.janus.api.ContactAlias;
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

/* loaded from: classes7.dex */
public final class ArcadeButtonElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ArcadeButtonElement> CREATOR;
    public final Action action;
    public final Alignment alignment;
    public final Boolean destructive;
    public final Prominence prominence;
    public final Size size;
    public final State state;
    public final String text;

    public enum Prominence implements WireEnum {
        PROMINENT(1),
        STANDARD(2),
        SUBTLE(3);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
        public static final ArcadeButtonElement$Prominence$Companion$ADAPTER$1 ADAPTER = new ArcadeButtonElement$Prominence$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Prominence.class), Syntax.PROTO_2, null);

        Prominence(int i) {
            this.value = i;
        }

        public static final Prominence fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PROMINENT;
            }
            if (i == 2) {
                return STANDARD;
            }
            if (i != 3) {
                return null;
            }
            return SUBTLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Size implements WireEnum {
        DEFAULT_ARCADE(1),
        CTA(2),
        COMPACT(3);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final ArcadeButtonElement$Size$Companion$ADAPTER$1 ADAPTER = new ArcadeButtonElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DEFAULT_ARCADE;
            }
            if (i == 2) {
                return CTA;
            }
            if (i != 3) {
                return null;
            }
            return COMPACT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum State implements WireEnum {
        DEFAULT(1),
        PRESSED(2),
        DISABLED(3);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final ArcadeButtonElement$State$Companion$ADAPTER$1 ADAPTER = new ArcadeButtonElement$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, null);

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return PRESSED;
            }
            if (i != 3) {
                return null;
            }
            return DISABLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ArcadeButtonElement$Companion$ADAPTER$1 arcadeButtonElement$Companion$ADAPTER$1 = new ArcadeButtonElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ArcadeButtonElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ArcadeButtonElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = arcadeButtonElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeButtonElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeButtonElement(String str, Action action, State state, Size size, Prominence prominence, Boolean bool, Alignment alignment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.action = action;
        this.state = state;
        this.size = size;
        this.prominence = prominence;
        this.destructive = bool;
        this.alignment = alignment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArcadeButtonElement)) {
            return false;
        }
        ArcadeButtonElement arcadeButtonElement = (ArcadeButtonElement) obj;
        return Intrinsics.areEqual(unknownFields(), arcadeButtonElement.unknownFields()) && Intrinsics.areEqual(this.text, arcadeButtonElement.text) && Intrinsics.areEqual(this.action, arcadeButtonElement.action) && this.state == arcadeButtonElement.state && this.size == arcadeButtonElement.size && this.prominence == arcadeButtonElement.prominence && Intrinsics.areEqual(this.destructive, arcadeButtonElement.destructive) && this.alignment == arcadeButtonElement.alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = (hashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode4 = (hashCode3 + (state != null ? state.hashCode() : 0)) * 37;
        Size size = this.size;
        int hashCode5 = (hashCode4 + (size != null ? size.hashCode() : 0)) * 37;
        Prominence prominence = this.prominence;
        int hashCode6 = (hashCode5 + (prominence != null ? prominence.hashCode() : 0)) * 37;
        Boolean bool = this.destructive;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode8 = hashCode7 + (alignment != null ? alignment.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(25, false);
        builder.customer_token = this.text;
        builder.alias_value = this.action;
        builder.hashed_alias_token = this.state;
        builder.alias_type = this.size;
        builder.updated_at = this.prominence;
        builder.linked_at = this.destructive;
        builder.version = this.alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        Prominence prominence = this.prominence;
        if (prominence != null) {
            arrayList.add("prominence=" + prominence);
        }
        Boolean bool = this.destructive;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("destructive=", bool, arrayList);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArcadeButtonElement{", "}", 0, null, null, 56);
    }
}
