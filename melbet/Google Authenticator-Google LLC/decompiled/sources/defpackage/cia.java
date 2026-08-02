package defpackage;

import android.net.Network;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cia {
    public cid a;
    public String b;
    public List c;
    public String d;
    public String e;
    public Network f;
    public int g;
    public byte h;
    private int i;
    private boolean j;
    private boolean k;

    public final cib a() {
        cid cidVar = this.a;
        if (cidVar == null && this.b == null) {
            throw new IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
        }
        if (cidVar != null && this.b != null) {
            throw new IllegalArgumentException("Both setObfuscatedGaiaId and setAccount cannot be called.");
        }
        if (this.c == null) {
            throw new IllegalArgumentException("A token type must be specified.");
        }
        if (this.d != null && b() == 0) {
            throw new IllegalArgumentException("Please provide a delegation type for the user id.");
        }
        if (b() == 1 && this.d == null) {
            throw new IllegalArgumentException("Please provide a delegatee user ID.");
        }
        if (this.h == 31) {
            return new cib(this.a, this.b, this.c, null, null, null, this.i, this.d, false, null, this.e, this.j, this.f, this.k, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.h) == 0) {
            sb.append(" delegationType");
        }
        if ((this.h & 2) == 0) {
            sb.append(" handleNotification");
        }
        if ((this.h & 4) == 0) {
            sb.append(" suppressProgressScreen");
        }
        if ((this.h & 8) == 0) {
            sb.append(" useNewExceptions");
        }
        if ((this.h & 16) == 0) {
            sb.append(" clientVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int b() {
        if ((this.h & 1) != 0) {
            return this.i;
        }
        throw new IllegalStateException("Property \"delegationType\" has not been set");
    }

    public final void c(int i) {
        this.i = i;
        this.h = (byte) (this.h | 1);
    }

    public final void d(boolean z) {
        this.j = z;
        this.h = (byte) (this.h | 4);
    }

    public final void e(boolean z) {
        this.k = z;
        this.h = (byte) (this.h | 8);
    }
}
