package l1;

import e2.InterfaceC0424c;
import f2.j;
import f2.k;
import java.util.Map;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592a extends k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0592a f6583e = new C0592a(1);

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        j.f(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((C0595d) entry.getKey()).f6589a + " = " + (value instanceof byte[] ? S1.k.v0((byte[]) value, ", ", "[", "]", null, 56) : String.valueOf(entry.getValue()));
    }
}
