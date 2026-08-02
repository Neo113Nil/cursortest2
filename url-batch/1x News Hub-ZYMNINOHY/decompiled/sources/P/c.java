package P;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1218b;

    public /* synthetic */ c(f fVar, int i3) {
        this.f1217a = i3;
        this.f1218b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1217a) {
            case 0:
                this.f1218b.f1230k.onDismiss(null);
                break;
            default:
                f fVar = this.f1218b;
                if (fVar.f1225e != null) {
                    if (fVar.f1225e == null) {
                        B0.p pVar = new B0.p();
                        Object obj = f.o;
                        pVar.f162a = obj;
                        pVar.f163b = obj;
                        pVar.f164c = obj;
                        pVar.f165d = null;
                        fVar.f1225e = pVar;
                    }
                    fVar.f1225e.getClass();
                    break;
                }
                break;
        }
    }
}
