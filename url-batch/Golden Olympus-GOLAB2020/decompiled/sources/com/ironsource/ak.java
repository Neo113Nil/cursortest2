package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ak extends jm, ki {
    void a(Context context, boolean z4);

    void a(Map<String, String> map);

    void a(boolean z4);

    String b(Context context);

    void b();

    void c();

    void d();

    boolean e(String str);

    InterstitialPlacement g(String str);

    void h(String str);

    Placement i(String str);
}
