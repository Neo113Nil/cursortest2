package w;

import android.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i7) {
        super(2);
        this.f9251g = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7;
        g0.p pVar = (g0.p) obj;
        ((Number) obj2).intValue();
        pVar.Q(-1451087197);
        int i8 = this.f9251g;
        if (i8 == 1) {
            i7 = R.string.cut;
        } else if (i8 == 2) {
            i7 = R.string.copy;
        } else if (i8 == 3) {
            i7 = R.string.paste;
        } else {
            if (i8 != 4) {
                throw null;
            }
            i7 = R.string.selectAll;
        }
        String j8 = u3.q.j(i7, pVar);
        pVar.p(false);
        return j8;
    }
}
