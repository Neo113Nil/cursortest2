package O0;

import U.h;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import s1.v;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1918d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1919e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1920i;

    public /* synthetic */ d(Object obj, int i2, int i5) {
        this.f1918d = i5;
        this.f1920i = obj;
        this.f1919e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1918d) {
            case 0:
                ((SystemForegroundService) this.f1920i).f4121m.cancel(this.f1919e);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f1920i;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f1919e == 1) {
                    while (i2 < size) {
                        ((h) arrayList.get(i2)).b();
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((h) arrayList.get(i2)).a();
                        i2++;
                    }
                    break;
                }
            default:
                ((v) this.f1920i).b(this.f1919e);
                break;
        }
    }

    public d(List list, int i2, Throwable th) {
        this.f1918d = 1;
        AbstractC1053a.j(list, "initCallbacks cannot be null");
        this.f1920i = new ArrayList(list);
        this.f1919e = i2;
    }
}
