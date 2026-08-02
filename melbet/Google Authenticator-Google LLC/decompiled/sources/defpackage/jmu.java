package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jmu extends jkd {
    public jmu() {
        super(null);
    }

    @Override // defpackage.jkd
    public final iwq b(jll jllVar, int i) {
        String name = jllVar.getClass().getName();
        switch (name.hashCode()) {
            case 99536:
                if (name.equals("dkw") && i == 100000001) {
                    return dlt.a;
                }
                return null;
            case 99537:
                if (!name.equals("dkx")) {
                    return null;
                }
                switch (i) {
                    case 100000004:
                        return dlf.a;
                    case 100000005:
                        return dmc.a;
                    case 100000015:
                        return dmh.a;
                    case 200000050:
                        return efs.a;
                    default:
                        return null;
                }
            case 100726:
                if (name.equals("esd") && i == 334728578) {
                    return esj.j;
                }
                return null;
            case 101757:
                if (name.equals("ful") && i == 1000) {
                    return fwc.a;
                }
                return null;
            case 105405:
                if (!name.equals("job")) {
                    return null;
                }
                switch (i) {
                    case 182135729:
                        return ice.e;
                    case 198889211:
                        return icg.c;
                    case 202735639:
                        return ich.d;
                    case 203522521:
                        return icf.b;
                    default:
                        return null;
                }
            default:
                return null;
        }
    }
}
