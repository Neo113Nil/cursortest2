package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzadh
/* loaded from: classes.dex */
public final class zzqr extends NativeContentAd {
    private final NativeAd.AdChoicesInfo zzbkq;
    private final zzqo zzbkr;
    private final zzpz zzbks;
    private final List<NativeAd.Image> zzbko = new ArrayList();
    private final VideoController zzasv = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        com.google.android.gms.internal.ads.zzane.zzb("", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: RemoteException -> 0x0087, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x0087, blocks: (B:30:0x0072, B:32:0x007a), top: B:29:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqr(zzqo zzqoVar) {
        zzpz zzpzVar;
        zzpw zzkg;
        zzpw zzpwVar;
        IBinder iBinder;
        this.zzbkr = zzqoVar;
        zzpv zzpvVar = null;
        try {
            List images = this.zzbkr.getImages();
            if (images != null) {
                for (Object obj : images) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzpwVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzpwVar = queryLocalInterface instanceof zzpw ? (zzpw) queryLocalInterface : new zzpy(iBinder);
                    }
                    if (zzpwVar != null) {
                        this.zzbko.add(new zzpz(zzpwVar));
                    }
                }
            }
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
        try {
            zzkg = this.zzbkr.zzkg();
        } catch (RemoteException e2) {
            zzane.zzb("", e2);
        }
        if (zzkg != null) {
            zzpzVar = new zzpz(zzkg);
            this.zzbks = zzpzVar;
            if (this.zzbkr.zzkf() != null) {
                zzpvVar = new zzpv(this.zzbkr.zzkf());
            }
            this.zzbkq = zzpvVar;
        }
        zzpzVar = null;
        this.zzbks = zzpzVar;
        if (this.zzbkr.zzkf() != null) {
        }
        this.zzbkq = zzpvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zzka, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzbe() {
        try {
            return this.zzbkr.zzka();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final void destroy() {
        try {
            this.zzbkr.destroy();
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzbkq;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getAdvertiser() {
        try {
            return this.zzbkr.getAdvertiser();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getBody() {
        try {
            return this.zzbkr.getBody();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzbkr.getCallToAction();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final Bundle getExtras() {
        try {
            return this.zzbkr.getExtras();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getHeadline() {
        try {
            return this.zzbkr.getHeadline();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final List<NativeAd.Image> getImages() {
        return this.zzbko;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.Image getLogo() {
        return this.zzbks;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzbkr.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final VideoController getVideoController() {
        try {
            if (this.zzbkr.getVideoController() != null) {
                this.zzasv.zza(this.zzbkr.getVideoController());
            }
        } catch (RemoteException e) {
            zzane.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzasv;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzbkr.performClick(bundle);
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzbkr.recordImpression(bundle);
        } catch (RemoteException e) {
            zzane.zzb("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzbkr.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
    }
}
