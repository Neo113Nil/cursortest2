package okio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends AbstractC3213c implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final a f43291d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final h[] f43292b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f43293c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j4, C3372e c3372e, int i4, List list, int i5, int i6, List list2) {
            int i7;
            int i8;
            int i9;
            long j5;
            int i10 = i4;
            if (i5 >= i6) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i11 = i5; i11 < i6; i11++) {
                if (((h) list.get(i11)).v() < i10) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i5);
            h hVar2 = (h) list.get(i6 - 1);
            if (i10 == hVar.v()) {
                int intValue = ((Number) list2.get(i5)).intValue();
                int i12 = i5 + 1;
                h hVar3 = (h) list.get(i12);
                i7 = i12;
                i8 = intValue;
                hVar = hVar3;
            } else {
                i7 = i5;
                i8 = -1;
            }
            if (hVar.g(i10) == hVar2.g(i10)) {
                int min = Math.min(hVar.v(), hVar2.v());
                int i13 = 0;
                for (int i14 = i10; i14 < min && hVar.g(i14) == hVar2.g(i14); i14++) {
                    i13++;
                }
                long c4 = j4 + c(c3372e) + 2 + i13 + 1;
                c3372e.t(-i13);
                c3372e.t(i8);
                int i15 = i10 + i13;
                while (i10 < i15) {
                    c3372e.t(hVar.g(i10) & 255);
                    i10++;
                }
                if (i7 + 1 == i6) {
                    if (i15 != ((h) list.get(i7)).v()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c3372e.t(((Number) list2.get(i7)).intValue());
                    return;
                } else {
                    C3372e c3372e2 = new C3372e();
                    c3372e.t(((int) (c(c3372e2) + c4)) * (-1));
                    a(c4, c3372e2, i15, list, i7, i6, list2);
                    c3372e.F(c3372e2);
                    return;
                }
            }
            int i16 = 1;
            for (int i17 = i7 + 1; i17 < i6; i17++) {
                if (((h) list.get(i17 - 1)).g(i10) != ((h) list.get(i17)).g(i10)) {
                    i16++;
                }
            }
            long c5 = j4 + c(c3372e) + 2 + (i16 * 2);
            c3372e.t(i16);
            c3372e.t(i8);
            for (int i18 = i7; i18 < i6; i18++) {
                byte g4 = ((h) list.get(i18)).g(i10);
                if (i18 == i7 || g4 != ((h) list.get(i18 - 1)).g(i10)) {
                    c3372e.t(g4 & 255);
                }
            }
            C3372e c3372e3 = new C3372e();
            while (i7 < i6) {
                byte g5 = ((h) list.get(i7)).g(i10);
                int i19 = i7 + 1;
                int i20 = i19;
                while (true) {
                    if (i20 >= i6) {
                        i9 = i6;
                        break;
                    } else {
                        if (g5 != ((h) list.get(i20)).g(i10)) {
                            i9 = i20;
                            break;
                        }
                        i20++;
                    }
                }
                if (i19 == i9 && i10 + 1 == ((h) list.get(i7)).v()) {
                    c3372e.t(((Number) list2.get(i7)).intValue());
                    j5 = c5;
                } else {
                    c3372e.t(((int) (c(c3372e3) + c5)) * (-1));
                    j5 = c5;
                    a(j5, c3372e3, i10 + 1, list, i7, i9, list2);
                }
                c5 = j5;
                i7 = i9;
            }
            c3372e.F(c3372e3);
        }

        static /* synthetic */ void b(a aVar, long j4, C3372e c3372e, int i4, List list, int i5, int i6, List list2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j4 = 0;
            }
            aVar.a(j4, c3372e, (i7 & 4) != 0 ? 0 : i4, list, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? list.size() : i6, list2);
        }

        private final long c(C3372e c3372e) {
            return c3372e.l0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s d(h... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i4 = 0;
            if (byteStrings.length == 0) {
                return new s(new h[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List N02 = AbstractC3219i.N0(byteStrings);
            CollectionsKt.sort(N02);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (h hVar : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List mutableListOf = CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                mutableListOf.set(CollectionsKt.binarySearch$default(N02, byteStrings[i5], 0, 0, 6, (Object) null), Integer.valueOf(i6));
                i5++;
                i6++;
            }
            if (((h) N02.get(0)).v() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i7 = 0;
            while (i7 < N02.size()) {
                h hVar2 = (h) N02.get(i7);
                int i8 = i7 + 1;
                int i9 = i8;
                while (i9 < N02.size()) {
                    h hVar3 = (h) N02.get(i9);
                    if (hVar3.w(hVar2)) {
                        if (hVar3.v() == hVar2.v()) {
                            throw new IllegalArgumentException(("duplicate option: " + hVar3).toString());
                        }
                        if (((Number) mutableListOf.get(i9)).intValue() > ((Number) mutableListOf.get(i7)).intValue()) {
                            N02.remove(i9);
                            mutableListOf.remove(i9);
                        } else {
                            i9++;
                        }
                    }
                }
                i7 = i8;
            }
            C3372e c3372e = new C3372e();
            b(this, 0L, c3372e, 0, N02, 0, 0, mutableListOf, 53, null);
            int[] iArr = new int[(int) c(c3372e)];
            while (!c3372e.v()) {
                iArr[i4] = c3372e.readInt();
                i4++;
            }
            Object[] copyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            return new s((h[]) copyOf, iArr, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ s(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    public /* bridge */ boolean b(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return b((h) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h get(int i4) {
        return this.f43292b[i4];
    }

    public final h[] e() {
        return this.f43292b;
    }

    public final int[] f() {
        return this.f43293c;
    }

    public /* bridge */ int g(h hVar) {
        return super.indexOf(hVar);
    }

    @Override // kotlin.collections.AbstractC3211a
    public int getSize() {
        return this.f43292b.length;
    }

    public /* bridge */ int h(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return g((h) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return h((h) obj);
        }
        return -1;
    }

    private s(h[] hVarArr, int[] iArr) {
        this.f43292b = hVarArr;
        this.f43293c = iArr;
    }
}
