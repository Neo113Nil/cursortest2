package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sk extends si {
    public int aL = 0;
    public int aM = 0;
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public boolean aR = false;
    public int aS = 0;
    public int aT = 0;
    protected final sm aU = new sm();
    te aV = null;

    @Override // defpackage.si
    public final void Y() {
        for (int i = 0; i < this.aK; i++) {
            sd sdVar = this.aJ[i];
            if (sdVar != null) {
                sdVar.H = true;
            }
        }
    }

    public final void Z(int i, int i2) {
        this.aS = i;
        this.aT = i2;
    }

    protected final void aa(sd sdVar, int i, int i2, int i3, int i4) {
        te teVar;
        sd sdVar2;
        while (true) {
            teVar = this.aV;
            if (teVar != null || (sdVar2 = this.V) == null) {
                break;
            } else {
                this.aV = ((se) sdVar2).aH;
            }
        }
        sm smVar = this.aU;
        smVar.i = i;
        smVar.j = i3;
        smVar.a = i2;
        smVar.b = i4;
        teVar.a(sdVar, smVar);
        sdVar.E(smVar.c);
        sdVar.z(smVar.d);
        sdVar.G = smVar.f;
        sdVar.w(smVar.e);
    }

    public void W(int i, int i2, int i3, int i4) {
    }
}
