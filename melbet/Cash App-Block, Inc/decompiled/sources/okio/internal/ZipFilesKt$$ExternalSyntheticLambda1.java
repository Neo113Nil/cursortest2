package okio.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import okio.RealBufferedSource;

/* loaded from: classes9.dex */
public final /* synthetic */ class ZipFilesKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ RealBufferedSource f$0;
    public final /* synthetic */ Ref$ObjectRef f$1;
    public final /* synthetic */ Ref$ObjectRef f$2;
    public final /* synthetic */ Ref$ObjectRef f$3;

    public /* synthetic */ ZipFilesKt$$ExternalSyntheticLambda1(Ref$ObjectRef ref$ObjectRef, RealBufferedSource realBufferedSource, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.f$1 = ref$ObjectRef;
        this.f$0 = realBufferedSource;
        this.f$2 = ref$ObjectRef2;
        this.f$3 = ref$ObjectRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.f$3;
        Ref$ObjectRef ref$ObjectRef2 = this.f$2;
        RealBufferedSource realBufferedSource = this.f$0;
        Ref$ObjectRef ref$ObjectRef3 = this.f$1;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    if (longValue < 1) {
                        a$$ExternalSyntheticBUOutline0.m$4("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        byte readByte = realBufferedSource.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue < j) {
                            a$$ExternalSyntheticBUOutline0.m$4("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                ref$ObjectRef3.element = Integer.valueOf(realBufferedSource.readIntLe());
                            }
                            if (z2) {
                                ref$ObjectRef2.element = Integer.valueOf(realBufferedSource.readIntLe());
                            }
                            if (z3) {
                                ref$ObjectRef.element = Integer.valueOf(realBufferedSource.readIntLe());
                            }
                        }
                    }
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (ref$ObjectRef3.element != null) {
                        a$$ExternalSyntheticBUOutline0.m$4("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (longValue2 != 24) {
                        a$$ExternalSyntheticBUOutline0.m$4("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        ref$ObjectRef3.element = Long.valueOf(realBufferedSource.readLongLe());
                        ref$ObjectRef2.element = Long.valueOf(realBufferedSource.readLongLe());
                        ref$ObjectRef.element = Long.valueOf(realBufferedSource.readLongLe());
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ZipFilesKt$$ExternalSyntheticLambda1(RealBufferedSource realBufferedSource, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.f$0 = realBufferedSource;
        this.f$1 = ref$ObjectRef;
        this.f$2 = ref$ObjectRef2;
        this.f$3 = ref$ObjectRef3;
    }
}
