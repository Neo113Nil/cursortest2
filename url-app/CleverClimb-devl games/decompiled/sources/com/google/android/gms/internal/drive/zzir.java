package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzir;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzir<M extends zzir<M>> extends zzix {
    protected zzit zzmw;

    @Override // com.google.android.gms.internal.drive.zzix
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzir zzirVar = (zzir) super.clone();
        zziv.zza(this, zzirVar);
        return zzirVar;
    }

    @Override // com.google.android.gms.internal.drive.zzix
    public void zza(zzip zzipVar) throws IOException {
        if (this.zzmw == null) {
            return;
        }
        for (int i = 0; i < this.zzmw.size(); i++) {
            this.zzmw.zzs(i).zza(zzipVar);
        }
    }

    protected final boolean zza(zzio zzioVar, int i) throws IOException {
        int position = zzioVar.getPosition();
        if (!zzioVar.zzk(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zziz zzizVar = new zziz(i, zzioVar.zza(position, zzioVar.getPosition() - position));
        zziu zziuVar = null;
        if (this.zzmw == null) {
            this.zzmw = new zzit();
        } else {
            zziuVar = this.zzmw.zzr(i2);
        }
        if (zziuVar == null) {
            zziuVar = new zziu();
            this.zzmw.zza(i2, zziuVar);
        }
        zziuVar.zza(zzizVar);
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zzix
    protected int zzaq() {
        if (this.zzmw == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzmw.size(); i2++) {
            i += this.zzmw.zzs(i2).zzaq();
        }
        return i;
    }

    @Override // com.google.android.gms.internal.drive.zzix
    /* renamed from: zzbi */
    public final /* synthetic */ zzix clone() throws CloneNotSupportedException {
        return (zzir) clone();
    }
}
