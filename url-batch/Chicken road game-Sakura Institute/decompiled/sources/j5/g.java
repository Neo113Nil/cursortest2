package j5;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f5055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.room.c f5056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f5057e;

    public g(n nVar, String str, long j8, l lVar, androidx.room.c cVar) {
        this.f5057e = nVar;
        this.f5053a = str;
        this.f5054b = j8;
        this.f5055c = lVar;
        this.f5056d = cVar;
    }

    @Override // j5.i
    public final void a(Map map) {
        n nVar = this.f5057e;
        HashMap hashMap = nVar.f5088m;
        b1.b bVar = nVar.f5099x;
        if (bVar.v()) {
            bVar.d(this.f5053a + " response: " + map, null, new Object[0]);
        }
        long j8 = this.f5054b;
        if (((l) hashMap.get(Long.valueOf(j8))) == this.f5055c) {
            hashMap.remove(Long.valueOf(j8));
            String str = (String) map.get("s");
            boolean equals = str.equals("ok");
            androidx.room.c cVar = this.f5056d;
            if (equals) {
                cVar.x(null, null);
            } else {
                cVar.x(str, (String) map.get("d"));
            }
        } else if (bVar.v()) {
            bVar.d("Ignoring on complete for put " + j8 + " because it was removed already.", null, new Object[0]);
        }
        nVar.b();
    }
}
