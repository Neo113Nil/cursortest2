package com.tapjoy.internal;

/* loaded from: classes2.dex */
final class hz extends hp implements gr {

    /* renamed from: a, reason: collision with root package name */
    public static final bi f8345a = new bi() { // from class: com.tapjoy.internal.hz.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            bnVar.h();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 1;
            while (bnVar.j()) {
                String l = bnVar.l();
                if ("id".equals(l)) {
                    str = bnVar.m();
                } else if ("name".equals(l)) {
                    str2 = bnVar.m();
                } else if ("quantity".equals(l)) {
                    i = bnVar.r();
                } else if ("token".equals(l)) {
                    str3 = bnVar.m();
                } else {
                    bnVar.s();
                }
            }
            bnVar.i();
            return new hz(str, str2, i, str3);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final String f8346b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8347c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8348d;
    private final String e;

    hz(String str, String str2, int i, String str3) {
        this.f8346b = str;
        this.f8347c = str2;
        this.f8348d = i;
        this.e = str3;
    }

    @Override // com.tapjoy.internal.gr
    public final String a() {
        return this.f8346b;
    }

    @Override // com.tapjoy.internal.gr
    public final String b() {
        return this.f8347c;
    }

    @Override // com.tapjoy.internal.gr
    public final int c() {
        return this.f8348d;
    }

    @Override // com.tapjoy.internal.gr
    public final String d() {
        return this.e;
    }
}
