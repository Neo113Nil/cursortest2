package f0;

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
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class i extends b4.d {
    public static Font Z(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int c02 = c0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int c03 = c0(fontStyle, font2.getStyle());
            if (c03 < c02) {
                font = font2;
                c02 = c03;
            }
        }
        return font;
    }

    public static int c0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily a0(k0.i[] iVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (k0.i iVar : iVarArr) {
            if (Objects.equals(iVar.f2298a.getScheme(), "systemfont")) {
                font = b0(iVar);
            } else {
                try {
                    Uri uri = iVar.f2298a;
                    str = iVar.f2301e;
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
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(iVar.f2300c).setSlant(iVar.d ? 1 : 0).setTtcIndex(iVar.f2299b);
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

    public Font b0(k0.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // b4.d
    public final Typeface o(Context context, e0.f fVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (e0.g gVar : fVar.f1323a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f1328f).setWeight(gVar.f1325b).setSlant(gVar.f1326c ? 1 : 0).setTtcIndex(gVar.f1327e).setFontVariationSettings(gVar.d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(Z(build2, i).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b4.d
    public final Typeface p(Context context, k0.i[] iVarArr, int i) {
        try {
            FontFamily a02 = a0(iVarArr, context.getContentResolver());
            if (a02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(a02).setStyle(Z(a02, i).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b4.d
    public final Typeface q(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily a02 = a0((k0.i[]) list.get(0), contentResolver);
            if (a02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(a02);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily a03 = a0((k0.i[]) list.get(i4), contentResolver);
                if (a03 != null) {
                    customFallbackBuilder.addCustomFallback(a03);
                }
            }
            return customFallbackBuilder.setStyle(Z(a02, i).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // b4.d
    public final Typeface r(Context context, Resources resources, int i, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }
}
