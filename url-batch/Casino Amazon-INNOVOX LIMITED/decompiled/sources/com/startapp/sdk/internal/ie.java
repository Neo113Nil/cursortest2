package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ie extends le {
    public he c;

    public ie(String str, HashMap hashMap) {
        super(str, hashMap);
    }

    @Override // com.startapp.sdk.internal.pe
    public final void a(Context context, me meVar) {
        if (this.c != null) {
            throw new IllegalStateException();
        }
        this.c = new he(this, meVar);
        IntentFilter intentFilter = new IntentFilter(this.f320a);
        int i = Build.VERSION.SDK_INT;
        he heVar = this.c;
        if (i >= 33) {
            context.registerReceiver(heVar, intentFilter, 4);
        } else {
            context.registerReceiver(heVar, intentFilter);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ie.class != obj.getClass()) {
            return false;
        }
        return zh.a(this.c, ((ie) obj).c);
    }

    public final int hashCode() {
        Object[] objArr = {this.c};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    @Override // com.startapp.sdk.internal.pe
    public final void a(Context context) {
        he heVar = this.c;
        if (heVar != null) {
            context.unregisterReceiver(heVar);
            this.c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
