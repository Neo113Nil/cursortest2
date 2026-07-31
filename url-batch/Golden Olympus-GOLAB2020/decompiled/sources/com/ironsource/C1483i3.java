package com.ironsource;

import com.ironsource.q9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1483i3 implements InterfaceC1541q3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1504l3 f16653a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sf f16654b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mm<Integer, Integer> f16655c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q9 f16656d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private List<InterfaceC1520n3> f16657e;

    public C1483i3(@NotNull InterfaceC1504l3 eventBaseData, @NotNull sf eventsManager, @NotNull mm<Integer, Integer> eventsMapper, @NotNull q9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f16653a = eventBaseData;
        this.f16654b = eventsManager;
        this.f16655c = eventsMapper;
        this.f16656d = currentTimeProvider;
        this.f16657e = new ArrayList();
    }

    @Override // com.ironsource.InterfaceC1541q3
    public void a() {
        this.f16657e.clear();
    }

    @NotNull
    public final List<InterfaceC1520n3> b() {
        return this.f16657e;
    }

    public /* synthetic */ C1483i3(InterfaceC1504l3 interfaceC1504l3, sf sfVar, mm mmVar, q9 q9Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1504l3, sfVar, mmVar, (i4 & 8) != 0 ? new q9.a() : q9Var);
    }

    private final JSONObject b(List<? extends InterfaceC1520n3> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC1520n3> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC1541q3
    public void a(int i4, @NotNull List<InterfaceC1520n3> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            ArrayList<InterfaceC1520n3> a4 = this.f16653a.a();
            int size = a4.size();
            int i5 = 0;
            while (i5 < size) {
                InterfaceC1520n3 interfaceC1520n3 = a4.get(i5);
                i5++;
                arrayList.add(interfaceC1520n3);
            }
            Iterator<InterfaceC1520n3> it = this.f16657e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.f16654b.a(new zb(this.f16655c.a(Integer.valueOf(i4)).intValue(), this.f16656d.a(), b(arrayList)));
        } catch (Exception e4) {
            o9.d().a(e4);
            System.out.println((Object) ("LogRemote | Exception: " + e4.getMessage()));
        }
    }

    public final void a(@NotNull List<InterfaceC1520n3> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f16657e = list;
    }

    @Override // com.ironsource.InterfaceC1541q3
    public void a(@NotNull InterfaceC1520n3... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC1520n3 interfaceC1520n3 : analyticsEventEntity) {
            this.f16657e.add(interfaceC1520n3);
        }
    }
}
