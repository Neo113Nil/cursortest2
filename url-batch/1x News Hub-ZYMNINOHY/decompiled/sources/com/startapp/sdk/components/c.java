package com.startapp.sdk.components;

import d2.C0299b;
import d2.C0301d;
import d2.InterfaceC0302e;
import d2.InterfaceC0303f;
import d2.h;
import d2.i;
import kotlin.jvm.internal.j;
import l2.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3487a;

    public /* synthetic */ c(int i3) {
        this.f3487a = i3;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        C0299b c0299b;
        switch (this.f3487a) {
            case 0:
                return a.a((String) obj, (String) obj2);
            case 1:
                String acc = (String) obj;
                InterfaceC0303f element = (InterfaceC0303f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                h acc2 = (h) obj;
                InterfaceC0303f element2 = (InterfaceC0303f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                h k3 = acc2.k(element2.getKey());
                i iVar = i.f4951a;
                if (k3 == iVar) {
                    return element2;
                }
                C0301d c0301d = C0301d.f4950a;
                InterfaceC0302e interfaceC0302e = (InterfaceC0302e) k3.h(c0301d);
                if (interfaceC0302e == null) {
                    c0299b = new C0299b(element2, k3);
                } else {
                    h k4 = k3.k(c0301d);
                    if (k4 == iVar) {
                        return new C0299b(interfaceC0302e, element2);
                    }
                    c0299b = new C0299b(interfaceC0302e, new C0299b(element2, k4));
                }
                return c0299b;
        }
    }
}
