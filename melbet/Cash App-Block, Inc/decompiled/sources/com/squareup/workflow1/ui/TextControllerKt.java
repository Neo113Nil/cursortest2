package com.squareup.workflow1.ui;

import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;

/* loaded from: classes4.dex */
public abstract class TextControllerKt {
    public static final TextControllerImpl TextController(String str) {
        str.getClass();
        return new TextControllerImpl(str);
    }

    public static TelemetryErrorEvent.Device fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("architecture");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("brand");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("model");
            return new TelemetryErrorEvent.Device(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static final Money toMoney(CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance) {
        cryptoBalance$BitcoinBalance.getClass();
        return new Money(Long.valueOf(cryptoBalance$BitcoinBalance.amount.satoshi), CurrencyCode.BTC, 4);
    }
}
