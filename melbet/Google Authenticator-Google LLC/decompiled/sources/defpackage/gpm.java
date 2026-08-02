package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpm {
    public final String a;
    public final jll b;
    public final gpk c;
    public final hel d;
    public final gzp e;
    public final Executor f;
    private final gzp g;
    private final gzp h;

    public gpm(String str, gzp gzpVar, jll jllVar, gpk gpkVar, hel helVar, gzp gzpVar2, gzp gzpVar3, Executor executor) {
        this.a = str;
        this.g = gzpVar;
        this.b = jllVar;
        this.c = gpkVar;
        this.d = helVar;
        this.e = gzpVar2;
        this.h = gzpVar3;
        this.f = executor;
    }

    public static gpl a() {
        gpl gplVar = new gpl();
        gplVar.d = (byte) 1;
        gplVar.b = new gpk(1, 2);
        return gplVar;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpm) {
            gpm gpmVar = (gpm) obj;
            if (this.a.equals(gpmVar.a) && this.g.equals(gpmVar.g) && this.b.equals(gpmVar.b) && this.c.equals(gpmVar.c) && hnu.H(this.d, gpmVar.d) && this.e.equals(gpmVar.e) && this.h.equals(gpmVar.h) && ((executor = this.f) != null ? executor.equals(gpmVar.f) : gpmVar.f == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() ^ 385623362) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Executor executor = this.f;
        return ((executor == null ? 0 : executor.hashCode()) ^ (((hashCode * 1000003) ^ 2040732332) * 1000003)) * 1000003;
    }

    public final String toString() {
        Executor executor = this.f;
        gzp gzpVar = this.h;
        gzp gzpVar2 = this.e;
        hel helVar = this.d;
        gpk gpkVar = this.c;
        jll jllVar = this.b;
        return "ProtoDataStoreConfig{blockingSafeReads=false, name=" + this.a + ", nameSuffix=" + String.valueOf(this.g) + ", schema=" + String.valueOf(jllVar) + ", storage=" + String.valueOf(gpkVar) + ", migrations=" + String.valueOf(helVar) + ", handler=" + String.valueOf(gzpVar2) + ", logger=" + String.valueOf(gzpVar) + ", ioExecutor=" + String.valueOf(executor) + ", lamsConfig=null}";
    }

    public gpm() {
        throw null;
    }
}
