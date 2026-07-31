package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class z70 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14991a;

    public z70(Context context) {
        this.f14991a = context;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        char c7;
        if (y2.t.o().z(this.f14991a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c7 = 2;
                }
                c7 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c7 = 1;
                }
                c7 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c7 = 0;
                }
                c7 = 65535;
            }
            if (c7 == 0) {
                y2.t.o().r(this.f14991a, str2);
                return;
            }
            if (c7 == 1) {
                y2.t.o().s(this.f14991a, str2);
            } else if (c7 != 2) {
                io0.d("logScionEvent gmsg contained unsupported eventName");
            } else {
                y2.t.o().p(this.f14991a, str2);
            }
        }
    }
}
