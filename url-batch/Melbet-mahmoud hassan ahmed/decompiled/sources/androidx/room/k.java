package androidx.room;

import java.io.File;
import w.c;

/* loaded from: classes.dex */
class k implements c.InterfaceC0147c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1348a;

    /* renamed from: b, reason: collision with root package name */
    private final File f1349b;

    /* renamed from: c, reason: collision with root package name */
    private final c.InterfaceC0147c f1350c;

    k(String str, File file, c.InterfaceC0147c interfaceC0147c) {
        this.f1348a = str;
        this.f1349b = file;
        this.f1350c = interfaceC0147c;
    }

    @Override // w.c.InterfaceC0147c
    public w.c a(c.b bVar) {
        return new j(bVar.f22842a, this.f1348a, this.f1349b, bVar.f22844c.f22841a, this.f1350c.a(bVar));
    }
}
