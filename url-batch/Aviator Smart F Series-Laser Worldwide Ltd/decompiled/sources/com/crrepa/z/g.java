package com.crrepa.z;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    static final String f14072a = "NO_TAG";

    @Override // com.crrepa.z.f
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        l.a(str2);
        if (str == null) {
            str = f14072a;
        }
        Log.println(i8, str, str2);
    }
}
