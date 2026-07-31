package c2;

import Z1.i;
import java.util.Random;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318b extends AbstractC0317a {

    /* renamed from: f, reason: collision with root package name */
    public final F2.c f4418f = new F2.c(1);

    @Override // c2.AbstractC0317a
    public final Random a() {
        Object obj = this.f4418f.get();
        i.e(obj, "get(...)");
        return (Random) obj;
    }
}
