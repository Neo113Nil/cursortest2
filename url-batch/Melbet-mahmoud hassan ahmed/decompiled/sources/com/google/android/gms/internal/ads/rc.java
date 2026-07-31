package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rc extends qd {

    /* renamed from: j, reason: collision with root package name */
    private static final rd<String> f11100j = new rd<>();

    /* renamed from: i, reason: collision with root package name */
    private final Context f11101i;

    public rc(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8, Context context) {
        super(gcVar, "t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", j8Var, i7, 29);
        this.f11101i = context;
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        this.f10653e.d0("E");
        AtomicReference<String> a7 = f11100j.a(this.f11101i.getPackageName());
        if (a7.get() == null) {
            synchronized (a7) {
                if (a7.get() == null) {
                    a7.set((String) this.f10654f.invoke(null, this.f11101i));
                }
            }
        }
        String str = a7.get();
        synchronized (this.f10653e) {
            this.f10653e.d0(q9.a(str.getBytes(), true));
        }
    }
}
