package v0;

import e1.C0312c;
import e1.InterfaceC0313d;
import e1.InterfaceC0314e;
import h1.C0339a;
import java.util.Collections;
import java.util.HashMap;
import y0.C1252b;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223b implements InterfaceC0313d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1223b f10534a = new C1223b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0312c f10535b;

    static {
        C0339a c0339a = new C0339a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h1.d.class, c0339a);
        f10535b = new C0312c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // e1.InterfaceC0310a
    public final void a(Object obj, Object obj2) {
        ((InterfaceC0314e) obj2).d(f10535b, ((C1252b) obj).f10807a);
    }
}
