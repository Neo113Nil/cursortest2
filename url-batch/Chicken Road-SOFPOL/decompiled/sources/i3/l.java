package i3;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class l extends h0.a {
    public static Font X(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int a02 = a0(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int a03 = a0(fontStyle, font2.getStyle());
            if (a03 < a02) {
                font = font2;
                a02 = a03;
            }
        }
        return font;
    }

    public static int a0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily Y(n3.h[] hVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (n3.h hVar : hVarArr) {
            if (Objects.equals(hVar.f5359a.getScheme(), "systemfont")) {
                font = Z(hVar);
            } else {
                try {
                    Uri uri = hVar.f5359a;
                    str = hVar.f5363e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e8) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(hVar.f5361c).setSlant(hVar.f5362d ? 1 : 0).setTtcIndex(hVar.f5360b);
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

    public Font Z(n3.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // h0.a
    public final Typeface s(Context context, h3.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (h3.f fVar : eVar.f3131a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f3137f).setWeight(fVar.f3133b).setSlant(fVar.f3134c ? 1 : 0).setTtcIndex(fVar.f3136e).setFontVariationSettings(fVar.f3135d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(X(build2, i).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // h0.a
    public final Typeface t(Context context, n3.h[] hVarArr, int i) {
        try {
            FontFamily Y = Y(hVarArr, context.getContentResolver());
            if (Y == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(Y).setStyle(X(Y, i).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // h0.a
    public final Typeface u(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily Y = Y((n3.h[]) list.get(0), contentResolver);
            if (Y == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(Y);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily Y2 = Y((n3.h[]) list.get(i8), contentResolver);
                if (Y2 != null) {
                    customFallbackBuilder.addCustomFallback(Y2);
                }
            }
            return customFallbackBuilder.setStyle(X(Y, i).getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // h0.a
    public final Typeface v(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // h0.a
    public final Typeface w(Context context, Resources resources, int i, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e8) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e8);
            return null;
        }
    }

    @Override // h0.a
    public final n3.h z(n3.h[] hVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
