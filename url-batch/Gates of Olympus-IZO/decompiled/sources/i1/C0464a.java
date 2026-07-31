package i1;

import M1.k;
import Z1.i;
import Z1.j;
import java.util.Map;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464a extends j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0464a f5104e = new C0464a(1);

    @Override // Y1.c
    public final Object j(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.f(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((C0467d) entry.getKey()).f5110a + " = " + (value instanceof byte[] ? k.h0((byte[]) value, ", ", "[", "]", null, 56) : String.valueOf(entry.getValue()));
    }
}
