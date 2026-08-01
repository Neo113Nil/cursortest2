package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dq extends h80 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jq f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dq(String str, jq jqVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = jqVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.h80
    public final long a() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                jq jqVar = this.f;
                try {
                    jqVar.B.r(this.g, this.h, true);
                } catch (IOException e) {
                    jqVar.f(2, 2, e);
                }
                return -1L;
            case 1:
                ej ejVar = this.f.p;
                int i3 = this.h;
                ejVar.getClass();
                if (i3 == 0) {
                    throw null;
                }
                synchronized (this.f) {
                    this.f.D.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                jq jqVar2 = this.f;
                try {
                    i = this.g;
                    i2 = this.h;
                } catch (IOException e2) {
                    jqVar2.f(2, 2, e2);
                }
                if (i2 == 0) {
                    throw null;
                }
                jqVar2.B.s(i, i2);
                return -1L;
        }
    }
}
