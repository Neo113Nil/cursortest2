package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wm2 extends vm2 {
    @Override // defpackage.vm2
    public final Font D0aTLcX6Uhyo(zc0 zc0Var) {
        Font Y1f8riQaR6yg;
        Uri uri = zc0Var.PxuCJdSBwIXG;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = zc0Var.e9gEMXR7LXtO;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (Y1f8riQaR6yg = pm2.Y1f8riQaR6yg(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return Y1f8riQaR6yg;
                }
                try {
                    return new Font.Builder(Y1f8riQaR6yg).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
