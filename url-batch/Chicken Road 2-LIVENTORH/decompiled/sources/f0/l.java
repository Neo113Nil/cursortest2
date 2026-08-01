package f0;

import a.y;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class l extends y {
    public static Font W(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int Z = Z(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int Z2 = Z(fontStyle, font2.getStyle());
            if (Z2 < Z) {
                font = font2;
                Z = Z2;
            }
        }
        return font;
    }

    public static int Z(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily X(k0.i[] iVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (k0.i iVar : iVarArr) {
            if (Objects.equals(iVar.f2150a.getScheme(), "systemfont")) {
                font = Y(iVar);
            } else {
                try {
                    Uri uri = iVar.f2150a;
                    str = iVar.f2153e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e4) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(iVar.f2152c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.f2151b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font Y(k0.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // a.y
    public final Typeface r(Context context, e0.f fVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (e0.g gVar : fVar.f1141a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f1146f).setWeight(gVar.f1143b).setSlant(gVar.f1144c ? 1 : 0).setTtcIndex(gVar.f1145e).setFontVariationSettings(gVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(W(build2, i).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // a.y
    public final Typeface s(Context context, k0.i[] iVarArr, int i) {
        try {
            FontFamily X = X(iVarArr, context.getContentResolver());
            if (X == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(X).setStyle(W(X, i).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // a.y
    public final Typeface t(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily X = X((k0.i[]) list.get(0), contentResolver);
            if (X == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(X);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily X2 = X((k0.i[]) list.get(i4), contentResolver);
                if (X2 != null) {
                    customFallbackBuilder.addCustomFallback(X2);
                }
            }
            return customFallbackBuilder.setStyle(W(X, i).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // a.y
    public final Typeface u(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.y
    public final Typeface v(Context context, Resources resources, int i, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // a.y
    public final k0.i y(k0.i[] iVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
