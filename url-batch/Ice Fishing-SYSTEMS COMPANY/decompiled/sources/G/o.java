package G;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class o extends com.bumptech.glide.d {
    public static Font B(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? com.anythink.core.common.m.a.f14558n : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int C7 = C(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int C8 = C(fontStyle, font2.getStyle());
            if (C8 < C7) {
                font = font2;
                C7 = C8;
            }
        }
        return font;
    }

    public static int C(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.bumptech.glide.d
    public final Typeface h(Context context, F.g gVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (F.h hVar : gVar.f911a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f917f).setWeight(hVar.f913b).setSlant(hVar.f914c ? 1 : 0).setTtcIndex(hVar.f916e).setFontVariationSettings(hVar.f915d).build();
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
            return new Typeface.CustomFallbackBuilder(build2).setStyle(B(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.bumptech.glide.d
    public final Typeface i(Context context, L.h[] hVarArr, int i) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = hVarArr.length;
            FontFamily.Builder builder = null;
            while (i4 < length) {
                L.h hVar = hVarArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(hVar.f1686a, com.anythink.expressad.foundation.d.d.bv, null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i4 = openFileDescriptor == null ? i4 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(hVar.f1688c).setSlant(hVar.f1689d ? 1 : 0).setTtcIndex(hVar.f1687b).build();
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
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(B(build2, i).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // com.bumptech.glide.d
    public final Typeface j(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.bumptech.glide.d
    public final Typeface k(Context context, Resources resources, int i, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.d
    public final L.h l(L.h[] hVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
