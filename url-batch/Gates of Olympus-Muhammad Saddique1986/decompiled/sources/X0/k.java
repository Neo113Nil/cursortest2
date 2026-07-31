package X0;

import O2.l;
import a1.C0243b;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends l {
    public static int x0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // O2.l
    public final Typeface U(Context context, C0243b[] c0243bArr) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0243b c0243b : c0243bArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0243b.f4738a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0243b.f4740c).setSlant(c0243b.f4741d ? 1 : 0).setTtcIndex(c0243b.f4739b).build();
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
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            FontStyle fontStyle = new FontStyle(400, 0);
            Font font = build2.getFont(0);
            int x02 = x0(fontStyle, font.getStyle());
            for (int i3 = 1; i3 < build2.getSize(); i3++) {
                Font font2 = build2.getFont(i3);
                int x03 = x0(fontStyle, font2.getStyle());
                if (x03 < x02) {
                    font = font2;
                    x02 = x03;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // O2.l
    public final Typeface V(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // O2.l
    public final C0243b a0(C0243b[] c0243bArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
