package com.squareup.protos.franklin.loyalty;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes.dex */
public final class ProgramRewards extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProgramRewards> CREATOR;
    public final List points_rewards;

    static {
        ProgramRewards$Companion$ADAPTER$1 programRewards$Companion$ADAPTER$1 = new ProgramRewards$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgramRewards.class), "type.googleapis.com/squareup.franklin.loyalty.ProgramRewards", Syntax.PROTO_2, null, "squareup/franklin/loyalty.proto");
        ADAPTER = programRewards$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(programRewards$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramRewards(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.points_rewards = TransactorKt.immutableCopyOf("points_rewards", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProgramRewards)) {
            return false;
        }
        ProgramRewards programRewards = (ProgramRewards) obj;
        return Intrinsics.areEqual(unknownFields(), programRewards.unknownFields()) && Intrinsics.areEqual(this.points_rewards, programRewards.points_rewards);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.points_rewards.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(4);
        builder.items = this.points_rewards;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.points_rewards;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("points_rewards=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProgramRewards{", "}", 0, null, null, 56);
    }
}
