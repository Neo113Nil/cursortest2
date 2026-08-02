package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
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
public final class ContentSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContentSection> CREATOR;
    public final Image image;
    public final List paragraphs;
    public final List subsections;
    public final LocalizedString title;

    static {
        ContentSection$Companion$ADAPTER$1 contentSection$Companion$ADAPTER$1 = new ContentSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContentSection.class), "type.googleapis.com/squareup.cash.aegis.core.ContentSection", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = contentSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(contentSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentSection(LocalizedString localizedString, List list, Image image, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = localizedString;
        this.image = image;
        this.paragraphs = TransactorKt.immutableCopyOf("paragraphs", list);
        this.subsections = TransactorKt.immutableCopyOf("subsections", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContentSection)) {
            return false;
        }
        ContentSection contentSection = (ContentSection) obj;
        return Intrinsics.areEqual(unknownFields(), contentSection.unknownFields()) && Intrinsics.areEqual(this.title, contentSection.title) && Intrinsics.areEqual(this.paragraphs, contentSection.paragraphs) && Intrinsics.areEqual(this.image, contentSection.image) && Intrinsics.areEqual(this.subsections, contentSection.subsections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.paragraphs);
        Image image = this.image;
        int hashCode2 = this.subsections.hashCode() + ((m + (image != null ? image.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(21);
        builder.collection = this.title;
        builder.template = this.paragraphs;
        builder.item_variable = this.image;
        builder.source = this.subsections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        List list = this.paragraphs;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("paragraphs=", arrayList, list);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        List list2 = this.subsections;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("subsections=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContentSection{", "}", 0, null, null, 56);
    }
}
