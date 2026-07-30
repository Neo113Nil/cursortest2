package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2810Ui implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28063n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2827Vi f28064u;

    public C2810Ui(C2827Vi c2827Vi, int i) {
        this.f28063n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c2827Vi);
                this.f28064u = c2827Vi;
                break;
            default:
                Objects.requireNonNull(c2827Vi);
                this.f28064u = c2827Vi;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        switch (this.f28063n) {
            case 0:
                C2827Vi c2827Vi = this.f28064u;
                c2827Vi.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(c2827Vi.f28283a)) {
                        c2827Vi.f28285c.execute(new RunnableC3068d(28, this));
                        break;
                    }
                }
                break;
            default:
                C2827Vi c2827Vi2 = this.f28064u;
                c2827Vi2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(c2827Vi2.f28283a)) {
                        c2827Vi2.f28285c.execute(new RunnableC3068d(29, this));
                        break;
                    }
                }
                break;
        }
    }
}
