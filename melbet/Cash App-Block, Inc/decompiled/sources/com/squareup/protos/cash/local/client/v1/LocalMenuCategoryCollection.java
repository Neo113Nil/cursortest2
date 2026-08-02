package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuCategoryCollection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuCategoryCollection> CREATOR;
    public final List category_tokens;
    public final LocalMenuHours menu_hours;
    public final String name;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1312type;

    public enum Type implements WireEnum {
        TYPE_UNSPECIFIED(0),
        TYPE_ORDERING_MENU(1),
        TYPE_BOOKING_SERVICES(2);

        public static final LocalMenuCategoryCollection$Type$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            Type type2 = TYPE_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new LocalMenuCategoryCollection$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
        }

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TYPE_ORDERING_MENU;
            }
            if (i != 2) {
                return null;
            }
            return TYPE_BOOKING_SERVICES;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalMenuCategoryCollection$Companion$ADAPTER$1 localMenuCategoryCollection$Companion$ADAPTER$1 = new LocalMenuCategoryCollection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuCategoryCollection.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuCategoryCollection", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuCategoryCollection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuCategoryCollection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuCategoryCollection(String str, String str2, List list, LocalMenuHours localMenuHours, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.menu_hours = localMenuHours;
        this.f1312type = type2;
        this.category_tokens = TransactorKt.immutableCopyOf("category_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuCategoryCollection)) {
            return false;
        }
        LocalMenuCategoryCollection localMenuCategoryCollection = (LocalMenuCategoryCollection) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuCategoryCollection.unknownFields()) && Intrinsics.areEqual(this.token, localMenuCategoryCollection.token) && Intrinsics.areEqual(this.name, localMenuCategoryCollection.name) && Intrinsics.areEqual(this.category_tokens, localMenuCategoryCollection.category_tokens) && Intrinsics.areEqual(this.menu_hours, localMenuCategoryCollection.menu_hours) && this.f1312type == localMenuCategoryCollection.f1312type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.category_tokens);
        LocalMenuHours localMenuHours = this.menu_hours;
        int hashCode3 = (m + (localMenuHours != null ? localMenuHours.hashCode() : 0)) * 37;
        Type type2 = this.f1312type;
        int hashCode4 = hashCode3 + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(9);
        builder.icon = this.token;
        builder.title = this.name;
        builder.subtitle = this.category_tokens;
        builder.action = this.menu_hours;
        builder.icon_background_color = this.f1312type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        List list = this.category_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("category_tokens=", arrayList, list);
        }
        LocalMenuHours localMenuHours = this.menu_hours;
        if (localMenuHours != null) {
            arrayList.add("menu_hours=" + localMenuHours);
        }
        Type type2 = this.f1312type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuCategoryCollection{", "}", 0, null, null, 56);
    }
}
