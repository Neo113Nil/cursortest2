package com.tapjoy.internal;

import com.tapjoy.internal.ik;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hi implements cf {

    /* renamed from: a, reason: collision with root package name */
    public final ha f8279a;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8281c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    private final Map f8282d = jv.a();

    /* renamed from: b, reason: collision with root package name */
    Set f8280b = null;

    public hi(ha haVar) {
        this.f8279a = haVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tapjoy.internal.cf
    public void a(ca caVar, ik.a aVar) {
        if (caVar instanceof ik) {
            if (aVar.f8385b != null) {
                List list = aVar.f8385b;
                synchronized (this) {
                    this.f8280b = list instanceof Collection ? new HashSet(jt.a(list)) : jw.a(list.iterator());
                }
            }
            ik ikVar = (ik) caVar;
            String str = ikVar.f8382c;
            boolean z = ikVar.f8383d;
            this.f8282d.remove(str);
            if (!z) {
                this.f8281c.put(str, aVar.f8384a);
            }
            hh hhVar = aVar.f8384a;
            hb hbVar = this.f8279a.p;
            if (hhVar instanceof hg) {
                gx.a("No content for \"{}\"", str);
                hbVar.a(str);
                return;
            }
            gx.a("New content for \"{}\" is ready", str);
            if (z) {
                hhVar.a(hbVar, new fx());
                return;
            } else {
                hbVar.b(str);
                return;
            }
        }
        throw new IllegalStateException(caVar.getClass().getName());
    }

    @Override // com.tapjoy.internal.cf
    public final void a(ca caVar) {
        a(caVar, new ik.a(new hg(), null));
    }
}
