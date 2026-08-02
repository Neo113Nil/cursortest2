package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etg extends eti {
    @Override // defpackage.eti
    public final Object a(Object obj) {
        try {
            return (jop) jkp.r(jop.a, Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
