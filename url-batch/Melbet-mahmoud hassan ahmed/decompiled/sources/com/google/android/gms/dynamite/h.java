package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final n a(Context context, String str, m mVar) {
        n nVar = new n();
        int b7 = mVar.b(context, str);
        nVar.f2507a = b7;
        int i7 = 0;
        int a7 = b7 != 0 ? mVar.a(context, str, false) : mVar.a(context, str, true);
        nVar.f2508b = a7;
        int i8 = nVar.f2507a;
        if (i8 != 0) {
            i7 = i8;
        } else if (a7 == 0) {
            nVar.f2509c = 0;
            return nVar;
        }
        if (i7 >= a7) {
            nVar.f2509c = -1;
        } else {
            nVar.f2509c = 1;
        }
        return nVar;
    }
}
