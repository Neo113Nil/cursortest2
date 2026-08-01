package sd;

import a2.r;
import java.io.File;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends kotlin.collections.b {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f9181i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f9182r;

    public f(h hVar) {
        this.f9182r = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9181i = arrayDeque;
        File file = hVar.f9184a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.f5557d = 2;
        } else {
            file.getClass();
            arrayDeque.push(new d(file));
        }
    }

    @Override // kotlin.collections.b
    public final void a() {
        File file;
        File a9;
        while (true) {
            ArrayDeque arrayDeque = this.f9181i;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            a9 = gVar.a();
            if (a9 == null) {
                arrayDeque.pop();
            } else if (a9.equals(gVar.f9183a) || !a9.isDirectory() || arrayDeque.size() >= this.f9182r.f9189f) {
                break;
            } else {
                arrayDeque.push(b(a9));
            }
        }
        file = a9;
        if (file == null) {
            this.f5557d = 2;
        } else {
            this.f5558e = file;
            this.f5557d = 1;
        }
    }

    public final b b(File file) {
        int ordinal = this.f9182r.f9185b.ordinal();
        if (ordinal == 0) {
            return new e(this, file);
        }
        if (ordinal == 1) {
            return new c(this, file);
        }
        r.p();
        return null;
    }
}
