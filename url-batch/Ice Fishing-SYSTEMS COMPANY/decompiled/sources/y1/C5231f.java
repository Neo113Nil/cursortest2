package y1;

import android.content.res.Resources;
import java.io.IOException;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5231f implements com.bumptech.glide.load.data.d {

    /* renamed from: n, reason: collision with root package name */
    public final Resources.Theme f41832n;

    /* renamed from: u, reason: collision with root package name */
    public final Resources f41833u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41834v;

    /* renamed from: w, reason: collision with root package name */
    public final int f41835w;

    /* renamed from: x, reason: collision with root package name */
    public Object f41836x;

    public C5231f(Resources.Theme theme, Resources resources, InterfaceC5232g interfaceC5232g, int i) {
        this.f41832n = theme;
        this.f41833u = resources;
        this.f41834v = interfaceC5232g;
        this.f41835w = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y1.g] */
    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f41834v.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, y1.g] */
    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f41836x;
        if (obj != null) {
            try {
                this.f41834v.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, y1.g] */
    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        try {
            Object b9 = this.f41834v.b(this.f41833u, this.f41835w, this.f41832n);
            this.f41836x = b9;
            cVar.g(b9);
        } catch (Resources.NotFoundException e6) {
            cVar.d(e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
