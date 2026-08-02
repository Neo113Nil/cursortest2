package com.squareup.protos.cash.appthemes;

import android.os.Parcelable;
import app.cash.local.primitives.BrandKt;
import com.squareup.protos.cash.aegis.core.Section;
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
public final class AppThemeDefinition extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppThemeDefinition> CREATOR;
    public final ButtonColors button_colors;
    public final BrandKt color_scheme;
    public final AppThemeName name;

    static {
        AppThemeDefinition$Companion$ADAPTER$1 appThemeDefinition$Companion$ADAPTER$1 = new AppThemeDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppThemeDefinition.class), "type.googleapis.com/squareup.cash.appthemes.AppThemeDefinition", Syntax.PROTO_2, null, "squareup/cash/appthemes/app_theme_definitions.proto");
        ADAPTER = appThemeDefinition$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appThemeDefinition$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppThemeDefinition(AppThemeName appThemeName, BrandKt brandKt, ButtonColors buttonColors, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = appThemeName;
        this.color_scheme = brandKt;
        this.button_colors = buttonColors;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppThemeDefinition)) {
            return false;
        }
        AppThemeDefinition appThemeDefinition = (AppThemeDefinition) obj;
        return Intrinsics.areEqual(unknownFields(), appThemeDefinition.unknownFields()) && this.name == appThemeDefinition.name && Intrinsics.areEqual(this.color_scheme, appThemeDefinition.color_scheme) && Intrinsics.areEqual(this.button_colors, appThemeDefinition.button_colors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppThemeName appThemeName = this.name;
        int hashCode2 = (hashCode + (appThemeName != null ? appThemeName.hashCode() : 0)) * 37;
        BrandKt brandKt = this.color_scheme;
        int hashCode3 = (hashCode2 + (brandKt != null ? brandKt.hashCode() : 0)) * 37;
        ButtonColors buttonColors = this.button_colors;
        int hashCode4 = hashCode3 + (buttonColors != null ? buttonColors.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(9);
        builder.header_text = this.name;
        builder.header_button = this.color_scheme;
        builder.groups = this.button_colors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppThemeName appThemeName = this.name;
        if (appThemeName != null) {
            arrayList.add("name=" + appThemeName);
        }
        BrandKt brandKt = this.color_scheme;
        if (brandKt != null) {
            arrayList.add("color_scheme=" + brandKt);
        }
        ButtonColors buttonColors = this.button_colors;
        if (buttonColors != null) {
            arrayList.add("button_colors=" + buttonColors);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppThemeDefinition{", "}", 0, null, null, 56);
    }
}
