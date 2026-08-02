package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
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
public final class ReactionConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReactionConfig> CREATOR;
    public final List extended_picker_reactions;
    public final Integer max_emoji_per_reaction;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List extended_picker_reactions;
        public Integer max_emoji_per_reaction;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ReactionConfig(this.max_emoji_per_reaction, this.extended_picker_reactions, buildUnknownFields());
                default:
                    return new HoldingsDetails(this.max_emoji_per_reaction, this.extended_picker_reactions, buildUnknownFields());
            }
        }
    }

    static {
        ReactionConfig$Companion$ADAPTER$1 reactionConfig$Companion$ADAPTER$1 = new ReactionConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ReactionConfig.class), "type.googleapis.com/squareup.franklin.app.ReactionConfig", Syntax.PROTO_2, null, "squareup/franklin/app/reaction_config.proto");
        ADAPTER = reactionConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(reactionConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionConfig(Integer num, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.max_emoji_per_reaction = num;
        this.extended_picker_reactions = TransactorKt.immutableCopyOf("extended_picker_reactions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReactionConfig)) {
            return false;
        }
        ReactionConfig reactionConfig = (ReactionConfig) obj;
        return Intrinsics.areEqual(unknownFields(), reactionConfig.unknownFields()) && Intrinsics.areEqual(this.max_emoji_per_reaction, reactionConfig.max_emoji_per_reaction) && Intrinsics.areEqual(this.extended_picker_reactions, reactionConfig.extended_picker_reactions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.max_emoji_per_reaction;
        int hashCode2 = this.extended_picker_reactions.hashCode() + ((hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.max_emoji_per_reaction = this.max_emoji_per_reaction;
        builder.extended_picker_reactions = this.extended_picker_reactions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.max_emoji_per_reaction;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_emoji_per_reaction=", num, arrayList);
        }
        List list = this.extended_picker_reactions;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("extended_picker_reactions=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReactionConfig{", "}", 0, null, null, 56);
    }
}
