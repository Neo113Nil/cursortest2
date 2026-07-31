package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.fh;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes2.dex */
public class u5 {

    /* renamed from: a, reason: collision with root package name */
    public static u5 f19881a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19882a;

        static {
            int[] iArr = new int[fh.a.values().length];
            f19882a = iArr;
            try {
                iArr[fh.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19882a[fh.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19882a[fh.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static u5 a() {
        u5 u5Var = f19881a;
        return u5Var == null ? new u5() : u5Var;
    }

    public boolean a(Activity activity) {
        if (a.f19882a[jk.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) wj.b((Context) activity).a().j();
            if (vVar == null) {
                return true;
            }
            vVar.k("back");
            return true;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return false;
        }
    }
}
