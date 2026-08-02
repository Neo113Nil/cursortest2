package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.woodrow.syncvalues.PerformanceDetailsUiSection;
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
import squareup.cash.savings.SavingsHome;

/* loaded from: classes8.dex */
public final class SettingsGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SettingsGroup> CREATOR;
    public final LocalizableString localizable_title;
    public final List settings_categories;
    public final String title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public LocalizableString localizable_title;
        public List settings_categories;
        public String title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SettingsGroup(this.localizable_title, this.title, this.settings_categories, buildUnknownFields());
                case 1:
                    return new PerformanceDetailsUiSection(this.localizable_title, this.title, this.settings_categories, buildUnknownFields());
                default:
                    List list = this.settings_categories;
                    return new SavingsHome.SavingsOptionsSection(this.localizable_title, this.title, list, buildUnknownFields());
            }
        }
    }

    static {
        SettingsGroup$Companion$ADAPTER$1 settingsGroup$Companion$ADAPTER$1 = new SettingsGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SettingsGroup.class), "type.googleapis.com/squareup.franklin.common.SettingsGroup", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = settingsGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(settingsGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsGroup(LocalizableString localizableString, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.localizable_title = localizableString;
        this.settings_categories = TransactorKt.immutableCopyOf("settings_categories", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SettingsGroup)) {
            return false;
        }
        SettingsGroup settingsGroup = (SettingsGroup) obj;
        return Intrinsics.areEqual(unknownFields(), settingsGroup.unknownFields()) && Intrinsics.areEqual(this.title, settingsGroup.title) && Intrinsics.areEqual(this.localizable_title, settingsGroup.localizable_title) && Intrinsics.areEqual(this.settings_categories, settingsGroup.settings_categories);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_title;
        int hashCode3 = this.settings_categories.hashCode() + ((hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.localizable_title = this.localizable_title;
        builder.settings_categories = this.settings_categories;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        List list = this.settings_categories;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("settings_categories=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SettingsGroup{", "}", 0, null, null, 56);
    }
}
