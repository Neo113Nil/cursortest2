package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.franklin.common.ProfileAlias;
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

/* loaded from: classes8.dex */
public final class SettingsCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SettingsCategory> CREATOR;
    public final String header;
    public final List items;
    public final LocalizableString localizable_header;
    public final List progress_bars;

    public final class ProgressBar extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ProgressBar> CREATOR;
        public final LocalizableString localizable_primary_display_text;
        public final LocalizableString localizable_secondary_display_text;
        public final String primary_display_text;
        public final Double progress;
        public final String secondary_display_text;

        static {
            SettingsCategory$ProgressBar$Companion$ADAPTER$1 settingsCategory$ProgressBar$Companion$ADAPTER$1 = new SettingsCategory$ProgressBar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressBar.class), "type.googleapis.com/squareup.franklin.common.SettingsCategory.ProgressBar", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
            ADAPTER = settingsCategory$ProgressBar$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(settingsCategory$ProgressBar$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressBar(String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, Double d, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_display_text = str;
            this.localizable_primary_display_text = localizableString;
            this.secondary_display_text = str2;
            this.localizable_secondary_display_text = localizableString2;
            this.progress = d;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProgressBar)) {
                return false;
            }
            ProgressBar progressBar = (ProgressBar) obj;
            return Intrinsics.areEqual(unknownFields(), progressBar.unknownFields()) && Intrinsics.areEqual(this.primary_display_text, progressBar.primary_display_text) && Intrinsics.areEqual(this.localizable_primary_display_text, progressBar.localizable_primary_display_text) && Intrinsics.areEqual(this.secondary_display_text, progressBar.secondary_display_text) && Intrinsics.areEqual(this.localizable_secondary_display_text, progressBar.localizable_secondary_display_text) && Intrinsics.areEqual(this.progress, progressBar.progress);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.primary_display_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_primary_display_text;
            int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            String str2 = this.secondary_display_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_secondary_display_text;
            int hashCode5 = (hashCode4 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            Double d = this.progress;
            int hashCode6 = hashCode5 + (d != null ? Double.hashCode(d.doubleValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(15, false);
            builder.alias = this.primary_display_text;
            builder.verified = this.localizable_primary_display_text;
            builder.expires_at = this.secondary_display_text;
            builder.version = this.localizable_secondary_display_text;
            builder.display_date = this.progress;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.primary_display_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_display_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_primary_display_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_primary_display_text=", localizableString, arrayList);
            }
            String str2 = this.secondary_display_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_display_text=", arrayList);
            }
            LocalizableString localizableString2 = this.localizable_secondary_display_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_secondary_display_text=", localizableString2, arrayList);
            }
            Double d = this.progress;
            if (d != null) {
                SizeMode$EnumUnboxingLocalUtility.m("progress=", d, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressBar{", "}", 0, null, null, 56);
        }
    }

    static {
        SettingsCategory$Companion$ADAPTER$1 settingsCategory$Companion$ADAPTER$1 = new SettingsCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SettingsCategory.class), "type.googleapis.com/squareup.franklin.common.SettingsCategory", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = settingsCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(settingsCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCategory(String str, LocalizableString localizableString, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.header = str;
        this.localizable_header = localizableString;
        this.items = TransactorKt.immutableCopyOf("items", list);
        this.progress_bars = TransactorKt.immutableCopyOf("progress_bars", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingsCategory)) {
            return false;
        }
        SettingsCategory settingsCategory = (SettingsCategory) obj;
        return Intrinsics.areEqual(unknownFields(), settingsCategory.unknownFields()) && Intrinsics.areEqual(this.header, settingsCategory.header) && Intrinsics.areEqual(this.localizable_header, settingsCategory.localizable_header) && Intrinsics.areEqual(this.items, settingsCategory.items) && Intrinsics.areEqual(this.progress_bars, settingsCategory.progress_bars);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_header;
        int hashCode3 = this.progress_bars.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37, 37, this.items);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(28);
        builder.button_color = this.header;
        builder.text_color = this.localizable_header;
        builder.text = this.items;
        builder.action = this.progress_bars;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
        }
        LocalizableString localizableString = this.localizable_header;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_header=", localizableString, arrayList);
        }
        List list = this.items;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        List list2 = this.progress_bars;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("progress_bars=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SettingsCategory{", "}", 0, null, null, 56);
    }
}
