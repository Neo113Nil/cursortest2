package com.squareup.protos.rewardly.ui;

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
public final class UiRewardAvatars extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiRewardAvatars> CREATOR;
    public final List reward_avatars;

    static {
        UiRewardAvatars$Companion$ADAPTER$1 uiRewardAvatars$Companion$ADAPTER$1 = new UiRewardAvatars$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiRewardAvatars.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardAvatars", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiRewardAvatars$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardAvatars$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiRewardAvatars(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.reward_avatars = TransactorKt.immutableCopyOf("reward_avatars", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiRewardAvatars)) {
            return false;
        }
        UiRewardAvatars uiRewardAvatars = (UiRewardAvatars) obj;
        return Intrinsics.areEqual(unknownFields(), uiRewardAvatars.unknownFields()) && Intrinsics.areEqual(this.reward_avatars, uiRewardAvatars.reward_avatars);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.reward_avatars.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(16);
        builder.items = this.reward_avatars;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.reward_avatars;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("reward_avatars=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiRewardAvatars{", "}", 0, null, null, 56);
    }
}
