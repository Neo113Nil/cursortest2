package com.squareup.protos.wire.roster.mds;

import com.plaid.internal.EnumC0170g;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* loaded from: classes9.dex */
public enum ScriptScope$Script implements WireEnum {
    Zyyy(998),
    Hebr(125),
    Arab(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE),
    Latn(EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE),
    Grek(200),
    Cyrl(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE),
    Hang(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE),
    Kore(EnumC0170g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE),
    Deva(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE),
    Beng(EnumC0170g.SDK_ASSET_ICON_REPORT_VALUE),
    Taml(346),
    Thai(352),
    Hira(410),
    Kana(411),
    Hrkt(412),
    Jpan(HttpStatusCode.PAYLOAD_TOO_LARGE_413),
    Hani(500);

    public final int value;
    public static final KClasses$$Lambda$1 Companion = new KClasses$$Lambda$1(7);
    public static final ScriptScope$Script$Companion$ADAPTER$1 ADAPTER = new ScriptScope$Script$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ScriptScope$Script.class), Syntax.PROTO_2, null);

    ScriptScope$Script(int i) {
        this.value = i;
    }

    public static final ScriptScope$Script fromValue(int i) {
        Companion.getClass();
        return KClasses$$Lambda$1.m4139fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
