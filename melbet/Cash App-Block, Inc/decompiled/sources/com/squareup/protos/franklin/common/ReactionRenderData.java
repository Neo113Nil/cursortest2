package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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

/* loaded from: classes8.dex */
public final class ReactionRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReactionRenderData> CREATOR;
    public final List available_reactions;
    public final Long can_add_reactions_until;
    public final List existing_reactions;
    public final Boolean show_extended_picker;

    static {
        ReactionRenderData$Companion$ADAPTER$1 reactionRenderData$Companion$ADAPTER$1 = new ReactionRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReactionRenderData.class), "type.googleapis.com/squareup.franklin.ReactionRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = reactionRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(reactionRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionRenderData(List list, List list2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.can_add_reactions_until = l;
        this.show_extended_picker = bool;
        this.existing_reactions = TransactorKt.immutableCopyOf("existing_reactions", list);
        this.available_reactions = TransactorKt.immutableCopyOf("available_reactions", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReactionRenderData)) {
            return false;
        }
        ReactionRenderData reactionRenderData = (ReactionRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), reactionRenderData.unknownFields()) && Intrinsics.areEqual(this.existing_reactions, reactionRenderData.existing_reactions) && Intrinsics.areEqual(this.available_reactions, reactionRenderData.available_reactions) && Intrinsics.areEqual(this.can_add_reactions_until, reactionRenderData.can_add_reactions_until) && Intrinsics.areEqual(this.show_extended_picker, reactionRenderData.show_extended_picker);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.existing_reactions), 37, this.available_reactions);
        Long l = this.can_add_reactions_until;
        int hashCode = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.show_extended_picker;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(26);
        builder.button_color = this.existing_reactions;
        builder.text_color = this.available_reactions;
        builder.text = this.can_add_reactions_until;
        builder.action = this.show_extended_picker;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.existing_reactions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("existing_reactions=", arrayList, list);
        }
        List list2 = this.available_reactions;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_reactions=", arrayList, list2);
        }
        Long l = this.can_add_reactions_until;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_add_reactions_until=", l, arrayList);
        }
        Boolean bool = this.show_extended_picker;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_extended_picker=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReactionRenderData{", "}", 0, null, null, 56);
    }
}
