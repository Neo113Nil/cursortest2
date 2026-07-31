package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzef;
import com.google.android.gms.internal.play_billing.zzeg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzeg<MessageType extends zzeg<MessageType, BuilderType>, BuilderType extends zzef<MessageType, BuilderType>> implements zzhb {
    protected transient int zza = 0;

    protected static void zzk(Iterable iterable, List list) {
        byte[] bArr = zzga.zzb;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzhj) {
            ((zzhj) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj = list2.get(i4);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzQ() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            int i4 = zzfc.zzb;
            zzez zzezVar = new zzez(bArr, 0, zzn);
            zzD(zzezVar);
            zzezVar.zzA();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e4);
        }
    }

    int zzi(zzhl zzhlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final zzev zzj() {
        try {
            int zzn = zzn();
            zzev zzevVar = zzev.zza;
            byte[] bArr = new byte[zzn];
            int i4 = zzfc.zzb;
            zzez zzezVar = new zzez(bArr, 0, zzn);
            zzD(zzezVar);
            return zzer.zza(zzezVar, bArr);
        } catch (IOException e4) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e4);
        }
    }
}
