package w4;

import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements f {
    private Boolean g(String str) {
        Object c7 = c(str);
        if (c7 instanceof Boolean) {
            return (Boolean) c7;
        }
        return null;
    }

    private String i() {
        return (String) c("sql");
    }

    private List<Object> j() {
        return (List) c("arguments");
    }

    @Override // w4.f
    public u4.d d() {
        return new u4.d(i(), j());
    }

    @Override // w4.f
    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    @Override // w4.f
    public Boolean f() {
        return g("inTransaction");
    }

    public boolean h() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }
}
