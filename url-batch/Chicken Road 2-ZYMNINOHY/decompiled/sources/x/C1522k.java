package x;

import B.l;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1522k extends C1521j {
    @Override // x.C1521j
    public final Font J(l lVar) {
        Font d4;
        Uri uri = lVar.f178a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = lVar.f182e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d4 = AbstractC1516e.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d4;
                }
                try {
                    return new Font.Builder(d4).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
