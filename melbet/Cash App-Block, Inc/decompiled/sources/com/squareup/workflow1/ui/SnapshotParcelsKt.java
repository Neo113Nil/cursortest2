package com.squareup.workflow1.ui;

import android.os.Parcelable;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo;
import com.squareup.cash.crypto.backend.idv.LiteCryptoIdvStatusRepo;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import com.squareup.workflow1.Snapshot;
import net.idrnd.face.iad.capture.internal.e3;

/* loaded from: classes4.dex */
public abstract class SnapshotParcelsKt {
    public static TelemetryErrorEvent.Application fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryErrorEvent.Application(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static CryptoIdvStatusRepo provideCryptoIdvStatusRepo$real(RealTrifleService.MetroFactory metroFactory, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? new LiteCryptoIdvStatusRepo() : (CryptoIdvStatusRepo) metroFactory.invoke();
    }

    public static final Snapshot toSnapshot(Parcelable parcelable) {
        parcelable.getClass();
        int i = 4;
        return new Snapshot(new e3(new InterceptedRenderContext$send$1(parcelable, i), i));
    }
}
