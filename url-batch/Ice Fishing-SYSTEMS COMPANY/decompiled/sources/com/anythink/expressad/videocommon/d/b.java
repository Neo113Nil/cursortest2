package com.anythink.expressad.videocommon.d;

import android.text.TextUtils;
import com.anythink.core.common.a.b;
import com.anythink.core.common.u.a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f22509a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f22510b = false;

    public b(final Map<String, Object> map, String str) {
        this.f22509a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map != null) {
            map.put(b.C0073b.f12265a, 4);
        }
        com.anythink.core.common.u.a.a().a(str, new a.InterfaceC0098a() { // from class: com.anythink.expressad.videocommon.d.b.1
            @Override // com.anythink.core.common.u.a.InterfaceC0098a
            public final void a(String str2) {
                if (!b.this.f22509a.equals(str2) || b.this.f22510b) {
                    return;
                }
                Map map2 = map;
                if (map2 != null) {
                    map2.put(b.C0073b.f12265a, 3);
                }
                b.this.a(false, "", 0.0f);
            }
        });
    }

    @Override // com.anythink.expressad.videocommon.d.a
    public void a(boolean z8, String str, float f6) {
        if (this.f22510b) {
            return;
        }
        this.f22510b = true;
    }
}
