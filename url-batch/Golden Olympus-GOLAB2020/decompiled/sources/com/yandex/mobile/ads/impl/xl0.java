package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ts;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ve2 f34614a;

    private static final class a implements Comparator<wi1> {
        @Override // java.util.Comparator
        public final int compare(wi1 wi1Var, wi1 wi1Var2) {
            wi1 first = wi1Var;
            wi1 second = wi1Var2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (Intrinsics.areEqual(first, second)) {
                return 0;
            }
            String e4 = first.a().e();
            String e5 = second.a().e();
            if (Intrinsics.areEqual(e4, InstreamAdBreakType.PREROLL)) {
                return -1;
            }
            if (Intrinsics.areEqual(e5, InstreamAdBreakType.PREROLL) || Intrinsics.areEqual(e4, InstreamAdBreakType.POSTROLL)) {
                return 1;
            }
            return (!Intrinsics.areEqual(e5, InstreamAdBreakType.POSTROLL) && first.b() >= second.b()) ? 1 : -1;
        }
    }

    public xl0(@NotNull ve2 videoPlayerController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        this.f34614a = videoPlayerController;
    }

    @NotNull
    public final wl0 a(@NotNull List<ss> adBreaks) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : adBreaks) {
            if (Intrinsics.areEqual(((ss) obj3).e(), InstreamAdBreakType.MIDROLL)) {
                arrayList2.add(obj3);
            }
        }
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj4 = arrayList2.get(i4);
            i4++;
            ss ssVar = (ss) obj4;
            ts b4 = ssVar.b();
            long b5 = b4.b();
            if (ts.a.f32566b == b4.a()) {
                b5 = (long) ((b5 / 100) * this.f34614a.b());
            }
            arrayList.add(new wi1(ssVar, b5));
        }
        Collections.sort(arrayList, new a());
        Iterator<T> it = adBreaks.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((ss) obj2).e(), InstreamAdBreakType.PREROLL)) {
                break;
            }
        }
        ss ssVar2 = (ss) obj2;
        Iterator<T> it2 = adBreaks.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.areEqual(((ss) next).e(), InstreamAdBreakType.POSTROLL)) {
                obj = next;
                break;
            }
        }
        return new wl0(arrayList, ssVar2, (ss) obj);
    }
}
