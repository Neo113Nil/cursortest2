package com.squareup.protos.cash.cryptoinvestflow.service;

import android.os.Parcelable;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class UserInteractionContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserInteractionContext> CREATOR;
    public final Applet applet;
    public final UserInteractionSide user_interaction_side;

    public enum Applet implements WireEnum {
        XUS(1),
        BTC(2);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final UserInteractionContext$Applet$Companion$ADAPTER$1 ADAPTER = new UserInteractionContext$Applet$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Applet.class), Syntax.PROTO_2, null);

        Applet(int i) {
            this.value = i;
        }

        public static final Applet fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return XUS;
            }
            if (i != 2) {
                return null;
            }
            return BTC;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum UserInteractionSide implements WireEnum {
        BUY(1),
        SELL(2);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final UserInteractionContext$UserInteractionSide$Companion$ADAPTER$1 ADAPTER = new UserInteractionContext$UserInteractionSide$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UserInteractionSide.class), Syntax.PROTO_2, null);

        UserInteractionSide(int i) {
            this.value = i;
        }

        public static final UserInteractionSide fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BUY;
            }
            if (i != 2) {
                return null;
            }
            return SELL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        UserInteractionContext$Companion$ADAPTER$1 userInteractionContext$Companion$ADAPTER$1 = new UserInteractionContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UserInteractionContext.class), "type.googleapis.com/squareup.cash.cryptoinvestflow.service.UserInteractionContext", Syntax.PROTO_2, null, "squareup/cash/cryptoinvestflow/service/exchange.proto");
        ADAPTER = userInteractionContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(userInteractionContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInteractionContext(UserInteractionSide userInteractionSide, Applet applet, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.user_interaction_side = userInteractionSide;
        this.applet = applet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserInteractionContext)) {
            return false;
        }
        UserInteractionContext userInteractionContext = (UserInteractionContext) obj;
        return Intrinsics.areEqual(unknownFields(), userInteractionContext.unknownFields()) && this.user_interaction_side == userInteractionContext.user_interaction_side && this.applet == userInteractionContext.applet;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UserInteractionSide userInteractionSide = this.user_interaction_side;
        int hashCode2 = (hashCode + (userInteractionSide != null ? userInteractionSide.hashCode() : 0)) * 37;
        Applet applet = this.applet;
        int hashCode3 = hashCode2 + (applet != null ? applet.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(3);
        builder.f1268type = this.user_interaction_side;
        builder.details = this.applet;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UserInteractionSide userInteractionSide = this.user_interaction_side;
        if (userInteractionSide != null) {
            arrayList.add("user_interaction_side=" + userInteractionSide);
        }
        Applet applet = this.applet;
        if (applet != null) {
            arrayList.add("applet=" + applet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserInteractionContext{", "}", 0, null, null, 56);
    }

    public /* synthetic */ UserInteractionContext(Applet applet) {
        this(null, applet, ByteString.EMPTY);
    }
}
