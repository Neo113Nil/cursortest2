package com.startapp.sdk.internal;

import java.util.Comparator;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ea implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final String f225a;

    public ea(String str) {
        this.f225a = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object opt = ((JSONObject) obj).opt(this.f225a);
        Object opt2 = ((JSONObject) obj2).opt(this.f225a);
        if ((opt instanceof Comparable) && (opt2 instanceof Comparable)) {
            if (opt.getClass() == opt2.getClass()) {
                return ((Comparable) opt).compareTo(opt2);
            }
            if ((opt instanceof Number) && (opt2 instanceof Number)) {
                return Double.compare(((Number) opt).doubleValue(), ((Number) opt2).doubleValue());
            }
        }
        Object obj3 = JSONObject.NULL;
        if (opt == obj3) {
            opt = null;
        }
        if (opt2 == obj3) {
            opt2 = null;
        }
        if (opt != null && opt2 != null) {
            return opt.toString().compareTo(opt2.toString());
        }
        if (opt != null) {
            return 1;
        }
        return opt2 != null ? -1 : 0;
    }
}
