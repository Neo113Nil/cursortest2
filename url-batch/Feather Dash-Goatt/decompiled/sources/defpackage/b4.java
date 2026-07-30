package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b4 implements Runnable {
    public final /* synthetic */ int d;
    public final Object e;

    public b4(cs1 cs1Var, jj jjVar) {
        this.d = 5;
        this.e = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d4 d4Var = (d4) this.e;
                d4Var.removeCallbacks(this);
                MotionEvent motionEvent = d4Var.w0;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    d4Var.H(motionEvent, i, d4Var.x0, false);
                    return;
                }
                return;
            case 1:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 2:
                ((es1) this.e).h();
                return;
            case 3:
                b8 b8Var = ((es1) ((nq0) this.e).e).c;
                b8Var.c(b8Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 4:
                ((ps1) this.e).i.a(new fm(4));
                return;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                throw null;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ao1 ao1Var = (ao1) this.e;
                synchronized (ao1Var.a) {
                    try {
                        if (ao1Var.b()) {
                            Log.e("WakeLock", String.valueOf(ao1Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            ao1Var.d();
                            if (ao1Var.b()) {
                                ao1Var.c = 1;
                                ao1Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                if (((ng1) this.e).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                synchronized (((iu1) this.e).g) {
                    ((lr0) ((iu1) this.e).h).a();
                }
                return;
        }
    }

    public /* synthetic */ b4(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
