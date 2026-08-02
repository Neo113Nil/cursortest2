package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfh implements kri {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dfh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, koi] */
    @Override // defpackage.kri
    public final /* synthetic */ Object a() {
        aeh aehVar;
        switch (this.b) {
            case 0:
                return ((ng) this.a).N();
            case 1:
                return new zy[((kzq[]) this.a).length];
            case 2:
                return ((ng) this.a).O();
            case 3:
                return ((ng) this.a).P();
            case 4:
                return ((bd) this.a).E().O();
            case 5:
                return ((bd) this.a).E().P();
            case 6:
                agh N = ((bd) this.a).E().N();
                N.getClass();
                return N;
            case 7:
                return this.a;
            case 8:
                return ((dfh) this.a).a;
            case 9:
                return adk.a(this.a).O();
            case 10:
                agl a = adk.a(this.a);
                aehVar = a instanceof aeh ? (aeh) a : null;
                return aehVar != null ? aehVar.P() : agm.a;
            case 11:
                return this.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((dfh) this.a).a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return adk.a(this.a).O();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                agl a2 = adk.a(this.a);
                aehVar = a2 instanceof aeh ? (aeh) a2 : null;
                return aehVar != null ? aehVar.P() : agm.a;
            case 15:
                return new eba[((kzq[]) this.a).length];
            case 16:
                return new jia[((kzq[]) this.a).length];
            case 17:
                return ((ng) this.a).N();
            case 18:
                return ((ng) this.a).O();
            case 19:
                return ((ng) this.a).P();
            default:
                return this.a;
        }
    }
}
