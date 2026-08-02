package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eex implements bge {
    public final Object a;
    private final /* synthetic */ int b;

    public eex(Context context, int i) {
        this.b = i;
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.bge
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? ((fxz) obj).b().k.equals("google") : (((fxy) obj).b.b & 32) != 0 : ((eez) obj).b.c != null : cka.k(((eez) obj).b);
    }

    @Override // defpackage.bge
    public final /* synthetic */ bvw b(Object obj, int i, int i2, bbl bblVar) {
        int i3 = this.b;
        if (i3 == 0) {
            eez eezVar = (eez) obj;
            hoq.y(i == i2, "Width and height must be the same");
            cka ckaVar = new cka(this.a);
            if (i == Integer.MIN_VALUE) {
                i = 120;
            }
            return new bvw(eezVar, new eey(ckaVar, eezVar, i));
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return new bvw((fxz) obj, new fwh(this));
            }
            return ((bgj) this.a).a(String.class, InputStream.class).b(((fxy) obj).b.h, i, i2, bblVar);
        }
        String str = ((eez) obj).b.c;
        str.getClass();
        return ((bgj) this.a).a(String.class, InputStream.class).b(str, i, i2, bblVar);
    }

    public eex(bgj bgjVar, int i) {
        this.b = i;
        this.a = bgjVar;
    }

    public eex(Context context, int i, byte[] bArr) {
        this.b = i;
        this.a = context;
    }
}
