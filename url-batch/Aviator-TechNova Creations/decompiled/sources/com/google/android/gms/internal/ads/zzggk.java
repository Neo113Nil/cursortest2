package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzggk extends zzghb {
    zzggk(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", zzawgVar, zzgfxVar, zzgoeVar.zza(Opcodes.FREM));
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzawgVar) {
            zzawgVar.zza(ExifInterface.LONGITUDE_EAST);
            zzawgVar.zzB(0L);
            zzawgVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzawgVar) {
            zzawgVar.zza((String) objArr2[0]);
            zzawgVar.zzB(((Long) objArr2[1]).longValue());
            zzawgVar.zzV((String) objArr2[2]);
        }
    }
}
