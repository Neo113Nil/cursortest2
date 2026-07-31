package l1;

import W1.m;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k1.k;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l1.C3252a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f41307a;

    /* renamed from: b, reason: collision with root package name */
    private final k f41308b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41309c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41310a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.CHROME_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.WEBVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41310a = iArr;
        }
    }

    public c(Context context, k packageManagerHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageManagerHelper, "packageManagerHelper");
        this.f41307a = context;
        this.f41308b = packageManagerHelper;
        this.f41309c = CollectionsKt.listOf((Object[]) new d[]{d.NATIVE, d.CHROME_TAB, d.WEBVIEW});
    }

    public final AbstractC3253b a(d preferredLoginType) {
        AbstractC3253b b4;
        Intrinsics.checkNotNullParameter(preferredLoginType, "preferredLoginType");
        Integer valueOf = Integer.valueOf(this.f41309c.indexOf(preferredLoginType));
        AbstractC3253b abstractC3253b = null;
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        List list = this.f41309c;
        Iterator it = list.subList(intValue, list.size()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i4 = a.f41310a[((d) it.next()).ordinal()];
            if (i4 == 1) {
                b4 = e.f41315e.b(this.f41308b);
            } else if (i4 == 2) {
                C3252a.C0235a c0235a = C3252a.f41300e;
                PackageManager packageManager = this.f41307a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                b4 = c0235a.a(packageManager);
            } else {
                if (i4 != 3) {
                    throw new m();
                }
                b4 = f.f41320d.a();
            }
            if (b4 != null) {
                abstractC3253b = b4;
                break;
            }
        }
        if (abstractC3253b != null) {
            return abstractC3253b;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }
}
