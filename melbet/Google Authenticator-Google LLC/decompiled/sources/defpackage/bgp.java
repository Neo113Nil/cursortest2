package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgp implements bge {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final bgo b;

    public bgp(bgo bgoVar) {
        this.b = bgoVar;
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.bge
    public final /* bridge */ /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        Uri uri = (Uri) obj;
        return new bvw(new bls(uri), this.b.a(uri));
    }
}
