package com.crrepa.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f13260a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f13261b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ v[] f13262c;

    enum a extends v {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.crrepa.l1.v
        public h a(Long l8) {
            return l8 == null ? i.f13253a : new k(l8);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f13260a = aVar;
        v vVar = new v("STRING", 1) { // from class: com.crrepa.l1.v.b
            {
                a aVar2 = null;
            }

            @Override // com.crrepa.l1.v
            public h a(Long l8) {
                return l8 == null ? i.f13253a : new k(l8.toString());
            }
        };
        f13261b = vVar;
        f13262c = new v[]{aVar, vVar};
    }

    private v(String str, int i8) {
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f13262c.clone();
    }

    public abstract h a(Long l8);

    /* synthetic */ v(String str, int i8, a aVar) {
        this(str, i8);
    }
}
