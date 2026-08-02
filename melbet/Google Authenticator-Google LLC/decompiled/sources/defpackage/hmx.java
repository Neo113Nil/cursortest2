package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hmx extends hlw {
    private final String a;

    protected hmx(String str) {
        this.a = str;
    }

    @Override // defpackage.hlw
    public void a(RuntimeException runtimeException, hlu hluVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    @Override // defpackage.hlw
    public String d() {
        return this.a;
    }
}
