package defpackage;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class r03 {
    public static final n03 A;
    public static final ji B;
    public static final n03 a = new n03(Class.class, new sw0(new rt1(14), 2), 0);
    public static final n03 b = new n03(BitSet.class, new sw0(new rt1(24), 2), 0);
    public static final rt1 c;
    public static final o03 d;
    public static final o03 e;
    public static final o03 f;
    public static final o03 g;
    public static final n03 h;
    public static final n03 i;
    public static final n03 j;
    public static final rt1 k;
    public static final n03 l;
    public static final o03 m;
    public static final rt1 n;
    public static final rt1 o;
    public static final n03 p;
    public static final n03 q;
    public static final n03 r;
    public static final n03 s;
    public static final n03 t;
    public static final n03 u;
    public static final n03 v;
    public static final n03 w;
    public static final ji x;
    public static final ov y;
    public static final n03 z;

    static {
        rt1 rt1Var = new rt1(25);
        c = new rt1(26);
        d = new o03(Boolean.TYPE, Boolean.class, rt1Var);
        e = new o03(Byte.TYPE, Byte.class, new rt1(27));
        f = new o03(Short.TYPE, Short.class, new rt1(28));
        g = new o03(Integer.TYPE, Integer.class, new rt1(29));
        h = new n03(AtomicInteger.class, new sw0(new p03(0), 2), 0);
        i = new n03(AtomicBoolean.class, new sw0(new p03(1), 2), 0);
        int i2 = 0;
        j = new n03(AtomicIntegerArray.class, new sw0(new rt1(4), 2), i2);
        k = new rt1(5);
        l = new n03(Number.class, new rt1(8), i2);
        m = new o03(Character.TYPE, Character.class, new rt1(9));
        rt1 rt1Var2 = new rt1(10);
        n = new rt1(11);
        o = new rt1(12);
        int i3 = 0;
        p = new n03(String.class, rt1Var2, i3);
        q = new n03(StringBuilder.class, new rt1(13), i3);
        r = new n03(StringBuffer.class, new rt1(15), i3);
        s = new n03(URL.class, new rt1(16), i3);
        t = new n03(URI.class, new rt1(17), i3);
        u = new n03(InetAddress.class, new rt1(18), 1);
        v = new n03(UUID.class, new rt1(19), 0);
        w = new n03(Currency.class, new sw0(new rt1(20), 2), 0);
        x = new ji(5);
        y = new ov(3, new rt1(21));
        z = new n03(Locale.class, new rt1(22), 0);
        A = new n03(t61.class, new rt1(23), 1);
        B = new ji(6);
    }
}
