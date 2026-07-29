package com.applovin.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.applovin.impl.sdk.e.f;
import com.applovin.impl.sdk.e.l;
import java.io.File;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f3404a = new Handler(Looper.getMainLooper());

    private static void a(ImageView imageView) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null || !(drawable instanceof BitmapDrawable)) {
            return;
        }
        ((BitmapDrawable) drawable).getBitmap().recycle();
    }

    public static int dpToPx(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i) {
        return (int) (i / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (z || Looper.myLooper() != Looper.getMainLooper()) {
            f3404a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        f3404a.postDelayed(runnable, j);
    }

    public static void safePopulateImageView(Context context, ImageView imageView, int i, int i2) {
        a(imageView);
        Bitmap a2 = l.a(context, i, i2);
        if (a2 != null) {
            imageView.setImageBitmap(a2);
        }
    }

    public static void safePopulateImageView(ImageView imageView, Bitmap bitmap) {
        a(imageView);
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static void safePopulateImageView(ImageView imageView, Uri uri, int i) {
        a(imageView);
        Bitmap a2 = l.a(new File(uri.getPath()), i);
        if (a2 != null) {
            imageView.setImageBitmap(a2);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return f.a(jSONObject);
    }
}
