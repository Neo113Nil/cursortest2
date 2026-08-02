package O0;

import E.AbstractC0005f;
import W.u;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2002a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2003b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2004c;

    public a(int i4, long j4, long j5) {
        this.f2002a = i4;
        switch (i4) {
            case 2:
                this.f2003b = j4;
                this.f2004c = j5;
                break;
            default:
                this.f2003b = j5;
                this.f2004c = j4;
                break;
        }
    }

    public static long d(long j4, u uVar) {
        long z = uVar.z();
        if ((128 & z) != 0) {
            return 8589934591L & ((((z & 1) << 32) | uVar.B()) + j4);
        }
        return -9223372036854775807L;
    }

    @Override // O0.b
    public final String toString() {
        switch (this.f2002a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.f2003b);
                sb.append(", identifier= ");
                return AbstractC0005f.p(sb, this.f2004c, " }");
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.f2003b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return AbstractC0005f.p(sb2, this.f2004c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f2003b);
                sb3.append(", playbackPositionUs= ");
                return AbstractC0005f.p(sb3, this.f2004c, " }");
        }
    }

    public a(long j4, long j5, List list) {
        this.f2002a = 1;
        this.f2003b = j4;
        this.f2004c = j5;
        Collections.unmodifiableList(list);
    }
}
