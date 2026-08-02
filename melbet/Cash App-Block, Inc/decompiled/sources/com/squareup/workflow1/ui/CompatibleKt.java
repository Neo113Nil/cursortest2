package com.squareup.workflow1.ui;

import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.crypto.amount.BitcoinAmount;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes4.dex */
public abstract class CompatibleKt {
    public static final boolean compatible(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        Class<?> cls = obj.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        if (!reflectionFactory.getOrCreateKotlinClass(cls).equals(reflectionFactory.getOrCreateKotlinClass(obj2.getClass()))) {
            return false;
        }
        if (obj instanceof Compatible) {
            return Intrinsics.areEqual(((Compatible) obj).getCompatibilityKey(), ((Compatible) obj2).getCompatibilityKey());
        }
        return true;
    }

    public static TelemetryErrorEvent.Action fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryErrorEvent.Action(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e3);
            return null;
        }
    }

    public static final Money toMoney(BitcoinAmount bitcoinAmount) {
        bitcoinAmount.getClass();
        return new Money(Long.valueOf(bitcoinAmount.satoshi), CurrencyCode.BTC, 4);
    }
}
