package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f10516a;

    /* renamed from: b, reason: collision with root package name */
    private a f10517b;

    public interface a {
        void a(int i8, int i9, int i10, Bundle bundle);
    }

    public static j a() {
        if (f10516a == null) {
            synchronized (j.class) {
                try {
                    if (f10516a == null) {
                        f10516a = new j();
                    }
                } finally {
                }
            }
        }
        return f10516a;
    }

    public void a(int i8, int i9, int i10, Bundle bundle) {
        a aVar = this.f10517b;
        if (aVar != null) {
            aVar.a(i8, i9, i10, bundle);
        }
    }
}
