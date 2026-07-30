package c6;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.collections.AbstractC0623b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends AbstractC0623b {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f4267i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f4268l;

    public f(h hVar) {
        this.f4268l = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4267i = arrayDeque;
        File rootFile = hVar.f4270a;
        if (rootFile.isDirectory()) {
            arrayDeque.push(b(rootFile));
        } else if (!rootFile.isFile()) {
            this.f6125d = 2;
        } else {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new d(rootFile));
        }
    }

    @Override // kotlin.collections.AbstractC0623b
    public final void a() {
        File file;
        File a7;
        while (true) {
            ArrayDeque arrayDeque = this.f4267i;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            a7 = gVar.a();
            if (a7 == null) {
                arrayDeque.pop();
            } else if (a7.equals(gVar.f4269a) || !a7.isDirectory() || arrayDeque.size() >= this.f4268l.f4275f) {
                break;
            } else {
                arrayDeque.push(b(a7));
            }
        }
        file = a7;
        if (file == null) {
            this.f6125d = 2;
        } else {
            this.f6126e = file;
            this.f6125d = 1;
        }
    }

    public final b b(File file) {
        int ordinal = this.f4268l.f4271b.ordinal();
        if (ordinal == 0) {
            return new e(this, file);
        }
        if (ordinal == 1) {
            return new c(this, file);
        }
        throw new R5.k();
    }
}
