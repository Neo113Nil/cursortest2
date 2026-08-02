package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cno {
    private final int a;
    private final cmk b;
    private final String c;
    private final bxm d;

    public cno(bxm bxmVar, cmk cmkVar, String str) {
        this.d = bxmVar;
        this.b = cmkVar;
        this.c = str;
        this.a = Arrays.hashCode(new Object[]{bxmVar, cmkVar, str, null});
    }

    public final String a() {
        return (String) this.d.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cno)) {
            return false;
        }
        cno cnoVar = (cno) obj;
        return Objects.equals(this.d, cnoVar.d) && Objects.equals(this.b, cnoVar.b) && Objects.equals(this.c, cnoVar.c) && Objects.equals(null, null);
    }

    public final int hashCode() {
        return this.a;
    }
}
