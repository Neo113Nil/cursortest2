package i2;

import f2.j;
import java.util.Random;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518b extends AbstractC0517a {

    /* renamed from: f, reason: collision with root package name */
    public final L2.c f6244f = new L2.c(1);

    @Override // i2.AbstractC0517a
    public final Random a() {
        Object obj = this.f6244f.get();
        j.e(obj, "get(...)");
        return (Random) obj;
    }
}
