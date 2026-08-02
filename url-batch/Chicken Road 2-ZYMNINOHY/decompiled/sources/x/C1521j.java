package x;

import O3.l;
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
import w.C1482b;
import w.C1483c;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1521j extends l {
    public static Font H(FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int K2 = K(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int K4 = K(fontStyle, font2.getStyle());
            if (K4 < K2) {
                font = font2;
                K2 = K4;
            }
        }
        return font;
    }

    public static int K(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily I(B.l[] lVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (B.l lVar : lVarArr) {
            if (Objects.equals(lVar.f178a.getScheme(), "systemfont")) {
                font = J(lVar);
            } else {
                try {
                    Uri uri = lVar.f178a;
                    str = lVar.f182e;
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
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(lVar.f180c).setSlant(lVar.f181d ? 1 : 0).setTtcIndex(lVar.f179b);
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

    public Font J(B.l lVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // O3.l
    public final Typeface i(Context context, C1482b c1482b, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (C1483c c1483c : c1482b.f15725a) {
                try {
                    Font build = new Font.Builder(resources, c1483c.f15731f).setWeight(c1483c.f15727b).setSlant(c1483c.f15728c ? 1 : 0).setTtcIndex(c1483c.f15730e).setFontVariationSettings(c1483c.f15729d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(H(build2, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // O3.l
    public final Typeface j(Context context, B.l[] lVarArr, int i4) {
        try {
            FontFamily I4 = I(lVarArr, context.getContentResolver());
            if (I4 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(I4).setStyle(H(I4, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // O3.l
    public final Typeface k(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily I4 = I((B.l[]) list.get(0), contentResolver);
            if (I4 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(I4);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily I5 = I((B.l[]) list.get(i5), contentResolver);
                if (I5 != null) {
                    customFallbackBuilder.addCustomFallback(I5);
                }
            }
            return customFallbackBuilder.setStyle(H(I4, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // O3.l
    public final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // O3.l
    public final Typeface m(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // O3.l
    public final B.l q(B.l[] lVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
