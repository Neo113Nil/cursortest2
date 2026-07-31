package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class sg0 implements tg0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11811b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static boolean f11812c = false;

    /* renamed from: d, reason: collision with root package name */
    static boolean f11813d = false;

    /* renamed from: a, reason: collision with root package name */
    gy2 f11814a;

    @Override // com.google.android.gms.internal.ads.tg0
    public final String a(Context context) {
        if (!((Boolean) sw.c().b(m10.B3)).booleanValue()) {
            return null;
        }
        try {
            b(context);
            String valueOf = String.valueOf(this.f11814a.e());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e7) {
            io0.i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    final void b(Context context) {
        synchronized (f11811b) {
            if (((Boolean) sw.c().b(m10.B3)).booleanValue() && !f11813d) {
                try {
                    f11813d = true;
                    this.f11814a = (gy2) no0.b(context, "com.google.android.gms.ads.omid.DynamiteOmid", new lo0() { // from class: com.google.android.gms.internal.ads.rg0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.lo0
                        public final Object c(Object obj) {
                            return fy2.s6(obj);
                        }
                    });
                } catch (mo0 e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void g0(x3.a aVar) {
        synchronized (f11811b) {
            if (((Boolean) sw.c().b(m10.B3)).booleanValue() && f11812c) {
                try {
                    this.f11814a.x0(aVar);
                } catch (RemoteException | NullPointerException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void h0(x3.a aVar, View view) {
        synchronized (f11811b) {
            if (((Boolean) sw.c().b(m10.B3)).booleanValue() && f11812c) {
                try {
                    this.f11814a.H0(aVar, x3.b.B3(view));
                } catch (RemoteException | NullPointerException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final x3.a i0(String str, WebView webView, String str2, String str3, String str4, vg0 vg0Var, ug0 ug0Var, String str5) {
        synchronized (f11811b) {
            try {
                try {
                    if (((Boolean) sw.c().b(m10.B3)).booleanValue() && f11812c) {
                        try {
                            return this.f11814a.Q2(str, x3.b.B3(webView), "", "javascript", str4, "Google", vg0Var.toString(), ug0Var.toString(), str5);
                        } catch (RemoteException | NullPointerException e7) {
                            io0.i("#007 Could not call remote method.", e7);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final x3.a j0(String str, WebView webView, String str2, String str3, String str4, String str5, vg0 vg0Var, ug0 ug0Var, String str6) {
        synchronized (f11811b) {
            try {
                try {
                    if (((Boolean) sw.c().b(m10.B3)).booleanValue() && f11812c) {
                        try {
                            return this.f11814a.m4(str, x3.b.B3(webView), "", "javascript", str4, str5, vg0Var.toString(), ug0Var.toString(), str6);
                        } catch (RemoteException | NullPointerException e7) {
                            io0.i("#007 Could not call remote method.", e7);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final boolean k0(Context context) {
        synchronized (f11811b) {
            if (!((Boolean) sw.c().b(m10.B3)).booleanValue()) {
                return false;
            }
            if (f11812c) {
                return true;
            }
            try {
                b(context);
                boolean U = this.f11814a.U(x3.b.B3(context));
                f11812c = U;
                return U;
            } catch (RemoteException e7) {
                e = e7;
                io0.i("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e8) {
                e = e8;
                io0.i("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void l0(x3.a aVar, View view) {
        synchronized (f11811b) {
            if (((Boolean) sw.c().b(m10.B3)).booleanValue() && f11812c) {
                try {
                    this.f11814a.i2(aVar, x3.b.B3(view));
                } catch (RemoteException | NullPointerException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tg0
    public final void zze(x3.a aVar) {
        synchronized (f11811b) {
            if (((Boolean) sw.c().b(m10.B3)).booleanValue() && f11812c) {
                try {
                    this.f11814a.Y(aVar);
                } catch (RemoteException | NullPointerException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        }
    }
}
