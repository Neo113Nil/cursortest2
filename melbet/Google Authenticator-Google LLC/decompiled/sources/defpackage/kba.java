package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kba implements kbb {
    private final Object a;
    private final Object b;
    private final /* synthetic */ int c;

    public kba(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.kbb
    public final int a() {
        if (this.c != 0) {
            return ((Object[]) this.b).length;
        }
        return 1;
    }

    @Override // defpackage.kbb
    public final kbb c(Object obj, Object obj2, int i, int i2) {
        int length;
        int i3 = this.c;
        Object obj3 = this.a;
        int i4 = 0;
        if (i3 == 0) {
            int hashCode = obj3.hashCode();
            return hashCode != i ? kaz.b(new kba(obj, obj2, 0), i, this, hashCode, i2) : obj3 == obj ? new kba(obj, obj2, 0) : new kba(new Object[]{obj3, obj}, new Object[]{this.b, obj2}, 1);
        }
        Object[] objArr = (Object[]) obj3;
        int hashCode2 = objArr[0].hashCode();
        if (hashCode2 != i) {
            return kaz.b(new kba(obj, obj2, 0), i, this, hashCode2, i2);
        }
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (objArr[i4] == obj) {
                break;
            }
            i4++;
        }
        if (i4 != -1) {
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Object[] copyOf2 = Arrays.copyOf((Object[]) this.b, length);
            copyOf[i4] = obj;
            copyOf2[i4] = obj2;
            return new kba(copyOf, copyOf2, 1);
        }
        int i5 = length + 1;
        Object obj4 = this.b;
        Object[] copyOf3 = Arrays.copyOf(objArr, i5);
        Object[] copyOf4 = Arrays.copyOf((Object[]) obj4, i5);
        copyOf3[length] = obj;
        copyOf4[length] = obj2;
        return new kba(copyOf3, copyOf4, 1);
    }

    @Override // defpackage.kbb
    public final Object d(Object obj, int i, int i2) {
        if (this.c == 0) {
            if (this.a == obj) {
                return this.b;
            }
            return null;
        }
        int i3 = 0;
        while (true) {
            Object[] objArr = (Object[]) this.a;
            if (i3 >= objArr.length) {
                return null;
            }
            if (objArr[i3] == obj) {
                return ((Object[]) this.b)[i3];
            }
            i3++;
        }
    }

    public final String toString() {
        int i = 0;
        if (this.c == 0) {
            return String.format("Leaf(key=%s value=%s)", this.a, this.b);
        }
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        while (true) {
            Object[] objArr = (Object[]) this.b;
            if (i >= objArr.length) {
                sb.append(")");
                return sb.toString();
            }
            sb.append("(key=");
            sb.append(((Object[]) this.a)[i]);
            sb.append(" value=");
            sb.append(objArr[i]);
            sb.append(") ");
            i++;
        }
    }
}
