package t0;

import T.C0086d;
import T.C0097o;
import W.J;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1432g implements u2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f15294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f15295b;

    public /* synthetic */ C1432g(r rVar, l lVar) {
        this.f15294a = rVar;
        this.f15295b = lVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r9.f3017a != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // u2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        U.b bVar;
        boolean isAvailable;
        boolean isEnabled;
        boolean canBeSpatialized;
        char c4;
        C0097o c0097o = (C0097o) obj;
        r rVar = this.f15294a;
        rVar.getClass();
        if (this.f15295b.f15327A && ((bool = rVar.f15373j) == null || !bool.booleanValue())) {
            int i4 = c0097o.f2846F;
            String str = c0097o.n;
            if (i4 != -1 && i4 > 2) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            if (Build.VERSION.SDK_INT >= 32) {
                                U.b bVar2 = rVar.f15371h;
                                if (bVar2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 && (bVar = rVar.f15371h) != null && bVar.f3017a) {
                                Spatializer spatializer = (Spatializer) bVar.f3018b;
                                spatializer.getClass();
                                isAvailable = F.b.c(spatializer).isAvailable();
                                if (isAvailable) {
                                    Spatializer spatializer2 = (Spatializer) rVar.f15371h.f3018b;
                                    spatializer2.getClass();
                                    isEnabled = F.b.c(spatializer2).isEnabled();
                                    if (isEnabled) {
                                        U.b bVar3 = rVar.f15371h;
                                        C0086d c0086d = rVar.f15372i;
                                        bVar3.getClass();
                                        int i5 = c0097o.f2846F;
                                        if (Objects.equals(str, "audio/eac3-joc")) {
                                            if (i5 == 16) {
                                                i5 = 12;
                                            }
                                        } else if (Objects.equals(str, "audio/iamf")) {
                                            if (i5 == -1) {
                                                i5 = 6;
                                            }
                                        } else if (Objects.equals(str, "audio/ac4") && (i5 == 18 || i5 == 21)) {
                                            i5 = 24;
                                        }
                                        int r4 = J.r(i5);
                                        if (r4 == 0) {
                                            canBeSpatialized = false;
                                        } else {
                                            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(r4);
                                            int i6 = c0097o.f2847G;
                                            if (i6 != -1) {
                                                channelMask.setSampleRate(i6);
                                            }
                                            Spatializer spatializer3 = (Spatializer) bVar3.f3018b;
                                            spatializer3.getClass();
                                            canBeSpatialized = F.b.c(spatializer3).canBeSpatialized(c0086d.a(), channelMask.build());
                                        }
                                        if (canBeSpatialized) {
                                        }
                                    }
                                }
                            }
                            return false;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                    Spatializer spatializer4 = (Spatializer) bVar.f3018b;
                    spatializer4.getClass();
                    isAvailable = F.b.c(spatializer4).isAvailable();
                    if (isAvailable) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
