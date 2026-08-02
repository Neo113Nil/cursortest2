package j$.util.stream;

import j$.util.Map;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class j0 {
    public static final j0 DISTINCT;
    public static final j0 ORDERED;
    public static final j0 SHORT_CIRCUIT;
    public static final j0 SIZED;
    public static final j0 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final /* synthetic */ j0[] r;
    public final EnumMap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        i0 i0Var = i0.SPLITERATOR;
        j$.time.format.s j2 = j(i0Var);
        i0 i0Var2 = i0.STREAM;
        j2.e(i0Var2);
        i0 i0Var3 = i0.OP;
        ((EnumMap) j2.b).put((EnumMap) i0Var3, (i0) 3);
        j0 j0Var = new j0("DISTINCT", 0, 0, j2);
        DISTINCT = j0Var;
        j$.time.format.s j3 = j(i0Var);
        j3.e(i0Var2);
        ((EnumMap) j3.b).put((EnumMap) i0Var3, (i0) 3);
        j0 j0Var2 = new j0("SORTED", 1, 1, j3);
        SORTED = j0Var2;
        j$.time.format.s j4 = j(i0Var);
        j4.e(i0Var2);
        EnumMap enumMap = (EnumMap) j4.b;
        enumMap.put((EnumMap) i0Var3, (i0) 3);
        i0 i0Var4 = i0.TERMINAL_OP;
        enumMap.put((EnumMap) i0Var4, (i0) 2);
        i0 i0Var5 = i0.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) i0Var5, (i0) 2);
        j0 j0Var3 = new j0("ORDERED", 2, 2, j4);
        ORDERED = j0Var3;
        j$.time.format.s j5 = j(i0Var);
        j5.e(i0Var2);
        ((EnumMap) j5.b).put((EnumMap) i0Var3, (i0) 2);
        j0 j0Var4 = new j0("SIZED", 3, 3, j5);
        SIZED = j0Var4;
        j$.time.format.s j6 = j(i0Var3);
        j6.e(i0Var4);
        int i2 = 0;
        j0 j0Var5 = new j0("SHORT_CIRCUIT", 4, 12, j6);
        SHORT_CIRCUIT = j0Var5;
        r = new j0[]{j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
        f = g(i0Var);
        g = g(i0Var2);
        h = g(i0Var3);
        g(i0Var4);
        g(i0Var5);
        for (j0 j0Var6 : values()) {
            i2 |= j0Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        j0 j0Var7 = DISTINCT;
        int i5 = j0Var7.c;
        m = j0Var7.d;
        j0 j0Var8 = SORTED;
        int i6 = j0Var8.c;
        n = j0Var8.d;
        j0 j0Var9 = ORDERED;
        int i7 = j0Var9.c;
        o = j0Var9.d;
        j0 j0Var10 = SIZED;
        int i8 = j0Var10.c;
        p = j0Var10.d;
        q = SHORT_CIRCUIT.c;
    }

    public j0(String str, int i2, int i3, j$.time.format.s sVar) {
        EnumMap enumMap = (EnumMap) sVar.b;
        for (i0 i0Var : i0.values()) {
            Map.EL.putIfAbsent(enumMap, i0Var, 0);
        }
        this.a = enumMap;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int f(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int g(i0 i0Var) {
        int i2 = 0;
        for (j0 j0Var : values()) {
            i2 |= ((Integer) j0Var.a.get(i0Var)).intValue() << j0Var.b;
        }
        return i2;
    }

    public static j$.time.format.s j(i0 i0Var) {
        j$.time.format.s sVar = new j$.time.format.s(6, new EnumMap(i0.class));
        sVar.e(i0Var);
        return sVar;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) r.clone();
    }

    public final boolean h(int i2) {
        return (i2 & this.e) == this.c;
    }
}
