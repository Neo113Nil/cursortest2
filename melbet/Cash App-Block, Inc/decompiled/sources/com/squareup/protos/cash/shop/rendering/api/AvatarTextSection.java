package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarTextSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarTextSection> CREATOR;
    public final List avatars;
    public final LocalizedString subtitle;
    public final TapAction tap_action;
    public final LocalizedString title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List avatars;
        public LocalizedString subtitle;
        public TapAction tap_action;
        public LocalizedString title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AvatarTextSection(this.avatars, this.title, this.subtitle, this.tap_action, buildUnknownFields());
                default:
                    return new AppletCardSection.AvatarTextFooter(this.avatars, this.title, this.subtitle, this.tap_action, buildUnknownFields());
            }
        }
    }

    static {
        AvatarTextSection$Companion$ADAPTER$1 avatarTextSection$Companion$ADAPTER$1 = new AvatarTextSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarTextSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AvatarTextSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/AvatarTextSection.proto");
        ADAPTER = avatarTextSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarTextSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarTextSection(List list, LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.tap_action = tapAction;
        this.avatars = TransactorKt.immutableCopyOf("avatars", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarTextSection)) {
            return false;
        }
        AvatarTextSection avatarTextSection = (AvatarTextSection) obj;
        return Intrinsics.areEqual(unknownFields(), avatarTextSection.unknownFields()) && Intrinsics.areEqual(this.avatars, avatarTextSection.avatars) && Intrinsics.areEqual(this.title, avatarTextSection.title) && Intrinsics.areEqual(this.subtitle, avatarTextSection.subtitle) && Intrinsics.areEqual(this.tap_action, avatarTextSection.tap_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.avatars);
        LocalizedString localizedString = this.title;
        int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode2 = (hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode3 = hashCode2 + (tapAction != null ? tapAction.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.avatars = this.avatars;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.tap_action = this.tap_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.avatars;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("avatars=", arrayList, list);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarTextSection{", "}", 0, null, null, 56);
    }

    public AvatarTextSection(List list, LocalizedString localizedString, LocalizedString localizedString2, TapAction tapAction) {
        this(list, localizedString, localizedString2, tapAction, ByteString.EMPTY);
    }
}
