package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.authenticator2.editotp.AccountView;
import com.google.android.apps.authenticator2.main.CountdownIndicatorView;
import com.google.android.apps.authenticator2.main.OtpView;
import com.google.android.apps.authenticator2.migration.exports.OtpForExportView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnm implements bqe, bqf, btu, btv, bvx, bvy, byp, byq, gxt, jrp {
    private final View a;
    private final bnl b;
    private final bnk c;
    private final bmx d;
    private final bnb e;

    public bnm(bnl bnlVar, bnk bnkVar, bmx bmxVar, bnb bnbVar, View view) {
        this.b = bnlVar;
        this.c = bnkVar;
        this.d = bmxVar;
        this.e = bnbVar;
        this.a = view;
    }

    @Override // defpackage.bqe
    public final bqd a() {
        View view = this.a;
        if (!(view instanceof AccountView)) {
            throw new IllegalStateException(bnq.b(view, bqd.class, "Attempt to inject a View wrapper of type "));
        }
        AccountView accountView = (AccountView) view;
        accountView.getClass();
        return new bqd(accountView, this.d.c(), (gnh) this.e.j.b());
    }

    @Override // defpackage.btu
    public final btt b() {
        Activity a = this.d.a();
        View view = this.a;
        if (!(view instanceof CountdownIndicatorView)) {
            throw new IllegalStateException(bnq.b(view, btt.class, "Attempt to inject a View wrapper of type "));
        }
        CountdownIndicatorView countdownIndicatorView = (CountdownIndicatorView) view;
        countdownIndicatorView.getClass();
        bnl bnlVar = this.b;
        bwo bwoVar = (bwo) bnlVar.mw.b();
        return new btt(a, countdownIndicatorView, bwoVar, (hvm) bnlVar.gc.b());
    }

    @Override // defpackage.bvx
    public final bvw c() {
        View view = this.a;
        if (!(view instanceof OtpView)) {
            throw new IllegalStateException(bnq.b(view, bvw.class, "Attempt to inject a View wrapper of type "));
        }
        OtpView otpView = (OtpView) view;
        otpView.getClass();
        return new bvw(otpView, this.d.c(), (gva) this.c.C.b(), (byte[]) null);
    }

    @Override // defpackage.byp
    public final byo d() {
        View view = this.a;
        if (!(view instanceof OtpForExportView)) {
            throw new IllegalStateException(bnq.b(view, byo.class, "Attempt to inject a View wrapper of type "));
        }
        OtpForExportView otpForExportView = (OtpForExportView) view;
        otpForExportView.getClass();
        return new byo(otpForExportView, this.d.c());
    }

    @Override // defpackage.gxt
    public final void i() {
        this.d.c();
    }

    @Override // defpackage.bqf
    public final void e() {
    }

    @Override // defpackage.btv
    public final void f() {
    }

    @Override // defpackage.byq
    public final void g() {
    }

    @Override // defpackage.bvy
    public final void h() {
    }
}
