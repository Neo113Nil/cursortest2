package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class i implements DynamiteModule.b {
    i() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        nVar.f2507a = mVar.b(context, str);
        int a7 = mVar.a(context, str, true);
        nVar.f2508b = a7;
        int i7 = nVar.f2507a;
        if (i7 == 0) {
            if (a7 == 0) {
                nVar.f2509c = 0;
                return nVar;
            }
            i7 = 0;
        }
        if (a7 >= i7) {
            nVar.f2509c = 1;
        } else {
            nVar.f2509c = -1;
        }
        return nVar;
    }
}
