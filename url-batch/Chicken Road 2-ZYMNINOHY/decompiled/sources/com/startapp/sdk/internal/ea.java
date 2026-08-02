package com.startapp.sdk.internal;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ea extends j6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(Context context) {
        super(context);
        kotlin.jvm.internal.i.e(context, "context");
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        kotlin.jvm.internal.i.b(inputMethodSubtype);
        return da.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.j6
    public final /* bridge */ /* synthetic */ Object c() {
        return ca.f6754b;
    }

    @Override // com.startapp.sdk.internal.j6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ca a() {
        Object systemService = this.f7124a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            d3.h hVar = new d3.h(0, new String[]{currentInputMethodSubtype != null ? da.a(currentInputMethodSubtype) : null});
            List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            kotlin.jvm.internal.i.d(inputMethodList, "getInputMethodList(...)");
            v3.j gVar = new v3.g(new v3.g(v3.k.I(new d3.h(0, new v3.j[]{hVar, new v3.q(new v3.g(v3.k.I(new v3.q(new d3.h(1, inputMethodList), new X3.n(1, inputMethodManager)), new A(6)), true, new A(0)), new A(1))}), new A(5)), false, new A(8)), true, new A(2));
            Set K2 = v3.k.K(gVar instanceof v3.d ? ((v3.d) gVar).take() : new v3.o(gVar));
            if (!K2.isEmpty()) {
                return new ca(K2);
            }
        }
        return null;
    }

    public static final List a(InputMethodManager systemService, InputMethodInfo inputMethodInfo) {
        kotlin.jvm.internal.i.e(systemService, "$systemService");
        return systemService.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return "keyboard".equals(inputMethodSubtype.getMode());
    }

    public static final boolean a(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return it.length() > 0;
    }
}
