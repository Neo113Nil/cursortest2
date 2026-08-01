package d6;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends b7.r {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3621i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u5.m f3622r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3623s;

    public /* synthetic */ b(u5.m mVar, Object obj, int i3) {
        this.f3621i = i3;
        this.f3622r = mVar;
        this.f3623s = obj;
    }

    @Override // b7.r
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f3621i) {
            case 0:
                u5.m mVar = this.f3622r;
                workDatabase = mVar.f9651c;
                workDatabase.c();
                try {
                    b7.r.a(mVar, ((UUID) this.f3623s).toString());
                    workDatabase.u();
                    workDatabase.h();
                    u5.h.a(mVar.f9650b, mVar.f9651c, mVar.f9653e);
                    return;
                } finally {
                    workDatabase.h();
                }
            default:
                u5.m mVar2 = this.f3622r;
                workDatabase = mVar2.f9651c;
                workDatabase.c();
                try {
                    ArrayList j = workDatabase.B().j((String) this.f3623s);
                    int size = j.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = j.get(i3);
                        i3++;
                        b7.r.a(mVar2, (String) obj);
                    }
                    workDatabase.u();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
