package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends j6.h implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f37g;

    /* renamed from: h, reason: collision with root package name */
    public int f38h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f39i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f40j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, h6.d dVar, int i7) {
        super(2, dVar);
        this.f37g = i7;
        this.f40j = obj;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f37g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d0 d0Var = new d0((q6.c) this.f40j, dVar, 0);
                d0Var.f39i = obj;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0((m.f) this.f40j, dVar, 1);
                d0Var2.f39i = obj;
                return d0Var2;
            default:
                d0 d0Var3 = new d0((c1.a) this.f40j, dVar, 2);
                d0Var3.f39i = obj;
                return d0Var3;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        l1.c0 c0Var = (l1.c0) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f37g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((d0) create(c0Var, dVar)).invokeSuspend(d6.z.f2639a);
                break;
        }
        return ((d0) create(c0Var, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00c3 -> B:26:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0161 -> B:62:0x0164). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
