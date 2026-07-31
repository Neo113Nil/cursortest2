package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.fh;
import com.ironsource.pm;
import com.ironsource.sdk.controller.InterfaceC1562f;
import com.ironsource.t9;
import com.ironsource.u9;
import com.ironsource.v9;
import com.ironsource.va;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface l {

    public interface a {
        void a(@NotNull InterfaceC1562f.a aVar);
    }

    public interface b {
        void a(@NotNull pm pmVar);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(InterfaceC1562f.c cVar, @Nullable a aVar);

    void a(va vaVar);

    void a(va vaVar, Map<String, String> map, t9 t9Var);

    void a(va vaVar, Map<String, String> map, u9 u9Var);

    void a(String str, u9 u9Var);

    void a(String str, String str2, va vaVar, t9 t9Var);

    void a(String str, String str2, va vaVar, u9 u9Var);

    void a(String str, String str2, va vaVar, v9 v9Var);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, t9 t9Var);

    void a(JSONObject jSONObject, u9 u9Var);

    void a(JSONObject jSONObject, v9 v9Var);

    boolean a(String str);

    void b(Context context);

    void b(va vaVar);

    void b(va vaVar, Map<String, String> map, u9 u9Var);

    void b(JSONObject jSONObject);

    void d();

    void destroy();

    @Deprecated
    void e();

    void f();

    fh.c g();
}
