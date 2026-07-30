package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gq2 extends kv0 implements pe0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ iq2[] wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq2(iq2[] iq2VarArr, int i) {
        super(2);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = iq2VarArr;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.OPXfSBeufaJ8;
        iq2[] iq2VarArr = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                return Float.valueOf(kj0.e9gEMXR7LXtO((dm1) obj, true, iq2VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(kj0.e9gEMXR7LXtO((dm1) obj, false, iq2VarArr, ((Number) obj2).floatValue()));
        }
    }
}
