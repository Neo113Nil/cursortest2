package a3;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;

@TargetApi(17)
/* loaded from: classes.dex */
public class i2 extends f {
    public i2() {
        super(null);
    }

    @Override // a3.f
    public final int a(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    @Override // a3.f
    public final int b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // a3.f
    public final Drawable c(Context context, Bitmap bitmap, boolean z6, float f7) {
        if (!z6 || f7 <= 0.0f || f7 > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f7);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // a3.f
    public final String d(Context context) {
        l1 a7 = l1.a();
        if (TextUtils.isEmpty(a7.f107a)) {
            a7.f107a = (String) (v3.c.a() ? i1.a(context, new j1(a7, context)) : i1.a(context, new k1(a7, o3.j.c(context), context)));
        }
        return a7.f107a;
    }

    @Override // a3.f
    public final void e(Context context) {
        l1 a7 = l1.a();
        r1.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a7.f107a)) {
            Context c7 = o3.j.c(context);
            if (!v3.c.a()) {
                if (c7 == null) {
                    c7 = null;
                }
                a7.f107a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (c7 == null) {
                putString.apply();
            } else {
                v3.n.a(context, putString, "admob_user_agent");
            }
            a7.f107a = defaultUserAgent;
        }
        r1.k("User agent is updated.");
    }

    @Override // a3.f
    public final boolean f(Context context, WebSettings webSettings) {
        super.f(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }
}
