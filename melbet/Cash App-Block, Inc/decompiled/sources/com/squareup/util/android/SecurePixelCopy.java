package com.squareup.util.android;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Window;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.errors.SyncValuesWithoutType;
import com.squareup.cash.support.screenshot.RealScreenshotManager$$ExternalSyntheticLambda2;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class SecurePixelCopy {
    public static SyncValuesWithoutType create(List list) {
        list.getClass();
        return new SyncValuesWithoutType(new SyncValuesWithoutType.Metadata(list));
    }

    public static ViewEvent.Error fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            return new ViewEvent.Error(jsonObject.get("count").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e3);
            return null;
        }
    }

    public static void request(Window window, Rect rect, Bitmap bitmap, RealScreenshotManager$$ExternalSyntheticLambda2 realScreenshotManager$$ExternalSyntheticLambda2, Handler handler) {
        bitmap.getClass();
        handler.getClass();
        if ((window.getAttributes().flags & PKIFailureInfo.certRevoked) != 0) {
            realScreenshotManager$$ExternalSyntheticLambda2.onPixelCopyFinished(4);
        } else {
            PixelCopy.request(window, rect, bitmap, realScreenshotManager$$ExternalSyntheticLambda2, handler);
        }
    }
}
