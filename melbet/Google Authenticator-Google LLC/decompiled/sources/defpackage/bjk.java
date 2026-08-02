package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjk implements bbo {
    @Override // defpackage.bax
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bbl bblVar) {
        try {
            blv.c(((bjj) ((bdv) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.bbo
    public final int b() {
        return 1;
    }
}
