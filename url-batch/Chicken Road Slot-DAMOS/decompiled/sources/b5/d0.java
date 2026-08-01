package b5;

import androidx.work.CoroutineWorker;
import com.appsflyer.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1118d;

    /* renamed from: e, reason: collision with root package name */
    public int f1119e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1120i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, ld.a aVar, int i3) {
        super(2, aVar);
        this.f1118d = i3;
        this.f1120i = obj;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f1118d) {
            case 0:
                return new d0((ge.n) this.f1120i, aVar, 0);
            case 1:
                return new d0((f9.a) this.f1120i, aVar, 1);
            case 2:
                return new d0((n8.c) this.f1120i, aVar, 2);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new d0((n9.c) this.f1120i, aVar, 3);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return new d0((p2.c) this.f1120i, aVar, 4);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return new d0((q9.a) this.f1120i, aVar, 5);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new d0((s9.a) this.f1120i, aVar, 6);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new d0((CoroutineWorker) this.f1120i, aVar, 7);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new d0((v.b) this.f1120i, aVar, 8);
            case 9:
                return new d0((h0) this.f1120i, aVar, 9);
            case 10:
                return new d0((w4.a) this.f1120i, aVar, 10);
            case RequestError.STOP_TRACKING /* 11 */:
                return new d0((x.n) this.f1120i, aVar, 11);
            case 12:
                return new d0((x.p) this.f1120i, aVar, 12);
            default:
                return new d0((z4.f) this.f1120i, aVar, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ge.x xVar = (ge.x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f1118d) {
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((d0) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
                break;
        }
        return ((d0) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038b A[LOOP:1: B:138:0x02a8->B:174:0x038b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0291 -> B:110:0x0294). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
