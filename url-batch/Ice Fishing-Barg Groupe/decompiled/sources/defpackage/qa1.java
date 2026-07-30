package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class qa1 implements le0 {
    public final /* synthetic */ Bundle OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ qa1(int i, Bundle bundle) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = bundle;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        boolean containsKey;
        int i = this.rtx2ld2ELZv4;
        Bundle bundle = this.OPXfSBeufaJ8;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
