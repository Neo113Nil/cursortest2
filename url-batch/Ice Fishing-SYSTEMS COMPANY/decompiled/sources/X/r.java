package X;

import a8.C0455w;
import a8.I;
import android.content.Context;
import androidx.lifecycle.L;
import androidx.lifecycle.Y;
import java.io.File;
import java.util.LinkedHashSet;
import z0.C5263f;
import z0.C5264g;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3584n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3585u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Object obj) {
        super(0);
        this.f3584n = i;
        this.f3585u = obj;
    }

    @Override // E7.a
    public final Object invoke() {
        C5263f c5263f;
        switch (this.f3584n) {
            case 0:
                File file = (File) ((D) this.f3585u).f3537a.invoke();
                String it = file.getAbsolutePath();
                synchronized (D.i) {
                    LinkedHashSet linkedHashSet = D.f3536h;
                    if (linkedHashSet.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.h.d(it, "it");
                    linkedHashSet.add(it);
                }
                return file;
            case 1:
                Y7.f fVar = (Y7.f) this.f3585u;
                return Integer.valueOf(I.c(fVar, fVar.i));
            case 2:
                return com.bumptech.glide.d.c("kotlin.Unit", Y7.i.f4058j, new Y7.e[0], new J0.l(5, (C0455w) this.f3585u));
            case 3:
                return L.f((Y) this.f3585u);
            case 4:
                return ((s.j) this.f3585u).k();
            default:
                C5264g c5264g = (C5264g) this.f3585u;
                String str = c5264g.f42124u;
                Context context = c5264g.f42123n;
                if (str == null || !c5264g.f42126w) {
                    c5263f = new C5263f(context, c5264g.f42124u, new i8.m(11), c5264g.f42125v, c5264g.f42127x);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.h.d(noBackupFilesDir, "context.noBackupFilesDir");
                    c5263f = new C5263f(context, new File(noBackupFilesDir, c5264g.f42124u).getAbsolutePath(), new i8.m(11), c5264g.f42125v, c5264g.f42127x);
                }
                c5263f.setWriteAheadLoggingEnabled(c5264g.f42129z);
                return c5263f;
        }
    }
}
