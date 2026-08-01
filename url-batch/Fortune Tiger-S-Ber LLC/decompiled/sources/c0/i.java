package c0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i extends k3.d {
    public static Font l0(FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int n02 = n0(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int n03 = n0(fontStyle, font2.getStyle());
            if (n03 < n02) {
                font = font2;
                n02 = n03;
            }
        }
        return font;
    }

    public static FontFamily m0(h0.i[] iVarArr, ContentResolver contentResolver) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        int length = iVarArr.length;
        FontFamily.Builder builder = null;
        while (i4 < length) {
            h0.i iVar = iVarArr[i4];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(iVar.f1994a, "r", null);
            } catch (IOException e4) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            }
            if (openFileDescriptor == null) {
                i4 = openFileDescriptor == null ? i4 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(iVar.c).setSlant(iVar.f1996d ? 1 : 0).setTtcIndex(iVar.f1995b).build();
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

    public static int n0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // k3.d
    public final Typeface q(Context context, b0.f fVar, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (b0.g gVar : fVar.f701a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f706f).setWeight(gVar.f703b).setSlant(gVar.c ? 1 : 0).setTtcIndex(gVar.f705e).setFontVariationSettings(gVar.f704d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(l0(build2, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // k3.d
    public final Typeface r(Context context, h0.i[] iVarArr, int i4) {
        try {
            FontFamily m02 = m0(iVarArr, context.getContentResolver());
            if (m02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(m02).setStyle(l0(m02, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // k3.d
    public final Typeface s(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily m02 = m0((h0.i[]) list.get(0), contentResolver);
            if (m02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(m02);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily m03 = m0((h0.i[]) list.get(i5), contentResolver);
                if (m03 != null) {
                    customFallbackBuilder.addCustomFallback(m03);
                }
            }
            return customFallbackBuilder.setStyle(l0(m02, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // k3.d
    public final Typeface t(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // k3.d
    public final h0.i z(h0.i[] iVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
