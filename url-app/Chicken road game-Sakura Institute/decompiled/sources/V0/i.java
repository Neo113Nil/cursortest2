package V0;

import a.AbstractC0345a;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends AbstractC0345a {
    public static int Q(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0345a
    public final Typeface m(Context context, Y0.c[] cVarArr) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (Y0.c cVar : cVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cVar.f4393a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(cVar.f4395c).setSlant(cVar.f4396d ? 1 : 0).setTtcIndex(cVar.f4394b).build();
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
            int Q3 = Q(fontStyle, font.getStyle());
            for (int i2 = 1; i2 < build2.getSize(); i2++) {
                Font font2 = build2.getFont(i2);
                int Q4 = Q(fontStyle, font2.getStyle());
                if (Q4 < Q3) {
                    font = font2;
                    Q3 = Q4;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0345a
    public final Y0.c r(Y0.c[] cVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
