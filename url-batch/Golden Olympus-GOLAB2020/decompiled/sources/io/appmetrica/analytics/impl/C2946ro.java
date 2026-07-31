package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2946ro implements InterfaceC2921qo {

    /* renamed from: a, reason: collision with root package name */
    public final V8 f39760a;

    public C2946ro() {
        this(new V8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2921qo
    @NonNull
    public final byte[] a(@NonNull C2647g9 c2647g9, @NonNull C3095xh c3095xh) {
        if (!((C2953s5) c3095xh.f40185l).A() && !TextUtils.isEmpty(c2647g9.f39057b)) {
            try {
                JSONObject jSONObject = new JSONObject(c2647g9.f39057b);
                jSONObject.remove("preloadInfo");
                c2647g9.f39057b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f39760a.a(c2647g9, c3095xh);
    }

    public C2946ro(V8 v8) {
        this.f39760a = v8;
    }
}
