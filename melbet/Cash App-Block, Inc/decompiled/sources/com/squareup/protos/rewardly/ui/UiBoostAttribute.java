package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.rewardly.ui.AppLinks;
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
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UiBoostAttribute extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiBoostAttribute> CREATOR;
    public final Icon arcade_icon;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1412type;

    /* loaded from: classes8.dex */
    public enum Type implements WireEnum {
        EXPIRATION(1),
        LOCKED(2),
        TRENDING(3),
        ONLINE_ONLY(4);

        public final int value;
        public static final Plane Companion = new Plane(3);
        public static final UiBoostAttribute$Type$Companion$ADAPTER$1 ADAPTER = new UiBoostAttribute$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return EXPIRATION;
            }
            if (i == 2) {
                return LOCKED;
            }
            if (i == 3) {
                return TRENDING;
            }
            if (i != 4) {
                return null;
            }
            return ONLINE_ONLY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        UiBoostAttribute$Companion$ADAPTER$1 uiBoostAttribute$Companion$ADAPTER$1 = new UiBoostAttribute$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiBoostAttribute.class), "type.googleapis.com/squareup.rewardly.ui.UiBoostAttribute", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiBoostAttribute$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiBoostAttribute$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiBoostAttribute(Type type2, Icon icon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1412type = type2;
        this.arcade_icon = icon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiBoostAttribute)) {
            return false;
        }
        UiBoostAttribute uiBoostAttribute = (UiBoostAttribute) obj;
        return Intrinsics.areEqual(unknownFields(), uiBoostAttribute.unknownFields()) && this.f1412type == uiBoostAttribute.f1412type && Intrinsics.areEqual(this.arcade_icon, uiBoostAttribute.arcade_icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1412type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        Icon icon = this.arcade_icon;
        int hashCode3 = hashCode2 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(22);
        builder.f1411android = this.f1412type;
        builder.ios = this.arcade_icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1412type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiBoostAttribute{", "}", 0, null, null, 56);
    }
}
