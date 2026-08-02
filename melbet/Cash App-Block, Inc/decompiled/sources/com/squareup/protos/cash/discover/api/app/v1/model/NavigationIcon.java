package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.BackgroundColor;
import com.squareup.protos.cash.ui.Color;
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
public final class NavigationIcon extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NavigationIcon> CREATOR;
    public final Color color;

    static {
        NavigationIcon$Companion$ADAPTER$1 navigationIcon$Companion$ADAPTER$1 = new NavigationIcon$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NavigationIcon.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.NavigationIcon", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/details_page.proto");
        ADAPTER = navigationIcon$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(navigationIcon$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationIcon(Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NavigationIcon)) {
            return false;
        }
        NavigationIcon navigationIcon = (NavigationIcon) obj;
        return Intrinsics.areEqual(unknownFields(), navigationIcon.unknownFields()) && Intrinsics.areEqual(this.color, navigationIcon.color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.color;
        int hashCode2 = hashCode + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BackgroundColor.Builder builder = new BackgroundColor.Builder(1);
        builder.color = this.color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationIcon{", "}", 0, null, null, 56);
    }
}
