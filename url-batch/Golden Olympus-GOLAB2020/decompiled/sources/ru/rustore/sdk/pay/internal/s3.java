package ru.rustore.sdk.pay.internal;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.j4;

/* loaded from: classes3.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final x4 f44953a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final k4 f44954b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final v3 f44955c;

    public s3(@NotNull x4 dateTimeMapper, @NotNull k4 statusMapper, @NotNull v3 segmentMapper) {
        Intrinsics.checkNotNullParameter(dateTimeMapper, "dateTimeMapper");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        Intrinsics.checkNotNullParameter(segmentMapper, "segmentMapper");
        this.f44953a = dateTimeMapper;
        this.f44954b = statusMapper;
        this.f44955c = segmentMapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b3 a(@NotNull e3 dto) {
        j4 j4Var;
        int hashCode;
        u3 u3Var;
        t3 t3Var;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String value = dto.f43993a;
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.z(value)) {
            throw new IllegalStateException("Check failed.");
        }
        long j4 = dto.f43994b;
        if (j4 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        x4 x4Var = this.f44953a;
        String str = dto.f43996d.f44356a;
        x4Var.getClass();
        Date a4 = x4.a(str);
        x4 x4Var2 = this.f44953a;
        String str2 = dto.f43996d.f44357b;
        x4Var2.getClass();
        Date a5 = x4.a(str2);
        k4 k4Var = this.f44954b;
        String status = dto.f43997e;
        String str3 = dto.f43998f;
        k4Var.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        int hashCode2 = status.hashCode();
        if (hashCode2 == 907287315) {
            if (status.equals("PROCESSING")) {
                j4Var = j4.c.f44360a;
                j4 j4Var2 = j4Var;
                String value2 = dto.f43995c;
                Intrinsics.checkNotNullParameter(value2, "value");
                v3 v3Var = this.f44955c;
                String segment = dto.f43999g;
                v3Var.getClass();
                Intrinsics.checkNotNullParameter(segment, "segment");
                hashCode = segment.hashCode();
                if (hashCode != 90) {
                }
                return new b3(value, j4, a4, a5, j4Var2, value2, u3Var);
            }
            IllegalArgumentException throwable = new IllegalArgumentException("Unsupported coupon status: ".concat(status));
            y7 y7Var = k4Var.f44415a;
            y7Var.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            u3.e.i(y7Var.f45263a, throwable, null, 2, null);
            throw throwable;
        }
        if (hashCode2 == 1925346054) {
            if (status.equals("ACTIVE")) {
                j4Var = j4.a.f44358a;
                j4 j4Var22 = j4Var;
                String value22 = dto.f43995c;
                Intrinsics.checkNotNullParameter(value22, "value");
                v3 v3Var2 = this.f44955c;
                String segment2 = dto.f43999g;
                v3Var2.getClass();
                Intrinsics.checkNotNullParameter(segment2, "segment");
                hashCode = segment2.hashCode();
                if (hashCode != 90) {
                }
                return new b3(value, j4, a4, a5, j4Var22, value22, u3Var);
            }
            IllegalArgumentException throwable2 = new IllegalArgumentException("Unsupported coupon status: ".concat(status));
            y7 y7Var2 = k4Var.f44415a;
            y7Var2.getClass();
            Intrinsics.checkNotNullParameter(throwable2, "throwable");
            u3.e.i(y7Var2.f45263a, throwable2, null, 2, null);
            throw throwable2;
        }
        if (hashCode2 == 1990776172 && status.equals("CLOSED")) {
            if (str3 != null) {
                int hashCode3 = str3.hashCode();
                if (hashCode3 != -1031784143) {
                    if (hashCode3 != -591252731) {
                        if (hashCode3 == 2614205 && str3.equals("USED")) {
                            t3Var = t3.USED;
                            j4Var = new j4.b(t3Var);
                        }
                    } else if (str3.equals("EXPIRED")) {
                        t3Var = t3.EXPIRED;
                        j4Var = new j4.b(t3Var);
                    }
                } else if (str3.equals("CANCELLED")) {
                    t3Var = t3.CANCELLED;
                    j4Var = new j4.b(t3Var);
                }
                j4 j4Var222 = j4Var;
                String value222 = dto.f43995c;
                Intrinsics.checkNotNullParameter(value222, "value");
                v3 v3Var22 = this.f44955c;
                String segment22 = dto.f43999g;
                v3Var22.getClass();
                Intrinsics.checkNotNullParameter(segment22, "segment");
                hashCode = segment22.hashCode();
                if (hashCode != 90) {
                    switch (hashCode) {
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (segment22.equals("A")) {
                                u3Var = u3.A;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case 66:
                            if (segment22.equals("B")) {
                                u3Var = u3.B;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case 67:
                            if (segment22.equals("C")) {
                                u3Var = u3.C;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case 68:
                            if (segment22.equals("D")) {
                                u3Var = u3.D;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case 69:
                            if (segment22.equals("E")) {
                                u3Var = u3.E;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                            if (segment22.equals("F")) {
                                u3Var = u3.F;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
                            if (segment22.equals("G")) {
                                u3Var = u3.G;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                            if (segment22.equals("H")) {
                                u3Var = u3.H;
                                break;
                            }
                            u3Var = u3.A;
                            break;
                        default:
                            u3Var = u3.A;
                            break;
                    }
                } else {
                    if (segment22.equals("Z")) {
                        u3Var = u3.Z;
                    }
                    u3Var = u3.A;
                }
                return new b3(value, j4, a4, a5, j4Var222, value222, u3Var);
            }
            IllegalArgumentException throwable3 = new IllegalArgumentException("Unsupported resolution reason: " + str3);
            y7 y7Var3 = k4Var.f44415a;
            y7Var3.getClass();
            Intrinsics.checkNotNullParameter(throwable3, "throwable");
            u3.e.i(y7Var3.f45263a, throwable3, null, 2, null);
            throw throwable3;
        }
        IllegalArgumentException throwable22 = new IllegalArgumentException("Unsupported coupon status: ".concat(status));
        y7 y7Var22 = k4Var.f44415a;
        y7Var22.getClass();
        Intrinsics.checkNotNullParameter(throwable22, "throwable");
        u3.e.i(y7Var22.f45263a, throwable22, null, 2, null);
        throw throwable22;
    }
}
