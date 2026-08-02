package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
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
public final class SectionHeaderComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SectionHeaderComponent> CREATOR;
    public final BaseElement action;
    public final String actionText;
    public final String body;
    public final Action onActionClick;
    public final String title;

    static {
        SectionHeaderComponent$Companion$ADAPTER$1 sectionHeaderComponent$Companion$ADAPTER$1 = new SectionHeaderComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SectionHeaderComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.SectionHeaderComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = sectionHeaderComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sectionHeaderComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionHeaderComponent(String str, String str2, BaseElement baseElement, Action action, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.actionText = str2;
        this.action = baseElement;
        this.onActionClick = action;
        this.body = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionHeaderComponent)) {
            return false;
        }
        SectionHeaderComponent sectionHeaderComponent = (SectionHeaderComponent) obj;
        return Intrinsics.areEqual(unknownFields(), sectionHeaderComponent.unknownFields()) && Intrinsics.areEqual(this.title, sectionHeaderComponent.title) && Intrinsics.areEqual(this.actionText, sectionHeaderComponent.actionText) && Intrinsics.areEqual(this.action, sectionHeaderComponent.action) && Intrinsics.areEqual(this.onActionClick, sectionHeaderComponent.onActionClick) && Intrinsics.areEqual(this.body, sectionHeaderComponent.body);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.actionText;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BaseElement baseElement = this.action;
        int hashCode4 = (hashCode3 + (baseElement != null ? baseElement.hashCode() : 0)) * 37;
        Action action = this.onActionClick;
        int hashCode5 = (hashCode4 + (action != null ? action.hashCode() : 0)) * 37;
        String str3 = this.body;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(10);
        builder.text = this.title;
        builder.text_style = this.actionText;
        builder.text_decoration = this.action;
        builder.text_color = this.onActionClick;
        builder.icon = this.body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.actionText;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "actionText=", arrayList);
        }
        BaseElement baseElement = this.action;
        if (baseElement != null) {
            arrayList.add("action=" + baseElement);
        }
        Action action = this.onActionClick;
        if (action != null) {
            arrayList.add("onActionClick=" + action);
        }
        String str3 = this.body;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SectionHeaderComponent{", "}", 0, null, null, 56);
    }
}
