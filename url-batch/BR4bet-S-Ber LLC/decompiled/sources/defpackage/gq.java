package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gq extends h80 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ jq f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(String str, jq jqVar, int i, List list, boolean z) {
        super(str, true);
        this.f = jqVar;
        this.g = i;
    }

    @Override // defpackage.h80
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.p.getClass();
                try {
                    this.f.B.s(this.g, 9);
                    synchronized (this.f) {
                        this.f.D.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(String str, jq jqVar, int i, List list) {
        super(str, true);
        this.f = jqVar;
        this.g = i;
    }
}
