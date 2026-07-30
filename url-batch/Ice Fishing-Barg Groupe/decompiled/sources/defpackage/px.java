package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class px implements h82 {
    public final ox PxuCJdSBwIXG;
    public h82 lS5Rgt96tfkO;

    public px(ox oxVar) {
        this.PxuCJdSBwIXG = oxVar;
    }

    @Override // defpackage.h82
    public final String PxuCJdSBwIXG(SSLSocket sSLSocket) {
        h82 e9gEMXR7LXtO = e9gEMXR7LXtO(sSLSocket);
        if (e9gEMXR7LXtO != null) {
            return e9gEMXR7LXtO.PxuCJdSBwIXG(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.h82
    public final boolean TSizfFm2Yiuu() {
        return true;
    }

    @Override // defpackage.h82
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        h82 e9gEMXR7LXtO = e9gEMXR7LXtO(sSLSocket);
        if (e9gEMXR7LXtO != null) {
            e9gEMXR7LXtO.Y1f8riQaR6yg(sSLSocket, str, list);
        }
    }

    public final synchronized h82 e9gEMXR7LXtO(SSLSocket sSLSocket) {
        try {
            if (this.lS5Rgt96tfkO == null && this.PxuCJdSBwIXG.lS5Rgt96tfkO(sSLSocket)) {
                this.lS5Rgt96tfkO = this.PxuCJdSBwIXG.Y1f8riQaR6yg(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.h82
    public final boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        return this.PxuCJdSBwIXG.lS5Rgt96tfkO(sSLSocket);
    }
}
