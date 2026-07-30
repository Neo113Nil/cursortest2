package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.UserManager;
import android.util.Log;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class kl3 {
    public static kl3 e;
    public static final kl3 f;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;

    static {
        Object obj = null;
        f = new kl3(1, obj, obj, true);
    }

    public kl3(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.c = new Object();
                break;
            default:
                this.b = false;
                this.c = null;
                this.d = null;
                break;
        }
    }

    public static kl3 d(Context context) {
        kl3 kl3Var;
        synchronized (kl3.class) {
            try {
                if (e == null) {
                    e = iv1.p(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new kl3(context) : new kl3(0);
                }
                kl3 kl3Var2 = e;
                if (kl3Var2 != null && ((il3) kl3Var2.d) != null && !kl3Var2.b) {
                    try {
                        context.getContentResolver().registerContentObserver(rk3.a, true, (il3) e.d);
                        kl3 kl3Var3 = e;
                        kl3Var3.getClass();
                        kl3Var3.b = true;
                    } catch (SecurityException e2) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                    }
                }
                kl3Var = e;
                kl3Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return kl3Var;
    }

    public void a(ce ceVar, kt2 kt2Var) {
        ot2 ot2Var = (ot2) ((at0) this.d).m;
        ot2Var.getClass();
        ta3 ta3Var = (ta3) ((za3) ceVar).t();
        st2 st2Var = (st2) ot2Var.n;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(ta3Var.i);
        int i = fa3.a;
        if (st2Var == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            st2Var.writeToParcel(obtain, 0);
        }
        try {
            ta3Var.h.transact(1, obtain, null, 1);
            obtain.recycle();
            kt2Var.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public int b() {
        gn gnVar = (gn) this.d;
        int i = gnVar.b;
        int i2 = gnVar.c;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public String c() {
        return (String) this.c;
    }

    public void e(kr3 kr3Var) {
        synchronized (this.c) {
            try {
                if (((ArrayDeque) this.d) == null) {
                    this.d = new ArrayDeque();
                }
                ((ArrayDeque) this.d).add(kr3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String f(String str) {
        Object u;
        int i;
        boolean z;
        Context context = (Context) this.c;
        if (context != null) {
            boolean z2 = true;
            if (!yk3.n) {
                synchronized (yk3.class) {
                    try {
                        if (!yk3.n) {
                            i = 1;
                            while (true) {
                                z = false;
                                if (i <= 2) {
                                    if (yk3.m == null) {
                                        yk3.m = (UserManager) context.getSystemService(UserManager.class);
                                    }
                                    UserManager userManager = yk3.m;
                                    if (userManager != null) {
                                        if (userManager.isUserUnlocked()) {
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z) {
                                yk3.m = null;
                            }
                            if (z) {
                                yk3.n = true;
                            }
                            z2 = z;
                        }
                    } catch (NullPointerException e2) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                        yk3.m = null;
                        i++;
                    } finally {
                    }
                }
            }
            if (z2) {
                try {
                    try {
                        tt1 tt1Var = new tt1(25, this, str);
                        try {
                            u = tt1Var.u();
                        } catch (SecurityException unused) {
                            long clearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                u = tt1Var.u();
                            } finally {
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                            }
                        }
                        return (String) u;
                    } catch (SecurityException e3) {
                        e = e3;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                        return null;
                    }
                } catch (IllegalStateException e4) {
                    e = e4;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                } catch (NullPointerException e5) {
                    e = e5;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            }
        }
        return null;
    }

    public void g(jt2 jt2Var) {
        kr3 kr3Var;
        synchronized (this.c) {
            if (((ArrayDeque) this.d) != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.c) {
                        try {
                            kr3Var = (kr3) ((ArrayDeque) this.d).poll();
                            if (kr3Var == null) {
                                this.b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    kr3Var.a(jt2Var);
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.b);
                sb.append(", crossed=");
                int b = b();
                sb.append(b != 1 ? b != 2 ? b != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
                sb.append(", info=\n\t");
                sb.append((gn) this.d);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kl3(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    public kl3(at0 at0Var, mk0[] mk0VarArr, boolean z) {
        this.a = 3;
        this.d = at0Var;
        this.c = mk0VarArr;
        boolean z2 = false;
        if (mk0VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
    }

    public kl3(Context context) {
        this.a = 0;
        this.b = false;
        this.c = context;
        this.d = new il3(null);
    }
}
