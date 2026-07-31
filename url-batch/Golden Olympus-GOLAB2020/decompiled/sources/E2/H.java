package E2;

import A2.k;
import com.ironsource.b9;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f520a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f521b;

    /* renamed from: c, reason: collision with root package name */
    private int f522c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f523a = new a();

        private a() {
        }
    }

    public H() {
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = -1;
        }
        this.f521b = iArr;
        this.f522c = -1;
    }

    private final void e() {
        int i4 = this.f522c * 2;
        Object[] copyOf = Arrays.copyOf(this.f520a, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.f520a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f521b, i4);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.f521b = copyOf2;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i4 = this.f522c + 1;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = this.f520a[i5];
            if (obj instanceof A2.f) {
                A2.f fVar = (A2.f) obj;
                if (!Intrinsics.areEqual(fVar.e(), k.b.f100a)) {
                    int i6 = this.f521b[i5];
                    if (i6 >= 0) {
                        sb.append(".");
                        sb.append(fVar.g(i6));
                    }
                } else if (this.f521b[i5] != -1) {
                    sb.append(b9.i.f15550d);
                    sb.append(this.f521b[i5]);
                    sb.append(b9.i.f15552e);
                }
            } else if (obj != a.f523a) {
                sb.append(b9.i.f15550d);
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append(b9.i.f15552e);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void b() {
        int i4 = this.f522c;
        int[] iArr = this.f521b;
        if (iArr[i4] == -2) {
            iArr[i4] = -1;
            this.f522c = i4 - 1;
        }
        int i5 = this.f522c;
        if (i5 != -1) {
            this.f522c = i5 - 1;
        }
    }

    public final void c(A2.f sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i4 = this.f522c + 1;
        this.f522c = i4;
        if (i4 == this.f520a.length) {
            e();
        }
        this.f520a[i4] = sd;
    }

    public final void d() {
        int[] iArr = this.f521b;
        int i4 = this.f522c;
        if (iArr[i4] == -2) {
            this.f520a[i4] = a.f523a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f521b;
        int i4 = this.f522c;
        if (iArr[i4] != -2) {
            int i5 = i4 + 1;
            this.f522c = i5;
            if (i5 == this.f520a.length) {
                e();
            }
        }
        Object[] objArr = this.f520a;
        int i6 = this.f522c;
        objArr[i6] = obj;
        this.f521b[i6] = -2;
    }

    public final void g(int i4) {
        this.f521b[this.f522c] = i4;
    }

    public String toString() {
        return a();
    }
}
