package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int b7 = mVar.b(context, str);
        nVar.f2507a = b7;
        if (b7 != 0) {
            nVar.f2509c = -1;
        } else {
            int a7 = mVar.a(context, str, true);
            nVar.f2508b = a7;
            if (a7 != 0) {
                nVar.f2509c = 1;
            }
        }
        return nVar;
    }
}
