package org.apache.a.f.b;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: RedirectLocations.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Set<URI> f9784a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final List<URI> f9785b = new ArrayList();

    public boolean a(URI uri) {
        return this.f9784a.contains(uri);
    }

    public void b(URI uri) {
        this.f9784a.add(uri);
        this.f9785b.add(uri);
    }
}
