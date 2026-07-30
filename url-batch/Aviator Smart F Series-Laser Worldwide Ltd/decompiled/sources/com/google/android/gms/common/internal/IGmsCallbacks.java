package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i8, @NonNull IBinder iBinder, @NonNull Bundle bundle);

    void zzb(int i8, @NonNull Bundle bundle);

    void zzc(int i8, IBinder iBinder, zzk zzkVar);
}
