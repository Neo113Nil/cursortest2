package i;

import A.g0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f6974a;

    /* renamed from: b, reason: collision with root package name */
    public int f6975b;

    public w(int i2) {
        this.f6974a = i2 == 0 ? n.f6930b : new Object[i2];
    }

    public final void a(Object obj) {
        int i2 = this.f6975b + 1;
        Object[] objArr = this.f6974a;
        if (objArr.length < i2) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f6974a = copyOf;
        }
        Object[] objArr2 = this.f6974a;
        int i4 = this.f6975b;
        objArr2[i4] = obj;
        this.f6975b = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i2 = wVar.f6975b;
            int i4 = this.f6975b;
            if (i2 == i4) {
                Object[] objArr = this.f6974a;
                Object[] objArr2 = wVar.f6974a;
                IntRange h4 = kotlin.ranges.b.h(0, i4);
                int i5 = h4.f7505d;
                int i6 = h4.f7506e;
                if (i5 > i6) {
                    return true;
                }
                while (Intrinsics.a(objArr[i5], objArr2[i5])) {
                    if (i5 == i6) {
                        return true;
                    }
                    i5++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f6974a;
        int i2 = this.f6975b;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i5];
            i4 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i4;
    }

    public final String toString() {
        g0 g0Var = new g0(13, this);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f6974a;
        int i2 = this.f6975b;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i4];
            if (i4 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i4 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) g0Var.invoke(obj));
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ w() {
        this(16);
    }
}
