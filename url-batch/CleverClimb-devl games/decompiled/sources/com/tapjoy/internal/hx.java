package com.tapjoy.internal;

/* loaded from: classes2.dex */
final class hx extends hp implements gq {

    /* renamed from: a, reason: collision with root package name */
    public static final bi f8338a = new bi() { // from class: com.tapjoy.internal.hx.1
        @Override // com.tapjoy.internal.bi
        public final /* synthetic */ Object a(bn bnVar) {
            String str = "";
            String str2 = "";
            bnVar.h();
            while (bnVar.j()) {
                String l = bnVar.l();
                if ("campaign_id".equals(l)) {
                    str = bnVar.c("");
                } else if ("product_id".equals(l)) {
                    str2 = bnVar.c("");
                } else {
                    bnVar.s();
                }
            }
            bnVar.i();
            return new hx(str, str2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final String f8339b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8340c;

    hx(String str, String str2) {
        this.f8339b = str;
        this.f8340c = str2;
    }

    @Override // com.tapjoy.internal.gq
    public final String a() {
        return this.f8339b;
    }

    @Override // com.tapjoy.internal.gq
    public final String b() {
        return this.f8340c;
    }
}
