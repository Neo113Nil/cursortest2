package V0;

import a.AbstractC0157a;
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
public final class k extends AbstractC0157a {
    public static int Z(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0157a
    public final Typeface s(Context context, Y0.b[] bVarArr) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (Y0.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.f3409a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.f3411c).setSlant(bVar.f3412d ? 1 : 0).setTtcIndex(bVar.f3410b).build();
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
            int Z2 = Z(fontStyle, font.getStyle());
            for (int i3 = 1; i3 < build2.getSize(); i3++) {
                Font font2 = build2.getFont(i3);
                int Z3 = Z(fontStyle, font2.getStyle());
                if (Z3 < Z2) {
                    font = font2;
                    Z2 = Z3;
                }
            }
            return customFallbackBuilder.setStyle(font.getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0157a
    public final Typeface t(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.AbstractC0157a
    public final Y0.b z(Y0.b[] bVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
