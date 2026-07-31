package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.zg0;
import x3.b;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: f, reason: collision with root package name */
    private zg0 f2405f;

    private final void a() {
        zg0 zg0Var = this.f2405f;
        if (zg0Var != null) {
            try {
                zg0Var.x();
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i7, int i8, @RecentlyNonNull Intent intent) {
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.j5(i7, i8, intent);
            }
        } catch (Exception e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                if (!zg0Var.M()) {
                    return;
                }
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        super.onBackPressed();
        try {
            zg0 zg0Var2 = this.f2405f;
            if (zg0Var2 != null) {
                zg0Var2.f();
            }
        } catch (RemoteException e8) {
            io0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.d0(b.B3(configuration));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zg0 i7 = qw.a().i(this);
        this.f2405f = i7;
        if (i7 != null) {
            try {
                i7.P2(bundle);
                return;
            } catch (RemoteException e7) {
                e = e7;
            }
        } else {
            e = null;
        }
        io0.i("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.k();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.m();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.n();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.l();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.L(bundle);
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.t();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.p();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zg0 zg0Var = this.f2405f;
            if (zg0Var != null) {
                zg0Var.q();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        super.setContentView(i7);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
