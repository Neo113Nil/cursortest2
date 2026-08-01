package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgum;
import com.google.android.gms.internal.ads.zzgun;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgun<MessageType extends zzgun<MessageType, BuilderType>, BuilderType extends zzgum<MessageType, BuilderType>> implements zzgxw {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void zzav(Iterable iterable, List list) {
        byte[] bArr = zzgww.zzd;
        iterable.getClass();
        if (iterable instanceof zzgxe) {
            List zzh = ((zzgxe) iterable).zzh();
            zzgxe zzgxeVar = (zzgxe) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (zzgxeVar.size() - size) + " is null.";
                    int size2 = zzgxeVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        zzgxeVar.remove(size2);
                    }
                } else if (obj instanceof zzgve) {
                    zzgxeVar.zzi((zzgve) obj);
                } else {
                    zzgxeVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzgyd) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    int zzat(zzgyp zzgypVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    public final zzgve zzau() {
        try {
            int zzaz = zzaz();
            zzgve zzgveVar = zzgve.zzb;
            byte[] bArr = new byte[zzaz];
            zzgvt zzC = zzgvt.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return new zzgva(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        int zzaz = zzaz();
        int i = zzgvt.zzf;
        if (zzaz > 4096) {
            zzaz = 4096;
        }
        zzgvr zzgvrVar = new zzgvr(outputStream, zzaz);
        zzaW(zzgvrVar);
        zzgvrVar.zzI();
    }

    public final byte[] zzax() {
        try {
            int zzaz = zzaz();
            byte[] bArr = new byte[zzaz];
            zzgvt zzC = zzgvt.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
