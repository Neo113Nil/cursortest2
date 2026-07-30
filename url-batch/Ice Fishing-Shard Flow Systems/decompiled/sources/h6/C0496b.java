package h6;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496b extends AbstractC0495a {

    /* renamed from: i, reason: collision with root package name */
    public final a f5284i = new a();

    /* renamed from: h6.b$a */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // h6.AbstractC0495a
    public final Random a() {
        Object obj = this.f5284i.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
