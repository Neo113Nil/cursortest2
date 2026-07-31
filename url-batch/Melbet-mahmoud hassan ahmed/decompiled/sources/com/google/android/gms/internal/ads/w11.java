package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public final class w11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13659a;

    /* renamed from: b, reason: collision with root package name */
    private final a3.t1 f13660b = y2.t.p().h();

    public w11(Context context) {
        this.f13659a = context;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        String str = map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (((Boolean) sw.c().b(m10.f8265o0)).booleanValue()) {
                this.f13660b.Y(parseBoolean);
                if (((Boolean) sw.c().b(m10.E4)).booleanValue() && parseBoolean) {
                    this.f13659a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (((Boolean) sw.c().b(m10.f8225j0)).booleanValue()) {
            y2.t.o().w(bundle);
        }
    }
}
