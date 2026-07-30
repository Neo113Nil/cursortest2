package v2;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import u3.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends q {
    public static int m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // u3.q
    public final Typeface e(Context context, y2.b[] bVarArr) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (y2.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.f9891a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.f9893c).setSlant(bVar.f9894d ? 1 : 0).setTtcIndex(bVar.f9892b).build();
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
            if (builder != null) {
                FontFamily build2 = builder.build();
                Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                FontStyle fontStyle = new FontStyle(400, 0);
                Font font = build2.getFont(0);
                int m8 = m(fontStyle, font.getStyle());
                for (int i7 = 1; i7 < build2.getSize(); i7++) {
                    Font font2 = build2.getFont(i7);
                    int m9 = m(fontStyle, font2.getStyle());
                    if (m9 < m8) {
                        font = font2;
                        m8 = m9;
                    }
                }
                return customFallbackBuilder.setStyle(font.getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // u3.q
    public final Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // u3.q
    public final y2.b g(y2.b[] bVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
