package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ew2 extends sv2 implements dh0, eh0 {
    public static final ov2 dgRBjINgWbAK = gw2.PxuCJdSBwIXG;
    public r52 OPXfSBeufaJ8;
    public final Set RAsUl2FVSrh6;
    public final Context Y1f8riQaR6yg;
    public final ov2 a92UlCVFR9N8;
    public final Handler e9gEMXR7LXtO;
    public final mk rtx2ld2ELZv4;
    public wv2 wdg6QnbFHrFF;

    public ew2(Context context, sw2 sw2Var, mk mkVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.Y1f8riQaR6yg = context;
        this.e9gEMXR7LXtO = sw2Var;
        this.rtx2ld2ELZv4 = mkVar;
        this.RAsUl2FVSrh6 = mkVar.PxuCJdSBwIXG;
        this.a92UlCVFR9N8 = dgRBjINgWbAK;
    }

    @Override // defpackage.dh0
    public final void PxuCJdSBwIXG(int i) {
        wv2 wv2Var = this.wdg6QnbFHrFF;
        uv2 uv2Var = (uv2) wv2Var.cpQdD2nAriOS.wdg6QnbFHrFF.get(wv2Var.OPXfSBeufaJ8);
        if (uv2Var != null) {
            if (uv2Var.dgRBjINgWbAK) {
                uv2Var.gPXPFXrUH4XX(new xq(17));
            } else {
                uv2Var.PxuCJdSBwIXG(i);
            }
        }
    }

    @Override // defpackage.dh0
    public final void Y1f8riQaR6yg() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        r52 r52Var = this.OPXfSBeufaJ8;
        r52Var.getClass();
        boolean z = false;
        try {
            r52Var.IAToe7bXGz4N.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = r52Var.TSizfFm2Yiuu;
                    ReentrantLock reentrantLock = z92.TSizfFm2Yiuu;
                    jh0.x50lh2ztY7Y5(context);
                    ReentrantLock reentrantLock2 = z92.TSizfFm2Yiuu;
                    reentrantLock2.lock();
                    try {
                        if (z92.Y1f8riQaR6yg == null) {
                            z92.Y1f8riQaR6yg = new z92(context.getApplicationContext());
                        }
                        z92 z92Var = z92.Y1f8riQaR6yg;
                        reentrantLock2.unlock();
                        String PxuCJdSBwIXG = z92Var.PxuCJdSBwIXG("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(PxuCJdSBwIXG)) {
                            String PxuCJdSBwIXG2 = z92Var.PxuCJdSBwIXG("googleSignInAccount:" + PxuCJdSBwIXG);
                            if (PxuCJdSBwIXG2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.PxuCJdSBwIXG(PxuCJdSBwIXG2);
                                } catch (JSONException unused) {
                                }
                                Integer num = r52Var.jyegZNwi31qc;
                                jh0.x50lh2ztY7Y5(num);
                                rw2 rw2Var = new rw2(2, account, num.intValue(), googleSignInAccount);
                                iw2 iw2Var = (iw2) r52Var.BRwzKIf41E4i();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(iw2Var.Y1f8riQaR6yg);
                                int i = aw2.PxuCJdSBwIXG;
                                obtain.writeInt(1);
                                int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(obtain, 20293);
                                ki0.JTxCbbCwomzt(obtain, 1, 4);
                                obtain.writeInt(1);
                                ki0.yQRudnv4La6p(obtain, 2, rw2Var, 0);
                                ki0.PsecLrZVVK61(obtain, D0aTLcX6Uhyo);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                iw2Var.TSizfFm2Yiuu.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                iw2Var.TSizfFm2Yiuu.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = r52Var.jyegZNwi31qc;
            jh0.x50lh2ztY7Y5(num2);
            rw2 rw2Var2 = new rw2(2, account, num2.intValue(), googleSignInAccount);
            iw2 iw2Var2 = (iw2) r52Var.BRwzKIf41E4i();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(iw2Var2.Y1f8riQaR6yg);
            int i2 = aw2.PxuCJdSBwIXG;
            obtain.writeInt(1);
            int D0aTLcX6Uhyo2 = ki0.D0aTLcX6Uhyo(obtain, 20293);
            ki0.JTxCbbCwomzt(obtain, 1, 4);
            obtain.writeInt(1);
            ki0.yQRudnv4La6p(obtain, 2, rw2Var2, 0);
            ki0.PsecLrZVVK61(obtain, D0aTLcX6Uhyo2);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.e9gEMXR7LXtO.post(new sh(6, this, new nw2(1, new xq(8, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.eh0
    public final void lS5Rgt96tfkO(xq xqVar) {
        this.wdg6QnbFHrFF.PxuCJdSBwIXG(xqVar);
    }
}
