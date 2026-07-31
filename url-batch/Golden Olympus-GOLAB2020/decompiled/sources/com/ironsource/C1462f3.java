package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1462f3 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f16202b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f16203c = -1;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1502l1 f16204a;

    @Metadata
    /* renamed from: com.ironsource.f3$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return Z1.a.d(Integer.valueOf(((LevelPlayAdSize) t5).getWidth()), Integer.valueOf(((LevelPlayAdSize) t4).getWidth()));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$c */
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f16205a;

        public c(Comparator comparator) {
            this.f16205a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f16205a.compare(t4, t5);
            return compare != 0 ? compare : Z1.a.d(Integer.valueOf(((LevelPlayAdSize) t5).getHeight()), Integer.valueOf(((LevelPlayAdSize) t4).getHeight()));
        }
    }

    public C1462f3(@NotNull C1502l1 adSizeTools) {
        Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.f16204a = adSizeTools;
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C1502l1.a(this.f16204a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
        } else if (num != null) {
            return num.intValue();
        }
        return bb.f15592a.b(context);
    }

    @Nullable
    public final LevelPlayAdSize a(@NotNull Context context, @Nullable Integer num) {
        IronLog ironLog;
        C1502l1 c1502l1;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f16204a.d()) {
            Integer b4 = this.f16204a.b(context);
            if (b4 != null) {
                int intValue = b4.intValue();
                int a4 = a(num, context);
                int a5 = this.f16204a.a(a4);
                List<LevelPlayAdSize> a6 = a();
                for (LevelPlayAdSize levelPlayAdSize : a(a6, intValue, a4)) {
                    if (levelPlayAdSize.getWidth() <= a4 && (levelPlayAdSize.getHeight() <= a5 || a5 == -1)) {
                        a5 = Math.max(a5, levelPlayAdSize.getHeight());
                        break;
                    }
                }
                levelPlayAdSize = null;
                if (levelPlayAdSize == null) {
                    a5 = ((LevelPlayAdSize) CollectionsKt.last((List) a6)).getHeight();
                    levelPlayAdSize = LevelPlayAdSize.Companion.createCustomSize(a4, a5);
                }
                int i4 = a5;
                LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
                IronLog.INTERNAL.info(C1502l1.a(this.f16204a, "Adaptive: " + a4 + 'x' + i4 + " Fallback: " + levelPlayAdSize2, (String) null, 2, (Object) null));
                return new LevelPlayAdSize(a4, i4, com.ironsource.mediationsdk.l.f17632f, true, levelPlayAdSize2);
            }
            ironLog = IronLog.API;
            c1502l1 = this.f16204a;
            str = "Error getting max current orientation banner height";
        } else {
            ironLog = IronLog.API;
            c1502l1 = this.f16204a;
            str = "The SDK must be successfully initialized to create an Adaptive Ad Size";
        }
        ironLog.error(C1502l1.a(c1502l1, str, (String) null, 2, (Object) null));
        return null;
    }

    private final List<LevelPlayAdSize> a() {
        return CollectionsKt.sortedWith(this.f16204a.b(), new c(new b()));
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i4 && levelPlayAdSize.getWidth() <= i5) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
