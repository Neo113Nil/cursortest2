package B;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends l {
    @Override // B.l
    public final Font V(F.k kVar) {
        Font d7;
        Uri uri = kVar.f744a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = kVar.f748e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d7 = g.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d7;
                }
                try {
                    return new Font.Builder(d7).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
