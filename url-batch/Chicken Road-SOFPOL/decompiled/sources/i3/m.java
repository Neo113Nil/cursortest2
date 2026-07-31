package i3;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends l {
    @Override // i3.l
    public final Font Z(n3.h hVar) {
        Font d8;
        Uri uri = hVar.f5359a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = hVar.f5363e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d8 = g.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d8;
                }
                try {
                    return new Font.Builder(d8).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
