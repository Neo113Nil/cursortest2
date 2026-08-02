package com.squareup.util.emojis;

import android.icu.text.NumberFormat;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.fillr.e;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Emojis;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.moneyformatter.Amount;
import com.squareup.cash.common.moneyformatter.NumberStyle;
import com.squareup.cash.common.moneyformatter.currency.Currency;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class EmojiEmbeddedImageResolverKt {
    public static final String format(Amount amount, Currency currency, String str, IntRange intRange, NumberStyle numberStyle) {
        amount.getClass();
        currency.getClass();
        str.getClass();
        String str2 = currency.dollarSymbol;
        if (Intrinsics.areEqual(str2, "$")) {
            str2 = "\\$";
        }
        Regex regex = new Regex(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[a-zA-Z]*", str2, "[a-zA-Z]*"));
        Locale forLanguageTag = Locale.forLanguageTag(str);
        int ordinal = numberStyle.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 7;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                i = 0;
            }
        }
        NumberFormat numberFormat = NumberFormat.getInstance(forLanguageTag, i);
        numberFormat.setCurrency(android.icu.util.Currency.getInstance(currency.isoTextCode.name()));
        numberFormat.setMinimumFractionDigits(intRange.first);
        numberFormat.setMaximumFractionDigits(intRange.last);
        String format2 = numberFormat.format(amount.value);
        format2.getClass();
        return regex.replace(format2, str2);
    }

    public static ViewEvent.ViewEventSession fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("id").getAsString();
            String asString2 = jsonObject.get("type").getAsString();
            asString2.getClass();
            int[] values = CameraSelector$$ExternalSyntheticOutline0.values(3);
            int length = values.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                int i3 = values[i];
                if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$3(i3).equals(asString2)) {
                    JsonElement jsonElement = jsonObject.get("has_replay");
                    Boolean valueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    JsonElement jsonElement2 = jsonObject.get("is_active");
                    Boolean valueOf2 = jsonElement2 != null ? Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                    JsonElement jsonElement3 = jsonObject.get("sampled_for_replay");
                    Boolean valueOf3 = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                    asString.getClass();
                    return new ViewEvent.ViewEventSession(asString, i3, valueOf, valueOf2, valueOf3);
                }
                i++;
                length = i2;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEventSession", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEventSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEventSession", e3);
            return null;
        }
    }

    public static final Integer getImageResource24ForTheme(String str, Composer composer) {
        ArrayList arrayList = EmojiEmbeddedImageResolver.supportedEmoji;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (colors.isLight) {
            Emojis.Companion.getClass();
            Emojis emojis = e.get(str);
            if (emojis != null) {
                return Integer.valueOf(emojis.drawableResLight24);
            }
            return null;
        }
        Emojis.Companion.getClass();
        Emojis emojis2 = e.get(str);
        if (emojis2 != null) {
            return Integer.valueOf(emojis2.drawableResDark24);
        }
        return null;
    }

    public static final Integer getImageResource48ForTheme(String str, Composer composer) {
        ArrayList arrayList = EmojiEmbeddedImageResolver.supportedEmoji;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        if (colors.isLight) {
            Emojis.Companion.getClass();
            Emojis emojis = e.get(str);
            if (emojis != null) {
                return Integer.valueOf(emojis.drawableResLight48);
            }
            return null;
        }
        Emojis.Companion.getClass();
        Emojis emojis2 = e.get(str);
        if (emojis2 != null) {
            return Integer.valueOf(emojis2.drawableResDark48);
        }
        return null;
    }
}
