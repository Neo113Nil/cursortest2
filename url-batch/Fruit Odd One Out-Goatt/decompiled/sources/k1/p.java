package k1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class p extends v0.a implements v0.f {

    /* renamed from: c, reason: collision with root package name */
    public static final o f707c = new o(v0.e.f1195b, n.f696c);

    public p() {
        super(v0.e.f1195b);
    }

    public abstract void b(v0.h hVar, Runnable runnable);

    public boolean c() {
        return !(this instanceof w0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r3.a(r2) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        return v0.i.f1196b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (v0.e.f1195b == r3) goto L15;
     */
    @Override // v0.a, v0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v0.h i(v0.g gVar) {
        gVar.getClass();
        if (gVar instanceof o) {
            o oVar = (o) gVar;
            v0.g gVar2 = this.f1189b;
            if (gVar2 != oVar && oVar.f702c != gVar2) {
                return this;
            }
        }
    }

    @Override // v0.a, v0.h
    public final v0.f j(v0.g gVar) {
        v0.f a2;
        gVar.getClass();
        if (gVar instanceof o) {
            o oVar = (o) gVar;
            v0.g gVar2 = this.f1189b;
            if ((gVar2 == oVar || oVar.f702c == gVar2) && (a2 = oVar.a(this)) != null) {
                return a2;
            }
        } else if (v0.e.f1195b == gVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + t.a(this);
    }
}
