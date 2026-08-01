package b6;

import androidx.work.impl.foreground.SystemForegroundService;
import b7.b0;
import c4.i;
import java.util.ArrayList;
import java.util.List;
import m.u;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1233d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1234e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1235i;

    public d(List list, int i3, Throwable th) {
        this.f1233d = 2;
        i7.a.A(list, "initCallbacks cannot be null");
        this.f1235i = new ArrayList(list);
        this.f1234e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1233d) {
            case 0:
                ((SystemForegroundService) this.f1235i).f787s.cancel(this.f1234e);
                break;
            case 1:
                ((b0) this.f1235i).b(this.f1234e);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f1235i;
                int size = arrayList.size();
                int i3 = 0;
                if (this.f1234e == 1) {
                    while (i3 < size) {
                        ((i) arrayList.get(i3)).b();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((i) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                }
            default:
                u uVar = (u) ((d9.c) this.f1235i).f3701e;
                if (uVar != null) {
                    uVar.b(this.f1234e);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(int i3, int i10, Object obj) {
        this.f1233d = i10;
        this.f1235i = obj;
        this.f1234e = i3;
    }
}
