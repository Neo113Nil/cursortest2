package t3;

import android.content.Context;
import android.content.ContextWrapper;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends r6.l implements q6.c {

    /* renamed from: h, reason: collision with root package name */
    public static final b f8737h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f8738i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f8739j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f8740k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f8741l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f8742m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f8743n;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8744g;

    static {
        int i7 = 1;
        f8737h = new b(i7, 0);
        f8738i = new b(i7, 1);
        f8739j = new b(i7, 2);
        f8740k = new b(i7, 3);
        f8741l = new b(i7, 4);
        f8742m = new b(i7, 5);
        f8743n = new b(i7, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f8744g = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8744g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Context context = (Context) obj;
                r6.k.f(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                r6.k.f(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                v vVar = (v) obj;
                r6.k.f(vVar, "destination");
                y yVar = vVar.f8858g;
                if (yVar == null || yVar.f8875p != vVar.f8862k) {
                    return null;
                }
                return yVar;
            case 3:
                v vVar2 = (v) obj;
                r6.k.f(vVar2, "destination");
                y yVar2 = vVar2.f8858g;
                if (yVar2 == null || yVar2.f8875p != vVar2.f8862k) {
                    return null;
                }
                return yVar2;
            case 4:
                v vVar3 = (v) obj;
                r6.k.f(vVar3, "it");
                return Integer.valueOf(vVar3.f8862k);
            case 5:
                v vVar4 = (v) obj;
                r6.k.f(vVar4, "it");
                return vVar4.f8858g;
            default:
                v vVar5 = (v) obj;
                r6.k.f(vVar5, "it");
                if (!(vVar5 instanceof y)) {
                    return null;
                }
                y yVar3 = (y) vVar5;
                return yVar3.x(yVar3.f8875p, yVar3, false);
        }
    }
}
