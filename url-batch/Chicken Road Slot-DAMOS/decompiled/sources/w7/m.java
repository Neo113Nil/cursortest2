package w7;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.List;
import s.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10129a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10130b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10131c;

    public m() {
        this.f10130b = new Object();
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((c6.c) this.f10131c).f1809e;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (cf.c.s(((x1.n) obj).f10294a, j)) {
                break;
            }
            i3++;
        }
        x1.n nVar = (x1.n) obj;
        if (nVar != null) {
            return nVar.f10300h;
        }
        return false;
    }

    public void b(l lVar) {
        synchronized (this.f10130b) {
            try {
                if (((ArrayDeque) this.f10131c) == null) {
                    this.f10131c = new ArrayDeque();
                }
                ((ArrayDeque) this.f10131c).add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Task task) {
        l lVar;
        synchronized (this.f10130b) {
            if (((ArrayDeque) this.f10131c) != null && !this.f10129a) {
                this.f10129a = true;
                while (true) {
                    synchronized (this.f10130b) {
                        try {
                            lVar = (l) ((ArrayDeque) this.f10131c).poll();
                            if (lVar == null) {
                                this.f10129a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.c(task);
                }
            }
        }
    }

    public m(p pVar, c6.c cVar) {
        this.f10130b = pVar;
        this.f10131c = cVar;
    }
}
