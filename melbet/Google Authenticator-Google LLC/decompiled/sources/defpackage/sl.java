package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sl extends sd {
    public ArrayList aJ = new ArrayList();

    @Override // defpackage.sd
    public final void V(byo byoVar) {
        super.V(byoVar);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((sd) this.aJ.get(i)).V(byoVar);
        }
    }

    public void W() {
        ArrayList arrayList = this.aJ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sd sdVar = (sd) this.aJ.get(i);
            if (sdVar instanceof sl) {
                ((sl) sdVar).W();
            }
        }
    }

    public final void ab(sd sdVar) {
        this.aJ.remove(sdVar);
        sdVar.t();
    }

    @Override // defpackage.sd
    public void t() {
        this.aJ.clear();
        super.t();
    }
}
