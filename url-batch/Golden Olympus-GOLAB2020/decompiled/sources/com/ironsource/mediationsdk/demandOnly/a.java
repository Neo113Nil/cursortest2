package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C1513m5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface a {

    @Metadata
    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a, reason: collision with other inner class name */
    public static final class C0153a implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<C1513m5> f17364a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0153a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C1513m5 a(@NotNull String instanceName) {
            Object obj;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            Iterator<T> it = this.f17364a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((C1513m5) obj).c(), instanceName)) {
                    break;
                }
            }
            return (C1513m5) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public String b() {
            if (this.f17364a.isEmpty()) {
                return "";
            }
            return '1' + ((C1513m5) CollectionsKt.first((List) this.f17364a)).c();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @Nullable
        public C1513m5 get(int i4) {
            if (i4 < 0 || i4 >= this.f17364a.size()) {
                return null;
            }
            return this.f17364a.get(i4);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f17364a.isEmpty();
        }

        public C0153a(@NotNull List<C1513m5> waterfall) {
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            this.f17364a = waterfall;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        @NotNull
        public List<C1513m5> a() {
            return this.f17364a;
        }

        public /* synthetic */ C0153a(List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? new ArrayList() : list);
        }
    }

    @Nullable
    C1513m5 a(@NotNull String str);

    @NotNull
    List<C1513m5> a();

    @NotNull
    String b();

    @Nullable
    C1513m5 get(int i4);

    boolean isEmpty();
}
