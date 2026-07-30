package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2521Di implements InterfaceC2470Ai {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24510a;

    /* renamed from: b, reason: collision with root package name */
    public final C2748Qo f24511b;

    public /* synthetic */ C2521Di(C2748Qo c2748Qo, int i) {
        this.f24510a = i;
        this.f24511b = c2748Qo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ai
    public final void a(HashMap hashMap) {
        char c4;
        switch (this.f24510a) {
            case 0:
                String str = (String) hashMap.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    if (hashCode != 97520651) {
                        if (hashCode == 109399814 && str.equals("shake")) {
                            c4 = 0;
                        }
                        c4 = 65535;
                    } else {
                        if (str.equals("flick")) {
                            c4 = 1;
                        }
                        c4 = 65535;
                    }
                    C2748Qo c2748Qo = this.f24511b;
                    if (c4 == 0) {
                        c2748Qo.h(EnumC2697No.f26604u, true);
                        break;
                    } else if (c4 == 1) {
                        c2748Qo.h(EnumC2697No.f26605v, true);
                        break;
                    } else {
                        c2748Qo.h(EnumC2697No.f26603n, true);
                        break;
                    }
                }
                break;
            default:
                String str2 = (String) hashMap.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f24511b.b(str2.equals("true"));
                    break;
                }
                break;
        }
    }
}
