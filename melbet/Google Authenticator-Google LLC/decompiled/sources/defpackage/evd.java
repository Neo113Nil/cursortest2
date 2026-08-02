package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evd {
    public final boolean a;
    public final hfm c;
    private final gzf d;
    private volatile String e = null;
    public final boolean b = false;

    public evd(gzf gzfVar, boolean z, hfm hfmVar) {
        this.d = gzfVar;
        this.a = z;
        this.c = hfmVar;
    }

    final String a(Context context) {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.d.a(context);
        this.e = str2;
        return str2;
    }
}
