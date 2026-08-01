package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class yc implements b7.i {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f3013i = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static volatile b8.x f3014r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3015d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3016e;

    public yc(Context context, zc zcVar) {
        this.f3015d = 0;
        this.f3016e = zcVar.u() ? pa.b(context, zcVar.t()) : zcVar.t();
    }

    @Override // b7.i
    public void accept(Object obj, Object obj2) {
        int i3 = this.f3015d;
        String str = this.f3016e;
        w7.g gVar = (w7.g) obj2;
        fa faVar = (fa) obj;
        switch (i3) {
            case 1:
                int i10 = da.f2231k;
                ba baVar = new ba(gVar);
                ea eaVar = (ea) faVar.m();
                Parcel F = eaVar.F();
                r5.c(F, baVar);
                F.writeString(str);
                F.writeString("");
                F.writeString(null);
                eaVar.G(F, 11);
                break;
            default:
                int i11 = da.f2231k;
                ba baVar2 = new ba(gVar);
                ea eaVar2 = (ea) faVar.m();
                Parcel F2 = eaVar2.F();
                r5.c(F2, baVar2);
                F2.writeString(str);
                eaVar2.G(F2, 5);
                break;
        }
    }

    public /* synthetic */ yc(String str, int i3) {
        this.f3015d = i3;
        this.f3016e = str;
    }
}
