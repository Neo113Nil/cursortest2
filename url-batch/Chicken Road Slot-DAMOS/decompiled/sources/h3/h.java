package h3;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class h extends a.a {
    public static Font i0(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int l02 = l0(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int l03 = l0(fontStyle, font2.getStyle());
            if (l03 < l02) {
                font = font2;
                l02 = l03;
            }
        }
        return font;
    }

    public static int l0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily j0(l3.h[] hVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (l3.h hVar : hVarArr) {
            if (Objects.equals(hVar.f5853a.getScheme(), "systemfont")) {
                font = k0(hVar);
            } else {
                try {
                    Uri uri = hVar.f5853a;
                    str = hVar.f5857e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e2) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(hVar.f5855c).setSlant(hVar.f5856d ? 1 : 0).setTtcIndex(hVar.f5854b);
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

    public Font k0(l3.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // a.a
    public final Typeface m(Context context, g3.e eVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (g3.f fVar : eVar.f4241a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f4247f).setWeight(fVar.f4243b).setSlant(fVar.f4244c ? 1 : 0).setTtcIndex(fVar.f4246e).setFontVariationSettings(fVar.f4245d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(i0(build2, i3).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.a
    public final Typeface n(Context context, l3.h[] hVarArr, int i3) {
        try {
            FontFamily j02 = j0(hVarArr, context.getContentResolver());
            if (j02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(j02).setStyle(i0(j02, i3).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.a
    public final Typeface o(Context context, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily j02 = j0((l3.h[]) list.get(0), contentResolver);
            if (j02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(j02);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily j03 = j0((l3.h[]) list.get(i10), contentResolver);
                if (j03 != null) {
                    customFallbackBuilder.addCustomFallback(j03);
                }
            }
            return customFallbackBuilder.setStyle(i0(j02, i3).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.a
    public final Typeface p(Context context, Resources resources, int i3, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }
}
