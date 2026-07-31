package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes.dex */
public final class zzan extends zzas implements zzap {
    zzan(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zza(int i4, String str, String str2) {
        Parcel zzt = zzt();
        zzt.writeInt(3);
        zzt.writeString(str);
        zzt.writeString(str2);
        Parcel zzu = zzu(5, zzt);
        int readInt = zzu.readInt();
        zzu.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zzb(int i4, String str, String str2) {
        Parcel zzt = zzt();
        zzt.writeInt(i4);
        zzt.writeString(str);
        zzt.writeString(str2);
        Parcel zzu = zzu(1, zzt);
        int readInt = zzu.readInt();
        zzu.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final int zzc(int i4, String str, String str2, Bundle bundle) {
        Parcel zzt = zzt();
        zzt.writeInt(i4);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzau.zzb(zzt, bundle);
        Parcel zzu = zzu(10, zzt);
        int readInt = zzu.readInt();
        zzu.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzd(int i4, String str, String str2, Bundle bundle) {
        Parcel zzt = zzt();
        zzt.writeInt(9);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzau.zzb(zzt, bundle);
        Parcel zzu = zzu(902, zzt);
        Bundle bundle2 = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zze(int i4, String str, String str2, Bundle bundle) {
        Parcel zzt = zzt();
        zzt.writeInt(9);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzau.zzb(zzt, bundle);
        Parcel zzu = zzu(12, zzt);
        Bundle bundle2 = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzf(int i4, String str, String str2, String str3, String str4) {
        Parcel zzt = zzt();
        zzt.writeInt(3);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzt.writeString(str3);
        zzt.writeString(null);
        Parcel zzu = zzu(3, zzt);
        Bundle bundle = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzg(int i4, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel zzt = zzt();
        zzt.writeInt(i4);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzt.writeString(str3);
        zzt.writeString(null);
        zzau.zzb(zzt, bundle);
        Parcel zzu = zzu(8, zzt);
        Bundle bundle2 = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzh(int i4, String str, String str2, String str3) {
        Parcel zzt = zzt();
        zzt.writeInt(3);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzt.writeString(str3);
        Parcel zzu = zzu(4, zzt);
        Bundle bundle = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzi(int i4, String str, String str2, String str3, Bundle bundle) {
        Parcel zzt = zzt();
        zzt.writeInt(i4);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzt.writeString(str3);
        zzau.zzb(zzt, bundle);
        Parcel zzu = zzu(11, zzt);
        Bundle bundle2 = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final Bundle zzj(int i4, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel zzt = zzt();
        zzt.writeInt(i4);
        zzt.writeString(str);
        zzt.writeString(str2);
        zzau.zzb(zzt, bundle);
        zzau.zzb(zzt, bundle2);
        Parcel zzu = zzu(901, zzt);
        Bundle bundle3 = (Bundle) zzau.zza(zzu, Bundle.CREATOR);
        zzu.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzk(int i4, String str, Bundle bundle, zzx zzxVar) {
        Parcel zzt = zzt();
        zzt.writeInt(21);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzxVar);
        zzw(1501, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzl(int i4, String str, Bundle bundle, zzz zzzVar) {
        Parcel zzt = zzt();
        zzt.writeInt(22);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzzVar);
        zzw(1801, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzm(Bundle bundle, zzac zzacVar) {
        Parcel zzt = zzt();
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzacVar);
        zzw(IronSourceConstants.IS_LOAD_CALLED, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzn(int i4, String str, Bundle bundle, zzae zzaeVar) {
        Parcel zzt = zzt();
        zzt.writeInt(21);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzaeVar);
        zzw(IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzo(int i4, String str, Bundle bundle, zzag zzagVar) {
        Parcel zzt = zzt();
        zzt.writeInt(18);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzagVar);
        zzv(1301, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzp(int i4, String str, Bundle bundle, zzai zzaiVar) {
        Parcel zzt = zzt();
        zzt.writeInt(i4);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzaiVar);
        zzw(1901, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzq(int i4, String str, Bundle bundle, zzak zzakVar) {
        Parcel zzt = zzt();
        zzt.writeInt(21);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzakVar);
        zzw(IronSourceConstants.RV_CAP_SESSION, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzr(int i4, String str, Bundle bundle, zzam zzamVar) {
        Parcel zzt = zzt();
        zzt.writeInt(24);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzamVar);
        zzw(1701, zzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zzs(int i4, String str, Bundle bundle, zzar zzarVar) {
        Parcel zzt = zzt();
        zzt.writeInt(12);
        zzt.writeString(str);
        zzau.zzb(zzt, bundle);
        zzau.zzc(zzt, zzarVar);
        zzv(1201, zzt);
    }
}
