package com.anythink.core.common.res.image;

import com.anythink.core.common.d.t;
import com.anythink.core.common.res.d;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.o;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    e f16394a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC0095a f16395b;

    /* renamed from: com.anythink.core.common.res.image.a$a, reason: collision with other inner class name */
    public interface InterfaceC0095a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public a(e eVar) {
        super(eVar.f16393h);
        this.f16394a = eVar;
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        InterfaceC0095a interfaceC0095a = this.f16395b;
        if (interfaceC0095a != null) {
            interfaceC0095a.a(this.f16394a);
        }
    }

    public final void a(InterfaceC0095a interfaceC0095a) {
        this.f16395b = interfaceC0095a;
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        d a9 = d.a(t.b().g());
        e eVar = this.f16394a;
        return a9.a(eVar.f16392g, o.a(eVar.f16393h), inputStream);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.v.b.d dVar) {
        com.anythink.core.common.v.b.b.a().a(dVar, 4);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        InterfaceC0095a interfaceC0095a = this.f16395b;
        if (interfaceC0095a != null) {
            interfaceC0095a.a(this.f16394a, str2);
        }
    }
}
