package com.startapp.sdk.internal;

import Y1.C0120q;
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
        kotlin.jvm.internal.j.e(context, "context");
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        kotlin.jvm.internal.j.b(inputMethodSubtype);
        return da.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.j6
    public final /* bridge */ /* synthetic */ Object c() {
        return ca.f3644b;
    }

    @Override // com.startapp.sdk.internal.j6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ca a() {
        Object systemService = this.f3998a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            c2.d dVar = new c2.d(0, new String[]{currentInputMethodSubtype != null ? da.a(currentInputMethodSubtype) : null});
            List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            kotlin.jvm.internal.j.d(inputMethodList, "getInputMethodList(...)");
            Set Y2 = r2.g.Y(new r2.j(new r2.c(new r2.c(r2.g.W(new c2.d(0, new r2.f[]{dVar, new r2.l(new r2.c(r2.g.W(new r2.l(new c2.d(1, inputMethodList), new E2.o(2, inputMethodManager)), new C0120q(10)), true, new C0120q(4)), new C0120q(5))}), new C0120q(9)), false, new C0120q(12)), true, new C0120q(6))));
            if (!Y2.isEmpty()) {
                return new ca(Y2);
            }
        }
        return null;
    }

    public static final List a(InputMethodManager systemService, InputMethodInfo inputMethodInfo) {
        kotlin.jvm.internal.j.e(systemService, "$systemService");
        return systemService.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return "keyboard".equals(inputMethodSubtype.getMode());
    }

    public static final boolean a(String it) {
        kotlin.jvm.internal.j.e(it, "it");
        return it.length() > 0;
    }
}
