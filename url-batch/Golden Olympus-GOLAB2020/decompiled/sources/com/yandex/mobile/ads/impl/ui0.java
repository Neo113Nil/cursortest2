package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.vi0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class ui0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vi0 f33139b;

    ui0(vi0 vi0Var) {
        this.f33139b = vi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi0.d dVar;
        hi2 hi2Var;
        Bitmap bitmap;
        for (vi0.a aVar : this.f33139b.f33635d.values()) {
            ArrayList arrayList = aVar.f33641d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                vi0.c cVar = (vi0.c) obj;
                dVar = cVar.f33643b;
                if (dVar != null) {
                    hi2Var = aVar.f33640c;
                    if (hi2Var == null) {
                        bitmap = aVar.f33639b;
                        cVar.f33642a = bitmap;
                        dVar.a(cVar, false);
                    } else {
                        dVar.a(hi2Var);
                    }
                }
            }
        }
        this.f33139b.f33635d.clear();
        this.f33139b.f33637f = null;
    }
}
