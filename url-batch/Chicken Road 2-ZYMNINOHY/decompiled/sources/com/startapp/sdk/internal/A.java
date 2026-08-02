package com.startapp.sdk.internal;

import android.view.inputmethod.InputMethodSubtype;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6611a;

    public /* synthetic */ A(int i4) {
        this.f6611a = i4;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object it) {
        switch (this.f6611a) {
            case 0:
                return Boolean.valueOf(ea.a((InputMethodSubtype) it));
            case 1:
                return ea.b((InputMethodSubtype) it);
            case 2:
                return Boolean.valueOf(ea.a((String) it));
            case 3:
                return o7.a(((Boolean) it).booleanValue());
            case 4:
                kotlin.jvm.internal.i.e(it, "it");
                return Integer.valueOf(r3.d.f15202a.a() + 65536);
            case 5:
                v3.j it2 = (v3.j) it;
                kotlin.jvm.internal.i.e(it2, "it");
                return it2.iterator();
            case 6:
                Iterable it3 = (Iterable) it;
                kotlin.jvm.internal.i.e(it3, "it");
                return it3.iterator();
            case 7:
                return it;
            default:
                return Boolean.valueOf(it == null);
        }
    }
}
