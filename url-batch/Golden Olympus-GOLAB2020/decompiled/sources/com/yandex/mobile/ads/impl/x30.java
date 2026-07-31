package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.w30;
import com.yandex.mobile.ads.impl.x30;

/* loaded from: classes3.dex */
public interface x30 {

    /* renamed from: a, reason: collision with root package name */
    public static final x30 f34370a = new a();

    final class a implements x30 {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.x30
        public final void a(Looper looper, ei1 ei1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.x30
        public final v30 b(w30.a aVar, yb0 yb0Var) {
            if (yb0Var.f34994p == null) {
                return null;
            }
            return new k50(new v30.a(new a82(), AuthCode.StatusCode.WAITING_CONNECT));
        }

        @Override // com.yandex.mobile.ads.impl.x30
        public final int a(yb0 yb0Var) {
            return yb0Var.f34994p != null ? 1 : 0;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34371a = new b() { // from class: com.yandex.mobile.ads.impl.Dl
            @Override // com.yandex.mobile.ads.impl.x30.b
            public final void release() {
                x30.b.b();
            }
        };

        static /* synthetic */ void b() {
        }

        void release();
    }

    int a(yb0 yb0Var);

    default b a(w30.a aVar, yb0 yb0Var) {
        return b.f34371a;
    }

    void a(Looper looper, ei1 ei1Var);

    v30 b(w30.a aVar, yb0 yb0Var);

    default void prepare() {
    }

    default void release() {
    }
}
