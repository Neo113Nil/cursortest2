package w1;

import android.os.RemoteException;
import android.util.Log;
import java.util.Set;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9904b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, String[] strArr) {
        super(strArr);
        this.f9904b = vVar;
    }

    @Override // w1.o
    public final void a(Set set) {
        f2.j.f(set, "tables");
        v vVar = this.f9904b;
        if (vVar.f9913g.get()) {
            return;
        }
        try {
            n nVar = vVar.f9911e;
            if (nVar != null) {
                nVar.a(vVar.f9909c, (String[]) set.toArray(new String[0]));
            }
        } catch (RemoteException e3) {
            Log.w("ROOM", "Cannot broadcast invalidation", e3);
        }
    }
}
