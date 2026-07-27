package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata
/* loaded from: classes.dex */
final class w extends M2.p implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f7545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(List list, boolean z4) {
        super(2);
        this.f7545d = list;
        this.f7546e = z4;
    }

    public final Pair<Integer, Integer> a(CharSequence $receiver, int i2) {
        Object obj;
        Pair pair;
        Object obj2;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        List list = this.f7545d;
        boolean z4 = this.f7546e;
        if (z4 || list.size() != 1) {
            if (i2 < 0) {
                i2 = 0;
            }
            IntRange intRange = new IntRange(i2, $receiver.length(), 1);
            boolean z5 = $receiver instanceof String;
            int i4 = intRange.f7507i;
            int i5 = intRange.f7506e;
            if (z5) {
                if ((i4 > 0 && i2 <= i5) || (i4 < 0 && i5 <= i2)) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (u.j(str, 0, (String) $receiver, i2, str.length(), z4)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (i2 == i5) {
                                break;
                            }
                            i2 += i4;
                        } else {
                            pair = new Pair(Integer.valueOf(i2), str2);
                            break;
                        }
                    }
                }
                pair = null;
            } else {
                if ((i4 > 0 && i2 <= i5) || (i4 < 0 && i5 <= i2)) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (y.C(str3, 0, $receiver, i2, str3.length(), z4)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (i2 == i5) {
                                break;
                            }
                            i2 += i4;
                        } else {
                            pair = new Pair(Integer.valueOf(i2), str4);
                            break;
                        }
                    }
                }
                pair = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(list, "<this>");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = (String) list.get(0);
            int v4 = y.v($receiver, str5, i2, false, 4);
            if (v4 >= 0) {
                pair = new Pair(Integer.valueOf(v4), str5);
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new Pair<>(pair.f7485d, Integer.valueOf(((String) pair.f7486e).length()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
        return a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
