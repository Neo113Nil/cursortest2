package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vi extends vh {
    @Override // defpackage.vh
    protected final Font e(wh whVar) {
        Font c;
        Font.Builder fontVariationSettings;
        Font build;
        String authority = whVar.a() ? ((Uri) whVar.f).getAuthority() : null;
        if (authority == null) {
            return null;
        }
        Typeface create = Typeface.create(authority, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            create = null;
        }
        if (create == null || (c = vd.c(create)) == null) {
            return null;
        }
        String str = whVar.d;
        if (TextUtils.isEmpty(str)) {
            return c;
        }
        try {
            fontVariationSettings = new Font.Builder(c).setFontVariationSettings(str);
            build = fontVariationSettings.build();
            return build;
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
