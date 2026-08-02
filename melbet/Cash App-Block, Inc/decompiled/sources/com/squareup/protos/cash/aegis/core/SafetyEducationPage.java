package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.localization.LocalizedString;
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

/* loaded from: classes7.dex */
public final class SafetyEducationPage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SafetyEducationPage> CREATOR;
    public final List colored_title;
    public final ContentSection content_section;
    public final DropDownSection drop_down_section;
    public final String id;
    public final LinkSection link_section;
    public final LocalizedString navigation_title;

    static {
        SafetyEducationPage$Companion$ADAPTER$1 safetyEducationPage$Companion$ADAPTER$1 = new SafetyEducationPage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SafetyEducationPage.class), "type.googleapis.com/squareup.cash.aegis.core.SafetyEducationPage", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = safetyEducationPage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(safetyEducationPage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyEducationPage(String str, LocalizedString localizedString, List list, ContentSection contentSection, DropDownSection dropDownSection, LinkSection linkSection, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.navigation_title = localizedString;
        this.content_section = contentSection;
        this.drop_down_section = dropDownSection;
        this.link_section = linkSection;
        this.colored_title = TransactorKt.immutableCopyOf("colored_title", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafetyEducationPage)) {
            return false;
        }
        SafetyEducationPage safetyEducationPage = (SafetyEducationPage) obj;
        return Intrinsics.areEqual(unknownFields(), safetyEducationPage.unknownFields()) && Intrinsics.areEqual(this.id, safetyEducationPage.id) && Intrinsics.areEqual(this.navigation_title, safetyEducationPage.navigation_title) && Intrinsics.areEqual(this.colored_title, safetyEducationPage.colored_title) && Intrinsics.areEqual(this.content_section, safetyEducationPage.content_section) && Intrinsics.areEqual(this.drop_down_section, safetyEducationPage.drop_down_section) && Intrinsics.areEqual(this.link_section, safetyEducationPage.link_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.navigation_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.colored_title);
        ContentSection contentSection = this.content_section;
        int hashCode3 = (m + (contentSection != null ? contentSection.hashCode() : 0)) * 37;
        DropDownSection dropDownSection = this.drop_down_section;
        int hashCode4 = (hashCode3 + (dropDownSection != null ? dropDownSection.hashCode() : 0)) * 37;
        LinkSection linkSection = this.link_section;
        int hashCode5 = hashCode4 + (linkSection != null ? linkSection.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(8, false);
        builder.description = this.id;
        builder.category = this.navigation_title;
        builder.code = this.colored_title;
        builder.field = this.content_section;
        builder.retryable = this.drop_down_section;
        builder.metadata = this.link_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        LocalizedString localizedString = this.navigation_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("navigation_title=", localizedString, arrayList);
        }
        List list = this.colored_title;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("colored_title=", arrayList, list);
        }
        ContentSection contentSection = this.content_section;
        if (contentSection != null) {
            arrayList.add("content_section=" + contentSection);
        }
        DropDownSection dropDownSection = this.drop_down_section;
        if (dropDownSection != null) {
            arrayList.add("drop_down_section=" + dropDownSection);
        }
        LinkSection linkSection = this.link_section;
        if (linkSection != null) {
            arrayList.add("link_section=" + linkSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SafetyEducationPage{", "}", 0, null, null, 56);
    }
}
