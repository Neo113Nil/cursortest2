package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class f52 {

    /* renamed from: c, reason: collision with root package name */
    private ur2 f5005c = null;

    /* renamed from: d, reason: collision with root package name */
    private rr2 f5006d = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, tv> f5004b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List<tv> f5003a = Collections.synchronizedList(new ArrayList());

    public final oa1 a() {
        return new oa1(this.f5006d, "", this, this.f5005c);
    }

    public final List<tv> b() {
        return this.f5003a;
    }

    public final void c(rr2 rr2Var) {
        String str = rr2Var.f11401x;
        if (this.f5004b.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = rr2Var.f11400w.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, rr2Var.f11400w.getString(next));
            } catch (JSONException unused) {
            }
        }
        tv tvVar = new tv(rr2Var.F, 0L, null, bundle);
        this.f5003a.add(tvVar);
        this.f5004b.put(str, tvVar);
    }

    public final void d(rr2 rr2Var, long j7, cv cvVar) {
        String str = rr2Var.f11401x;
        if (this.f5004b.containsKey(str)) {
            if (this.f5006d == null) {
                this.f5006d = rr2Var;
            }
            tv tvVar = this.f5004b.get(str);
            tvVar.f12384g = j7;
            tvVar.f12385h = cvVar;
        }
    }

    public final void e(ur2 ur2Var) {
        this.f5005c = ur2Var;
    }
}
