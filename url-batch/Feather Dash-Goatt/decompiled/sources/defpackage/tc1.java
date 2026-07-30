package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.List;
import kotlin.coroutines.f;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tc1 implements f, ir1 {
    public static tc1 e;
    public final /* synthetic */ int d;

    public tc1(o5 o5Var) {
        this.d = 7;
    }

    public static Typeface b(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily d = d((z20[]) list.get(0), contentResolver);
            if (d == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(d);
            for (int i = 1; i < list.size(); i++) {
                FontFamily d2 = d((z20[]) list.get(i), contentResolver);
                if (d2 != null) {
                    customFallbackBuilder.addCustomFallback(d2);
                }
            }
            return customFallbackBuilder.setStyle(c(d).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    public static Font c(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int e2 = e(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int e3 = e(fontStyle, font2.getStyle());
            if (e3 < e2) {
                font = font2;
                e2 = e3;
            }
        }
        return font;
    }

    public static FontFamily d(z20[] z20VarArr, ContentResolver contentResolver) {
        int i;
        ParcelFileDescriptor openFileDescriptor;
        int length = z20VarArr.length;
        FontFamily.Builder builder = null;
        while (i < length) {
            z20 z20Var = z20VarArr[i];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(z20Var.a, "r", null);
            } catch (IOException e2) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            }
            if (openFileDescriptor == null) {
                i = openFileDescriptor == null ? i + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(z20Var.c).setSlant(z20Var.d ? 1 : 0).setTtcIndex(z20Var.b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int e(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // defpackage.kr1
    public Object a() {
        return new sc1(7);
    }

    public String toString() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tc1(int i) {
        this.d = i;
    }
}
