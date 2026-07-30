package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes3.dex */
final class zzi implements DynamiteModule.VersionPolicy {
    zzi() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zza(context, str);
        int i8 = 1;
        int zzb = iVersions.zzb(context, str, true);
        selectionResult.remoteVersion = zzb;
        int i9 = selectionResult.localVersion;
        if (i9 == 0) {
            i9 = 0;
            if (zzb == 0) {
                i8 = 0;
                selectionResult.selection = i8;
                return selectionResult;
            }
        }
        if (i9 >= zzb) {
            i8 = -1;
        }
        selectionResult.selection = i8;
        return selectionResult;
    }
}
