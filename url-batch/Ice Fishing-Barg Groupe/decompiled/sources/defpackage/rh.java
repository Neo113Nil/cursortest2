package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class rh implements du0, Serializable {
    public final Object OPXfSBeufaJ8;
    public final boolean cpQdD2nAriOS;
    public final String dgRBjINgWbAK;
    public transient du0 rtx2ld2ELZv4;
    public final Class wdg6QnbFHrFF;
    public final String x50lh2ztY7Y5;

    public rh(Object obj, Class cls, String str, String str2, boolean z) {
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = cls;
        this.dgRBjINgWbAK = str;
        this.x50lh2ztY7Y5 = str2;
        this.cpQdD2nAriOS = z;
    }

    public abstract du0 TSizfFm2Yiuu();

    public final zj e9gEMXR7LXtO() {
        boolean z = this.cpQdD2nAriOS;
        Class cls = this.wdg6QnbFHrFF;
        if (!z) {
            return bu1.PxuCJdSBwIXG(cls);
        }
        bu1.PxuCJdSBwIXG.getClass();
        return new ii1(cls);
    }
}
