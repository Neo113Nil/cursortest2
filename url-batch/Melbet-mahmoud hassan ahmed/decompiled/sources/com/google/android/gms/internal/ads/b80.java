package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class b80 implements t70<eu0> {

    /* renamed from: d, reason: collision with root package name */
    static final Map<String, Integer> f3280d = v3.e.b(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final y2.b f3281a;

    /* renamed from: b, reason: collision with root package name */
    private final yf0 f3282b;

    /* renamed from: c, reason: collision with root package name */
    private final fg0 f3283c;

    public b80(y2.b bVar, yf0 yf0Var, fg0 fg0Var) {
        this.f3281a = bVar;
        this.f3282b = yf0Var;
        this.f3283c = fg0Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final /* bridge */ /* synthetic */ void a(eu0 eu0Var, Map map) {
        eu0 eu0Var2 = eu0Var;
        int intValue = f3280d.get((String) map.get("a")).intValue();
        int i7 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f3281a.c()) {
                    this.f3281a.b(null);
                    return;
                }
                if (intValue == 1) {
                    this.f3282b.i(map);
                    return;
                }
                if (intValue == 3) {
                    new bg0(eu0Var2, map).i();
                    return;
                }
                if (intValue == 4) {
                    new wf0(eu0Var2, map).j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f3282b.h(true);
                        return;
                    } else if (intValue != 7) {
                        io0.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f3283c.c();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (eu0Var2 == null) {
            io0.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i7 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i7 = parseBoolean ? -1 : y2.t.r().g();
        }
        eu0Var2.I0(i7);
    }
}
