package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z43 {

    /* renamed from: a, reason: collision with root package name */
    private final b43 f14944a;

    /* renamed from: b, reason: collision with root package name */
    private final y43 f14945b;

    private z43(y43 y43Var) {
        a43 a43Var = a43.f2599b;
        this.f14945b = y43Var;
        this.f14944a = a43Var;
    }

    public static z43 b(int i7) {
        return new z43(new v43(4000));
    }

    public static z43 c(b43 b43Var) {
        return new z43(new t43(b43Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> g(CharSequence charSequence) {
        return this.f14945b.a(this, charSequence);
    }

    public final Iterable<String> d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new w43(this, charSequence);
    }

    public final List<String> f(CharSequence charSequence) {
        Iterator<String> g7 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g7.hasNext()) {
            arrayList.add(g7.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
