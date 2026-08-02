package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import coil3.size.ViewSizeResolverKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
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
public final class CellActivityComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellActivityComponent> CREATOR;
    public final BaseElement accessory;
    public final ViewSizeResolverKt accessoryType;
    public final BaseElement avatar;
    public final String body;
    public final Boolean forceCenterAlignment;
    public final String label;
    public final Action onClick;
    public final String status;

    static {
        CellActivityComponent$Companion$ADAPTER$1 cellActivityComponent$Companion$ADAPTER$1 = new CellActivityComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellActivityComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.CellActivityComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = cellActivityComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cellActivityComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellActivityComponent(BaseElement baseElement, String str, BaseElement baseElement2, ViewSizeResolverKt viewSizeResolverKt, Action action, String str2, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = baseElement;
        this.label = str;
        this.accessory = baseElement2;
        this.accessoryType = viewSizeResolverKt;
        this.onClick = action;
        this.body = str2;
        this.status = str3;
        this.forceCenterAlignment = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellActivityComponent)) {
            return false;
        }
        CellActivityComponent cellActivityComponent = (CellActivityComponent) obj;
        return Intrinsics.areEqual(unknownFields(), cellActivityComponent.unknownFields()) && Intrinsics.areEqual(this.avatar, cellActivityComponent.avatar) && Intrinsics.areEqual(this.label, cellActivityComponent.label) && Intrinsics.areEqual(this.accessory, cellActivityComponent.accessory) && Intrinsics.areEqual(this.accessoryType, cellActivityComponent.accessoryType) && Intrinsics.areEqual(this.onClick, cellActivityComponent.onClick) && Intrinsics.areEqual(this.body, cellActivityComponent.body) && Intrinsics.areEqual(this.status, cellActivityComponent.status) && Intrinsics.areEqual(this.forceCenterAlignment, cellActivityComponent.forceCenterAlignment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BaseElement baseElement = this.avatar;
        int hashCode2 = (hashCode + (baseElement != null ? baseElement.hashCode() : 0)) * 37;
        String str = this.label;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        BaseElement baseElement2 = this.accessory;
        int hashCode4 = (hashCode3 + (baseElement2 != null ? baseElement2.hashCode() : 0)) * 37;
        ViewSizeResolverKt viewSizeResolverKt = this.accessoryType;
        int hashCode5 = (hashCode4 + (viewSizeResolverKt != null ? viewSizeResolverKt.hashCode() : 0)) * 37;
        Action action = this.onClick;
        int hashCode6 = (hashCode5 + (action != null ? action.hashCode() : 0)) * 37;
        String str2 = this.body;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.status;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.forceCenterAlignment;
        int hashCode9 = hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(24, false);
        builder.external_version = this.avatar;
        builder.external_token = this.label;
        builder.updated_at = this.accessory;
        builder.created_at = this.accessoryType;
        builder.item_type = this.onClick;
        builder.customer_token = this.body;
        builder.count_groups = this.status;
        builder.is_badged = this.forceCenterAlignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BaseElement baseElement = this.avatar;
        if (baseElement != null) {
            arrayList.add("avatar=" + baseElement);
        }
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        BaseElement baseElement2 = this.accessory;
        if (baseElement2 != null) {
            arrayList.add("accessory=" + baseElement2);
        }
        ViewSizeResolverKt viewSizeResolverKt = this.accessoryType;
        if (viewSizeResolverKt != null) {
            arrayList.add("accessoryType=" + viewSizeResolverKt);
        }
        Action action = this.onClick;
        if (action != null) {
            arrayList.add("onClick=" + action);
        }
        String str2 = this.body;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
        }
        String str3 = this.status;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "status=", arrayList);
        }
        Boolean bool = this.forceCenterAlignment;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("forceCenterAlignment=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellActivityComponent{", "}", 0, null, null, 56);
    }
}
