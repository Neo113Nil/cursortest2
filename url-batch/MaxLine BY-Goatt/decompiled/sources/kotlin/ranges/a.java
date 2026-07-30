package kotlin.ranges;

import defpackage.k71;
import defpackage.l41;
import defpackage.vt;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a implements Iterable<Character>, k71 {
    public static final C0001a p = new C0001a(null);
    public final char m;
    public final char n;
    public final int o = 1;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C0001a {
        public C0001a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(char c, char c2) {
        this.m = c;
        this.n = (char) l41.G(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new vt(this.m, this.n, this.o);
    }
}
