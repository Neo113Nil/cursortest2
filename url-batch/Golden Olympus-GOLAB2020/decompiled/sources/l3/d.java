package l3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l3.h;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f41341b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f41342a = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ d b(d dVar, String str, String str2, h hVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return dVar.a(str, str2, hVar);
    }

    public final d a(String name, String str, h body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f41342a.add(new f(name, str, body.getContentType(), body));
        return this;
    }

    public final d c(String name, String content) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f41342a.add(new f(name, null, null, h.a.c(h.f41350L2, "text/plain", content, null, 4, null), 6, null));
        return this;
    }

    public final h d() {
        String format = String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(kotlin.random.e.f41170b.m())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return new c(format, CollectionsKt.toList(this.f41342a));
    }
}
