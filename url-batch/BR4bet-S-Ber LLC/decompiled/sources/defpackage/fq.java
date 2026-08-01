package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class fq extends h80 {
    public final /* synthetic */ jq e;
    public final /* synthetic */ int f;
    public final /* synthetic */ h9 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(String str, jq jqVar, int i, h9 h9Var, int i2, boolean z) {
        super(str, true);
        this.e = jqVar;
        this.f = i;
        this.g = h9Var;
        this.h = i2;
    }

    @Override // defpackage.h80
    public final long a() {
        try {
            ej ejVar = this.e.p;
            h9 h9Var = this.g;
            int i = this.h;
            ejVar.getClass();
            h9Var.skip(i);
            this.e.B.s(this.f, 9);
            synchronized (this.e) {
                this.e.D.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
