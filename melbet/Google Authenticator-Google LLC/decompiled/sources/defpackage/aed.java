package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aed implements aep {
    private final aec a;
    private final aep b;

    public aed(aec aecVar, aep aepVar) {
        this.a = aecVar;
        this.b = aepVar;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        switch (aejVar.ordinal()) {
            case 0:
                this.a.a(aerVar);
                break;
            case 1:
                this.a.e(aerVar);
                break;
            case 2:
                this.a.d(aerVar);
                break;
            case 3:
                this.a.bJ(aerVar);
                break;
            case 4:
                this.a.f(aerVar);
                break;
            case 5:
                this.a.b(aerVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not be sent by anybody");
            default:
                throw new koj();
        }
        aep aepVar = this.b;
        if (aepVar != null) {
            aepVar.a(aerVar, aejVar);
        }
    }
}
