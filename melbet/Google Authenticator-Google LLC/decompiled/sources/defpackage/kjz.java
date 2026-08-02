package defpackage;

import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjz extends jzm {
    static final boolean a;
    public static final /* synthetic */ int b = 0;

    static {
        Charset charset = khd.a;
        a = jxy.a("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // defpackage.jza
    public final jzk a(jzc jzcVar) {
        return a ? new kju(jzcVar) : new kjy(jzcVar);
    }

    @Override // defpackage.jzm
    public final kam b(Map map) {
        try {
            Boolean a2 = ixb.a(map, "shuffleAddressList");
            return new kam(a ? new kjq(a2) : new kjw(a2));
        } catch (RuntimeException e) {
            return new kam(kbq.l.d(e).e("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.jzm
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.jzm
    public final void d() {
    }

    @Override // defpackage.jzm
    public final void e() {
    }
}
