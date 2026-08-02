package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afy implements amd {
    public Bundle a;
    private boolean b;
    private final koi c;
    private final boe d;

    public afy(boe boeVar, agl aglVar) {
        this.d = boeVar;
        this.c = new kop(new nb(aglVar, 5));
    }

    private final afz c() {
        return (afz) this.c.a();
    }

    @Override // defpackage.amd
    public final Bundle a() {
        Bundle h = pk.h((kol[]) Arrays.copyOf(new kol[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            h.putAll(bundle);
        }
        for (Map.Entry entry : c().a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((afr) entry.getValue()).a().a();
            if (!a.isEmpty()) {
                amf.a(h, str, a);
            }
        }
        this.b = false;
        return h;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle a = this.d.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle h = pk.h((kol[]) Arrays.copyOf(new kol[0], 0));
        Bundle bundle = this.a;
        if (bundle != null) {
            h.putAll(bundle);
        }
        if (a != null) {
            h.putAll(a);
        }
        this.a = h;
        this.b = true;
        c();
    }
}
