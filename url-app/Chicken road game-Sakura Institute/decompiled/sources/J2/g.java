package J2;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import y2.C1338m;
import z2.AbstractC1419c;

/* loaded from: classes.dex */
public final class g extends AbstractC1419c {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f3403i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f3404j;

    public g(i iVar) {
        this.f3404j = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3403i = arrayDeque;
        if (iVar.f3406a.isDirectory()) {
            arrayDeque.push(c(iVar.f3406a));
        } else {
            if (!iVar.f3406a.isFile()) {
                this.f11937d = 2;
                return;
            }
            File rootFile = iVar.f3406a;
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new e(rootFile));
        }
    }

    @Override // z2.AbstractC1419c
    public final void b() {
        File file;
        File a4;
        while (true) {
            ArrayDeque arrayDeque = this.f3403i;
            h hVar = (h) arrayDeque.peek();
            if (hVar == null) {
                file = null;
                break;
            }
            a4 = hVar.a();
            if (a4 == null) {
                arrayDeque.pop();
            } else if (a4.equals(hVar.f3405a) || !a4.isDirectory() || arrayDeque.size() >= this.f3404j.f3411f) {
                break;
            } else {
                arrayDeque.push(c(a4));
            }
        }
        file = a4;
        if (file == null) {
            this.f11937d = 2;
        } else {
            this.f11938e = file;
            this.f11937d = 1;
        }
    }

    public final c c(File file) {
        int ordinal = this.f3404j.f3407b.ordinal();
        if (ordinal == 0) {
            return new f(this, file);
        }
        if (ordinal == 1) {
            return new d(this, file);
        }
        throw new C1338m();
    }
}
