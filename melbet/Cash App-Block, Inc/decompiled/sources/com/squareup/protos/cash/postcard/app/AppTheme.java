package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.AppThemeName;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.taply.app.v1.Allowed;
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
public final class AppTheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppTheme> CREATOR;
    public final AppThemeState availability_state;
    public final String finish_action;
    public final LocalizedString finish_button_text;
    public final AppThemeName name;

    static {
        AppTheme$Companion$ADAPTER$1 appTheme$Companion$ADAPTER$1 = new AppTheme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppTheme.class), "type.googleapis.com/squareup.cash.postcard.app.AppTheme", Syntax.PROTO_2, null, "squareup/cash/postcard/app/AppThemeProto.proto");
        ADAPTER = appTheme$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appTheme$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppTheme(AppThemeName appThemeName, AppThemeState appThemeState, LocalizedString localizedString, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = appThemeName;
        this.availability_state = appThemeState;
        this.finish_button_text = localizedString;
        this.finish_action = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return Intrinsics.areEqual(unknownFields(), appTheme.unknownFields()) && this.name == appTheme.name && this.availability_state == appTheme.availability_state && Intrinsics.areEqual(this.finish_button_text, appTheme.finish_button_text) && Intrinsics.areEqual(this.finish_action, appTheme.finish_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppThemeName appThemeName = this.name;
        int hashCode2 = (hashCode + (appThemeName != null ? appThemeName.hashCode() : 0)) * 37;
        AppThemeState appThemeState = this.availability_state;
        int hashCode3 = (hashCode2 + (appThemeState != null ? appThemeState.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.finish_button_text;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str = this.finish_action;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(9);
        builder.card_encryption_data = this.name;
        builder.device_metadata = this.availability_state;
        builder.success_screen = this.finish_button_text;
        builder.customer_token_hash_email = this.finish_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppThemeName appThemeName = this.name;
        if (appThemeName != null) {
            arrayList.add("name=" + appThemeName);
        }
        AppThemeState appThemeState = this.availability_state;
        if (appThemeState != null) {
            arrayList.add("availability_state=" + appThemeState);
        }
        LocalizedString localizedString = this.finish_button_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("finish_button_text=", localizedString, arrayList);
        }
        String str = this.finish_action;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "finish_action=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppTheme{", "}", 0, null, null, 56);
    }
}
