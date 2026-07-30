package com.crrepa.l1;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class w implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final w f13263a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f13264b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f13265c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f13266d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ w[] f13267e;

    enum a extends w {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.crrepa.l1.w, com.crrepa.l1.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(com.crrepa.t1.a aVar) {
            return Double.valueOf(aVar.m());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f13263a = aVar;
        w wVar = new w("LAZILY_PARSED_NUMBER", 1) { // from class: com.crrepa.l1.w.b
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.w, com.crrepa.l1.m
            public Number a(com.crrepa.t1.a aVar2) {
                return new com.crrepa.n1.h(aVar2.r());
            }
        };
        f13264b = wVar;
        w wVar2 = new w("LONG_OR_DOUBLE", 2) { // from class: com.crrepa.l1.w.c
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.w, com.crrepa.l1.m
            public Number a(com.crrepa.t1.a aVar2) {
                String r8 = aVar2.r();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(r8));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(r8);
                        if (!valueOf.isInfinite()) {
                            if (valueOf.isNaN()) {
                            }
                            return valueOf;
                        }
                        if (!aVar2.j()) {
                            throw new com.crrepa.t1.e("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.h());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e8) {
                    throw new o("Cannot parse " + r8 + "; at path " + aVar2.h(), e8);
                }
            }
        };
        f13265c = wVar2;
        w wVar3 = new w("BIG_DECIMAL", 3) { // from class: com.crrepa.l1.w.d
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.w, com.crrepa.l1.m
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(com.crrepa.t1.a aVar2) {
                String r8 = aVar2.r();
                try {
                    return new BigDecimal(r8);
                } catch (NumberFormatException e8) {
                    throw new o("Cannot parse " + r8 + "; at path " + aVar2.h(), e8);
                }
            }
        };
        f13266d = wVar3;
        f13267e = new w[]{aVar, wVar, wVar2, wVar3};
    }

    private w(String str, int i8) {
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f13267e.clone();
    }

    @Override // com.crrepa.l1.m
    public abstract /* synthetic */ Number a(com.crrepa.t1.a aVar);

    /* synthetic */ w(String str, int i8, a aVar) {
        this(str, i8);
    }
}
