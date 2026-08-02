package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcp implements cmk {
    public static final dcp b = new dcp();
    private final boolean c = false;
    private final boolean d = false;
    private final String e = null;
    private final boolean f = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private dcp() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcp)) {
            return false;
        }
        dcp dcpVar = (dcp) obj;
        boolean z = dcpVar.c;
        boolean z2 = dcpVar.d;
        String str = dcpVar.e;
        if (Objects.equals(null, null)) {
            boolean z3 = dcpVar.f;
            boolean z4 = dcpVar.i;
            String str2 = dcpVar.g;
            if (Objects.equals(null, null)) {
                String str3 = dcpVar.h;
                if (Objects.equals(null, null)) {
                    Long l = dcpVar.j;
                    if (Objects.equals(null, null)) {
                        Long l2 = dcpVar.k;
                        if (Objects.equals(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
