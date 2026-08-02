package com.squareup.util.android.drawable;

import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class DrawablesKt {
    public static final boolean access$isNoActiveTransactionException(SQLiteException sQLiteException) {
        String message = sQLiteException.getMessage();
        return message != null && StringsKt.contains((CharSequence) message, (CharSequence) "no transaction is active", false);
    }

    public static final Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            return bitmap;
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static ViewEvent.InForegroundPeriod fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            return new ViewEvent.InForegroundPeriod(jsonObject.get("start").getAsLong(), jsonObject.get("duration").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type InForegroundPeriod", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type InForegroundPeriod", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type InForegroundPeriod", e3);
            return null;
        }
    }

    public static final StateListDrawable stateListDrawableOf(Pair... pairArr) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        for (Pair pair : pairArr) {
            stateListDrawable.addState((int[]) pair.first, (Drawable) pair.second);
        }
        return stateListDrawable;
    }
}
