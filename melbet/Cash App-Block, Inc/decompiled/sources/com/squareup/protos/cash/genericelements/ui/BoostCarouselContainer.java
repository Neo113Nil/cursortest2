package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.GetRewardsResponse;
import com.squareup.protos.franklin.common.RewardsData;
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
public final class BoostCarouselContainer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BoostCarouselContainer> CREATOR;
    public final RewardsData rewards_data;

    static {
        BoostCarouselContainer$Companion$ADAPTER$1 boostCarouselContainer$Companion$ADAPTER$1 = new BoostCarouselContainer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BoostCarouselContainer.class), "type.googleapis.com/squareup.cash.genericelements.ui.BoostCarouselContainer", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = boostCarouselContainer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(boostCarouselContainer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostCarouselContainer(RewardsData rewardsData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rewards_data = rewardsData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostCarouselContainer)) {
            return false;
        }
        BoostCarouselContainer boostCarouselContainer = (BoostCarouselContainer) obj;
        return Intrinsics.areEqual(unknownFields(), boostCarouselContainer.unknownFields()) && Intrinsics.areEqual(this.rewards_data, boostCarouselContainer.rewards_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RewardsData rewardsData = this.rewards_data;
        int hashCode2 = hashCode + (rewardsData != null ? rewardsData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetRewardsResponse.Builder builder = new GetRewardsResponse.Builder(2);
        builder.rewards_data = this.rewards_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RewardsData rewardsData = this.rewards_data;
        if (rewardsData != null) {
            arrayList.add("rewards_data=" + rewardsData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BoostCarouselContainer{", "}", 0, null, null, 56);
    }
}
