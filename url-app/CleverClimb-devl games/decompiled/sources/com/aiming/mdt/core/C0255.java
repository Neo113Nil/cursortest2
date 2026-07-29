package com.aiming.mdt.core;

import com.aiming.mdt.mediation.InitListener;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.core.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0255 implements InitListener {
    C0255() {
    }

    @Override // com.aiming.mdt.mediation.InitListener
    public final void onError(String str) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder("InitError:");
        sb.append(str);
        singleton.LogE(sb.toString());
    }

    @Override // com.aiming.mdt.mediation.InitListener
    public final void onSuccess(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Success");
        C0282.m971(sb.toString());
    }
}
