package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eei {
    public gzp a;
    public gzp b;
    public boolean c;
    public byte d;
    public dih e;
    public dih f;
    private final gzp g;
    private final gzp h;
    private final gzp i;
    private final gzp j;

    public eei() {
        gyf gyfVar = gyf.a;
        this.a = gyfVar;
        this.g = gyfVar;
        this.h = gyfVar;
        this.b = gyfVar;
        this.i = gyfVar;
        this.j = gyfVar;
    }

    public final eej a() {
        dih dihVar;
        dih dihVar2;
        Boolean bool = false;
        bool.getClass();
        if (this.d == 1 && (dihVar = this.e) != null && (dihVar2 = this.f) != null) {
            return new eej(this.a, this.g, this.h, this.b, this.i, this.j, dihVar, this.c, dihVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" secondaryButtonStyleFeature");
        }
        if (this.d == 0) {
            sb.append(" supportAccountSwitching");
        }
        if (this.f == null) {
            sb.append(" customContinueButtonTextsFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
