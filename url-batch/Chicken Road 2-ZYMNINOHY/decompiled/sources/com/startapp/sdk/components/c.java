package com.startapp.sdk.components;

import f3.C0424b;
import f3.C0426d;
import f3.C0431i;
import f3.InterfaceC0427e;
import f3.InterfaceC0428f;
import f3.InterfaceC0430h;
import kotlin.jvm.internal.i;
import o3.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6585a;

    public /* synthetic */ c(int i4) {
        this.f6585a = i4;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        C0424b c0424b;
        switch (this.f6585a) {
            case 0:
                return a.a((String) obj, (String) obj2);
            case 1:
                String acc = (String) obj;
                InterfaceC0428f element = (InterfaceC0428f) obj2;
                i.e(acc, "acc");
                i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC0430h acc2 = (InterfaceC0430h) obj;
                InterfaceC0428f element2 = (InterfaceC0428f) obj2;
                i.e(acc2, "acc");
                i.e(element2, "element");
                InterfaceC0430h k4 = acc2.k(element2.getKey());
                C0431i c0431i = C0431i.f8817a;
                if (k4 == c0431i) {
                    return element2;
                }
                C0426d c0426d = C0426d.f8816a;
                InterfaceC0427e interfaceC0427e = (InterfaceC0427e) k4.n(c0426d);
                if (interfaceC0427e == null) {
                    c0424b = new C0424b(k4, element2);
                } else {
                    InterfaceC0430h k5 = k4.k(c0426d);
                    if (k5 == c0431i) {
                        return new C0424b(element2, interfaceC0427e);
                    }
                    c0424b = new C0424b(new C0424b(k5, element2), interfaceC0427e);
                }
                return c0424b;
        }
    }
}
