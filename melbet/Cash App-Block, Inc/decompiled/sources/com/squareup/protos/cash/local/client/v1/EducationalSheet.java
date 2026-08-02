package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
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
public final class EducationalSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EducationalSheet> CREATOR;
    public final EducationalSheetButton dismiss_button;
    public final String expand_nudge_text;
    public final List expanded_contents;
    public final List half_sheet_contents;
    public final EducationalSheetButton primary_button;
    public final Boolean requires_full_scroll;
    public final Boolean should_force_full_height_layout;
    public final Boolean show_page_progress;
    public final String token;

    static {
        EducationalSheet$Companion$ADAPTER$1 educationalSheet$Companion$ADAPTER$1 = new EducationalSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EducationalSheet.class), "type.googleapis.com/squareup.cash.local.client.v1.EducationalSheet", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = educationalSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(educationalSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationalSheet(List list, List list2, String str, Boolean bool, EducationalSheetButton educationalSheetButton, String str2, Boolean bool2, EducationalSheetButton educationalSheetButton2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.expand_nudge_text = str;
        this.requires_full_scroll = bool;
        this.primary_button = educationalSheetButton;
        this.token = str2;
        this.show_page_progress = bool2;
        this.dismiss_button = educationalSheetButton2;
        this.should_force_full_height_layout = bool3;
        this.half_sheet_contents = TransactorKt.immutableCopyOf("half_sheet_contents", list);
        this.expanded_contents = TransactorKt.immutableCopyOf("expanded_contents", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EducationalSheet)) {
            return false;
        }
        EducationalSheet educationalSheet = (EducationalSheet) obj;
        return Intrinsics.areEqual(unknownFields(), educationalSheet.unknownFields()) && Intrinsics.areEqual(this.half_sheet_contents, educationalSheet.half_sheet_contents) && Intrinsics.areEqual(this.expanded_contents, educationalSheet.expanded_contents) && Intrinsics.areEqual(this.expand_nudge_text, educationalSheet.expand_nudge_text) && Intrinsics.areEqual(this.requires_full_scroll, educationalSheet.requires_full_scroll) && Intrinsics.areEqual(this.primary_button, educationalSheet.primary_button) && Intrinsics.areEqual(this.token, educationalSheet.token) && Intrinsics.areEqual(this.show_page_progress, educationalSheet.show_page_progress) && Intrinsics.areEqual(this.dismiss_button, educationalSheet.dismiss_button) && Intrinsics.areEqual(this.should_force_full_height_layout, educationalSheet.should_force_full_height_layout);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.half_sheet_contents), 37, this.expanded_contents);
        String str = this.expand_nudge_text;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.requires_full_scroll;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        EducationalSheetButton educationalSheetButton = this.primary_button;
        int hashCode3 = (hashCode2 + (educationalSheetButton != null ? educationalSheetButton.hashCode() : 0)) * 37;
        String str2 = this.token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.show_page_progress;
        int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        EducationalSheetButton educationalSheetButton2 = this.dismiss_button;
        int hashCode6 = (hashCode5 + (educationalSheetButton2 != null ? educationalSheetButton2.hashCode() : 0)) * 37;
        Boolean bool3 = this.should_force_full_height_layout;
        int hashCode7 = hashCode6 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(23, false);
        builder.info_rows = this.half_sheet_contents;
        builder.locale = this.expanded_contents;
        builder.title = this.expand_nudge_text;
        builder.info_rows_header = this.requires_full_scroll;
        builder.footer_text = this.primary_button;
        builder.loadable_subtitle = this.token;
        builder.primary_footer_button_state = this.show_page_progress;
        builder.secondary_footer_button_state = this.dismiss_button;
        builder.payment_plans_data = this.should_force_full_height_layout;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.half_sheet_contents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("half_sheet_contents=", arrayList, list);
        }
        List list2 = this.expanded_contents;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("expanded_contents=", arrayList, list2);
        }
        String str = this.expand_nudge_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "expand_nudge_text=", arrayList);
        }
        Boolean bool = this.requires_full_scroll;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_full_scroll=", bool, arrayList);
        }
        EducationalSheetButton educationalSheetButton = this.primary_button;
        if (educationalSheetButton != null) {
            arrayList.add("primary_button=" + educationalSheetButton);
        }
        String str2 = this.token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "token=", arrayList);
        }
        Boolean bool2 = this.show_page_progress;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_page_progress=", bool2, arrayList);
        }
        EducationalSheetButton educationalSheetButton2 = this.dismiss_button;
        if (educationalSheetButton2 != null) {
            arrayList.add("dismiss_button=" + educationalSheetButton2);
        }
        Boolean bool3 = this.should_force_full_height_layout;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_force_full_height_layout=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EducationalSheet{", "}", 0, null, null, 56);
    }
}
