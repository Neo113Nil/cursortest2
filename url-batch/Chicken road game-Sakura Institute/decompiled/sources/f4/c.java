package f4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.plate.PlatePageActivity;
import l.x0;
import m.n0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3302g;

    /* renamed from: h, reason: collision with root package name */
    public int f3303h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, h6.d dVar) {
        super(i7, dVar);
        this.f3302g = 0;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f3302g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = new c(2, dVar);
                cVar.f3304i = obj;
                return cVar;
            case 1:
                return new c((PlatePageActivity) this.f3304i, dVar, 1);
            case 2:
                return new c((q6.c) this.f3304i, dVar, 2);
            case 3:
                return new c((x0) this.f3304i, dVar, 3);
            case 4:
                return new c((l1.d0) this.f3304i, dVar, 4);
            case 5:
                return new c((m.t) this.f3304i, dVar, 5);
            case 6:
                return new c((m.z) this.f3304i, dVar, 6);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new c((n0) this.f3304i, dVar, 7);
            default:
                return new c((y.j) this.f3304i, dVar, 8);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f3302g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case 2:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case 3:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case 4:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case 5:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case 6:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
                return i6.a.f4956f;
            default:
                return ((c) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:23:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:21:0x0088). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, h6.d dVar, int i7) {
        super(2, dVar);
        this.f3302g = i7;
        this.f3304i = obj;
    }
}
