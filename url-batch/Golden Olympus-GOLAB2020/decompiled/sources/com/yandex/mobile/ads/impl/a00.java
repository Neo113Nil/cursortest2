package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.wy;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a00 implements vo1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23108a;

    /* renamed from: b, reason: collision with root package name */
    private final uz f23109b = new uz();

    /* renamed from: c, reason: collision with root package name */
    private wu0 f23110c = wu0.f34184a;

    public a00(Context context) {
        this.f23108a = context;
    }

    @Override // com.yandex.mobile.ads.impl.vo1
    public final so1[] a(Handler handler, kf2 kf2Var, InterfaceC1999ih interfaceC1999ih, i42 i42Var, a01 a01Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dv0(this.f23108a, this.f23109b, this.f23110c, handler, kf2Var));
        wy a4 = new wy.e().a(C1904eh.a(this.f23108a)).c().b().d().a();
        arrayList.add(new pu0(this.f23108a, this.f23109b, this.f23110c, handler, interfaceC1999ih, a4));
        arrayList.add(new j42(i42Var, handler.getLooper()));
        arrayList.add(new b01(a01Var, handler.getLooper()));
        arrayList.add(new gn());
        return (so1[]) arrayList.toArray(new so1[0]);
    }
}
