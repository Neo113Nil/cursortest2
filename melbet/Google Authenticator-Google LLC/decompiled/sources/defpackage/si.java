package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class si extends sd {
    public sd[] aJ = new sd[4];
    public int aK = 0;

    public final void X(ArrayList arrayList, int i, sx sxVar) {
        for (int i2 = 0; i2 < this.aK; i2++) {
            sxVar.d(this.aJ[i2]);
        }
        for (int i3 = 0; i3 < this.aK; i3++) {
            tw.B(this.aJ[i3], i, arrayList, sxVar);
        }
    }

    public void Y() {
    }
}
