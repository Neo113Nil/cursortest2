package x7;

import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import z4.w;
import z7.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    public final g f10520a;

    public b(g gVar) {
        this.f10520a = gVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        g gVar = this.f10520a;
        z7.d dVar = gVar.f10534d;
        if (dVar == null) {
            return w.p(new a(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.b(), 10);
            Long a9 = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof i) {
            }
            gVar.f10531a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            w7.g gVar2 = new w7.g();
            dVar.a().post(new r(dVar, gVar2, gVar2, new e(gVar, gVar2, decode, a9, gVar2, integrityTokenRequest)));
            return gVar2.f10117a;
        } catch (IllegalArgumentException e2) {
            return w.p(new a(-13, e2));
        }
    }
}
