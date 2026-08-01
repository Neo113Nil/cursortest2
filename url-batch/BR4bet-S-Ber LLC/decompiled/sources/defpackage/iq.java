package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class iq extends h80 {
    public final /* synthetic */ jq e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(String str, jq jqVar, int i, long j) {
        super(str, true);
        this.e = jqVar;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.h80
    public final long a() {
        jq jqVar = this.e;
        try {
            jqVar.B.t(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            jqVar.f(2, 2, e);
            return -1L;
        }
    }
}
