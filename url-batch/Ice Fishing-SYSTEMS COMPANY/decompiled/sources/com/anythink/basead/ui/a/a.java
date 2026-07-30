package com.anythink.basead.ui.a;

import android.view.View;
import com.anythink.basead.ui.a.a.c;
import com.anythink.basead.ui.a.a.d;
import com.anythink.basead.ui.a.a.e;
import com.anythink.basead.ui.a.a.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10559a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10560b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10561c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10562d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10563e = 5;

    private static b a(int i, View view) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? new e(view) : new com.anythink.basead.ui.a.a.b(view) : new c(view) : new d(view) : new f(view);
    }
}
