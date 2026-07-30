package L1;

import N1.s;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    public final f f1662a;

    public b(f fVar) {
        this.f1662a = fVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        f fVar = this.f1662a;
        N1.d dVar = fVar.f1676d;
        if (dVar == null) {
            return AbstractC1053a.v(new a(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.b(), 10);
            Long a7 = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof h) {
            }
            fVar.f1673a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            K1.h hVar = new K1.h();
            dVar.a().post(new s(dVar, hVar, hVar, new d(fVar, hVar, decode, a7, hVar, integrityTokenRequest)));
            return hVar.f1428a;
        } catch (IllegalArgumentException e7) {
            return AbstractC1053a.v(new a(-13, e7));
        }
    }
}
