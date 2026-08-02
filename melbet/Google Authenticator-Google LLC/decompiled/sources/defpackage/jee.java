package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jee implements icd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jee(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.icd
    public final Object a() {
        int i = this.b;
        final int i2 = 1;
        if (i == 0) {
            return ((bvw) this.a).d(new ccl("json"), new ccp() { // from class: jef
                @Override // defpackage.ccp
                public final void a() {
                }
            });
        }
        if (i == 1) {
            return hnu.as((String) this.a);
        }
        final int i3 = 0;
        return ((bvw) this.a).d(new ccl("proto"), new ccp() { // from class: jef
            @Override // defpackage.ccp
            public final void a() {
            }
        });
    }
}
