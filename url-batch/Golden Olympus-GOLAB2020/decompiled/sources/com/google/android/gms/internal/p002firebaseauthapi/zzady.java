package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class zzady {
    private zzady() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzafu zzafuVar = (zzafu) new zzafu().zza(str);
                if (zzafuVar.zzb()) {
                    return zzafuVar.zza();
                }
                throw new zzabr("No error message: " + str);
            } catch (Exception e4) {
                throw new zzabr("Json conversion failed! " + e4.getMessage(), e4);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzaea) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
            } catch (Exception e5) {
                throw new zzabr("Json conversion failed! " + e5.getMessage(), e5);
            }
        } catch (Exception e6) {
            throw new zzabr("Instantiation of JsonResponse failed! " + String.valueOf(type), e6);
        }
    }
}
