package z3;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import y2.C1331f;

/* loaded from: classes.dex */
public final class I extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final v f11979e;

    /* renamed from: b, reason: collision with root package name */
    public final v f11980b;

    /* renamed from: c, reason: collision with root package name */
    public final m f11981c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11982d;

    static {
        String str = v.f12037e;
        f11979e = E1.i.i("/", false);
    }

    public I(v zipPath, m fileSystem, LinkedHashMap entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f11980b = zipPath;
        this.f11981c = fileSystem;
        this.f11982d = entries;
    }

    @Override // z3.m
    public final l b(v child) {
        l lVar;
        Throwable th;
        Intrinsics.checkNotNullParameter(child, "path");
        v vVar = f11979e;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        A3.h hVar = (A3.h) this.f11982d.get(A3.c.b(vVar, child, true));
        Throwable th2 = null;
        if (hVar == null) {
            return null;
        }
        boolean z4 = hVar.f859b;
        l basicMetadata = new l(!z4, z4, z4 ? null : Long.valueOf(hVar.f860c), null, hVar.f861d, null);
        long j4 = hVar.f862e;
        if (j4 == -1) {
            return basicMetadata;
        }
        q c4 = this.f11981c.c(this.f11980b);
        try {
            z h4 = m3.z.h(c4.d(j4));
            try {
                Intrinsics.checkNotNullParameter(h4, "<this>");
                Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
                lVar = A3.b.f(h4, basicMetadata);
                Intrinsics.c(lVar);
                try {
                    h4.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    h4.close();
                } catch (Throwable th5) {
                    C1331f.a(th4, th5);
                }
                th = th4;
                lVar = null;
            }
        } catch (Throwable th6) {
            if (c4 != null) {
                try {
                    c4.close();
                } catch (Throwable th7) {
                    C1331f.a(th6, th7);
                }
            }
            lVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.c(lVar);
        try {
            c4.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.c(lVar);
        return lVar;
    }

    @Override // z3.m
    public final q c(v file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
