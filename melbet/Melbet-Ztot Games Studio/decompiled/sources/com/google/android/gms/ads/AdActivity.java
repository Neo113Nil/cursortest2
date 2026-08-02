package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbsn zza;

    private final void zza() {
        zzbsn zzbsnVar = this.zza;
        if (zzbsnVar != null) {
            try {
                zzbsnVar.zzx();
            } catch (RemoteException e) {
                zzm.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzh(i, i2, intent);
            }
        } catch (Exception e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                if (!zzbsnVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbsn zzbsnVar2 = this.zza;
            if (zzbsnVar2 != null) {
                zzbsnVar2.zzi();
            }
        } catch (RemoteException e2) {
            zzm.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbsn zzo = zzay.zza().zzo(this);
        this.zza = zzo;
        if (zzo == null) {
            zzm.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzo.zzl(bundle);
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzm();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzo();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzq();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzr();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzs(bundle);
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzt();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzu();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsn zzbsnVar = this.zza;
            if (zzbsnVar != null) {
                zzbsnVar.zzv();
            }
        } catch (RemoteException e) {
            zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
