package defpackage;

import com.appsflyer.internal.l;
import java.io.File;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ly extends r {
    public final ArrayDeque g;
    public final /* synthetic */ ny h;

    public ly(ny nyVar) {
        this.h = nyVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        File file = nyVar.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.d = 2;
        } else {
            file.getClass();
            arrayDeque.push(new jy(file));
        }
    }

    @Override // defpackage.r
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.g;
            my myVar = (my) arrayDeque.peek();
            if (myVar == null) {
                file = null;
                break;
            }
            a = myVar.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(myVar.a) || !a.isDirectory() || arrayDeque.size() >= this.h.f) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file == null) {
            this.d = 2;
        } else {
            this.e = file;
            this.d = 1;
        }
    }

    public final hy b(File file) {
        int ordinal = this.h.b.ordinal();
        if (ordinal == 0) {
            return new ky(this, file);
        }
        if (ordinal == 1) {
            return new iy(this, file);
        }
        l.a();
        return null;
    }
}
