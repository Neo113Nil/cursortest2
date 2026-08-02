package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgr implements bge {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final bge b;

    public bgr(bge bgeVar) {
        this.b = bgeVar;
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        return this.b.b(new bfv(((Uri) obj).toString()), i, i2, bblVar);
    }
}
