package com.squareup.protos.cash.p2p.profile_directory.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.discover.api.app.v1.model.Avatar;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
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

/* loaded from: classes7.dex */
public final class Avatar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Avatar> CREATOR;
    public final String action_url;
    public final Color background_color;
    public final Boolean colorize_avatar;
    public final Image icon;
    public final Initials initials;
    public final Image picture;

    public final class Initials extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Initials> CREATOR;
        public final Color background_color;
        public final String initials;
        public final Color text_color;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Color background_color;
            public String initials;
            public Color text_color;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Initials(this.initials, this.text_color, this.background_color, buildUnknownFields());
                    default:
                        return new Avatar.Initials(this.initials, this.text_color, this.background_color, buildUnknownFields());
                }
            }
        }

        static {
            Avatar$Initials$Companion$ADAPTER$1 avatar$Initials$Companion$ADAPTER$1 = new Avatar$Initials$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Initials.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.Avatar.Initials", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
            ADAPTER = avatar$Initials$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(avatar$Initials$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initials(String str, Color color, Color color2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.initials = str;
            this.text_color = color;
            this.background_color = color2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Initials)) {
                return false;
            }
            Initials initials = (Initials) obj;
            return Intrinsics.areEqual(unknownFields(), initials.unknownFields()) && Intrinsics.areEqual(this.initials, initials.initials) && Intrinsics.areEqual(this.text_color, initials.text_color) && Intrinsics.areEqual(this.background_color, initials.background_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.initials;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Color color = this.text_color;
            int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
            Color color2 = this.background_color;
            int hashCode4 = hashCode3 + (color2 != null ? color2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.initials = this.initials;
            builder.text_color = this.text_color;
            builder.background_color = this.background_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.initials != null) {
                arrayList.add("initials=██");
            }
            Color color = this.text_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
            }
            Color color2 = this.background_color;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Initials{", "}", 0, null, null, 56);
        }
    }

    static {
        Avatar$Companion$ADAPTER$1 avatar$Companion$ADAPTER$1 = new Avatar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Avatar.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.Avatar", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
        ADAPTER = avatar$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatar$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Avatar(Initials initials, Image image, Image image2, String str, Boolean bool, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.initials = initials;
        this.picture = image;
        this.icon = image2;
        this.action_url = str;
        this.colorize_avatar = bool;
        this.background_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(unknownFields(), avatar.unknownFields()) && Intrinsics.areEqual(this.initials, avatar.initials) && Intrinsics.areEqual(this.picture, avatar.picture) && Intrinsics.areEqual(this.icon, avatar.icon) && Intrinsics.areEqual(this.action_url, avatar.action_url) && Intrinsics.areEqual(this.colorize_avatar, avatar.colorize_avatar) && Intrinsics.areEqual(this.background_color, avatar.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Initials initials = this.initials;
        int hashCode2 = (hashCode + (initials != null ? initials.hashCode() : 0)) * 37;
        Image image = this.picture;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
        Image image2 = this.icon;
        int hashCode4 = (hashCode3 + (image2 != null ? image2.hashCode() : 0)) * 37;
        String str = this.action_url;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.colorize_avatar;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Color color = this.background_color;
        int hashCode7 = hashCode6 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(20);
        builder.requester = this.initials;
        builder.responder = this.picture;
        builder.amount = this.icon;
        builder.slice_token = this.action_url;
        builder.status = this.colorize_avatar;
        builder.action = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Initials initials = this.initials;
        if (initials != null) {
            arrayList.add("initials=" + initials);
        }
        Image image = this.picture;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
        }
        Image image2 = this.icon;
        if (image2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image2, arrayList);
        }
        if (this.action_url != null) {
            arrayList.add("action_url=██");
        }
        Boolean bool = this.colorize_avatar;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("colorize_avatar=", bool, arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Avatar{", "}", 0, null, null, 56);
    }
}
