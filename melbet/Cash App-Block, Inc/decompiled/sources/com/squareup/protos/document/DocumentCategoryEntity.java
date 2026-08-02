package com.squareup.protos.document;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.person.Alias;
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
import okio.ByteString;
import okio.Path;

/* loaded from: classes8.dex */
public final class DocumentCategoryEntity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DocumentCategoryEntity> CREATOR;
    public final String category;
    public final String display_name;
    public final LocalizableString localizable_display_name;
    public final Integer order;
    public final String parent_category;
    public final RenderStyle render_style;
    public final VersionData version_data;

    /* loaded from: classes.dex */
    public enum RenderStyle implements WireEnum {
        INVALID(0),
        REVERSE_CHRONO_LIST(1),
        CATEGORY_LIST_BY_PRIORITY(2),
        REVERSE_CHRONO_LIST_BY_YEAR(3);

        public static final DocumentCategoryEntity$RenderStyle$Companion$ADAPTER$1 ADAPTER;
        public static final Path.Companion Companion;
        public final int value;

        static {
            RenderStyle renderStyle = INVALID;
            Companion = new Path.Companion();
            ADAPTER = new DocumentCategoryEntity$RenderStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RenderStyle.class), Syntax.PROTO_2, renderStyle);
        }

        RenderStyle(int i) {
            this.value = i;
        }

        public static final RenderStyle fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return REVERSE_CHRONO_LIST;
            }
            if (i == 2) {
                return CATEGORY_LIST_BY_PRIORITY;
            }
            if (i != 3) {
                return null;
            }
            return REVERSE_CHRONO_LIST_BY_YEAR;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DocumentCategoryEntity$Companion$ADAPTER$1 documentCategoryEntity$Companion$ADAPTER$1 = new DocumentCategoryEntity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DocumentCategoryEntity.class), "type.googleapis.com/squareup.document.DocumentCategoryEntity", Syntax.PROTO_2, null, "squareup/document/document.proto");
        ADAPTER = documentCategoryEntity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(documentCategoryEntity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCategoryEntity(String str, String str2, String str3, Integer num, RenderStyle renderStyle, VersionData versionData, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.category = str;
        this.parent_category = str2;
        this.display_name = str3;
        this.order = num;
        this.render_style = renderStyle;
        this.version_data = versionData;
        this.localizable_display_name = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DocumentCategoryEntity)) {
            return false;
        }
        DocumentCategoryEntity documentCategoryEntity = (DocumentCategoryEntity) obj;
        return Intrinsics.areEqual(unknownFields(), documentCategoryEntity.unknownFields()) && Intrinsics.areEqual(this.category, documentCategoryEntity.category) && Intrinsics.areEqual(this.parent_category, documentCategoryEntity.parent_category) && Intrinsics.areEqual(this.display_name, documentCategoryEntity.display_name) && Intrinsics.areEqual(this.order, documentCategoryEntity.order) && this.render_style == documentCategoryEntity.render_style && Intrinsics.areEqual(this.version_data, documentCategoryEntity.version_data) && Intrinsics.areEqual(this.localizable_display_name, documentCategoryEntity.localizable_display_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.category;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.parent_category;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.order;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        RenderStyle renderStyle = this.render_style;
        int hashCode6 = (hashCode5 + (renderStyle != null ? renderStyle.hashCode() : 0)) * 37;
        VersionData versionData = this.version_data;
        int hashCode7 = (hashCode6 + (versionData != null ? versionData.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_display_name;
        int hashCode8 = hashCode7 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(1, false);
        builder.scope = this.category;
        builder.value = this.parent_category;
        builder.f1407type = this.display_name;
        builder.first_verified_at_ms = this.order;
        builder.last_verified_at_ms = this.render_style;
        builder.created_at = this.version_data;
        builder.updated_at = this.localizable_display_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.category;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "category=", arrayList);
        }
        String str2 = this.parent_category;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "parent_category=", arrayList);
        }
        String str3 = this.display_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_name=", arrayList);
        }
        Integer num = this.order;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("order=", num, arrayList);
        }
        RenderStyle renderStyle = this.render_style;
        if (renderStyle != null) {
            arrayList.add("render_style=" + renderStyle);
        }
        VersionData versionData = this.version_data;
        if (versionData != null) {
            arrayList.add("version_data=" + versionData);
        }
        LocalizableString localizableString = this.localizable_display_name;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_display_name=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DocumentCategoryEntity{", "}", 0, null, null, 56);
    }
}
