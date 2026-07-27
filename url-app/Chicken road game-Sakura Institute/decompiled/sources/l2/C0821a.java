package l2;

import o2.C0924c;
import o2.m;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821a {

    /* renamed from: a, reason: collision with root package name */
    public final m f7962a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7963b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7964c;

    public C0821a(m mVar, boolean z4, boolean z5) {
        this.f7962a = mVar;
        this.f7963b = z4;
        this.f7964c = z5;
    }

    public final boolean a(C0924c c0924c) {
        return (this.f7963b && !this.f7964c) || this.f7962a.f8941d.i(c0924c);
    }

    public final boolean b(g2.e eVar) {
        return eVar.isEmpty() ? this.f7963b && !this.f7964c : a(eVar.C());
    }
}
