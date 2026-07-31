package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1476h3 implements gt<JSONArray> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C1469g3> f16554a = new ArrayList();

    @Metadata
    /* renamed from: com.ironsource.h3$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16555a;

        static {
            int[] iArr = new int[ft.values().length];
            try {
                iArr[ft.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ft.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16555a = iArr;
        }
    }

    private final List<C1469g3> b() {
        List<C1469g3> list = this.f16554a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C1469g3) obj).e() != dt.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<C1469g3> a() {
        List<C1469g3> list = this.f16554a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C1469g3 c1469g3 = (C1469g3) obj;
            if (c1469g3.e() != dt.LoadSuccess && c1469g3.e() != dt.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((C1469g3) obj2).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C1469g3> list2 = this.f16554a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            C1469g3 c1469g32 = (C1469g3) obj3;
            if (c1469g32.e() == dt.LoadSuccess && !set.contains(c1469g32.a())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    @Override // com.ironsource.xe
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(@NotNull ft mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i4 = a.f16555a[mode.ordinal()];
        if (i4 == 1) {
            List<C1469g3> b4 = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
            Iterator<T> it = b4.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1469g3) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i4 != 2) {
            throw new W1.m();
        }
        List<C1469g3> a4 = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
        Iterator<T> it2 = a4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1469g3) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(@NotNull C1469g3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f16554a.add(event);
    }
}
